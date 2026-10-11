package ax.G4;

import ax.E4.b;
import ax.G4.G0;
import ax.G4.S0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D0 {
    public static final D0 e = new D0().j(c.TOO_MANY_SHARED_FOLDER_TARGETS);
    public static final D0 f = new D0().j(c.TOO_MANY_WRITE_OPERATIONS);
    public static final D0 g = new D0().j(c.CONCURRENT_SESSION_DATA_NOT_ALLOWED);
    public static final D0 h = new D0().j(c.CONCURRENT_SESSION_NOT_CLOSED);
    public static final D0 i = new D0().j(c.CONCURRENT_SESSION_MISSING_DATA);
    public static final D0 j = new D0().j(c.PAYLOAD_TOO_LARGE);
    public static final D0 k = new D0().j(c.CONTENT_HASH_MISMATCH);
    public static final D0 l = new D0().j(c.OTHER);
    private c a;
    private G0 b;
    private S0 c;
    private ax.E4.b d;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.LOOKUP_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.PATH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.PROPERTIES_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.TOO_MANY_SHARED_FOLDER_TARGETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.TOO_MANY_WRITE_OPERATIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.CONCURRENT_SESSION_DATA_NOT_ALLOWED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.CONCURRENT_SESSION_NOT_CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.CONCURRENT_SESSION_MISSING_DATA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.PAYLOAD_TOO_LARGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.CONTENT_HASH_MISMATCH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[c.OTHER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static class b extends ax.v4.f<D0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public D0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            D0 d0;
            if (jVar.j() == ax.T4.m.VALUE_STRING) {
                q = AbstractC3276c.i(jVar);
                jVar.H();
                z = true;
            } else {
                AbstractC3276c.h(jVar);
                q = AbstractC3274a.q(jVar);
                z = false;
            }
            if (q == null) {
                throw new ax.T4.i(jVar, "Required field missing: .tag");
            }
            if ("lookup_failed".equals(q)) {
                AbstractC3276c.f("lookup_failed", jVar);
                d0 = D0.f(G0.b.b.a(jVar));
            } else if ("path".equals(q)) {
                AbstractC3276c.f("path", jVar);
                d0 = D0.g(S0.b.b.a(jVar));
            } else if ("properties_error".equals(q)) {
                AbstractC3276c.f("properties_error", jVar);
                d0 = D0.h(b.C0073b.b.a(jVar));
            } else {
                d0 = "too_many_shared_folder_targets".equals(q) ? D0.e : "too_many_write_operations".equals(q) ? D0.f : "concurrent_session_data_not_allowed".equals(q) ? D0.g : "concurrent_session_not_closed".equals(q) ? D0.h : "concurrent_session_missing_data".equals(q) ? D0.i : "payload_too_large".equals(q) ? D0.j : "content_hash_mismatch".equals(q) ? D0.k : D0.l;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return d0;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(D0 d0, ax.T4.g gVar) throws IOException, ax.T4.f {
            switch (a.a[d0.i().ordinal()]) {
                case 1:
                    gVar.o0();
                    r("lookup_failed", gVar);
                    gVar.o("lookup_failed");
                    G0.b.b.k(d0.b, gVar);
                    gVar.m();
                    break;
                case 2:
                    gVar.o0();
                    r("path", gVar);
                    gVar.o("path");
                    S0.b.b.k(d0.c, gVar);
                    gVar.m();
                    break;
                case 3:
                    gVar.o0();
                    r("properties_error", gVar);
                    gVar.o("properties_error");
                    b.C0073b.b.k(d0.d, gVar);
                    gVar.m();
                    break;
                case 4:
                    gVar.s0("too_many_shared_folder_targets");
                    break;
                case 5:
                    gVar.s0("too_many_write_operations");
                    break;
                case 6:
                    gVar.s0("concurrent_session_data_not_allowed");
                    break;
                case 7:
                    gVar.s0("concurrent_session_not_closed");
                    break;
                case 8:
                    gVar.s0("concurrent_session_missing_data");
                    break;
                case 9:
                    gVar.s0("payload_too_large");
                    break;
                case 10:
                    gVar.s0("content_hash_mismatch");
                    break;
                default:
                    gVar.s0("other");
                    break;
            }
        }
    }

    public enum c {
        LOOKUP_FAILED,
        PATH,
        PROPERTIES_ERROR,
        TOO_MANY_SHARED_FOLDER_TARGETS,
        TOO_MANY_WRITE_OPERATIONS,
        CONCURRENT_SESSION_DATA_NOT_ALLOWED,
        CONCURRENT_SESSION_NOT_CLOSED,
        CONCURRENT_SESSION_MISSING_DATA,
        PAYLOAD_TOO_LARGE,
        CONTENT_HASH_MISMATCH,
        OTHER
    }

    private D0() {
    }

    public static D0 f(G0 g0) {
        if (g0 != null) {
            return new D0().k(c.LOOKUP_FAILED, g0);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static D0 g(S0 s0) {
        if (s0 != null) {
            return new D0().l(c.PATH, s0);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static D0 h(ax.E4.b bVar) {
        if (bVar != null) {
            return new D0().m(c.PROPERTIES_ERROR, bVar);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private D0 j(c cVar) {
        D0 d0 = new D0();
        d0.a = cVar;
        return d0;
    }

    private D0 k(c cVar, G0 g0) {
        D0 d0 = new D0();
        d0.a = cVar;
        d0.b = g0;
        return d0;
    }

    private D0 l(c cVar, S0 s0) {
        D0 d0 = new D0();
        d0.a = cVar;
        d0.c = s0;
        return d0;
    }

    private D0 m(c cVar, ax.E4.b bVar) {
        D0 d0 = new D0();
        d0.a = cVar;
        d0.d = bVar;
        return d0;
    }

    public G0 d() {
        if (this.a == c.LOOKUP_FAILED) {
            return this.b;
        }
        throw new IllegalStateException("Invalid tag: required Tag.LOOKUP_FAILED, but was Tag." + this.a.name());
    }

    public boolean e() {
        return this.a == c.LOOKUP_FAILED;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof D0)) {
            return false;
        }
        D0 d0 = (D0) obj;
        c cVar = this.a;
        if (cVar != d0.a) {
            return false;
        }
        switch (a.a[cVar.ordinal()]) {
            case 1:
                G0 g0 = this.b;
                G0 g02 = d0.b;
                return g0 == g02 || g0.equals(g02);
            case 2:
                S0 s0 = this.c;
                S0 s02 = d0.c;
                return s0 == s02 || s0.equals(s02);
            case 3:
                ax.E4.b bVar = this.d;
                ax.E4.b bVar2 = d0.d;
                return bVar == bVar2 || bVar.equals(bVar2);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            default:
                return false;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public c i() {
        return this.a;
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
