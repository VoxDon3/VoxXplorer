/*
 * Decompiled with CFR 0.152.
 */
package ax.Gc;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;

class b
implements Closeable,
AutoCloseable {
    private static final short[] g0 = new short[]{96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};
    private static final int[] h0 = new int[]{16, 32, 48, 64, 81, 113, 146, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};
    private static final int[] i0 = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    private static final int[] j0;
    private static final int[] k0;
    private c c0;
    private ax.Kc.b d0;
    private final InputStream e0;
    private final d f0 = new d();
    private boolean q;

    static {
        int[] nArray = new int[288];
        j0 = nArray;
        Arrays.fill(nArray, 0, 144, 8);
        Arrays.fill(nArray, 144, 256, 9);
        Arrays.fill(nArray, 256, 280, 7);
        Arrays.fill(nArray, 280, 288, 8);
        nArray = new int[32];
        k0 = nArray;
        Arrays.fill(nArray, 5);
    }

    b(InputStream inputStream) {
        this.d0 = new ax.Kc.b(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.e0 = inputStream;
        this.c0 = new f();
    }

    /*
     * Unable to fully structure code
     */
    private static void A(ax.Kc.b var0, int[] var1_1, int[] var2_2) throws IOException {
        var4_3 = (int)(b.H(var0, 4) + 4L);
        var12_4 = new int[19];
        for (var3_5 = 0; var3_5 < var4_3; ++var3_5) {
            var12_4[b.i0[var3_5]] = (int)b.H(var0, 3);
        }
        var13_6 = b.o(var12_4);
        var7_7 = var1_1.length + var2_2.length;
        var12_4 = new int[var7_7];
        var5_8 = -1;
        var4_3 = 0;
        var3_5 = 0;
        block6: while (var4_3 < var7_7) {
            if (var3_5 > 0) {
                var12_4[var4_3] = var5_8;
                --var3_5;
                ++var4_3;
                continue;
            }
            var6_9 = b.v(var0, var13_6);
            if (var6_9 < 16) {
                var12_4[var4_3] = var6_9;
                ++var4_3;
                var5_8 = var6_9;
                continue;
            }
            var10_11 = 3L;
            switch (var6_9) {
                default: {
                    continue block6;
                }
                case 18: {
                    var8_10 = b.H(var0, 7);
                    var10_11 = 11L;
lbl31:
                    // 2 sources

                    while (true) {
                        var3_5 = (int)(var8_10 + var10_11);
                        var5_8 = 0;
                        continue block6;
                        break;
                    }
                }
                case 17: {
                    var8_10 = b.H(var0, 3);
                    ** continue;
                }
                case 16: 
            }
            var3_5 = (int)(b.H(var0, 2) + 3L);
        }
        System.arraycopy(var12_4, 0, var1_1, 0, var1_1.length);
        System.arraycopy(var12_4, var1_1.length, var2_2, 0, var2_2.length);
    }

    private long F(int n8) throws IOException {
        return b.H(this.d0, n8);
    }

    private static long H(ax.Kc.b b8, int n8) throws IOException {
        long l8 = b8.j(n8);
        if (l8 != -1L) {
            return l8;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }

    private int[][] L() throws IOException {
        int[] nArray = new int[(int)(this.F(5) + 257L)];
        int[] nArray2 = new int[(int)(this.F(5) + 1L)];
        int[][] nArrayArray = new int[][]{nArray, nArray2};
        b.A(this.d0, nArrayArray[0], nArrayArray[1]);
        return nArrayArray;
    }

    private void W() throws IOException {
        this.d0.a();
        long l8 = this.F(16);
        if ((0xFFFFL & (l8 ^ 0xFFFFL)) == this.F(16)) {
            this.c0 = new g(this, l8);
            return;
        }
        throw new IllegalStateException("Illegal LEN / NLEN values");
    }

    private static b o(int[] nArray) {
        int[] nArray2 = b.u(nArray);
        b b8 = new b(0);
        for (int i8 = 0; i8 < nArray.length; ++i8) {
            int n8 = nArray[i8];
            if (n8 == 0) continue;
            int n9 = n8 - 1;
            int n10 = nArray2[n9];
            b b9 = b8;
            for (n8 = n9; n8 >= 0; --n8) {
                b9 = (1 << n8 & n10) == 0 ? b9.b() : b9.c();
                if (b9 != null) {
                    continue;
                }
                throw new IllegalStateException("node doesn't exist in Huffman tree");
            }
            b9.a(i8);
            nArray2[n9] = nArray2[n9] + 1;
        }
        return b8;
    }

    private static int[] u(int[] object) {
        int n8;
        int[] nArray = new int[65];
        int n9 = ((int[])object).length;
        int n10 = 0;
        int n11 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            int n12 = object[n8];
            if (n12 >= 0 && n12 <= 64) {
                n11 = Math.max(n11, n12);
                nArray[n12] = nArray[n12] + 1;
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid code ");
            ((StringBuilder)object).append(n12);
            ((StringBuilder)object).append(" in literal table");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        n8 = n11 + 1;
        object = Arrays.copyOf(nArray, n8);
        nArray = new int[n8];
        n9 = 0;
        n8 = n10;
        n10 = n9;
        while (n8 <= n11) {
            nArray[n8] = n10 = n10 + object[n8] << 1;
            ++n8;
        }
        return nArray;
    }

    private static int v(ax.Kc.b b8, b b9) throws IOException {
        while (b9 != null && b9.b == -1) {
            if (b.H(b8, 1) == 0L) {
                b9 = b9.c;
                continue;
            }
            b9 = b9.d;
        }
        if (b9 != null) {
            return b9.b;
        }
        return -1;
    }

    @Override
    public void close() {
        this.c0 = new f();
        this.d0 = null;
    }

    int m() throws IOException {
        return this.c0.a();
    }

    public int p(byte[] object, int n8, int n9) throws IOException {
        int n10;
        while (true) {
            if (this.q && !this.c0.b()) {
                return -1;
            }
            if (this.c0.d() == ax.Gc.c.q) {
                boolean bl = this.F(1) == 1L;
                this.q = bl;
                n10 = (int)this.F(2);
                if (n10 != 0) {
                    if (n10 != 1) {
                        if (n10 == 2) {
                            int[][] nArray = this.L();
                            this.c0 = new e(this, ax.Gc.c.d0, nArray[0], nArray[1]);
                            continue;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Unsupported compression: ");
                        ((StringBuilder)object).append(n10);
                        throw new IllegalStateException(((StringBuilder)object).toString());
                    }
                    this.c0 = new e(this, ax.Gc.c.e0, j0, k0);
                    continue;
                }
                this.W();
                continue;
            }
            n10 = this.c0.c((byte[])object, n8, n9);
            if (n10 != 0) break;
        }
        return n10;
    }

    long q() {
        return this.d0.f();
    }

    private static class b {
        private final int a;
        int b = -1;
        b c;
        b d;

        private b(int n8) {
            this.a = n8;
        }

        void a(int n8) {
            this.b = n8;
            this.c = null;
            this.d = null;
        }

        b b() {
            if (this.c == null && this.b == -1) {
                this.c = new b(this.a + 1);
            }
            return this.c;
        }

        b c() {
            if (this.d == null && this.b == -1) {
                this.d = new b(this.a + 1);
            }
            return this.d;
        }
    }

    private static abstract class c {
        private c() {
        }

        abstract int a() throws IOException;

        abstract boolean b();

        abstract int c(byte[] var1, int var2, int var3) throws IOException;

        abstract ax.Gc.c d();
    }

    private static class d {
        private final byte[] a;
        private final int b;
        private int c;
        private boolean d;

        private d() {
            this(16);
        }

        private d(int n8) {
            byte[] byArray = new byte[1 << n8];
            this.a = byArray;
            this.b = byArray.length - 1;
        }

        private int c(int n8) {
            int n9 = n8 + 1 & this.b;
            if (!this.d && n9 < n8) {
                this.d = true;
            }
            return n9;
        }

        byte a(byte by) {
            byte[] byArray = this.a;
            int n8 = this.c;
            byArray[n8] = by;
            this.c = this.c(n8);
            return by;
        }

        void b(byte[] byArray, int n8, int n9) {
            for (int i8 = n8; i8 < n8 + n9; ++i8) {
                this.a(byArray[i8]);
            }
        }

        void d(int n8, int n9, byte[] object) {
            if (n8 <= this.a.length) {
                int n10 = this.c;
                int n11 = n10 - n8 & this.b;
                if (!this.d && n11 >= n10) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Attempt to read beyond memory: dist=");
                    ((StringBuilder)object).append(n8);
                    throw new IllegalStateException(((StringBuilder)object).toString());
                }
                for (n8 = 0; n8 < n9; ++n8) {
                    object[n8] = this.a(this.a[n11]);
                    n11 = this.c(n11);
                }
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Illegal distance parameter: ");
            ((StringBuilder)object).append(n8);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
    }

    private class e
    extends c {
        private boolean a;
        private final ax.Gc.c b;
        private final b c;
        private final b d;
        private int e;
        private byte[] f;
        private int g;
        final b h;

        e(b b8, ax.Gc.c c8, int[] nArray, int[] nArray2) {
            this.h = b8;
            this.f = ax.Kc.f.a;
            this.b = c8;
            this.c = ax.Gc.b.o(nArray);
            this.d = ax.Gc.b.o(nArray2);
        }

        private int e(byte[] byArray, int n8, int n9) {
            int n10 = this.g - this.e;
            if (n10 > 0) {
                n9 = Math.min(n9, n10);
                System.arraycopy(this.f, this.e, byArray, n8, n9);
                this.e += n9;
                return n9;
            }
            return 0;
        }

        private int f(byte[] byArray, int n8, int n9) throws IOException {
            if (this.a) {
                return -1;
            }
            int n10 = this.e(byArray, n8, n9);
            while (n10 < n9) {
                int n11 = ax.Gc.b.v(this.h.d0, this.c);
                if (n11 < 256) {
                    byArray[n10 + n8] = this.h.f0.a((byte)n11);
                    ++n10;
                    continue;
                }
                if (n11 > 256) {
                    n11 = g0[n11 - 257];
                    n11 = (int)((long)(n11 >>> 5) + this.h.F(n11 & 0x1F));
                    int n12 = ax.Gc.b.v(this.h.d0, this.d);
                    n12 = h0[n12];
                    n12 = (int)((long)(n12 >>> 4) + this.h.F(n12 & 0xF));
                    if (this.f.length < n11) {
                        this.f = new byte[n11];
                    }
                    this.g = n11;
                    this.e = 0;
                    this.h.f0.d(n12, n11, this.f);
                    n10 += this.e(byArray, n8 + n10, n9 - n10);
                    continue;
                }
                this.a = true;
                break;
            }
            return n10;
        }

        @Override
        int a() {
            return this.g - this.e;
        }

        @Override
        boolean b() {
            return this.a ^ true;
        }

        @Override
        int c(byte[] byArray, int n8, int n9) throws IOException {
            if (n9 == 0) {
                return 0;
            }
            return this.f(byArray, n8, n9);
        }

        @Override
        ax.Gc.c d() {
            if (this.a) {
                return ax.Gc.c.q;
            }
            return this.b;
        }
    }

    private static class f
    extends c {
        private f() {
        }

        @Override
        int a() {
            return 0;
        }

        @Override
        boolean b() {
            return false;
        }

        @Override
        int c(byte[] byArray, int n8, int n9) throws IOException {
            if (n9 == 0) {
                return 0;
            }
            throw new IllegalStateException("Cannot read in this state");
        }

        @Override
        ax.Gc.c d() {
            return ax.Gc.c.q;
        }
    }

    private class g
    extends c {
        private final long a;
        private long b;
        final b c;

        private g(b b8, long l8) {
            this.c = b8;
            this.a = l8;
        }

        @Override
        int a() throws IOException {
            return (int)Math.min(this.a - this.b, this.c.d0.b() / 8L);
        }

        @Override
        boolean b() {
            return this.b < this.a;
        }

        @Override
        int c(byte[] byArray, int n8, int n9) throws IOException {
            int n10 = 0;
            if (n9 == 0) {
                return 0;
            }
            int n11 = (int)Math.min(this.a - this.b, (long)n9);
            for (n9 = n10; n9 < n11; n9 += n10) {
                block7: {
                    block6: {
                        int n12;
                        block5: {
                            if (this.c.d0.c() <= 0) break block5;
                            byte by = (byte)this.c.F(8);
                            byArray[n8 + n9] = this.c.f0.a(by);
                            n10 = 1;
                            break block6;
                        }
                        InputStream inputStream = this.c.e0;
                        n10 = inputStream.read(byArray, n12 = n8 + n9, n11 - n9);
                        if (n10 == -1) break block7;
                        this.c.f0.b(byArray, n12, n10);
                    }
                    this.b += (long)n10;
                    continue;
                }
                throw new EOFException("Truncated Deflate64 Stream");
            }
            return n11;
        }

        @Override
        ax.Gc.c d() {
            if (this.b < this.a) {
                return ax.Gc.c.c0;
            }
            return ax.Gc.c.q;
        }
    }
}

