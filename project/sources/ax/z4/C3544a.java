package ax.z4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.z4.EnumC3547d;
import ax.z4.EnumC3548e;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.z4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3544a {
    public static final C3544a d = new C3544a().f(c.OTHER);
    private c a;
    private EnumC3547d b;
    private EnumC3548e c;

    /* renamed from: ax.z4.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0509a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.INVALID_ACCOUNT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.PAPER_ACCESS_DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: ax.z4.a$b */
    public static class b extends ax.v4.f<C3544a> {
        public static final b b = new b();

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C3544a a(j jVar) throws IOException, i {
            String q;
            boolean z;
            C3544a c3544a;
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
            if ("invalid_account_type".equals(q)) {
                AbstractC3276c.f("invalid_account_type", jVar);
                c3544a = C3544a.c(EnumC3547d.b.b.a(jVar));
            } else if ("paper_access_denied".equals(q)) {
                AbstractC3276c.f("paper_access_denied", jVar);
                c3544a = C3544a.d(EnumC3548e.b.b.a(jVar));
            } else {
                c3544a = C3544a.d;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return c3544a;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(C3544a c3544a, g gVar) throws IOException, ax.T4.f {
            int i = C0509a.a[c3544a.e().ordinal()];
            if (i == 1) {
                gVar.o0();
                r("invalid_account_type", gVar);
                gVar.o("invalid_account_type");
                EnumC3547d.b.b.k(c3544a.b, gVar);
                gVar.m();
                return;
            }
            if (i != 2) {
                gVar.s0("other");
                return;
            }
            gVar.o0();
            r("paper_access_denied", gVar);
            gVar.o("paper_access_denied");
            EnumC3548e.b.b.k(c3544a.c, gVar);
            gVar.m();
        }
    }

    /* renamed from: ax.z4.a$c */
    public enum c {
        INVALID_ACCOUNT_TYPE,
        PAPER_ACCESS_DENIED,
        OTHER
    }

    private C3544a() {
    }

    public static C3544a c(EnumC3547d enumC3547d) {
        if (enumC3547d != null) {
            return new C3544a().g(c.INVALID_ACCOUNT_TYPE, enumC3547d);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static C3544a d(EnumC3548e enumC3548e) {
        if (enumC3548e != null) {
            return new C3544a().h(c.PAPER_ACCESS_DENIED, enumC3548e);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private C3544a f(c cVar) {
        C3544a c3544a = new C3544a();
        c3544a.a = cVar;
        return c3544a;
    }

    private C3544a g(c cVar, EnumC3547d enumC3547d) {
        C3544a c3544a = new C3544a();
        c3544a.a = cVar;
        c3544a.b = enumC3547d;
        return c3544a;
    }

    private C3544a h(c cVar, EnumC3548e enumC3548e) {
        C3544a c3544a = new C3544a();
        c3544a.a = cVar;
        c3544a.c = enumC3548e;
        return c3544a;
    }

    public c e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C3544a)) {
            return false;
        }
        C3544a c3544a = (C3544a) obj;
        c cVar = this.a;
        if (cVar != c3544a.a) {
            return false;
        }
        int i = C0509a.a[cVar.ordinal()];
        if (i == 1) {
            EnumC3547d enumC3547d = this.b;
            EnumC3547d enumC3547d2 = c3544a.b;
            return enumC3547d == enumC3547d2 || enumC3547d.equals(enumC3547d2);
        }
        if (i != 2) {
            return i == 3;
        }
        EnumC3548e enumC3548e = this.c;
        EnumC3548e enumC3548e2 = c3544a.c;
        return enumC3548e == enumC3548e2 || enumC3548e.equals(enumC3548e2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
