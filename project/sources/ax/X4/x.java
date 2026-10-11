package ax.X4;

/* loaded from: classes.dex */
public class x {
    private static final u a = new u();
    private static final v b = new v();
    private static final w c = new w();

    public static double a(CharSequence charSequence) throws NumberFormatException {
        return b(charSequence, 0, charSequence.length());
    }

    public static double b(CharSequence charSequence, int i, int i2) throws NumberFormatException {
        return Double.longBitsToDouble(c.f(charSequence, i, i2));
    }
}
