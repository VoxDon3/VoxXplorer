/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.E;
import ax.r0.S;
import ax.r0.a;
import ax.r0.g;
import ax.r0.h;
import ax.r0.h0;
import ax.r0.l;
import ax.r0.s0;
import ax.r0.t0;
import ax.r0.u0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class k
extends g {
    private static final Logger c = Logger.getLogger(k.class.getName());
    private static final boolean d = s0.C();
    l a;
    private boolean b;

    private k() {
    }

    public static int A(int n8, E e8) {
        return k.V(n8) + k.B(e8);
    }

    public static int B(E e8) {
        return k.C(e8.b());
    }

    static int C(int n8) {
        return k.X(n8) + n8;
    }

    public static int D(int n8, S s8) {
        return k.V(1) * 2 + k.W(2, n8) + k.E(3, s8);
    }

    public static int E(int n8, S s8) {
        return k.V(n8) + k.G(s8);
    }

    static int F(int n8, S s8, h0 h02) {
        return k.V(n8) + k.H(s8, h02);
    }

    public static int G(S s8) {
        return k.C(s8.i());
    }

    static int H(S s8, h0 h02) {
        return k.C(((a)s8).l(h02));
    }

    static int I(int n8) {
        if (n8 > 4096) {
            return 4096;
        }
        return n8;
    }

    public static int J(int n8, h h8) {
        return k.V(1) * 2 + k.W(2, n8) + k.g(3, h8);
    }

    @Deprecated
    public static int K(int n8) {
        return k.X(n8);
    }

    public static int L(int n8, int n9) {
        return k.V(n8) + k.M(n9);
    }

    public static int M(int n8) {
        return 4;
    }

    public static int N(int n8, long l8) {
        return k.V(n8) + k.O(l8);
    }

    public static int O(long l8) {
        return 8;
    }

    public static int P(int n8, int n9) {
        return k.V(n8) + k.Q(n9);
    }

    public static int Q(int n8) {
        return k.X(k.a0(n8));
    }

    public static int R(int n8, long l8) {
        return k.V(n8) + k.S(l8);
    }

    public static int S(long l8) {
        return k.Z(k.b0(l8));
    }

    public static int T(int n8, String string) {
        return k.V(n8) + k.U(string);
    }

    public static int U(String string) {
        int n8;
        try {
            n8 = t0.g(string);
        }
        catch (t0.d d8) {
            n8 = string.getBytes(A.a).length;
        }
        return k.C(n8);
    }

    public static int V(int n8) {
        return k.X(u0.c(n8, 0));
    }

    public static int W(int n8, int n9) {
        return k.V(n8) + k.X(n9);
    }

    public static int X(int n8) {
        if ((n8 & 0xFFFFFF80) == 0) {
            return 1;
        }
        if ((n8 & 0xFFFFC000) == 0) {
            return 2;
        }
        if ((0xFFE00000 & n8) == 0) {
            return 3;
        }
        if ((n8 & 0xF0000000) == 0) {
            return 4;
        }
        return 5;
    }

    public static int Y(int n8, long l8) {
        return k.V(n8) + k.Z(l8);
    }

    public static int Z(long l8) {
        int n8;
        if ((0xFFFFFFFFFFFFFF80L & l8) == 0L) {
            return 1;
        }
        if (l8 < 0L) {
            return 10;
        }
        if ((0xFFFFFFF800000000L & l8) != 0L) {
            l8 >>>= 28;
            n8 = 6;
        } else {
            n8 = 2;
        }
        int n9 = n8;
        long l9 = l8;
        if ((0xFFFFFFFFFFE00000L & l8) != 0L) {
            n9 = n8 + 2;
            l9 = l8 >>> 14;
        }
        n8 = n9;
        if ((l9 & 0xFFFFFFFFFFFFC000L) != 0L) {
            n8 = n9 + 1;
        }
        return n8;
    }

    public static int a0(int n8) {
        return n8 >> 31 ^ n8 << 1;
    }

    public static long b0(long l8) {
        return l8 >> 63 ^ l8 << 1;
    }

    public static int d(int n8, boolean bl) {
        return k.V(n8) + k.e(bl);
    }

    public static int e(boolean bl) {
        return 1;
    }

    public static int f(byte[] byArray) {
        return k.C(byArray.length);
    }

    public static k f0(OutputStream outputStream, int n8) {
        return new e(outputStream, n8);
    }

    public static int g(int n8, h h8) {
        return k.V(n8) + k.h(h8);
    }

    public static k g0(byte[] byArray) {
        return k.h0(byArray, 0, byArray.length);
    }

    public static int h(h h8) {
        return k.C(h8.size());
    }

    public static k h0(byte[] byArray, int n8, int n9) {
        return new c(byArray, n8, n9);
    }

    public static int i(int n8, double d8) {
        return k.V(n8) + k.j(d8);
    }

    public static int j(double d8) {
        return 8;
    }

    public static int k(int n8, int n9) {
        return k.V(n8) + k.l(n9);
    }

    public static int l(int n8) {
        return k.w(n8);
    }

    public static int m(int n8, int n9) {
        return k.V(n8) + k.n(n9);
    }

    public static int n(int n8) {
        return 4;
    }

    public static int o(int n8, long l8) {
        return k.V(n8) + k.p(l8);
    }

    public static int p(long l8) {
        return 8;
    }

    public static int q(int n8, float f8) {
        return k.V(n8) + k.r(f8);
    }

    public static int r(float f8) {
        return 4;
    }

    @Deprecated
    static int s(int n8, S s8, h0 h02) {
        return k.V(n8) * 2 + k.u(s8, h02);
    }

    @Deprecated
    public static int t(S s8) {
        return s8.i();
    }

    @Deprecated
    static int u(S s8, h0 h02) {
        return ((a)s8).l(h02);
    }

    public static int v(int n8, int n9) {
        return k.V(n8) + k.w(n9);
    }

    public static int w(int n8) {
        if (n8 >= 0) {
            return k.X(n8);
        }
        return 10;
    }

    public static int x(int n8, long l8) {
        return k.V(n8) + k.y(l8);
    }

    public static int y(long l8) {
        return k.Z(l8);
    }

    public static int z(int n8, E e8) {
        return k.V(1) * 2 + k.W(2, n8) + k.A(3, e8);
    }

    @Deprecated
    public final void A0(int n8, S s8) throws IOException {
        this.W0(n8, 3);
        this.C0(s8);
        this.W0(n8, 4);
    }

    @Deprecated
    final void B0(int n8, S s8, h0 h02) throws IOException {
        this.W0(n8, 3);
        this.D0(s8, h02);
        this.W0(n8, 4);
    }

    @Deprecated
    public final void C0(S s8) throws IOException {
        s8.f(this);
    }

    @Deprecated
    final void D0(S s8, h0 h02) throws IOException {
        h02.d(s8, this.a);
    }

    public abstract void E0(int var1, int var2) throws IOException;

    public abstract void F0(int var1) throws IOException;

    public final void G0(int n8, long l8) throws IOException {
        this.Z0(n8, l8);
    }

    public final void H0(long l8) throws IOException {
        this.a1(l8);
    }

    abstract void I0(int var1, S var2, h0 var3) throws IOException;

    public abstract void J0(S var1) throws IOException;

    public abstract void K0(int var1, S var2) throws IOException;

    public abstract void L0(int var1, h var2) throws IOException;

    public final void M0(int n8, int n9) throws IOException {
        this.u0(n8, n9);
    }

    public final void N0(int n8) throws IOException {
        this.v0(n8);
    }

    public final void O0(int n8, long l8) throws IOException {
        this.w0(n8, l8);
    }

    public final void P0(long l8) throws IOException {
        this.x0(l8);
    }

    public final void Q0(int n8, int n9) throws IOException {
        this.X0(n8, k.a0(n9));
    }

    public final void R0(int n8) throws IOException {
        this.Y0(k.a0(n8));
    }

    public final void S0(int n8, long l8) throws IOException {
        this.Z0(n8, k.b0(l8));
    }

    public final void T0(long l8) throws IOException {
        this.a1(k.b0(l8));
    }

    public abstract void U0(int var1, String var2) throws IOException;

    public abstract void V0(String var1) throws IOException;

    public abstract void W0(int var1, int var2) throws IOException;

    public abstract void X0(int var1, int var2) throws IOException;

    public abstract void Y0(int var1) throws IOException;

    public abstract void Z0(int var1, long var2) throws IOException;

    @Override
    public abstract void a(byte[] var1, int var2, int var3) throws IOException;

    public abstract void a1(long var1) throws IOException;

    public final void c() {
        if (this.i0() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public abstract void c0() throws IOException;

    final void d0(String object, t0.d d8) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        block3: {
            c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", d8);
            object = ((String)object).getBytes(A.a);
            try {
                this.Y0(((Object)object).length);
                this.a((byte[])object, 0, ((Object)object).length);
                return;
            }
            catch (d d9) {
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                break block3;
            }
            throw d9;
        }
        throw new d(indexOutOfBoundsException2);
    }

    boolean e0() {
        return this.b;
    }

    public abstract int i0();

    public abstract void j0(byte var1) throws IOException;

    public abstract void k0(int var1, boolean var2) throws IOException;

    public final void l0(boolean bl) throws IOException {
        this.j0((byte)(bl ? 1 : 0));
    }

    public final void m0(byte[] byArray) throws IOException {
        this.n0(byArray, 0, byArray.length);
    }

    abstract void n0(byte[] var1, int var2, int var3) throws IOException;

    public abstract void o0(int var1, h var2) throws IOException;

    public abstract void p0(h var1) throws IOException;

    public final void q0(int n8, double d8) throws IOException {
        this.w0(n8, Double.doubleToRawLongBits(d8));
    }

    public final void r0(double d8) throws IOException {
        this.x0(Double.doubleToRawLongBits(d8));
    }

    public final void s0(int n8, int n9) throws IOException {
        this.E0(n8, n9);
    }

    public final void t0(int n8) throws IOException {
        this.F0(n8);
    }

    public abstract void u0(int var1, int var2) throws IOException;

    public abstract void v0(int var1) throws IOException;

    public abstract void w0(int var1, long var2) throws IOException;

    public abstract void x0(long var1) throws IOException;

    public final void y0(int n8, float f8) throws IOException {
        this.u0(n8, Float.floatToRawIntBits(f8));
    }

    public final void z0(float f8) throws IOException {
        this.v0(Float.floatToRawIntBits(f8));
    }

    private static abstract class b
    extends k {
        final byte[] e;
        final int f;
        int g;
        int h;

        b(int n8) {
            if (n8 >= 0) {
                byte[] byArray = new byte[Math.max(n8, 20)];
                this.e = byArray;
                this.f = byArray.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        final void b1(byte by) {
            byte[] byArray = this.e;
            int n8 = this.g;
            this.g = n8 + 1;
            byArray[n8] = by;
            ++this.h;
        }

        final void c1(int n8) {
            int n9;
            int n10;
            byte[] byArray = this.e;
            int n11 = this.g;
            this.g = n10 = n11 + 1;
            byArray[n11] = (byte)(n8 & 0xFF);
            this.g = n9 = n11 + 2;
            byArray[n10] = (byte)(n8 >> 8 & 0xFF);
            this.g = n10 = n11 + 3;
            byArray[n9] = (byte)(n8 >> 16 & 0xFF);
            this.g = n11 + 4;
            byArray[n10] = (byte)(n8 >> 24 & 0xFF);
            this.h += 4;
        }

        final void d1(long l8) {
            int n8;
            int n9;
            byte[] byArray = this.e;
            int n10 = this.g;
            this.g = n9 = n10 + 1;
            byArray[n10] = (byte)(l8 & 0xFFL);
            this.g = n8 = n10 + 2;
            byArray[n9] = (byte)(l8 >> 8 & 0xFFL);
            this.g = n9 = n10 + 3;
            byArray[n8] = (byte)(l8 >> 16 & 0xFFL);
            this.g = n8 = n10 + 4;
            byArray[n9] = (byte)(0xFFL & l8 >> 24);
            this.g = n9 = n10 + 5;
            byArray[n8] = (byte)((int)(l8 >> 32) & 0xFF);
            this.g = n8 = n10 + 6;
            byArray[n9] = (byte)((int)(l8 >> 40) & 0xFF);
            this.g = n9 = n10 + 7;
            byArray[n8] = (byte)((int)(l8 >> 48) & 0xFF);
            this.g = n10 + 8;
            byArray[n9] = (byte)((int)(l8 >> 56) & 0xFF);
            this.h += 8;
        }

        final void e1(int n8) {
            if (n8 >= 0) {
                this.g1(n8);
                return;
            }
            this.h1(n8);
        }

        final void f1(int n8, int n9) {
            this.g1(u0.c(n8, n9));
        }

        final void g1(int n8) {
            int n9 = n8;
            if (d) {
                long l8 = this.g;
                while (true) {
                    byte[] byArray;
                    if ((n8 & 0xFFFFFF80) == 0) {
                        byArray = this.e;
                        n9 = this.g;
                        this.g = n9 + 1;
                        s0.H(byArray, n9, (byte)n8);
                        n8 = (int)((long)this.g - l8);
                        this.h += n8;
                        return;
                    }
                    byArray = this.e;
                    n9 = this.g;
                    this.g = n9 + 1;
                    s0.H(byArray, n9, (byte)(n8 & 0x7F | 0x80));
                    n8 >>>= 7;
                }
            }
            while (true) {
                byte[] byArray;
                if ((n9 & 0xFFFFFF80) == 0) {
                    byArray = this.e;
                    n8 = this.g;
                    this.g = n8 + 1;
                    byArray[n8] = (byte)n9;
                    ++this.h;
                    return;
                }
                byArray = this.e;
                n8 = this.g;
                this.g = n8 + 1;
                byArray[n8] = (byte)(n9 & 0x7F | 0x80);
                ++this.h;
                n9 >>>= 7;
            }
        }

        final void h1(long l8) {
            long l9 = l8;
            if (d) {
                l9 = this.g;
                while (true) {
                    int n8;
                    byte[] byArray;
                    if ((l8 & 0xFFFFFFFFFFFFFF80L) == 0L) {
                        byArray = this.e;
                        n8 = this.g;
                        this.g = n8 + 1;
                        s0.H(byArray, n8, (byte)l8);
                        n8 = (int)((long)this.g - l9);
                        this.h += n8;
                        return;
                    }
                    byArray = this.e;
                    n8 = this.g;
                    this.g = n8 + 1;
                    s0.H(byArray, n8, (byte)((int)l8 & 0x7F | 0x80));
                    l8 >>>= 7;
                }
            }
            while (true) {
                int n9;
                byte[] byArray;
                if ((l9 & 0xFFFFFFFFFFFFFF80L) == 0L) {
                    byArray = this.e;
                    n9 = this.g;
                    this.g = n9 + 1;
                    byArray[n9] = (byte)l9;
                    ++this.h;
                    return;
                }
                byArray = this.e;
                n9 = this.g;
                this.g = n9 + 1;
                byArray[n9] = (byte)((int)l9 & 0x7F | 0x80);
                ++this.h;
                l9 >>>= 7;
            }
        }

        @Override
        public final int i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c
    extends k {
        private final byte[] e;
        private final int f;
        private final int g;
        private int h;

        c(byte[] byArray, int n8, int n9) {
            if (byArray != null) {
                int n10 = byArray.length;
                int n11 = n8 + n9;
                if ((n8 | n9 | n10 - n11) >= 0) {
                    this.e = byArray;
                    this.f = n8;
                    this.h = n8;
                    this.g = n11;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", byArray.length, n8, n9));
            }
            throw new NullPointerException("buffer");
        }

        @Override
        public final void E0(int n8, int n9) throws IOException {
            this.W0(n8, 0);
            this.F0(n9);
        }

        @Override
        public final void F0(int n8) throws IOException {
            if (n8 >= 0) {
                this.Y0(n8);
                return;
            }
            this.a1(n8);
        }

        @Override
        final void I0(int n8, S s8, h0 h02) throws IOException {
            this.W0(n8, 2);
            this.Y0(((a)s8).l(h02));
            h02.d(s8, this.a);
        }

        @Override
        public final void J0(S s8) throws IOException {
            this.Y0(s8.i());
            s8.f(this);
        }

        @Override
        public final void K0(int n8, S s8) throws IOException {
            this.W0(1, 3);
            this.X0(2, n8);
            this.c1(3, s8);
            this.W0(1, 4);
        }

        @Override
        public final void L0(int n8, h h8) throws IOException {
            this.W0(1, 3);
            this.X0(2, n8);
            this.o0(3, h8);
            this.W0(1, 4);
        }

        @Override
        public final void U0(int n8, String string) throws IOException {
            this.W0(n8, 2);
            this.V0(string);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public final void V0(String string) throws IOException {
            t0.d d82;
            int n8;
            block4: {
                n8 = this.h;
                try {
                    int n9 = k.X(string.length() * 3);
                    int n10 = k.X(string.length());
                    if (n10 == n9) {
                        this.h = n9 = n8 + n10;
                        n9 = t0.f(string, this.e, n9, this.i0());
                        this.h = n8;
                        this.Y0(n9 - n8 - n10);
                        this.h = n9;
                        return;
                    }
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw new d(indexOutOfBoundsException);
                }
                catch (t0.d d82) {
                    break block4;
                }
                this.Y0(t0.g(string));
                this.h = t0.f(string, this.e, this.h, this.i0());
                return;
            }
            this.h = n8;
            this.d0(string, d82);
        }

        @Override
        public final void W0(int n8, int n9) throws IOException {
            this.Y0(u0.c(n8, n9));
        }

        @Override
        public final void X0(int n8, int n9) throws IOException {
            this.W0(n8, 0);
            this.Y0(n9);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public final void Y0(int n8) throws IOException {
            int n9 = n8;
            if (d) {
                n9 = n8;
                if (!ax.r0.d.c()) {
                    n9 = n8;
                    if (this.i0() >= 5) {
                        if ((n8 & 0xFFFFFF80) == 0) {
                            byte[] byArray = this.e;
                            n9 = this.h;
                            this.h = 1 + n9;
                            s0.H(byArray, n9, (byte)n8);
                            return;
                        }
                        byte[] byArray = this.e;
                        n9 = this.h;
                        this.h = n9 + 1;
                        s0.H(byArray, n9, (byte)(n8 | 0x80));
                        n9 = n8 >>> 7;
                        if ((n9 & 0xFFFFFF80) == 0) {
                            byArray = this.e;
                            n8 = this.h;
                            this.h = 1 + n8;
                            s0.H(byArray, n8, (byte)n9);
                            return;
                        }
                        byArray = this.e;
                        int n10 = this.h;
                        this.h = n10 + 1;
                        s0.H(byArray, n10, (byte)(n9 | 0x80));
                        n9 = n8 >>> 14;
                        if ((n9 & 0xFFFFFF80) == 0) {
                            byArray = this.e;
                            n8 = this.h;
                            this.h = 1 + n8;
                            s0.H(byArray, n8, (byte)n9);
                            return;
                        }
                        byArray = this.e;
                        n10 = this.h;
                        this.h = n10 + 1;
                        s0.H(byArray, n10, (byte)(n9 | 0x80));
                        n9 = n8 >>> 21;
                        if ((n9 & 0xFFFFFF80) == 0) {
                            byArray = this.e;
                            n8 = this.h;
                            this.h = 1 + n8;
                            s0.H(byArray, n8, (byte)n9);
                            return;
                        }
                        byArray = this.e;
                        n10 = this.h;
                        this.h = n10 + 1;
                        s0.H(byArray, n10, (byte)(n9 | 0x80));
                        byArray = this.e;
                        n9 = this.h;
                        this.h = 1 + n9;
                        s0.H(byArray, n9, (byte)(n8 >>> 28));
                        return;
                    }
                }
            }
            while (true) {
                byte[] byArray;
                if ((n9 & 0xFFFFFF80) == 0) {
                    byArray = this.e;
                    n8 = this.h;
                    this.h = n8 + 1;
                    byArray[n8] = (byte)n9;
                    return;
                }
                try {
                    byArray = this.e;
                    n8 = this.h;
                    this.h = n8 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, 1), indexOutOfBoundsException);
                }
                byArray[n8] = (byte)(n9 & 0x7F | 0x80);
                n9 >>>= 7;
            }
        }

        @Override
        public final void Z0(int n8, long l8) throws IOException {
            this.W0(n8, 0);
            this.a1(l8);
        }

        @Override
        public final void a(byte[] byArray, int n8, int n9) throws IOException {
            this.b1(byArray, n8, n9);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public final void a1(long l8) throws IOException {
            long l9 = l8;
            if (d) {
                l9 = l8;
                if (this.i0() >= 10) {
                    while (true) {
                        int n8;
                        byte[] byArray;
                        if ((l8 & 0xFFFFFFFFFFFFFF80L) == 0L) {
                            byArray = this.e;
                            n8 = this.h;
                            this.h = 1 + n8;
                            s0.H(byArray, n8, (byte)l8);
                            return;
                        }
                        byArray = this.e;
                        n8 = this.h;
                        this.h = n8 + 1;
                        s0.H(byArray, n8, (byte)((int)l8 & 0x7F | 0x80));
                        l8 >>>= 7;
                    }
                }
            }
            while (true) {
                int n9;
                byte[] byArray;
                if ((l9 & 0xFFFFFFFFFFFFFF80L) == 0L) {
                    byArray = this.e;
                    n9 = this.h;
                    this.h = n9 + 1;
                    byArray[n9] = (byte)l9;
                    return;
                }
                try {
                    byArray = this.e;
                    n9 = this.h;
                    this.h = n9 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, 1), indexOutOfBoundsException);
                }
                byArray[n9] = (byte)((int)l9 & 0x7F | 0x80);
                l9 >>>= 7;
            }
        }

        public final void b1(byte[] byArray, int n8, int n9) throws IOException {
            try {
                System.arraycopy(byArray, n8, this.e, this.h, n9);
                this.h += n9;
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, n9), indexOutOfBoundsException);
            }
        }

        @Override
        public void c0() {
        }

        public final void c1(int n8, S s8) throws IOException {
            this.W0(n8, 2);
            this.J0(s8);
        }

        @Override
        public final int i0() {
            return this.g - this.h;
        }

        @Override
        public final void j0(byte by) throws IOException {
            try {
                byte[] byArray = this.e;
                int n8 = this.h;
                this.h = n8 + 1;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, 1), indexOutOfBoundsException);
            }
            byArray[n8] = by;
        }

        @Override
        public final void k0(int n8, boolean bl) throws IOException {
            this.W0(n8, 0);
            this.j0((byte)(bl ? 1 : 0));
        }

        @Override
        public final void n0(byte[] byArray, int n8, int n9) throws IOException {
            this.Y0(n9);
            this.b1(byArray, n8, n9);
        }

        @Override
        public final void o0(int n8, h h8) throws IOException {
            this.W0(n8, 2);
            this.p0(h8);
        }

        @Override
        public final void p0(h h8) throws IOException {
            this.Y0(h8.size());
            h8.I(this);
        }

        @Override
        public final void u0(int n8, int n9) throws IOException {
            this.W0(n8, 5);
            this.v0(n9);
        }

        @Override
        public final void v0(int n8) throws IOException {
            int n9;
            int n10;
            try {
                byte[] byArray = this.e;
                n10 = this.h;
                n9 = n10 + 1;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, 1), indexOutOfBoundsException);
            }
            this.h = n9;
            byArray[n10] = (byte)(n8 & 0xFF);
            int n11 = n10 + 2;
            this.h = n11;
            byArray[n9] = (byte)(n8 >> 8 & 0xFF);
            n9 = n10 + 3;
            this.h = n9;
            byArray[n11] = (byte)(n8 >> 16 & 0xFF);
            this.h = n10 + 4;
            byArray[n9] = (byte)(n8 >> 24 & 0xFF);
        }

        @Override
        public final void w0(int n8, long l8) throws IOException {
            this.W0(n8, 1);
            this.x0(l8);
        }

        @Override
        public final void x0(long l8) throws IOException {
            int n8;
            int n9;
            try {
                byte[] byArray = this.e;
                n9 = this.h;
                n8 = n9 + 1;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, 1), indexOutOfBoundsException);
            }
            this.h = n8;
            byArray[n9] = (byte)((int)l8 & 0xFF);
            int n10 = n9 + 2;
            this.h = n10;
            byArray[n8] = (byte)((int)(l8 >> 8) & 0xFF);
            n8 = n9 + 3;
            this.h = n8;
            byArray[n10] = (byte)((int)(l8 >> 16) & 0xFF);
            n10 = n9 + 4;
            this.h = n10;
            byArray[n8] = (byte)((int)(l8 >> 24) & 0xFF);
            n8 = n9 + 5;
            this.h = n8;
            byArray[n10] = (byte)((int)(l8 >> 32) & 0xFF);
            n10 = n9 + 6;
            this.h = n10;
            byArray[n8] = (byte)((int)(l8 >> 40) & 0xFF);
            n8 = n9 + 7;
            this.h = n8;
            byArray[n10] = (byte)((int)(l8 >> 48) & 0xFF);
            this.h = n9 + 8;
            byArray[n8] = (byte)((int)(l8 >> 56) & 0xFF);
        }
    }

    public static class d
    extends IOException {
        d(String string, Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            stringBuilder.append(string);
            super(stringBuilder.toString(), throwable);
        }

        d(Throwable throwable) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
        }
    }

    private static final class e
    extends b {
        private final OutputStream i;

        e(OutputStream outputStream, int n8) {
            super(n8);
            if (outputStream != null) {
                this.i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private void i1() throws IOException {
            this.i.write(this.e, 0, this.g);
            this.g = 0;
        }

        private void j1(int n8) throws IOException {
            if (this.f - this.g < n8) {
                this.i1();
            }
        }

        @Override
        public void E0(int n8, int n9) throws IOException {
            this.j1(20);
            this.f1(n8, 0);
            this.e1(n9);
        }

        @Override
        public void F0(int n8) throws IOException {
            if (n8 >= 0) {
                this.Y0(n8);
                return;
            }
            this.a1(n8);
        }

        @Override
        void I0(int n8, S s8, h0 h02) throws IOException {
            this.W0(n8, 2);
            this.m1(s8, h02);
        }

        @Override
        public void J0(S s8) throws IOException {
            this.Y0(s8.i());
            s8.f(this);
        }

        @Override
        public void K0(int n8, S s8) throws IOException {
            this.W0(1, 3);
            this.X0(2, n8);
            this.l1(3, s8);
            this.W0(1, 4);
        }

        @Override
        public void L0(int n8, h h8) throws IOException {
            this.W0(1, 3);
            this.X0(2, n8);
            this.o0(3, h8);
            this.W0(1, 4);
        }

        @Override
        public void U0(int n8, String string) throws IOException {
            this.W0(n8, 2);
            this.V0(string);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void V0(String string) throws IOException {
            t0.d d82;
            block13: {
                t0.d d92;
                int n8;
                block12: {
                    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2;
                    block11: {
                        int n9;
                        block10: {
                            block9: {
                                int n10;
                                int n11;
                                try {
                                    n8 = string.length() * 3;
                                    n9 = k.X(n8);
                                    n11 = n9 + n8;
                                    n10 = this.f;
                                    if (n11 > n10) {
                                        byte[] byArray = new byte[n8];
                                        n9 = t0.f(string, byArray, 0, n8);
                                        this.Y0(n9);
                                        this.a(byArray, 0, n9);
                                        return;
                                    }
                                    if (n11 > n10 - this.g) {
                                        this.i1();
                                    }
                                    n11 = k.X(string.length());
                                    n8 = this.g;
                                    if (n11 != n9) break block9;
                                    n9 = n8 + n11;
                                }
                                catch (t0.d d82) {}
                                try {
                                    this.g = n9;
                                    n10 = t0.f(string, this.e, n9, this.f - n9);
                                    this.g = n8;
                                    n9 = n10 - n8 - n11;
                                    this.g1(n9);
                                    this.g = n10;
                                    break block10;
                                }
                                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {
                                    break block11;
                                }
                                catch (t0.d d92) {
                                    break block12;
                                }
                            }
                            n9 = t0.g(string);
                            this.g1(n9);
                            this.g = t0.f(string, this.e, this.g, n9);
                        }
                        this.h += n9;
                        return;
                    }
                    d d10 = new d(arrayIndexOutOfBoundsException2);
                    throw d10;
                    break block13;
                }
                this.h -= this.g - n8;
                this.g = n8;
                throw d92;
            }
            this.d0(string, d82);
        }

        @Override
        public void W0(int n8, int n9) throws IOException {
            this.Y0(u0.c(n8, n9));
        }

        @Override
        public void X0(int n8, int n9) throws IOException {
            this.j1(20);
            this.f1(n8, 0);
            this.g1(n9);
        }

        @Override
        public void Y0(int n8) throws IOException {
            this.j1(5);
            this.g1(n8);
        }

        @Override
        public void Z0(int n8, long l8) throws IOException {
            this.j1(20);
            this.f1(n8, 0);
            this.h1(l8);
        }

        @Override
        public void a(byte[] byArray, int n8, int n9) throws IOException {
            this.k1(byArray, n8, n9);
        }

        @Override
        public void a1(long l8) throws IOException {
            this.j1(10);
            this.h1(l8);
        }

        @Override
        public void c0() throws IOException {
            if (this.g > 0) {
                this.i1();
            }
        }

        @Override
        public void j0(byte by) throws IOException {
            if (this.g == this.f) {
                this.i1();
            }
            this.b1(by);
        }

        @Override
        public void k0(int n8, boolean bl) throws IOException {
            this.j1(11);
            this.f1(n8, 0);
            this.b1((byte)(bl ? 1 : 0));
        }

        public void k1(byte[] byArray, int n8, int n9) throws IOException {
            int n10 = this.f;
            int n11 = this.g;
            if (n10 - n11 >= n9) {
                System.arraycopy(byArray, n8, this.e, n11, n9);
                this.g += n9;
                this.h += n9;
                return;
            }
            System.arraycopy(byArray, n8, this.e, n11, n10 -= n11);
            n8 += n10;
            this.g = this.f;
            this.h += n10;
            this.i1();
            if ((n9 -= n10) <= this.f) {
                System.arraycopy(byArray, n8, this.e, 0, n9);
                this.g = n9;
            } else {
                this.i.write(byArray, n8, n9);
            }
            this.h += n9;
        }

        public void l1(int n8, S s8) throws IOException {
            this.W0(n8, 2);
            this.J0(s8);
        }

        void m1(S s8, h0 h02) throws IOException {
            this.Y0(((a)s8).l(h02));
            h02.d(s8, this.a);
        }

        @Override
        public void n0(byte[] byArray, int n8, int n9) throws IOException {
            this.Y0(n9);
            this.k1(byArray, n8, n9);
        }

        @Override
        public void o0(int n8, h h8) throws IOException {
            this.W0(n8, 2);
            this.p0(h8);
        }

        @Override
        public void p0(h h8) throws IOException {
            this.Y0(h8.size());
            h8.I(this);
        }

        @Override
        public void u0(int n8, int n9) throws IOException {
            this.j1(14);
            this.f1(n8, 5);
            this.c1(n9);
        }

        @Override
        public void v0(int n8) throws IOException {
            this.j1(4);
            this.c1(n8);
        }

        @Override
        public void w0(int n8, long l8) throws IOException {
            this.j1(18);
            this.f1(n8, 1);
            this.d1(l8);
        }

        @Override
        public void x0(long l8) throws IOException {
            this.j1(8);
            this.d1(l8);
        }
    }
}

