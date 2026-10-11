/*
 * Decompiled with CFR 0.152.
 */
package ax.Pa;

public class a {
    private static final double a = 20.0 / Math.log(10.0);
    private static double b = 440.0;

    public static double a(double d8) {
        return Math.log(d8 / b) * 12.0 / Math.log(2.0) + 69.0;
    }

    public static double b(double d8) {
        return b * Math.pow(2.0, (d8 - 69.0) * 0.08333333333333333);
    }
}

