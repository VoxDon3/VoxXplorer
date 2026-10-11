package ax.b6;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class S3 extends AbstractC1702x3 {
    private static final Logger b = Logger.getLogger(S3.class.getName());
    private static final boolean c = H5.w();
    V3 a;

    private static class a extends S3 {
        private final byte[] d;
        private final int e;
        private int f;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i2) | i2) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.d = bArr;
            this.f = 0;
            this.e = i2;
        }

        private final void E0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.f, i2);
                this.f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
            }
        }

        @Override // ax.b6.S3
        public final void L(int i) throws IOException {
            if (i >= 0) {
                Y(i);
            } else {
                R(i);
            }
        }

        @Override // ax.b6.S3
        public final void O(int i, int i2) throws IOException {
            Z(i, 0);
            L(i2);
        }

        @Override // ax.b6.S3
        public final void P(int i, long j) throws IOException {
            Z(i, 0);
            R(j);
        }

        @Override // ax.b6.S3
        public final void Q(int i, B3 b3) throws IOException {
            Z(1, 3);
            f0(2, i);
            p(3, b3);
            Z(1, 4);
        }

        @Override // ax.b6.S3
        public final void R(long j) throws IOException {
            if (S3.c && b() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.d;
                    int i = this.f;
                    this.f = i + 1;
                    H5.m(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.d;
                int i2 = this.f;
                this.f = 1 + i2;
                H5.m(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.d;
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bArr3[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            byte[] bArr4 = this.d;
            int i4 = this.f;
            this.f = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // ax.b6.S3
        public final void Y(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.d;
                    int i2 = this.f;
                    this.f = i2 + 1;
                    bArr[i2] = (byte) (i | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            byte[] bArr2 = this.d;
            int i3 = this.f;
            this.f = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // ax.b6.S3
        public final void Z(int i, int i2) throws IOException {
            Y((i << 3) | i2);
        }

        @Override // ax.b6.AbstractC1702x3
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            E0(bArr, i, i2);
        }

        @Override // ax.b6.S3
        public final int b() {
            return this.e - this.f;
        }

        @Override // ax.b6.S3
        public final void f0(int i, int i2) throws IOException {
            Z(i, 0);
            Y(i2);
        }

        @Override // ax.b6.S3
        public final void l(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // ax.b6.S3
        public final void m(int i) throws IOException {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                int i3 = i2 + 1;
                this.f = i3;
                bArr[i2] = (byte) i;
                int i4 = i2 + 2;
                this.f = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i2 + 3;
                this.f = i5;
                bArr[i4] = (byte) (i >> 16);
                this.f = i2 + 4;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // ax.b6.S3
        public final void n(int i, int i2) throws IOException {
            Z(i, 5);
            m(i2);
        }

        @Override // ax.b6.S3
        public final void o(int i, long j) throws IOException {
            Z(i, 1);
            u(j);
        }

        @Override // ax.b6.S3
        public final void p(int i, B3 b3) throws IOException {
            Z(i, 2);
            v(b3);
        }

        @Override // ax.b6.S3
        public final void q(int i, U4 u4) throws IOException {
            Z(1, 3);
            f0(2, i);
            Z(3, 2);
            w(u4);
            Z(1, 4);
        }

        @Override // ax.b6.S3
        final void r(int i, U4 u4, InterfaceC1609l5 interfaceC1609l5) throws IOException {
            Z(i, 2);
            Y(((AbstractC1647q3) u4).e(interfaceC1609l5));
            interfaceC1609l5.c(u4, this.a);
        }

        @Override // ax.b6.S3
        public final void s(int i, String str) throws IOException {
            Z(i, 2);
            x(str);
        }

        @Override // ax.b6.S3
        public final void t(int i, boolean z) throws IOException {
            Z(i, 0);
            l(z ? (byte) 1 : (byte) 0);
        }

        @Override // ax.b6.S3
        public final void u(long j) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                int i2 = i + 1;
                this.f = i2;
                bArr[i] = (byte) j;
                int i3 = i + 2;
                this.f = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i + 3;
                this.f = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i + 4;
                this.f = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i + 5;
                this.f = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i + 6;
                this.f = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i + 7;
                this.f = i8;
                bArr[i7] = (byte) (j >> 48);
                this.f = i + 8;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // ax.b6.S3
        public final void v(B3 b3) throws IOException {
            Y(b3.s());
            b3.q(this);
        }

        @Override // ax.b6.S3
        public final void w(U4 u4) throws IOException {
            Y(u4.d());
            u4.i(this);
        }

        @Override // ax.b6.S3
        public final void x(String str) throws IOException {
            int i = this.f;
            try {
                int z0 = S3.z0(str.length() * 3);
                int z02 = S3.z0(str.length());
                if (z02 != z0) {
                    Y(L5.a(str));
                    this.f = L5.b(str, this.d, this.f, b());
                    return;
                }
                int i2 = i + z02;
                this.f = i2;
                int b = L5.b(str, this.d, i2, b());
                this.f = i;
                Y((b - i) - z02);
                this.f = b;
            } catch (P5 e) {
                this.f = i;
                y(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(e2);
            }
        }
    }

    public static class b extends IOException {
        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        b(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int A(int i, U4 u4) {
        return (z0(8) << 1) + A0(2, i) + z0(24) + X(u4);
    }

    public static int A0(int i, int i2) {
        return z0(i << 3) + z0(i2);
    }

    @Deprecated
    static int B(int i, U4 u4, InterfaceC1609l5 interfaceC1609l5) {
        return (z0(i << 3) << 1) + ((AbstractC1647q3) u4).e(interfaceC1609l5);
    }

    public static int C(int i, String str) {
        return z0(i << 3) + G(str);
    }

    public static int D(int i, boolean z) {
        return z0(i << 3) + 1;
    }

    private static int D0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int E(B3 b3) {
        int s = b3.s();
        return z0(s) + s;
    }

    @Deprecated
    public static int F(U4 u4) {
        return u4.d();
    }

    public static int G(String str) {
        int length;
        try {
            length = L5.a(str);
        } catch (P5 unused) {
            length = str.getBytes(C1616m4.a).length;
        }
        return z0(length) + length;
    }

    public static S3 H(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int T(int i, long j) {
        return z0(i << 3) + 8;
    }

    public static int U(int i, B3 b3) {
        int z0 = z0(i << 3);
        int s = b3.s();
        return z0 + z0(s) + s;
    }

    static int V(int i, U4 u4, InterfaceC1609l5 interfaceC1609l5) {
        return z0(i << 3) + i(u4, interfaceC1609l5);
    }

    public static int W(long j) {
        return 8;
    }

    public static int X(U4 u4) {
        int d = u4.d();
        return z0(d) + d;
    }

    public static int b0(int i) {
        return r0(i);
    }

    public static int c(double d) {
        return 8;
    }

    public static int c0(int i, long j) {
        return z0(i << 3) + r0(j);
    }

    public static int d(float f) {
        return 4;
    }

    public static int d0(int i, B3 b3) {
        return (z0(8) << 1) + A0(2, i) + U(3, b3);
    }

    public static int e(int i, double d) {
        return z0(i << 3) + 8;
    }

    public static int e0(long j) {
        return r0(j);
    }

    public static int f(int i, float f) {
        return z0(i << 3) + 4;
    }

    public static int g(int i, C4 c4) {
        return (z0(8) << 1) + A0(2, i) + z(3, c4);
    }

    public static int g0(int i) {
        return 4;
    }

    public static int h(C4 c4) {
        int a2 = c4.a();
        return z0(a2) + a2;
    }

    public static int h0(int i, int i2) {
        return z0(i << 3) + r0(i2);
    }

    static int i(U4 u4, InterfaceC1609l5 interfaceC1609l5) {
        int e = ((AbstractC1647q3) u4).e(interfaceC1609l5);
        return z0(e) + e;
    }

    public static int i0(int i, long j) {
        return z0(i << 3) + 8;
    }

    public static int j(boolean z) {
        return 1;
    }

    public static int j0(long j) {
        return 8;
    }

    public static int k(byte[] bArr) {
        int length = bArr.length;
        return z0(length) + length;
    }

    public static int k0(int i) {
        return r0(i);
    }

    public static int l0(int i, int i2) {
        return z0(i << 3) + 4;
    }

    public static int m0(int i, long j) {
        return z0(i << 3) + r0(y0(j));
    }

    public static int n0(long j) {
        return r0(y0(j));
    }

    public static int o0(int i) {
        return 4;
    }

    public static int p0(int i, int i2) {
        return z0(i << 3) + r0(i2);
    }

    public static int q0(int i, long j) {
        return z0(i << 3) + r0(j);
    }

    public static int r0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int s0(int i) {
        return z0(D0(i));
    }

    public static int t0(int i, int i2) {
        return z0(i << 3) + 4;
    }

    public static int w0(int i) {
        return z0(i << 3);
    }

    public static int x0(int i, int i2) {
        return z0(i << 3) + z0(D0(i2));
    }

    private static long y0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int z(int i, C4 c4) {
        int z0 = z0(i << 3);
        int a2 = c4.a();
        return z0 + z0(a2) + a2;
    }

    public static int z0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void B0(int i) throws IOException {
        Y(D0(i));
    }

    public final void C0(int i, int i2) throws IOException {
        f0(i, D0(i2));
    }

    public final void I() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void J(double d) throws IOException {
        u(Double.doubleToRawLongBits(d));
    }

    public final void K(float f) throws IOException {
        m(Float.floatToRawIntBits(f));
    }

    public abstract void L(int i) throws IOException;

    public final void M(int i, double d) throws IOException {
        o(i, Double.doubleToRawLongBits(d));
    }

    public final void N(int i, float f) throws IOException {
        n(i, Float.floatToRawIntBits(f));
    }

    public abstract void O(int i, int i2) throws IOException;

    public abstract void P(int i, long j) throws IOException;

    public abstract void Q(int i, B3 b3) throws IOException;

    public abstract void R(long j) throws IOException;

    public final void S(boolean z) throws IOException {
        l(z ? (byte) 1 : (byte) 0);
    }

    public abstract void Y(int i) throws IOException;

    public abstract void Z(int i, int i2) throws IOException;

    public abstract int b();

    public abstract void f0(int i, int i2) throws IOException;

    public abstract void l(byte b2) throws IOException;

    public abstract void m(int i) throws IOException;

    public abstract void n(int i, int i2) throws IOException;

    public abstract void o(int i, long j) throws IOException;

    public abstract void p(int i, B3 b3) throws IOException;

    public abstract void q(int i, U4 u4) throws IOException;

    abstract void r(int i, U4 u4, InterfaceC1609l5 interfaceC1609l5) throws IOException;

    public abstract void s(int i, String str) throws IOException;

    public abstract void t(int i, boolean z) throws IOException;

    public abstract void u(long j) throws IOException;

    public final void u0(int i, long j) throws IOException {
        P(i, y0(j));
    }

    public abstract void v(B3 b3) throws IOException;

    public final void v0(long j) throws IOException {
        R(y0(j));
    }

    public abstract void w(U4 u4) throws IOException;

    public abstract void x(String str) throws IOException;

    final void y(String str, P5 p5) throws IOException {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) p5);
        byte[] bytes = str.getBytes(C1616m4.a);
        try {
            Y(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new b(e);
        }
    }

    private S3() {
    }
}
