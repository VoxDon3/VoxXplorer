package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class M {
    public static final M c = new M().g(c.NOT_FOUND);
    public static final M d = new M().g(c.NOT_FILE);
    public static final M e = new M().g(c.NOT_FOLDER);
    public static final M f = new M().g(c.RESTRICTED_CONTENT);
    public static final M g = new M().g(c.UNSUPPORTED_CONTENT_TYPE);
    public static final M h = new M().g(c.LOCKED);
    public static final M i = new M().g(c.OTHER);
    private c a;
    private String b;

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
                a[c.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.NOT_FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.NOT_FOLDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.RESTRICTED_CONTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.UNSUPPORTED_CONTENT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.LOCKED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.OTHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static class b extends ax.v4.f<M> {
        public static final b b = new b();

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public M a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            M m;
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
                m = str == null ? M.d() : M.e(str);
            } else {
                m = "not_found".equals(q) ? M.c : "not_file".equals(q) ? M.d : "not_folder".equals(q) ? M.e : "restricted_content".equals(q) ? M.f : "unsupported_content_type".equals(q) ? M.g : "locked".equals(q) ? M.h : M.i;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return m;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(M m, ax.T4.g gVar) throws IOException, ax.T4.f {
            switch (a.a[m.f().ordinal()]) {
                case 1:
                    gVar.o0();
                    r("malformed_path", gVar);
                    gVar.o("malformed_path");
                    C3277d.d(C3277d.f()).k(m.b, gVar);
                    gVar.m();
                    break;
                case 2:
                    gVar.s0("not_found");
                    break;
                case 3:
                    gVar.s0("not_file");
                    break;
                case 4:
                    gVar.s0("not_folder");
                    break;
                case 5:
                    gVar.s0("restricted_content");
                    break;
                case 6:
                    gVar.s0("unsupported_content_type");
                    break;
                case 7:
                    gVar.s0("locked");
                    break;
                default:
                    gVar.s0("other");
                    break;
            }
        }
    }

    public enum c {
        MALFORMED_PATH,
        NOT_FOUND,
        NOT_FILE,
        NOT_FOLDER,
        RESTRICTED_CONTENT,
        UNSUPPORTED_CONTENT_TYPE,
        LOCKED,
        OTHER
    }

    private M() {
    }

    public static M d() {
        return e(null);
    }

    public static M e(String str) {
        return new M().h(c.MALFORMED_PATH, str);
    }

    private M g(c cVar) {
        M m = new M();
        m.a = cVar;
        return m;
    }

    private M h(c cVar, String str) {
        M m = new M();
        m.a = cVar;
        m.b = str;
        return m;
    }

    public boolean b() {
        return this.a == c.NOT_FOUND;
    }

    public boolean c() {
        return this.a == c.RESTRICTED_CONTENT;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof M)) {
            return false;
        }
        M m = (M) obj;
        c cVar = this.a;
        if (cVar != m.a) {
            return false;
        }
        switch (a.a[cVar.ordinal()]) {
            case 1:
                String str = this.b;
                String str2 = m.b;
                return str == str2 || (str != null && str.equals(str2));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public c f() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
