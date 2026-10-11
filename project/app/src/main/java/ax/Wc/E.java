/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.J;
import ax.Wc.O;
import ax.Wc.O0;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.y0;
import java.io.IOException;
import java.util.Iterator;

public abstract class E
extends A
implements Iterable {
    static final O d0 = new O(E.class, 17){

        @Override
        A c(D d8) {
            return d8.O();
        }
    };
    protected final boolean c0;
    protected final g[] q;

    protected E() {
        this.q = h.d;
        this.c0 = true;
    }

    protected E(g g8) {
        if (g8 != null) {
            this.q = new g[]{g8};
            this.c0 = true;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    protected E(h gArray, boolean bl) {
        if (gArray != null) {
            if (bl && gArray.f() >= 2) {
                gArray = gArray.c();
                E.J(gArray);
            } else {
                gArray = gArray.g();
            }
            this.q = gArray;
            bl = bl || gArray.length < 2;
            this.c0 = bl;
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    E(boolean bl, g[] gArray) {
        this.q = gArray;
        bl = bl || gArray.length < 2;
        this.c0 = bl;
    }

    protected E(g[] gArray, boolean bl) {
        if (!a.o(gArray)) {
            gArray = h.b(gArray);
            if (bl && gArray.length >= 2) {
                E.J(gArray);
            }
            this.q = gArray;
            bl = bl || gArray.length < 2;
            this.c0 = bl;
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }

    private static byte[] C(g object) {
        try {
            object = object.g().q("DER");
            return object;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static E D(J j8, boolean bl) {
        return (E)d0.e(j8, bl);
    }

    public static E E(Object object) {
        if (object != null && !(object instanceof E)) {
            Object object2;
            if (object instanceof g) {
                object2 = ((g)object).g();
                if (object2 instanceof E) {
                    return (E)object2;
                }
            } else if (object instanceof byte[]) {
                try {
                    object = (E)d0.b((byte[])object);
                    return object;
                }
                catch (IOException iOException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("failed to construct set from byte[]: ");
                    stringBuilder.append(iOException.getMessage());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("unknown object in getInstance: ");
            ((StringBuilder)object2).append(object.getClass().getName());
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }
        return (E)object;
    }

    private static boolean I(byte[] byArray, byte[] byArray2) {
        int n8 = byArray[0] & 0xFFFFFFDF;
        int n9 = byArray2[0] & 0xFFFFFFDF;
        if (n8 != n9) {
            return n8 < n9;
        }
        n9 = Math.min(byArray.length, byArray2.length) - 1;
        for (n8 = 1; n8 < n9; ++n8) {
            byte by = byArray[n8];
            byte by2 = byArray2[n8];
            if (by == by2) continue;
            return (by & 0xFF) < (by2 & 0xFF);
        }
        return (byArray[n9] & 0xFF) <= (byArray2[n9] & 0xFF);
    }

    private static void J(g[] gArray) {
        int n8 = gArray.length;
        int n9 = 2;
        if (n8 < 2) {
            return;
        }
        g g8 = gArray[0];
        g g9 = gArray[1];
        Object object = E.C(g8);
        byte[] byArray = E.C(g9);
        int n10 = n9;
        Object object2 = g8;
        Object object3 = g9;
        byte[] byArray2 = object;
        byte[] byArray3 = byArray;
        if (E.I(byArray, object)) {
            object3 = g8;
            object2 = g9;
            byArray3 = object;
            byArray2 = byArray;
            n10 = n9;
        }
        while (n10 < n8) {
            object = gArray[n10];
            byArray = E.C((g)object);
            if (E.I(byArray3, byArray)) {
                gArray[n10 - 2] = object2;
                object2 = object3;
                object3 = object;
                byArray2 = byArray3;
                byArray3 = byArray;
            } else if (E.I(byArray2, byArray)) {
                gArray[n10 - 2] = object2;
                object2 = object;
                byArray2 = byArray;
            } else {
                int n11;
                n9 = n10 - 1;
                while ((n11 = n9 - 1) > 0 && !E.I(E.C(g9 = gArray[n9 - 2]), byArray)) {
                    gArray[n11] = g9;
                    n9 = n11;
                }
                gArray[n11] = object;
            }
            ++n10;
        }
        gArray[n8 - 2] = object2;
        gArray[n8 - 1] = object3;
    }

    @Override
    A A() {
        g[] gArray;
        if (this.c0) {
            gArray = this.q;
        } else {
            gArray = (g[])this.q.clone();
            E.J(gArray);
        }
        return new y0(true, gArray);
    }

    @Override
    A B() {
        return new O0(this.c0, this.q);
    }

    public g G(int n8) {
        return this.q[n8];
    }

    public g[] K() {
        return h.b(this.q);
    }

    @Override
    public int hashCode() {
        int n8 = this.q.length;
        int n9 = n8 + 1;
        while (--n8 >= 0) {
            n9 += this.q[n8].g().hashCode();
        }
        return n9;
    }

    public Iterator<g> iterator() {
        return new a.a<g>(this.K());
    }

    @Override
    boolean r(A a8) {
        if (!(a8 instanceof E)) {
            return false;
        }
        E e8 = (E)a8;
        int n8 = this.size();
        if (e8.size() != n8) {
            return false;
        }
        a8 = (y0)this.A();
        e8 = (y0)e8.A();
        for (int i8 = 0; i8 < n8; ++i8) {
            A a9;
            A a10 = ((E)a8).q[i8].g();
            if (a10 == (a9 = e8.q[i8].g()) || a10.r(a9)) continue;
            return false;
        }
        return true;
    }

    public int size() {
        return this.q.length;
    }

    @Override
    boolean t() {
        return true;
    }

    public String toString() {
        int n8 = this.size();
        if (n8 == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int n9 = 0;
        while (true) {
            stringBuffer.append(this.q[n9]);
            if (++n9 >= n8) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }
}

