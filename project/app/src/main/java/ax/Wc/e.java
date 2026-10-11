/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.O;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;

public class e
extends A {
    static final O c0 = new O(e.class, 1){

        @Override
        A d(t0 t02) {
            return e.C(t02.G());
        }
    };
    public static final e d0 = new e(0);
    public static final e e0 = new e(-1);
    private final byte q;

    private e(byte by) {
        this.q = by;
    }

    static e C(byte[] byArray) {
        if (byArray.length == 1) {
            byte by = byArray[0];
            if (by != -1) {
                if (by != 0) {
                    return new e(by);
                }
                return d0;
            }
            return e0;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    public static e D(Object object) {
        if (object != null && !(object instanceof e)) {
            if (object instanceof byte[]) {
                object = (byte[])object;
                try {
                    object = (e)c0.b((byte[])object);
                    return object;
                }
                catch (IOException iOException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("failed to construct boolean from byte[]: ");
                    stringBuilder.append(iOException.getMessage());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("illegal object in getInstance: ");
            stringBuilder.append(object.getClass().getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return (e)object;
    }

    public static e E(boolean bl) {
        if (bl) {
            return e0;
        }
        return d0;
    }

    @Override
    A A() {
        if (this.G()) {
            return e0;
        }
        return d0;
    }

    public boolean G() {
        return this.q != 0;
    }

    @Override
    public int hashCode() {
        return this.G() ? 1 : 0;
    }

    @Override
    boolean r(A a8) {
        if (!(a8 instanceof e)) {
            return false;
        }
        a8 = (e)a8;
        return this.G() == ((e)a8).G();
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.m(bl, 1, this.q);
    }

    @Override
    boolean t() {
        return false;
    }

    public String toString() {
        if (this.G()) {
            return "TRUE";
        }
        return "FALSE";
    }

    @Override
    int w(boolean bl) {
        return y.g(bl, 1);
    }
}

