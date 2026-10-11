/*
 * Decompiled with CFR 0.152.
 */
package ax.td;

import ax.Wc.h;
import ax.Wc.k0;
import ax.Wc.q;
import ax.Wc.t;
import ax.Wc.v;
import ax.Wc.x0;
import ax.rd.g;
import ax.rd.l;
import ax.rd.m;
import ax.rd.n;
import ax.rd.o;
import ax.td.a;
import ax.td.b;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;

public class c {
    private o a;
    private g b;

    public c(ax.pd.c c8, BigInteger bigInteger, n n8, n n9, ax.pd.c c9, l l8) {
        o o8;
        this.a = o8 = new o();
        o8.e(new q(bigInteger));
        this.a.d(c8);
        this.a.g(n8);
        this.a.b(n9);
        this.a.h(c9);
        this.a.i(l8);
        this.b = new g();
    }

    public c(ax.pd.c c8, BigInteger bigInteger, Date date, Date date2, ax.pd.c c9, l l8) {
        this(c8, bigInteger, new n(date), new n(date2), c9, l8);
    }

    private static byte[] c(ax.Ld.a a8, t t8) throws IOException {
        OutputStream outputStream = a8.b();
        t8.n(outputStream, "DER");
        outputStream.close();
        return a8.c();
    }

    private static ax.rd.c d(m m8, ax.rd.a a8, byte[] byArray) {
        h h8 = new h();
        h8.a(m8);
        h8.a(a8);
        h8.a(new k0(byArray));
        return ax.rd.c.r(new x0(h8));
    }

    public c a(v object, boolean bl, ax.Wc.g g8) throws a {
        try {
            this.b.a((v)object, bl, g8);
            return this;
        }
        catch (IOException iOException) {
            object = new StringBuilder();
            ((StringBuilder)object).append("cannot encode extension: ");
            ((StringBuilder)object).append(iOException.getMessage());
            throw new a(((StringBuilder)object).toString(), iOException);
        }
    }

    public b b(ax.Ld.a object) {
        this.a.f(object.d());
        if (!this.b.d()) {
            this.a.c(this.b.c());
        }
        try {
            m m8 = this.a.a();
            object = new b(c.d(m8, object.d(), c.c((ax.Ld.a)object, m8)));
            return object;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException("cannot produce certificate signature");
        }
    }
}

