package com.drew.metadata.mov;

import java.util.ArrayList;

/**
 * @author Payton Garland
 */
public class QtAtomTypes
{
    // Main file identifier
    public static final String ATOM_FILE_TYPE = "ftyp";

    // START Movie Atom Container

    // Specifies characteristics of the whole movie
    public static final String ATOM_MOVIE_HEADER = "mvhd";

    public static final String ATOM_VIDEO_MEDIA_INFO = "vmhd";
    public static final String ATOM_SOUND_MEDIA_INFO = "smhd";
    public static final String ATOM_HANDLER = "hdlr";

    public static final String ATOM_SAMPLE_DESCRIPTION = "stsd";

    public static final String ATOM_PROFILE = "prfl";

    // END Movie Atom Container


    public static ArrayList<String> _atomList = new ArrayList<String>();

    static {
        _atomList.add(ATOM_FILE_TYPE);
        _atomList.add(ATOM_MOVIE_HEADER);
        _atomList.add(ATOM_VIDEO_MEDIA_INFO);
        _atomList.add(ATOM_SOUND_MEDIA_INFO);
        _atomList.add(ATOM_SAMPLE_DESCRIPTION);
        _atomList.add(ATOM_HANDLER);
    }

    public static boolean isAtom(String fourCC)
    {
        return _atomList.contains(fourCC);
    }
}
