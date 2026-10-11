/*
 * Decompiled with CFR 0.152.
 */
package ax.Lc;

import java.io.PrintStream;
import java.util.Locale;

public final class a
extends Enum<a> {
    public static final /* enum */ a n0;
    public static final /* enum */ a o0;
    public static final /* enum */ a p0;
    public static final /* enum */ a q0;
    private static final boolean r0;
    private static final boolean s0;
    private static final boolean t0;
    private static final a u0;
    private static final a[] v0;
    private final boolean c0;
    private final boolean d0;
    private final int[] e0;
    private final int f0;
    private final int g0;
    private final String[] h0;
    private final boolean i0;
    private final boolean j0;
    private final char k0;
    private final char l0;
    private final b m0;
    private final int q;

    static {
        b b8 = b.q;
        n0 = new a(4096, false, false, 1020, 0x100000, new int[]{0}, new String[0], false, false, '/', b8);
        o0 = new a(8192, true, true, 255, 4096, new int[]{0, 47}, new String[0], false, false, '/', b8);
        p0 = new a(4096, true, true, 255, 1024, new int[]{0, 47, 58}, new String[0], false, false, '/', b8);
        b8 = b.c0;
        q0 = new a(4096, false, true, 255, Short.MAX_VALUE, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 34, 42, 47, 58, 60, 62, 63, 92, 124}, new String[]{"AUX", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "COM\u00b2", "COM\u00b3", "COM\u00b9", "CON", "CONIN$", "CONOUT$", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9", "LPT\u00b2", "LPT\u00b3", "LPT\u00b9", "NUL", "PRN"}, true, true, '\\', b8);
        v0 = a.d();
        r0 = a.l("Linux");
        s0 = a.l("Mac");
        t0 = a.l("Windows");
        u0 = a.h();
    }

    private a(int n9, boolean bl, boolean bl2, int n10, int n11, int[] nArray, String[] stringArray, boolean bl3, boolean bl4, char c8, b b8) {
        this.q = n9;
        this.f0 = n10;
        this.g0 = n11;
        j.Objects.requireNonNull((Object)nArray, (String)"illegalFileNameChars");
        this.e0 = nArray;
        j.Objects.requireNonNull((Object)stringArray, (String)"reservedFileNames");
        this.h0 = stringArray;
        this.i0 = bl3;
        this.d0 = bl;
        this.c0 = bl2;
        this.j0 = bl4;
        this.k0 = c8;
        this.l0 = ax.Lc.b.a(c8);
        this.m0 = b8;
    }

    private static /* synthetic */ a[] d() {
        return new a[]{n0, o0, p0, q0};
    }

    private static a h() {
        if (r0) {
            return o0;
        }
        if (s0) {
            return p0;
        }
        if (t0) {
            return q0;
        }
        return n0;
    }

    public static a j() {
        return u0;
    }

    private static boolean l(String string) {
        return a.q(a.n("os.name"), string);
    }

    private static String n(String string) {
        try {
            String string2 = System.getProperty(string);
            return string2;
        }
        catch (SecurityException securityException) {
            PrintStream printStream = System.err;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Caught a SecurityException reading the system property '");
            stringBuilder.append(string);
            stringBuilder.append("'; the SystemUtils property value will default to null.");
            printStream.println(stringBuilder.toString());
            return null;
        }
    }

    private static boolean q(String string, String string2) {
        if (string == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return string.toUpperCase(locale).startsWith(string2.toUpperCase(locale));
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])v0.clone();
    }

    public boolean p() {
        return this.d0;
    }

    static abstract class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        private static final b[] d0;
        public static final /* enum */ b q;

        static {
            q = new b(){};
            c0 = new b(){};
            d0 = b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])d0.clone();
        }
    }
}

