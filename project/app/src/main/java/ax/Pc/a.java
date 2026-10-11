/*
 * Decompiled with CFR 0.152.
 */
package ax.Pc;

public class a {
    public static final Long a = 0L;
    public static final Long b = 1L;
    public static final Long c = -1L;
    public static final Integer d = 0;
    public static final Integer e = 1;
    public static final Integer f = -1;
    public static final Short g = 0;
    public static final Short h = 1;
    public static final Short i = -1;
    public static final Byte j = 0;
    public static final Byte k = 1;
    public static final Byte l = -1;
    public static final Double m = 0.0;
    public static final Double n = 1.0;
    public static final Double o = -1.0;
    public static final Float p = Float.valueOf(0.0f);
    public static final Float q = Float.valueOf(1.0f);
    public static final Float r = Float.valueOf(-1.0f);

    public static int a(int n8, int n9) {
        if (n8 == n9) {
            return 0;
        }
        if (n8 < n9) {
            return -1;
        }
        return 1;
    }

    public static int b(long l8, long l9) {
        long l10 = l8 == l9 ? 0 : (l8 < l9 ? -1 : 1);
        if (l10 == false) {
            return 0;
        }
        if (l10 < 0) {
            return -1;
        }
        return 1;
    }
}

