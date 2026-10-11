/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.A;
import ax.L7.b;
import ax.L7.c;
import ax.L7.d;
import ax.L7.e;
import ax.L7.f;
import ax.L7.g;
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
public abstract class F {
    private static final Charset a = Charset.forName("UTF-8");

    public static b b() {
        return new b.b();
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

    public F p(String string) {
        b b8 = this.o().c(string);
        if (this.n() != null) {
            b8.m(this.n().p(string));
        }
        return b8.a();
    }

    public F q(a a8) {
        if (a8 == null) {
            return this;
        }
        return this.o().b(a8).a();
    }

    public F r(List<e.d> list) {
        if (this.n() != null) {
            return this.o().m(this.n().q(list)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    public F s(String string) {
        return this.o().f(string).a();
    }

    public F t(String string) {
        return this.o().g(string).a();
    }

    public F u(d d8) {
        return this.o().m(null).j(d8).a();
    }

    public F v(long l8, boolean bl, String string) {
        b b8 = this.o();
        if (this.n() != null) {
            b8.m(this.n().r(l8, bl, string));
        }
        return b8.a();
    }

    @AutoValue
    public static abstract class ax.L7.F$a {
        public static b a() {
            return new c.b();
        }

        public abstract List<a> b();

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public abstract long f();

        public abstract int g();

        public abstract long h();

        public abstract long i();

        public abstract String j();

        @AutoValue
        public static abstract class ax.L7.F$a$a {
            public static a a() {
                return new d.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            @AutoValue.Builder
            public static abstract class a {
                public abstract ax.L7.F$a$a a();

                public abstract a b(String var1);

                public abstract a c(String var1);

                public abstract a d(String var1);
            }
        }

        @AutoValue.Builder
        public static abstract class b {
            public abstract ax.L7.F$a a();

            public abstract b b(List<a> var1);

            public abstract b c(int var1);

            public abstract b d(int var1);

            public abstract b e(String var1);

            public abstract b f(long var1);

            public abstract b g(int var1);

            public abstract b h(long var1);

            public abstract b i(long var1);

            public abstract b j(String var1);
        }
    }

    @AutoValue.Builder
    public static abstract class b {
        public abstract F a();

        public abstract b b(a var1);

        public abstract b c(String var1);

        public abstract b d(String var1);

        public abstract b e(String var1);

        public abstract b f(String var1);

        public abstract b g(String var1);

        public abstract b h(String var1);

        public abstract b i(String var1);

        public abstract b j(d var1);

        public abstract b k(int var1);

        public abstract b l(String var1);

        public abstract b m(e var1);
    }

    @AutoValue
    public static abstract class c {
        public static a a() {
            return new e.b();
        }

        public abstract String b();

        public abstract String c();

        @AutoValue.Builder
        public static abstract class a {
            public abstract c a();

            public abstract a b(String var1);

            public abstract a c(String var1);
        }
    }

    @AutoValue
    public static abstract class d {
        public static a a() {
            return new f.b();
        }

        public abstract List<b> b();

        public abstract String c();

        @AutoValue.Builder
        public static abstract class a {
            public abstract d a();

            public abstract a b(List<b> var1);

            public abstract a c(String var1);
        }

        @AutoValue
        public static abstract class b {
            public static a a() {
                return new g.b();
            }

            public abstract byte[] b();

            public abstract String c();

            @AutoValue.Builder
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] var1);

                public abstract a c(String var1);
            }
        }
    }

    @AutoValue
    public static abstract class ax.L7.F$e {
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
            return this.i().getBytes(a);
        }

        public abstract e k();

        public abstract long l();

        public abstract f m();

        public abstract boolean n();

        public abstract b o();

        ax.L7.F$e p(String string) {
            return this.o().c(string).a();
        }

        ax.L7.F$e q(List<d> list) {
            return this.o().g(list).a();
        }

        ax.L7.F$e r(long l8, boolean bl, String string) {
            b b8 = this.o();
            b8.f(l8);
            b8.d(bl);
            if (string != null) {
                b8.n(f.a().b(string).a());
            }
            return b8.a();
        }

        @AutoValue
        public static abstract class ax.L7.F$e$a {
            public static a a() {
                return new i.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract String e();

            public abstract String f();

            public abstract b g();

            public abstract String h();

            @AutoValue.Builder
            public static abstract class a {
                public abstract ax.L7.F$e$a a();

                public abstract a b(String var1);

                public abstract a c(String var1);

                public abstract a d(String var1);

                public abstract a e(String var1);

                public abstract a f(String var1);

                public abstract a g(String var1);
            }

            @AutoValue
            public static abstract class b {
                public abstract String a();
            }
        }

        @AutoValue.Builder
        public static abstract class b {
            public abstract ax.L7.F$e a();

            public abstract b b(a var1);

            public abstract b c(String var1);

            public abstract b d(boolean var1);

            public abstract b e(c var1);

            public abstract b f(Long var1);

            public abstract b g(List<d> var1);

            public abstract b h(String var1);

            public abstract b i(int var1);

            public abstract b j(String var1);

            public b k(byte[] byArray) {
                return this.j(new String(byArray, a));
            }

            public abstract b l(e var1);

            public abstract b m(long var1);

            public abstract b n(f var1);
        }

        @AutoValue
        public static abstract class c {
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

            @AutoValue.Builder
            public static abstract class a {
                public abstract c a();

                public abstract a b(int var1);

                public abstract a c(int var1);

                public abstract a d(long var1);

                public abstract a e(String var1);

                public abstract a f(String var1);

                public abstract a g(String var1);

                public abstract a h(long var1);

                public abstract a i(boolean var1);

                public abstract a j(int var1);
            }
        }

        @AutoValue
        public static abstract class ax.L7.F$e$d {
            public static b a() {
                return new l.b();
            }

            public abstract a b();

            public abstract c c();

            public abstract d d();

            public abstract f e();

            public abstract long f();

            public abstract String g();

            public abstract b h();

            @AutoValue
            public static abstract class ax.L7.F$e$d$a {
                public static a a() {
                    return new m.b();
                }

                public abstract List<c> b();

                public abstract Boolean c();

                public abstract c d();

                public abstract List<ax.L7.F$c> e();

                public abstract b f();

                public abstract List<ax.L7.F$c> g();

                public abstract int h();

                public abstract a i();

                @AutoValue.Builder
                public static abstract class a {
                    public abstract ax.L7.F$e$d$a a();

                    public abstract a b(List<c> var1);

                    public abstract a c(Boolean var1);

                    public abstract a d(c var1);

                    public abstract a e(List<ax.L7.F$c> var1);

                    public abstract a f(b var1);

                    public abstract a g(List<ax.L7.F$c> var1);

                    public abstract a h(int var1);
                }

                @AutoValue
                public static abstract class ax.L7.F$e$d$a$b {
                    public static b a() {
                        return new n.b();
                    }

                    public abstract ax.L7.F$a b();

                    public abstract List<a> c();

                    public abstract c d();

                    public abstract d e();

                    public abstract List<e> f();

                    @AutoValue
                    public static abstract class ax.L7.F$e$d$a$b$a {
                        public static a a() {
                            return new o.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract long d();

                        public abstract String e();

                        public byte[] f() {
                            String string = this.e();
                            if (string != null) {
                                return string.getBytes(a);
                            }
                            return null;
                        }

                        @AutoValue.Builder
                        public static abstract class a {
                            public abstract ax.L7.F$e$d$a$b$a a();

                            public abstract a b(long var1);

                            public abstract a c(String var1);

                            public abstract a d(long var1);

                            public abstract a e(String var1);

                            public a f(byte[] byArray) {
                                return this.e(new String(byArray, a));
                            }
                        }
                    }

                    @AutoValue.Builder
                    public static abstract class b {
                        public abstract ax.L7.F$e$d$a$b a();

                        public abstract b b(ax.L7.F$a var1);

                        public abstract b c(List<a> var1);

                        public abstract b d(c var1);

                        public abstract b e(d var1);

                        public abstract b f(List<e> var1);
                    }

                    @AutoValue
                    public static abstract class c {
                        public static a a() {
                            return new p.b();
                        }

                        public abstract c b();

                        public abstract List<e.b> c();

                        public abstract int d();

                        public abstract String e();

                        public abstract String f();

                        @AutoValue.Builder
                        public static abstract class a {
                            public abstract c a();

                            public abstract a b(c var1);

                            public abstract a c(List<e.b> var1);

                            public abstract a d(int var1);

                            public abstract a e(String var1);

                            public abstract a f(String var1);
                        }
                    }

                    @AutoValue
                    public static abstract class d {
                        public static a a() {
                            return new q.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract String d();

                        @AutoValue.Builder
                        public static abstract class a {
                            public abstract d a();

                            public abstract a b(long var1);

                            public abstract a c(String var1);

                            public abstract a d(String var1);
                        }
                    }

                    @AutoValue
                    public static abstract class e {
                        public static a a() {
                            return new r.b();
                        }

                        public abstract List<b> b();

                        public abstract int c();

                        public abstract String d();

                        @AutoValue.Builder
                        public static abstract class a {
                            public abstract e a();

                            public abstract a b(List<b> var1);

                            public abstract a c(int var1);

                            public abstract a d(String var1);
                        }

                        @AutoValue
                        public static abstract class b {
                            public static a a() {
                                return new s.b();
                            }

                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            public abstract String f();

                            @AutoValue.Builder
                            public static abstract class a {
                                public abstract b a();

                                public abstract a b(String var1);

                                public abstract a c(int var1);

                                public abstract a d(long var1);

                                public abstract a e(long var1);

                                public abstract a f(String var1);
                            }
                        }
                    }
                }

                @AutoValue
                public static abstract class c {
                    public static a a() {
                        return new t.b();
                    }

                    public abstract int b();

                    public abstract int c();

                    public abstract String d();

                    public abstract boolean e();

                    @AutoValue.Builder
                    public static abstract class a {
                        public abstract c a();

                        public abstract a b(boolean var1);

                        public abstract a c(int var1);

                        public abstract a d(int var1);

                        public abstract a e(String var1);
                    }
                }
            }

            @AutoValue.Builder
            public static abstract class b {
                public abstract ax.L7.F$e$d a();

                public abstract b b(a var1);

                public abstract b c(c var1);

                public abstract b d(d var1);

                public abstract b e(f var1);

                public abstract b f(long var1);

                public abstract b g(String var1);
            }

            @AutoValue
            public static abstract class c {
                public static a a() {
                    return new u.b();
                }

                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();

                @AutoValue.Builder
                public static abstract class a {
                    public abstract c a();

                    public abstract a b(Double var1);

                    public abstract a c(int var1);

                    public abstract a d(long var1);

                    public abstract a e(int var1);

                    public abstract a f(boolean var1);

                    public abstract a g(long var1);
                }
            }

            @AutoValue
            public static abstract class d {
                public static a a() {
                    return new v.b();
                }

                public abstract String b();

                @AutoValue.Builder
                public static abstract class a {
                    public abstract d a();

                    public abstract a b(String var1);
                }
            }

            @AutoValue
            public static abstract class e {
                public static a a() {
                    return new w.b();
                }

                public abstract String b();

                public abstract String c();

                public abstract b d();

                public abstract long e();

                @AutoValue.Builder
                public static abstract class a {
                    public abstract e a();

                    public abstract a b(String var1);

                    public abstract a c(String var1);

                    public abstract a d(b var1);

                    public abstract a e(long var1);
                }

                @AutoValue
                public static abstract class b {
                    public static a a() {
                        return new x.b();
                    }

                    public abstract String b();

                    public abstract String c();

                    @AutoValue.Builder
                    public static abstract class a {
                        public abstract b a();

                        public abstract a b(String var1);

                        public abstract a c(String var1);
                    }
                }
            }

            @AutoValue
            public static abstract class f {
                public static a a() {
                    return new y.b();
                }

                public abstract List<e> b();

                @AutoValue.Builder
                public static abstract class a {
                    public abstract f a();

                    public abstract a b(List<e> var1);
                }
            }
        }

        @AutoValue
        public static abstract class e {
            public static a a() {
                return new z.b();
            }

            public abstract String b();

            public abstract int c();

            public abstract String d();

            public abstract boolean e();

            @AutoValue.Builder
            public static abstract class a {
                public abstract e a();

                public abstract a b(String var1);

                public abstract a c(boolean var1);

                public abstract a d(int var1);

                public abstract a e(String var1);
            }
        }

        @AutoValue
        public static abstract class f {
            public static a a() {
                return new A.b();
            }

            public abstract String b();

            @AutoValue.Builder
            public static abstract class a {
                public abstract f a();

                public abstract a b(String var1);
            }
        }
    }
}

