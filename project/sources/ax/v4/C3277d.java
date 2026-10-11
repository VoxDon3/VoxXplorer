package ax.v4;

import ax.T4.j;
import ax.T4.m;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.v4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3277d {

    /* renamed from: ax.v4.d$a */
    private static final class a extends AbstractC3276c<Boolean> {
        public static final a b = new a();

        private a() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public Boolean a(j jVar) throws IOException, ax.T4.i {
            Boolean valueOf = Boolean.valueOf(jVar.e());
            jVar.H();
            return valueOf;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void k(Boolean bool, ax.T4.g gVar) throws IOException, ax.T4.f {
            gVar.g(bool.booleanValue());
        }
    }

    /* renamed from: ax.v4.d$b */
    private static final class b extends AbstractC3276c<Date> {
        public static final b b = new b();

        private b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public Date a(j jVar) throws IOException, ax.T4.i {
            String i = AbstractC3276c.i(jVar);
            jVar.H();
            try {
                return ax.v4.g.b(i);
            } catch (ParseException e) {
                throw new ax.T4.i(jVar, "Malformed timestamp: '" + i + "'", e);
            }
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void k(Date date, ax.T4.g gVar) throws IOException, ax.T4.f {
            gVar.s0(ax.v4.g.a(date));
        }
    }

    /* renamed from: ax.v4.d$c */
    private static final class c extends AbstractC3276c<Double> {
        public static final c b = new c();

        private c() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public Double a(j jVar) throws IOException, ax.T4.i {
            Double valueOf = Double.valueOf(jVar.m());
            jVar.H();
            return valueOf;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void k(Double d, ax.T4.g gVar) throws IOException, ax.T4.f {
            gVar.q(d.doubleValue());
        }
    }

    /* renamed from: ax.v4.d$d, reason: collision with other inner class name */
    private static final class C0480d<T> extends AbstractC3276c<List<T>> {
        private final AbstractC3276c<T> b;

        public C0480d(AbstractC3276c<T> abstractC3276c) {
            this.b = abstractC3276c;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<T> a(j jVar) throws IOException, ax.T4.i {
            AbstractC3276c.g(jVar);
            ArrayList arrayList = new ArrayList();
            while (jVar.j() != m.END_ARRAY) {
                arrayList.add(this.b.a(jVar));
            }
            AbstractC3276c.d(jVar);
            return arrayList;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void k(List<T> list, ax.T4.g gVar) throws IOException, ax.T4.f {
            gVar.d0(list.size());
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.b.k(it.next(), gVar);
            }
            gVar.j();
        }
    }

    /* renamed from: ax.v4.d$e */
    private static final class e extends AbstractC3276c<Long> {
        public static final e b = new e();

        private e() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public Long a(j jVar) throws IOException, ax.T4.i {
            Long valueOf = Long.valueOf(jVar.q());
            jVar.H();
            return valueOf;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void k(Long l, ax.T4.g gVar) throws IOException, ax.T4.f {
            gVar.u(l.longValue());
        }
    }

    /* renamed from: ax.v4.d$f */
    private static final class f<T> extends AbstractC3276c<T> {
        private final AbstractC3276c<T> b;

        public f(AbstractC3276c<T> abstractC3276c) {
            this.b = abstractC3276c;
        }

        @Override // ax.v4.AbstractC3276c
        public T a(j jVar) throws IOException, ax.T4.i {
            if (jVar.j() != m.VALUE_NULL) {
                return this.b.a(jVar);
            }
            jVar.H();
            return null;
        }

        @Override // ax.v4.AbstractC3276c
        public void k(T t, ax.T4.g gVar) throws IOException, ax.T4.f {
            if (t == null) {
                gVar.p();
            } else {
                this.b.k(t, gVar);
            }
        }
    }

    /* renamed from: ax.v4.d$g */
    private static final class g<T> extends ax.v4.e<T> {
        private final ax.v4.e<T> b;

        public g(ax.v4.e<T> eVar) {
            this.b = eVar;
        }

        @Override // ax.v4.e, ax.v4.AbstractC3276c
        public T a(j jVar) throws IOException {
            if (jVar.j() != m.VALUE_NULL) {
                return this.b.a(jVar);
            }
            jVar.H();
            return null;
        }

        @Override // ax.v4.e, ax.v4.AbstractC3276c
        public void k(T t, ax.T4.g gVar) throws IOException {
            if (t == null) {
                gVar.p();
            } else {
                this.b.k(t, gVar);
            }
        }

        @Override // ax.v4.e
        public T s(j jVar, boolean z) throws IOException {
            if (jVar.j() != m.VALUE_NULL) {
                return this.b.s(jVar, z);
            }
            jVar.H();
            return null;
        }

        @Override // ax.v4.e
        public void t(T t, ax.T4.g gVar, boolean z) throws IOException {
            if (t == null) {
                gVar.p();
            } else {
                this.b.t(t, gVar, z);
            }
        }
    }

    /* renamed from: ax.v4.d$h */
    private static final class h extends AbstractC3276c<String> {
        public static final h b = new h();

        private h() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public String a(j jVar) throws IOException, ax.T4.i {
            String i = AbstractC3276c.i(jVar);
            jVar.H();
            return i;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void k(String str, ax.T4.g gVar) throws IOException, ax.T4.f {
            gVar.s0(str);
        }
    }

    /* renamed from: ax.v4.d$i */
    private static final class i extends AbstractC3276c<Void> {
        public static final i b = new i();

        private i() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public Void a(j jVar) throws IOException, ax.T4.i {
            AbstractC3276c.o(jVar);
            return null;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void k(Void r1, ax.T4.g gVar) throws IOException, ax.T4.f {
            gVar.p();
        }
    }

    public static AbstractC3276c<Boolean> a() {
        return a.b;
    }

    public static AbstractC3276c<Double> b() {
        return c.b;
    }

    public static <T> AbstractC3276c<List<T>> c(AbstractC3276c<T> abstractC3276c) {
        return new C0480d(abstractC3276c);
    }

    public static <T> AbstractC3276c<T> d(AbstractC3276c<T> abstractC3276c) {
        return new f(abstractC3276c);
    }

    public static <T> ax.v4.e<T> e(ax.v4.e<T> eVar) {
        return new g(eVar);
    }

    public static AbstractC3276c<String> f() {
        return h.b;
    }

    public static AbstractC3276c<Date> g() {
        return b.b;
    }

    public static AbstractC3276c<Long> h() {
        return e.b;
    }

    public static AbstractC3276c<Long> i() {
        return e.b;
    }

    public static AbstractC3276c<Void> j() {
        return i.b;
    }
}
