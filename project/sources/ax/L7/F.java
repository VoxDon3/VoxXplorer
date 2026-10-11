package ax.L7;

import ax.L7.A;
import ax.L7.C0800b;
import ax.L7.C0801c;
import ax.L7.C0802d;
import ax.L7.C0803e;
import ax.L7.C0804f;
import ax.L7.C0805g;
import ax.L7.h;
import ax.L7.i;
import ax.L7.k;
import ax.L7.l;
import ax.L7.m;
import ax.L7.n;
import ax.L7.o;
import ax.L7.p;
import ax.L7.q;
import ax.L7.r;
import ax.L7.s;
import ax.L7.t;
import ax.L7.u;
import ax.L7.v;
import ax.L7.w;
import ax.L7.x;
import ax.L7.y;
import ax.L7.z;
import com.google.auto.value.AutoValue;
import java.nio.charset.Charset;
import java.util.List;

@AutoValue
/* loaded from: classes3.dex */
public abstract class F {
    private static final Charset a = Charset.forName("UTF-8");

    @AutoValue
    public static abstract class a {

        @AutoValue
        /* renamed from: ax.L7.F$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0122a {

            @AutoValue.Builder
            /* renamed from: ax.L7.F$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0123a {
                public abstract AbstractC0122a a();

                public abstract AbstractC0123a b(String str);

                public abstract AbstractC0123a c(String str);

                public abstract AbstractC0123a d(String str);
            }

            public static AbstractC0123a a() {
                return new C0802d.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();
        }

        @AutoValue.Builder
        public static abstract class b {
            public abstract a a();

            public abstract b b(List<AbstractC0122a> list);

            public abstract b c(int i);

            public abstract b d(int i);

            public abstract b e(String str);

            public abstract b f(long j);

            public abstract b g(int i);

            public abstract b h(long j);

            public abstract b i(long j);

            public abstract b j(String str);
        }

        public static b a() {
            return new C0801c.b();
        }

        public abstract List<AbstractC0122a> b();

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public abstract long f();

        public abstract int g();

        public abstract long h();

        public abstract long i();

        public abstract String j();
    }

    @AutoValue.Builder
    public static abstract class b {
        public abstract F a();

        public abstract b b(a aVar);

        public abstract b c(String str);

        public abstract b d(String str);

        public abstract b e(String str);

        public abstract b f(String str);

        public abstract b g(String str);

        public abstract b h(String str);

        public abstract b i(String str);

        public abstract b j(d dVar);

        public abstract b k(int i);

        public abstract b l(String str);

        public abstract b m(e eVar);
    }

    @AutoValue
    public static abstract class c {

        @AutoValue.Builder
        public static abstract class a {
            public abstract c a();

            public abstract a b(String str);

            public abstract a c(String str);
        }

        public static a a() {
            return new C0803e.b();
        }

        public abstract String b();

        public abstract String c();
    }

    @AutoValue
    public static abstract class d {

        @AutoValue.Builder
        public static abstract class a {
            public abstract d a();

            public abstract a b(List<b> list);

            public abstract a c(String str);
        }

        @AutoValue
        public static abstract class b {

            @AutoValue.Builder
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            public static a a() {
                return new C0805g.b();
            }

            public abstract byte[] b();

            public abstract String c();
        }

        public static a a() {
            return new C0804f.b();
        }

        public abstract List<b> b();

        public abstract String c();
    }

    @AutoValue
    public static abstract class e {

        @AutoValue
        public static abstract class a {

            @AutoValue.Builder
            /* renamed from: ax.L7.F$e$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0124a {
                public abstract a a();

                public abstract AbstractC0124a b(String str);

                public abstract AbstractC0124a c(String str);

                public abstract AbstractC0124a d(String str);

                public abstract AbstractC0124a e(String str);

                public abstract AbstractC0124a f(String str);

                public abstract AbstractC0124a g(String str);
            }

            @AutoValue
            public static abstract class b {
                public abstract String a();
            }

            public static AbstractC0124a a() {
                return new i.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract String e();

            public abstract String f();

            public abstract b g();

            public abstract String h();
        }

        @AutoValue.Builder
        public static abstract class b {
            public abstract e a();

            public abstract b b(a aVar);

            public abstract b c(String str);

            public abstract b d(boolean z);

            public abstract b e(c cVar);

            public abstract b f(Long l);

            public abstract b g(List<d> list);

            public abstract b h(String str);

            public abstract b i(int i);

            public abstract b j(String str);

            public b k(byte[] bArr) {
                return j(new String(bArr, F.a));
            }

            public abstract b l(AbstractC0139e abstractC0139e);

            public abstract b m(long j);

            public abstract b n(f fVar);
        }

        @AutoValue
        public static abstract class c {

            @AutoValue.Builder
            public static abstract class a {
                public abstract c a();

                public abstract a b(int i);

                public abstract a c(int i);

                public abstract a d(long j);

                public abstract a e(String str);

                public abstract a f(String str);

                public abstract a g(String str);

                public abstract a h(long j);

                public abstract a i(boolean z);

                public abstract a j(int i);
            }

            public static a a() {
                return new k.b();
            }

            public abstract int b();

            public abstract int c();

            public abstract long d();

            public abstract String e();

            public abstract String f();

            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        @AutoValue
        public static abstract class d {

            @AutoValue
            public static abstract class a {

                @AutoValue.Builder
                /* renamed from: ax.L7.F$e$d$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC0125a {
                    public abstract a a();

                    public abstract AbstractC0125a b(List<c> list);

                    public abstract AbstractC0125a c(Boolean bool);

                    public abstract AbstractC0125a d(c cVar);

                    public abstract AbstractC0125a e(List<c> list);

                    public abstract AbstractC0125a f(b bVar);

                    public abstract AbstractC0125a g(List<c> list);

                    public abstract AbstractC0125a h(int i);
                }

                @AutoValue
                public static abstract class b {

                    @AutoValue
                    /* renamed from: ax.L7.F$e$d$a$b$a, reason: collision with other inner class name */
                    public static abstract class AbstractC0126a {

