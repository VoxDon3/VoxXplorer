/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Nd.j;
import ax.Od.c;
import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.J;
import ax.Wc.O;
import ax.Wc.g;
import ax.Wc.t0;
import ax.Wc.x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class w
extends A
implements x {
    static final O c0 = new O(w.class, 4){

        @Override
        A c(D d8) {
            return d8.N();
        }

        @Override
        A d(t0 t02) {
            return t02;
        }
    };
    static final byte[] d0 = new byte[0];
    byte[] q;

    public w(byte[] byArray) {
        if (byArray != null) {
            this.q = byArray;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    static w C(byte[] byArray) {
        return new t0(byArray);
    }

    public static w D(J j8, boolean bl) {
        return (w)c0.e(j8, bl);
    }

    public static w E(Object object) {
        if (object != null && !(object instanceof w)) {
            Object object2;
            if (object instanceof g) {
                object2 = ((g)object).g();
                if (object2 instanceof w) {
                    return (w)object2;
                }
            } else if (object instanceof byte[]) {
                try {
                    object = (w)c0.b((byte[])object);
                    return object;
                }
                catch (IOException iOException) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("failed to construct OCTET STRING from byte[]: ");
                    ((StringBuilder)object).append(iOException.getMessage());
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("illegal object in getInstance: ");
            ((StringBuilder)object2).append(object.getClass().getName());
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }
        return (w)object;
    }

    @Override
    A A() {
        return new t0(this.q);
    }

    @Override
    A B() {
        return new t0(this.q);
    }

    public byte[] G() {
        return this.q;
    }

    @Override
    public InputStream e() {
        return new ByteArrayInputStream(this.q);
    }

    @Override
    public int hashCode() {
        return a.l(this.G());
    }

    @Override
    public A l() {
        return this.g();
    }

    @Override
    boolean r(A a8) {
        if (!(a8 instanceof w)) {
            return false;
        }
        a8 = (w)a8;
        return a.b(this.q, ((w)a8).q);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#");
        stringBuilder.append(j.b(c.b(this.q)));
        return stringBuilder.toString();
    }
}

