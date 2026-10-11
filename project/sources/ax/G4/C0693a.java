package ax.G4;

import ax.E4.e;
import ax.G4.T0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import ax.w4.C3344d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: ax.G4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0693a {
    protected final String a;
    protected final T0 b;
    protected final boolean c;
    protected final Date d;
    protected final boolean e;
    protected final List<ax.E4.e> f;
    protected final boolean g;

    /* renamed from: ax.G4.a$a, reason: collision with other inner class name */
    public static class C0084a {
        protected final String a;
        protected T0 b;
        protected boolean c;
        protected Date d;
        protected boolean e;
        protected List<ax.E4.e> f;
        protected boolean g;

        protected C0084a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Required value for 'path' is null");
            }
            if (!Pattern.matches("(/(.|[\\r\\n])*)|(ns:[0-9]+(/.*)?)|(id:.*)", str)) {
                throw new IllegalArgumentException("String 'path' does not match pattern");
            }
            this.a = str;
            this.b = T0.c;
            this.c = false;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = false;
        }

        public C0693a a() {
            return new C0693a(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }

        public C0084a b(Boolean bool) {
            if (bool != null) {
                this.c = bool.booleanValue();
                return this;
            }
            this.c = false;
            return this;
        }

        public C0084a c(Date date) {
            this.d = C3344d.b(date);
            return this;
        }

        public C0084a d(T0 t0) {
            if (t0 != null) {
                this.b = t0;
                return this;
            }
            this.b = T0.c;
            return this;
        }
    }

    /* renamed from: ax.G4.a$b */
    static class b extends ax.v4.e<C0693a> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0693a s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            T0 t0 = T0.c;
            Boolean bool = Boolean.FALSE;
            String str2 = null;
            Date date = null;
            List list = null;
            T0 t02 = t0;
            Boolean bool2 = bool;
            Boolean bool3 = bool2;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("path".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("mode".equals(g)) {
                    t02 = T0.b.b.a(jVar);
                } else if ("autorename".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else if ("client_modified".equals(g)) {
                    date = (Date) C3277d.d(C3277d.g()).a(jVar);
                } else if ("mute".equals(g)) {
                    bool2 = C3277d.a().a(jVar);
                } else if ("property_groups".equals(g)) {
                    list = (List) C3277d.d(C3277d.c(e.a.b)).a(jVar);
                } else if ("strict_conflict".equals(g)) {
                    bool3 = C3277d.a().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"path\" missing.");
            }
            C0693a c0693a = new C0693a(str2, t02, bool.booleanValue(), date, bool2.booleanValue(), list, bool3.booleanValue());
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0693a, c0693a.b());
            return c0693a;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0693a c0693a, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("path");
            C3277d.f().k(c0693a.a, gVar);
            gVar.o("mode");
            T0.b.b.k(c0693a.b, gVar);
            gVar.o("autorename");
            C3277d.a().k(Boolean.valueOf(c0693a.c), gVar);
            if (c0693a.d != null) {
                gVar.o("client_modified");
                C3277d.d(C3277d.g()).k(c0693a.d, gVar);
            }
            gVar.o("mute");
            C3277d.a().k(Boolean.valueOf(c0693a.e), gVar);
            if (c0693a.f != null) {
                gVar.o("property_groups");
                C3277d.d(C3277d.c(e.a.b)).k(c0693a.f, gVar);
            }
            gVar.o("strict_conflict");
            C3277d.a().k(Boolean.valueOf(c0693a.g), gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0693a(String str, T0 t0, boolean z, Date date, boolean z2, List<ax.E4.e> list, boolean z3) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'path' is null");
        }
        if (!Pattern.matches("(/(.|[\\r\\n])*)|(ns:[0-9]+(/.*)?)|(id:.*)", str)) {
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        this.a = str;
        if (t0 == null) {
            throw new IllegalArgumentException("Required value for 'mode' is null");
        }
        this.b = t0;
        this.c = z;
        this.d = C3344d.b(date);
        this.e = z2;
        if (list != null) {
            Iterator<ax.E4.e> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new IllegalArgumentException("An item in list 'propertyGroups' is null");
                }
            }
        }
        this.f = list;
        this.g = z3;
    }

    public static C0084a a(String str) {
        return new C0084a(str);
    }

    public String b() {
        return b.b.j(this, true);
    }

    public boolean equals(Object obj) {
        C0693a c0693a;
        String str;
        String str2;
        T0 t0;
        T0 t02;
        Date date;
        Date date2;
        List<ax.E4.e> list;
        List<ax.E4.e> list2;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((str = this.a) == (str2 = (c0693a = (C0693a) obj).a) || str.equals(str2)) && (((t0 = this.b) == (t02 = c0693a.b) || t0.equals(t02)) && this.c == c0693a.c && (((date = this.d) == (date2 = c0693a.d) || (date != null && date.equals(date2))) && this.e == c0693a.e && (((list = this.f) == (list2 = c0693a.f) || (list != null && list.equals(list2))) && this.g == c0693a.g)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), this.d, Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g)});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
