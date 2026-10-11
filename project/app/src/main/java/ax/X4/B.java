/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

import ax.X4.A;
import ax.X4.y;
import ax.X4.z;

public class B {
    private static final y a = new y();
    private static final z b = new z();
    private static final A c = new A();

    public static float a(CharSequence charSequence) throws NumberFormatException {
        return B.b(charSequence, 0, charSequence.length());
    }

    public static float b(CharSequence charSequence, int n8, int n9) throws NumberFormatException {
        return Float.intBitsToFloat((int)c.f(charSequence, n8, n9));
    }
}

