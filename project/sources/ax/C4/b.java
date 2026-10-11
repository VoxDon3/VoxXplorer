package ax.C4;

import ax.C4.c;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {
    public static final b c = new b().d(c.NO_PERMISSION);
    public static final b d = new b().d(c.OTHER);
    private c a;
    private ax.C4.c b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.INVALID_ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.NO_PERMISSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: ax.C4.b$b, reason: collision with other inner class name */
    public static class C0060b extends f<b> {
        public static final C0060b b = new C0060b();

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public b a(j jVar) throws IOException, i {
            String q;
            boolean z;
            b bVar;
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
            if ("invalid_root".equals(q)) {
                AbstractC3276c.f("invalid_root", jVar);
                bVar = b.b(c.a.b.a(jVar));
            } else {
                bVar = "no_permission".equals(q) ? b.c : b.d;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return bVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(b bVar, g gVar) throws IOException, ax.T4.f {
            int i = a.a[bVar.c().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    gVar.s0("other");
                    return;
                } else {
                    gVar.s0("no_permission");
                    return;
                }
            }
            gVar.o0();
            r("invalid_root", gVar);
            gVar.o("invalid_root");
            c.a.b.k(bVar.b, gVar);
            gVar.m();
        }
    }

    public enum c {
        INVALID_ROOT,
        NO_PERMISSION,
        OTHER
    }

    private b() {
    }

    public static b b(ax.C4.c cVar) {
        if (cVar != null) {
            return new b().e(c.INVALID_ROOT, cVar);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private b d(c cVar) {
        b bVar = new b();
        bVar.a = cVar;
        return bVar;
    }

    private b e(c cVar, ax.C4.c cVar2) {
        b bVar = new b();
        bVar.a = cVar;
        bVar.b = cVar2;
        return bVar;
    }

    public c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        c cVar = this.a;
        if (cVar != bVar.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i != 1) {
            return i == 2 || i == 3;
        }
        ax.C4.c cVar2 = this.b;
        ax.C4.c cVar3 = bVar.b;
        return cVar2 == cVar3 || cVar2.equals(cVar3);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return C0060b.b.j(this, false);
    }
}
