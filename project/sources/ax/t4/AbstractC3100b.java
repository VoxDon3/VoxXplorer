package ax.t4;

import ax.T4.m;
import ax.w4.C3344d;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.t4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3100b<T> {
    public static final AbstractC3100b<Long> a = new c();
    public static final AbstractC3100b<Long> b = new d();
    public static final AbstractC3100b<Integer> c = new e();
    public static final AbstractC3100b<Long> d = new f();
    public static final AbstractC3100b<Long> e = new g();
    public static final AbstractC3100b<Double> f = new h();
    public static final AbstractC3100b<Float> g = new i();
    public static final AbstractC3100b<String> h = new j();
    public static final AbstractC3100b<byte[]> i = new k();
    public static final AbstractC3100b<Boolean> j = new a();
    public static final AbstractC3100b<Object> k = new C0457b();
    static final ax.T4.e l = new ax.T4.e();

    /* renamed from: ax.t4.b$a */
    class a extends AbstractC3100b<Boolean> {
        a() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Boolean d(ax.T4.j jVar) throws IOException, C3099a {
            return Boolean.valueOf(AbstractC3100b.e(jVar));
        }
    }

    /* renamed from: ax.t4.b$b, reason: collision with other inner class name */
    class C0457b extends AbstractC3100b<Object> {
        C0457b() {
        }

        @Override // ax.t4.AbstractC3100b
        public Object d(ax.T4.j jVar) throws IOException, C3099a {
            AbstractC3100b.k(jVar);
            return null;
        }
    }

    /* renamed from: ax.t4.b$c */
    class c extends AbstractC3100b<Long> {
        c() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long d(ax.T4.j jVar) throws IOException, C3099a {
            return Long.valueOf(AbstractC3100b.j(jVar));
        }
    }

    /* renamed from: ax.t4.b$d */
    class d extends AbstractC3100b<Long> {
        d() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long d(ax.T4.j jVar) throws IOException, C3099a {
            long q = jVar.q();
            jVar.H();
            return Long.valueOf(q);
        }
    }

    /* renamed from: ax.t4.b$e */
    class e extends AbstractC3100b<Integer> {
        e() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer d(ax.T4.j jVar) throws IOException, C3099a {
            int p = jVar.p();
            jVar.H();
            return Integer.valueOf(p);
        }
    }

    /* renamed from: ax.t4.b$f */
    class f extends AbstractC3100b<Long> {
        f() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long d(ax.T4.j jVar) throws IOException, C3099a {
            return Long.valueOf(AbstractC3100b.j(jVar));
        }
    }

    /* renamed from: ax.t4.b$g */
    class g extends AbstractC3100b<Long> {
        g() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long d(ax.T4.j jVar) throws IOException, C3099a {
            long j = AbstractC3100b.j(jVar);
            if (j < 4294967296L) {
                return Long.valueOf(j);
            }
            throw new C3099a("expecting a 32-bit unsigned integer, got: " + j, jVar.v());
        }
    }

    /* renamed from: ax.t4.b$h */
    class h extends AbstractC3100b<Double> {
        h() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Double d(ax.T4.j jVar) throws IOException, C3099a {
            double m = jVar.m();
            jVar.H();
            return Double.valueOf(m);
        }
    }

    /* renamed from: ax.t4.b$i */
    class i extends AbstractC3100b<Float> {
        i() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Float d(ax.T4.j jVar) throws IOException, C3099a {
            float o = jVar.o();
            jVar.H();
            return Float.valueOf(o);
        }
    }

    /* renamed from: ax.t4.b$j */
    class j extends AbstractC3100b<String> {
        j() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public String d(ax.T4.j jVar) throws IOException, C3099a {
            try {
                String u = jVar.u();
                jVar.H();
                return u;
            } catch (ax.T4.i e) {
                throw C3099a.b(e);
            }
        }
    }

    /* renamed from: ax.t4.b$k */
    class k extends AbstractC3100b<byte[]> {
        k() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public byte[] d(ax.T4.j jVar) throws IOException, C3099a {
            try {
                byte[] c = jVar.c();
                jVar.H();
                return c;
            } catch (ax.T4.i e) {
                throw C3099a.b(e);
            }
        }
    }

    public static void a(ax.T4.j jVar) throws IOException, C3099a {
        if (jVar.j() != m.END_OBJECT) {
            throw new C3099a("expecting the end of an object (\"}\")", jVar.v());
        }
        c(jVar);
    }

    public static ax.T4.h b(ax.T4.j jVar) throws IOException, C3099a {
        if (jVar.j() != m.START_OBJECT) {
            throw new C3099a("expecting the start of an object (\"{\")", jVar.v());
        }
        ax.T4.h v = jVar.v();
        c(jVar);
        return v;
    }

    public static m c(ax.T4.j jVar) throws IOException, C3099a {
        try {
            return jVar.H();
        } catch (ax.T4.i e2) {
            throw C3099a.b(e2);
        }
    }

    public static boolean e(ax.T4.j jVar) throws IOException, C3099a {
        try {
            boolean e2 = jVar.e();
            jVar.H();
            return e2;
        } catch (ax.T4.i e3) {
            throw C3099a.b(e3);
        }
    }

    public static long j(ax.T4.j jVar) throws IOException, C3099a {
        try {
            long q = jVar.q();
            if (q >= 0) {
                jVar.H();
                return q;
            }
            throw new C3099a("expecting a non-negative number, got: " + q, jVar.v());
        } catch (ax.T4.i e2) {
            throw C3099a.b(e2);
        }
    }

    public static void k(ax.T4.j jVar) throws IOException, C3099a {
        try {
            jVar.L();
            jVar.H();
        } catch (ax.T4.i e2) {
            throw C3099a.b(e2);
        }
    }

    public abstract T d(ax.T4.j jVar) throws IOException, C3099a;

    public final T f(ax.T4.j jVar, String str, Object obj) throws IOException, C3099a {
        if (obj == null) {
            return d(jVar);
        }
        throw new C3099a("duplicate field \"" + str + "\"", jVar.v());
    }

    public T g(ax.T4.j jVar) throws IOException, C3099a {
        jVar.H();
        T d2 = d(jVar);
        if (jVar.j() == null) {
            l(d2);
            return d2;
        }
        throw new AssertionError("The JSON library should ensure there's no tokens after the main value: " + jVar.j() + "@" + jVar.f());
    }

    public T h(InputStream inputStream) throws IOException, C3099a {
        try {
            return g(l.s(inputStream));
        } catch (ax.T4.i e2) {
            throw C3099a.b(e2);
        }
    }

    public T i(String str) throws C3099a {
        try {
            ax.T4.j u = l.u(str);
            try {
                return g(u);
            } finally {
                u.close();
            }
        } catch (ax.T4.i e2) {
            throw C3099a.b(e2);
        } catch (IOException e3) {
            throw C3344d.a("IOException reading from String", e3);
        }
    }

    public void l(T t) {
    }
}
