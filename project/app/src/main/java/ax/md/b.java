/*
 * Decompiled with CFR 0.152.
 */
package ax.md;

import ax.Wc.A;
import ax.Wc.A0;
import ax.Wc.D;
import ax.Wc.E;
import ax.Wc.J;
import ax.Wc.c;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.k0;
import ax.Wc.q;
import ax.Wc.t;
import ax.Wc.t0;
import ax.Wc.w;
import ax.Wc.x0;
import ax.rd.a;
import java.io.IOException;
import java.math.BigInteger;

public class b
extends t {
    private a c0;
    private w d0;
    private E e0;
    private c f0;
    private q q;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private b(D object) {
        object = ((D)object).J();
        A a8 = ax.Wc.q.E(object.nextElement());
        this.q = a8;
        int n8 = b.s((q)a8);
        this.c0 = a.t(object.nextElement());
        this.d0 = w.E(object.nextElement());
        int n9 = -1;
        while (object.hasMoreElements()) {
            a8 = (J)object.nextElement();
            int n10 = ((J)a8).M();
            if (n10 <= n9) throw new IllegalArgumentException("invalid optional field in private key info");
            if (n10 != 0) {
                if (n10 != 1) throw new IllegalArgumentException("unknown optional field in private key info");
                if (n8 < 1) throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                this.f0 = k0.N((J)a8, false);
            } else {
                this.e0 = E.D((J)a8, false);
            }
            n9 = n10;
        }
    }

    public b(a a8, g g8) throws IOException {
        this(a8, g8, null, null);
    }

    public b(a t8, g g8, E e8, byte[] byArray) throws IOException {
        BigInteger bigInteger = byArray != null ? ax.Nd.b.b : ax.Nd.b.a;
        this.q = new q(bigInteger);
        this.c0 = t8;
        this.d0 = new t0(g8);
        this.e0 = e8;
        t8 = byArray == null ? null : new k0(byArray);
        this.f0 = t8;
    }

    public static b r(Object object) {
        if (object instanceof b) {
            return (b)object;
        }
        if (object != null) {
            return new b(D.G(object));
        }
        return null;
    }

    private static int s(q q8) {
        int n8 = q8.K();
        if (n8 >= 0 && n8 <= 1) {
            return n8;
        }
        throw new IllegalArgumentException("invalid version for private key info");
    }

    @Override
    public A g() {
        h h8 = new h(5);
        h8.a(this.q);
        h8.a(this.c0);
        h8.a(this.d0);
        A a8 = this.e0;
        if (a8 != null) {
            h8.a(new A0(false, 0, a8));
        }
        if ((a8 = this.f0) != null) {
            h8.a(new A0(false, 1, a8));
        }
        return new x0(h8);
    }
}

