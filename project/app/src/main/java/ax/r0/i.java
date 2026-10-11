/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.B;
import ax.r0.h;
import ax.r0.j;
import ax.r0.t0;
import ax.r0.u0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class i {
    int a;
    int b = 100;
    int c = Integer.MAX_VALUE;
    j d;
    private boolean e = false;

    private i() {
    }

    public static int b(int n8) {
        return -(n8 & 1) ^ n8 >>> 1;
    }

    public static long c(long l8) {
        return -(l8 & 1L) ^ l8 >>> 1;
    }

    public static i f(InputStream inputStream) {
        return i.g(inputStream, 4096);
    }

    public static i g(InputStream inputStream, int n8) {
        if (n8 > 0) {
            if (inputStream == null) {
                return i.h(A.c);
            }
            return new c(inputStream, n8);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static i h(byte[] byArray) {
        return i.i(byArray, 0, byArray.length);
    }

    public static i i(byte[] byArray, int n8, int n9) {
        return i.j(byArray, n8, n9, false);
    }

    static i j(byte[] object, int n8, int n9, boolean bl) {
        object = new b((byte[])object, n8, n9, bl);
        try {
            ((b)object).l(n9);
            return object;
        }
        catch (B b8) {
            throw new IllegalArgumentException(b8);
        }
    }

    public abstract String A() throws IOException;

    public abstract int B() throws IOException;

    public abstract int C() throws IOException;

    public abstract long D() throws IOException;

    public abstract boolean E(int var1) throws IOException;

    public abstract void a(int var1) throws B;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void k(int var1);

    public abstract int l(int var1) throws B;

    public abstract boolean m() throws IOException;

    public abstract h n() throws IOException;

    public abstract double o() throws IOException;

    public abstract int p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    public abstract float s() throws IOException;

    public abstract int t() throws IOException;

    public abstract long u() throws IOException;

    public abstract int v() throws IOException;

    public abstract long w() throws IOException;

    public abstract int x() throws IOException;

    public abstract long y() throws IOException;

    public abstract String z() throws IOException;

    private static final class b
    extends i {
        private final byte[] f;
        private final boolean g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;
        private int n = Integer.MAX_VALUE;

        private b(byte[] byArray, int n8, int n9, boolean bl) {
            this.f = byArray;
            this.h = n9 + n8;
            this.j = n8;
            this.k = n8;
            this.g = bl;
        }

        private void M() {
            int n8;
            this.h = n8 = this.h + this.i;
            int n9 = n8 - this.k;
            int n10 = this.n;
            if (n9 > n10) {
                this.i = n10 = n9 - n10;
                this.h = n8 - n10;
                return;
            }
            this.i = 0;
        }

        private void P() throws IOException {
            if (this.h - this.j >= 10) {
                this.Q();
                return;
            }
            this.R();
        }

        private void Q() throws IOException {
            for (int i8 = 0; i8 < 10; ++i8) {
                byte[] byArray = this.f;
                int n8 = this.j;
                this.j = n8 + 1;
                if (byArray[n8] < 0) continue;
                return;
            }
            throw B.e();
        }

        private void R() throws IOException {
            for (int i8 = 0; i8 < 10; ++i8) {
                if (this.F() < 0) continue;
                return;
            }
            throw B.e();
        }

        @Override
        public String A() throws IOException {
            int n8;
            int n9;
            int n10 = this.J();
            if (n10 > 0 && n10 <= (n9 = this.h) - (n8 = this.j)) {
                String string = t0.e(this.f, n8, n10);
                this.j += n10;
                return string;
            }
            if (n10 == 0) {
                return "";
            }
            if (n10 <= 0) {
                throw B.f();
            }
            throw B.k();
        }

        @Override
        public int B() throws IOException {
            int n8;
            if (this.e()) {
                this.l = 0;
                return 0;
            }
            this.l = n8 = this.J();
            if (u0.a(n8) != 0) {
                return this.l;
            }
            throw B.b();
        }

        @Override
        public int C() throws IOException {
            return this.J();
        }

        @Override
        public long D() throws IOException {
            return this.K();
        }

        @Override
        public boolean E(int n8) throws IOException {
            int n9 = u0.b(n8);
            if (n9 != 0) {
                if (n9 != 1) {
                    if (n9 != 2) {
                        if (n9 != 3) {
                            if (n9 != 4) {
                                if (n9 == 5) {
                                    this.O(4);
                                    return true;
                                }
                                throw B.d();
                            }
                            return false;
                        }
                        this.N();
                        this.a(u0.c(u0.a(n8), 4));
                        return true;
                    }
                    this.O(this.J());
                    return true;
                }
                this.O(8);
                return true;
            }
            this.P();
            return true;
        }

        public byte F() throws IOException {
            int n8 = this.j;
            if (n8 != this.h) {
                byte[] byArray = this.f;
                this.j = n8 + 1;
                return byArray[n8];
            }
            throw B.k();
        }

        public byte[] G(int n8) throws IOException {
            int n9;
            int n10;
            if (n8 > 0 && n8 <= (n10 = this.h) - (n9 = this.j)) {
                this.j = n8 += n9;
                return Arrays.copyOfRange(this.f, n9, n8);
            }
            if (n8 <= 0) {
                if (n8 == 0) {
                    return A.c;
                }
                throw B.f();
            }
            throw B.k();
        }

        public int H() throws IOException {
            int n8 = this.j;
            if (this.h - n8 >= 4) {
                byte[] byArray = this.f;
                this.j = n8 + 4;
                byte by = byArray[n8];
                byte by2 = byArray[n8 + 1];
                byte by3 = byArray[n8 + 2];
                return (byArray[n8 + 3] & 0xFF) << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
            }
            throw B.k();
        }

        public long I() throws IOException {
            int n8 = this.j;
            if (this.h - n8 >= 8) {
                byte[] byArray = this.f;
                this.j = n8 + 8;
                long l8 = byArray[n8];
                long l9 = byArray[n8 + 1];
                long l10 = byArray[n8 + 2];
                long l11 = byArray[n8 + 3];
                long l12 = byArray[n8 + 4];
                long l13 = byArray[n8 + 5];
                long l14 = byArray[n8 + 6];
                return ((long)byArray[n8 + 7] & 0xFFL) << 56 | (l8 & 0xFFL | (l9 & 0xFFL) << 8 | (l10 & 0xFFL) << 16 | (l11 & 0xFFL) << 24 | (l12 & 0xFFL) << 32 | (l13 & 0xFFL) << 40 | (l14 & 0xFFL) << 48);
            }
            throw B.k();
        }

        /*
         * Enabled aggressive block sorting
         */
        public int J() throws IOException {
            int n8;
            int n9;
            block5: {
                int n10;
                int n11;
                block10: {
                    block9: {
                        block7: {
                            int n12;
                            byte[] byArray;
                            block8: {
                                block6: {
                                    block4: {
                                        n9 = this.h;
                                        n11 = this.j;
                                        if (n9 == n11) {
                                            return (int)this.L();
                                        }
                                        byArray = this.f;
                                        n8 = n11 + 1;
                                        n10 = byArray[n11];
                                        if (n10 >= 0) {
                                            this.j = n8;
                                            return n10;
                                        }
                                        if (n9 - n8 < 9) {
                                            return (int)this.L();
                                        }
                                        n9 = n11 + 2;
                                        if ((n10 = byArray[n8] << 7 ^ n10) >= 0) break block4;
                                        n8 = n10 ^ 0xFFFFFF80;
                                        break block5;
                                    }
                                    n8 = n11 + 3;
                                    if ((n10 = byArray[n9] << 14 ^ n10) < 0) break block6;
                                    n9 = n10 ^ 0x3F80;
                                    break block7;
                                }
                                n9 = n11 + 4;
                                if ((n8 = n10 ^ byArray[n8] << 21) >= 0) break block8;
                                n10 = 0xFFE03F80 ^ n8;
                                n8 = n9;
                                n9 = n10;
                                break block9;
                            }
                            n10 = n11 + 5;
                            int n13 = byArray[n9];
                            n9 = n8 ^ n13 << 28 ^ 0xFE03F80;
                            n8 = n10;
                            if (n13 >= 0) break block7;
                            n8 = n13 = n11 + 6;
                            if (byArray[n10] >= 0) break block9;
                            n8 = n12 = n11 + 7;
                            if (byArray[n13] >= 0) break block7;
                            n8 = n10 = n11 + 8;
                            if (byArray[n12] >= 0) break block9;
                            n8 = n13 = n11 + 9;
                            if (byArray[n10] >= 0) break block7;
                            if (byArray[n13] < 0) {
                                return (int)this.L();
                            }
                            break block10;
                        }
                        n10 = n8;
                        n8 = n9;
                        n9 = n10;
                        break block5;
                    }
                    n10 = n8;
                    n8 = n9;
                    n9 = n10;
                    break block5;
                }
                n10 = n11 + 10;
                n8 = n9;
                n9 = n10;
            }
            this.j = n9;
            return n8;
        }

        /*
         * Unable to fully structure code
         */
        public long K() throws IOException {
            block11: {
                block16: {
                    block12: {
                        block15: {
                            block14: {
                                block13: {
                                    var1_2 = this.h;
                                    var3_1 = this.j;
                                    if (var1_2 == var3_1) break block12;
                                    var9_3 = this.f;
                                    var4_4 = var3_1 + 1;
                                    var2_5 = var9_3[var3_1];
                                    if (var2_5 >= 0) {
                                        this.j = var4_4;
                                        return var2_5;
                                    }
                                    if (var1_2 - var4_4 < 9) break block12;
                                    var1_2 = var3_1 + 2;
                                    if ((var4_4 = var9_3[var4_4] << 7 ^ var2_5) >= 0) break block13;
                                    var5_6 = var4_4 ^ -128;
                                    break block11;
                                }
                                var2_5 = var3_1 + 3;
                                if ((var4_4 = var9_3[var1_2] << 14 ^ var4_4) < 0) break block14;
                                var5_6 = var4_4 ^ 16256;
                                var1_2 = var2_5;
                                break block11;
                            }
                            var1_2 = var3_1 + 4;
                            if ((var2_5 = var4_4 ^ var9_3[var2_5] << 21) >= 0) break block15;
                            var5_6 = -2080896 ^ var2_5;
                            break block11;
                        }
                        var5_6 = var2_5;
                        var2_5 = var3_1 + 5;
                        var7_7 = var5_6 ^ (long)var9_3[var1_2] << 28;
                        if (var7_7 >= 0L) {
                            var5_6 = 266354560L;
                            var1_2 = var2_5;
lbl33:
                            // 2 sources

                            while (true) {
                                var5_6 ^= var7_7;
                                break block11;
                                break;
                            }
                        }
                        var1_2 = var3_1 + 6;
                        if ((var7_7 ^= (long)var9_3[var2_5] << 35) < 0L) {
                            var5_6 = -34093383808L;
lbl39:
                            // 2 sources

                            while (true) {
                                var5_6 ^= var7_7;
                                break block11;
                                break;
                            }
                        }
                        var2_5 = var3_1 + 7;
                        if ((var7_7 ^= (long)var9_3[var1_2] << 42) >= 0L) {
                            var5_6 = 4363953127296L;
                            var1_2 = var2_5;
                            ** continue;
                        }
                        var1_2 = var3_1 + 8;
                        if ((var7_7 ^= (long)var9_3[var2_5] << 49) < 0L) {
                            var5_6 = -558586000294016L;
                            ** continue;
                        }
                        var2_5 = var3_1 + 9;
                        var5_6 = var7_7 ^ (long)var9_3[var1_2] << 56 ^ 71499008037633920L;
                        var1_2 = var2_5;
                        if (var5_6 >= 0L) break block11;
                        if ((long)var9_3[var2_5] >= 0L) break block16;
                    }
                    return this.L();
                }
                var1_2 = var3_1 + 10;
            }
            this.j = var1_2;
            return var5_6;
        }

        long L() throws IOException {
            long l8 = 0L;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                byte by = this.F();
                l8 |= (long)(by & 0x7F) << i8;
                if ((by & 0x80) != 0) continue;
                return l8;
            }
            throw B.e();
        }

        public void N() throws IOException {
            int n8;
            while ((n8 = this.B()) != 0 && this.E(n8)) {
            }
        }

        public void O(int n8) throws IOException {
            int n9;
            int n10;
            if (n8 >= 0 && n8 <= (n10 = this.h) - (n9 = this.j)) {
                this.j = n9 + n8;
                return;
            }
            if (n8 < 0) {
                throw B.f();
            }
            throw B.k();
        }

        @Override
        public void a(int n8) throws B {
            if (this.l == n8) {
                return;
            }
            throw B.a();
        }

        @Override
        public int d() {
            return this.j - this.k;
        }

        @Override
        public boolean e() throws IOException {
            return this.j == this.h;
        }

        @Override
        public void k(int n8) {
            this.n = n8;
            this.M();
        }

        @Override
        public int l(int n8) throws B {
            if (n8 >= 0) {
                int n9;
                if ((n8 += this.d()) <= (n9 = this.n)) {
                    this.n = n8;
                    this.M();
                    return n9;
                }
                throw B.k();
            }
            throw B.f();
        }

        @Override
        public boolean m() throws IOException {
            return this.K() != 0L;
        }

        @Override
        public h n() throws IOException {
            int n8;
            int n9;
            int n10 = this.J();
            if (n10 > 0 && n10 <= (n9 = this.h) - (n8 = this.j)) {
                h h8 = this.g && this.m ? ax.r0.h.G(this.f, n8, n10) : ax.r0.h.l(this.f, n8, n10);
                this.j += n10;
                return h8;
            }
            if (n10 == 0) {
                return ax.r0.h.c0;
            }
            return ax.r0.h.E(this.G(n10));
        }

        @Override
        public double o() throws IOException {
            return Double.longBitsToDouble(this.I());
        }

        @Override
        public int p() throws IOException {
            return this.J();
        }

        @Override
        public int q() throws IOException {
            return this.H();
        }

        @Override
        public long r() throws IOException {
            return this.I();
        }

        @Override
        public float s() throws IOException {
            return Float.intBitsToFloat(this.H());
        }

        @Override
        public int t() throws IOException {
            return this.J();
        }

        @Override
        public long u() throws IOException {
            return this.K();
        }

        @Override
        public int v() throws IOException {
            return this.H();
        }

        @Override
        public long w() throws IOException {
            return this.I();
        }

        @Override
        public int x() throws IOException {
            return ax.r0.i.b(this.J());
        }

        @Override
        public long y() throws IOException {
            return ax.r0.i.c(this.K());
        }

        @Override
        public String z() throws IOException {
            int n8;
            int n9;
            int n10 = this.J();
            if (n10 > 0 && n10 <= (n9 = this.h) - (n8 = this.j)) {
                String string = new String(this.f, n8, n10, A.a);
                this.j += n10;
                return string;
            }
            if (n10 == 0) {
                return "";
            }
            if (n10 < 0) {
                throw B.f();
            }
            throw B.k();
        }
    }

    private static final class c
    extends i {
        private final InputStream f;
        private final byte[] g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m = Integer.MAX_VALUE;

        private c(InputStream inputStream, int n8) {
            A.b(inputStream, "input");
            this.f = inputStream;
            this.g = new byte[n8];
            this.h = 0;
            this.j = 0;
            this.l = 0;
        }

        private h F(int n8) throws IOException {
            byte[] byArray = this.I(n8);
            if (byArray != null) {
                return ax.r0.h.k(byArray);
            }
            int n9 = this.j;
            int n10 = this.h;
            int n11 = n10 - n9;
            this.l += n10;
            this.j = 0;
            this.h = 0;
            Object object = this.J(n8 - n11);
            byArray = new byte[n8];
            System.arraycopy(this.g, n9, byArray, 0, n11);
            Iterator<byte[]> iterator = object.iterator();
            n8 = n11;
            while (iterator.hasNext()) {
                object = iterator.next();
                System.arraycopy(object, 0, byArray, n8, ((Object)object).length);
                n8 += ((Object)object).length;
            }
            return ax.r0.h.E(byArray);
        }

        private byte[] H(int n8, boolean bl) throws IOException {
            byte[] byArray = this.I(n8);
            if (byArray != null) {
                if (bl) {
                    return (byte[])byArray.clone();
                }
                return byArray;
            }
            int n9 = this.j;
            int n10 = this.h;
            int n11 = n10 - n9;
            this.l += n10;
            this.j = 0;
            this.h = 0;
            Object object = this.J(n8 - n11);
            byArray = new byte[n8];
            System.arraycopy(this.g, n9, byArray, 0, n11);
            Iterator<byte[]> iterator = object.iterator();
            n8 = n11;
            while (iterator.hasNext()) {
                object = iterator.next();
                System.arraycopy(object, 0, byArray, n8, ((Object)object).length);
                n8 += ((Object)object).length;
            }
            return byArray;
        }

        private byte[] I(int n8) throws IOException {
            if (n8 == 0) {
                return A.c;
            }
            if (n8 >= 0) {
                int n9 = this.l;
                int n10 = this.j;
                int n11 = n9 + n10 + n8;
                if (n11 - this.c <= 0) {
                    int n12 = this.m;
                    if (n11 <= n12) {
                        n11 = this.h - n10;
                        n9 = n8 - n11;
                        if (n9 >= 4096 && n9 > this.f.available()) {
                            return null;
                        }
                        byte[] byArray = new byte[n8];
                        System.arraycopy(this.g, this.j, byArray, 0, n11);
                        this.l += this.h;
                        this.j = 0;
                        this.h = 0;
                        while (n11 < n8) {
                            n9 = this.f.read(byArray, n11, n8 - n11);
                            if (n9 != -1) {
                                this.l += n9;
                                n11 += n9;
                                continue;
                            }
                            throw B.k();
                        }
                        return byArray;
                    }
                    this.S(n12 - n9 - n10);
                    throw B.k();
                }
                throw B.j();
            }
            throw B.f();
        }

        private List<byte[]> J(int n8) throws IOException {
            ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
            while (n8 > 0) {
                int n9;
                int n10 = Math.min(n8, 4096);
                byte[] byArray = new byte[n10];
                for (int i8 = 0; i8 < n10; i8 += n9) {
                    n9 = this.f.read(byArray, i8, n10 - i8);
                    if (n9 != -1) {
                        this.l += n9;
                        continue;
                    }
                    throw B.k();
                }
                n8 -= n10;
                arrayList.add(byArray);
            }
            return arrayList;
        }

        private void P() {
            int n8;
            this.h = n8 = this.h + this.i;
            int n9 = this.l + n8;
            int n10 = this.m;
            if (n9 > n10) {
                this.i = n9 -= n10;
                this.h = n8 - n9;
                return;
            }
            this.i = 0;
        }

        private void Q(int n8) throws IOException {
            if (!this.X(n8)) {
                if (n8 > this.c - this.l - this.j) {
                    throw B.j();
                }
                throw B.k();
            }
        }

        private void T(int n8) throws IOException {
            if (n8 >= 0) {
                int n9 = this.l;
                int n10 = this.j;
                int n11 = this.m;
                if (n9 + n10 + n8 <= n11) {
                    long l8;
                    this.l = n9 + n10;
                    this.h = 0;
                    this.j = 0;
                    for (n10 = this.h - n10; n10 < n8; n10 += (int)l8) {
                        Object object;
                        try {
                            object = this.f;
                        }
                        catch (Throwable throwable) {
                            this.l += n10;
                            this.P();
                            throw throwable;
                        }
                        long l9 = n8 - n10;
                        l8 = ((InputStream)object).skip(l9);
                        long l10 = l8 - 0L;
                        n11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
                        if (n11 >= 0 && l8 <= l9) {
                            if (n11 == 0) break;
                            continue;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.f.getClass());
                        stringBuilder.append("#skip returned invalid result: ");
                        stringBuilder.append(l8);
                        stringBuilder.append("\nThe InputStream implementation is buggy.");
                        object = new IllegalStateException(stringBuilder.toString());
                        throw object;
                    }
                    this.l += n10;
                    this.P();
                    if (n10 < n8) {
                        n11 = this.h;
                        n10 = n11 - this.j;
                        this.j = n11;
                        this.Q(1);
                        while ((n9 = n8 - n10) > (n11 = this.h)) {
                            n10 += n11;
                            this.j = n11;
                            this.Q(1);
                        }
                        this.j = n9;
                    }
                    return;
                }
                this.S(n11 - n9 - n10);
                throw B.k();
            }
            throw B.f();
        }

        private void U() throws IOException {
            if (this.h - this.j >= 10) {
                this.V();
                return;
            }
            this.W();
        }

        private void V() throws IOException {
            for (int i8 = 0; i8 < 10; ++i8) {
                byte[] byArray = this.g;
                int n8 = this.j;
                this.j = n8 + 1;
                if (byArray[n8] < 0) continue;
                return;
            }
            throw B.e();
        }

        private void W() throws IOException {
            for (int i8 = 0; i8 < 10; ++i8) {
                if (this.G() < 0) continue;
                return;
            }
            throw B.e();
        }

        private boolean X(int n8) throws IOException {
            int n9 = this.j;
            int n10 = this.h;
            if (n9 + n8 > n10) {
                Object object;
                int n11 = this.c;
                int n12 = this.l;
                if (n8 > n11 - n12 - n9) {
                    return false;
                }
                if (n12 + n9 + n8 > this.m) {
                    return false;
                }
                if (n9 > 0) {
                    if (n10 > n9) {
                        object = this.g;
                        System.arraycopy(object, n9, object, 0, n10 - n9);
                    }
                    this.l += n9;
                    this.h -= n9;
                    this.j = 0;
                }
                InputStream inputStream = this.f;
                object = this.g;
                n10 = this.h;
                if ((n10 = inputStream.read((byte[])object, n10, Math.min(((byte[])object).length - n10, this.c - this.l - n10))) != 0 && n10 >= -1 && n10 <= this.g.length) {
                    if (n10 > 0) {
                        this.h += n10;
                        this.P();
                        if (this.h >= n8) {
                            return true;
                        }
                        return this.X(n8);
                    }
                    return false;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(this.f.getClass());
                ((StringBuilder)object).append("#read(byte[]) returned invalid result: ");
                ((StringBuilder)object).append(n10);
                ((StringBuilder)object).append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("refillBuffer() called when ");
            stringBuilder.append(n8);
            stringBuilder.append(" bytes were already available in buffer");
            throw new IllegalStateException(stringBuilder.toString());
        }

        @Override
        public String A() throws IOException {
            byte[] byArray;
            int n8;
            int n9;
            int n10 = this.M();
            if (n10 <= (n9 = this.h) - (n8 = this.j) && n10 > 0) {
                byArray = this.g;
                this.j = n8 + n10;
            } else {
                if (n10 == 0) {
                    return "";
                }
                n8 = 0;
                if (n10 <= n9) {
                    this.Q(n10);
                    byArray = this.g;
                    this.j = n10;
                } else {
                    byArray = this.H(n10, false);
                }
            }
            return t0.e(byArray, n8, n10);
        }

        @Override
        public int B() throws IOException {
            int n8;
            if (this.e()) {
                this.k = 0;
                return 0;
            }
            this.k = n8 = this.M();
            if (u0.a(n8) != 0) {
                return this.k;
            }
            throw B.b();
        }

        @Override
        public int C() throws IOException {
            return this.M();
        }

        @Override
        public long D() throws IOException {
            return this.N();
        }

        @Override
        public boolean E(int n8) throws IOException {
            int n9 = u0.b(n8);
            if (n9 != 0) {
                if (n9 != 1) {
                    if (n9 != 2) {
                        if (n9 != 3) {
                            if (n9 != 4) {
                                if (n9 == 5) {
                                    this.S(4);
                                    return true;
                                }
                                throw B.d();
                            }
                            return false;
                        }
                        this.R();
                        this.a(u0.c(u0.a(n8), 4));
                        return true;
                    }
                    this.S(this.M());
                    return true;
                }
                this.S(8);
                return true;
            }
            this.U();
            return true;
        }

        public byte G() throws IOException {
            if (this.j == this.h) {
                this.Q(1);
            }
            byte[] byArray = this.g;
            int n8 = this.j;
            this.j = n8 + 1;
            return byArray[n8];
        }

        public int K() throws IOException {
            int n8;
            int n9 = n8 = this.j;
            if (this.h - n8 < 4) {
                this.Q(4);
                n9 = this.j;
            }
            byte[] byArray = this.g;
            this.j = n9 + 4;
            n8 = byArray[n9];
            byte by = byArray[n9 + 1];
            byte by2 = byArray[n9 + 2];
            return (byArray[n9 + 3] & 0xFF) << 24 | (n8 & 0xFF | (by & 0xFF) << 8 | (by2 & 0xFF) << 16);
        }

        public long L() throws IOException {
            int n8;
            int n9 = n8 = this.j;
            if (this.h - n8 < 8) {
                this.Q(8);
                n9 = this.j;
            }
            byte[] byArray = this.g;
            this.j = n9 + 8;
            long l8 = byArray[n9];
            long l9 = byArray[n9 + 1];
            long l10 = byArray[n9 + 2];
            long l11 = byArray[n9 + 3];
            long l12 = byArray[n9 + 4];
            long l13 = byArray[n9 + 5];
            long l14 = byArray[n9 + 6];
            return ((long)byArray[n9 + 7] & 0xFFL) << 56 | (l8 & 0xFFL | (l9 & 0xFFL) << 8 | (l10 & 0xFFL) << 16 | (l11 & 0xFFL) << 24 | (l12 & 0xFFL) << 32 | (l13 & 0xFFL) << 40 | (l14 & 0xFFL) << 48);
        }

        /*
         * Enabled aggressive block sorting
         */
        public int M() throws IOException {
            int n8;
            int n9;
            block5: {
                int n10;
                int n11;
                block10: {
                    block9: {
                        block7: {
                            byte[] byArray;
                            block8: {
                                block6: {
                                    block4: {
                                        n9 = this.h;
                                        n11 = this.j;
                                        if (n9 == n11) {
                                            return (int)this.O();
                                        }
                                        byArray = this.g;
                                        n10 = n11 + 1;
                                        n8 = byArray[n11];
                                        if (n8 >= 0) {
                                            this.j = n10;
                                            return n8;
                                        }
                                        if (n9 - n10 < 9) {
                                            return (int)this.O();
                                        }
                                        n9 = n11 + 2;
                                        if ((n10 = byArray[n10] << 7 ^ n8) >= 0) break block4;
                                        n8 = n10 ^ 0xFFFFFF80;
                                        break block5;
                                    }
                                    n8 = n11 + 3;
                                    if ((n10 = byArray[n9] << 14 ^ n10) < 0) break block6;
                                    n9 = n10 ^ 0x3F80;
                                    break block7;
                                }
                                n9 = n11 + 4;
                                if ((n8 = n10 ^ byArray[n8] << 21) >= 0) break block8;
                                n10 = 0xFFE03F80 ^ n8;
                                n8 = n9;
                                n9 = n10;
                                break block9;
                            }
                            n10 = n11 + 5;
                            int n12 = byArray[n9];
                            n9 = n8 ^ n12 << 28 ^ 0xFE03F80;
                            n8 = n10;
                            if (n12 >= 0) break block7;
                            n8 = n12 = n11 + 6;
                            if (byArray[n10] >= 0) break block9;
                            n8 = n10 = n11 + 7;
                            if (byArray[n12] >= 0) break block7;
                            n8 = n12 = n11 + 8;
                            if (byArray[n10] >= 0) break block9;
                            n8 = n10 = n11 + 9;
                            if (byArray[n12] >= 0) break block7;
                            if (byArray[n10] < 0) {
                                return (int)this.O();
                            }
                            break block10;
                        }
                        n10 = n8;
                        n8 = n9;
                        n9 = n10;
                        break block5;
                    }
                    n10 = n8;
                    n8 = n9;
                    n9 = n10;
                    break block5;
                }
                n10 = n11 + 10;
                n8 = n9;
                n9 = n10;
            }
            this.j = n9;
            return n8;
        }

        /*
         * Unable to fully structure code
         */
        public long N() throws IOException {
            block11: {
                block16: {
                    block12: {
                        block15: {
                            block14: {
                                block13: {
                                    var2_2 = this.h;
                                    var4_1 = this.j;
                                    if (var2_2 == var4_1) break block12;
                                    var9_3 = this.g;
                                    var3_4 = var4_1 + 1;
                                    var1_5 = var9_3[var4_1];
                                    if (var1_5 >= 0) {
                                        this.j = var3_4;
                                        return var1_5;
                                    }
                                    if (var2_2 - var3_4 < 9) break block12;
                                    var2_2 = var4_1 + 2;
                                    if ((var3_4 = var9_3[var3_4] << 7 ^ var1_5) >= 0) break block13;
                                    var5_6 = var3_4 ^ -128;
                                    var1_5 = var2_2;
                                    break block11;
                                }
                                var1_5 = var4_1 + 3;
                                if ((var3_4 = var9_3[var2_2] << 14 ^ var3_4) < 0) break block14;
                                var5_6 = var3_4 ^ 16256;
                                break block11;
                            }
                            var2_2 = var4_1 + 4;
                            if ((var1_5 = var3_4 ^ var9_3[var1_5] << 21) >= 0) break block15;
                            var5_6 = -2080896 ^ var1_5;
                            var1_5 = var2_2;
                            break block11;
                        }
                        var5_6 = var1_5;
                        var1_5 = var4_1 + 5;
                        if ((var5_6 ^= (long)var9_3[var2_2] << 28) >= 0L) {
                            var7_7 = 266354560L;
lbl32:
                            // 2 sources

                            while (true) {
                                var5_6 = var7_7 ^ var5_6;
                                break block11;
                                break;
                            }
                        }
                        var2_2 = var4_1 + 6;
                        if ((var5_6 ^= (long)var9_3[var1_5] << 35) < 0L) {
                            var7_8 = -34093383808L;
                            var1_5 = var2_2;
lbl39:
                            // 2 sources

                            while (true) {
                                var5_6 = var7_8 ^ var5_6;
                                break block11;
                                break;
                            }
                        }
                        var1_5 = var4_1 + 7;
                        if ((var5_6 ^= (long)var9_3[var2_2] << 42) >= 0L) {
                            var7_7 = 4363953127296L;
                            ** continue;
                        }
                        var2_2 = var4_1 + 8;
                        if ((var5_6 ^= (long)var9_3[var1_5] << 49) < 0L) {
                            var7_8 = -558586000294016L;
                            var1_5 = var2_2;
                            ** continue;
                        }
                        var3_4 = var4_1 + 9;
                        var5_6 = var5_6 ^ (long)var9_3[var2_2] << 56 ^ 71499008037633920L;
                        var1_5 = var3_4;
                        if (var5_6 >= 0L) break block11;
                        if ((long)var9_3[var3_4] >= 0L) break block16;
                    }
                    return this.O();
                }
                var1_5 = var4_1 + 10;
            }
            this.j = var1_5;
            return var5_6;
        }

        long O() throws IOException {
            long l8 = 0L;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                byte by = this.G();
                l8 |= (long)(by & 0x7F) << i8;
                if ((by & 0x80) != 0) continue;
                return l8;
            }
            throw B.e();
        }

        public void R() throws IOException {
            int n8;
            while ((n8 = this.B()) != 0 && this.E(n8)) {
            }
        }

        public void S(int n8) throws IOException {
            int n9 = this.h;
            int n10 = this.j;
            if (n8 <= n9 - n10 && n8 >= 0) {
                this.j = n10 + n8;
                return;
            }
            this.T(n8);
        }

        @Override
        public void a(int n8) throws B {
            if (this.k == n8) {
                return;
            }
            throw B.a();
        }

        @Override
        public int d() {
            return this.l + this.j;
        }

        @Override
        public boolean e() throws IOException {
            return this.j == this.h && !this.X(1);
        }

        @Override
        public void k(int n8) {
            this.m = n8;
            this.P();
        }

        @Override
        public int l(int n8) throws B {
            if (n8 >= 0) {
                int n9 = n8 + (this.l + this.j);
                if (n9 <= (n8 = this.m)) {
                    this.m = n9;
                    this.P();
                    return n8;
                }
                throw B.k();
            }
            throw B.f();
        }

        @Override
        public boolean m() throws IOException {
            return this.N() != 0L;
        }

        @Override
        public h n() throws IOException {
            int n8;
            int n9;
            int n10 = this.M();
            if (n10 <= (n9 = this.h) - (n8 = this.j) && n10 > 0) {
                h h8 = ax.r0.h.l(this.g, n8, n10);
                this.j += n10;
                return h8;
            }
            if (n10 == 0) {
                return ax.r0.h.c0;
            }
            return this.F(n10);
        }

        @Override
        public double o() throws IOException {
            return Double.longBitsToDouble(this.L());
        }

        @Override
        public int p() throws IOException {
            return this.M();
        }

        @Override
        public int q() throws IOException {
            return this.K();
        }

        @Override
        public long r() throws IOException {
            return this.L();
        }

        @Override
        public float s() throws IOException {
            return Float.intBitsToFloat(this.K());
        }

        @Override
        public int t() throws IOException {
            return this.M();
        }

        @Override
        public long u() throws IOException {
            return this.N();
        }

        @Override
        public int v() throws IOException {
            return this.K();
        }

        @Override
        public long w() throws IOException {
            return this.L();
        }

        @Override
        public int x() throws IOException {
            return ax.r0.i.b(this.M());
        }

        @Override
        public long y() throws IOException {
            return ax.r0.i.c(this.N());
        }

        @Override
        public String z() throws IOException {
            int n8;
            int n9;
            int n10 = this.M();
            if (n10 > 0 && n10 <= (n9 = this.h) - (n8 = this.j)) {
                String string = new String(this.g, n8, n10, A.a);
                this.j += n10;
                return string;
            }
            if (n10 == 0) {
                return "";
            }
            if (n10 <= this.h) {
                this.Q(n10);
                String string = new String(this.g, this.j, n10, A.a);
                this.j += n10;
                return string;
            }
            return new String(this.H(n10, false), A.a);
        }
    }
}

