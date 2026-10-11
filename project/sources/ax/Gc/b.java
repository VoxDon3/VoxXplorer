package ax.Gc;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
class b implements Closeable, AutoCloseable {
    private static final short[] g0 = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};
    private static final int[] h0 = {16, 32, 48, 64, 81, 113, 146, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};
    private static final int[] i0 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    private static final int[] j0;
    private static final int[] k0;
    private c c0;
    private ax.Kc.b d0;
    private final InputStream e0;
    private final d f0;
    private boolean q;

    /* renamed from: ax.Gc.b$b, reason: collision with other inner class name */
    private static class C0086b {
        private final int a;
        int b;
        C0086b c;
        C0086b d;

        void a(int i) {
            this.b = i;
            this.c = null;
            this.d = null;
        }

        C0086b b() {
            if (this.c == null && this.b == -1) {
                this.c = new C0086b(this.a + 1);
            }
            return this.c;
        }

        C0086b c() {
            if (this.d == null && this.b == -1) {
                this.d = new C0086b(this.a + 1);
            }
            return this.d;
        }

        private C0086b(int i) {
            this.b = -1;
            this.a = i;
        }
    }

    private static abstract class c {
        private c() {
        }

        abstract int a() throws IOException;

        abstract boolean b();

        abstract int c(byte[] bArr, int i, int i2) throws IOException;

        abstract ax.Gc.c d();
    }

    private static class d {
        private final byte[] a;
        private final int b;
        private int c;
        private boolean d;

        private int c(int i) {
            int i2 = (i + 1) & this.b;
            if (!this.d && i2 < i) {
                this.d = true;
            }
            return i2;
        }

        byte a(byte b) {
            byte[] bArr = this.a;
            int i = this.c;
            bArr[i] = b;
            this.c = c(i);
            return b;
        }

        void b(byte[] bArr, int i, int i2) {
            for (int i3 = i; i3 < i + i2; i3++) {
                a(bArr[i3]);
            }
        }

        void d(int i, int i2, byte[] bArr) {
            if (i > this.a.length) {
                throw new IllegalStateException("Illegal distance parameter: " + i);
            }
            int i3 = this.c;
            int i4 = (i3 - i) & this.b;
            if (!this.d && i4 >= i3) {
                throw new IllegalStateException("Attempt to read beyond memory: dist=" + i);
            }
            int i5 = 0;
            while (i5 < i2) {
                bArr[i5] = a(this.a[i4]);
                i5++;
                i4 = c(i4);
            }
        }

        private d() {
            this(16);
        }

        private d(int i) {
            byte[] bArr = new byte[1 << i];
            this.a = bArr;
            this.b = bArr.length - 1;
        }
    }

    private class e extends c {
        private boolean a;
        private final ax.Gc.c b;
        private final C0086b c;
        private final C0086b d;
        private int e;
        private byte[] f;
        private int g;

        e(ax.Gc.c cVar, int[] iArr, int[] iArr2) {
            super();
            this.f = ax.Kc.f.a;
            this.b = cVar;
            this.c = b.o(iArr);
            this.d = b.o(iArr2);
        }

        private int e(byte[] bArr, int i, int i2) {
            int i3 = this.g - this.e;
            if (i3 <= 0) {
                return 0;
            }
            int min = Math.min(i2, i3);
            System.arraycopy(this.f, this.e, bArr, i, min);
            this.e += min;
            return min;
        }

        private int f(byte[] bArr, int i, int i2) throws IOException {
            if (this.a) {
                return -1;
            }
            int e = e(bArr, i, i2);
            while (true) {
                if (e < i2) {
                    int v = b.v(b.this.d0, this.c);
                    if (v >= 256) {
                        if (v <= 256) {
                            this.a = true;
                            break;
                        }
                        int F = (int) ((r1 >>> 5) + b.this.F(b.g0[v - 257] & 31));
                        int F2 = (int) ((r2 >>> 4) + b.this.F(b.h0[b.v(b.this.d0, this.d)] & 15));
                        if (this.f.length < F) {
                            this.f = new byte[F];
                        }
                        this.g = F;
                        this.e = 0;
                        b.this.f0.d(F2, F, this.f);
                        e += e(bArr, i + e, i2 - e);
                    } else {
                        bArr[e + i] = b.this.f0.a((byte) v);
                        e++;
                    }
                } else {
                    break;
                }
            }
            return e;
        }

        @Override // ax.Gc.b.c
        int a() {
            return this.g - this.e;
        }

        @Override // ax.Gc.b.c
        boolean b() {
            return !this.a;
        }

        @Override // ax.Gc.b.c
        int c(byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            return f(bArr, i, i2);
        }

        @Override // ax.Gc.b.c
        ax.Gc.c d() {
            return this.a ? ax.Gc.c.INITIAL : this.b;
        }
    }

    private static class f extends c {
        private f() {
            super();
        }

        @Override // ax.Gc.b.c
        int a() {
            return 0;
        }

        @Override // ax.Gc.b.c
        boolean b() {
            return false;
        }

        @Override // ax.Gc.b.c
        int c(byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            throw new IllegalStateException("Cannot read in this state");
        }

        @Override // ax.Gc.b.c
        ax.Gc.c d() {
            return ax.Gc.c.INITIAL;
        }
    }

    private class g extends c {
        private final long a;
        private long b;

        @Override // ax.Gc.b.c
        int a() throws IOException {
            return (int) Math.min(this.a - this.b, b.this.d0.b() / 8);
        }

        @Override // ax.Gc.b.c
        boolean b() {
            return this.b < this.a;
        }

        @Override // ax.Gc.b.c
        int c(byte[] bArr, int i, int i2) throws IOException {
            int read;
            int i3 = 0;
            if (i2 == 0) {
                return 0;
            }
            int min = (int) Math.min(this.a - this.b, i2);
            while (i3 < min) {
                if (b.this.d0.c() > 0) {
                    bArr[i + i3] = b.this.f0.a((byte) b.this.F(8));
                    read = 1;
                } else {
                    int i4 = i + i3;
                    read = b.this.e0.read(bArr, i4, min - i3);
                    if (read == -1) {
                        throw new EOFException("Truncated Deflate64 Stream");
                    }
                    b.this.f0.b(bArr, i4, read);
                }
                this.b += read;
                i3 += read;
            }
            return min;
        }

        @Override // ax.Gc.b.c
        ax.Gc.c d() {
            return this.b < this.a ? ax.Gc.c.STORED : ax.Gc.c.INITIAL;
        }

        private g(long j) {
            super();
            this.a = j;
        }
    }

    static {
        int[] iArr = new int[288];
        j0 = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        k0 = iArr2;
        Arrays.fill(iArr2, 5);
    }

    b(InputStream inputStream) {
        this.f0 = new d();
        this.d0 = new ax.Kc.b(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.e0 = inputStream;
        this.c0 = new f();
    }

    private static void A(ax.Kc.b bVar, int[] iArr, int[] iArr2) throws IOException {
        long H;
        int H2 = (int) (H(bVar, 4) + 4);
        int[] iArr3 = new int[19];
        for (int i = 0; i < H2; i++) {
            iArr3[i0[i]] = (int) H(bVar, 3);
        }
        C0086b o = o(iArr3);
        int length = iArr.length + iArr2.length;
        int[] iArr4 = new int[length];
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            if (i4 > 0) {
                iArr4[i3] = i2;
                i4--;
                i3++;
            } else {
                int v = v(bVar, o);
                if (v < 16) {
                    iArr4[i3] = v;
                    i3++;
                    i2 = v;
                } else {
                    long j = 3;
                    switch (v) {
                        case 16:
                            i4 = (int) (H(bVar, 2) + 3);
                            continue;
                        case 17:
                            H = H(bVar, 3);
                            break;
                        case 18:
                            H = H(bVar, 7);
                            j = 11;
                            break;
                    }
                    i4 = (int) (H + j);
                    i2 = 0;
                }
            }
        }
        System.arraycopy(iArr4, 0, iArr, 0, iArr.length);
        System.arraycopy(iArr4, iArr.length, iArr2, 0, iArr2.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long F(int i) throws IOException {
        return H(this.d0, i);
    }

    private static long H(ax.Kc.b bVar, int i) throws IOException {
        long j = bVar.j(i);
        if (j != -1) {
            return j;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }

    private int[][] L() throws IOException {
        int[][] iArr = {new int[(int) (F(5) + 257)], new int[(int) (F(5) + 1)]};
        A(this.d0, iArr[0], iArr[1]);
        return iArr;
    }

    private void W() throws IOException {
        this.d0.a();
        long F = F(16);
        if ((WebSocketProtocol.PAYLOAD_SHORT_MAX & (F ^ WebSocketProtocol.PAYLOAD_SHORT_MAX)) != F(16)) {
            throw new IllegalStateException("Illegal LEN / NLEN values");
        }
        this.c0 = new g(F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C0086b o(int[] iArr) {
        int[] u = u(iArr);
        int i = 0;
        C0086b c0086b = new C0086b(i);
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 != 0) {
                int i3 = i2 - 1;
                int i4 = u[i3];
                C0086b c0086b2 = c0086b;
                for (int i5 = i3; i5 >= 0; i5--) {
                    c0086b2 = ((1 << i5) & i4) == 0 ? c0086b2.b() : c0086b2.c();
                    if (c0086b2 == null) {
                        throw new IllegalStateException("node doesn't exist in Huffman tree");
                    }
                }
                c0086b2.a(i);
                u[i3] = u[i3] + 1;
            }
            i++;
        }
        return c0086b;
    }

    private static int[] u(int[] iArr) {
        int[] iArr2 = new int[65];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 0 || i2 > 64) {
                throw new IllegalArgumentException("Invalid code " + i2 + " in literal table");
            }
            i = Math.max(i, i2);
            iArr2[i2] = iArr2[i2] + 1;
        }
        int i3 = i + 1;
        int[] copyOf = Arrays.copyOf(iArr2, i3);
        int[] iArr3 = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 <= i; i5++) {
            i4 = (i4 + copyOf[i5]) << 1;
            iArr3[i5] = i4;
        }
        return iArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int v(ax.Kc.b bVar, C0086b c0086b) throws IOException {
        while (c0086b != null && c0086b.b == -1) {
            c0086b = H(bVar, 1) == 0 ? c0086b.c : c0086b.d;
        }
        if (c0086b != null) {
            return c0086b.b;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c0 = new f();
        this.d0 = null;
    }

    int m() throws IOException {
        return this.c0.a();
    }

    public int p(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            if (this.q && !this.c0.b()) {
                return -1;
            }
            if (this.c0.d() == ax.Gc.c.INITIAL) {
                this.q = F(1) == 1;
                int F = (int) F(2);
                if (F == 0) {
                    W();
                } else if (F == 1) {
                    this.c0 = new e(ax.Gc.c.FIXED_CODES, j0, k0);
                } else {
                    if (F != 2) {
                        throw new IllegalStateException("Unsupported compression: " + F);
                    }
                    int[][] L = L();
                    this.c0 = new e(ax.Gc.c.DYNAMIC_CODES, L[0], L[1]);
                }
            } else {
                int c2 = this.c0.c(bArr, i, i2);
                if (c2 != 0) {
                    return c2;
                }
            }
        }
    }

    long q() {
        return this.d0.f();
    }
}
