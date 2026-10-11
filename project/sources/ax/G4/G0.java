package ax.G4;

import ax.G4.H0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class G0 {
    public static final G0 c = new G0().f(c.NOT_FOUND);
    public static final G0 d = new G0().f(c.CLOSED);
    public static final G0 e = new G0().f(c.NOT_CLOSED);
    public static final G0 f = new G0().f(c.TOO_LARGE);
    public static final G0 g = new G0().f(c.CONCURRENT_SESSION_INVALID_OFFSET);
    public static final G0 h = new G0().f(c.CONCURRENT_SESSION_INVALID_DATA_SIZE);
    public static final G0 i = new G0().f(c.PAYLOAD_TOO_LARGE);
    public static final G0 j = new G0().f(c.OTHER);
    private c a;
    private H0 b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.INCORRECT_OFFSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.NOT_CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.TOO_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.CONCURRENT_SESSION_INVALID_OFFSET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.CONCURRENT_SESSION_INVALID_DATA_SIZE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.PAYLOAD_TOO_LARGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.OTHER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static class b extends ax.v4.f<G0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public G0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
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
            G0 c = "not_found".equals(q) ? G0.c : "incorrect_offset".equals(q) ? G0.c(H0.a.b.s(jVar, true)) : "closed".equals(q) ? G0.d : "not_closed".equals(q) ? G0.e : "too_large".equals(q) ? G0.f : "concurrent_session_invalid_offset".equals(q) ? G0.g : "concurrent_session_invalid_data_size".equals(q) ? G0.h : "payload_too_large".equals(q) ? G0.i : G0.j;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return c;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(G0 g0, ax.T4.g gVar) throws IOException, ax.T4.f {
            switch (a.a[g0.e().ordinal()]) {
                case 1:
                    gVar.s0("not_found");
                    break;
                case 2:
                    gVar.o0();
                    r("incorrect_offset", gVar);
                    H0.a.b.t(g0.b, gVar, true);
                    gVar.m();
                    break;
                case 3:
                    gVar.s0("closed");
                    break;
                case 4:
                    gVar.s0("not_closed");
                    break;
                case 5:
                    gVar.s0("too_large");
                    break;
                case 6:
                    gVar.s0("concurrent_session_invalid_offset");
                    break;
                case 7:
                    gVar.s0("concurrent_session_invalid_data_size");
                    break;
                case 8:
                    gVar.s0("payload_too_large");
                    break;
                default:
                    gVar.s0("other");
                    break;
            }
        }
    }

    public enum c {
        NOT_FOUND,
        INCORRECT_OFFSET,
        CLOSED,
        NOT_CLOSED,
        TOO_LARGE,
        CONCURRENT_SESSION_INVALID_OFFSET,
        CONCURRENT_SESSION_INVALID_DATA_SIZE,
        PAYLOAD_TOO_LARGE,
        OTHER
    }

    private G0() {
    }

    public static G0 c(H0 h0) {
        if (h0 != null) {
            return new G0().g(c.INCORRECT_OFFSET, h0);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private G0 f(c cVar) {
        G0 g0 = new G0();
        g0.a = cVar;
        return g0;
    }

    private G0 g(c cVar, H0 h0) {
        G0 g0 = new G0();
        g0.a = cVar;
        g0.b = h0;
        return g0;
    }

    public H0 b() {
        if (this.a == c.INCORRECT_OFFSET) {
            return this.b;
        }
        throw new IllegalStateException("Invalid tag: required Tag.INCORRECT_OFFSET, but was Tag." + this.a.name());
    }

    public boolean d() {
        return this.a == c.INCORRECT_OFFSET;
    }

    public c e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof G0)) {
            return false;
        }
        G0 g0 = (G0) obj;
        c cVar = this.a;
        if (cVar != g0.a) {
            return false;
        }
        switch (a.a[cVar.ordinal()]) {
            case 2:
                H0 h0 = this.b;
                H0 h02 = g0.b;
                if (h0 != h02 && !h0.equals(h02)) {
                    return false;
                }
                break;
            case 1:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
