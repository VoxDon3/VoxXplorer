/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.J;
import ax.Wc.c;
import ax.Wc.w;
import ax.Wc.y;
import java.io.IOException;

public class k0
extends c {
    public k0(int n8) {
        super(c.E(n8), c.J(n8));
    }

    public k0(byte[] byArray) {
        this(byArray, 0);
    }

    public k0(byte[] byArray, int n8) {
        super(byArray, n8);
    }

    k0(byte[] byArray, boolean bl) {
        super(byArray, bl);
    }

    public static k0 K(c c8) {
        return (k0)c8.A();
    }

    static k0 M(w w8) {
        return new k0(w8.G(), true);
    }

    public static k0 N(J a8, boolean bl) {
        a8 = a8.J();
        if (!bl && !(a8 instanceof k0)) {
            return k0.M(w.E(a8));
        }
        return k0.O(a8);
    }

    public static k0 O(Object object) {
        if (object != null && !(object instanceof k0)) {
            if (object instanceof c) {
                return k0.K((c)object);
            }
            if (object instanceof byte[]) {
                try {
                    object = k0.K((c)A.z((byte[])object));
                    return object;
                }
                catch (Exception exception) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("encoding error in getInstance: ");
                    ((StringBuilder)object).append(((Object)exception).toString());
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("illegal object in getInstance: ");
            stringBuilder.append(object.getClass().getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return (k0)object;
    }

    @Override
    A A() {
        return this;
    }

    @Override
    A B() {
        return this;
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        byte[] byArray = this.q;
        int n8 = byArray.length - 1;
        byte by = byArray[n8];
        byte by2 = byArray[0];
        byte by3 = (byte)(255 << (by2 & 0xFF) & by);
        if (by == by3) {
            y8.o(bl, 3, byArray);
            return;
        }
        y8.q(bl, 3, byArray, 0, n8, by3);
    }

    @Override
    boolean t() {
        return false;
    }

    @Override
    int w(boolean bl) {
        return y.g(bl, this.q.length);
    }
}

