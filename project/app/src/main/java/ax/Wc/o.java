/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.G;
import ax.Wc.O;
import ax.Wc.g;
import ax.Wc.q0;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;

public abstract class o
extends A
implements G {
    static final O c0 = new O(o.class, 22){

        @Override
        A d(t0 t02) {
            return o.C(t02.G());
        }
    };
    final byte[] q;

    o(String string, boolean bl) {
        if (string != null) {
            if (bl && !o.E(string)) {
                throw new IllegalArgumentException("'string' contains illegal characters");
            }
            this.q = j.e(string);
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    o(byte[] byArray, boolean bl) {
        byte[] byArray2 = byArray;
        if (bl) {
            byArray2 = a.d(byArray);
        }
        this.q = byArray2;
    }

    static o C(byte[] byArray) {
        return new q0(byArray, false);
    }

    public static o D(Object object) {
        if (object != null && !(object instanceof o)) {
            Object object2;
            if (object instanceof g && (object2 = ((g)object).g()) instanceof o) {
                return (o)object2;
            }
            if (object instanceof byte[]) {
                try {
                    object = (o)c0.b((byte[])object);
                    return object;
                }
                catch (Exception exception) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("encoding error in getInstance: ");
                    ((StringBuilder)object).append(((Object)exception).toString());
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("illegal object in getInstance: ");
            ((StringBuilder)object2).append(object.getClass().getName());
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }
        return (o)object;
    }

    public static boolean E(String string) {
        for (int i8 = string.length() - 1; i8 >= 0; --i8) {
            if (string.charAt(i8) <= '\u007f') continue;
            return false;
        }
        return true;
    }

    @Override
    public final String h() {
        return j.b(this.q);
    }

    @Override
    public final int hashCode() {
        return a.l(this.q);
    }

    @Override
    final boolean r(A a8) {
        if (!(a8 instanceof o)) {
            return false;
        }
        a8 = (o)a8;
        return a.b(this.q, ((o)a8).q);
    }

    @Override
    final void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 22, this.q);
    }

    @Override
    final boolean t() {
        return false;
    }

    public String toString() {
        return this.h();
    }

    @Override
    final int w(boolean bl) {
        return y.g(bl, this.q.length);
    }
}

