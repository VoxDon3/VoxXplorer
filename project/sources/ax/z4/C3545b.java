package ax.z4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.z4.C3549f;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.z4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3545b {
    public static final C3545b c = new C3545b().d(c.INVALID_ACCESS_TOKEN);
    public static final C3545b d = new C3545b().d(c.INVALID_SELECT_USER);
    public static final C3545b e = new C3545b().d(c.INVALID_SELECT_ADMIN);
    public static final C3545b f = new C3545b().d(c.USER_SUSPENDED);
    public static final C3545b g = new C3545b().d(c.EXPIRED_ACCESS_TOKEN);
    public static final C3545b h = new C3545b().d(c.ROUTE_ACCESS_DENIED);
    public static final C3545b i = new C3545b().d(c.OTHER);
    private c a;
    private C3549f b;

    /* renamed from: ax.z4.b$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.INVALID_ACCESS_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.INVALID_SELECT_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.INVALID_SELECT_ADMIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.USER_SUSPENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.EXPIRED_ACCESS_TOKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.MISSING_SCOPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.ROUTE_ACCESS_DENIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.OTHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: ax.z4.b$b, reason: collision with other inner class name */
    public static class C0510b extends ax.v4.f<C3545b> {
        public static final C0510b b = new C0510b();

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C3545b a(j jVar) throws IOException, i {
            String q;
            boolean z;
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
            C3545b b2 = "invalid_access_token".equals(q) ? C3545b.c : "invalid_select_user".equals(q) ? C3545b.d : "invalid_select_admin".equals(q) ? C3545b.e : "user_suspended".equals(q) ? C3545b.f : "expired_access_token".equals(q) ? C3545b.g : "missing_scope".equals(q) ? C3545b.b(C3549f.a.b.s(jVar, true)) : "route_access_denied".equals(q) ? C3545b.h : C3545b.i;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return b2;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(C3545b c3545b, g gVar) throws IOException, ax.T4.f {
            switch (a.a[c3545b.c().ordinal()]) {
                case 1:
                    gVar.s0("invalid_access_token");
                    break;
                case 2:
                    gVar.s0("invalid_select_user");
                    break;
                case 3:
                    gVar.s0("invalid_select_admin");
                    break;
                case 4:
                    gVar.s0("user_suspended");
                    break;
                case 5:
                    gVar.s0("expired_access_token");
                    break;
                case 6:
                    gVar.o0();
                    r("missing_scope", gVar);
                    C3549f.a.b.t(c3545b.b, gVar, true);
                    gVar.m();
                    break;
                case 7:
                    gVar.s0("route_access_denied");
                    break;
                default:
                    gVar.s0("other");
                    break;
            }
        }
    }

    /* renamed from: ax.z4.b$c */
    public enum c {
        INVALID_ACCESS_TOKEN,
        INVALID_SELECT_USER,
        INVALID_SELECT_ADMIN,
        USER_SUSPENDED,
        EXPIRED_ACCESS_TOKEN,
        MISSING_SCOPE,
        ROUTE_ACCESS_DENIED,
        OTHER
    }

    private C3545b() {
    }

    public static C3545b b(C3549f c3549f) {
        if (c3549f != null) {
            return new C3545b().e(c.MISSING_SCOPE, c3549f);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private C3545b d(c cVar) {
        C3545b c3545b = new C3545b();
        c3545b.a = cVar;
        return c3545b;
    }

    private C3545b e(c cVar, C3549f c3549f) {
        C3545b c3545b = new C3545b();
        c3545b.a = cVar;
        c3545b.b = c3549f;
        return c3545b;
    }

    public c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C3545b)) {
            return false;
        }
        C3545b c3545b = (C3545b) obj;
        c cVar = this.a;
        if (cVar != c3545b.a) {
            return false;
        }
        switch (a.a[cVar.ordinal()]) {
            case 6:
                C3549f c3549f = this.b;
                C3549f c3549f2 = c3545b.b;
                if (c3549f != c3549f2 && !c3549f.equals(c3549f2)) {
                    return false;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return C0510b.b.j(this, false);
    }
}
