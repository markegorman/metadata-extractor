package com.drew.metadata.mov;

import com.drew.imaging.ImageProcessingException;
import com.drew.lang.ByteUtil;
import com.drew.lang.StreamReader;
import com.drew.metadata.Metadata;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.DataFormatException;

public class QtReader {
    private StreamReader reader;
    private QtDirectory directory;
    private int tabCount;

    public void extract(Metadata metadata, InputStream inputStream) throws IOException, DataFormatException
    {
        metadata = metadata;
        reader = new StreamReader(inputStream);
        directory = new QtDirectory();
        metadata.addDirectory(directory);
        reader.setMotorolaByteOrder(true);
        tabCount = 0;

        processAtoms(reader, -1, directory, new QtAtomHandler(), true);
    }

    public void processAtoms(StreamReader reader, long atomSize, QtDirectory directory, QtHandler qtHandler, boolean printVisited)
    {
        try {
            while ((atomSize == -1) ? true : reader.getPosition() < atomSize) {

                long size = reader.getInt32();

                if (size == 1) {
                    size = reader.getInt64();
                } else if (size == 0) {
                    size = reader.getInt32();
                }

                String fourCC = new String(reader.getBytes(4));

                if (qtHandler.shouldAcceptContainer(fourCC)) {

                    //////////////// TREE PRINTER ////////////////
                    if (printVisited) {
                        for (int i = 0; i < tabCount; i++) {
                            System.out.print("   " + i + "   |");
                        }
                        System.out.println(" [" + fourCC + "]");
                        tabCount++;
                    }

                    if (size == 0) {
                        processAtoms(reader, -1, directory, qtHandler.processContainer(fourCC), printVisited);
                    } else {
                        processAtoms(reader, reader.getPosition() + size - 8, directory, qtHandler.processContainer(fourCC), printVisited);
                    }

                    //////////////// TREE PRINTER ////////////////
                    if (printVisited) {
                        tabCount--;
//                        for (int i = 0; i < tabCount; i++) {
//                            System.out.print("   " + i + "   |");
//                        }
//                        System.out.println(" [" + fourCC + "]");
                    }

                } else if (qtHandler.shouldAcceptAtom(fourCC)) {

                    //////////////// TREE PRINTER ////////////////
                    if (printVisited) {
                        for (int i = 0; i < tabCount; i++) {
                            System.out.print("   " + i + "   |");
                        }
                        System.out.println("  " + fourCC);
                    }

                    qtHandler = qtHandler.processAtom(fourCC, reader.getBytes((int)size - 8), directory);
                } else {
                     if (size > 1)
                        reader.skip(size - 8);
                }
            }
        } catch (IOException ignored) {

        }
    }

}
