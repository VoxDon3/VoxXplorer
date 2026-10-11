/*
 * Decompiled with CFR 0.152.
 */
package ax.N8;

import ax.N8.A;
import ax.N8.a;
import ax.N8.b;
import ax.N8.c;
import ax.N8.d;
import ax.N8.e;
import ax.N8.f;
import ax.N8.g;
import ax.N8.h;
import ax.N8.i;
import ax.N8.j;
import ax.N8.k;
import ax.N8.l;
import ax.N8.m;
import ax.N8.n;
import ax.N8.o;
import ax.N8.q;
import ax.N8.r;
import ax.N8.s;
import ax.N8.t;
import ax.N8.u;
import ax.N8.w;
import ax.N8.y;
import ax.N8.z;
import ax.Z8.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class p {
    private static final Map<Class<?>, o.b<?>> a;
    private static final Map<Class<?>, o.a<?>> b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap2.put(a.class, new o.a<a>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.j0;
            }

            public a b(ax.Z8.a<?> a8) throws a.b {
                return p.n(a8);
            }
        });
        hashMap2.put(b.class, new o.a<b>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.s0;
            }

            public b b(ax.Z8.a<?> a8) throws a.b {
                return p.o(a8);
            }
        });
        hashMap2.put(c.class, new o.a<c>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.t0;
            }

            public c b(ax.Z8.a<?> a8) throws a.b {
                return p.p(a8);
            }
        });
        o.b b8 = new o.b(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.u0;
            }

            public d d(ax.Z8.a<?> a8) throws a.b {
                return new d(a8.A());
            }

            public void e(d d8, ax.Z8.a<?> a8) {
                a8.k(d8.a());
            }
        };
        hashMap2.put(d.class, (o.a<?>)((Object)b8));
        hashMap.put(d.class, b8);
        b8 = new o.b(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.f0;
            }

            public e d(ax.Z8.a<?> a8) throws a.b {
                return p.q(a8);
            }

            public void e(e e8, ax.Z8.a<?> a8) {
                ax.J8.c.a(e8.b(), a8);
                ax.J8.c.a(e8.d(), a8);
                ax.J8.c.a(e8.e(), a8);
                ax.J8.c.a(e8.a(), a8);
                a8.u(e8.c());
                a8.u(0L);
            }
        };
        hashMap2.put(e.class, (o.a<?>)((Object)b8));
        hashMap.put(e.class, b8);
        hashMap.put(i.class, new o.b<i>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.o0;
            }

            public void c(i i8, ax.Z8.a<?> a8) {
                a8.h(i8.a());
            }
        });
        hashMap2.put(j.class, new o.a<j>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.i0;
            }

            public j b(ax.Z8.a<?> a8) throws a.b {
                return p.t(a8);
            }
        });
        hashMap2.put(z.class, new o.a<z>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.x0;
            }

            public z b(ax.Z8.a<?> a8) throws a.b {
                return p.D(a8);
            }
        });
        hashMap.put(k.class, new o.b<k>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.v0;
            }

            public void c(k k8, ax.Z8.a<?> a8) {
                a8.k(k8.a());
            }
        });
        hashMap2.put(q.class, new o.a<q>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.h0;
            }

            public q b(ax.Z8.a<?> a8) throws a.b {
                return p.x(a8);
            }
        });
        b8 = new o.b(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.r0;
            }

            public s d(ax.Z8.a<?> a8) throws a.b {
                return p.y(a8);
            }

            public void e(s s8, ax.Z8.a<?> a8) {
                a8.u((long)s8.a() & 0xFFFFFFFFL);
            }
        };
        hashMap2.put(s.class, (o.a<?>)((Object)b8));
        hashMap.put(s.class, b8);
        hashMap2.put(u.class, new o.a<u>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.p0;
            }

            public u b(ax.Z8.a<?> a8) throws a.b {
                return p.B(a8);
            }
        });
        hashMap2.put(y.class, new o.a<y>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.g0;
            }

            public y b(ax.Z8.a<?> a8) throws a.b {
                return p.C(a8);
            }
        });
        hashMap2.put(f.class, new o.a<f>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.e0;
            }

            public f b(ax.Z8.a<?> a8) throws a.b {
                return p.r(a8);
            }
        });
        hashMap2.put(g.class, new o.a<g>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.c0;
            }

            public g b(ax.Z8.a<?> a8) throws a.b {
                return p.s(a8);
            }
        });
        hashMap2.put(l.class, new o.a<l>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.d0;
            }

            public l b(ax.Z8.a<?> a8) throws a.b {
                return p.u(a8);
            }
        });
        hashMap2.put(m.class, new o.a<m>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.M0;
            }

            public m b(ax.Z8.a<?> a8) throws a.b {
                return p.v(a8);
            }
        });
        hashMap2.put(n.class, new o.a<n>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.N0;
            }

            public n b(ax.Z8.a<?> a8) throws a.b {
                return p.w(a8);
            }
        });
        hashMap2.put(t.class, new o.a<t>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.n0;
            }

            public t b(ax.Z8.a<?> a8) throws a.b {
                return p.A(a8);
            }
        });
        hashMap.put(w.class, new o.b<w>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.l0;
            }

            public void c(w w8, ax.Z8.a<?> a8) {
                p.E(w8, a8);
            }
        });
        hashMap.put(r.class, new o.b<r>(){

            @Override
            public ax.L8.b a() {
                return ax.L8.b.m0;
            }

            public void c(r r8, ax.Z8.a<?> a8) {
                p.E(r8, a8);
            }
        });
    }

    public static t A(ax.Z8.a<?> a8) throws a.b {
        long l8 = a8.N();
        long l9 = a8.N();
        long l10 = a8.N();
        return new t(l8, l9, a8.H(ax.Y8.b.c, (int)l10 / 2));
    }

    private static u B(ax.Z8.a<?> a8) throws a.b {
        return new u(a8.A());
    }

    private static y C(ax.Z8.a<?> a8) throws a.b {
        long l8 = a8.A();
        long l9 = a8.Q();
        long l10 = a8.N();
        boolean bl = a8.y();
        boolean bl2 = a8.y();
        a8.U(2);
        return new y(l8, l9, l10, bl, bl2);
    }

    private static z D(ax.Z8.a<?> a8) throws a.b {
        long l8;
        ArrayList<A> arrayList = new ArrayList<A>();
        long l9 = 0L;
        long l10 = 0L;
        do {
            a8.T((int)(l9 += l10));
            l8 = a8.N();
            l10 = a8.N();
            arrayList.add(new A(a8.A(), a8.A(), a8.H(ax.Y8.b.c, (int)l10 / 2)));
            l10 = l8;
        } while (l8 != 0L);
        return new z(arrayList);
    }

    public static void E(w w8, ax.Z8.a<?> a8) {
        a8.j((byte)(w8.d() ? 1 : 0));
        a8.o(new byte[]{0, 0, 0, 0, 0, 0, 0});
        a8.w(w8.c());
        a8.u((long)w8.b() * 2L);
        a8.o(w8.a().getBytes(ax.Y8.b.c));
    }

    public static <F extends h> Iterator<F> j(byte[] byArray, o.a<F> a8) {
        return new v<F>(byArray, a8, 0);
    }

    public static <F extends o> o.a<F> k(Class<F> clazz) {
        o.a<?> a8 = b.get(clazz);
        if (a8 != null) {
            return a8;
        }
        a8 = new StringBuilder();
        ((StringBuilder)((Object)a8)).append("FileInformationClass not supported - ");
        ((StringBuilder)((Object)a8)).append(clazz);
        throw new IllegalArgumentException(((StringBuilder)((Object)a8)).toString());
    }

    public static <F extends o> o.b<F> l(F f8) {
        return p.m(f8.getClass());
    }

    public static <F extends o> o.b<F> m(Class<F> clazz) {
        o.b<?> b8 = a.get(clazz);
        if (b8 != null) {
            return b8;
        }
        b8 = new StringBuilder();
        ((StringBuilder)((Object)b8)).append("FileInformationClass not supported - ");
        ((StringBuilder)((Object)b8)).append(clazz);
        throw new IllegalArgumentException(((StringBuilder)((Object)b8)).toString());
    }

    private static a n(ax.Z8.a<?> a8) throws a.b {
        return new a((int)a8.N());
    }

    private static b o(ax.Z8.a<?> a8) throws a.b {
        return new b(a8.N());
    }

    public static c p(ax.Z8.a<?> a8) throws a.b {
        return new c(p.q(a8), p.C(a8), p.x(a8), p.t(a8), p.n(a8), p.B(a8), p.y(a8), p.o(a8), p.z(a8));
    }

    private static e q(ax.Z8.a<?> a8) throws a.b {
        ax.J8.b b8 = ax.J8.c.c(a8);
        ax.J8.b b9 = ax.J8.c.c(a8);
        ax.J8.b b10 = ax.J8.c.c(a8);
        ax.J8.b b11 = ax.J8.c.c(a8);
        long l8 = a8.N();
        a8.U(4);
        return new e(b8, b9, b10, b11, l8);
    }

    public static f r(ax.Z8.a<?> a8) throws a.b {
        long l8 = a8.N();
        long l9 = a8.N();
        ax.J8.b b8 = ax.J8.c.c(a8);
        ax.J8.b b9 = ax.J8.c.c(a8);
        ax.J8.b b10 = ax.J8.c.c(a8);
        ax.J8.b b11 = ax.J8.c.c(a8);
        long l10 = a8.Q();
        long l11 = a8.Q();
        long l12 = a8.N();
        long l13 = a8.N();
        long l14 = a8.N();
        byte by = a8.z();
        a8.z();
        Object object = a8.G(24);
        Charset charset = ax.Y8.b.c;
        object = new String((byte[])object, 0, (int)by, charset);
        return new f(l8, l9, a8.H(charset, (int)l13 / 2), b8, b9, b10, b11, l10, l11, l12, l14, (String)object);
    }

    public static g s(ax.Z8.a<?> a8) throws a.b {
        long l8 = a8.N();
        long l9 = a8.N();
        ax.J8.b b8 = ax.J8.c.c(a8);
        ax.J8.b b9 = ax.J8.c.c(a8);
        ax.J8.b b10 = ax.J8.c.c(a8);
        ax.J8.b b11 = ax.J8.c.c(a8);
        long l10 = a8.Q();
        long l11 = a8.Q();
        long l12 = a8.N();
        return new g(l8, l9, p.z(a8), b8, b9, b10, b11, l10, l11, l12);
    }

    private static j t(ax.Z8.a<?> a8) throws a.b {
        return new j(a8.N());
    }

    public static l u(ax.Z8.a<?> a8) throws a.b {
        long l8 = a8.N();
        long l9 = a8.N();
        ax.J8.b b8 = ax.J8.c.c(a8);
        ax.J8.b b9 = ax.J8.c.c(a8);
        ax.J8.b b10 = ax.J8.c.c(a8);
        ax.J8.b b11 = ax.J8.c.c(a8);
        long l10 = a8.Q();
        long l11 = a8.Q();
        long l12 = a8.N();
        long l13 = a8.N();
        long l14 = a8.N();
        return new l(l8, l9, a8.H(ax.Y8.b.c, (int)l13 / 2), b8, b9, b10, b11, l10, l11, l12, l14);
    }

    public static m v(ax.Z8.a<?> a8) throws a.b {
        long l8 = a8.N();
        long l9 = a8.N();
        ax.J8.b b8 = ax.J8.c.c(a8);
        ax.J8.b b9 = ax.J8.c.c(a8);
        ax.J8.b b10 = ax.J8.c.c(a8);
        ax.J8.b b11 = ax.J8.c.c(a8);
        long l10 = a8.Q();
        long l11 = a8.Q();
        long l12 = a8.N();
        long l13 = a8.N();
        long l14 = a8.N();
        byte by = a8.z();
        a8.z();
        Object object = a8.G(24);
        Charset charset = ax.Y8.b.c;
        object = new String((byte[])object, 0, (int)by, charset);
        a8.J();
        long l15 = a8.A();
        return new m(l8, l9, a8.H(charset, (int)l13 / 2), b8, b9, b10, b11, l10, l11, l12, l14, (String)object, l15);
    }

    public static n w(ax.Z8.a<?> a8) throws a.b {
        long l8 = a8.N();
        long l9 = a8.N();
        ax.J8.b b8 = ax.J8.c.c(a8);
        ax.J8.b b9 = ax.J8.c.c(a8);
        ax.J8.b b10 = ax.J8.c.c(a8);
        ax.J8.b b11 = ax.J8.c.c(a8);
        long l10 = a8.Q();
        long l11 = a8.Q();
        long l12 = a8.N();
        long l13 = a8.N();
        long l14 = a8.N();
        a8.U(4);
        long l15 = a8.A();
        return new n(l8, l9, a8.H(ax.Y8.b.c, (int)l13 / 2), b8, b9, b10, b11, l10, l11, l12, l14, l15);
    }

    private static q x(ax.Z8.a<?> a8) throws a.b {
        return new q(a8.A());
    }

    private static s y(ax.Z8.a<?> a8) throws a.b {
        return new s((int)a8.N());
    }

    private static String z(ax.Z8.a<?> a8) throws a.b {
        long l8 = a8.N();
        return a8.H(ax.Y8.b.c, (int)l8 / 2);
    }

    private static class v<F extends h>
    implements Iterator<F> {
        private final o.a<F> c0;
        private int d0;
        private F e0;
        private final a.c q;

        v(byte[] byArray, o.a<F> a8, int n8) {
            this.q = new a.c(byArray, ax.Z8.b.b);
            this.c0 = a8;
            this.d0 = n8;
            this.e0 = this.c();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private F c() {
            h h8 = null;
            while (h8 == null) {
                int n8;
                try {
                    n8 = this.d0;
                    if (n8 == -1) return (F)h8;
                    this.q.T(n8);
                    h8 = (h)this.c0.c(this.q);
                    n8 = (int)h8.b();
                    if (n8 == 0) {
                        this.d0 = -1;
                        continue;
                    }
                }
                catch (a.b b8) {
                    throw new ax.k9.d(b8);
                }
                this.d0 += n8;
            }
            return (F)h8;
        }

        public F b() {
            F f8 = this.e0;
            if (f8 != null) {
                this.e0 = this.c();
                return f8;
            }
            throw new NoSuchElementException();
        }

        @Override
        public boolean hasNext() {
            return this.e0 != null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}

