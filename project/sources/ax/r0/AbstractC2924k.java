package ax.r0;

import ax.r0.t0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ax.r0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2924k extends AbstractC2920g {
    private static final Logger c = Logger.getLogger(AbstractC2924k.class.getName());
    private static final boolean d = s0.C();
    C2925l a;
    private boolean b;

    /* renamed from: ax.r0.k$b */
    private static abstract class b extends AbstractC2924k {
        final byte[] e;
        final int f;
        int g;
        int h;

        b(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.e = bArr;
            this.f = bArr.length;
        }

        final void b1(byte b) {
            byte[] bArr = this.e;
            int i = this.g;
            this.g = i + 1;
            bArr[i] = b;
            this.h++;
        }

        final void c1(int i) {
            byte[] bArr = this.e;
            int i2 = this.g;
            int i3 = i2 + 1;
            this.g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.g = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.h += 4;
        }

        final void d1(long j) {
            byte[] bArr = this.e;
            int i = this.g;
            int i2 = i + 1;
            this.g = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.g = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.g = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.g = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.g = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.h += 8;
        }

        final void e1(int i) {
            if (i >= 0) {
                g1(i);
            } else {
                h1(i);
            }
        }

        final void f1(int i, int i2) {
            g1(u0.c(i, i2));
        }

        final void g1(int i) {
            if (!AbstractC2924k.d) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    this.h++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr2[i3] = (byte) i;
                this.h++;
                return;
            }
            long j = this.g;
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                s0.H(bArr3, i4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i5 = this.g;
            this.g = i5 + 1;
            s0.H(bArr4, i5, (byte) i);
            this.h += (int) (this.g - j);
        }

        final void h1(long j) {
            if (!AbstractC2924k.d) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    this.h++;
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr2[i2] = (byte) j;
                this.h++;
                return;
            }
            long j2 = this.g;
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                s0.H(bArr3, i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i4 = this.g;
            this.g = i4 + 1;
            s0.H(bArr4, i4, (byte) j);
            this.h += (int) (this.g - j2);
        }

        @Override // ax.r0.AbstractC2924k
        public final int i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* renamed from: ax.r0.k$d */
    public static class d extends IOException {
        d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: ax.r0.k$e */
    private static final class e extends b {
        private final OutputStream i;

        e(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.i = outputStream;
        }

        private void i1() throws IOException {
            this.i.write(this.e, 0, this.g);
            this.g = 0;
        }

        private void j1(int i) throws IOException {
            if (this.f - this.g < i) {
                i1();
            }
        }

        @Override // ax.r0.AbstractC2924k
        public void E0(int i, int i2) throws IOException {
            j1(20);
            f1(i, 0);
            e1(i2);
        }

        @Override // ax.r0.AbstractC2924k
        public void F0(int i) throws IOException {
            if (i >= 0) {
                Y0(i);
            } else {
                a1(i);
            }
        }

        @Override // ax.r0.AbstractC2924k
        void I0(int i, S s, h0 h0Var) throws IOException {
            W0(i, 2);
            m1(s, h0Var);
        }

        @Override // ax.r0.AbstractC2924k
        public void J0(S s) throws IOException {
            Y0(s.i());
            s.f(this);
        }

        @Override // ax.r0.AbstractC2924k
        public void K0(int i, S s) throws IOException {
            W0(1, 3);
            X0(2, i);
            l1(3, s);
            W0(1, 4);
        }

        @Override // ax.r0.AbstractC2924k
        public void L0(int i, AbstractC2921h abstractC2921h) throws IOException {
            W0(1, 3);
            X0(2, i);
            o0(3, abstractC2921h);
            W0(1, 4);
        }

        @Override // ax.r0.AbstractC2924k
        public void U0(int i, String str) throws IOException {
            W0(i, 2);
            V0(str);
        }

        @Override // ax.r0.AbstractC2924k
        public void V0(String str) throws IOException {
            int g;
            try {
                int length = str.length() * 3;
                int X = AbstractC2924k.X(length);
                int i = X + length;
                int i2 = this.f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int f = t0.f(str, bArr, 0, length);
                    Y0(f);
                    a(bArr, 0, f);
                    return;
                }
                if (i > i2 - this.g) {
                    i1();
                }
                int X2 = AbstractC2924k.X(str.length());
                int i3 = this.g;
                try {
                    if (X2 == X) {
                        int i4 = i3 + X2;
                        this.g = i4;
                        int f2 = t0.f(str, this.e, i4, this.f - i4);
                        this.g = i3;
                        g = (f2 - i3) - X2;
                        g1(g);
                        this.g = f2;
                    } else {
                        g = t0.g(str);
                        g1(g);
                        this.g = t0.f(str, this.e, this.g, g);
                    }
                    this.h += g;
                } catch (t0.d e) {
                    this.h -= this.g - i3;
                    this.g = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new d(e2);
                }
            } catch (t0.d e3) {
                d0(str, e3);
            }
        }

        @Override // ax.r0.AbstractC2924k
        public void W0(int i, int i2) throws IOException {
            Y0(u0.c(i, i2));
        }

        @Override // ax.r0.AbstractC2924k
        public void X0(int i, int i2) throws IOException {
            j1(20);
            f1(i, 0);
            g1(i2);
        }

        @Override // ax.r0.AbstractC2924k
        public void Y0(int i) throws IOException {
            j1(5);
            g1(i);
        }

        @Override // ax.r0.AbstractC2924k
        public void Z0(int i, long j) throws IOException {
            j1(20);
            f1(i, 0);
            h1(j);
        }

        @Override // ax.r0.AbstractC2924k, ax.r0.AbstractC2920g
        public void a(byte[] bArr, int i, int i2) throws IOException {
            k1(bArr, i, i2);
        }

        @Override // ax.r0.AbstractC2924k
        public void a1(long j) throws IOException {
            j1(10);
            h1(j);
        }

        @Override // ax.r0.AbstractC2924k
        public void c0() throws IOException {
            if (this.g > 0) {
                i1();
            }
        }

        @Override // ax.r0.AbstractC2924k
        public void j0(byte b) throws IOException {
            if (this.g == this.f) {
                i1();
            }
            b1(b);
        }

        @Override // ax.r0.AbstractC2924k
        public void k0(int i, boolean z) throws IOException {
            j1(11);
            f1(i, 0);
            b1(z ? (byte) 1 : (byte) 0);
        }

        public void k1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f;
            int i4 = this.g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.e, i4, i2);
                this.g += i2;
                this.h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.g = this.f;
            this.h += i5;
            i1();
            if (i7 <= this.f) {
                System.arraycopy(bArr, i6, this.e, 0, i7);
                this.g = i7;
            } else {
                this.i.write(bArr, i6, i7);
            }
            this.h += i7;
        }

        public void l1(int i, S s) throws IOException {
            W0(i, 2);
            J0(s);
        }

        void m1(S s, h0 h0Var) throws IOException {
            Y0(((AbstractC2914a) s).l(h0Var));
            h0Var.d(s, this.a);
        }

        @Override // ax.r0.AbstractC2924k
        public void n0(byte[] bArr, int i, int i2) throws IOException {
            Y0(i2);
            k1(bArr, i, i2);
        }

        @Override // ax.r0.AbstractC2924k
        public void o0(int i, AbstractC2921h abstractC2921h) throws IOException {
            W0(i, 2);
            p0(abstractC2921h);
        }

        @Override // ax.r0.AbstractC2924k
        public void p0(AbstractC2921h abstractC2921h) throws IOException {
            Y0(abstractC2921h.size());
            abstractC2921h.I(this);
        }

        @Override // ax.r0.AbstractC2924k
        public void u0(int i, int i2) throws IOException {
            j1(14);
            f1(i, 5);
            c1(i2);
        }

        @Override // ax.r0.AbstractC2924k
        public void v0(int i) throws IOException {
            j1(4);
            c1(i);
        }

        @Override // ax.r0.AbstractC2924k
        public void w0(int i, long j) throws IOException {
            j1(18);
            f1(i, 1);
            d1(j);
        }

        @Override // ax.r0.AbstractC2924k
        public void x0(long j) throws IOException {
            j1(8);
            d1(j);
        }
    }

    public static int A(int i, C2908E c2908e) {
        return V(i) + B(c2908e);
    }

    public static int B(C2908E c2908e) {
        return C(c2908e.b());
    }

    static int C(int i) {
        return X(i) + i;
    }

    public static int D(int i, S s) {
        return (V(1) * 2) + W(2, i) + E(3, s);
    }

    public static int E(int i, S s) {
        return V(i) + G(s);
    }

    static int F(int i, S s, h0 h0Var) {
        return V(i) + H(s, h0Var);
    }

    public static int G(S s) {
        return C(s.i());
    }

    static int H(S s, h0 h0Var) {
        return C(((AbstractC2914a) s).l(h0Var));
    }

    static int I(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int J(int i, AbstractC2921h abstractC2921h) {
        return (V(1) * 2) + W(2, i) + g(3, abstractC2921h);
    }

    @Deprecated
    public static int K(int i) {
        return X(i);
    }

    public static int L(int i, int i2) {
        return V(i) + M(i2);
    }

    public static int M(int i) {
        return 4;
    }

    public static int N(int i, long j) {
        return V(i) + O(j);
    }

    public static int O(long j) {
        return 8;
    }

    public static int P(int i, int i2) {
        return V(i) + Q(i2);
    }

    public static int Q(int i) {
        return X(a0(i));
    }

    public static int R(int i, long j) {
        return V(i) + S(j);
    }

    public static int S(long j) {
        return Z(b0(j));
    }

    public static int T(int i, String str) {
        return V(i) + U(str);
    }

    public static int U(String str) {
        int length;
        try {
            length = t0.g(str);
        } catch (t0.d unused) {
            length = str.getBytes(C2904A.a).length;
        }
        return C(length);
    }

    public static int V(int i) {
        return X(u0.c(i, 0));
    }

    public static int W(int i, int i2) {
        return V(i) + X(i2);
    }

    public static int X(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int Y(int i, long j) {
        return V(i) + Z(j);
    }

    public static int Z(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int a0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long b0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int d(int i, boolean z) {
        return V(i) + e(z);
    }

    public static int e(boolean z) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static AbstractC2924k f0(OutputStream outputStream, int i) {
        return new e(outputStream, i);
    }

    public static int g(int i, AbstractC2921h abstractC2921h) {
        return V(i) + h(abstractC2921h);
    }

    public static AbstractC2924k g0(byte[] bArr) {
        return h0(bArr, 0, bArr.length);
    }

    public static int h(AbstractC2921h abstractC2921h) {
        return C(abstractC2921h.size());
    }

    public static AbstractC2924k h0(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    public static int i(int i, double d2) {
        return V(i) + j(d2);
    }

    public static int j(double d2) {
        return 8;
    }

    public static int k(int i, int i2) {
        return V(i) + l(i2);
    }

    public static int l(int i) {
        return w(i);
    }

    public static int m(int i, int i2) {
        return V(i) + n(i2);
    }

    public static int n(int i) {
        return 4;
    }

    public static int o(int i, long j) {
        return V(i) + p(j);
    }

    public static int p(long j) {
        return 8;
    }

    public static int q(int i, float f) {
        return V(i) + r(f);
    }

    public static int r(float f) {
        return 4;
    }

    @Deprecated
    static int s(int i, S s, h0 h0Var) {
        return (V(i) * 2) + u(s, h0Var);
    }

    @Deprecated
    public static int t(S s) {
        return s.i();
    }

    @Deprecated
    static int u(S s, h0 h0Var) {
        return ((AbstractC2914a) s).l(h0Var);
    }

    public static int v(int i, int i2) {
        return V(i) + w(i2);
    }

    public static int w(int i) {
        if (i >= 0) {
            return X(i);
        }
        return 10;
    }

    public static int x(int i, long j) {
        return V(i) + y(j);
    }

    public static int y(long j) {
        return Z(j);
    }

    public static int z(int i, C2908E c2908e) {
        return (V(1) * 2) + W(2, i) + A(3, c2908e);
    }

    @Deprecated
    public final void A0(int i, S s) throws IOException {
        W0(i, 3);
        C0(s);
        W0(i, 4);
    }

    @Deprecated
    final void B0(int i, S s, h0 h0Var) throws IOException {
        W0(i, 3);
        D0(s, h0Var);
        W0(i, 4);
    }

    @Deprecated
    public final void C0(S s) throws IOException {
        s.f(this);
    }

    @Deprecated
    final void D0(S s, h0 h0Var) throws IOException {
        h0Var.d(s, this.a);
    }

    public abstract void E0(int i, int i2) throws IOException;

    public abstract void F0(int i) throws IOException;

    public final void G0(int i, long j) throws IOException {
        Z0(i, j);
    }

    public final void H0(long j) throws IOException {
        a1(j);
    }

    abstract void I0(int i, S s, h0 h0Var) throws IOException;

    public abstract void J0(S s) throws IOException;

    public abstract void K0(int i, S s) throws IOException;

    public abstract void L0(int i, AbstractC2921h abstractC2921h) throws IOException;

    public final void M0(int i, int i2) throws IOException {
        u0(i, i2);
    }

    public final void N0(int i) throws IOException {
        v0(i);
    }

    public final void O0(int i, long j) throws IOException {
        w0(i, j);
    }

    public final void P0(long j) throws IOException {
        x0(j);
    }

    public final void Q0(int i, int i2) throws IOException {
        X0(i, a0(i2));
    }

    public final void R0(int i) throws IOException {
        Y0(a0(i));
    }

    public final void S0(int i, long j) throws IOException {
        Z0(i, b0(j));
    }

    public final void T0(long j) throws IOException {
        a1(b0(j));
    }

    public abstract void U0(int i, String str) throws IOException;

    public abstract void V0(String str) throws IOException;

    public abstract void W0(int i, int i2) throws IOException;

    public abstract void X0(int i, int i2) throws IOException;

    public abstract void Y0(int i) throws IOException;

    public abstract void Z0(int i, long j) throws IOException;

    @Override // ax.r0.AbstractC2920g
    public abstract void a(byte[] bArr, int i, int i2) throws IOException;

    public abstract void a1(long j) throws IOException;

    public final void c() {
        if (i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void c0() throws IOException;

    final void d0(String str, t0.d dVar) throws IOException {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C2904A.a);
        try {
            Y0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (d e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new d(e3);
        }
    }

    boolean e0() {
        return this.b;
    }

    public abstract int i0();

    public abstract void j0(byte b2) throws IOException;

    public abstract void k0(int i, boolean z) throws IOException;

    public final void l0(boolean z) throws IOException {
        j0(z ? (byte) 1 : (byte) 0);
    }

    public final void m0(byte[] bArr) throws IOException {
        n0(bArr, 0, bArr.length);
    }

    abstract void n0(byte[] bArr, int i, int i2) throws IOException;

    public abstract void o0(int i, AbstractC2921h abstractC2921h) throws IOException;

    public abstract void p0(AbstractC2921h abstractC2921h) throws IOException;

    public final void q0(int i, double d2) throws IOException {
        w0(i, Double.doubleToRawLongBits(d2));
    }

    public final void r0(double d2) throws IOException {
        x0(Double.doubleToRawLongBits(d2));
    }

    public final void s0(int i, int i2) throws IOException {
        E0(i, i2);
    }

    public final void t0(int i) throws IOException {
        F0(i);
    }

    public abstract void u0(int i, int i2) throws IOException;

    public abstract void v0(int i) throws IOException;

    public abstract void w0(int i, long j) throws IOException;

    public abstract void x0(long j) throws IOException;

    public final void y0(int i, float f) throws IOException {
        u0(i, Float.floatToRawIntBits(f));
    }

    public final void z0(float f) throws IOException {
        v0(Float.floatToRawIntBits(f));
    }

    private AbstractC2924k() {
    }

    /* renamed from: ax.r0.k$c */
    private static class c extends AbstractC2924k {
        private final byte[] e;
        private final int f;
        private final int g;
        private int h;

        c(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.e = bArr;
            this.f = i;
            this.h = i;
            this.g = i3;
        }

        @Override // ax.r0.AbstractC2924k
        public final void E0(int i, int i2) throws IOException {
            W0(i, 0);
            F0(i2);
        }

        @Override // ax.r0.AbstractC2924k
        public final void F0(int i) throws IOException {
            if (i >= 0) {
                Y0(i);
            } else {
                a1(i);
            }
        }

        @Override // ax.r0.AbstractC2924k
        final void I0(int i, S s, h0 h0Var) throws IOException {
            W0(i, 2);
            Y0(((AbstractC2914a) s).l(h0Var));
            h0Var.d(s, this.a);
        }

        @Override // ax.r0.AbstractC2924k
        public final void J0(S s) throws IOException {
            Y0(s.i());
            s.f(this);
        }

        @Override // ax.r0.AbstractC2924k
        public final void K0(int i, S s) throws IOException {
            W0(1, 3);
            X0(2, i);
            c1(3, s);
            W0(1, 4);
        }

        @Override // ax.r0.AbstractC2924k
        public final void L0(int i, AbstractC2921h abstractC2921h) throws IOException {
            W0(1, 3);
            X0(2, i);
            o0(3, abstractC2921h);
            W0(1, 4);
        }

        @Override // ax.r0.AbstractC2924k
        public final void U0(int i, String str) throws IOException {
            W0(i, 2);
            V0(str);
        }

        @Override // ax.r0.AbstractC2924k
        public final void V0(String str) throws IOException {
            int i = this.h;
            try {
                int X = AbstractC2924k.X(str.length() * 3);
                int X2 = AbstractC2924k.X(str.length());
                if (X2 != X) {
                    Y0(t0.g(str));
                    this.h = t0.f(str, this.e, this.h, i0());
                    return;
                }
                int i2 = i + X2;
                this.h = i2;
                int f = t0.f(str, this.e, i2, i0());
                this.h = i;
                Y0((f - i) - X2);
                this.h = f;
            } catch (t0.d e) {
                this.h = i;
                d0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new d(e2);
            }
        }

        @Override // ax.r0.AbstractC2924k
        public final void W0(int i, int i2) throws IOException {
            Y0(u0.c(i, i2));
        }

        @Override // ax.r0.AbstractC2924k
        public final void X0(int i, int i2) throws IOException {
            W0(i, 0);
            Y0(i2);
        }

        @Override // ax.r0.AbstractC2924k
        public final void Y0(int i) throws IOException {
            if (!AbstractC2924k.d || C2917d.c() || i0() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.e;
                        int i2 = this.h;
                        this.h = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                    }
                }
                byte[] bArr2 = this.e;
                int i3 = this.h;
                this.h = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.e;
                int i4 = this.h;
                this.h = 1 + i4;
                s0.H(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.e;
            int i5 = this.h;
            this.h = i5 + 1;
            s0.H(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.e;
                int i7 = this.h;
                this.h = 1 + i7;
                s0.H(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.e;
            int i8 = this.h;
            this.h = i8 + 1;
            s0.H(bArr6, i8, (byte) (i6 | 128));
            int i9 = i >>> 14;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.e;
                int i10 = this.h;
                this.h = 1 + i10;
                s0.H(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.e;
            int i11 = this.h;
            this.h = i11 + 1;
            s0.H(bArr8, i11, (byte) (i9 | 128));
            int i12 = i >>> 21;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.e;
                int i13 = this.h;
                this.h = 1 + i13;
                s0.H(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.e;
            int i14 = this.h;
            this.h = i14 + 1;
            s0.H(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.e;
            int i15 = this.h;
            this.h = 1 + i15;
            s0.H(bArr11, i15, (byte) (i >>> 28));
        }

        @Override // ax.r0.AbstractC2924k
        public final void Z0(int i, long j) throws IOException {
            W0(i, 0);
            a1(j);
        }

        @Override // ax.r0.AbstractC2924k, ax.r0.AbstractC2920g
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            b1(bArr, i, i2);
        }

        @Override // ax.r0.AbstractC2924k
        public final void a1(long j) throws IOException {
            if (AbstractC2924k.d && i0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.h;
                    this.h = i + 1;
                    s0.H(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.h;
                this.h = 1 + i2;
                s0.H(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.e;
                    int i3 = this.h;
                    this.h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                }
            }
            byte[] bArr4 = this.e;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        public final void b1(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.e, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        public final void c1(int i, S s) throws IOException {
            W0(i, 2);
            J0(s);
        }

        @Override // ax.r0.AbstractC2924k
        public final int i0() {
            return this.g - this.h;
        }

        @Override // ax.r0.AbstractC2924k
        public final void j0(byte b) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // ax.r0.AbstractC2924k
        public final void k0(int i, boolean z) throws IOException {
            W0(i, 0);
            j0(z ? (byte) 1 : (byte) 0);
        }

        @Override // ax.r0.AbstractC2924k
        public final void n0(byte[] bArr, int i, int i2) throws IOException {
            Y0(i2);
            b1(bArr, i, i2);
        }

        @Override // ax.r0.AbstractC2924k
        public final void o0(int i, AbstractC2921h abstractC2921h) throws IOException {
            W0(i, 2);
            p0(abstractC2921h);
        }

        @Override // ax.r0.AbstractC2924k
        public final void p0(AbstractC2921h abstractC2921h) throws IOException {
            Y0(abstractC2921h.size());
            abstractC2921h.I(this);
        }

        @Override // ax.r0.AbstractC2924k
        public final void u0(int i, int i2) throws IOException {
            W0(i, 5);
            v0(i2);
        }

        @Override // ax.r0.AbstractC2924k
        public final void v0(int i) throws IOException {
            try {
                byte[] bArr = this.e;
                int i2 = this.h;
                int i3 = i2 + 1;
                this.h = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.h = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.h = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.h = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // ax.r0.AbstractC2924k
        public final void w0(int i, long j) throws IOException {
            W0(i, 1);
            x0(j);
        }

        @Override // ax.r0.AbstractC2924k
        public final void x0(long j) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                int i2 = i + 1;
                this.h = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.h = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.h = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.h = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.h = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.h = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.h = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.h = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // ax.r0.AbstractC2924k
        public void c0() {
        }
    }
}
