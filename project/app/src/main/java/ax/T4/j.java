/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

import ax.T4.b;
import ax.T4.e;
import ax.T4.h;
import ax.T4.i;
import ax.T4.m;
import ax.T4.q;
import ax.T4.s;
import ax.b5.g;
import java.io.Closeable;
import java.io.IOException;

public abstract class j
implements Closeable,
AutoCloseable {
    protected static final ax.b5.h<q> c0 = ax.b5.h.a((g[])ax.T4.q.values());
    protected int q;

    protected j() {
        this.q = e.m0;
    }

    protected j(int n8) {
        this.q = n8;
    }

    public boolean A(a a8) {
        return a8.j(this.q);
    }

    public boolean F(s s8) {
        return s8.j().j(this.q);
    }

    public abstract m H() throws IOException;

    public abstract j L() throws IOException;

    protected i a(String string) {
        return new i(this, string).c(null);
    }

    public m b() {
        return this.j();
    }

    public byte[] c() throws IOException {
        return this.d(b.a());
    }

    @Override
    public abstract void close() throws IOException;

    public abstract byte[] d(ax.T4.a var1) throws IOException;

    public boolean e() throws IOException {
        m m8 = this.b();
        if (m8 == m.u0) {
            return true;
        }
        if (m8 == m.v0) {
            return false;
        }
        throw new i(this, String.format("Current token (%s) not of boolean type", new Object[]{m8})).c(null);
    }

    public abstract h f();

    public abstract String g() throws IOException;

    public abstract m j();

    public abstract double m() throws IOException;

    public abstract float o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract String u() throws IOException;

    public abstract h v();

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        public static final /* enum */ a g0;
        public static final /* enum */ a h0;
        @Deprecated
        public static final /* enum */ a i0;
        @Deprecated
        public static final /* enum */ a j0;
        @Deprecated
        public static final /* enum */ a k0;
        @Deprecated
        public static final /* enum */ a l0;
        @Deprecated
        public static final /* enum */ a m0;
        @Deprecated
        public static final /* enum */ a n0;
        @Deprecated
        public static final /* enum */ a o0;
        @Deprecated
        public static final /* enum */ a p0;
        @Deprecated
        public static final /* enum */ a q0;
        public static final /* enum */ a r0;
        public static final /* enum */ a s0;
        public static final /* enum */ a t0;
        public static final /* enum */ a u0;
        public static final /* enum */ a v0;
        private static final a[] w0;
        private final int c0 = 1 << this.ordinal();
        private final boolean q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            a a13;
            a a14;
            a a15;
            a a16;
            a a17;
            a a18;
            a a19;
            a a20;
            a a21;
            a a22;
            a a23;
            a a24;
            a a25;
            a a26;
            d0 = a26 = new a(true);
            e0 = a25 = new a(false);
            f0 = a24 = new a(false);
            g0 = a23 = new a(false);
            h0 = a22 = new a(false);
            i0 = a21 = new a(false);
            j0 = a20 = new a(false);
            k0 = a19 = new a(false);
            l0 = a18 = new a(false);
            m0 = a17 = new a(false);
            n0 = a16 = new a(false);
            o0 = a15 = new a(false);
            p0 = a14 = new a(false);
            q0 = a13 = new a(false);
            r0 = a12 = new a(false);
            s0 = a11 = new a(false);
            t0 = a10 = new a(true);
            u0 = a9 = new a(false);
            v0 = a8 = new a(false);
            w0 = new a[]{a26, a25, a24, a23, a22, a21, a20, a19, a18, a17, a16, a15, a14, a13, a12, a11, a10, a9, a8};
        }

        private a(boolean bl) {
            this.q = bl;
        }

        public static int d() {
            a[] aArray = a.values();
            int n8 = aArray.length;
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                a a8 = aArray[i8];
                int n10 = n9;
                if (a8.h()) {
                    n10 = n9 | a8.l();
                }
                n9 = n10;
            }
            return n9;
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])w0.clone();
        }

        public boolean h() {
            return this.q;
        }

        public boolean j(int n8) {
            return (n8 & this.c0) != 0;
        }

        public int l() {
            return this.c0;
        }
    }
}

