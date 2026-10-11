/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.C4;
import ax.b6.H5;
import ax.b6.L5;
import ax.b6.P5;
import ax.b6.T3;
import ax.b6.U4;
import ax.b6.V3;
import ax.b6.l5;
import ax.b6.m4;
import ax.b6.q3;
import ax.b6.x3;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class S3
extends x3 {
    private static final Logger b = Logger.getLogger(S3.class.getName());
    private static final boolean c = H5.w();
    V3 a;

    private S3() {
    }

    /* synthetic */ S3(T3 t32) {
        this();
    }

    public static int A(int n8, U4 u42) {
        return (S3.z0(8) << 1) + S3.A0(2, n8) + (S3.z0(24) + S3.X(u42));
    }

    public static int A0(int n8, int n9) {
        return S3.z0(n8 << 3) + S3.z0(n9);
    }

    @Deprecated
    static int B(int n8, U4 u42, l5 l52) {
        return (S3.z0(n8 << 3) << 1) + ((q3)u42).e(l52);
    }

    public static int C(int n8, String string) {
        return S3.z0(n8 << 3) + S3.G(string);
    }

    public static int D(int n8, boolean bl) {
        return S3.z0(n8 << 3) + 1;
    }

    private static int D0(int n8) {
        return n8 >> 31 ^ n8 << 1;
    }

    public static int E(B3 b32) {
        int n8 = b32.s();
        return S3.z0(n8) + n8;
    }

    @Deprecated
    public static int F(U4 u42) {
        return u42.d();
    }

    public static int G(String string) {
        int n8;
        try {
            n8 = L5.a(string);
        }
        catch (P5 p52) {
            n8 = string.getBytes(m4.a).length;
        }
        return S3.z0(n8) + n8;
    }

    public static S3 H(byte[] byArray) {
        return new a(byArray, 0, byArray.length);
    }

    public static int T(int n8, long l8) {
        return S3.z0(n8 << 3) + 8;
    }

    public static int U(int n8, B3 b32) {
        n8 = S3.z0(n8 << 3);
        int n9 = b32.s();
        return n8 + (S3.z0(n9) + n9);
    }

    static int V(int n8, U4 u42, l5 l52) {
        return S3.z0(n8 << 3) + S3.i(u42, l52);
    }

    public static int W(long l8) {
        return 8;
    }

    public static int X(U4 u42) {
        int n8 = u42.d();
        return S3.z0(n8) + n8;
    }

    public static int b0(int n8) {
        return S3.r0(n8);
    }

    public static int c(double d8) {
        return 8;
    }

    public static int c0(int n8, long l8) {
        return S3.z0(n8 << 3) + S3.r0(l8);
    }

    public static int d(float f8) {
        return 4;
    }

    public static int d0(int n8, B3 b32) {
        return (S3.z0(8) << 1) + S3.A0(2, n8) + S3.U(3, b32);
    }

    public static int e(int n8, double d8) {
        return S3.z0(n8 << 3) + 8;
    }

    public static int e0(long l8) {
        return S3.r0(l8);
    }

    public static int f(int n8, float f8) {
        return S3.z0(n8 << 3) + 4;
    }

    public static int g(int n8, C4 c42) {
        return (S3.z0(8) << 1) + S3.A0(2, n8) + S3.z(3, c42);
    }

    public static int g0(int n8) {
        return 4;
    }

    public static int h(C4 c42) {
        int n8 = c42.a();
        return S3.z0(n8) + n8;
    }

    public static int h0(int n8, int n9) {
        return S3.z0(n8 << 3) + S3.r0(n9);
    }

    static int i(U4 u42, l5 l52) {
        int n8 = ((q3)u42).e(l52);
        return S3.z0(n8) + n8;
    }

    public static int i0(int n8, long l8) {
        return S3.z0(n8 << 3) + 8;
    }

    public static int j(boolean bl) {
        return 1;
    }

    public static int j0(long l8) {
        return 8;
    }

    public static int k(byte[] byArray) {
        int n8 = byArray.length;
        return S3.z0(n8) + n8;
    }

    public static int k0(int n8) {
        return S3.r0(n8);
    }

    public static int l0(int n8, int n9) {
        return S3.z0(n8 << 3) + 4;
    }

    public static int m0(int n8, long l8) {
        return S3.z0(n8 << 3) + S3.r0(S3.y0(l8));
    }

    public static int n0(long l8) {
        return S3.r0(S3.y0(l8));
    }

    public static int o0(int n8) {
        return 4;
    }

    public static int p0(int n8, int n9) {
        return S3.z0(n8 << 3) + S3.r0(n9);
    }

    public static int q0(int n8, long l8) {
        return S3.z0(n8 << 3) + S3.r0(l8);
    }

    public static int r0(long l8) {
        return 640 - Long.numberOfLeadingZeros(l8) * 9 >>> 6;
    }

    public static int s0(int n8) {
        return S3.z0(S3.D0(n8));
    }

    public static int t0(int n8, int n9) {
        return S3.z0(n8 << 3) + 4;
    }

    public static int w0(int n8) {
        return S3.z0(n8 << 3);
    }

    public static int x0(int n8, int n9) {
        return S3.z0(n8 << 3) + S3.z0(S3.D0(n9));
    }

    private static long y0(long l8) {
        return l8 >> 63 ^ l8 << 1;
    }

    public static int z(int n8, C4 c42) {
        int n9 = S3.z0(n8 << 3);
        n8 = c42.a();
        return n9 + (S3.z0(n8) + n8);
    }

    public static int z0(int n8) {
        return 352 - Integer.numberOfLeadingZeros(n8) * 9 >>> 6;
    }

    public final void B0(int n8) throws IOException {
        this.Y(S3.D0(n8));
    }

    public final void C0(int n8, int n9) throws IOException {
        this.f0(n8, S3.D0(n9));
    }

    public final void I() {
        if (this.b() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final void J(double d8) throws IOException {
        this.u(Double.doubleToRawLongBits(d8));
    }

    public final void K(float f8) throws IOException {
        this.m(Float.floatToRawIntBits(f8));
    }

    public abstract void L(int var1) throws IOException;

    public final void M(int n8, double d8) throws IOException {
        this.o(n8, Double.doubleToRawLongBits(d8));
    }

    public final void N(int n8, float f8) throws IOException {
        this.n(n8, Float.floatToRawIntBits(f8));
    }

    public abstract void O(int var1, int var2) throws IOException;

    public abstract void P(int var1, long var2) throws IOException;

    public abstract void Q(int var1, B3 var2) throws IOException;

    public abstract void R(long var1) throws IOException;

    public final void S(boolean bl) throws IOException {
        this.l((byte)(bl ? 1 : 0));
    }

    public abstract void Y(int var1) throws IOException;

    public abstract void Z(int var1, int var2) throws IOException;

    public abstract int b();

    public abstract void f0(int var1, int var2) throws IOException;

    public abstract void l(byte var1) throws IOException;

    public abstract void m(int var1) throws IOException;

    public abstract void n(int var1, int var2) throws IOException;

    public abstract void o(int var1, long var2) throws IOException;

    public abstract void p(int var1, B3 var2) throws IOException;

    public abstract void q(int var1, U4 var2) throws IOException;

    abstract void r(int var1, U4 var2, l5 var3) throws IOException;

    public abstract void s(int var1, String var2) throws IOException;

    public abstract void t(int var1, boolean var2) throws IOException;

    public abstract void u(long var1) throws IOException;

    public final void u0(int n8, long l8) throws IOException {
        this.P(n8, S3.y0(l8));
    }

    public abstract void v(B3 var1) throws IOException;

    public final void v0(long l8) throws IOException {
        this.R(S3.y0(l8));
    }

    public abstract void w(U4 var1) throws IOException;

    public abstract void x(String var1) throws IOException;

    final void y(String object, P5 p52) throws IOException {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", p52);
        object = ((String)object).getBytes(m4.a);
        try {
            this.Y(((Object)object).length);
            this.a((byte[])object, 0, ((Object)object).length);
            return;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new b(indexOutOfBoundsException);
        }
    }

    private static final class a
    extends S3 {
        private final byte[] d;
        private final int e;
        private int f;

        a(byte[] byArray, int n8, int n9) {
            super(null);
            if (byArray != null) {
                if ((byArray.length - n9 | n9) >= 0) {
                    this.d = byArray;
                    this.f = 0;
                    this.e = n9;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", byArray.length, 0, n9));
            }
            throw new NullPointerException("buffer");
        }

        private final void E0(byte[] byArray, int n8, int n9) throws IOException {
            try {
                System.arraycopy(byArray, n8, this.d, this.f, n9);
                this.f += n9;
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, n9), indexOutOfBoundsException);
            }
        }

        @Override
        public final void L(int n8) throws IOException {
            if (n8 >= 0) {
                ((S3)this).Y(n8);
                return;
            }
            ((S3)this).R(n8);
        }

        @Override
        public final void O(int n8, int n9) throws IOException {
            ((S3)this).Z(n8, 0);
            ((S3)this).L(n9);
        }

        @Override
        public final void P(int n8, long l8) throws IOException {
            ((S3)this).Z(n8, 0);
            ((S3)this).R(l8);
        }

        @Override
        public final void Q(int n8, B3 b32) throws IOException {
            ((S3)this).Z(1, 3);
            ((S3)this).f0(2, n8);
            ((S3)this).p(3, b32);
            ((S3)this).Z(1, 4);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public final void R(long l8) throws IOException {
            long l9 = l8;
            if (c) {
                l9 = l8;
                if (((S3)this).b() >= 10) {
                    while (true) {
                        int n8;
                        byte[] byArray;
                        if ((l8 & 0xFFFFFFFFFFFFFF80L) == 0L) {
                            byArray = this.d;
                            n8 = this.f;
                            this.f = 1 + n8;
                            H5.m(byArray, n8, (byte)l8);
                            return;
                        }
                        byArray = this.d;
                        n8 = this.f;
                        this.f = n8 + 1;
                        H5.m(byArray, n8, (byte)((int)l8 | 0x80));
                        l8 >>>= 7;
                    }
                }
            }
            while (true) {
                int n9;
                byte[] byArray;
                if ((l9 & 0xFFFFFFFFFFFFFF80L) == 0L) {
                    byArray = this.d;
                    n9 = this.f;
                    this.f = n9 + 1;
                    byArray[n9] = (byte)l9;
                    return;
                }
                try {
                    byArray = this.d;
                    n9 = this.f;
                    this.f = n9 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException);
                }
                byArray[n9] = (byte)((int)l9 | 0x80);
                l9 >>>= 7;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public final void Y(int n8) throws IOException {
            while (true) {
                int n9;
                byte[] byArray;
                if ((n8 & 0xFFFFFF80) == 0) {
                    byArray = this.d;
                    n9 = this.f;
                    this.f = n9 + 1;
                    byArray[n9] = (byte)n8;
                    return;
                }
                try {
                    byArray = this.d;
                    n9 = this.f;
                    this.f = n9 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException);
                }
                byArray[n9] = (byte)(n8 | 0x80);
                n8 >>>= 7;
            }
        }

        @Override
        public final void Z(int n8, int n9) throws IOException {
            ((S3)this).Y(n8 << 3 | n9);
        }

        @Override
        public final void a(byte[] byArray, int n8, int n9) throws IOException {
            this.E0(byArray, n8, n9);
        }

        @Override
        public final int b() {
            return this.e - this.f;
        }

        @Override
        public final void f0(int n8, int n9) throws IOException {
            ((S3)this).Z(n8, 0);
            ((S3)this).Y(n9);
        }

        @Override
        public final void l(byte by) throws IOException {
            try {
                byte[] byArray = this.d;
                int n8 = this.f;
                this.f = n8 + 1;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException);
            }
            byArray[n8] = by;
        }

        @Override
        public final void m(int n8) throws IOException {
            int n9;
            int n10;
            try {
                byte[] byArray = this.d;
                n10 = this.f;
                n9 = n10 + 1;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException);
            }
            this.f = n9;
            byArray[n10] = (byte)n8;
            int n11 = n10 + 2;
            this.f = n11;
            byArray[n9] = (byte)(n8 >> 8);
            n9 = n10 + 3;
            this.f = n9;
            byArray[n11] = (byte)(n8 >> 16);
            this.f = n10 + 4;
            byArray[n9] = (byte)(n8 >>> 24);
        }

        @Override
        public final void n(int n8, int n9) throws IOException {
            ((S3)this).Z(n8, 5);
            ((S3)this).m(n9);
        }

        @Override
        public final void o(int n8, long l8) throws IOException {
            ((S3)this).Z(n8, 1);
            ((S3)this).u(l8);
        }

        @Override
        public final void p(int n8, B3 b32) throws IOException {
            ((S3)this).Z(n8, 2);
            ((S3)this).v(b32);
        }

        @Override
        public final void q(int n8, U4 u42) throws IOException {
            ((S3)this).Z(1, 3);
            ((S3)this).f0(2, n8);
            ((S3)this).Z(3, 2);
            ((S3)this).w(u42);
            ((S3)this).Z(1, 4);
        }

        @Override
        final void r(int n8, U4 u42, l5 l52) throws IOException {
            ((S3)this).Z(n8, 2);
            ((S3)this).Y(((q3)u42).e(l52));
            l52.c(u42, this.a);
        }

        @Override
        public final void s(int n8, String string) throws IOException {
            ((S3)this).Z(n8, 2);
            ((S3)this).x(string);
        }

        @Override
        public final void t(int n8, boolean bl) throws IOException {
            ((S3)this).Z(n8, 0);
            ((S3)this).l((byte)(bl ? 1 : 0));
        }

        @Override
        public final void u(long l8) throws IOException {
            int n8;
            int n9;
            try {
                byte[] byArray = this.d;
                n9 = this.f;
                n8 = n9 + 1;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException);
            }
            this.f = n8;
            byArray[n9] = (byte)l8;
            int n10 = n9 + 2;
            this.f = n10;
            byArray[n8] = (byte)(l8 >> 8);
            n8 = n9 + 3;
            this.f = n8;
            byArray[n10] = (byte)(l8 >> 16);
            n10 = n9 + 4;
            this.f = n10;
            byArray[n8] = (byte)(l8 >> 24);
            n8 = n9 + 5;
            this.f = n8;
            byArray[n10] = (byte)(l8 >> 32);
            n10 = n9 + 6;
            this.f = n10;
            byArray[n8] = (byte)(l8 >> 40);
            n8 = n9 + 7;
            this.f = n8;
            byArray[n10] = (byte)(l8 >> 48);
            this.f = n9 + 8;
            byArray[n8] = (byte)(l8 >> 56);
        }

        @Override
        public final void v(B3 b32) throws IOException {
            ((S3)this).Y(b32.s());
            b32.q(this);
        }

        @Override
        public final void w(U4 u42) throws IOException {
            ((S3)this).Y(u42.d());
            u42.i(this);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public final void x(String string) throws IOException {
            P5 p522;
            int n8;
            block4: {
                n8 = this.f;
                try {
                    int n9 = S3.z0(string.length() * 3);
                    int n10 = S3.z0(string.length());
                    if (n10 == n9) {
                        this.f = n9 = n8 + n10;
                        n9 = L5.b(string, this.d, n9, ((S3)this).b());
                        this.f = n8;
                        ((S3)this).Y(n9 - n8 - n10);
                        this.f = n9;
                        return;
                    }
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw new b(indexOutOfBoundsException);
                }
                catch (P5 p522) {
                    break block4;
                }
                ((S3)this).Y(L5.a(string));
                this.f = L5.b(string, this.d, this.f, ((S3)this).b());
                return;
            }
            this.f = n8;
            this.y(string, p522);
        }
    }

    public static final class b
    extends IOException {
        b(String string, Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            stringBuilder.append(string);
            super(stringBuilder.toString(), throwable);
        }

        b(Throwable throwable) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
        }
    }
}

