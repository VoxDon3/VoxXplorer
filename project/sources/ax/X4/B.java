package ax.X4;

/* loaded from: classes.dex */
public class B {
    private static final y a = new y();
    private static final z b = new z();
    private static final A c = new A();

    public static float a(CharSequence charSequence) throws NumberFormatException {
        return b(charSequence, 0, charSequence.length());
    }

    public static float b(CharSequence charSequence, int i, int i2) throws NumberFormatException {
        return Float.intBitsToFloat((int) c.f(charSequence, i, i2));
    }
}
