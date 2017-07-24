package com.drew.metadata.mov;

import com.drew.lang.annotations.NotNull;
import com.drew.metadata.Directory;

import java.util.HashMap;

public class QtDirectory extends Directory {

    // Movie Header Atom (https://developer.apple.com/library/content/documentation/QuickTime/QTFF/QTFFChap2/qtff2.html#//apple_ref/doc/uid/TP40000939-CH204-56313)
    public static final int TAG_CREATION_TIME = 0x0100;
    public static final int TAG_MODIFICATION_TIME = 0x0101;
    public static final int TAG_TIME_SCALE = 0x0102;
    public static final int TAG_DURATION = 0x0103;
    public static final int TAG_PREFERRED_RATE = 0x0104;
    public static final int TAG_PREFERRED_VOLUME = 0x0105;
    public static final int TAG_PREVIEW_TIME = 0x0108;
    public static final int TAG_PREVIEW_DURATION = 0x0109;
    public static final int TAG_POSTER_TIME = 0x010A;
    public static final int TAG_SELECTION_TIME = 0x010B;
    public static final int TAG_SELECTION_DURATION = 0x010C;
    public static final int TAG_CURRENT_TIME = 0x010D;
    public static final int TAG_NEXT_TRACK_ID = 0x010E;

    // Video Sample Description Atom
    public static final int TAG_VENDOR = 0X0201;
    public static final int TAG_TEMPORAL_QUALITY = 0x0202;
    public static final int TAG_SPATIAL_QUALITY = 0x0203;
    public static final int TAG_WIDTH = 0x0204;
    public static final int TAG_HEIGHT = 0x0205;
    public static final int TAG_HORIZONTAL_RESOLUTION = 0x0206;
    public static final int TAG_VERTICAL_RESOLUTION = 0x0207;
    public static final int TAG_COMPRESSOR_NAME = 0x0208;
    public static final int TAG_DEPTH = 0x0209;
    public static final int TAG_COMPRESSION_TYPE = 0x020A;

    // Sound Sample Description Atom
    public static final int TAG_AUDIO_FORMAT = 0x0301;
    public static final int TAG_NUMBER_OF_CHANNELS = 0x0302;
    public static final int TAG_SAMPLE_SIZE = 0x0303;
    public static final int TAG_SAMPLE_RATE = 0x0304;

    public static final int TAG_SOUND_BALANCE = 0x0305;
    public static final int TAG_MEDIA_TIME_SCALE = 0x306;

    // User Data Types Holder (0x0400 - 0x04FF)
    // https://sno.phy.queensu.ca/~phil/exiftool/TagNames/QuickTime.html#Meta

    // User Metadata Types Holder (0x0500 - 0x05FF)
    // https://developer.apple.com/library/content/documentation/QuickTime/QTFF/Metadata/Metadata.html#//apple_ref/doc/uid/TP40000939-CH1-SW43
    // https://sno.phy.queensu.ca/~phil/exiftool/TagNames/QuickTime.html#Meta

    // Video Media Information Header Atom
    public static final int TAG_GRAPHICS_MODE = 0x0311;
    public static final int TAG_OPCOLOR = 0x0312;
    public static final int TAG_COLOR_TABLE = 0x0313;
    public static final int TAG_FRAME_RATE = 0x0314;

    public static final int TAG_MAJOR_BRAND = 0x0001;
    public static final int TAG_MINOR_VERSION = 0x0002;
    public static final int TAG_COMPATIBLE_BRANDS = 0x0003;

    @NotNull
    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<Integer, String>();

    @NotNull
    protected static final HashMap<String, Integer> _tagIntegerMap = new HashMap<String, Integer>();

