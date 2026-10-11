package ax.G4;

import ax.G4.EnumC0706g0;
import ax.G4.EnumC0734w;
import ax.G4.r;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: ax.G4.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0704f0 {
    protected final String a;
    protected final long b;
    protected final EnumC0706g0 c;
    protected final EnumC0734w d;
    protected final boolean e;
    protected final List<String> f;
    protected final List<r> g;
    protected final String h;

    /* renamed from: ax.G4.f0$a */
    public static class a {
        protected String a = null;
        protected long b = 100;
        protected EnumC0706g0 c = null;
        protected EnumC0734w d = EnumC0734w.ACTIVE;
        protected boolean e = false;
        protected List<String> f = null;
        protected List<r> g = null;
        protected String h = null;

        protected a() {
        }

        public C0704f0 a() {
            return new C0704f0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public a b(Boolean bool) {
            if (bool != null) {
                this.e = bool.booleanValue();
                return this;
            }
            this.e = false;
            return this;
        }

        public a c(Long l) {
            if (l.longValue() < 1) {
                throw new IllegalArgumentException("Number 'maxResults' is smaller than 1L");
            }
            if (l.longValue() > 1000) {
                throw new IllegalArgumentException("Number 'maxResults' is larger than 1000L");
            }
            this.b = l.longValue();
            return this;
        }

        public a d(String str) {
            if (str != null && !Pattern.matches("(/(.|[\\r\\n])*)?|id:.*|(ns:[0-9]+(/.*)?)", str)) {
                throw new IllegalArgumentException("String 'path' does not match pattern");
            }
            this.a = str;
            return this;
        }
    }

    /* renamed from: ax.G4.f0$b */
    static class b extends ax.v4.e<C0704f0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0704f0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            Long l = 100L;
            EnumC0734w enumC0734w = EnumC0734w.ACTIVE;
            Boolean bool = Boolean.FALSE;
            String str2 = null;
            EnumC0706g0 enumC0706g0 = null;
            List list = null;
            List list2 = null;
            String str3 = null;
            EnumC0734w enumC0734w2 = enumC0734w;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("path".equals(g)) {
                    str2 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else if ("max_results".equals(g)) {
                    l = C3277d.i().a(jVar);
                } else if ("order_by".equals(g)) {
                    enumC0706g0 = (EnumC0706g0) C3277d.d(EnumC0706g0.b.b).a(jVar);
                } else if ("file_status".equals(g)) {
                    enumC0734w2 = EnumC0734w.b.b.a(jVar);
                } else if ("filename_only".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else if ("file_extensions".equals(g)) {
                    list = (List) C3277d.d(C3277d.c(C3277d.f())).a(jVar);
                } else if ("file_categories".equals(g)) {
                    list2 = (List) C3277d.d(C3277d.c(r.b.b)).a(jVar);
                } else if ("account_id".equals(g)) {
                    str3 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            C0704f0 c0704f0 = new C0704f0(str2, l.longValue(), enumC0706g0, enumC0734w2, bool.booleanValue(), list, list2, str3);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0704f0, c0704f0.b());
            return c0704f0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0704f0 c0704f0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            if (c0704f0.a != null) {
                gVar.o("path");
                C3277d.d(C3277d.f()).k(c0704f0.a, gVar);
            }
            gVar.o("max_results");
            C3277d.i().k(Long.valueOf(c0704f0.b), gVar);
            if (c0704f0.c != null) {
                gVar.o("order_by");
                C3277d.d(EnumC0706g0.b.b).k(c0704f0.c, gVar);
            }
            gVar.o("file_status");
            EnumC0734w.b.b.k(c0704f0.d, gVar);
            gVar.o("filename_only");
            C3277d.a().k(Boolean.valueOf(c0704f0.e), gVar);
            if (c0704f0.f != null) {
                gVar.o("file_extensions");
                C3277d.d(C3277d.c(C3277d.f())).k(c0704f0.f, gVar);
            }
            if (c0704f0.g != null) {
                gVar.o("file_categories");
                C3277d.d(C3277d.c(r.b.b)).k(c0704f0.g, gVar);
            }
            if (c0704f0.h != null) {
                gVar.o("account_id");
                C3277d.d(C3277d.f()).k(c0704f0.h, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0704f0(String str, long j, EnumC0706g0 enumC0706g0, EnumC0734w enumC0734w, boolean z, List<String> list, List<r> list2, String str2) {
        if (str != null && !Pattern.matches("(/(.|[\\r\\n])*)?|id:.*|(ns:[0-9]+(/.*)?)", str)) {
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        this.a = str;
        if (j < 1) {
            throw new IllegalArgumentException("Number 'maxResults' is smaller than 1L");
        }
        if (j > 1000) {
            throw new IllegalArgumentException("Number 'maxResults' is larger than 1000L");
        }
        this.b = j;
        this.c = enumC0706g0;
        if (enumC0734w == null) {
            throw new IllegalArgumentException("Required value for 'fileStatus' is null");
        }
        this.d = enumC0734w;
        this.e = z;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new IllegalArgumentException("An item in list 'fileExtensions' is null");
                }
            }
        }
        this.f = list;
        if (list2 != null) {
            Iterator<r> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (it2.next() == null) {
                    throw new IllegalArgumentException("An item in list 'fileCategories' is null");
                }
            }
        }
        this.g = list2;
        if (str2 != null) {
            if (str2.length() < 40) {
                throw new IllegalArgumentException("String 'accountId' is shorter than 40");
            }
            if (str2.length() > 40) {
                throw new IllegalArgumentException("String 'accountId' is longer than 40");
            }
        }
        this.h = str2;
    }

    public static a a() {
        return new a();
    }

    public String b() {
        return b.b.j(this, true);
    }

    public boolean equals(Object obj) {
        C0704f0 c0704f0;
        String str;
        String str2;
        EnumC0706g0 enumC0706g0;
        EnumC0706g0 enumC0706g02;
        EnumC0734w enumC0734w;
        EnumC0734w enumC0734w2;
        List<String> list;
        List<String> list2;
        List<r> list3;
        List<r> list4;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((str = this.a) == (str2 = (c0704f0 = (C0704f0) obj).a) || (str != null && str.equals(str2))) && this.b == c0704f0.b && (((enumC0706g0 = this.c) == (enumC0706g02 = c0704f0.c) || (enumC0706g0 != null && enumC0706g0.equals(enumC0706g02))) && (((enumC0734w = this.d) == (enumC0734w2 = c0704f0.d) || enumC0734w.equals(enumC0734w2)) && this.e == c0704f0.e && (((list = this.f) == (list2 = c0704f0.f) || (list != null && list.equals(list2))) && (((list3 = this.g) == (list4 = c0704f0.g) || (list3 != null && list3.equals(list4))) && ((str3 = this.h) == (str4 = c0704f0.h) || (str3 != null && str3.equals(str4)))))));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), this.c, this.d, Boolean.valueOf(this.e), this.f, this.g, this.h});
    }

    public String toString() {
        return b.b.j(this, false);
    }

    public C0704f0() {
        this(null, 100L, null, EnumC0734w.ACTIVE, false, null, null, null);
    }
}
