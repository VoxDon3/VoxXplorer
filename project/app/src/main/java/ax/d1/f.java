/*
 * Decompiled with CFR 0.152.
 */
package ax.d1;

import android.net.Uri;
import ax.P0.L;
import ax.P0.o;
import ax.S0.a;
import ax.d1.j;
import ax.r7.A;
import ax.r7.F;
import ax.r7.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f
extends j {
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
    public final o q;
    public final List<f> r;
    public final List<d> s;
    public final Map<Uri, e> t;
    public final long u;
    public final h v;
    public final z<c> w;

    public f(int n8, String object, List<String> list, long l8, boolean bl, long l9, boolean bl2, int n9, long l10, int n10, long l11, long l12, boolean bl3, boolean bl4, boolean bl5, o o8, List<f> list2, List<d> list3, h h8, Map<Uri, e> map, List<c> list4) {
        super((String)object, list, bl3);
        this.d = n8;
        this.h = l9;
        this.g = bl;
        this.i = bl2;
        this.j = n9;
        this.k = l10;
        this.l = n10;
        this.m = l11;
        this.n = l12;
        this.o = bl4;
        this.p = bl5;
        this.q = o8;
        this.r = z.u(list2);
        this.s = z.u(list3);
        this.t = A.c(map);
        this.w = z.u(list4);
        if (!list3.isEmpty()) {
            object = F.e(list3);
            this.u = ((g)object).f0 + ((g)object).d0;
        } else if (!list2.isEmpty()) {
            object = F.e(list2);
            this.u = ((g)object).f0 + ((g)object).d0;
        } else {
            this.u = 0L;
        }
        l9 = -9223372036854775807L;
        if (l8 != -9223372036854775807L) {
            l9 = l8 >= 0L ? Math.min(this.u, l8) : Math.max(0L, this.u + l8);
        }
        this.e = l9;
        bl = l8 >= 0L;
        this.f = bl;
        this.v = h8;
    }

    public f b(List<L> list) {
        return this;
    }

    public f c(long l8, int n8) {
        return new f(this.d, this.a, this.b, this.e, this.g, l8, true, n8, this.k, this.l, this.m, this.n, this.c, this.o, this.p, this.q, this.r, this.s, this.v, this.t, this.w);
    }

    public f d() {
        if (this.o) {
            return this;
        }
        return new f(this.d, this.a, this.b, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.c, true, this.p, this.q, this.r, this.s, this.v, this.t, this.w);
    }

    public long e() {
        return this.h + this.u;
    }

    public boolean f(f f8) {
        long l8;
        long l9;
        if (f8 != null && (l9 = this.k) <= (l8 = f8.k)) {
            if (l9 < l8) {
                return false;
            }
            int n8 = this.r.size() - f8.r.size();
            if (n8 != 0) {
                return n8 > 0;
            }
            int n9 = this.s.size();
            if (n9 <= (n8 = f8.s.size()) && (n9 != n8 || !this.o || f8.o)) {
                return false;
            }
        }
        return true;
    }

    public static class b {
        public final String a;
        public final int b;
        private final double c;
        private final String d;

        public b(String string, double d8) {
            this.a = string;
            this.b = 2;
            this.c = d8;
            this.d = null;
        }

        public b(String string, String string2, int n8) {
            boolean bl;
            boolean bl2 = bl = true;
            if (n8 == 1) {
                bl2 = bl;
                if (!string2.startsWith("0x")) {
                    bl2 = string2.startsWith("0X") ? bl : false;
                }
            }
            ax.S0.a.g(bl2);
            this.a = string;
            this.b = n8;
            this.d = string2;
            this.c = 0.0;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            return this.b == ((b)object).b && Double.compare(this.c, ((b)object).c) == 0 && j.Objects.equals((Object)this.a, (Object)((b)object).a) && j.Objects.equals((Object)this.d, (Object)((b)object).d);
        }

        public int hashCode() {
            return j.Objects.hash((Object[])new Object[]{this.a, this.b, this.c, this.d});
        }
    }

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
        public final z<String> l;
        public final z<String> m;
        public final z<b> n;
        public final boolean o;
        public final String p;
        public final String q;

        public c(String string, Uri uri, Uri uri2, long l8, long l9, long l10, long l11, List<String> list, boolean bl, long l12, long l13, List<String> list2, List<String> list3, List<b> list4, boolean bl2, String string2, String string3) {
            boolean bl3 = !(uri != null && uri2 != null || uri == null && uri2 == null);
            ax.S0.a.a(bl3);
            this.a = string;
            this.b = uri;
            this.c = uri2;
            this.d = l8;
            this.e = l9;
            this.f = l10;
            this.g = l11;
            this.h = list;
            this.i = bl;
            this.j = l12;
            this.k = l13;
            this.l = z.u(list2);
            this.m = z.u(list3);
            this.n = z.J(new ax.d1.g(), list4);
            this.o = bl2;
            this.p = string2;
            this.q = string3;
        }

        public static /* synthetic */ int a(b b8, b b9) {
            return b8.a.compareTo(b9.a);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof c)) {
                return false;
            }
            object = (c)object;
            return this.d == ((c)object).d && this.e == ((c)object).e && this.f == ((c)object).f && this.g == ((c)object).g && this.i == ((c)object).i && this.j == ((c)object).j && this.k == ((c)object).k && this.o == ((c)object).o && j.Objects.equals((Object)this.a, (Object)((c)object).a) && j.Objects.equals((Object)this.b, (Object)((c)object).b) && j.Objects.equals((Object)this.c, (Object)((c)object).c) && j.Objects.equals(this.h, ((c)object).h) && j.Objects.equals(this.l, ((c)object).l) && j.Objects.equals(this.m, ((c)object).m) && j.Objects.equals(this.n, ((c)object).n) && j.Objects.equals((Object)this.p, (Object)((c)object).p) && j.Objects.equals((Object)this.q, (Object)((c)object).q);
        }

        public int hashCode() {
            return j.Objects.hash((Object[])new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q});
        }

        public static final class a {
            private final String a;
            private final Map<String, b> b;
            private Uri c;
            private Uri d;
            private long e;
            private long f;
            private long g;
            private long h;
            private List<String> i;
            private boolean j;
            private long k;
            private long l;
            private List<String> m;
            private List<String> n;
            private Boolean o;
            private String p;
            private String q;

            public a(String string) {
                this.a = string;
                this.b = new HashMap<String, b>();
                this.e = -9223372036854775807L;
                this.f = -9223372036854775807L;
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = new ArrayList<String>();
                this.k = -9223372036854775807L;
                this.l = -9223372036854775807L;
                this.m = new ArrayList<String>();
                this.n = new ArrayList<String>();
            }

            public c a() {
                long l8;
                Uri uri = this.d;
                if ((uri == null && this.c != null || uri != null && this.c == null) && (l8 = this.e) != -9223372036854775807L) {
                    String string = this.a;
                    Uri uri2 = this.c;
                    long l9 = this.f;
                    long l10 = this.g;
                    long l11 = this.h;
                    List<String> list = this.i;
                    boolean bl = this.j;
                    long l12 = this.k;
                    long l13 = this.l;
                    List<String> list2 = this.m;
                    List<String> list3 = this.n;
                    ArrayList<b> arrayList = new ArrayList<b>(this.b.values());
                    Object object = this.o;
                    boolean bl2 = object == null || ((Boolean)object).booleanValue();
                    object = this.p;
                    if (object == null) {
                        object = "POINT";
                    }
                    String string2 = this.q;
                    if (string2 == null) {
                        string2 = "HIGHLIGHT";
                    }
                    return new c(string, uri2, uri, l8, l9, l10, l11, list, bl, l12, l13, list2, list3, arrayList, bl2, (String)object, string2);
                }
                return null;
            }

            public a b(Uri uri) {
                if (uri == null) {
                    return this;
                }
                Object object = this.d;
                if (object != null) {
                    boolean bl = object.equals((Object)uri);
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Can't change assetListUri from ");
                    ((StringBuilder)object).append(this.d);
                    ((StringBuilder)object).append(" to ");
                    ((StringBuilder)object).append(uri);
                    ax.S0.a.b(bl, ((StringBuilder)object).toString());
                }
                this.d = uri;
                return this;
            }

            public a c(Uri uri) {
                if (uri == null) {
                    return this;
                }
                Object object = this.c;
                if (object != null) {
                    boolean bl = object.equals((Object)uri);
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Can't change assetUri from ");
                    ((StringBuilder)object).append(this.c);
                    ((StringBuilder)object).append(" to ");
                    ((StringBuilder)object).append(uri);
                    ax.S0.a.b(bl, ((StringBuilder)object).toString());
                }
                this.c = uri;
                return this;
            }

            public a d(List<b> list) {
                if (!list.isEmpty()) {
                    for (int i8 = 0; i8 < list.size(); ++i8) {
                        b b8 = list.get(i8);
                        String string = b8.a;
                        b b9 = this.b.get(string);
                        if (b9 != null) {
                            boolean bl = b9.equals(b8);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Can't change ");
                            stringBuilder.append(string);
                            stringBuilder.append(" from ");
                            stringBuilder.append(b9.d);
                            stringBuilder.append(" ");
                            stringBuilder.append(b9.c);
                            stringBuilder.append(" to ");
                            stringBuilder.append(b8.d);
                            stringBuilder.append(" ");
                            stringBuilder.append(b8.c);
                            ax.S0.a.b(bl, stringBuilder.toString());
                        }
                        this.b.put(string, b8);
                    }
                }
                return this;
            }

            public a e(Boolean bl) {
                if (bl == null) {
                    return this;
                }
                Comparable<Boolean> comparable = this.o;
                if (comparable != null) {
                    boolean bl2 = ((Boolean)comparable).equals(bl);
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append("Can't change contentMayVary from ");
                    ((StringBuilder)comparable).append(this.o);
                    ((StringBuilder)comparable).append(" to ");
                    ((StringBuilder)comparable).append(bl);
                    ax.S0.a.b(bl2, ((StringBuilder)comparable).toString());
                }
                this.o = bl;
                return this;
            }

            public a f(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.i.isEmpty()) {
                    boolean bl = this.i.equals(list);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't change cue from ");
                    stringBuilder.append(ax.d1.h.a(", ", this.i));
                    stringBuilder.append(" to ");
                    stringBuilder.append(ax.d1.h.a(", ", list));
                    ax.S0.a.b(bl, stringBuilder.toString());
                }
                this.i = list;
                return this;
            }

            public a g(long l8) {
                if (l8 == -9223372036854775807L) {
                    return this;
                }
                long l9 = this.g;
                if (l9 != -9223372036854775807L) {
                    boolean bl = l9 == l8;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't change durationUs from ");
                    stringBuilder.append(this.g);
                    stringBuilder.append(" to ");
                    stringBuilder.append(l8);
                    ax.S0.a.b(bl, stringBuilder.toString());
                }
                this.g = l8;
                return this;
            }

            public a h(long l8) {
                if (l8 == -9223372036854775807L) {
                    return this;
                }
                long l9 = this.f;
                if (l9 != -9223372036854775807L) {
                    boolean bl = l9 == l8;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't change endDateUnixUs from ");
                    stringBuilder.append(this.f);
                    stringBuilder.append(" to ");
                    stringBuilder.append(l8);
                    ax.S0.a.b(bl, stringBuilder.toString());
                }
                this.f = l8;
                return this;
            }

            public a i(boolean bl) {
                if (!bl) {
                    return this;
                }
                this.j = true;
                return this;
            }

            public a j(long l8) {
                if (l8 == -9223372036854775807L) {
                    return this;
                }
                long l9 = this.h;
                if (l9 != -9223372036854775807L) {
                    boolean bl = l9 == l8;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't change plannedDurationUs from ");
                    stringBuilder.append(this.h);
                    stringBuilder.append(" to ");
                    stringBuilder.append(l8);
                    ax.S0.a.b(bl, stringBuilder.toString());
                }
                this.h = l8;
                return this;
            }

            public a k(long l8) {
                if (l8 == -9223372036854775807L) {
                    return this;
                }
                long l9 = this.l;
                if (l9 != -9223372036854775807L) {
                    boolean bl = l9 == l8;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't change playoutLimitUs from ");
                    stringBuilder.append(this.l);
                    stringBuilder.append(" to ");
                    stringBuilder.append(l8);
                    ax.S0.a.b(bl, stringBuilder.toString());
                }
                this.l = l8;
                return this;
            }

            public a l(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.n.isEmpty()) {
                    boolean bl = this.n.equals(list);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't change restrictions from ");
                    stringBuilder.append(ax.d1.h.a(", ", this.n));
                    stringBuilder.append(" to ");
                    stringBuilder.append(ax.d1.h.a(", ", list));
                    ax.S0.a.b(bl, stringBuilder.toString());
                }
                this.n = list;
                return this;
            }

            public a m(long l8) {
                if (l8 == -9223372036854775807L) {
                    return this;
                }
                long l9 = this.k;
                if (l9 != -9223372036854775807L) {
                    boolean bl = l9 == l8;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't change resumeOffsetUs from ");
                    stringBuilder.append(this.k);
                    stringBuilder.append(" to ");
                    stringBuilder.append(l8);
                    ax.S0.a.b(bl, stringBuilder.toString());
                }
                this.k = l8;
                return this;
            }

            public a n(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.m.isEmpty()) {
                    boolean bl = this.m.equals(list);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't change snapTypes from ");
                    stringBuilder.append(ax.d1.h.a(", ", this.m));
                    stringBuilder.append(" to ");
                    stringBuilder.append(ax.d1.h.a(", ", list));
                    ax.S0.a.b(bl, stringBuilder.toString());
                }
                this.m = list;
                return this;
            }

            public a o(long l8) {
                if (l8 == -9223372036854775807L) {
                    return this;
                }
                long l9 = this.e;
                if (l9 != -9223372036854775807L) {
                    boolean bl = l9 == l8;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't change startDateUnixUs from ");
                    stringBuilder.append(this.e);
                    stringBuilder.append(" to ");
                    stringBuilder.append(l8);
                    ax.S0.a.b(bl, stringBuilder.toString());
                }
                this.e = l8;
                return this;
            }

            public a p(String string) {
                if (string == null) {
                    return this;
                }
                CharSequence charSequence = this.p;
                if (charSequence != null) {
                    boolean bl = ((String)charSequence).equals(string);
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Can't change timelineOccupies from ");
                    ((StringBuilder)charSequence).append(this.p);
                    ((StringBuilder)charSequence).append(" to ");
                    ((StringBuilder)charSequence).append(string);
                    ax.S0.a.b(bl, ((StringBuilder)charSequence).toString());
                }
                this.p = string;
                return this;
            }

            public a q(String string) {
                if (string == null) {
                    return this;
                }
                CharSequence charSequence = this.q;
                if (charSequence != null) {
                    boolean bl = ((String)charSequence).equals(string);
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Can't change timelineStyle from ");
                    ((StringBuilder)charSequence).append(this.q);
                    ((StringBuilder)charSequence).append(" to ");
                    ((StringBuilder)charSequence).append(string);
                    ax.S0.a.b(bl, ((StringBuilder)charSequence).toString());
                }
                this.q = string;
                return this;
            }
        }
    }

    public static final class d
    extends g {
        public final boolean m0;
        public final boolean n0;

        public d(String string, f f8, long l8, int n8, long l9, o o8, String string2, String string3, long l10, long l11, boolean bl, boolean bl2, boolean bl3) {
            super(string, f8, l8, n8, l9, o8, string2, string3, l10, l11, bl);
            this.m0 = bl2;
            this.n0 = bl3;
        }

        public d h(long l8, int n8) {
            return new d(this.q, this.c0, this.d0, n8, l8, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0);
        }
    }

    public static final class e {
        public final Uri a;
        public final long b;
        public final int c;

        public e(Uri uri, long l8, int n8) {
            this.a = uri;
            this.b = l8;
            this.c = n8;
        }
    }

    public static final class f
    extends g {
        public final String m0;
        public final List<d> n0;

        public f(String string, long l8, long l9, String string2, String string3) {
            this(string, null, "", 0L, -1, -9223372036854775807L, null, string2, string3, l8, l9, false, z.z());
        }

        public f(String string, f f8, String string2, long l8, int n8, long l9, o o8, String string3, String string4, long l10, long l11, boolean bl, List<d> list) {
            super(string, f8, l8, n8, l9, o8, string3, string4, l10, l11, bl);
            this.m0 = string2;
            this.n0 = z.u(list);
        }

        public f h(long l8, int n8) {
            ArrayList<d> arrayList = new ArrayList<d>();
            long l9 = l8;
            for (int i8 = 0; i8 < this.n0.size(); ++i8) {
                d d8 = this.n0.get(i8);
                arrayList.add(d8.h(l9, n8));
                l9 += d8.d0;
            }
            return new f(this.q, this.c0, this.m0, this.d0, n8, l8, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, arrayList);
        }
    }

    public static class g
    implements Comparable<Long> {
        public final f c0;
        public final long d0;
        public final int e0;
        public final long f0;
        public final o g0;
        public final String h0;
        public final String i0;
        public final long j0;
        public final long k0;
        public final boolean l0;
        public final String q;

        private g(String string, f f8, long l8, int n8, long l9, o o8, String string2, String string3, long l10, long l11, boolean bl) {
            this.q = string;
            this.c0 = f8;
            this.d0 = l8;
            this.e0 = n8;
            this.f0 = l9;
            this.g0 = o8;
            this.h0 = string2;
            this.i0 = string3;
            this.j0 = l10;
            this.k0 = l11;
            this.l0 = bl;
        }

        public int d(Long l8) {
            if (this.f0 > l8) {
                return 1;
            }
            if (this.f0 < l8) {
                return -1;
            }
            return 0;
        }
    }

    public static final class h {
        public final long a;
        public final boolean b;
        public final long c;
        public final long d;
        public final boolean e;

        public h(long l8, boolean bl, long l9, long l10, boolean bl2) {
            this.a = l8;
            this.b = bl;
            this.c = l9;
            this.d = l10;
            this.e = bl2;
        }
    }
}

