/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

import ax.T4.f;
import ax.T4.o;
import ax.T4.p;
import ax.T4.t;
import ax.b5.h;
import ax.b5.n;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public abstract class g
implements Closeable,
Flushable,
AutoCloseable {
    protected static final h<t> c0;
    protected static final h<t> d0;
    protected static final h<t> e0;
    protected o q;

    static {
        h h8;
        c0 = h8 = h.a((ax.b5.g[])t.values());
        d0 = h8.b(t.e0);
        e0 = h8.b(t.d0);
    }

    protected g() {
    }

    public abstract void A(char var1) throws IOException;

    public void F(p p8) throws IOException {
        this.H(p8.getValue());
    }

    public abstract void H(String var1) throws IOException;

    public abstract void L(char[] var1, int var2, int var3) throws IOException;

    public abstract void W() throws IOException;

    protected void a(String string) throws f {
        throw new f(string, this);
    }

    protected final void b() {
        n.a();
    }

    public o c() {
        return this.q;
    }

    public g d(int n8) {
        return this;
    }

    @Deprecated
    public void d0(int n8) throws IOException {
        this.W();
    }

    public g e(o o8) {
        this.q = o8;
        return this;
    }

    public abstract g f();

    @Override
    public abstract void flush() throws IOException;

    public abstract void g(boolean var1) throws IOException;

    public abstract void j() throws IOException;

    public abstract void m() throws IOException;

    public abstract void o(String var1) throws IOException;

    public abstract void o0() throws IOException;

    public abstract void p() throws IOException;

    public abstract void q(double var1) throws IOException;

    public abstract void s0(String var1) throws IOException;

    public abstract void u(long var1) throws IOException;

    public void u0(String string, String string2) throws IOException {
        this.o(string);
        this.s0(string2);
    }

    public void v(String string, long l8) throws IOException {
        this.o(string);
        this.u(l8);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        @Deprecated
        public static final /* enum */ a g0;
        @Deprecated
        public static final /* enum */ a h0;
        @Deprecated
        public static final /* enum */ a i0;
        @Deprecated
        public static final /* enum */ a j0;
        public static final /* enum */ a k0;
        public static final /* enum */ a l0;
        public static final /* enum */ a m0;
        @Deprecated
        public static final /* enum */ a n0;
        @Deprecated
        public static final /* enum */ a o0;
        private static final a[] p0;
        private final int c0;
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
            d0 = a19 = new a(true);
            e0 = a18 = new a(true);
            f0 = a17 = new a(true);
            g0 = a16 = new a(true);
            h0 = a15 = new a(true);
            i0 = a14 = new a(false);
            j0 = a13 = new a(false);
            k0 = a12 = new a(false);
            l0 = a11 = new a(false);
            m0 = a10 = new a(false);
            n0 = a9 = new a(false);
            o0 = a8 = new a(true);
            p0 = new a[]{a19, a18, a17, a16, a15, a14, a13, a12, a11, a10, a9, a8};
        }

        private a(boolean bl) {
            this.q = bl;
            this.c0 = 1 << this.ordinal();
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
            return (a[])p0.clone();
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

