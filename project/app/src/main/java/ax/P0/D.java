/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.text.TextUtils;
import ax.S0.d0;
import ax.q7.c;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class D {
    private static final ArrayList<a> a = new ArrayList();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String object, String string) {
        if (object == null) {
            return false;
        }
        int n8 = -1;
        switch (((String)object).hashCode()) {
            default: {
                break;
            }
            case 1903589369: {
                if (!((String)object).equals("audio/g711-mlaw")) break;
                n8 = 10;
                break;
            }
            case 1903231877: {
                if (!((String)object).equals("audio/g711-alaw")) break;
                n8 = 9;
                break;
            }
            case 1504831518: {
                if (!((String)object).equals("audio/mpeg")) break;
                n8 = 8;
                break;
            }
            case 1504619009: {
                if (!((String)object).equals("audio/flac")) break;
                n8 = 7;
                break;
            }
            case 1504578661: {
                if (!((String)object).equals("audio/eac3")) break;
                n8 = 6;
                break;
            }
            case 187094639: {
                if (!((String)object).equals("audio/raw")) break;
                n8 = 5;
                break;
            }
            case 187078296: {
                if (!((String)object).equals("audio/ac3")) break;
                n8 = 4;
                break;
            }
            case -53558318: {
                if (!((String)object).equals("audio/mp4a-latm")) break;
                n8 = 3;
                break;
            }
            case -432837259: {
                if (!((String)object).equals("audio/mpeg-L2")) break;
                n8 = 2;
                break;
            }
            case -432837260: {
                if (!((String)object).equals("audio/mpeg-L1")) break;
                n8 = 1;
                break;
            }
            case -2123537834: {
                if (!((String)object).equals("audio/eac3-joc")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return false;
            }
            case 3: {
                if (string == null) {
                    return false;
                }
                object = D.i(string);
                if (object == null) {
                    return false;
                }
                n8 = ((b)object).a();
                return n8 != 0 && n8 != 16;
            }
            case 0: 
            case 1: 
            case 2: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
        }
        return true;
    }

    public static boolean b(String string, String string2) {
        return D.d(string, string2) != null;
    }

    public static String c(String stringArray) {
        if (stringArray == null) {
            return null;
        }
        stringArray = d0.z1((String)stringArray);
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            String string = D.g(stringArray[i8]);
            if (string == null || !D.o(string)) continue;
            return string;
        }
        return null;
    }

    public static String d(String stringArray, String string) {
        if (stringArray != null && string != null) {
            stringArray = d0.z1((String)stringArray);
            StringBuilder stringBuilder = new StringBuilder();
            for (String string2 : stringArray) {
                if (!string.equals(D.g(string2))) continue;
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(string2);
            }
            if (stringBuilder.length() > 0) {
                return stringBuilder.toString();
            }
        }
        return null;
    }

    private static String e(String string) {
        int n8 = a.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            a a8 = a.get(i8);
            if (!string.startsWith(a8.b)) continue;
            return a8.a;
        }
        return null;
    }

    public static int f(String object, String string) {
        object.getClass();
        int n8 = -1;
        switch (((String)object).hashCode()) {
            default: {
                break;
            }
            case 1556697186: {
                if (!((String)object).equals("audio/true-hd")) break;
                n8 = 11;
                break;
            }
            case 1505942594: {
                if (!((String)object).equals("audio/vnd.dts.hd")) break;
                n8 = 10;
                break;
            }
            case 1504891608: {
                if (!((String)object).equals("audio/opus")) break;
                n8 = 9;
                break;
            }
            case 1504831518: {
                if (!((String)object).equals("audio/mpeg")) break;
                n8 = 8;
                break;
            }
            case 1504578661: {
                if (!((String)object).equals("audio/eac3")) break;
                n8 = 7;
                break;
            }
            case 550520934: {
                if (!((String)object).equals("audio/vnd.dts.uhd;profile=p2")) break;
                n8 = 6;
                break;
            }
            case 187078297: {
                if (!((String)object).equals("audio/ac4")) break;
                n8 = 5;
                break;
            }
            case 187078296: {
                if (!((String)object).equals("audio/ac3")) break;
                n8 = 4;
                break;
            }
            case -53558318: {
                if (!((String)object).equals("audio/mp4a-latm")) break;
                n8 = 3;
                break;
            }
            case -1095064472: {
                if (!((String)object).equals("audio/vnd.dts")) break;
                n8 = 2;
                break;
            }
            case -1365340241: {
                if (!((String)object).equals("audio/vnd.dts.hd;profile=lbr")) break;
                n8 = 1;
                break;
            }
            case -2123537834: {
                if (!((String)object).equals("audio/eac3-joc")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return 0;
            }
            case 11: {
                return 14;
            }
            case 10: {
                return 8;
            }
            case 9: {
                return 20;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 6;
            }
            case 6: {
                return 30;
            }
            case 5: {
                return 17;
            }
            case 4: {
                return 5;
            }
            case 3: {
                if (string == null) {
                    return 0;
                }
                object = D.i(string);
                if (object == null) {
                    return 0;
                }
                return ((b)object).a();
            }
            case 2: {
                return 7;
            }
            case 1: {
                return 8;
            }
            case 0: 
        }
        return 18;
    }

    public static String g(String string) {
        Object var1_1 = null;
        if (string == null) {
            return null;
        }
        Object object = c.e(string.trim());
        if (!((String)object).startsWith("avc1") && !((String)object).startsWith("avc3")) {
            if (!((String)object).startsWith("hev1") && !((String)object).startsWith("hvc1")) {
                if (!(((String)object).startsWith("dvav") || ((String)object).startsWith("dva1") || ((String)object).startsWith("dvhe") || ((String)object).startsWith("dvh1"))) {
                    if (((String)object).startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!((String)object).startsWith("vp9") && !((String)object).startsWith("vp09")) {
                        if (!((String)object).startsWith("vp8") && !((String)object).startsWith("vp08")) {
                            if (((String)object).startsWith("mp4a")) {
                                string = var1_1;
                                if (((String)object).startsWith("mp4a.")) {
                                    object = D.i((String)object);
                                    string = var1_1;
                                    if (object != null) {
                                        string = D.h(((b)object).a);
                                    }
                                }
                                if (string == null) {
                                    return "audio/mp4a-latm";
                                }
                                return string;
                            }
                            if (((String)object).startsWith("mha1")) {
                                return "audio/mha1";
                            }
                            if (((String)object).startsWith("mhm1")) {
                                return "audio/mhm1";
                            }
                            if (!((String)object).startsWith("ac-3") && !((String)object).startsWith("dac3")) {
                                if (!((String)object).startsWith("ec-3") && !((String)object).startsWith("dec3")) {
                                    if (((String)object).startsWith("ec+3")) {
                                        return "audio/eac3-joc";
                                    }
                                    if (!((String)object).startsWith("ac-4") && !((String)object).startsWith("dac4")) {
                                        if (((String)object).startsWith("dtsc")) {
                                            return "audio/vnd.dts";
                                        }
                                        if (((String)object).startsWith("dtse")) {
                                            return "audio/vnd.dts.hd;profile=lbr";
                                        }
                                        if (!((String)object).startsWith("dtsh") && !((String)object).startsWith("dtsl")) {
                                            if (((String)object).startsWith("dtsx")) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            if (((String)object).startsWith("opus")) {
                                                return "audio/opus";
                                            }
                                            if (((String)object).startsWith("vorbis")) {
                                                return "audio/vorbis";
                                            }
                                            if (((String)object).startsWith("flac")) {
                                                return "audio/flac";
                                            }
                                            if (((String)object).startsWith("stpp")) {
                                                return "application/ttml+xml";
                                            }
                                            if (((String)object).startsWith("wvtt")) {
                                                return "text/vtt";
                                            }
                                            if (((String)object).contains("cea708")) {
                                                return "application/cea-708";
                                            }
                                            if (!((String)object).contains("eia608") && !((String)object).contains("cea608")) {
                                                return D.e((String)object);
                                            }
                                            return "application/cea-608";
                                        }
                                        return "audio/vnd.dts.hd";
                                    }
                                    return "audio/ac4";
                                }
                                return "audio/eac3";
                            }
                            return "audio/ac3";
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    public static String h(int n8) {
        if (n8 != 32) {
            if (n8 != 33) {
                if (n8 != 35) {
                    if (n8 != 64) {
                        if (n8 != 163) {
                            if (n8 != 177) {
                                if (n8 != 221) {
                                    if (n8 != 165) {
                                        if (n8 != 166) {
                                            switch (n8) {
                                                default: {
                                                    switch (n8) {
                                                        default: {
                                                            return null;
                                                        }
                                                        case 174: {
                                                            return "audio/ac4";
                                                        }
                                                        case 173: {
                                                            return "audio/opus";
                                                        }
                                                        case 170: 
                                                        case 171: {
                                                            return "audio/vnd.dts.hd";
                                                        }
                                                        case 169: 
                                                        case 172: 
                                                    }
                                                    return "audio/vnd.dts";
                                                }
                                                case 108: {
                                                    return "image/jpeg";
                                                }
                                                case 106: {
                                                    return "video/mpeg";
                                                }
                                                case 105: 
                                                case 107: {
                                                    return "audio/mpeg";
                                                }
                                                case 96: 
                                                case 97: 
                                                case 98: 
                                                case 99: 
                                                case 100: 
                                                case 101: {
                                                    return "video/mpeg2";
                                                }
                                                case 102: 
                                                case 103: 
                                                case 104: {
                                                    return "audio/mp4a-latm";
                                                }
                                            }
                                        }
                                        return "audio/eac3";
                                    }
                                    return "audio/ac3";
                                }
                                return "audio/vorbis";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static b i(String object) {
        int n8;
        int n9;
        block5: {
            Object object2 = b.matcher((CharSequence)object);
            boolean bl = ((Matcher)object2).matches();
            object = null;
            if (!bl) {
                return null;
            }
            String string = ax.S0.a.e(((Matcher)object2).group(1));
            object2 = ((Matcher)object2).group(2);
            try {
                n9 = Integer.parseInt(string, 16);
                if (object2 == null) break block5;
            }
            catch (NumberFormatException numberFormatException) {
                return object;
            }
            n8 = Integer.parseInt((String)object2);
            return new b(n9, n8);
        }
        n8 = 0;
        return new b(n9, n8);
    }

    private static String j(String string) {
        if (string == null) {
            return null;
        }
        int n8 = string.indexOf(47);
        if (n8 == -1) {
            return null;
        }
        return string.substring(0, n8);
    }

    public static int k(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return -1;
        }
        if (D.o(string)) {
            return 1;
        }
        if (D.s(string)) {
            return 2;
        }
        if (D.r(string)) {
            return 3;
        }
        if (D.q(string)) {
            return 4;
        }
        if (!("application/id3".equals(string) || "application/x-emsg".equals(string) || "application/x-scte35".equals(string) || "application/x-icy".equals(string) || "application/vnd.dvb.ait".equals(string))) {
            if ("application/x-camera-motion".equals(string)) {
                return 6;
            }
            return D.l(string);
        }
        return 5;
    }

    private static int l(String string) {
        int n8 = a.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            a a8 = a.get(i8);
            if (!string.equals(a8.a)) continue;
            return a8.c;
        }
        return -1;
    }

    public static int m(String string) {
        return D.k(D.g(string));
    }

    public static String n(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = d0.z1(string);
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            string = D.g(stringArray[i8]);
            if (string == null || !D.s(string)) continue;
            return string;
        }
        return null;
    }

    public static boolean o(String string) {
        return "audio".equals(D.j(string));
    }

    public static boolean p(String string, String string2) {
        if (string == null) {
            return false;
        }
        if (!string.startsWith("dvhe") && !string.startsWith("dvh1")) {
            if (string2 == null) {
                return false;
            }
            return string2.startsWith("dvhe") && string.startsWith("hev1") || string2.startsWith("dvh1") && string.startsWith("hvc1") || string2.startsWith("dvav") && string.startsWith("avc3") || string2.startsWith("dva1") && string.startsWith("avc1") || string2.startsWith("dav1") && string.startsWith("av01");
        }
        return true;
    }

    public static boolean q(String string) {
        return "image".equals(D.j(string)) || "application/x-image-uri".equals(string);
        {
        }
    }

    public static boolean r(String string) {
        return "text".equals(D.j(string)) || "application/x-media3-cues".equals(string) || "application/cea-608".equals(string) || "application/cea-708".equals(string) || "application/x-mp4-cea-608".equals(string) || "application/x-subrip".equals(string) || "application/ttml+xml".equals(string) || "application/x-quicktime-tx3g".equals(string) || "application/x-mp4-vtt".equals(string) || "application/x-rawcc".equals(string) || "application/vobsub".equals(string) || "application/pgs".equals(string) || "application/dvbsubs".equals(string);
        {
        }
    }

    public static boolean s(String string) {
        return "video".equals(D.j(string));
    }

    public static String t(String string) {
        if (string == null) {
            return null;
        }
        string = c.e(string);
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 187090231: {
                if (!string.equals("audio/mp3")) break;
                n8 = 6;
                break;
            }
            case -432836267: {
                if (!string.equals("audio/mpeg-l2")) break;
                n8 = 5;
                break;
            }
            case -432836268: {
                if (!string.equals("audio/mpeg-l1")) break;
                n8 = 4;
                break;
            }
            case -586683234: {
                if (!string.equals("audio/x-wav")) break;
                n8 = 3;
                break;
            }
            case -979095690: {
                if (!string.equals("application/x-mpegurl")) break;
                n8 = 2;
                break;
            }
            case -1007807498: {
                if (!string.equals("audio/x-flac")) break;
                n8 = 1;
                break;
            }
            case -1833600100: {
                if (!string.equals("video/x-mvhevc")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return string;
            }
            case 6: {
                return "audio/mpeg";
            }
            case 5: {
                return "audio/mpeg-L2";
            }
            case 4: {
                return "audio/mpeg-L1";
            }
            case 3: {
                return "audio/wav";
            }
            case 2: {
                return "application/x-mpegURL";
            }
            case 1: {
                return "audio/flac";
            }
            case 0: 
        }
        return "video/mv-hevc";
    }

    private static final class a {
        public final String a;
        public final String b;
        public final int c;
    }

    static final class b {
        public final int a;
        public final int b;

        public b(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }

        public int a() {
            int n8 = this.b;
            if (n8 != 2) {
                if (n8 != 5) {
                    if (n8 != 29) {
                        if (n8 != 42) {
                            if (n8 != 22) {
                                if (n8 != 23) {
                                    return 0;
                                }
                                return 15;
                            }
                            return 0x40000000;
                        }
                        return 16;
                    }
                    return 12;
                }
                return 11;
            }
            return 10;
        }
    }
}

