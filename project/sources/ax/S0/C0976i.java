package ax.S0;

import android.annotation.SuppressLint;
import android.util.Pair;
import ax.P0.C0901j;
import ax.r7.AbstractC2991z;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

@SuppressLint({"InlinedApi"})
/* renamed from: ax.S0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976i {
    private static final byte[] a = {0, 0, 0, 1};
    private static final String[] b = {HttpUrl.FRAGMENT_ENCODE_SET, "A", "B", "C"};
    private static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static boolean A(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    private static int B(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int C(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    private static int a(int i, int i2) {
        if (i == 0) {
            return i2 == 0 ? 257 : -1;
        }
        if (i == 1) {
            if (i2 == 0) {
                return 513;
            }
            return i2 == 1 ? 514 : -1;
        }
        if (i != 2) {
            return -1;
        }
        if (i2 == 1) {
            return 1026;
        }
        return i2 == 2 ? 1028 : -1;
    }

    private static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? -1 : 16;
        }
        return 8;
    }

    private static int c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return Http2.INITIAL_MAX_FRAME_SIZE;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int d(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return Http2.INITIAL_MAX_FRAME_SIZE;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int e(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String f(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static List<byte[]> g(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static String h(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(d0.G("hvc1.%s%d.%X.%c%d", b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static String i(byte[] bArr) {
        G g = new G(bArr);
        g.d0();
        g.c0(4);
        int M = g.M();
        int M2 = g.M();
        g.c0(1);
        g.d0();
        g.d0();
        String J = g.J(4);
        if (J.equals("mp4a")) {
            g.d0();
            g.c0(2);
            F f = new F();
            f.m(g);
            int h = f.h(5);
            if (h == 31) {
                h = f.h(6) + 32;
            }
            J = J + ".40." + h;
        }
        return d0.G("iamf.%03X.%03X.%s", Integer.valueOf(M), Integer.valueOf(M2), J);
    }

    public static byte[] j(byte[] bArr, int i, int i2) {
        byte[] bArr2 = a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static AbstractC2991z<byte[]> k(byte b2, byte b3, byte b4, byte b5) {
        return AbstractC2991z.A(new byte[]{1, 1, b2, 2, 1, b3, 3, 1, b4, 4, 1, b5});
    }

    private static Integer l(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Integer m(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Pair<Integer, Integer> n(String str, String[] strArr) {
        int y;
        if (strArr.length != 3) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(ax.P0.D.h(Integer.parseInt(strArr[1], 16))) && (y = y(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(y), 0);
            }
        } catch (NumberFormatException unused) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    private static Pair<Integer, Integer> o(String str, String[] strArr) {
        if (strArr.length != 4) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int parseInt3 = Integer.parseInt(strArr[3]);
            int a2 = a(parseInt, parseInt2);
            if (a2 == -1) {
                C0987u.h("CodecSpecificDataUtil", "Unknown AC-4 profile: " + parseInt + "." + parseInt2);
                return null;
            }
            int b2 = b(parseInt3);
            if (b2 != -1) {
                return new Pair<>(Integer.valueOf(a2), Integer.valueOf(b2));
            }
            C0987u.h("CodecSpecificDataUtil", "Unknown AC-4 level: " + parseInt3);
            return null;
        } catch (NumberFormatException unused) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> p(String str, String[] strArr, C0901j c0901j) {
        int i;
        if (strArr.length < 4) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                C0987u.h("CodecSpecificDataUtil", "Unknown AV1 profile: " + parseInt);
                return null;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                C0987u.h("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + parseInt3);
                return null;
            }
            int i2 = parseInt3 != 8 ? (c0901j == null || !(c0901j.d != null || (i = c0901j.c) == 7 || i == 6)) ? 2 : 4096 : 1;
            int c2 = c(parseInt2);
            if (c2 != -1) {
                return new Pair<>(Integer.valueOf(i2), Integer.valueOf(c2));
            }
            C0987u.h("CodecSpecificDataUtil", "Unknown AV1 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> q(String str, String[] strArr) {
        int parseInt;
        int i;
        if (strArr.length < 2) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    C0987u.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i = parseInt2;
            }
            int e = e(i);
            if (e == -1) {
                C0987u.h("CodecSpecificDataUtil", "Unknown AVC profile: " + i);
                return null;
            }
            int d = d(parseInt);
            if (d != -1) {
                return new Pair<>(Integer.valueOf(e), Integer.valueOf(d));
            }
            C0987u.h("CodecSpecificDataUtil", "Unknown AVC level: " + parseInt);
            return null;
        } catch (NumberFormatException unused) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009a, code lost:
    
        if (r3.equals("ac-4") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> r(ax.P0.C0912v r6) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.S0.C0976i.r(ax.P0.v):android.util.Pair");
    }

    private static Pair<Integer, Integer> s(String str, String[] strArr) {
        if (strArr.length < 3) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer m = m(group);
        if (m == null) {
            C0987u.h("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer l = l(str2);
        if (l != null) {
            return new Pair<>(m, l);
        }
        C0987u.h("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> t(String str, String[] strArr) {
        Pair<Integer, Integer> pair = new Pair<>(1, 1);
        if (strArr.length < 3) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    public static Pair<Integer, Integer> u(String str, String[] strArr, C0901j c0901j) {
        if (strArr.length < 4) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            i = 6;
            if ("2".equals(group)) {
                i = (c0901j == null || c0901j.c != 6) ? 2 : 4096;
            } else if (!"6".equals(group)) {
                C0987u.h("CodecSpecificDataUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer x = x(str2);
        if (x != null) {
            return new Pair<>(Integer.valueOf(i), x);
        }
        C0987u.h("CodecSpecificDataUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> v(String str, String[] strArr) {
        int i = 2;
        if (strArr.length < 4) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: " + str);
            return null;
        }
        try {
            int parseInt = 1 << (Integer.parseInt(strArr[1]) + 16);
            String str2 = strArr[3];
            str2.getClass();
            switch (str2) {
                case "Opus":
                    i = 1;
                    break;
                case "fLaC":
                    i = 4;
                    break;
                case "ipcm":
                    i = 8;
                    break;
                case "mp4a":
                    break;
                default:
                    C0987u.h("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArr[3]);
                    return null;
            }
            return new Pair<>(Integer.valueOf(parseInt | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE | i), 0);
        } catch (NumberFormatException e) {
            C0987u.i("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArr[1], e);
            return null;
        }
    }

    private static Pair<Integer, Integer> w(String str, String[] strArr) {
        if (strArr.length < 3) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int C = C(parseInt);
            if (C == -1) {
                C0987u.h("CodecSpecificDataUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int B = B(parseInt2);
            if (B != -1) {
                return new Pair<>(Integer.valueOf(C), Integer.valueOf(B));
            }
            C0987u.h("CodecSpecificDataUtil", "Unknown VP9 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            C0987u.h("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Integer x(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static int y(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static Pair<Integer, Integer> z(byte[] bArr) {
        G g = new G(bArr);
        g.b0(9);
        int M = g.M();
        g.b0(20);
        return Pair.create(Integer.valueOf(g.Q()), Integer.valueOf(M));
    }
}
