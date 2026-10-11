package ax.Pc;

/* loaded from: classes3.dex */
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
    public static final Byte j = (byte) 0;
    public static final Byte k = (byte) 1;
    public static final Byte l = (byte) -1;
    public static final Double m = Double.valueOf(0.0d);
    public static final Double n = Double.valueOf(1.0d);
    public static final Double o = Double.valueOf(-1.0d);
    public static final Float p = Float.valueOf(0.0f);
    public static final Float q = Float.valueOf(1.0f);
    public static final Float r = Float.valueOf(-1.0f);

    public static int a(int i2, int i3) {
        if (i2 == i3) {
            return 0;
        }
        return i2 < i3 ? -1 : 1;
    }

    public static int b(long j2, long j3) {
        if (j2 == j3) {
            return 0;
        }
        return j2 < j3 ? -1 : 1;
    }
}