    static {
        _tagNameMap.put(TAG_MAJOR_BRAND, "Major Brand");
        _tagNameMap.put(TAG_MINOR_VERSION, "Minor Version");
        _tagNameMap.put(TAG_COMPATIBLE_BRANDS, "Compatible Brands");

        _tagNameMap.put(TAG_CREATION_TIME, "Creation Time");
        _tagNameMap.put(TAG_MODIFICATION_TIME, "Modification Time");
        _tagNameMap.put(TAG_TIME_SCALE, "Time Scale");
        _tagNameMap.put(TAG_DURATION, "Duration");
        _tagNameMap.put(TAG_PREFERRED_RATE, "Preferred Rate");
        _tagNameMap.put(TAG_PREFERRED_VOLUME, "Preferred Volume");
        _tagNameMap.put(TAG_PREVIEW_TIME, "Preview Time");
        _tagNameMap.put(TAG_PREVIEW_DURATION, "Preview Duration");
        _tagNameMap.put(TAG_POSTER_TIME, "Poster Time");
        _tagNameMap.put(TAG_SELECTION_TIME, "Selection Time");
        _tagNameMap.put(TAG_SELECTION_DURATION, "Selection Duration");
        _tagNameMap.put(TAG_CURRENT_TIME, "Current Time");
        _tagNameMap.put(TAG_NEXT_TRACK_ID, "Next Track ID");

        _tagNameMap.put(TAG_VENDOR, "Vendor");
        _tagNameMap.put(TAG_TEMPORAL_QUALITY, "Temporal Quality");
        _tagNameMap.put(TAG_SPATIAL_QUALITY, "Spatial Quality");
        _tagNameMap.put(TAG_WIDTH, "Width");
        _tagNameMap.put(TAG_HEIGHT, "Height");
        _tagNameMap.put(TAG_HORIZONTAL_RESOLUTION, "Horizontal Resolution");
        _tagNameMap.put(TAG_VERTICAL_RESOLUTION, "Vertical Resolution");
        _tagNameMap.put(TAG_COMPRESSOR_NAME, "Compressor Name");
        _tagNameMap.put(TAG_DEPTH, "Depth");
        _tagNameMap.put(TAG_COMPRESSION_TYPE, "Compression Type");

        _tagNameMap.put(TAG_AUDIO_FORMAT, "Audio Format");
        _tagNameMap.put(TAG_NUMBER_OF_CHANNELS, "Number of Channels");
        _tagNameMap.put(TAG_SAMPLE_SIZE, "Sample Size");
        _tagNameMap.put(TAG_SAMPLE_RATE, "Sample Rate");

        _tagNameMap.put(TAG_SOUND_BALANCE, "Sound Balance");
        _tagNameMap.put(TAG_MEDIA_TIME_SCALE, "Media Time Scale");

        _tagNameMap.put(TAG_GRAPHICS_MODE, "Graphics Mode");
        _tagNameMap.put(TAG_OPCOLOR, "Opcolor");
        _tagNameMap.put(TAG_COLOR_TABLE, "Color Table");
        _tagNameMap.put(TAG_FRAME_RATE, "Frame Rate");

        _tagIntegerMap.put("com.apple.quicktime.album", 0x0500);
        _tagIntegerMap.put("com.apple.quicktime.artist", 0x0501);
        _tagIntegerMap.put("com.apple.quicktime.artwork", 0x0502);
        _tagIntegerMap.put("com.apple.quicktime.author", 0x0503);
        _tagIntegerMap.put("com.apple.quicktime.comment", 0x0504);
        _tagIntegerMap.put("com.apple.quicktime.copyright", 0x0505);
        _tagIntegerMap.put("com.apple.quicktime.creationdate", 0x0506);
        _tagIntegerMap.put("com.apple.quicktime.description", 0x0507);
        _tagIntegerMap.put("com.apple.quicktime.director", 0x0508);
        _tagIntegerMap.put("com.apple.quicktime.title", 0x0509);
        _tagIntegerMap.put("com.apple.quicktime.genre", 0x050A);
        _tagIntegerMap.put("com.apple.quicktime.information", 0x050B);
        _tagIntegerMap.put("com.apple.quicktime.keywords", 0x050C);
        _tagIntegerMap.put("com.apple.quicktime.location.ISO6709", 0x050D);
        _tagIntegerMap.put("com.apple.quicktime.producer", 0x050E);
        _tagIntegerMap.put("com.apple.quicktime.publisher", 0x050F);
        _tagIntegerMap.put("com.apple.quicktime.software", 0x0510);
        _tagIntegerMap.put("com.apple.quicktime.year", 0x0511);
        _tagIntegerMap.put("com.apple.quicktime.collection.user", 0x0512);
        _tagIntegerMap.put("com.apple.quicktime.rating.user", 0x0513);
        _tagIntegerMap.put("com.apple.quicktime.location.name", 0x0514);
        _tagIntegerMap.put("com.apple.quicktime.location.body", 0x0515);
        _tagIntegerMap.put("com.apple.quicktime.location.note", 0x0516);
        _tagIntegerMap.put("com.apple.quicktime.location.role", 0x0517);
        _tagIntegerMap.put("com.apple.quicktime.location.date", 0x0518);
        _tagIntegerMap.put("com.apple.quicktime.direction.facing", 0x0519);
        _tagIntegerMap.put("com.apple.quicktime.direction.motion", 0x051A);
        _tagIntegerMap.put("com.apple.quicktime.displayname", 0x051B);

        _tagNameMap.put(0x0500, "Album");
        _tagNameMap.put(0x0501, "Artist");
        _tagNameMap.put(0x0502, "Artwork");
        _tagNameMap.put(0x0503, "Author");
        _tagNameMap.put(0x0504, "Comment");
        _tagNameMap.put(0x0505, "Copyright");
        _tagNameMap.put(0x0506, "Creation Date");
        _tagNameMap.put(0x0507, "Description");
        _tagNameMap.put(0x0508, "Director");
        _tagNameMap.put(0x0509, "Title");
        _tagNameMap.put(0x050A, "Genre");
        _tagNameMap.put(0x050B, "Information");
        _tagNameMap.put(0x050C, "Keywords");
        _tagNameMap.put(0x050D, "ISO 6709");
        _tagNameMap.put(0x050E, "Producer");
        _tagNameMap.put(0x050F, "Publisher");
        _tagNameMap.put(0x0510, "Software");
        _tagNameMap.put(0x0511, "Year");
        _tagNameMap.put(0x0512, "Collection User");
        _tagNameMap.put(0x0513, "Rating User");
        _tagNameMap.put(0x0514, "Location Name");
        _tagNameMap.put(0x0515, "Location Body");
        _tagNameMap.put(0x0516, "Location Note");
        _tagNameMap.put(0x0517, "Location Role");
        _tagNameMap.put(0x0518, "Location Date");
        _tagNameMap.put(0x0519, "Direction Facing");
        _tagNameMap.put(0x051A, "Direction Motion");
        _tagNameMap.put(0x051B, "Display Name");

        _tagIntegerMap.put("----", 0x0400);
        _tagIntegerMap.put("@PST", 0x0401);
        _tagIntegerMap.put("@ppi", 0x0402);
        _tagIntegerMap.put("@pti", 0x0403);
        _tagIntegerMap.put("@sti", 0x0404);
        _tagIntegerMap.put("AACR", 0x0405);
        _tagIntegerMap.put("CDEK", 0x0406);
        _tagIntegerMap.put("CDET", 0x0407);
        _tagIntegerMap.put("GUID", 0x0408);
        _tagIntegerMap.put("VERS", 0x0409);
        _tagIntegerMap.put("aART", 0x040A);
        _tagIntegerMap.put("akID", 0x040B);
        _tagIntegerMap.put("albm", 0x040C);
        _tagIntegerMap.put("apID", 0x040D);
        _tagIntegerMap.put("atID", 0x040E);
        _tagIntegerMap.put("auth", 0x040F);
        _tagIntegerMap.put("catg", 0x0410);
        _tagIntegerMap.put("cnID", 0x0411);
        _tagIntegerMap.put("covr", 0x0412);
        _tagIntegerMap.put("cpil", 0x0413);
        _tagIntegerMap.put("cprt", 0x0414);
        _tagIntegerMap.put("desc", 0x0415);
        _tagIntegerMap.put("disk", 0x0416);
        _tagIntegerMap.put("dscp", 0x0417);
        _tagIntegerMap.put("egid", 0x0418);
        _tagIntegerMap.put("geID", 0x0419);
        _tagIntegerMap.put("gnre", 0x041A);
        _tagIntegerMap.put("grup", 0x041B);
        _tagIntegerMap.put("gshh", 0x041C);
        _tagIntegerMap.put("gspm", 0x041D);
        _tagIntegerMap.put("gspu", 0x041E);
        _tagIntegerMap.put("gssd", 0x041F);
        _tagIntegerMap.put("gsst", 0x0420);
        _tagIntegerMap.put("gstd", 0x0421);
        _tagIntegerMap.put("hdvd", 0x0422);
        _tagIntegerMap.put("itnu", 0x0423);
        _tagIntegerMap.put("keyw", 0x0424);
        _tagIntegerMap.put("ldes", 0x0425);
        _tagIntegerMap.put("pcst", 0x0426);
        _tagIntegerMap.put("perf", 0x0427);
        _tagIntegerMap.put("pgap", 0x0428);
        _tagIntegerMap.put("plID", 0x0429);
        _tagIntegerMap.put("prID", 0x042A);
        _tagIntegerMap.put("purd", 0x042B);
        _tagIntegerMap.put("purl", 0x042C);
        _tagIntegerMap.put("rate", 0x042D);
        _tagIntegerMap.put("rldt", 0x042E);
        _tagIntegerMap.put("rtng", 0x042F);
        _tagIntegerMap.put("sfID", 0x0430);
        _tagIntegerMap.put("soaa", 0x0431);
        _tagIntegerMap.put("soal", 0x0432);
        _tagIntegerMap.put("soar", 0x0433);
        _tagIntegerMap.put("soco", 0x0434);
        _tagIntegerMap.put("sonm", 0x0435);
        _tagIntegerMap.put("sosn", 0x0436);
        _tagIntegerMap.put("stik", 0x0437);
        _tagIntegerMap.put("titl", 0x0438);
        _tagIntegerMap.put("tmpo", 0x0439);
        _tagIntegerMap.put("trkn", 0x043A);
        _tagIntegerMap.put("tven", 0x043B);
        _tagIntegerMap.put("tves", 0x043C);
        _tagIntegerMap.put("tvnn", 0x043D);
        _tagIntegerMap.put("tvsh", 0x043E);
        _tagIntegerMap.put("tvsn", 0x043F);
        _tagIntegerMap.put("yrrc", 0x0440);
        _tagIntegerMap.put("�ART", 0x0441);
        _tagIntegerMap.put("�alb", 0x0442);
        _tagIntegerMap.put("�cmt", 0x0443);
        _tagIntegerMap.put("�com", 0x0444);
        _tagIntegerMap.put("�cpy", 0x0445);
        _tagIntegerMap.put("�day", 0x0446);
        _tagIntegerMap.put("�des", 0x0447);
        _tagIntegerMap.put("�enc", 0x0448);
        _tagIntegerMap.put("�gen", 0x0449);
        _tagIntegerMap.put("�grp", 0x044A);
        _tagIntegerMap.put("�lyr", 0x044B);
        _tagIntegerMap.put("�nam", 0x044C);
        _tagIntegerMap.put("�nrt", 0x044D);
        _tagIntegerMap.put("�pub", 0x044E);
        _tagIntegerMap.put("�too", 0x044F);
        _tagIntegerMap.put("�trk", 0x0450);
        _tagIntegerMap.put("�wrt", 0x0451);

        _tagNameMap.put(0x0400, "iTunes Info");
        _tagNameMap.put(0x0401, "Parent Short Title");
        _tagNameMap.put(0x0402, "Parent Product ID");
        _tagNameMap.put(0x0403, "Parent Title");
        _tagNameMap.put(0x0404, "Short Title");
        _tagNameMap.put(0x0405, "Unknown_AACR?");
        _tagNameMap.put(0x0406, "Unknown_CDEK?");
        _tagNameMap.put(0x0407, "Unknown_CDET?");
        _tagNameMap.put(0x0408, "GUID");
        _tagNameMap.put(0x0409, "Product Version");
        _tagNameMap.put(0x040A, "Album Artist");
        _tagNameMap.put(0x040B, "Apple Store Account Type");
        _tagNameMap.put(0x040C, "Album");
        _tagNameMap.put(0x040D, "Apple Store Account");
        _tagNameMap.put(0x040E, "Album Title ID");
        _tagNameMap.put(0x040F, "Author");
        _tagNameMap.put(0x0410, "Category");
        _tagNameMap.put(0x0411, "Apple Store Catalog ID");
        _tagNameMap.put(0x0412, "Cover Art");
        _tagNameMap.put(0x0413, "Compilation");
        _tagNameMap.put(0x0414, "Copyright");
        _tagNameMap.put(0x0415, "Description");
        _tagNameMap.put(0x0416, "Disk Number");
        _tagNameMap.put(0x0417, "Description");
        _tagNameMap.put(0x0418, "Episode Global Unique ID");
        _tagNameMap.put(0x0419, "Genre ID");
        _tagNameMap.put(0x041A, "Genre");
        _tagNameMap.put(0x041B, "Grouping");
        _tagNameMap.put(0x041C, "Google Host Header");
        _tagNameMap.put(0x041D, "Google Ping Message");
        _tagNameMap.put(0x041E, "Google Ping URL");
        _tagNameMap.put(0x041F, "Google Source Data");
        _tagNameMap.put(0x0420, "Google Start Time");
        _tagNameMap.put(0x0421, "Google Track Duration");
        _tagNameMap.put(0x0422, "HD Video");
        _tagNameMap.put(0x0423, "iTunes U");
        _tagNameMap.put(0x0424, "Keyword");
        _tagNameMap.put(0x0425, "Long Description");
        _tagNameMap.put(0x0426, "Podcast");
        _tagNameMap.put(0x0427, "Performer");
        _tagNameMap.put(0x0428, "Play Gap");
        _tagNameMap.put(0x0429, "Play List ID");
        _tagNameMap.put(0x042A, "Product ID");
        _tagNameMap.put(0x042B, "Purchase Date");
        _tagNameMap.put(0x042C, "Podcast URL");
        _tagNameMap.put(0x042D, "Rating Percent");
        _tagNameMap.put(0x042E, "Release Date");
        _tagNameMap.put(0x042F, "Rating");
        _tagNameMap.put(0x0430, "Apple Store Country");
        _tagNameMap.put(0x0431, "Sort Album Artist");
        _tagNameMap.put(0x0432, "Sort Album");
        _tagNameMap.put(0x0433, "Sort Artist");
        _tagNameMap.put(0x0434, "Sort Composer");
        _tagNameMap.put(0x0435, "Sort Name");
        _tagNameMap.put(0x0436, "Sort Show");
        _tagNameMap.put(0x0437, "Media Type");
        _tagNameMap.put(0x0438, "Title");
        _tagNameMap.put(0x0439, "Beats Per Minute");
        _tagNameMap.put(0x043A, "Track Number");
        _tagNameMap.put(0x043B, "TV Episode ID");
        _tagNameMap.put(0x043C, "TV Episode");
        _tagNameMap.put(0x043D, "TV Network Name");
        _tagNameMap.put(0x043E, "TV Show");
        _tagNameMap.put(0x043F, "TV Season");
        _tagNameMap.put(0x0440, "Year");
        _tagNameMap.put(0x0441, "Artist");
        _tagNameMap.put(0x0442, "Album");
        _tagNameMap.put(0x0443, "Comment");
        _tagNameMap.put(0x0444, "Composer");
        _tagNameMap.put(0x0445, "Copyright");
        _tagNameMap.put(0x0446, "Content Create Date");
        _tagNameMap.put(0x0447, "Description");
        _tagNameMap.put(0x0448, "Encoded By");
        _tagNameMap.put(0x0449, "Genre");
        _tagNameMap.put(0x044A, "Grouping");
        _tagNameMap.put(0x044B, "Lyrics");
        _tagNameMap.put(0x044C, "Title");
        _tagNameMap.put(0x044D, "Narrator");
        _tagNameMap.put(0x044E, "Publisher");
        _tagNameMap.put(0x044F, "Encoder");
        _tagNameMap.put(0x0450, "Track");
        _tagNameMap.put(0x0451, "Composer");
    }

    public QtDirectory()
    {
        this.setDescriptor(new QtDescriptor(this));
    }

    @Override
    @NotNull
    public String getName() { return "QuickTime"; }

    @Override
    @NotNull
    protected HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
