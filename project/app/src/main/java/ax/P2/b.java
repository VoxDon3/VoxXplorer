/*
 * Decompiled with CFR 0.152.
 */
package ax.P2;

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
        {
        }
    }

    public static boolean c(String string) {
        return ax.P2.b.e(string, c);
    }

    public static boolean d(String string) {
        return "audio/ac3".equals(string) || "audio/flac".equals(string) || "audio/vorbis".equals(string) || "audio/alac".equals(string) || "audio/eac3".equals(string) || "audio/opus".equals(string);
        {
        }
    }

    public static boolean e(String string, int n8) {
        if (n8 == 1) {
            return "audio/ac3".equals(string) || "audio/opus".equals(string);
            {
            }
        }
        if (n8 == 2) {
            return "audio/ac3".equals(string) || "audio/alac".equals(string) || "audio/eac3".equals(string) || "audio/opus".equals(string);
            {
            }
        }
        if (n8 == 3) {
            return "audio/ac3".equals(string) || "audio/flac".equals(string) || "audio/vorbis".equals(string) || "audio/alac".equals(string) || "audio/eac3".equals(string) || "audio/opus".equals(string);
            {
            }
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
        int n8 = c;
        return n8 >= 2 && n8 <= 3;
    }

    public static boolean j() {
        return d;
    }

    public static void k(boolean bl) {
        a = bl;
    }

    public static void l(boolean bl) {
        b = bl;
    }

    public static void m(int n8) {
        int n9 = c;
        if (n9 >= 2 && n8 > n9) {
            d = true;
        }
        c = n8;
    }

    public static void n(boolean bl) {
        d = bl;
    }
}

