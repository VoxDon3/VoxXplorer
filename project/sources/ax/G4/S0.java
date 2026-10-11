package ax.G4;

import ax.G4.R0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class S0 {
    public static final S0 d = new S0().j(c.NO_WRITE_PERMISSION);
    public static final S0 e = new S0().j(c.INSUFFICIENT_SPACE);
    public static final S0 f = new S0().j(c.DISALLOWED_NAME);
    public static final S0 g = new S0().j(c.TEAM_FOLDER);
    public static final S0 h = new S0().j(c.OPERATION_SUPPRESSED);
    public static final S0 i = new S0().j(c.TOO_MANY_WRITE_OPERATIONS);
    public static final S0 j = new S0().j(c.OTHER);
    private c a;
    private String b;
    private R0 c;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.MALFORMED_PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.NO_WRITE_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.INSUFFICIENT_SPACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.DISALLOWED_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.TEAM_FOLDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.OPERATION_SUPPRESSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.TOO_MANY_WRITE_OPERATIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.OTHER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static class b extends ax.v4.f<S0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public S0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            S0 s0;
            String str;
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
            if ("malformed_path".equals(q)) {
                if (jVar.j() != ax.T4.m.END_OBJECT) {
                    AbstractC3276c.f("malformed_path", jVar);
                    str = (String) C3277d.d(C3277d.f()).a(jVar);
                } else {
                    str = null;
                }
                s0 = str == null ? S0.g() : S0.h(str);
            } else if ("conflict".equals(q)) {
                AbstractC3276c.f("conflict", jVar);
                s0 = S0.c(R0.b.b.a(jVar));
            } else {
                s0 = "no_write_permission".equals(q) ? S0.d : "insufficient_space".equals(q) ? S0.e : "disallowed_name".equals(q) ? S0.f : "team_folder".equals(q) ? S0.g : "operation_suppressed".equals(q) ? S0.h : "too_many_write_operations".equals(q) ? S0.i : S0.j;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return s0;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(S0 s0, ax.T4.g gVar) throws IOException, ax.T4.f {
            switch (a.a[s0.i().ordinal()]) {
                case 1:
                    gVar.o0();
                    r("malformed_path", gVar);
                    gVar.o("malformed_path");
                    C3277d.d(C3277d.f()).k(s0.b, gVar);
                    gVar.m();
                    break;
                case 2:
                    gVar.o0();
                    r("conflict", gVar);
                    gVar.o("conflict");
                    R0.b.b.k(s0.c, gVar);
                    gVar.m();
                    break;
                case 3:
                    gVar.s0("no_write_permission");
                    break;
                case 4:
                    gVar.s0("insufficient_space");
                    break;
                case 5:
                    gVar.s0("disallowed_name");
                    break;
                case 6:
                    gVar.s0("team_folder");
                    break;
                case 7:
                    gVar.s0("operation_suppressed");
                    break;
                case 8:
                    gVar.s0("too_many_write_operations");
                    break;
                default:
                    gVar.s0("other");
                    break;
            }
        }
    }

    public enum c {
        MALFORMED_PATH,
        CONFLICT,
        NO_WRITE_PERMISSION,
        INSUFFICIENT_SPACE,
        DISALLOWED_NAME,
        TEAM_FOLDER,
        OPERATION_SUPPRESSED,
        TOO_MANY_WRITE_OPERATIONS,
        OTHER
    }

    private S0() {
    }

    public static S0 c(R0 r0) {
        if (r0 != null) {
            return new S0().k(c.CONFLICT, r0);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static S0 g() {
        return h(null);
    }

    public static S0 h(String str) {
        return new S0().l(c.MALFORMED_PATH, str);
    }

    private S0 j(c cVar) {
        S0 s0 = new S0();
        s0.a = cVar;
        return s0;
    }

    private S0 k(c cVar, R0 r0) {
        S0 s0 = new S0();
        s0.a = cVar;
        s0.c = r0;
        return s0;
    }

    private S0 l(c cVar, String str) {
        S0 s0 = new S0();
        s0.a = cVar;
        s0.b = str;
        return s0;
    }

    public boolean d() {
        return this.a == c.DISALLOWED_NAME;
    }

    public boolean e() {
        return this.a == c.INSUFFICIENT_SPACE;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof S0)) {
            return false;
        }
        S0 s0 = (S0) obj;
        c cVar = this.a;
        if (cVar != s0.a) {
            return false;
        }
        switch (a.a[cVar.ordinal()]) {
            case 1:
                String str = this.b;
                String str2 = s0.b;
                return str == str2 || (str != null && str.equals(str2));
            case 2:
                R0 r0 = this.c;
                R0 r02 = s0.c;
                return r0 == r02 || r0.equals(r02);
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

    public boolean f() {
        return this.a == c.NO_WRITE_PERMISSION;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public c i() {
        return this.a;
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
