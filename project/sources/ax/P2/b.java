package ax.P2;

/* loaded from: classes.dex */
public class b {
    private static boolean a;
    private static boolean b;
    private static int c;
    private static boolean d;

    public static int a() {
        return c;
    }

    public static boolean b() {
        return a || b;
    }

    public static boolean c(String str) {
        return e(str, c);
    }

    public static boolean d(String str) {
        return "audio/ac3".equals(str) || "audio/flac".equals(str) || "audio/vorbis".equals(str) || "audio/alac".equals(str) || "audio/eac3".equals(str) || "audio/opus".equals(str);
    }

    public static boolean e(String str, int i) {
        if (i == 1) {
            return "audio/ac3".equals(str) || "audio/opus".equals(str);
        }
        if (i == 2) {
            return "audio/ac3".equals(str) || "audio/alac".equals(str) || "audio/eac3".equals(str) || "audio/opus".equals(str);
        }
        if (i == 3) {
            return "audio/ac3".equals(str) || "audio/flac".equals(str) || "audio/vorbis".equals(str) || "audio/alac".equals(str) || "audio/eac3".equals(str) || "audio/opus".equals(str);
        }
        return false;
    }

    public static boolean f() {
        return a;
    }

    public static boolean g() {
        return b;
    }

    public static boolean h() {
        return b && c == 1;
    }

    public static boolean i() {
        int i = c;
        return i >= 2 && i <= 3;
    }

    public static boolean j() {
        return d;
    }

    public static void k(boolean z) {
        a = z;
    }

    public static void l(boolean z) {
        b = z;
    }

    public static void m(int i) {
        int i2 = c;
        if (i2 >= 2 && i > i2) {
            d = true;
        }
        c = i;
    }

    public static void n(boolean z) {
        d = z;
    }
}
