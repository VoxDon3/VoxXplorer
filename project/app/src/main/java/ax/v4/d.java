/*
 * Decompiled with CFR 0.152.
 */
package ax.v4;

import ax.T4.j;
import ax.T4.m;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class d {
    public static ax.v4.c<Boolean> a() {
        return a.b;
    }

    public static ax.v4.c<Double> b() {
        return c.b;
    }

    public static <T> ax.v4.c<List<T>> c(ax.v4.c<T> c8) {
        return new d<T>(c8);
    }

    public static <T> ax.v4.c<T> d(ax.v4.c<T> c8) {
        return new f<T>(c8);
    }

    public static <T> ax.v4.e<T> e(ax.v4.e<T> e8) {
        return new g<T>(e8);
    }

    public static ax.v4.c<String> f() {
        return h.b;
    }

    public static ax.v4.c<Date> g() {
        return b.b;
    }

    public static ax.v4.c<Long> h() {
        return e.b;
    }

    public static ax.v4.c<Long> i() {
        return e.b;
    }

    public static ax.v4.c<Void> j() {
        return i.b;
    }

    private static final class a
    extends ax.v4.c<Boolean> {
        public static final a b = new a();

        private a() {
        }

        public Boolean p(j j8) throws IOException, ax.T4.i {
            boolean bl = j8.e();
            j8.H();
            return bl;
        }

        public void q(Boolean bl, ax.T4.g g8) throws IOException, ax.T4.f {
            g8.g(bl);
        }
    }

    private static final class b
    extends ax.v4.c<Date> {
        public static final b b = new b();

        private b() {
        }

        public Date p(j j8) throws IOException, ax.T4.i {
            String string = ax.v4.c.i(j8);
            j8.H();
            try {
                Date date = ax.v4.g.b(string);
                return date;
            }
            catch (ParseException parseException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Malformed timestamp: '");
                stringBuilder.append(string);
                stringBuilder.append("'");
                throw new ax.T4.i(j8, stringBuilder.toString(), (Throwable)parseException);
            }
        }

        public void q(Date date, ax.T4.g g8) throws IOException, ax.T4.f {
            g8.s0(ax.v4.g.a(date));
        }
    }

    private static final class c
    extends ax.v4.c<Double> {
        public static final c b = new c();

        private c() {
        }

        public Double p(j j8) throws IOException, ax.T4.i {
            double d8 = j8.m();
            j8.H();
            return d8;
        }

        public void q(Double d8, ax.T4.g g8) throws IOException, ax.T4.f {
            g8.q(d8);
        }
    }

    private static final class d<T>
    extends ax.v4.c<List<T>> {
        private final ax.v4.c<T> b;

        public d(ax.v4.c<T> c8) {
            this.b = c8;
        }

        public List<T> p(j j8) throws IOException, ax.T4.i {
            ax.v4.c.g(j8);
            ArrayList<T> arrayList = new ArrayList<T>();
            while (j8.j() != m.o0) {
                arrayList.add(this.b.a(j8));
            }
            ax.v4.c.d(j8);
            return arrayList;
        }

        public void q(List<T> object, ax.T4.g g8) throws IOException, ax.T4.f {
            g8.d0(object.size());
            object = object.iterator();
            while (object.hasNext()) {
                Object e8 = object.next();
                this.b.k(e8, g8);
            }
            g8.j();
        }
    }

    private static final class e
    extends ax.v4.c<Long> {
        public static final e b = new e();

        private e() {
        }

        public Long p(j j8) throws IOException, ax.T4.i {
            long l8 = j8.q();
            j8.H();
            return l8;
        }

        public void q(Long l8, ax.T4.g g8) throws IOException, ax.T4.f {
            g8.u(l8);
        }
    }

    private static final class f<T>
    extends ax.v4.c<T> {
        private final ax.v4.c<T> b;

        public f(ax.v4.c<T> c8) {
            this.b = c8;
        }

        @Override
        public T a(j j8) throws IOException, ax.T4.i {
            if (j8.j() == m.w0) {
                j8.H();
                return null;
            }
            return this.b.a(j8);
        }

        @Override
        public void k(T t8, ax.T4.g g8) throws IOException, ax.T4.f {
            if (t8 == null) {
                g8.p();
                return;
            }
            this.b.k(t8, g8);
        }
    }

    private static final class g<T>
    extends ax.v4.e<T> {
        private final ax.v4.e<T> b;

        public g(ax.v4.e<T> e8) {
            this.b = e8;
        }

        @Override
        public T a(j j8) throws IOException {
            if (j8.j() == m.w0) {
                j8.H();
                return null;
            }
            return this.b.a(j8);
        }

        @Override
        public void k(T t8, ax.T4.g g8) throws IOException {
            if (t8 == null) {
                g8.p();
                return;
            }
            this.b.k(t8, g8);
        }

        @Override
        public T s(j j8, boolean bl) throws IOException {
            if (j8.j() == m.w0) {
                j8.H();
                return null;
            }
            return this.b.s(j8, bl);
        }

        @Override
        public void t(T t8, ax.T4.g g8, boolean bl) throws IOException {
            if (t8 == null) {
                g8.p();
                return;
            }
            this.b.t(t8, g8, bl);
        }
    }

    private static final class h
    extends ax.v4.c<String> {
        public static final h b = new h();

        private h() {
        }

        public String p(j j8) throws IOException, ax.T4.i {
            String string = ax.v4.c.i(j8);
            j8.H();
            return string;
        }

        public void q(String string, ax.T4.g g8) throws IOException, ax.T4.f {
            g8.s0(string);
        }
    }

    private static final class i
    extends ax.v4.c<Void> {
        public static final i b = new i();

        private i() {
        }

        public Void p(j j8) throws IOException, ax.T4.i {
            ax.v4.c.o(j8);
            return null;
        }

        public void q(Void void_, ax.T4.g g8) throws IOException, ax.T4.f {
            g8.p();
        }
    }
}

