/*
 * Decompiled with CFR 0.152.
 */
package ax.O1;

import androidx.media3.decoder.a;
import ax.N1.k;
import ax.N1.l;
import ax.N1.m;
import ax.N1.p;
import ax.N1.q;
import ax.O1.d;
import ax.S0.a;
import ax.S0.d0;
import java.util.ArrayDeque;

abstract class e
implements l {
    private final ArrayDeque<b> a = new ArrayDeque();
    private final ArrayDeque<q> b;
    private final ArrayDeque<b> c;
    private b d;
    private long e;
    private long f;
    private long g;

    public e() {
        int n8;
        int n9 = 0;
        for (n8 = 0; n8 < 10; ++n8) {
            this.a.add(new b());
        }
        this.b = new ArrayDeque();
        for (n8 = n9; n8 < 2; ++n8) {
            this.b.add(new c(new d(this)));
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    private void p(b b8) {
        b8.p();
        this.a.add(b8);
    }

    @Override
    public final void b(long l8) {
        this.g = l8;
    }

    @Override
    public void d() {
    }

    @Override
    public void e(long l8) {
        this.e = l8;
    }

    @Override
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            this.p(d0.i(this.c.poll()));
        }
        b b8 = this.d;
        if (b8 != null) {
            this.p(b8);
            this.d = null;
        }
    }

    protected abstract k h();

    protected abstract void i(p var1);

    public p j() throws m {
        b b8;
        boolean bl = this.d == null;
        ax.S0.a.g(bl);
        if (this.a.isEmpty()) {
            return null;
        }
        this.d = b8 = this.a.pollFirst();
        return b8;
    }

    public q k() throws m {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && d0.i(this.c.peek()).g0 <= this.e) {
            b b8 = d0.i(this.c.poll());
            if (b8.s()) {
                q q8 = d0.i(this.b.pollFirst());
                q8.n(4);
                this.p(b8);
                return q8;
            }
            this.i(b8);
            if (this.n()) {
                k k8 = this.h();
                q q9 = d0.i(this.b.pollFirst());
                q9.C(b8.g0, k8, Long.MAX_VALUE);
                this.p(b8);
                return q9;
            }
            this.p(b8);
        }
        return null;
    }

    protected final q l() {
        return this.b.pollFirst();
    }

    protected final long m() {
        return this.e;
    }

    protected abstract boolean n();

    public void o(p p8) throws m {
        long l8;
        long l9;
        boolean bl = p8 == this.d;
        ax.S0.a.a(bl);
        p8 = (b)p8;
        if (!p8.s() && (l9 = p8.g0) != Long.MIN_VALUE && (l8 = this.g) != -9223372036854775807L && l9 < l8) {
            this.p((b)p8);
        } else {
            l8 = this.f;
            this.f = 1L + l8;
            ax.O1.e$b.H((b)p8, l8);
            this.c.add((b)p8);
        }
        this.d = null;
    }

    protected void q(q q8) {
        q8.p();
        this.b.add(q8);
    }

    private static final class b
    extends p
    implements Comparable<b> {
        private long l0;

        private b() {
        }

        static /* synthetic */ long H(b b8, long l8) {
            b8.l0 = l8;
            return l8;
        }

        public int I(b b8) {
            long l8;
            if (this.s() != b8.s()) {
                if (this.s()) {
                    return 1;
                }
                return -1;
            }
            long l9 = l8 = this.g0 - b8.g0;
            if (l8 == 0L) {
                l9 = l8 = this.l0 - b8.l0;
                if (l8 == 0L) {
                    return 0;
                }
            }
            if (l9 > 0L) {
                return 1;
            }
            return -1;
        }
    }

    private static final class c
    extends q {
        private a.a<c> h0;

        public c(a.a<c> a8) {
            this.h0 = a8;
        }

        @Override
        public final void B() {
            this.h0.a(this);
        }
    }
}

