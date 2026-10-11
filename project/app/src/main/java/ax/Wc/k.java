/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.g;
import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.J;
import ax.Wc.J0;
import ax.Wc.O;
import ax.Wc.P;
import ax.Wc.c;
import ax.Wc.l0;
import ax.Wc.q;
import ax.Wc.v;
import ax.Wc.w;
import ax.Wc.y;
import java.io.IOException;

public abstract class k
extends A {
    static final O g0 = new O(k.class, 8){

        @Override
        A c(D d8) {
            return d8.M();
        }
    };
    q c0;
    A d0;
    int e0;
    A f0;
    v q;

    k(D a8) {
        A a9;
        int n8 = 0;
        A a10 = a9 = k.I((D)a8, 0);
        if (a9 instanceof v) {
            this.q = (v)a9;
            a10 = k.I((D)a8, 1);
            n8 = 1;
        }
        int n9 = n8;
        a9 = a10;
        if (a10 instanceof q) {
            this.c0 = (q)a10;
            n9 = n8 + 1;
            a9 = k.I((D)a8, n9);
        }
        n8 = n9;
        a10 = a9;
        if (!(a9 instanceof J)) {
            this.d0 = a9;
            n8 = n9 + 1;
            a10 = k.I((D)a8, n8);
        }
        if (((D)a8).size() == n8 + 1) {
            if (a10 instanceof J) {
                a8 = (J)a10;
                this.e0 = k.D(((J)a8).M());
                this.f0 = k.G((J)a8);
                return;
            }
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        throw new IllegalArgumentException("input sequence too large");
    }

    k(v v8, q q8, A a8, int n8, A a9) {
        this.q = v8;
        this.c0 = q8;
        this.d0 = a8;
        this.e0 = k.D(n8);
        this.f0 = k.E(n8, a9);
    }

    private static int D(int n8) {
        if (n8 >= 0 && n8 <= 2) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid encoding value: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static A E(int n8, A a8) {
        O o8;
        if (n8 != 1) {
            if (n8 != 2) {
                return a8;
            }
            o8 = c.c0;
            return o8.a(a8);
        }
        o8 = w.c0;
        return o8.a(a8);
    }

    private static A G(J object) {
        int n8 = ((J)object).K();
        int n9 = ((J)object).M();
        if (128 == n8) {
            if (n9 != 0) {
                if (n9 != 1) {
                    if (n9 == 2) {
                        return c.G((J)object, false);
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("invalid tag: ");
                    ((StringBuilder)object).append(P.a(n8, n9));
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                return w.D((J)object, false);
            }
            return ((J)object).I().g();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("invalid tag: ");
        ((StringBuilder)object).append(P.a(n8, n9));
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    private static A I(D d8, int n8) {
        if (d8.size() > n8) {
            return d8.I(n8).g();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    @Override
    A A() {
        return new l0(this.q, this.c0, this.d0, this.e0, this.f0);
    }

    @Override
    A B() {
        return new J0(this.q, this.c0, this.d0, this.e0, this.f0);
    }

    abstract D C();

    @Override
    public int hashCode() {
        return g.b(this.q) ^ g.b(this.c0) ^ g.b(this.d0) ^ this.e0 ^ this.f0.hashCode();
    }

    @Override
    boolean r(A a8) {
        if (this == a8) {
            return true;
        }
        if (!(a8 instanceof k)) {
            return false;
        }
        a8 = (k)a8;
        return g.a(this.q, ((k)a8).q) && g.a(this.c0, ((k)a8).c0) && g.a(this.d0, ((k)a8).d0) && this.e0 == ((k)a8).e0 && this.f0.y(((k)a8).f0);
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.s(bl, 40);
        this.C().s(y8, false);
    }

    @Override
    boolean t() {
        return true;
    }

    @Override
    int w(boolean bl) throws IOException {
        return this.C().w(bl);
    }
}