                        @AutoValue.Builder
                        /* renamed from: ax.L7.F$e$d$a$b$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0127a {
                            public abstract AbstractC0126a a();

                            public abstract AbstractC0127a b(long j);

                            public abstract AbstractC0127a c(String str);

                            public abstract AbstractC0127a d(long j);

                            public abstract AbstractC0127a e(String str);

                            public AbstractC0127a f(byte[] bArr) {
                                return e(new String(bArr, F.a));
                            }
                        }

                        public static AbstractC0127a a() {
                            return new o.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract long d();

                        public abstract String e();

                        public byte[] f() {
                            String e = e();
                            if (e != null) {
                                return e.getBytes(F.a);
                            }
                            return null;
                        }
                    }

                    @AutoValue.Builder
                    /* renamed from: ax.L7.F$e$d$a$b$b, reason: collision with other inner class name */
                    public static abstract class AbstractC0128b {
                        public abstract b a();

                        public abstract AbstractC0128b b(a aVar);

                        public abstract AbstractC0128b c(List<AbstractC0126a> list);

                        public abstract AbstractC0128b d(c cVar);

                        public abstract AbstractC0128b e(AbstractC0130d abstractC0130d);

                        public abstract AbstractC0128b f(List<AbstractC0132e> list);
                    }

                    @AutoValue
                    public static abstract class c {

                        @AutoValue.Builder
                        /* renamed from: ax.L7.F$e$d$a$b$c$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0129a {
                            public abstract c a();

                            public abstract AbstractC0129a b(c cVar);

                            public abstract AbstractC0129a c(List<AbstractC0132e.AbstractC0134b> list);

                            public abstract AbstractC0129a d(int i);

                            public abstract AbstractC0129a e(String str);

                            public abstract AbstractC0129a f(String str);
                        }

                        public static AbstractC0129a a() {
                            return new p.b();
                        }

                        public abstract c b();

                        public abstract List<AbstractC0132e.AbstractC0134b> c();

                        public abstract int d();

                        public abstract String e();

                        public abstract String f();
                    }

                    @AutoValue
                    /* renamed from: ax.L7.F$e$d$a$b$d, reason: collision with other inner class name */
                    public static abstract class AbstractC0130d {

