/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Wc.A;
import ax.Wc.E;
import ax.Wc.J;
import ax.Wc.M0;
import ax.Wc.O;
import ax.Wc.c;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.k;
import ax.Wc.w;
import ax.Wc.x0;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class D
extends A
implements Iterable {
    static final O c0 = new O(D.class, 16){

        @Override
        A c(D d8) {
            return d8;
        }
    };
    g[] q;

    protected D() {
        this.q = h.d;
    }

    protected D(g g8) {
        if (g8 != null) {
            this.q = new g[]{g8};
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    protected D(h h8) {
        if (h8 != null) {
            this.q = h8.g();
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    protected D(g[] gArray) {
        if (!a.o(gArray)) {
            this.q = h.b(gArray);
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }

    D(g[] gArray, boolean bl) {
        g[] gArray2 = gArray;
        if (bl) {
            gArray2 = h.b(gArray);
        }
        this.q = gArray2;
    }

    public static D E(J j8, boolean bl) {
        return (D)c0.e(j8, bl);
    }

    public static D G(Object object) {
        if (object != null && !(object instanceof D)) {
            Object object2;
            if (object instanceof g) {
                object2 = ((g)object).g();
                if (object2 instanceof D) {
                    return (D)object2;
                }
            } else if (object instanceof byte[]) {
                try {
                    object = (D)c0.b((byte[])object);
                    return object;
                }
                catch (IOException iOException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("failed to construct sequence from byte[]: ");
                    stringBuilder.append(iOException.getMessage());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("unknown object in getInstance: ");
            ((StringBuilder)object2).append(object.getClass().getName());
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }
        return (D)object;
    }

    @Override
    A A() {
        return new x0(this.q, false);
    }

    @Override
    A B() {
        return new M0(this.q, false);
    }

    c[] C() {
        int n8 = this.size();
        c[] cArray = new c[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            cArray[i8] = c.I(this.q[i8]);
        }
        return cArray;
    }

    w[] D() {
        int n8 = this.size();
        w[] wArray = new w[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            wArray[i8] = w.E(this.q[i8]);
        }
        return wArray;
    }

    public g I(int n8) {
        return this.q[n8];
    }

    public Enumeration J() {
        return new Enumeration(this){
            final D c0;
            private int q;
            {
                this.c0 = d8;
                this.q = 0;
            }

            @Override
            public boolean hasMoreElements() {
                return this.q < this.c0.q.length;
            }

            public Object nextElement() {
                int n8 = this.q;
                g[] gArray = this.c0.q;
                if (n8 < gArray.length) {
                    this.q = n8 + 1;
                    return gArray[n8];
                }
                throw new NoSuchElementException();
            }
        };
    }

    abstract c K();

    abstract k M();

    abstract w N();

    abstract E O();

    g[] P() {
        return this.q;
    }

    @Override
    public int hashCode() {
        int n8 = this.q.length;
        int n9 = n8 + 1;
        while (--n8 >= 0) {
            n9 = n9 * 257 ^ this.q[n8].g().hashCode();
        }
        return n9;
    }

    public Iterator<g> iterator() {
        return new a.a<g>(this.q);
    }

    @Override
    boolean r(A a8) {
        if (!(a8 instanceof D)) {
            return false;
        }
        D d8 = (D)a8;
        int n8 = this.size();
        if (d8.size() != n8) {
            return false;
        }
        for (int i8 = 0; i8 < n8; ++i8) {
            A a9 = this.q[i8].g();
            if (a9 == (a8 = d8.q[i8].g()) || a9.r(a8)) continue;
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

