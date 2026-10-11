package ax.B2;

import android.net.Uri;
import ax.tb.C3121L;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {
    public static final a i = new a(null);
    public static final b j = new b(null, false, false, false, false, 0, 0, null, 255, null);
    private final j a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final long f;
    private final long g;
    private final Set<C0054b> h;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: ax.B2.b$b, reason: collision with other inner class name */
    public static final class C0054b {
        private final Uri a;
        private final boolean b;

        public C0054b(Uri uri, boolean z) {
            ax.Gb.l.f(uri, "uri");
            this.a = uri;
            this.b = z;
        }

        public final Uri a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!ax.Gb.l.a(C0054b.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            ax.Gb.l.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            C0054b c0054b = (C0054b) obj;
            return ax.Gb.l.a(this.a, c0054b.a) && this.b == c0054b.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + c.a(this.b);
        }
    }

    public b() {
        this(null, false, false, false, false, 0L, 0L, null, 255, null);
    }

    public final long a() {
        return this.g;
    }

    public final long b() {
        return this.f;
    }

    public final Set<C0054b> c() {
        return this.h;
    }

    public final j d() {
        return this.a;
    }

    public final boolean e() {
        return !this.h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ax.Gb.l.a(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.a == bVar.a) {
            return ax.Gb.l.a(this.h, bVar.h);
        }
        return false;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.b;
    }

    public final boolean h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j2 = this.f;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        return ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.h.hashCode();
    }

    public final boolean i() {
        return this.e;
    }

    public b(j jVar, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set<C0054b> set) {
        ax.Gb.l.f(jVar, "requiredNetworkType");
        ax.Gb.l.f(set, "contentUriTriggers");
        this.a = jVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j2;
        this.g = j3;
        this.h = set;
    }

    public /* synthetic */ b(j jVar, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set, int i2, ax.Gb.g gVar) {
        this((i2 & 1) != 0 ? j.NOT_REQUIRED : jVar, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? -1L : j2, (i2 & 64) != 0 ? -1L : j3, (i2 & 128) != 0 ? C3121L.d() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(ax.B2.b r13) {
        /*
            r12 = this;
            java.lang.String r0 = "other"
            ax.Gb.l.f(r13, r0)
            boolean r3 = r13.b
            boolean r4 = r13.c
            ax.B2.j r2 = r13.a
            boolean r5 = r13.d
            boolean r6 = r13.e
            java.util.Set<ax.B2.b$b> r11 = r13.h
            long r7 = r13.f
            long r9 = r13.g
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.B2.b.<init>(ax.B2.b):void");
    }
}
