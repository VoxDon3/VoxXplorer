package ax.d1;

import android.net.Uri;
import ax.P0.C0906o;
import ax.P0.L;
import ax.S0.C0968a;
import ax.d1.f;
import ax.r7.AbstractC2962A;
import ax.r7.AbstractC2991z;
import ax.r7.F;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class f extends j {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final C0906o q;
    public final List<C0275f> r;
    public final List<d> s;
    public final Map<Uri, e> t;
    public final long u;
    public final h v;
    public final AbstractC2991z<c> w;

    public static final class c {
        public final String a;
        public final Uri b;
        public final Uri c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;
        public final List<String> h;
        public final boolean i;
        public final long j;
        public final long k;
        public final AbstractC2991z<String> l;
        public final AbstractC2991z<String> m;
        public final AbstractC2991z<b> n;
        public final boolean o;
        public final String p;
        public final String q;

        public static final class a {
            private final String a;
            private Uri c;
            private Uri d;
            private boolean j;
            private Boolean o;
            private String p;
            private String q;
            private final Map<String, b> b = new HashMap();
            private long e = -9223372036854775807L;
            private long f = -9223372036854775807L;
            private long g = -9223372036854775807L;
            private long h = -9223372036854775807L;
            private List<String> i = new ArrayList();
            private long k = -9223372036854775807L;
            private long l = -9223372036854775807L;
            private List<String> m = new ArrayList();
            private List<String> n = new ArrayList();

            public a(String str) {
                this.a = str;
            }

            public c a() {
                Uri uri = this.d;
                if ((uri != null || this.c == null) && (uri == null || this.c != null)) {
                    return null;
                }
                long j = this.e;
                if (j == -9223372036854775807L) {
                    return null;
                }
                String str = this.a;
                Uri uri2 = this.c;
                long j2 = this.f;
                long j3 = this.g;
                long j4 = this.h;
                List<String> list = this.i;
                boolean z = this.j;
                long j5 = this.k;
                long j6 = this.l;
                List<String> list2 = this.m;
                List<String> list3 = this.n;
                ArrayList arrayList = new ArrayList(this.b.values());
                Boolean bool = this.o;
                boolean z2 = bool == null || bool.booleanValue();
                String str2 = this.p;
                if (str2 == null) {
                    str2 = "POINT";
                }
                String str3 = str2;
                String str4 = this.q;
                if (str4 == null) {
                    str4 = "HIGHLIGHT";
                }
                return new c(str, uri2, uri, j, j2, j3, j4, list, z, j5, j6, list2, list3, arrayList, z2, str3, str4);
            }

            public a b(Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.d;
                if (uri2 != null) {
                    C0968a.b(uri2.equals(uri), "Can't change assetListUri from " + this.d + " to " + uri);
                }
                this.d = uri;
                return this;
            }

            public a c(Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.c;
                if (uri2 != null) {
                    C0968a.b(uri2.equals(uri), "Can't change assetUri from " + this.c + " to " + uri);
                }
                this.c = uri;
                return this;
            }

            public a d(List<b> list) {
                if (!list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        b bVar = list.get(i);
                        String str = bVar.a;
                        b bVar2 = this.b.get(str);
                        if (bVar2 != null) {
                            C0968a.b(bVar2.equals(bVar), "Can't change " + str + " from " + bVar2.d + " " + bVar2.c + " to " + bVar.d + " " + bVar.c);
                        }
                        this.b.put(str, bVar);
                    }
                }
                return this;
            }

            public a e(Boolean bool) {
                if (bool == null) {
                    return this;
                }
                Boolean bool2 = this.o;
                if (bool2 != null) {
                    C0968a.b(bool2.equals(bool), "Can't change contentMayVary from " + this.o + " to " + bool);
                }
                this.o = bool;
                return this;
            }

            public a f(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.i.isEmpty()) {
                    C0968a.b(this.i.equals(list), "Can't change cue from " + ax.d1.h.a(", ", this.i) + " to " + ax.d1.h.a(", ", list));
                }
                this.i = list;
                return this;
            }

            public a g(long j) {
                if (j == -9223372036854775807L) {
                    return this;
                }
                long j2 = this.g;
                if (j2 != -9223372036854775807L) {
                    C0968a.b(j2 == j, "Can't change durationUs from " + this.g + " to " + j);
                }
                this.g = j;
                return this;
            }

            public a h(long j) {
                if (j == -9223372036854775807L) {
                    return this;
                }
                long j2 = this.f;
                if (j2 != -9223372036854775807L) {
                    C0968a.b(j2 == j, "Can't change endDateUnixUs from " + this.f + " to " + j);
                }
                this.f = j;
                return this;
            }

            public a i(boolean z) {
                if (!z) {
                    return this;
                }
                this.j = true;
                return this;
            }

            public a j(long j) {
                if (j == -9223372036854775807L) {
                    return this;
                }
                long j2 = this.h;
                if (j2 != -9223372036854775807L) {
                    C0968a.b(j2 == j, "Can't change plannedDurationUs from " + this.h + " to " + j);
                }
                this.h = j;
                return this;
            }

            public a k(long j) {
                if (j == -9223372036854775807L) {
                    return this;
                }
                long j2 = this.l;
                if (j2 != -9223372036854775807L) {
                    C0968a.b(j2 == j, "Can't change playoutLimitUs from " + this.l + " to " + j);
                }
                this.l = j;
                return this;
            }

            public a l(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.n.isEmpty()) {
                    C0968a.b(this.n.equals(list), "Can't change restrictions from " + ax.d1.h.a(", ", this.n) + " to " + ax.d1.h.a(", ", list));
                }
                this.n = list;
                return this;
            }

            public a m(long j) {
                if (j == -9223372036854775807L) {
                    return this;
                }
                long j2 = this.k;
                if (j2 != -9223372036854775807L) {
                    C0968a.b(j2 == j, "Can't change resumeOffsetUs from " + this.k + " to " + j);
                }
                this.k = j;
                return this;
            }

            public a n(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.m.isEmpty()) {
                    C0968a.b(this.m.equals(list), "Can't change snapTypes from " + ax.d1.h.a(", ", this.m) + " to " + ax.d1.h.a(", ", list));
                }
                this.m = list;
                return this;
            }

            public a o(long j) {
                if (j == -9223372036854775807L) {
                    return this;
                }
                long j2 = this.e;
                if (j2 != -9223372036854775807L) {
                    C0968a.b(j2 == j, "Can't change startDateUnixUs from " + this.e + " to " + j);
                }
                this.e = j;
                return this;
            }

            public a p(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.p;
                if (str2 != null) {
                    C0968a.b(str2.equals(str), "Can't change timelineOccupies from " + this.p + " to " + str);
                }
                this.p = str;
                return this;
            }

            public a q(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.q;
                if (str2 != null) {
                    C0968a.b(str2.equals(str), "Can't change timelineStyle from " + this.q + " to " + str);
                }
                this.q = str;
                return this;
            }
        }

        public c(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, List<String> list, boolean z, long j5, long j6, List<String> list2, List<String> list3, List<b> list4, boolean z2, String str2, String str3) {
            C0968a.a((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.a = str;
            this.b = uri;
            this.c = uri2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = list;
            this.i = z;
            this.j = j5;
            this.k = j6;
            this.l = AbstractC2991z.u(list2);
            this.m = AbstractC2991z.u(list3);
            this.n = AbstractC2991z.J(new Comparator() { // from class: ax.d1.g
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compareTo;
                    compareTo = ((f.b) obj).a.compareTo(((f.b) obj2).a);
                    return compareTo;
                }
            }, list4);
            this.o = z2;
            this.p = str2;
            this.q = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.i == cVar.i && this.j == cVar.j && this.k == cVar.k && this.o == cVar.o && Objects.equals(this.a, cVar.a) && Objects.equals(this.b, cVar.b) && Objects.equals(this.c, cVar.c) && Objects.equals(this.h, cVar.h) && Objects.equals(this.l, cVar.l) && Objects.equals(this.m, cVar.m) && Objects.equals(this.n, cVar.n) && Objects.equals(this.p, cVar.p) && Objects.equals(this.q, cVar.q);
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q);
        }
    }

    public static final class d extends g {
        public final boolean m0;
        public final boolean n0;

        public d(String str, C0275f c0275f, long j, int i, long j2, C0906o c0906o, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, c0275f, j, i, j2, c0906o, str2, str3, j3, j4, z);
            this.m0 = z2;
            this.n0 = z3;
        }

        public d h(long j, int i) {
            return new d(this.q, this.c0, this.d0, i, j, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0);
        }
    }

    public static final class e {
        public final Uri a;
        public final long b;
        public final int c;

        public e(Uri uri, long j, int i) {
            this.a = uri;
            this.b = j;
            this.c = i;
        }
    }

    public static class g implements Comparable<Long> {
        public final C0275f c0;
        public final long d0;
        public final int e0;
        public final long f0;
        public final C0906o g0;
        public final String h0;
        public final String i0;
        public final long j0;
        public final long k0;
        public final boolean l0;
        public final String q;

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l) {
            if (this.f0 > l.longValue()) {
                return 1;
            }
            return this.f0 < l.longValue() ? -1 : 0;
        }

        private g(String str, C0275f c0275f, long j, int i, long j2, C0906o c0906o, String str2, String str3, long j3, long j4, boolean z) {
            this.q = str;
            this.c0 = c0275f;
            this.d0 = j;
            this.e0 = i;
            this.f0 = j2;
            this.g0 = c0906o;
            this.h0 = str2;
            this.i0 = str3;
            this.j0 = j3;
            this.k0 = j4;
            this.l0 = z;
        }
    }

    public static final class h {
        public final long a;
        public final boolean b;
        public final long c;
        public final long d;
        public final boolean e;

        public h(long j, boolean z, long j2, long j3, boolean z2) {
            this.a = j;
            this.b = z;
            this.c = j2;
            this.d = j3;
            this.e = z2;
        }
    }

    public f(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, C0906o c0906o, List<C0275f> list2, List<d> list3, h hVar, Map<Uri, e> map, List<c> list4) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = c0906o;
        this.r = AbstractC2991z.u(list2);
        this.s = AbstractC2991z.u(list3);
        this.t = AbstractC2962A.c(map);
        this.w = AbstractC2991z.u(list4);
        if (!list3.isEmpty()) {
            d dVar = (d) F.e(list3);
            this.u = dVar.f0 + dVar.d0;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            C0275f c0275f = (C0275f) F.e(list2);
            this.u = c0275f.f0 + c0275f.d0;
        }
        this.e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.u, j) : Math.max(0L, this.u + j) : -9223372036854775807L;
        this.f = j >= 0;
        this.v = hVar;
    }

    public f c(long j, int i) {
        return new f(this.d, this.a, this.b, this.e, this.g, j, true, i, this.k, this.l, this.m, this.n, this.c, this.o, this.p, this.q, this.r, this.s, this.v, this.t, this.w);
    }

    public f d() {
        return this.o ? this : new f(this.d, this.a, this.b, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.c, true, this.p, this.q, this.r, this.s, this.v, this.t, this.w);
    }

    public long e() {
        return this.h + this.u;
    }

    public boolean f(f fVar) {
        if (fVar != null) {
            long j = this.k;
            long j2 = fVar.k;
            if (j <= j2) {
                if (j < j2) {
                    return false;
                }
                int size = this.r.size() - fVar.r.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.s.size();
                int size3 = fVar.s.size();
                if (size2 <= size3 && (size2 != size3 || !this.o || fVar.o)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: ax.d1.f$f, reason: collision with other inner class name */
    public static final class C0275f extends g {
        public final String m0;
        public final List<d> n0;

        public C0275f(String str, long j, long j2, String str2, String str3) {
            this(str, null, HttpUrl.FRAGMENT_ENCODE_SET, 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, AbstractC2991z.z());
        }

        public C0275f h(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.n0.size(); i2++) {
                d dVar = this.n0.get(i2);
                arrayList.add(dVar.h(j2, i));
                j2 += dVar.d0;
            }
            return new C0275f(this.q, this.c0, this.m0, this.d0, i, j, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, arrayList);
        }

        public C0275f(String str, C0275f c0275f, String str2, long j, int i, long j2, C0906o c0906o, String str3, String str4, long j3, long j4, boolean z, List<d> list) {
            super(str, c0275f, j, i, j2, c0906o, str3, str4, j3, j4, z);
            this.m0 = str2;
            this.n0 = AbstractC2991z.u(list);
        }
    }

    public static class b {
        public final String a;
        public final int b;
        private final double c;
        private final String d;

        public b(String str, double d) {
            this.a = str;
            this.b = 2;
            this.c = d;
            this.d = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && Double.compare(this.c, bVar.c) == 0 && Objects.equals(this.a, bVar.a) && Objects.equals(this.d, bVar.d);
        }

        public int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
        }

        public b(String str, String str2, int i) {
            boolean z = true;
            if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z = false;
            }
            C0968a.g(z);
            this.a = str;
            this.b = i;
            this.d = str2;
            this.c = 0.0d;
        }
    }

    @Override // ax.h1.InterfaceC2142a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(List<L> list) {
        return this;
    }
}