                        @AutoValue.Builder
                        /* renamed from: ax.L7.F$e$d$a$b$d$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0131a {
                            public abstract AbstractC0130d a();

                            public abstract AbstractC0131a b(long j);

                            public abstract AbstractC0131a c(String str);

                            public abstract AbstractC0131a d(String str);
                        }

                        public static AbstractC0131a a() {
                            return new q.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract String d();
                    }

                    @AutoValue
                    /* renamed from: ax.L7.F$e$d$a$b$e, reason: collision with other inner class name */
                    public static abstract class AbstractC0132e {

                        @AutoValue.Builder
                        /* renamed from: ax.L7.F$e$d$a$b$e$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0133a {
                            public abstract AbstractC0132e a();

                            public abstract AbstractC0133a b(List<AbstractC0134b> list);

                            public abstract AbstractC0133a c(int i);

                            public abstract AbstractC0133a d(String str);
                        }

                        @AutoValue
                        /* renamed from: ax.L7.F$e$d$a$b$e$b, reason: collision with other inner class name */
                        public static abstract class AbstractC0134b {

                            @AutoValue.Builder
                            /* renamed from: ax.L7.F$e$d$a$b$e$b$a, reason: collision with other inner class name */
                            public static abstract class AbstractC0135a {
                                public abstract AbstractC0134b a();

                                public abstract AbstractC0135a b(String str);

                                public abstract AbstractC0135a c(int i);

                                public abstract AbstractC0135a d(long j);

                                public abstract AbstractC0135a e(long j);

                                public abstract AbstractC0135a f(String str);
                            }

                            public static AbstractC0135a a() {
                                return new s.b();
                            }

                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            public abstract String f();
                        }

                        public static AbstractC0133a a() {
                            return new r.b();
                        }

                        public abstract List<AbstractC0134b> b();

                        public abstract int c();

                        public abstract String d();
                    }

                    public static AbstractC0128b a() {
                        return new n.b();
                    }

                    public abstract a b();

                    public abstract List<AbstractC0126a> c();

                    public abstract c d();

                    public abstract AbstractC0130d e();

                    public abstract List<AbstractC0132e> f();
                }

                @AutoValue
                public static abstract class c {

                    @AutoValue.Builder
                    /* renamed from: ax.L7.F$e$d$a$c$a, reason: collision with other inner class name */
                    public static abstract class AbstractC0136a {
                        public abstract c a();

                        public abstract AbstractC0136a b(boolean z);

                        public abstract AbstractC0136a c(int i);

                        public abstract AbstractC0136a d(int i);

                        public abstract AbstractC0136a e(String str);
                    }

                    public static AbstractC0136a a() {
                        return new t.b();
                    }

                    public abstract int b();

                    public abstract int c();

                    public abstract String d();

                    public abstract boolean e();
                }

                public static AbstractC0125a a() {
                    return new m.b();
                }

                public abstract List<c> b();

                public abstract Boolean c();

                public abstract c d();

                public abstract List<c> e();

                public abstract b f();

                public abstract List<c> g();

                public abstract int h();

                public abstract AbstractC0125a i();
            }

            @AutoValue.Builder
            public static abstract class b {
                public abstract d a();

                public abstract b b(a aVar);

                public abstract b c(c cVar);

                public abstract b d(AbstractC0137d abstractC0137d);

                public abstract b e(f fVar);

                public abstract b f(long j);

                public abstract b g(String str);
            }

            @AutoValue
            public static abstract class c {

                @AutoValue.Builder
                public static abstract class a {
                    public abstract c a();

                    public abstract a b(Double d);

                    public abstract a c(int i);

                    public abstract a d(long j);

                    public abstract a e(int i);

                    public abstract a f(boolean z);

                    public abstract a g(long j);
                }

                public static a a() {
                    return new u.b();
                }

                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            @AutoValue
            /* renamed from: ax.L7.F$e$d$d, reason: collision with other inner class name */
            public static abstract class AbstractC0137d {

                @AutoValue.Builder
                /* renamed from: ax.L7.F$e$d$d$a */
                public static abstract class a {
                    public abstract AbstractC0137d a();

                    public abstract a b(String str);
                }

