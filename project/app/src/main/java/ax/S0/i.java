/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.annotation.SuppressLint;
import android.util.Pair;
import ax.P0.D;
import ax.P0.j;
import ax.P0.v;
import ax.S0.F;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.u;
import ax.r7.z;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint(value={"InlinedApi"})
public final class i {
    private static final byte[] a = new byte[]{0, 0, 0, 1};
    private static final String[] b = new String[]{"", "A", "B", "C"};
    private static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static boolean A(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    private static int B(int n8) {
        if (n8 != 10) {
            if (n8 != 11) {
                if (n8 != 20) {
                    if (n8 != 21) {
                        if (n8 != 30) {
                            if (n8 != 31) {
                                if (n8 != 40) {
                                    if (n8 != 41) {
                                        if (n8 != 50) {
                                            if (n8 != 51) {
                                                switch (n8) {
                                                    default: {
                                                        return -1;
                                                    }
                                                    case 62: {
                                                        return 8192;
                                                    }
                                                    case 61: {
                                                        return 4096;
                                                    }
                                                    case 60: 
                                                }
                                                return 2048;
                                            }
                                            return 512;
                                        }
                                        return 256;
                                    }
                                    return 128;
                                }
                                return 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int C(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return -1;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int a(int n8, int n9) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) {
                    if (n9 == 1) {
                        return 1026;
                    }
                    if (n9 == 2) {
                        return 1028;
                    }
                }
            } else {
                if (n9 == 0) {
                    return 513;
                }
                if (n9 == 1) {
                    return 514;
                }
            }
        } else if (n9 == 0) {
            return 257;
        }
        return -1;
    }

    private static int b(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            return -1;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int c(int n8) {
        switch (n8) {
            default: {
                return -1;
            }
            case 23: {
                return 0x800000;
            }
            case 22: {
                return 0x400000;
            }
            case 21: {
                return 0x200000;
            }
            case 20: {
                return 0x100000;
            }
            case 19: {
                return 524288;
            }
            case 18: {
                return 262144;
            }
            case 17: {
                return 131072;
            }
            case 16: {
                return 65536;
            }
            case 15: {
                return 32768;
            }
            case 14: {
                return 16384;
            }
            case 13: {
                return 8192;
            }
            case 12: {
                return 4096;
            }
            case 11: {
                return 2048;
            }
            case 10: {
                return 1024;
            }
            case 9: {
                return 512;
            }
            case 8: {
                return 256;
            }
            case 7: {
                return 128;
            }
            case 6: {
                return 64;
            }
            case 5: {
                return 32;
            }
            case 4: {
                return 16;
            }
            case 3: {
                return 8;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    private static int d(int n8) {
        switch (n8) {
            default: {
                switch (n8) {
                    default: {
                        switch (n8) {
                            default: {
                                switch (n8) {
                                    default: {
                                        switch (n8) {
                                            default: {
                                                return -1;
                                            }
                                            case 52: {
                                                return 65536;
                                            }
                                            case 51: {
                                                return 32768;
                                            }
                                            case 50: 
                                        }
                                        return 16384;
                                    }
                                    case 42: {
                                        return 8192;
                                    }
                                    case 41: {
                                        return 4096;
                                    }
                                    case 40: 
                                }
                                return 2048;
                            }
                            case 32: {
                                return 1024;
                            }
                            case 31: {
                                return 512;
                            }
                            case 30: 
                        }
                        return 256;
                    }
                    case 22: {
                        return 128;
                    }
                    case 21: {
                        return 64;
                    }
                    case 20: 
                }
                return 32;
            }
            case 13: {
                return 16;
            }
            case 12: {
                return 8;
            }
            case 11: {
                return 4;
            }
            case 10: 
        }
        return 1;
    }

    private static int e(int n8) {
        if (n8 != 66) {
            if (n8 != 77) {
                if (n8 != 88) {
                    if (n8 != 100) {
                        if (n8 != 110) {
                            if (n8 != 122) {
                                if (n8 != 244) {
                                    return -1;
                                }
                                return 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static String f(int n8, int n9, int n10) {
        return String.format("avc1.%02X%02X%02X", n8, n9, n10);
    }

    public static List<byte[]> g(boolean bl) {
        byte[] byArray = bl ? new byte[]{1} : new byte[]{0};
        return Collections.singletonList(byArray);
    }

    public static String h(int n8, boolean bl, int n9, int n10, int[] nArray, int n11) {
        CharSequence charSequence = b[n8];
        char c8 = bl ? (char)'H' : 'L';
        charSequence = new StringBuilder(d0.G("hvc1.%s%d.%X.%c%d", charSequence, n9, n10, Character.valueOf(c8), n11));
        for (n8 = nArray.length; n8 > 0 && nArray[n8 - 1] == 0; --n8) {
        }
        for (n9 = 0; n9 < n8; ++n9) {
            ((StringBuilder)charSequence).append(String.format(".%02X", nArray[n9]));
        }
        return ((StringBuilder)charSequence).toString();
    }

    public static String i(byte[] object) {
        G g8 = new G((byte[])object);
        g8.d0();
        g8.c0(4);
        int n8 = g8.M();
        int n9 = g8.M();
        g8.c0(1);
        g8.d0();
        g8.d0();
        String string = g8.J(4);
        object = string;
        if (string.equals("mp4a")) {
            int n10;
            g8.d0();
            g8.c0(2);
            object = new F();
            ((F)object).m(g8);
            int n11 = n10 = ((F)object).h(5);
            if (n10 == 31) {
                n11 = ((F)object).h(6) + 32;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(".40.");
            ((StringBuilder)object).append(n11);
            object = ((StringBuilder)object).toString();
        }
        return d0.G("iamf.%03X.%03X.%s", n8, n9, object);
    }

    public static byte[] j(byte[] byArray, int n8, int n9) {
        byte[] byArray2 = a;
        byte[] byArray3 = new byte[byArray2.length + n9];
        System.arraycopy(byArray2, 0, byArray3, 0, byArray2.length);
        System.arraycopy(byArray, n8, byArray3, byArray2.length, n9);
        return byArray3;
    }

    public static z<byte[]> k(byte by, byte by2, byte by3, byte by4) {
        return z.A(new byte[]{1, 1, by, 2, 1, by2, 3, 1, by3, 4, 1, by4});
    }

    private static Integer l(String string) {
        if (string == null) {
            return null;
        }
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1570: {
                if (!string.equals("13")) break;
                n8 = 12;
                break;
            }
            case 1569: {
                if (!string.equals("12")) break;
                n8 = 11;
                break;
            }
            case 1568: {
                if (!string.equals("11")) break;
                n8 = 10;
                break;
            }
            case 1567: {
                if (!string.equals("10")) break;
                n8 = 9;
                break;
            }
            case 1545: {
                if (!string.equals("09")) break;
                n8 = 8;
                break;
            }
            case 1544: {
                if (!string.equals("08")) break;
                n8 = 7;
                break;
            }
            case 1543: {
                if (!string.equals("07")) break;
                n8 = 6;
                break;
            }
            case 1542: {
                if (!string.equals("06")) break;
                n8 = 5;
                break;
            }
            case 1541: {
                if (!string.equals("05")) break;
                n8 = 4;
                break;
            }
            case 1540: {
                if (!string.equals("04")) break;
                n8 = 3;
                break;
            }
            case 1539: {
                if (!string.equals("03")) break;
                n8 = 2;
                break;
            }
            case 1538: {
                if (!string.equals("02")) break;
                n8 = 1;
                break;
            }
            case 1537: {
                if (!string.equals("01")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 12: {
                return 4096;
            }
            case 11: {
                return 2048;
            }
            case 10: {
                return 1024;
            }
            case 9: {
                return 512;
            }
            case 8: {
                return 256;
            }
            case 7: {
                return 128;
            }
            case 6: {
                return 64;
            }
            case 5: {
                return 32;
            }
            case 4: {
                return 16;
            }
            case 3: {
                return 8;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    private static Integer m(String string) {
        if (string == null) {
            return null;
        }
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1567: {
                if (!string.equals("10")) break;
                n8 = 10;
                break;
            }
            case 1545: {
                if (!string.equals("09")) break;
                n8 = 9;
                break;
            }
            case 1544: {
                if (!string.equals("08")) break;
                n8 = 8;
                break;
            }
            case 1543: {
                if (!string.equals("07")) break;
                n8 = 7;
                break;
            }
            case 1542: {
                if (!string.equals("06")) break;
                n8 = 6;
                break;
            }
            case 1541: {
                if (!string.equals("05")) break;
                n8 = 5;
                break;
            }
            case 1540: {
                if (!string.equals("04")) break;
                n8 = 4;
                break;
            }
            case 1539: {
                if (!string.equals("03")) break;
                n8 = 3;
                break;
            }
            case 1538: {
                if (!string.equals("02")) break;
                n8 = 2;
                break;
            }
            case 1537: {
                if (!string.equals("01")) break;
                n8 = 1;
                break;
            }
            case 1536: {
                if (!string.equals("00")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 10: {
                return 1024;
            }
            case 9: {
                return 512;
            }
            case 8: {
                return 256;
            }
            case 7: {
                return 128;
            }
            case 6: {
                return 64;
            }
            case 5: {
                return 32;
            }
            case 4: {
                return 16;
            }
            case 3: {
                return 8;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    private static Pair<Integer, Integer> n(String string, String[] object) {
        block4: {
            int n8;
            if (((String[])object).length != 3) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Ignoring malformed MP4A codec string: ");
                ((StringBuilder)object).append(string);
                u.h("CodecSpecificDataUtil", ((StringBuilder)object).toString());
                return null;
            }
            if (!"audio/mp4a-latm".equals(D.h(Integer.parseInt(object[1], 16))) || (n8 = i.y(Integer.parseInt((String)object[2]))) == -1) break block4;
            try {
                object = new Pair((Object)n8, (Object)0);
                return object;
            }
            catch (NumberFormatException numberFormatException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ignoring malformed MP4A codec string: ");
                stringBuilder.append(string);
                u.h("CodecSpecificDataUtil", stringBuilder.toString());
            }
        }
        return null;
    }

    private static Pair<Integer, Integer> o(String charSequence, String[] object) {
        int n8;
        int n9;
        int n10;
        if (((String[])object).length != 4) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Ignoring malformed AC-4 codec string: ");
            ((StringBuilder)object).append((String)charSequence);
            u.h("CodecSpecificDataUtil", ((StringBuilder)object).toString());
            return null;
        }
        try {
            n10 = Integer.parseInt(object[1]);
            n9 = Integer.parseInt((String)object[2]);
            n8 = Integer.parseInt((String)object[3]);
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring malformed AC-4 codec string: ");
            stringBuilder.append((String)charSequence);
            u.h("CodecSpecificDataUtil", stringBuilder.toString());
            return null;
        }
        int n11 = i.a(n10, n9);
        if (n11 == -1) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Unknown AC-4 profile: ");
            ((StringBuilder)charSequence).append(n10);
            ((StringBuilder)charSequence).append(".");
            ((StringBuilder)charSequence).append(n9);
            u.h("CodecSpecificDataUtil", ((StringBuilder)charSequence).toString());
            return null;
        }
        n10 = i.b(n8);
        if (n10 == -1) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Unknown AC-4 level: ");
            ((StringBuilder)charSequence).append(n8);
            u.h("CodecSpecificDataUtil", ((StringBuilder)charSequence).toString());
            return null;
        }
        return new Pair((Object)n11, (Object)n10);
    }

    private static Pair<Integer, Integer> p(String charSequence, String[] object, j j8) {
        int n8;
        int n9;
        int n10;
        block6: {
            int n11;
            if (((String[])object).length < 4) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Ignoring malformed AV1 codec string: ");
                ((StringBuilder)object).append((String)charSequence);
                u.h("CodecSpecificDataUtil", ((StringBuilder)object).toString());
                return null;
            }
            n10 = 1;
            try {
                n11 = Integer.parseInt(object[1]);
                n9 = Integer.parseInt(((String)object[2]).substring(0, 2));
                n8 = Integer.parseInt((String)object[3]);
                if (n11 == 0) break block6;
            }
            catch (NumberFormatException numberFormatException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ignoring malformed AV1 codec string: ");
                stringBuilder.append((String)charSequence);
                u.h("CodecSpecificDataUtil", stringBuilder.toString());
                return null;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Unknown AV1 profile: ");
            ((StringBuilder)charSequence).append(n11);
            u.h("CodecSpecificDataUtil", ((StringBuilder)charSequence).toString());
            return null;
        }
        if (n8 != 8 && n8 != 10) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Unknown AV1 bit depth: ");
            ((StringBuilder)charSequence).append(n8);
            u.h("CodecSpecificDataUtil", ((StringBuilder)charSequence).toString());
            return null;
        }
        if (n8 != 8) {
            n10 = j8 != null && (j8.d != null || (n10 = j8.c) == 7 || n10 == 6) ? 4096 : 2;
        }
        if ((n8 = i.c(n9)) == -1) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Unknown AV1 level: ");
            ((StringBuilder)charSequence).append(n9);
            u.h("CodecSpecificDataUtil", ((StringBuilder)charSequence).toString());
            return null;
        }
        return new Pair((Object)n10, (Object)n8);
    }

    private static Pair<Integer, Integer> q(String charSequence, String[] object) {
        block8: {
            int n8;
            int n9;
            block7: {
                if (((String[])object).length < 2) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Ignoring malformed AVC codec string: ");
                    ((StringBuilder)object).append((String)charSequence);
                    u.h("CodecSpecificDataUtil", ((StringBuilder)object).toString());
                    return null;
                }
                try {
                    if (object[1].length() == 6) {
                        n9 = Integer.parseInt(((String)object[1]).substring(0, 2), 16);
                        n8 = Integer.parseInt(((String)object[1]).substring(4), 16);
                        break block7;
                    }
                    if (((Object)object).length < 3) break block8;
                    n9 = Integer.parseInt((String)object[1]);
                    n8 = Integer.parseInt((String)object[2]);
                }
                catch (NumberFormatException numberFormatException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Ignoring malformed AVC codec string: ");
                    stringBuilder.append((String)charSequence);
                    u.h("CodecSpecificDataUtil", stringBuilder.toString());
                    return null;
                }
            }
            int n10 = i.e(n9);
            if (n10 == -1) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Unknown AVC profile: ");
                ((StringBuilder)charSequence).append(n9);
                u.h("CodecSpecificDataUtil", ((StringBuilder)charSequence).toString());
                return null;
            }
            n9 = i.d(n8);
            if (n9 == -1) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Unknown AVC level: ");
                ((StringBuilder)charSequence).append(n8);
                u.h("CodecSpecificDataUtil", ((StringBuilder)charSequence).toString());
                return null;
            }
            return new Pair((Object)n10, (Object)n9);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Ignoring malformed AVC codec string: ");
        ((StringBuilder)object).append((String)charSequence);
        u.h("CodecSpecificDataUtil", ((StringBuilder)object).toString());
        return null;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static Pair<Integer, Integer> r(v v8) {
        int n8 = 0;
        String[] stringArray = v8.k;
        if (stringArray == null) {
            return null;
        }
        stringArray = stringArray.split("\\.");
        if ("video/dolby-vision".equals(v8.o)) {
            return i.s(v8.k, stringArray);
        }
        String string = stringArray[0];
        string.getClass();
        int n9 = -1;
        switch (string.hashCode()) {
            case 3624515: {
                if (!string.equals("vp09")) break;
                n9 = 1;
                break;
            }
            case 3475740: {
                if (!string.equals("s263")) break;
                n9 = 2;
                break;
            }
            case 3356560: {
                if (!string.equals("mp4a")) break;
                n9 = 3;
                break;
            }
            case 3224753: {
                if (!string.equals("iamf")) break;
                n9 = 4;
                break;
            }
            case 3214780: {
                if (!string.equals("hvc1")) break;
                n9 = 5;
                break;
            }
            case 3199032: {
                if (!string.equals("hev1")) break;
                n9 = 6;
                break;
            }
            case 3006244: {
                if (!string.equals("avc2")) break;
                n9 = 7;
                break;
            }
            case 3006243: {
                if (!string.equals("avc1")) break;
                n9 = 8;
                break;
            }
            case 3004662: {
                if (!string.equals("av01")) break;
                n9 = 9;
                break;
            }
            case 2986313: {
                if (!string.equals("ac-4")) break;
                n9 = 10;
                break;
            }
        }
        switch (n9) {
            default: {
                n8 = -1;
                break;
            }
            case 1: {
                n8 = 9;
                break;
            }
            case 2: {
                n8 = 8;
                break;
            }
            case 3: {
                n8 = 7;
                break;
            }
            case 4: {
                n8 = 6;
                break;
            }
            case 5: {
                n8 = 5;
                break;
            }
            case 6: {
                n8 = 4;
                break;
            }
            case 7: {
                n8 = 3;
                break;
            }
            case 8: {
                n8 = 2;
                break;
            }
            case 9: {
                n8 = 1;
                break;
            }
            case 10: 
        }
        switch (n8) {
            default: {
                return null;
            }
            case 9: {
                return i.w(v8.k, stringArray);
            }
            case 8: {
                return i.t(v8.k, stringArray);
            }
            case 7: {
                return i.n(v8.k, stringArray);
            }
            case 6: {
                return i.v(v8.k, stringArray);
            }
            case 4: 
            case 5: {
                return i.u(v8.k, stringArray, v8.E);
            }
            case 2: 
            case 3: {
                return i.q(v8.k, stringArray);
            }
            case 1: {
                return i.p(v8.k, stringArray, v8.E);
            }
            case 0: 
        }
        return i.o(v8.k, stringArray);
    }

    private static Pair<Integer, Integer> s(String object, String[] object2) {
        if (((String[])object2).length < 3) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Ignoring malformed Dolby Vision codec string: ");
            ((StringBuilder)object2).append((String)object);
            u.h("CodecSpecificDataUtil", ((StringBuilder)object2).toString());
            return null;
        }
        Object object3 = c.matcher(object2[1]);
        if (!((Matcher)object3).matches()) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Ignoring malformed Dolby Vision codec string: ");
            ((StringBuilder)object2).append((String)object);
            u.h("CodecSpecificDataUtil", ((StringBuilder)object2).toString());
            return null;
        }
        object = i.m((String)(object3 = ((Matcher)object3).group(1)));
        if (object == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Unknown Dolby Vision profile string: ");
            ((StringBuilder)object).append((String)object3);
            u.h("CodecSpecificDataUtil", ((StringBuilder)object).toString());
            return null;
        }
        object3 = i.l((String)(object2 = object2[2]));
        if (object3 == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Unknown Dolby Vision level string: ");
            ((StringBuilder)object).append((String)object2);
            u.h("CodecSpecificDataUtil", ((StringBuilder)object).toString());
            return null;
        }
        return new Pair(object, object3);
    }

    private static Pair<Integer, Integer> t(String string, String[] object) {
        Integer n8 = 1;
        n8 = new Pair((Object)n8, (Object)n8);
        if (((String[])object).length < 3) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Ignoring malformed H263 codec string: ");
            ((StringBuilder)object).append(string);
            u.h("CodecSpecificDataUtil", ((StringBuilder)object).toString());
            return n8;
        }
        try {
            object = new Pair((Object)Integer.parseInt(object[1]), (Object)Integer.parseInt((String)object[2]));
            return object;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring malformed H263 codec string: ");
            stringBuilder.append(string);
            u.h("CodecSpecificDataUtil", stringBuilder.toString());
            return n8;
        }
    }

    public static Pair<Integer, Integer> u(String object, String[] object2, j j8) {
        block8: {
            int n8;
            block6: {
                block7: {
                    if (((String[])object2).length < 4) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Ignoring malformed HEVC codec string: ");
                        ((StringBuilder)object2).append((String)object);
                        u.h("CodecSpecificDataUtil", ((StringBuilder)object2).toString());
                        return null;
                    }
                    Object object3 = c;
                    n8 = 1;
                    if (!((Matcher)(object3 = ((Pattern)object3).matcher((CharSequence)object2[1]))).matches()) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Ignoring malformed HEVC codec string: ");
                        ((StringBuilder)object2).append((String)object);
                        u.h("CodecSpecificDataUtil", ((StringBuilder)object2).toString());
                        return null;
                    }
                    object = ((Matcher)object3).group(1);
                    if ("1".equals(object)) break block6;
                    boolean bl = "2".equals(object);
                    n8 = 6;
                    if (!bl) break block7;
                    n8 = j8 != null && j8.c == 6 ? 4096 : 2;
                    break block6;
                }
                if (!"6".equals(object)) break block8;
            }
            object = object2[3];
            object2 = i.x((String)object);
            if (object2 == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Unknown HEVC level string: ");
                ((StringBuilder)object2).append((String)object);
                u.h("CodecSpecificDataUtil", ((StringBuilder)object2).toString());
                return null;
            }
            return new Pair((Object)n8, object2);
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Unknown HEVC profile string: ");
        ((StringBuilder)object2).append((String)object);
        u.h("CodecSpecificDataUtil", ((StringBuilder)object2).toString());
        return null;
    }

    private static Pair<Integer, Integer> v(String object, String[] object2) {
        int n8;
        int n9 = 2;
        if (((String[])object2).length < 4) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Ignoring malformed IAMF codec string: ");
            ((StringBuilder)object2).append((String)object);
            u.h("CodecSpecificDataUtil", ((StringBuilder)object2).toString());
            return null;
        }
        try {
            n8 = Integer.parseInt(object2[1]);
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring malformed primary profile in IAMF codec string: ");
            stringBuilder.append((String)object2[1]);
            u.i("CodecSpecificDataUtil", stringBuilder.toString(), numberFormatException);
            return null;
        }
        object = object2[3];
        object.getClass();
        int n10 = -1;
        switch (((String)object).hashCode()) {
            default: {
                break;
            }
            case 3356560: {
                if (!((String)object).equals("mp4a")) break;
                n10 = 3;
                break;
            }
            case 3238865: {
                if (!((String)object).equals("ipcm")) break;
                n10 = 2;
                break;
            }
            case 3114792: {
                if (!((String)object).equals("fLaC")) break;
                n10 = 1;
                break;
            }
            case 2464863: {
                if (!((String)object).equals("Opus")) break;
                n10 = 0;
            }
        }
        switch (n10) {
            default: {
                object = new StringBuilder();
                ((StringBuilder)object).append("Ignoring unknown codec identifier for IAMF auxiliary profile: ");
                ((StringBuilder)object).append((String)object2[3]);
                u.h("CodecSpecificDataUtil", ((StringBuilder)object).toString());
                return null;
            }
            case 2: {
                n9 = 8;
                break;
            }
            case 1: {
                n9 = 4;
                break;
            }
            case 0: {
                n9 = 1;
            }
            case 3: 
        }
        return new Pair((Object)(1 << n8 + 16 | 0x1000000 | n9), (Object)0);
    }

    private static Pair<Integer, Integer> w(String charSequence, String[] object) {
        int n8;
        int n9;
        if (((String[])object).length < 3) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Ignoring malformed VP9 codec string: ");
            ((StringBuilder)object).append((String)charSequence);
            u.h("CodecSpecificDataUtil", ((StringBuilder)object).toString());
            return null;
        }
        try {
            n9 = Integer.parseInt(object[1]);
            n8 = Integer.parseInt((String)object[2]);
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring malformed VP9 codec string: ");
            stringBuilder.append((String)charSequence);
            u.h("CodecSpecificDataUtil", stringBuilder.toString());
            return null;
        }
        int n10 = i.C(n9);
        if (n10 == -1) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Unknown VP9 profile: ");
            ((StringBuilder)charSequence).append(n9);
            u.h("CodecSpecificDataUtil", ((StringBuilder)charSequence).toString());
            return null;
        }
        n9 = i.B(n8);
        if (n9 == -1) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Unknown VP9 level: ");
            ((StringBuilder)charSequence).append(n8);
            u.h("CodecSpecificDataUtil", ((StringBuilder)charSequence).toString());
            return null;
        }
        return new Pair((Object)n10, (Object)n9);
    }

    private static Integer x(String string) {
        if (string == null) {
            return null;
        }
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 2312995: {
                if (!string.equals("L186")) break;
                n8 = 25;
                break;
            }
            case 2312992: {
                if (!string.equals("L183")) break;
                n8 = 24;
                break;
            }
            case 2312989: {
                if (!string.equals("L180")) break;
                n8 = 23;
                break;
            }
            case 2312902: {
                if (!string.equals("L156")) break;
                n8 = 22;
                break;
            }
            case 2312899: {
                if (!string.equals("L153")) break;
                n8 = 21;
                break;
            }
            case 2312896: {
                if (!string.equals("L150")) break;
                n8 = 20;
                break;
            }
            case 2312806: {
                if (!string.equals("L123")) break;
                n8 = 19;
                break;
            }
            case 2312803: {
                if (!string.equals("L120")) break;
                n8 = 18;
                break;
            }
            case 2193831: {
                if (!string.equals("H186")) break;
                n8 = 17;
                break;
            }
            case 2193828: {
                if (!string.equals("H183")) break;
                n8 = 16;
                break;
            }
            case 2193825: {
                if (!string.equals("H180")) break;
                n8 = 15;
                break;
            }
            case 2193738: {
                if (!string.equals("H156")) break;
                n8 = 14;
                break;
            }
            case 2193735: {
                if (!string.equals("H153")) break;
                n8 = 13;
                break;
            }
            case 2193732: {
                if (!string.equals("H150")) break;
                n8 = 12;
                break;
            }
            case 2193642: {
                if (!string.equals("H123")) break;
                n8 = 11;
                break;
            }
            case 2193639: {
                if (!string.equals("H120")) break;
                n8 = 10;
                break;
            }
            case 74854: {
                if (!string.equals("L93")) break;
                n8 = 9;
                break;
            }
            case 74851: {
                if (!string.equals("L90")) break;
                n8 = 8;
                break;
            }
            case 74761: {
                if (!string.equals("L63")) break;
                n8 = 7;
                break;
            }
            case 74758: {
                if (!string.equals("L60")) break;
                n8 = 6;
                break;
            }
            case 74665: {
                if (!string.equals("L30")) break;
                n8 = 5;
                break;
            }
            case 71010: {
                if (!string.equals("H93")) break;
                n8 = 4;
                break;
            }
            case 71007: {
                if (!string.equals("H90")) break;
                n8 = 3;
                break;
            }
            case 70917: {
                if (!string.equals("H63")) break;
                n8 = 2;
                break;
            }
            case 70914: {
                if (!string.equals("H60")) break;
                n8 = 1;
                break;
            }
            case 70821: {
                if (!string.equals("H30")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 25: {
                return 0x1000000;
            }
            case 24: {
                return 0x400000;
            }
            case 23: {
                return 0x100000;
            }
            case 22: {
                return 262144;
            }
            case 21: {
                return 65536;
            }
            case 20: {
                return 16384;
            }
            case 19: {
                return 4096;
            }
            case 18: {
                return 1024;
            }
            case 17: {
                return 0x2000000;
            }
            case 16: {
                return 0x800000;
            }
            case 15: {
                return 0x200000;
            }
            case 14: {
                return 524288;
            }
            case 13: {
                return 131072;
            }
            case 12: {
                return 32768;
            }
            case 11: {
                return 8192;
            }
            case 10: {
                return 2048;
            }
            case 9: {
                return 256;
            }
            case 8: {
                return 64;
            }
            case 7: {
                return 16;
            }
            case 6: {
                return 4;
            }
            case 5: {
                return 1;
            }
            case 4: {
                return 512;
            }
            case 3: {
                return 128;
            }
            case 2: {
                return 32;
            }
            case 1: {
                return 8;
            }
            case 0: 
        }
        return 2;
    }

    private static int y(int n8) {
        int n9 = 17;
        if (n8 != 17) {
            n9 = 20;
            if (n8 != 20) {
                n9 = 23;
                if (n8 != 23) {
                    n9 = 29;
                    if (n8 != 29) {
                        n9 = 39;
                        if (n8 != 39) {
                            n9 = 42;
                            if (n8 != 42) {
                                switch (n8) {
                                    default: {
                                        return -1;
                                    }
                                    case 6: {
                                        return 6;
                                    }
                                    case 5: {
                                        return 5;
                                    }
                                    case 4: {
                                        return 4;
                                    }
                                    case 3: {
                                        return 3;
                                    }
                                    case 2: {
                                        return 2;
                                    }
                                    case 1: 
                                }
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        return n9;
    }

    public static Pair<Integer, Integer> z(byte[] object) {
        object = new G((byte[])object);
        ((G)object).b0(9);
        int n8 = ((G)object).M();
        ((G)object).b0(20);
        return Pair.create((Object)((G)object).Q(), (Object)n8);
    }
}

