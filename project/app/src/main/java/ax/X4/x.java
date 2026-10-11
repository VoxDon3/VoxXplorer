/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

import ax.X4.u;
import ax.X4.v;
import ax.X4.w;

public class x {
    private static final u a = new u();
    private static final v b = new v();
    private static final w c = new w();

    public static double a(CharSequence charSequence) throws NumberFormatException {
        return x.b(charSequence, 0, charSequence.length());
    }

    public static double b(CharSequence charSequence, int n8, int n9) throws NumberFormatException {
        return Double.longBitsToDouble(c.f(charSequence, n8, n9));
    }
}

