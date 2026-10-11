package ax.Y1;

import android.net.Uri;
import android.util.Pair;
import ax.N1.t;
import ax.P0.C0912v;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.d0;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.M;
import ax.q1.U;
import ax.q1.Y;
import ax.q1.r;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes.dex */
public final class b implements r {
    public static final InterfaceC2863x h = new InterfaceC2863x() { // from class: ax.Y1.a
        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x a(t.a aVar) {
            return C2862w.d(this, aVar);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x b(int i) {
            return C2862w.b(this, i);
        }

        @Override // ax.q1.InterfaceC2863x
        public final r[] c() {
            return b.g();
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x d(boolean z) {
            return C2862w.c(this, z);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ r[] e(Uri uri, Map map) {
            return C2862w.a(this, uri, map);
        }
    };
    private InterfaceC2859t a;
    private U b;
    private InterfaceC0223b e;
    private int c = 0;
    private long d = -1;
    private int f = -1;
    private long g = -1;

    private static final class a implements InterfaceC0223b {
        private static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final InterfaceC2859t a;
        private final U b;
        private final ax.Y1.c c;
        private final int d;
        private final byte[] e;
        private final G f;
        private final int g;
        private final C0912v h;
        private int i;
        private long j;
        private int k;
        private long l;

        public a(InterfaceC2859t interfaceC2859t, U u, ax.Y1.c cVar) throws E {
            this.a = interfaceC2859t;
            this.b = u;
            this.c = cVar;
            int max = Math.max(1, cVar.c / 10);
            this.g = max;
            G g = new G(cVar.g);
            g.E();
            int E = g.E();
            this.d = E;
            int i = cVar.b;
            int i2 = (((cVar.e - (i * 4)) * 8) / (cVar.f * i)) + 1;
            if (E == i2) {
                int k = d0.k(max, E);
                this.e = new byte[cVar.e * k];
                this.f = new G(k * h(E, i));
                int i3 = ((cVar.c * cVar.e) * 8) / E;
                this.h = new C0912v.b().y0("audio/raw").S(i3).t0(i3).o0(h(max, i)).T(cVar.b).z0(cVar.c).s0(2).P();
                return;
            }
            throw E.a("Expected frames per block: " + i2 + "; got: " + E, null);
        }

        private void a(byte[] bArr, int i, G g) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.c.b; i3++) {
                    b(bArr, i2, i3, g.f());
                }
            }
            int g2 = g(this.d * i);
            g.b0(0);
            g.a0(g2);
        }

        private void b(byte[] bArr, int i, int i2, byte[] bArr2) {
            ax.Y1.c cVar = this.c;
            int i3 = cVar.e;
            int i4 = cVar.b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int i8 = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int min = Math.min(bArr[i5 + 2] & 255, 88);
            int i9 = n[min];
            int i10 = ((i * this.d * i4) + i2) * 2;
            bArr2[i10] = (byte) (i8 & 255);
            bArr2[i10 + 1] = (byte) (i8 >> 8);
            for (int i11 = 0; i11 < i7 * 2; i11++) {
                byte b = bArr[((i11 / 8) * i4 * 4) + i6 + ((i11 / 2) % 4)];
                int i12 = i11 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                int i13 = ((((i12 & 7) * 2) + 1) * i9) >> 3;
                if ((i12 & 8) != 0) {
                    i13 = -i13;
                }
                i8 = d0.p(i8 + i13, -32768, 32767);
                i10 += i4 * 2;
                bArr2[i10] = (byte) (i8 & 255);
                bArr2[i10 + 1] = (byte) (i8 >> 8);
                int i14 = min + m[i12];
                int[] iArr = n;
                min = d0.p(i14, 0, iArr.length - 1);
                i9 = iArr[min];
            }
        }

        private int f(int i) {
            return i / (this.c.b * 2);
        }

        private int g(int i) {
            return h(i, this.c.b);
        }

        private static int h(int i, int i2) {
            return i * 2 * i2;
        }

        private void i(int i) {
            long p1 = this.j + d0.p1(this.l, 1000000L, this.c.c);
            int g = g(i);
            this.b.f(p1, 1, g, this.k - g, null);
            this.l += i;
            this.k -= g;
        }

        @Override // ax.Y1.b.InterfaceC0223b
        public void c(long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0036 -> B:3:0x001c). Please report as a decompilation issue!!! */
        @Override // ax.Y1.b.InterfaceC0223b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean d(ax.q1.InterfaceC2858s r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.g
                int r1 = r6.k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.d
                int r0 = ax.S0.d0.k(r0, r1)
                ax.Y1.c r1 = r6.c
                int r1 = r1.e
                int r0 = r0 * r1
                r1 = 0
                r3 = 1
                int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r4 != 0) goto L1e
            L1c:
                r1 = 1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                if (r1 != 0) goto L3f
                int r2 = r6.i
                if (r2 >= r0) goto L3f
                int r2 = r0 - r2
                long r4 = (long) r2
                long r4 = java.lang.Math.min(r4, r8)
                int r2 = (int) r4
                byte[] r4 = r6.e
                int r5 = r6.i
                int r2 = r7.c(r4, r5, r2)
                r4 = -1
                if (r2 != r4) goto L39
                goto L1c
            L39:
                int r4 = r6.i
                int r4 = r4 + r2
                r6.i = r4
                goto L1f
            L3f:
                int r7 = r6.i
                ax.Y1.c r8 = r6.c
                int r8 = r8.e
                int r7 = r7 / r8
                if (r7 <= 0) goto L77
                byte[] r8 = r6.e
                ax.S0.G r9 = r6.f
                r6.a(r8, r7, r9)
                int r8 = r6.i
                ax.Y1.c r9 = r6.c
                int r9 = r9.e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.i = r8
                ax.S0.G r7 = r6.f
                int r7 = r7.j()
                ax.q1.U r8 = r6.b
                ax.S0.G r9 = r6.f
                r8.g(r9, r7)
                int r8 = r6.k
                int r8 = r8 + r7
                r6.k = r8
                int r7 = r6.f(r8)
                int r8 = r6.g
                if (r7 < r8) goto L77
                r6.i(r8)
            L77:
                if (r1 == 0) goto L84
                int r7 = r6.k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L84
                r6.i(r7)
            L84:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.Y1.b.a.d(ax.q1.s, long):boolean");
        }

        @Override // ax.Y1.b.InterfaceC0223b
        public void e(int i, long j) {
            e eVar = new e(this.c, this.d, i, j);
            this.a.h(eVar);
            this.b.e(this.h);
            this.b.d(eVar.n());
        }
    }

    /* renamed from: ax.Y1.b$b, reason: collision with other inner class name */
    private interface InterfaceC0223b {
        void c(long j);

        boolean d(InterfaceC2858s interfaceC2858s, long j) throws IOException;

        void e(int i, long j) throws E;
    }

    private static final class c implements InterfaceC0223b {
        private final InterfaceC2859t a;
        private final U b;
        private final ax.Y1.c c;
        private final C0912v d;
        private final int e;
        private long f;
        private int g;
        private long h;

        public c(InterfaceC2859t interfaceC2859t, U u, ax.Y1.c cVar, String str, int i) throws E {
            this.a = interfaceC2859t;
            this.b = u;
            this.c = cVar;
            int i2 = (cVar.b * cVar.f) / 8;
            if (cVar.e == i2) {
                int i3 = cVar.c;
                int i4 = i3 * i2 * 8;
                int max = Math.max(i2, (i3 * i2) / 10);
                this.e = max;
                this.d = new C0912v.b().W("audio/wav").y0(str).S(i4).t0(i4).o0(max).T(cVar.b).z0(cVar.c).s0(i).P();
                return;
            }
            throw E.a("Expected block size: " + i2 + "; got: " + cVar.e, null);
        }

        @Override // ax.Y1.b.InterfaceC0223b
        public void c(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }

        @Override // ax.Y1.b.InterfaceC0223b
        public boolean d(InterfaceC2858s interfaceC2858s, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
                int a = this.b.a(interfaceC2858s, (int) Math.min(i2 - i, j2), true);
                if (a == -1) {
                    j2 = 0;
                } else {
                    this.g += a;
                    j2 -= a;
                }
            }
            int i3 = this.c.e;
            int i4 = this.g / i3;
            if (i4 > 0) {
                long p1 = this.f + d0.p1(this.h, 1000000L, r1.c);
                int i5 = i4 * i3;
                int i6 = this.g - i5;
                this.b.f(p1, 1, i5, i6, null);
                this.h += i4;
                this.g = i6;
            }
            return j2 <= 0;
        }

        @Override // ax.Y1.b.InterfaceC0223b
        public void e(int i, long j) {
            e eVar = new e(this.c, 1, i, j);
            this.a.h(eVar);
            this.b.e(this.d);
            this.b.d(eVar.n());
        }
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new b()};
    }

    private void h() {
        C0968a.i(this.b);
        d0.i(this.a);
    }

    private void i(InterfaceC2858s interfaceC2858s) throws IOException {
        C0968a.g(interfaceC2858s.getPosition() == 0);
        int i = this.f;
        if (i != -1) {
            interfaceC2858s.n(i);
            this.c = 4;
        } else {
            if (!d.a(interfaceC2858s)) {
                throw E.a("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC2858s.n((int) (interfaceC2858s.i() - interfaceC2858s.getPosition()));
            this.c = 1;
        }
    }

    private void j(InterfaceC2858s interfaceC2858s) throws IOException {
        ax.Y1.c b = d.b(interfaceC2858s);
        int i = b.a;
        if (i == 17) {
            this.e = new a(this.a, this.b, b);
        } else if (i == 6) {
            this.e = new c(this.a, this.b, b, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.e = new c(this.a, this.b, b, "audio/g711-mlaw", -1);
        } else {
            int a2 = Y.a(i, b.f);
            if (a2 == 0) {
                throw E.d("Unsupported WAV format type: " + b.a);
            }
            this.e = new c(this.a, this.b, b, "audio/raw", a2);
        }
        this.c = 3;
    }

    private void l(InterfaceC2858s interfaceC2858s) throws IOException {
        this.d = d.c(interfaceC2858s);
        this.c = 2;
    }

    private int m(InterfaceC2858s interfaceC2858s) throws IOException {
        C0968a.g(this.g != -1);
        return ((InterfaceC0223b) C0968a.e(this.e)).d(interfaceC2858s, this.g - interfaceC2858s.getPosition()) ? -1 : 0;
    }

    private void n(InterfaceC2858s interfaceC2858s) throws IOException {
        Pair<Long, Long> e = d.e(interfaceC2858s);
        this.f = ((Long) e.first).intValue();
        long longValue = ((Long) e.second).longValue();
        long j = this.d;
        if (j != -1 && longValue == 4294967295L) {
            longValue = j;
        }
        this.g = this.f + longValue;
        long length = interfaceC2858s.getLength();
        if (length != -1 && this.g > length) {
            C0987u.h("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
            this.g = length;
        }
        ((InterfaceC0223b) C0968a.e(this.e)).e(this.f, this.g);
        this.c = 4;
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.a = interfaceC2859t;
        this.b = interfaceC2859t.u(0, 1);
        interfaceC2859t.o();
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        InterfaceC0223b interfaceC0223b = this.e;
        if (interfaceC0223b != null) {
            interfaceC0223b.c(j2);
        }
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        return d.a(interfaceC2858s);
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        h();
        int i = this.c;
        if (i == 0) {
            i(interfaceC2858s);
            return 0;
        }
        if (i == 1) {
            l(interfaceC2858s);
            return 0;
        }
        if (i == 2) {
            j(interfaceC2858s);
            return 0;
        }
        if (i == 3) {
            n(interfaceC2858s);
            return 0;
        }
        if (i == 4) {
            return m(interfaceC2858s);
        }
        throw new IllegalStateException();
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    @Override // ax.q1.r
    public void d() {
    }
}
