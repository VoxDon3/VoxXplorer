package ax.Pa;

/* loaded from: classes3.dex */
public class a {
    private static final double a = 20.0d / Math.log(10.0d);
    private static double b = 440.0d;

    public static double a(double d) {
        return ((Math.log(d / b) * 12.0d) / Math.log(2.0d)) + 69.0d;
    }

    public static double b(double d) {
        return b * Math.pow(2.0d, (d - 69.0d) * 0.08333333333333333d);
    }
}
