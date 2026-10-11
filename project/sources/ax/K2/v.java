package ax.K2;

import ax.x.InterfaceC3393a;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class v {
    public static final a u = new a(null);
    private static final String v;
    public static final InterfaceC3393a<List<Object>, List<Object>> w;
    public final String a;
    public ax.B2.r b;
    public String c;
    public String d;
    public androidx.work.b e;
    public androidx.work.b f;
    public long g;
    public long h;
    public long i;
    public ax.B2.b j;
    public int k;
    public ax.B2.a l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public ax.B2.m r;
    private int s;
    private final int t;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b {
        public String a;
        public ax.B2.r b;

        public b(String str, ax.B2.r rVar) {
            ax.Gb.l.f(str, "id");
            ax.Gb.l.f(rVar, "state");
            this.a = str;
            this.b = rVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return ax.Gb.l.a(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
        }
    }

    static {
        String i = ax.B2.i.i("WorkSpec");
        ax.Gb.l.e(i, "tagWithPrefix(\"WorkSpec\")");
        v = i;
        w = new InterfaceC3393a() { // from class: ax.K2.u
        };
    }

    public v(String str, ax.B2.r rVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j, long j2, long j3, ax.B2.b bVar3, int i, ax.B2.a aVar, long j4, long j5, long j6, long j7, boolean z, ax.B2.m mVar, int i2, int i3) {
        ax.Gb.l.f(str, "id");
        ax.Gb.l.f(rVar, "state");
        ax.Gb.l.f(str2, "workerClassName");
        ax.Gb.l.f(bVar, "input");
        ax.Gb.l.f(bVar2, "output");
        ax.Gb.l.f(bVar3, "constraints");
        ax.Gb.l.f(aVar, "backoffPolicy");
        ax.Gb.l.f(mVar, "outOfQuotaPolicy");
        this.a = str;
        this.b = rVar;
        this.c = str2;
        this.d = str3;
        this.e = bVar;
        this.f = bVar2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = bVar3;
        this.k = i;
        this.l = aVar;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = mVar;
        this.s = i2;
        this.t = i3;
    }

    public static /* synthetic */ v c(v vVar, String str, ax.B2.r rVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j, long j2, long j3, ax.B2.b bVar3, int i, ax.B2.a aVar, long j4, long j5, long j6, long j7, boolean z, ax.B2.m mVar, int i2, int i3, int i4, Object obj) {
        int i5;
        ax.B2.m mVar2;
        String str4 = (i4 & 1) != 0 ? vVar.a : str;
        ax.B2.r rVar2 = (i4 & 2) != 0 ? vVar.b : rVar;
        String str5 = (i4 & 4) != 0 ? vVar.c : str2;
        String str6 = (i4 & 8) != 0 ? vVar.d : str3;
        androidx.work.b bVar4 = (i4 & 16) != 0 ? vVar.e : bVar;
        androidx.work.b bVar5 = (i4 & 32) != 0 ? vVar.f : bVar2;
        long j8 = (i4 & 64) != 0 ? vVar.g : j;
        long j9 = (i4 & 128) != 0 ? vVar.h : j2;
        long j10 = (i4 & 256) != 0 ? vVar.i : j3;
        ax.B2.b bVar6 = (i4 & 512) != 0 ? vVar.j : bVar3;
        int i6 = (i4 & 1024) != 0 ? vVar.k : i;
        String str7 = str4;
        ax.B2.a aVar2 = (i4 & 2048) != 0 ? vVar.l : aVar;
        ax.B2.r rVar3 = rVar2;
        long j11 = (i4 & 4096) != 0 ? vVar.m : j4;
        long j12 = (i4 & 8192) != 0 ? vVar.n : j5;
        long j13 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? vVar.o : j6;
        long j14 = (i4 & 32768) != 0 ? vVar.p : j7;
        boolean z2 = (i4 & 65536) != 0 ? vVar.q : z;
        long j15 = j14;
        ax.B2.m mVar3 = (i4 & 131072) != 0 ? vVar.r : mVar;
        int i7 = (i4 & 262144) != 0 ? vVar.s : i2;
        if ((i4 & 524288) != 0) {
            mVar2 = mVar3;
            i5 = vVar.t;
        } else {
            i5 = i3;
            mVar2 = mVar3;
        }
        return vVar.b(str7, rVar3, str5, str6, bVar4, bVar5, j8, j9, j10, bVar6, i6, aVar2, j11, j12, j13, j15, z2, mVar2, i7, i5);
    }

    public final long a() {
        if (g()) {
            return this.n + ax.Lb.f.e(this.l == ax.B2.a.LINEAR ? this.m * this.k : (long) Math.scalb(this.m, this.k - 1), 18000000L);
        }
        if (!h()) {
            long j = this.n;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            return j + this.g;
        }
        int i = this.s;
        long j2 = this.n;
        if (i == 0) {
            j2 += this.g;
        }
        long j3 = this.i;
        long j4 = this.h;
        if (j3 != j4) {
            return j2 + j4 + (i == 0 ? (-1) * j3 : 0L);
        }
        return j2 + (i != 0 ? j4 : 0L);
    }

    public final v b(String str, ax.B2.r rVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j, long j2, long j3, ax.B2.b bVar3, int i, ax.B2.a aVar, long j4, long j5, long j6, long j7, boolean z, ax.B2.m mVar, int i2, int i3) {
        ax.Gb.l.f(str, "id");
        ax.Gb.l.f(rVar, "state");
        ax.Gb.l.f(str2, "workerClassName");
        ax.Gb.l.f(bVar, "input");
        ax.Gb.l.f(bVar2, "output");
        ax.Gb.l.f(bVar3, "constraints");
        ax.Gb.l.f(aVar, "backoffPolicy");
        ax.Gb.l.f(mVar, "outOfQuotaPolicy");
        return new v(str, rVar, str2, str3, bVar, bVar2, j, j2, j3, bVar3, i, aVar, j4, j5, j6, j7, z, mVar, i2, i3);
    }

    public final int d() {
        return this.t;
    }

    public final int e() {
        return this.s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return ax.Gb.l.a(this.a, vVar.a) && this.b == vVar.b && ax.Gb.l.a(this.c, vVar.c) && ax.Gb.l.a(this.d, vVar.d) && ax.Gb.l.a(this.e, vVar.e) && ax.Gb.l.a(this.f, vVar.f) && this.g == vVar.g && this.h == vVar.h && this.i == vVar.i && ax.Gb.l.a(this.j, vVar.j) && this.k == vVar.k && this.l == vVar.l && this.m == vVar.m && this.n == vVar.n && this.o == vVar.o && this.p == vVar.p && this.q == vVar.q && this.r == vVar.r && this.s == vVar.s && this.t == vVar.t;
    }

    public final boolean f() {
        return !ax.Gb.l.a(ax.B2.b.j, this.j);
    }

    public final boolean g() {
        return this.b == ax.B2.r.ENQUEUED && this.k > 0;
    }

    public final boolean h() {
        return this.h != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + t.a(this.g)) * 31) + t.a(this.h)) * 31) + t.a(this.i)) * 31) + this.j.hashCode()) * 31) + this.k) * 31) + this.l.hashCode()) * 31) + t.a(this.m)) * 31) + t.a(this.n)) * 31) + t.a(this.o)) * 31) + t.a(this.p)) * 31;
        boolean z = this.q;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((hashCode2 + i) * 31) + this.r.hashCode()) * 31) + this.s) * 31) + this.t;
    }

    public String toString() {
        return "{WorkSpec: " + this.a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ v(java.lang.String r31, ax.B2.r r32, java.lang.String r33, java.lang.String r34, androidx.work.b r35, androidx.work.b r36, long r37, long r39, long r41, ax.B2.b r43, int r44, ax.B2.a r45, long r46, long r48, long r50, long r52, boolean r54, ax.B2.m r55, int r56, int r57, int r58, ax.Gb.g r59) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.K2.v.<init>(java.lang.String, ax.B2.r, java.lang.String, java.lang.String, androidx.work.b, androidx.work.b, long, long, long, ax.B2.b, int, ax.B2.a, long, long, long, long, boolean, ax.B2.m, int, int, int, ax.Gb.g):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(String str, String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        ax.Gb.l.f(str, "id");
        ax.Gb.l.f(str2, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(String str, v vVar) {
        this(str, vVar.b, vVar.c, vVar.d, new androidx.work.b(vVar.e), new androidx.work.b(vVar.f), vVar.g, vVar.h, vVar.i, new ax.B2.b(vVar.j), vVar.k, vVar.l, vVar.m, vVar.n, vVar.o, vVar.p, vVar.q, vVar.r, vVar.s, 0, 524288, null);
        ax.Gb.l.f(str, "newId");
        ax.Gb.l.f(vVar, "other");
    }
}
