package ax.E4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g {
    public static final g c = new g().d(c.OTHER);
    private c a;
    private List<String> b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.FILTER_SOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b extends ax.v4.f<g> {
        public static final b b = new b();

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public g a(j jVar) throws IOException, i {
            String q;
            boolean z;
            g gVar;
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
            if ("filter_some".equals(q)) {
                AbstractC3276c.f("filter_some", jVar);
                gVar = g.b((List) C3277d.c(C3277d.f()).a(jVar));
            } else {
                gVar = g.c;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return gVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(g gVar, ax.T4.g gVar2) throws IOException, ax.T4.f {
            if (a.a[gVar.c().ordinal()] != 1) {
                gVar2.s0("other");
                return;
            }
            gVar2.o0();
            r("filter_some", gVar2);
            gVar2.o("filter_some");
            C3277d.c(C3277d.f()).k(gVar.b, gVar2);
            gVar2.m();
        }
    }

    public enum c {
        FILTER_SOME,
        OTHER
    }

    private g() {
    }

    public static g b(List<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("Value is null");
        }
        if (list.size() < 1) {
            throw new IllegalArgumentException("List has fewer than 1 items");
        }
        for (String str : list) {
            if (str == null) {
                throw new IllegalArgumentException("An item in list is null");
            }
            if (str.length() < 1) {
                throw new IllegalArgumentException("Stringan item in list is shorter than 1");
            }
            if (!Pattern.matches("(/|ptid:).*", str)) {
                throw new IllegalArgumentException("Stringan item in list does not match pattern");
            }
        }
        return new g().e(c.FILTER_SOME, list);
    }

    private g d(c cVar) {
        g gVar = new g();
        gVar.a = cVar;
        return gVar;
    }

    private g e(c cVar, List<String> list) {
        g gVar = new g();
        gVar.a = cVar;
        gVar.b = list;
        return gVar;
    }

    public c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        c cVar = this.a;
        if (cVar != gVar.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i != 1) {
            return i == 2;
        }
        List<String> list = this.b;
        List<String> list2 = gVar.b;
        return list == list2 || list.equals(list2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
