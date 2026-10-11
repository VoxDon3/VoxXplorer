package ax.C4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3277d;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {
    public static final a d = new a().f(c.HOME);
    public static final a e = new a().f(c.OTHER);
    private c a;
    private String b;
    private String c;

    /* renamed from: ax.C4.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0059a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.ROOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.NAMESPACE_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends f<a> {
        public static final b b = new b();

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a a(j jVar) throws IOException, i {
            String q;
            boolean z;
            a aVar;
            if (jVar.j() == m.VALUE_STRING) {
                q = AbstractC3276c.i(jVar);
                jVar.H();
                z = true;
            } else {
                AbstractC3276c.h(jVar);
                q = AbstractC3274a.q(jVar);
                z = false;
            }
            if (q == null) {
                throw new i(jVar, "Required field missing: .tag");
            }
            if ("home".equals(q)) {
                aVar = a.d;
            } else if ("root".equals(q)) {
                AbstractC3276c.f("root", jVar);
                aVar = a.d(C3277d.f().a(jVar));
            } else if ("namespace_id".equals(q)) {
                AbstractC3276c.f("namespace_id", jVar);
                aVar = a.c(C3277d.f().a(jVar));
            } else {
                aVar = a.e;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return aVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(a aVar, g gVar) throws IOException, ax.T4.f {
            int i = C0059a.a[aVar.e().ordinal()];
            if (i == 1) {
                gVar.s0("home");
                return;
            }
            if (i == 2) {
                gVar.o0();
                r("root", gVar);
                gVar.o("root");
                C3277d.f().k(aVar.b, gVar);
                gVar.m();
                return;
            }
            if (i != 3) {
                gVar.s0("other");
                return;
            }
            gVar.o0();
            r("namespace_id", gVar);
            gVar.o("namespace_id");
            C3277d.f().k(aVar.c, gVar);
            gVar.m();
        }
    }

    public enum c {
        HOME,
        ROOT,
        NAMESPACE_ID,
        OTHER
    }

    private a() {
    }

    public static a c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Value is null");
        }
        if (Pattern.matches("[-_0-9a-zA-Z:]+", str)) {
            return new a().g(c.NAMESPACE_ID, str);
        }
        throw new IllegalArgumentException("String does not match pattern");
    }

    public static a d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Value is null");
        }
        if (Pattern.matches("[-_0-9a-zA-Z:]+", str)) {
            return new a().h(c.ROOT, str);
        }
        throw new IllegalArgumentException("String does not match pattern");
    }

    private a f(c cVar) {
        a aVar = new a();
        aVar.a = cVar;
        return aVar;
    }

    private a g(c cVar, String str) {
        a aVar = new a();
        aVar.a = cVar;
        aVar.c = str;
        return aVar;
    }

    private a h(c cVar, String str) {
        a aVar = new a();
        aVar.a = cVar;
        aVar.b = str;
        return aVar;
    }

    public c e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        c cVar = this.a;
        if (cVar != aVar.a) {
            return false;
        }
        int i = C0059a.a[cVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i == 4;
                }
                String str = this.c;
                String str2 = aVar.c;
                return str == str2 || str.equals(str2);
            }
            String str3 = this.b;
            String str4 = aVar.b;
            if (str3 != str4 && !str3.equals(str4)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
