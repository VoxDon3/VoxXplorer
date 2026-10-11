/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.B;
import ax.r0.G;
import ax.r0.I;
import ax.r0.K;
import ax.r0.d0;
import ax.r0.f;
import ax.r0.g0;
import ax.r0.h;
import ax.r0.h0;
import ax.r0.i;
import ax.r0.m;
import ax.r0.p;
import ax.r0.t0;
import ax.r0.u0;
import ax.r0.w;
import ax.r0.z;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

abstract class e
implements g0 {
    private e() {
    }

    public static e Q(ByteBuffer byteBuffer, boolean bl) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, bl);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private static final class b
    extends e {
        private final boolean a;
        private final byte[] b;
        private int c;
        private final int d;
        private int e;
        private int f;
        private int g;

        public b(ByteBuffer byteBuffer, boolean bl) {
            int n8;
            this.a = bl;
            this.b = byteBuffer.array();
            this.c = n8 = byteBuffer.arrayOffset() + byteBuffer.position();
            this.d = n8;
            this.e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            return this.c == this.e;
        }

        private byte S() throws IOException {
            int n8 = this.c;
            if (n8 != this.e) {
                byte[] byArray = this.b;
                this.c = n8 + 1;
                return byArray[n8];
            }
            throw B.k();
        }

        private Object T(u0.b b8, Class<?> clazz, p p8) throws IOException {
            switch (ax.r0.e$a.a[b8.ordinal()]) {
                default: {
                    throw new RuntimeException("unsupported field type.");
                }
                case 17: {
                    return this.d();
                }
                case 16: {
                    return this.p();
                }
                case 15: {
                    return this.O();
                }
                case 14: {
                    return this.A();
                }
                case 13: {
                    return this.z();
                }
                case 12: {
                    return this.n();
                }
                case 11: {
                    return this.K();
                }
                case 10: {
                    return this.x(clazz, p8);
                }
                case 9: {
                    return this.N();
                }
                case 8: {
                    return this.I();
                }
                case 7: {
                    return Float.valueOf(this.readFloat());
                }
                case 6: {
                    return this.e();
                }
                case 5: {
                    return this.k();
                }
                case 4: {
                    return this.w();
                }
                case 3: {
                    return this.readDouble();
                }
                case 2: {
                    return this.G();
                }
                case 1: 
            }
            return this.m();
        }

        private <T> T U(h0<T> h02, p p8) throws IOException {
            block3: {
                T t8;
                int n8 = this.g;
                this.g = u0.c(u0.a(this.f), 4);
                try {
                    t8 = h02.g();
                    h02.h(t8, this, p8);
                    h02.b(t8);
                    int n9 = this.f;
                    int n10 = this.g;
                    if (n9 != n10) break block3;
                    this.g = n8;
                }
                catch (Throwable throwable) {
                    this.g = n8;
                    throw throwable;
                }
                return t8;
            }
            throw B.g();
        }

        private int V() throws IOException {
            this.f0(4);
            return this.W();
        }

        private int W() {
            int n8 = this.c;
            byte[] byArray = this.b;
            this.c = n8 + 4;
            byte by = byArray[n8];
            byte by2 = byArray[n8 + 1];
            byte by3 = byArray[n8 + 2];
            return (byArray[n8 + 3] & 0xFF) << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
        }

        private long X() throws IOException {
            this.f0(8);
            return this.Y();
        }

        private long Y() {
            int n8 = this.c;
            byte[] byArray = this.b;
            this.c = n8 + 8;
            long l8 = byArray[n8];
            long l9 = byArray[n8 + 1];
            long l10 = byArray[n8 + 2];
            long l11 = byArray[n8 + 3];
            long l12 = byArray[n8 + 4];
            long l13 = byArray[n8 + 5];
            long l14 = byArray[n8 + 6];
            return ((long)byArray[n8 + 7] & 0xFFL) << 56 | (l8 & 0xFFL | (l9 & 0xFFL) << 8 | (l10 & 0xFFL) << 16 | (l11 & 0xFFL) << 24 | (l12 & 0xFFL) << 32 | (l13 & 0xFFL) << 40 | (l14 & 0xFFL) << 48);
        }

        private <T> T Z(h0<T> h02, p p8) throws IOException {
            block3: {
                T t8;
                int n8 = this.c0();
                this.f0(n8);
                int n9 = this.e;
                this.e = n8 = this.c + n8;
                try {
                    t8 = h02.g();
                    h02.h(t8, this, p8);
                    h02.b(t8);
                    int n10 = this.c;
                    if (n10 != n8) break block3;
                    this.e = n9;
                }
                catch (Throwable throwable) {
                    this.e = n9;
                    throw throwable;
                }
                return t8;
            }
            throw B.g();
        }

        /*
         * Unable to fully structure code
         */
        private int c0() throws IOException {
            block9: {
                block8: {
                    block10: {
                        var2_2 = this.e;
                        var5_1 = this.c;
                        if (var2_2 == var5_1) break block9;
                        var6_3 = this.b;
                        var1_4 = var5_1 + 1;
                        var3_5 = var6_3[var5_1];
                        if (var3_5 >= 0) {
                            this.c = var1_4;
                            return var3_5;
                        }
                        if (var2_2 - var1_4 < 9) {
                            return (int)this.e0();
                        }
                        var2_2 = var5_1 + 2;
                        if ((var3_5 = var6_3[var1_4] << 7 ^ var3_5) >= 0) break block10;
                        var1_4 = var3_5 ^ -128;
                        break block8;
                    }
                    var1_4 = var5_1 + 3;
                    if ((var3_5 = var6_3[var2_2] << 14 ^ var3_5) >= 0) {
                        var2_2 = var3_5 ^ 16256;
lbl20:
                        // 4 sources

                        while (true) {
                            var3_5 = var1_4;
                            var1_4 = var2_2;
                            var2_2 = var3_5;
                            break block8;
                            break;
                        }
                    }
                    var2_2 = var5_1 + 4;
                    if ((var1_4 = var3_5 ^ var6_3[var1_4] << 21) < 0) {
                        var3_5 = -2080896 ^ var1_4;
                        var1_4 = var2_2;
                        var2_2 = var3_5;
lbl30:
                        // 3 sources

                        while (true) {
                            var3_5 = var1_4;
                            var1_4 = var2_2;
                            var2_2 = var3_5;
                            break block8;
                            break;
                        }
                    }
                    var3_5 = var5_1 + 5;
                    var4_6 = var6_3[var2_2];
                    var2_2 = var1_4 ^ var4_6 << 28 ^ 266354560;
                    var1_4 = var3_5;
                    if (var4_6 >= 0) ** GOTO lbl20
                    var1_4 = var4_6 = var5_1 + 6;
                    if (var6_3[var3_5] >= 0) ** GOTO lbl30
                    var1_4 = var3_5 = var5_1 + 7;
                    if (var6_3[var4_6] >= 0) ** GOTO lbl20
                    var1_4 = var4_6 = var5_1 + 8;
                    ** while (var6_3[var3_5] >= 0)
lbl46:
                    // 1 sources

                    var1_4 = var3_5 = var5_1 + 9;
                    if (var6_3[var4_6] < 0) ** break;
                    ** while (true)
                    if (var6_3[var3_5] >= 0) {
                        var3_5 = var5_1 + 10;
                        var1_4 = var2_2;
                        var2_2 = var3_5;
                    } else {
                        throw B.e();
                    }
                }
                this.c = var2_2;
                return var1_4;
            }
            throw B.k();
        }

        private long e0() throws IOException {
            long l8 = 0L;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                byte by = this.S();
                l8 |= (long)(by & 0x7F) << i8;
                if ((by & 0x80) != 0) continue;
                return l8;
            }
            throw B.e();
        }

        private void f0(int n8) throws IOException {
            if (n8 >= 0 && n8 <= this.e - this.c) {
                return;
            }
            throw B.k();
        }

        private void g0(int n8) throws IOException {
            if (this.c == n8) {
                return;
            }
            throw B.k();
        }

        private void h0(int n8) throws IOException {
            if (u0.b(this.f) == n8) {
                return;
            }
            throw B.d();
        }

        private void i0(int n8) throws IOException {
            this.f0(n8);
            this.c += n8;
        }

        private void j0() throws IOException {
            int n8 = this.g;
            this.g = u0.c(u0.a(this.f), 4);
            while (this.D() != Integer.MAX_VALUE && this.J()) {
            }
            if (this.f == this.g) {
                this.g = n8;
                return;
            }
            throw B.g();
        }

        private void k0() throws IOException {
            int n8 = this.e;
            int n9 = this.c;
            if (n8 - n9 >= 10) {
                byte[] byArray = this.b;
                for (n8 = 0; n8 < 10; ++n8) {
                    int n10 = n9 + 1;
                    if (byArray[n9] >= 0) {
                        this.c = n10;
                        return;
                    }
                    n9 = n10;
                }
            }
            this.l0();
        }

        private void l0() throws IOException {
            for (int i8 = 0; i8 < 10; ++i8) {
                if (this.S() < 0) continue;
                return;
            }
            throw B.e();
        }

        private void m0(int n8) throws IOException {
            this.f0(n8);
            if ((n8 & 3) == 0) {
                return;
            }
            throw B.g();
        }

        private void n0(int n8) throws IOException {
            this.f0(n8);
            if ((n8 & 7) == 0) {
                return;
            }
            throw B.g();
        }

        @Override
        public long A() throws IOException {
            this.h0(0);
            return i.c(this.d0());
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public void B(List<Boolean> f8) throws IOException {
            if (f8 instanceof f) {
                int n8 = u0.b(this.f);
                if (n8 != 0) {
                    if (n8 != 2) throw B.d();
                    n8 = this.c0();
                    n8 = this.c + n8;
                    while (this.c < n8) {
                        boolean bl = this.c0() != 0;
                        f8.k(bl);
                    }
                    this.g0(n8);
                    return;
                }
                do {
                    f8.k(this.m());
                    if (this.R()) return;
                    n8 = this.c;
                } while (this.c0() == this.f);
                this.c = n8;
                return;
            }
            int n9 = u0.b(this.f);
            if (n9 != 0) {
                if (n9 != 2) throw B.d();
                n9 = this.c0();
                n9 = this.c + n9;
                while (this.c < n9) {
                    boolean bl = this.c0() != 0;
                    f8.add(bl);
                }
                this.g0(n9);
                return;
            }
            do {
                f8.add(this.m());
                if (this.R()) {
                    return;
                }
                n9 = this.c;
            } while (this.c0() == this.f);
            this.c = n9;
        }

        @Override
        public String C() throws IOException {
            return this.a0(false);
        }

        @Override
        public int D() throws IOException {
            int n8;
            if (this.R()) {
                return Integer.MAX_VALUE;
            }
            this.f = n8 = this.c0();
            if (n8 == this.g) {
                return Integer.MAX_VALUE;
            }
            return u0.a(n8);
        }

        @Override
        public void E(List<String> list) throws IOException {
            this.b0(list, false);
        }

        @Override
        public void F(List<String> list) throws IOException {
            this.b0(list, true);
        }

        @Override
        public h G() throws IOException {
            this.h0(2);
            int n8 = this.c0();
            if (n8 == 0) {
                return h.c0;
            }
            this.f0(n8);
            h h8 = this.a ? h.G(this.b, this.c, n8) : h.l(this.b, this.c, n8);
            this.c += n8;
            return h8;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public void H(List<Float> w8) throws IOException {
            if (w8 instanceof w) {
                int n8 = u0.b(this.f);
                if (n8 != 2) {
                    if (n8 != 5) throw B.d();
                    do {
                        w8.i(this.readFloat());
                        if (this.R()) return;
                        n8 = this.c;
                    } while (this.c0() == this.f);
                    this.c = n8;
                    return;
                }
                n8 = this.c0();
                this.m0(n8);
                int n9 = this.c;
                while (this.c < n9 + n8) {
                    w8.i(Float.intBitsToFloat(this.W()));
                }
                return;
            } else {
                int n10 = u0.b(this.f);
                if (n10 != 2) {
                    if (n10 != 5) throw B.d();
                    do {
                        w8.add(Float.valueOf(this.readFloat()));
                        if (this.R()) return;
                        n10 = this.c;
                    } while (this.c0() == this.f);
                    this.c = n10;
                    return;
                }
                n10 = this.c0();
                this.m0(n10);
                int n11 = this.c;
                while (this.c < n11 + n10) {
                    w8.add(Float.valueOf(Float.intBitsToFloat(this.W())));
                }
            }
        }

        @Override
        public int I() throws IOException {
            this.h0(0);
            return this.c0();
        }

        @Override
        public boolean J() throws IOException {
            int n8;
            if (!this.R() && (n8 = this.f) != this.g) {
                if ((n8 = u0.b(n8)) != 0) {
                    if (n8 != 1) {
                        if (n8 != 2) {
                            if (n8 != 3) {
                                if (n8 == 5) {
                                    this.i0(4);
                                    return true;
                                }
                                throw B.d();
                            }
                            this.j0();
                            return true;
                        }
                        this.i0(this.c0());
                        return true;
                    }
                    this.i0(8);
                    return true;
                }
                this.k0();
                return true;
            }
            return false;
        }

        @Override
        public int K() throws IOException {
            this.h0(5);
            return this.V();
        }

        @Override
        public void L(List<h> list) throws IOException {
            if (u0.b(this.f) == 2) {
                int n8;
                do {
                    list.add(this.G());
                    if (this.R()) {
                        return;
                    }
                    n8 = this.c;
                } while (this.c0() == this.f);
                this.c = n8;
                return;
            }
            throw B.d();
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void M(List<Double> m8) throws IOException {
            int n8;
            if (!(m8 instanceof m)) {
                n8 = u0.b(this.f);
                if (n8 != 1) {
                    if (n8 != 2) throw B.d();
                    int n9 = this.c0();
                    this.n0(n9);
                    n8 = this.c;
                    while (this.c < n8 + n9) {
                        m8.add(Double.longBitsToDouble(this.Y()));
                    }
                    return;
                }
            } else {
                int n10 = u0.b(this.f);
                if (n10 != 1) {
                    if (n10 != 2) throw B.d();
                    n10 = this.c0();
                    this.n0(n10);
                    int n11 = this.c;
                    while (this.c < n11 + n10) {
                        m8.i(Double.longBitsToDouble(this.Y()));
                    }
                    return;
                }
                do {
                    m8.i(this.readDouble());
                    if (this.R()) {
                        return;
                    }
                    n10 = this.c;
                } while (this.c0() == this.f);
                this.c = n10;
                return;
            }
            do {
                m8.add(this.readDouble());
                if (this.R()) {
                    return;
                }
                n8 = this.c;
            } while (this.c0() == this.f);
            this.c = n8;
        }

        @Override
        public long N() throws IOException {
            this.h0(0);
            return this.d0();
        }

        @Override
        public String O() throws IOException {
            return this.a0(true);
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void P(List<Long> i8) throws IOException {
            int n8;
            if (!(i8 instanceof I)) {
                n8 = u0.b(this.f);
                if (n8 != 1) {
                    if (n8 != 2) throw B.d();
                    n8 = this.c0();
                    this.n0(n8);
                    int n9 = this.c;
                    while (this.c < n9 + n8) {
                        i8.add(this.Y());
                    }
                    return;
                }
            } else {
                int n10 = u0.b(this.f);
                if (n10 != 1) {
                    if (n10 != 2) throw B.d();
                    int n11 = this.c0();
                    this.n0(n11);
                    n10 = this.c;
                    while (this.c < n10 + n11) {
                        i8.k(this.Y());
                    }
                    return;
                }
                do {
                    i8.k(this.e());
                    if (this.R()) {
                        return;
                    }
                    n10 = this.c;
                } while (this.c0() == this.f);
                this.c = n10;
                return;
            }
            do {
                i8.add(this.e());
                if (this.R()) {
                    return;
                }
                n8 = this.c;
            } while (this.c0() == this.f);
            this.c = n8;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public <K, V> void a(Map<K, V> var1_1, K.a<K, V> var2_3, p var3_4) throws IOException {
            block7: {
                this.h0(2);
                var5_5 = this.c0();
                this.f0(var5_5);
                var4_6 = this.e;
                this.e = this.c + var5_5;
                try {
                    var6_7 /* !! */  = var2_3.b;
                    var7_8 /* !! */  = var2_3.d;
lbl9:
                    // 5 sources

                    while (true) {
                        var5_5 = this.D();
                        if (var5_5 == 0x7FFFFFFF) {
                            var1_1.put(var6_7 /* !! */ , var7_8 /* !! */ );
                            this.e = var4_6;
                            return;
                        }
                        break;
                    }
                }
                catch (Throwable var1_2) {
                    break block7;
                }
                if (var5_5 == 1) ** GOTO lbl28
                if (var5_5 == 2) ** GOTO lbl25
                {
                    try {
                        if (this.J()) ** GOTO lbl9
                        var8_9 = new B("Unable to parse map entry.");
                        throw var8_9;
lbl25:
                        // 1 sources

                        var8_9 = this.T(var2_3.c, var2_3.d.getClass(), var3_4);
                        var7_8 /* !! */  = var8_9;
                        ** GOTO lbl9
lbl28:
                        // 1 sources

                        var8_9 = this.T(var2_3.a, null, null);
                        var6_7 /* !! */  = var8_9;
                        ** GOTO lbl9
                    }
                    catch (B.a var8_10) {
                        if (!this.J()) ** break;
                        ** continue;
                        var1_1 = new B("Unable to parse map entry.");
                        throw var1_1;
                    }
                }
            }
            this.e = var4_6;
            throw var1_2;
        }

        public String a0(boolean bl) throws IOException {
            int n8;
            Object object;
            this.h0(2);
            int n9 = this.c0();
            if (n9 == 0) {
                return "";
            }
            this.f0(n9);
            if (bl && !t0.n(object = this.b, n8 = this.c, n8 + n9)) {
                throw B.c();
            }
            object = new String(this.b, this.c, n9, A.a);
            this.c += n9;
            return object;
        }

        @Override
        public <T> T b(h0<T> h02, p p8) throws IOException {
            this.h0(3);
            return this.U(h02, p8);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void b0(List<String> g8, boolean bl) throws IOException {
            int n8;
            if (u0.b(this.f) != 2) throw B.d();
            if (g8 instanceof G && !bl) {
                int n9;
                do {
                    g8.C0(this.G());
                    if (this.R()) return;
                    n9 = this.c;
                } while (this.c0() == this.f);
                this.c = n9;
                return;
            }
            do {
                g8.add(this.a0(bl));
                if (this.R()) {
                    return;
                }
                n8 = this.c;
            } while (this.c0() == this.f);
            this.c = n8;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void c(List<Integer> z8) throws IOException {
            int n8;
            if (!(z8 instanceof z)) {
                n8 = u0.b(this.f);
                if (n8 != 0) {
                    if (n8 != 2) throw B.d();
                    n8 = this.c0();
                    int n9 = this.c;
                    while (this.c < n9 + n8) {
                        z8.add(i.b(this.c0()));
                    }
                    return;
                }
            } else {
                int n10 = u0.b(this.f);
                if (n10 != 0) {
                    if (n10 != 2) throw B.d();
                    n10 = this.c0();
                    int n11 = this.c;
                    while (this.c < n11 + n10) {
                        z8.i(i.b(this.c0()));
                    }
                    return;
                }
                do {
                    z8.i(this.z());
                    if (this.R()) {
                        return;
                    }
                    n10 = this.c;
                } while (this.c0() == this.f);
                this.c = n10;
                return;
            }
            do {
                z8.add(this.z());
                if (this.R()) {
                    return;
                }
                n8 = this.c;
            } while (this.c0() == this.f);
            this.c = n8;
        }

        @Override
        public long d() throws IOException {
            this.h0(0);
            return this.d0();
        }

        /*
         * Unable to fully structure code
         */
        public long d0() throws IOException {
            var1_2 = this.e;
            var4_1 = this.c;
            if (var1_2 != var4_1) {
                var9_3 = this.b;
                var3_4 = var4_1 + 1;
                var2_5 = var9_3[var4_1];
                if (var2_5 >= 0) {
                    this.c = var3_4;
                    return var2_5;
                }
                if (var1_2 - var3_4 < 9) {
                    return this.e0();
                }
                var1_2 = var4_1 + 2;
                if ((var3_4 = var9_3[var3_4] << 7 ^ var2_5) < 0) {
                    var5_6 = var3_4 ^ -128;
                } else {
                    var2_5 = var4_1 + 3;
                    if ((var3_4 = var9_3[var1_2] << 14 ^ var3_4) >= 0) {
                        var5_6 = var3_4 ^ 16256;
                        var1_2 = var2_5;
                    } else {
                        var1_2 = var4_1 + 4;
                        if ((var2_5 = var3_4 ^ var9_3[var2_5] << 21) < 0) {
                            var5_6 = -2080896 ^ var2_5;
                        } else {
                            var5_6 = var2_5;
                            var2_5 = var4_1 + 5;
                            if ((var5_6 ^= (long)var9_3[var1_2] << 28) >= 0L) {
                                var7_7 = 266354560L;
                                var1_2 = var2_5;
lbl30:
                                // 2 sources

                                while (true) {
                                    var5_6 = var7_7 ^ var5_6;
                                    break;
                                }
                            } else {
                                var3_4 = var4_1 + 6;
                                var7_7 = var5_6 ^ (long)var9_3[var2_5] << 35;
                                if (var7_7 < 0L) {
                                    var5_6 = -34093383808L;
                                    var1_2 = var3_4;
lbl38:
                                    // 2 sources

                                    while (true) {
                                        var5_6 ^= var7_7;
                                        break;
                                    }
                                } else {
                                    var1_2 = var4_1 + 7;
                                    var5_6 = var7_7 ^ (long)var9_3[var3_4] << 42;
                                    if (var5_6 >= 0L) {
                                        var7_7 = 4363953127296L;
                                        ** continue;
                                    }
                                    var2_5 = var4_1 + 8;
                                    var7_7 = var5_6 ^ (long)var9_3[var1_2] << 49;
                                    if (var7_7 < 0L) {
                                        var5_6 = -558586000294016L;
                                        var1_2 = var2_5;
                                        ** continue;
                                    }
                                    var3_4 = var4_1 + 9;
                                    var5_6 = var7_7 ^ (long)var9_3[var2_5] << 56 ^ 71499008037633920L;
                                    var1_2 = var3_4;
                                    if (var5_6 < 0L) {
                                        if ((long)var9_3[var3_4] >= 0L) {
                                            var1_2 = var4_1 + 10;
                                        } else {
                                            throw B.e();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.c = var1_2;
                return var5_6;
            }
            throw B.k();
        }

        @Override
        public long e() throws IOException {
            this.h0(1);
            return this.X();
        }

        @Override
        public <T> T f(h0<T> h02, p p8) throws IOException {
            this.h0(2);
            return this.Z(h02, p8);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public void g(List<Integer> z8) throws IOException {
            if (z8 instanceof z) {
                int n8 = u0.b(this.f);
                if (n8 != 2) {
                    if (n8 != 5) throw B.d();
                    do {
                        z8.i(this.K());
                        if (this.R()) return;
                        n8 = this.c;
                    } while (this.c0() == this.f);
                    this.c = n8;
                    return;
                }
                n8 = this.c0();
                this.m0(n8);
                int n9 = this.c;
                while (this.c < n9 + n8) {
                    z8.i(this.W());
                }
                return;
            } else {
                int n10 = u0.b(this.f);
                if (n10 != 2) {
                    if (n10 != 5) throw B.d();
                    do {
                        z8.add(this.K());
                        if (this.R()) return;
                        n10 = this.c;
                    } while (this.c0() == this.f);
                    this.c = n10;
                    return;
                }
                int n11 = this.c0();
                this.m0(n11);
                n10 = this.c;
                while (this.c < n10 + n11) {
                    z8.add(this.W());
                }
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void h(List<Long> i8) throws IOException {
            int n8;
            if (!(i8 instanceof I)) {
                n8 = u0.b(this.f);
                if (n8 != 0) {
                    if (n8 != 2) throw B.d();
                    int n9 = this.c0();
                    n8 = this.c;
                    while (this.c < n8 + n9) {
                        i8.add(i.c(this.d0()));
                    }
                    return;
                }
            } else {
                int n10 = u0.b(this.f);
                if (n10 != 0) {
                    if (n10 != 2) throw B.d();
                    int n11 = this.c0();
                    n10 = this.c;
                    while (this.c < n10 + n11) {
                        i8.k(i.c(this.d0()));
                    }
                    return;
                }
                do {
                    i8.k(this.A());
                    if (this.R()) {
                        return;
                    }
                    n10 = this.c;
                } while (this.c0() == this.f);
                this.c = n10;
                return;
            }
            do {
                i8.add(this.A());
                if (this.R()) {
                    return;
                }
                n8 = this.c;
            } while (this.c0() == this.f);
            this.c = n8;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void i(List<Integer> z8) throws IOException {
            int n8;
            if (!(z8 instanceof z)) {
                n8 = u0.b(this.f);
                if (n8 != 0) {
                    if (n8 != 2) throw B.d();
                    n8 = this.c0();
                    int n9 = this.c;
                    while (this.c < n9 + n8) {
                        z8.add(this.c0());
                    }
                    return;
                }
            } else {
                int n10 = u0.b(this.f);
                if (n10 != 0) {
                    if (n10 != 2) throw B.d();
                    int n11 = this.c0();
                    n10 = this.c;
                    while (this.c < n10 + n11) {
                        z8.i(this.c0());
                    }
                    return;
                }
                do {
                    z8.i(this.p());
                    if (this.R()) {
                        return;
                    }
                    n10 = this.c;
                } while (this.c0() == this.f);
                this.c = n10;
                return;
            }
            do {
                z8.add(this.p());
                if (this.R()) {
                    return;
                }
                n8 = this.c;
            } while (this.c0() == this.f);
            this.c = n8;
        }

        @Override
        public <T> void j(List<T> list, h0<T> h02, p p8) throws IOException {
            if (u0.b(this.f) == 3) {
                int n8;
                int n9 = this.f;
                do {
                    list.add(this.U(h02, p8));
                    if (this.R()) {
                        return;
                    }
                    n8 = this.c;
                } while (this.c0() == n9);
                this.c = n8;
                return;
            }
            throw B.d();
        }

        @Override
        public int k() throws IOException {
            this.h0(5);
            return this.V();
        }

        @Override
        public int l() {
            return this.f;
        }

        @Override
        public boolean m() throws IOException {
            boolean bl = false;
            this.h0(0);
            if (this.c0() != 0) {
                bl = true;
            }
            return bl;
        }

        @Override
        public long n() throws IOException {
            this.h0(1);
            return this.X();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public void o(List<Long> i8) throws IOException {
            if (i8 instanceof I) {
                int n8 = u0.b(this.f);
                if (n8 != 0) {
                    if (n8 != 2) throw B.d();
                    n8 = this.c0();
                    n8 = this.c + n8;
                    while (this.c < n8) {
                        i8.k(this.d0());
                    }
                    this.g0(n8);
                    return;
                }
                do {
                    i8.k(this.d());
                    if (this.R()) return;
                    n8 = this.c;
                } while (this.c0() == this.f);
                this.c = n8;
                return;
            }
            int n9 = u0.b(this.f);
            if (n9 != 0) {
                if (n9 != 2) throw B.d();
                n9 = this.c0();
                n9 = this.c + n9;
                while (this.c < n9) {
                    i8.add(this.d0());
                }
                this.g0(n9);
                return;
            }
            do {
                i8.add(this.d());
                if (this.R()) {
                    return;
                }
                n9 = this.c;
            } while (this.c0() == this.f);
            this.c = n9;
        }

        @Override
        public int p() throws IOException {
            this.h0(0);
            return this.c0();
        }

        @Override
        public <T> T q(Class<T> clazz, p p8) throws IOException {
            this.h0(3);
            return this.U(d0.a().d(clazz), p8);
        }

        @Override
        public <T> void r(List<T> list, h0<T> h02, p p8) throws IOException {
            if (u0.b(this.f) == 2) {
                int n8;
                int n9 = this.f;
                do {
                    list.add(this.Z(h02, p8));
                    if (this.R()) {
                        return;
                    }
                    n8 = this.c;
                } while (this.c0() == n9);
                this.c = n8;
                return;
            }
            throw B.d();
        }

        @Override
        public double readDouble() throws IOException {
            this.h0(1);
            return Double.longBitsToDouble(this.X());
        }

        @Override
        public float readFloat() throws IOException {
            this.h0(5);
            return Float.intBitsToFloat(this.V());
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public void s(List<Long> i8) throws IOException {
            if (i8 instanceof I) {
                int n8 = u0.b(this.f);
                if (n8 != 0) {
                    if (n8 != 2) throw B.d();
                    n8 = this.c0();
                    n8 = this.c + n8;
                    while (this.c < n8) {
                        i8.k(this.d0());
                    }
                    this.g0(n8);
                    return;
                }
                do {
                    i8.k(this.N());
                    if (this.R()) return;
                    n8 = this.c;
                } while (this.c0() == this.f);
                this.c = n8;
                return;
            }
            int n9 = u0.b(this.f);
            if (n9 != 0) {
                if (n9 != 2) throw B.d();
                n9 = this.c0();
                n9 = this.c + n9;
                while (this.c < n9) {
                    i8.add(this.d0());
                }
                this.g0(n9);
                return;
            }
            do {
                i8.add(this.N());
                if (this.R()) {
                    return;
                }
                n9 = this.c;
            } while (this.c0() == this.f);
            this.c = n9;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void t(List<Long> i8) throws IOException {
            int n8;
            if (!(i8 instanceof I)) {
                n8 = u0.b(this.f);
                if (n8 != 1) {
                    if (n8 != 2) throw B.d();
                    int n9 = this.c0();
                    this.n0(n9);
                    n8 = this.c;
                    while (this.c < n8 + n9) {
                        i8.add(this.Y());
                    }
                    return;
                }
            } else {
                int n10 = u0.b(this.f);
                if (n10 != 1) {
                    if (n10 != 2) throw B.d();
                    n10 = this.c0();
                    this.n0(n10);
                    int n11 = this.c;
                    while (this.c < n11 + n10) {
                        i8.k(this.Y());
                    }
                    return;
                }
                do {
                    i8.k(this.n());
                    if (this.R()) {
                        return;
                    }
                    n10 = this.c;
                } while (this.c0() == this.f);
                this.c = n10;
                return;
            }
            do {
                i8.add(this.n());
                if (this.R()) {
                    return;
                }
                n8 = this.c;
            } while (this.c0() == this.f);
            this.c = n8;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public void u(List<Integer> z8) throws IOException {
            if (z8 instanceof z) {
                int n8 = u0.b(this.f);
                if (n8 != 0) {
                    if (n8 != 2) throw B.d();
                    n8 = this.c0();
                    n8 = this.c + n8;
                    while (this.c < n8) {
                        z8.i(this.c0());
                    }
                    this.g0(n8);
                    return;
                }
                do {
                    z8.i(this.I());
                    if (this.R()) return;
                    n8 = this.c;
                } while (this.c0() == this.f);
                this.c = n8;
                return;
            }
            int n9 = u0.b(this.f);
            if (n9 != 0) {
                if (n9 != 2) throw B.d();
                n9 = this.c0();
                n9 = this.c + n9;
                while (this.c < n9) {
                    z8.add(this.c0());
                }
                this.g0(n9);
                return;
            }
            do {
                z8.add(this.I());
                if (this.R()) {
                    return;
                }
                n9 = this.c;
            } while (this.c0() == this.f);
            this.c = n9;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void v(List<Integer> z8) throws IOException {
            int n8;
            if (!(z8 instanceof z)) {
                n8 = u0.b(this.f);
                if (n8 != 0) {
                    if (n8 != 2) throw B.d();
                    n8 = this.c0();
                    int n9 = this.c;
                    while (this.c < n9 + n8) {
                        z8.add(this.c0());
                    }
                    return;
                }
            } else {
                int n10 = u0.b(this.f);
                if (n10 != 0) {
                    if (n10 != 2) throw B.d();
                    n10 = this.c0();
                    int n11 = this.c;
                    while (this.c < n11 + n10) {
                        z8.i(this.c0());
                    }
                    return;
                }
                do {
                    z8.i(this.w());
                    if (this.R()) {
                        return;
                    }
                    n10 = this.c;
                } while (this.c0() == this.f);
                this.c = n10;
                return;
            }
            do {
                z8.add(this.w());
                if (this.R()) {
                    return;
                }
                n8 = this.c;
            } while (this.c0() == this.f);
            this.c = n8;
        }

        @Override
        public int w() throws IOException {
            this.h0(0);
            return this.c0();
        }

        @Override
        public <T> T x(Class<T> clazz, p p8) throws IOException {
            this.h0(2);
            return this.Z(d0.a().d(clazz), p8);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public void y(List<Integer> z8) throws IOException {
            if (z8 instanceof z) {
                int n8 = u0.b(this.f);
                if (n8 != 2) {
                    if (n8 != 5) throw B.d();
                    do {
                        z8.i(this.k());
                        if (this.R()) return;
                        n8 = this.c;
                    } while (this.c0() == this.f);
                    this.c = n8;
                    return;
                }
                int n9 = this.c0();
                this.m0(n9);
                n8 = this.c;
                while (this.c < n8 + n9) {
                    z8.i(this.W());
                }
                return;
            } else {
                int n10 = u0.b(this.f);
                if (n10 != 2) {
                    if (n10 != 5) throw B.d();
                    do {
                        z8.add(this.k());
                        if (this.R()) return;
                        n10 = this.c;
                    } while (this.c0() == this.f);
                    this.c = n10;
                    return;
                }
                n10 = this.c0();
                this.m0(n10);
                int n11 = this.c;
                while (this.c < n11 + n10) {
                    z8.add(this.W());
                }
            }
        }

        @Override
        public int z() throws IOException {
            this.h0(0);
            return i.b(this.c0());
        }
    }
}

