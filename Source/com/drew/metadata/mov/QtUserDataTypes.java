package com.drew.metadata.mov;

import java.util.HashMap;

public class QtUserDataTypes
{
    public static final String TAG_ARRANGER_NAME = "©arg";
    public static final String TAG_ARRANGER_KEYWORDS = "©ark";
    public static final String TAG_COMPOSER_KEYWORDS = "©cok";
    public static final String TAG_COMPOSER_NAME = "©com";
    public static final String TAG_COPYRIGHT = "©cpy";
    public static final String TAG_CREATE_DAY = "©day";
    public static final String TAG_DIRECTOR_NAME = "©dir";
    public static final String TAG_EDIT_DATE_1 = "©ed1";
    public static final String TAG_EDIT_DATE_2 = "©ed2";
    public static final String TAG_EDIT_DATE_3 = "©ed3";
    public static final String TAG_EDIT_DATE_4 = "©ed4";
    public static final String TAG_EDIT_DATE_5 = "©ed5";
    public static final String TAG_EDIT_DATE_6 = "©ed6";
    public static final String TAG_EDIT_DATE_7 = "©ed7";
    public static final String TAG_EDIT_DATE_8 = "©ed8";
    public static final String TAG_EDIT_DATE_9 = "©ed9";
    public static final String TAG_FORMAT = "©fmt";
    public static final String TAG_MOVIE_INFO = "©inf";
    public static final String TAG_ISRC = "©isr";
    public static final String TAG_RECORD_LABEL_NAME = "©lab";
    public static final String TAG_RECORD_LABEL_URL = "©lal";
    public static final String TAG_CREATOR_NAME = "©mak";
    public static final String TAG_CREATOR_URL = "©mal";
    public static final String TAG_TITLE_KEYWORDS = "©nak";
    public static final String TAG_TITLE_NAME = "©nam";
    public static final String TAG_PRODUCER_KEYWORDS = "©pdk";
    public static final String TAG_COPYRIGHT_STATEMENT = "©phg";
    public static final String TAG_PRODUCER_NAME = "©prd";
    public static final String TAG_PERFORMER_NAMES = "©prf";
    public static final String TAG_MAIN_ARTIST_KEYWORDS = "©prk";
    public static final String TAG_MAIN_ARTIST_URL = "©prl";
    public static final String TAG_REQUIREMENTS = "©req";
    public static final String TAG_SUBTITLE_KEYWORDS = "©snk";
    public static final String TAG_SUBTITLE = "©snm";
    public static final String TAG_CREDITS = "©src";
    public static final String TAG_SONGWRITER_NAME = "©swf";
    public static final String TAG_SONGWRITER_KEYWORDS = "©swk";
    public static final String TAG_SOFTWARE = "©swr";
    public static final String TAG_WRITER_NAME = "©wrt";
    public static final String TAG_PLAY_ALL_FRAMES = "AllF";
    public static final String TAG_HINT_TRACK_INFO = "hinf";
    public static final String TAG_HINT_INFO_ATOM = "hnti";
    public static final String TAG_NAME_OBJECT = "name";
    public static final String TAG_LOCALIZED_TRACK_NAME = "tnam";
    public static final String TAG_MEDIA_CHARACTERISTICS = "tagc";
    public static final String TAG_LOOPING_STYLE = "LOOP";
    public static final String TAG_PRINT_TO_VIDEO = "ptv ";
    public static final String TAG_PLAY_SELECTION_ONLY = "SelO";
    public static final String TAG_WINDOW_LOCATION = "WLOC";

    public static HashMap<String, String> _userDataTypes = new HashMap<String, String>();

    static {
        _userDataTypes.put(TAG_ARRANGER_NAME, "Arranger Name");
        _userDataTypes.put(TAG_ARRANGER_KEYWORDS, "Arranger Keywords");
        _userDataTypes.put(TAG_COMPOSER_KEYWORDS, "Composer Keywords");
        _userDataTypes.put(TAG_COMPOSER_NAME, "Composer Name");
        _userDataTypes.put(TAG_COPYRIGHT, "Copyright");
        _userDataTypes.put(TAG_CREATE_DAY, "Day Created");
        _userDataTypes.put(TAG_DIRECTOR_NAME, "Director Name");
        _userDataTypes.put(TAG_EDIT_DATE_1, "Edit Date 1");
        _userDataTypes.put(TAG_EDIT_DATE_2, "Edit Date 2");
        _userDataTypes.put(TAG_EDIT_DATE_3, "Edit Date 3");
        _userDataTypes.put(TAG_EDIT_DATE_4, "Edit Date 4");
        _userDataTypes.put(TAG_EDIT_DATE_5, "Edit Date 5");
        _userDataTypes.put(TAG_EDIT_DATE_6, "Edit Date 6");
        _userDataTypes.put(TAG_EDIT_DATE_7, "Edit Date 7");
        _userDataTypes.put(TAG_EDIT_DATE_8, "Edit Date 8");
        _userDataTypes.put(TAG_EDIT_DATE_9, "Edit Date 9");
        _userDataTypes.put(TAG_FORMAT, "Movie Format");
        _userDataTypes.put(TAG_MOVIE_INFO, "Movie Information");
        _userDataTypes.put(TAG_ISRC, "ISRC");
        _userDataTypes.put(TAG_RECORD_LABEL_NAME, "Record Label Name");
        _userDataTypes.put(TAG_RECORD_LABEL_URL, "Record Label URL");
        _userDataTypes.put(TAG_CREATOR_NAME, "Creator Name");
        _userDataTypes.put(TAG_CREATOR_URL, "Creator URL");
        _userDataTypes.put(TAG_TITLE_KEYWORDS, "Title Keywords");
        _userDataTypes.put(TAG_TITLE_NAME, "Title Name");
        _userDataTypes.put(TAG_PRODUCER_KEYWORDS, "Producer Keywords");
        _userDataTypes.put(TAG_COPYRIGHT_STATEMENT, "Recording Copyright Statement");
        _userDataTypes.put(TAG_PRODUCER_NAME, "Producer Name");
        _userDataTypes.put(TAG_PERFORMER_NAMES, "Performer Names");
        _userDataTypes.put(TAG_MAIN_ARTIST_KEYWORDS, "Main Artist/Performer Keywords");
        _userDataTypes.put(TAG_MAIN_ARTIST_URL, "Main Artist/Performer URL");
        _userDataTypes.put(TAG_REQUIREMENTS, "Special Hardware/Software Requirements");
        _userDataTypes.put(TAG_SUBTITLE_KEYWORDS, "Subtitle Keywords");
        _userDataTypes.put(TAG_SUBTITLE, "Subtitle");
        _userDataTypes.put(TAG_CREDITS, "Credits");
        _userDataTypes.put(TAG_SONGWRITER_NAME, "Songwriter Name");
        _userDataTypes.put(TAG_SONGWRITER_KEYWORDS, "Songwriter Keywords");
        _userDataTypes.put(TAG_SOFTWARE, "Software");
        _userDataTypes.put(TAG_WRITER_NAME, "Writer Name");
        _userDataTypes.put(TAG_PLAY_ALL_FRAMES, "Play All Frames");
    }
}