                public static a a() {
                    return new v.b();
                }

                public abstract String b();
            }

            @AutoValue
            /* renamed from: ax.L7.F$e$d$e, reason: collision with other inner class name */
            public static abstract class AbstractC0138e {

                @AutoValue.Builder
                /* renamed from: ax.L7.F$e$d$e$a */
                public static abstract class a {
                    public abstract AbstractC0138e a();

                    public abstract a b(String str);

                    public abstract a c(String str);

                    public abstract a d(b bVar);

                    public abstract a e(long j);
                }

                @AutoValue
                /* renamed from: ax.L7.F$e$d$e$b */
                public static abstract class b {

                    @AutoValue.Builder
                    /* renamed from: ax.L7.F$e$d$e$b$a */
                    public static abstract class a {
                        public abstract b a();

                        public abstract a b(String str);

                        public abstract a c(String str);
                    }

                    public static a a() {
                        return new x.b();
                    }

                    public abstract String b();

                    public abstract String c();
                }

                public static a a() {
                    return new w.b();
                }

                public abstract String b();

                public abstract String c();

                public abstract b d();

                public abstract long e();
            }

            @AutoValue
            public static abstract class f {

                @AutoValue.Builder
                public static abstract class a {
                    public abstract f a();

                    public abstract a b(List<AbstractC0138e> list);
                }

                public static a a() {
                    return new y.b();
                }

                public abstract List<AbstractC0138e> b();
            }

            public static b a() {
                return new l.b();
            }

            public abstract a b();

            public abstract c c();

            public abstract AbstractC0137d d();

            public abstract f e();

            public abstract long f();

            public abstract String g();

            public abstract b h();
        }

        @AutoValue
        /* renamed from: ax.L7.F$e$e, reason: collision with other inner class name */
        public static abstract class AbstractC0139e {

            @AutoValue.Builder
            /* renamed from: ax.L7.F$e$e$a */
            public static abstract class a {
                public abstract AbstractC0139e a();

                public abstract a b(String str);

                public abstract a c(boolean z);

                public abstract a d(int i);

                public abstract a e(String str);
            }

            public static a a() {
                return new z.b();
            }

            public abstract String b();

            public abstract int c();

            public abstract String d();

            public abstract boolean e();
        }

        @AutoValue
        public static abstract class f {

            @AutoValue.Builder
            public static abstract class a {
                public abstract f a();

                public abstract a b(String str);
            }

            public static a a() {
                return new A.b();
            }

            public abstract String b();
        }

        public static b a() {
            return new h.b().d(false);
        }

        public abstract a b();

        public abstract String c();

        public abstract c d();

        public abstract Long e();

        public abstract List<d> f();

        public abstract String g();

        public abstract int h();

        public abstract String i();

        public byte[] j() {
            return i().getBytes(F.a);
        }

        public abstract AbstractC0139e k();

        public abstract long l();

        public abstract f m();

        public abstract boolean n();

        public abstract b o();

        e p(String str) {
            return o().c(str).a();
        }

        e q(List<d> list) {
            return o().g(list).a();
        }

        e r(long j, boolean z, String str) {
            b o = o();
            o.f(Long.valueOf(j));
            o.d(z);
            if (str != null) {
                o.n(f.a().b(str).a());
            }
            return o.a();
        }
    }

    public static b b() {
        return new C0800b.C0141b();
    }

    public abstract a c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract d k();

    public abstract int l();

    public abstract String m();

    public abstract e n();

    protected abstract b o();

    public F p(String str) {
        b c2 = o().c(str);
        if (n() != null) {
            c2.m(n().p(str));
        }
        return c2.a();
    }

    public F q(a aVar) {
        return aVar == null ? this : o().b(aVar).a();
    }

    public F r(List<e.d> list) {
        if (n() != null) {
            return o().m(n().q(list)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    public F s(String str) {
        return o().f(str).a();
    }

    public F t(String str) {
        return o().g(str).a();
    }

    public F u(d dVar) {
        return o().m(null).j(dVar).a();
    }

    public F v(long j, boolean z, String str) {
        b o = o();
        if (n() != null) {
            o.m(n().r(j, z, str));
        }
        return o.a();
    }
}
