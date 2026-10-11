package ax.G4;

import ax.G4.H0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y0 {
    public static final y0 c = new y0().f(c.NOT_FOUND);
    public static final y0 d = new y0().f(c.CLOSED);
    public static final y0 e = new y0().f(c.NOT_CLOSED);
    public static final y0 f = new y0().f(c.TOO_LARGE);
    public static final y0 g = new y0().f(c.CONCURRENT_SESSION_INVALID_OFFSET);
    public static final y0 h = new y0().f(c.CONCURRENT_SESSION_INVALID_DATA_SIZE);
    public static final y0 i = new y0().f(c.PAYLOAD_TOO_LARGE);
    public static final y0 j = new y0().f(c.OTHER);
    public static final y0 k = new y0().f(c.CONTENT_HASH_MISMATCH);
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
            try {
                a[c.CONTENT_HASH_MISMATCH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static class b extends ax.v4.f<y0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public y0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            y0 y0Var;
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
            if ("not_found".equals(q)) {
                y0Var = y0.c;
            } else if ("incorrect_offset".equals(q)) {
                y0Var = y0.c(H0.a.b.s(jVar, true));
            } else if ("closed".equals(q)) {
                y0Var = y0.d;
            } else if ("not_closed".equals(q)) {
                y0Var = y0.e;
            } else if ("too_large".equals(q)) {
                y0Var = y0.f;
            } else if ("concurrent_session_invalid_offset".equals(q)) {
                y0Var = y0.g;
            } else if ("concurrent_session_invalid_data_size".equals(q)) {
                y0Var = y0.h;
            } else if ("payload_too_large".equals(q)) {
                y0Var = y0.i;
            } else if ("other".equals(q)) {
                y0Var = y0.j;
            } else {
                if (!"content_hash_mismatch".equals(q)) {
                    throw new ax.T4.i(jVar, "Unknown tag: " + q);
                }
                y0Var = y0.k;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return y0Var;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(y0 y0Var, ax.T4.g gVar) throws IOException, ax.T4.f {
            switch (a.a[y0Var.e().ordinal()]) {
                case 1:
                    gVar.s0("not_found");
                    return;
                case 2:
                    gVar.o0();
                    r("incorrect_offset", gVar);
                    H0.a.b.t(y0Var.b, gVar, true);
                    gVar.m();
                    return;
                case 3:
                    gVar.s0("closed");
                    return;
                case 4:
                    gVar.s0("not_closed");
                    return;
                case 5:
                    gVar.s0("too_large");
                    return;
                case 6:
                    gVar.s0("concurrent_session_invalid_offset");
                    return;
                case 7:
                    gVar.s0("concurrent_session_invalid_data_size");
                    return;
                case 8:
                    gVar.s0("payload_too_large");
                    return;
                case 9:
                    gVar.s0("other");
                    return;
                case 10:
                    gVar.s0("content_hash_mismatch");
                    return;
                default:
                    throw new IllegalArgumentException("Unrecognized tag: " + y0Var.e());
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
        OTHER,
        CONTENT_HASH_MISMATCH
    }

    private y0() {
    }

    public static y0 c(H0 h0) {
        if (h0 != null) {
            return new y0().g(c.INCORRECT_OFFSET, h0);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private y0 f(c cVar) {
        y0 y0Var = new y0();
        y0Var.a = cVar;
        return y0Var;
    }

    private y0 g(c cVar, H0 h0) {
        y0 y0Var = new y0();
        y0Var.a = cVar;
        y0Var.b = h0;
        return y0Var;
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
        if (obj == null || !(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        c cVar = this.a;
        if (cVar != y0Var.a) {
            return false;
        }
        switch (a.a[cVar.ordinal()]) {
            case 2:
                H0 h0 = this.b;
                H0 h02 = y0Var.b;
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
            case 10:
                return true;
            default:
                return false;
        }
    }

    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
