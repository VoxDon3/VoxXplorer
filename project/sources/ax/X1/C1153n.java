package ax.X1;

import ax.S0.C0968a;
import ax.X1.L;
import ax.q1.InterfaceC2859t;
import ax.q1.U;
import java.util.Arrays;

/* renamed from: ax.X1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1153n implements InterfaceC1152m {
    private static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String a;
    private U b;
    private final O c;
    private final String d;
    private final ax.S0.G e;
    private final w f;
    private final boolean[] g;
    private final a h;
    private long i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;

    /* renamed from: ax.X1.n$a */
    private static final class a {
        private static final byte[] e = {0, 0, 1};
        private boolean a;
        public int b;
        public int c;
        public byte[] d;

        public a(int i) {
            this.d = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.b;
                if (length < i4 + i3) {
                    this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.d, this.b, i3);
                this.b += i3;
            }
        }

        public boolean b(int i, int i2) {
            if (this.a) {
                int i3 = this.b - i2;
                this.b = i3;
                if (this.c != 0 || i != 181) {
                    this.a = false;
                    return true;
                }
                this.c = i3;
            } else if (i == 179) {
                this.a = true;
            }
            byte[] bArr = e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.b = 0;
            this.c = 0;
        }
    }

    public C1153n(String str) {
        this(null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair<ax.P0.C0912v, java.lang.Long> a(ax.X1.C1153n.a r8, java.lang.String r9, java.lang.String r10) {
        /*
            byte[] r0 = r8.d
            int r1 = r8.b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            ax.P0.v$b r6 = new ax.P0.v$b
            r6.<init>()
            ax.P0.v$b r9 = r6.j0(r9)
            ax.P0.v$b r9 = r9.W(r10)
            java.lang.String r10 = "video/mpeg2"
            ax.P0.v$b r9 = r9.y0(r10)
            ax.P0.v$b r9 = r9.F0(r2)
            ax.P0.v$b r9 = r9.h0(r4)
            ax.P0.v$b r9 = r9.u0(r1)
            java.util.List r10 = java.util.Collections.singletonList(r0)
            ax.P0.v$b r9 = r9.k0(r10)
            ax.P0.v r9 = r9.P()
            r10 = r0[r5]
            r10 = r10 & 15
            int r10 = r10 + (-1)
            if (r10 < 0) goto L9d
            double[] r1 = ax.X1.C1153n.r
            int r2 = r1.length
            if (r10 >= r2) goto L9d
            r4 = r1[r10]
            int r8 = r8.c
            int r8 = r8 + 9
            r8 = r0[r8]
            r10 = r8 & 96
            int r10 = r10 >> r3
            r8 = r8 & 31
            if (r10 == r8) goto L95
            double r0 = (double) r10
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            int r8 = r8 + 1
            double r2 = (double) r8
            double r0 = r0 / r2
            double r4 = r4 * r0
        L95:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r4
            long r0 = (long) r0
            goto L9f
        L9d:
            r0 = 0
        L9f:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X1.C1153n.a(ax.X1.n$a, java.lang.String, java.lang.String):android.util.Pair");
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        ax.T0.h.c(this.g);
        this.h.c();
        w wVar = this.f;
        if (wVar != null) {
            wVar.d();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    @Override // ax.X1.InterfaceC1152m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(ax.S0.G r20) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X1.C1153n.c(ax.S0.G):void");
    }

    @Override // ax.X1.InterfaceC1152m
    public void d(InterfaceC2859t interfaceC2859t, L.d dVar) {
        dVar.a();
        this.a = dVar.b();
        this.b = interfaceC2859t.u(dVar.c(), 2);
        O o = this.c;
        if (o != null) {
            o.c(interfaceC2859t, dVar);
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
        C0968a.i(this.b);
        if (z) {
            boolean z2 = this.p;
            this.b.f(this.o, z2 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void f(long j, int i) {
        this.m = j;
    }

    C1153n(O o, String str) {
        this.c = o;
        this.d = str;
        this.g = new boolean[4];
        this.h = new a(128);
        if (o != null) {
            this.f = new w(178, 128);
            this.e = new ax.S0.G();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }
}
