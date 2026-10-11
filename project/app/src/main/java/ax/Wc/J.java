/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.A0;
import ax.Wc.D;
import ax.Wc.G0;
import ax.Wc.K0;
import ax.Wc.O;
import ax.Wc.P;
import ax.Wc.Q0;
import ax.Wc.T;
import ax.Wc.U0;
import ax.Wc.X;
import ax.Wc.a;
import ax.Wc.e0;
import ax.Wc.f;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.t;
import ax.Wc.t0;
import java.io.IOException;

public abstract class J
extends A
implements g,
U0 {
    final int c0;
    final int d0;
    final g e0;
    final int q;

    J(int n8, int n9, int n10, g object) {
        if (object != null) {
            if (n9 != 0 && (n9 & 0xC0) == n9) {
                if (object instanceof f) {
                    n8 = 1;
                }
                this.q = n8;
                this.c0 = n9;
                this.d0 = n10;
                this.e0 = object;
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("invalid tag class: ");
            ((StringBuilder)object).append(n9);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        throw new NullPointerException("'obj' cannot be null");
    }

    protected J(boolean bl, int n8, int n9, g g8) {
        int n10 = bl ? 1 : 2;
        this(n10, n8, n9, g8);
    }

    protected J(boolean bl, int n8, g g8) {
        this(bl, 128, n8, g8);
    }

    static A C(int n8, int n9, h object) {
        object = ((h)object).f() == 1 ? new Q0(3, n8, n9, ((h)object).d(0)) : new Q0(4, n8, n9, (g)K0.a((h)object));
        if (n8 != 64) {
            return object;
        }
        return new G0((J)object);
    }

    static A D(int n8, int n9, h object) {
        object = ((h)object).f() == 1 ? new e0(3, n8, n9, ((h)object).d(0)) : new e0(4, n8, n9, (g)X.a((h)object));
        if (n8 != 64) {
            return object;
        }
        return new T((J)object);
    }

    static A E(int n8, int n9, byte[] object) {
        object = new Q0(4, n8, n9, (g)new t0((byte[])object));
        if (n8 != 64) {
            return object;
        }
        return new G0((J)object);
    }

    @Override
    A A() {
        return new A0(this.q, this.c0, this.d0, this.e0);
    }

    @Override
    A B() {
        return new Q0(this.q, this.c0, this.d0, this.e0);
    }

    A G(boolean bl, O o8) {
        if (bl) {
            if (this.N()) {
                return o8.a(this.e0.g());
            }
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        if (1 != this.q) {
            A a8 = this.e0.g();
            int n8 = this.q;
            if (n8 != 3) {
                if (n8 != 4) {
                    return o8.a(a8);
                }
                if (a8 instanceof D) {
                    return o8.c((D)a8);
                }
                return o8.d((t0)a8);
            }
            return o8.c(this.O(a8));
        }
        throw new IllegalStateException("object explicit - implicit expected.");
    }

    public t I() {
        if (this.N()) {
            g g8 = this.e0;
            if (g8 instanceof t) {
                return (t)g8;
            }
            return g8.g();
        }
        throw new IllegalStateException("object implicit - explicit expected.");
    }

    public A J() {
        if (128 == this.K()) {
            return this.e0.g();
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public int K() {
        return this.c0;
    }

    public int M() {
        return this.d0;
    }

    public boolean N() {
        int n8 = this.q;
        return n8 == 1 || n8 == 3;
    }

    abstract D O(A var1);

    @Override
    public int hashCode() {
        int n8 = this.c0;
        int n9 = this.d0;
        int n10 = this.N() ? 15 : 240;
        return n8 * 7919 ^ n9 ^ n10 ^ this.e0.g().hashCode();
    }

    @Override
    public final A l() {
        return this;
    }

    @Override
    boolean r(A a8) {
        if (a8 instanceof a) {
            return a8.y(this);
        }
        if (!(a8 instanceof J)) {
            return false;
        }
        a8 = (J)a8;
        if (this.d0 == ((J)a8).d0 && this.c0 == ((J)a8).c0) {
            A a9;
            if (this.q != ((J)a8).q && this.N() != ((J)a8).N()) {
                return false;
            }
            A a10 = this.e0.g();
            if (a10 == (a9 = ((J)a8).e0.g())) {
                return true;
            }
            if (!this.N()) {
                try {
                    boolean bl = ax.Nd.a.b(this.p(), a8.p());
                    return bl;
                }
                catch (IOException iOException) {
                    return false;
                }
            }
            return a10.r(a9);
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(P.a(this.c0, this.d0));
        stringBuilder.append(this.e0);
        return stringBuilder.toString();
    }
}

