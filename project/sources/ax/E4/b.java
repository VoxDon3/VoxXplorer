package ax.E4;

import ax.E4.c;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {
    public static final b d = new b().f(c.RESTRICTED_CONTENT);
    public static final b e = new b().f(c.OTHER);
    public static final b f = new b().f(c.UNSUPPORTED_FOLDER);
    public static final b g = new b().f(c.PROPERTY_FIELD_TOO_LARGE);
    public static final b h = new b().f(c.DOES_NOT_FIT_TEMPLATE);
    public static final b i = new b().f(c.DUPLICATE_PROPERTY_GROUPS);
    private c a;
    private String b;
    private ax.E4.c c;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.TEMPLATE_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.RESTRICTED_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.PATH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.UNSUPPORTED_FOLDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.PROPERTY_FIELD_TOO_LARGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.DOES_NOT_FIT_TEMPLATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.DUPLICATE_PROPERTY_GROUPS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: ax.E4.b$b, reason: collision with other inner class name */
    public static class C0073b extends ax.v4.f<b> {
        public static final C0073b b = new C0073b();

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
            if ("template_not_found".equals(q)) {
                AbstractC3276c.f("template_not_found", jVar);
                bVar = b.e(C3277d.f().a(jVar));
            } else if ("restricted_content".equals(q)) {
                bVar = b.d;
            } else if ("other".equals(q)) {
                bVar = b.e;
            } else if ("path".equals(q)) {
                AbstractC3276c.f("path", jVar);
                bVar = b.c(c.b.b.a(jVar));
            } else if ("unsupported_folder".equals(q)) {
                bVar = b.f;
            } else if ("property_field_too_large".equals(q)) {
                bVar = b.g;
            } else if ("does_not_fit_template".equals(q)) {
                bVar = b.h;
            } else {
                if (!"duplicate_property_groups".equals(q)) {
                    throw new i(jVar, "Unknown tag: " + q);
                }
                bVar = b.i;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return bVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(b bVar, ax.T4.g gVar) throws IOException, ax.T4.f {
            switch (a.a[bVar.d().ordinal()]) {
                case 1:
                    gVar.o0();
                    r("template_not_found", gVar);
                    gVar.o("template_not_found");
                    C3277d.f().k(bVar.b, gVar);
                    gVar.m();
                    return;
                case 2:
                    gVar.s0("restricted_content");
                    return;
                case 3:
                    gVar.s0("other");
                    return;
                case 4:
                    gVar.o0();
                    r("path", gVar);
                    gVar.o("path");
                    c.b.b.k(bVar.c, gVar);
                    gVar.m();
                    return;
                case 5:
                    gVar.s0("unsupported_folder");
                    return;
                case 6:
                    gVar.s0("property_field_too_large");
                    return;
                case 7:
                    gVar.s0("does_not_fit_template");
                    return;
                case 8:
                    gVar.s0("duplicate_property_groups");
                    return;
                default:
                    throw new IllegalArgumentException("Unrecognized tag: " + bVar.d());
            }
        }
    }

    public enum c {
        TEMPLATE_NOT_FOUND,
        RESTRICTED_CONTENT,
        OTHER,
        PATH,
        UNSUPPORTED_FOLDER,
        PROPERTY_FIELD_TOO_LARGE,
        DOES_NOT_FIT_TEMPLATE,
        DUPLICATE_PROPERTY_GROUPS
    }

    private b() {
    }

    public static b c(ax.E4.c cVar) {
        if (cVar != null) {
            return new b().g(c.PATH, cVar);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static b e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Value is null");
        }
        if (str.length() < 1) {
            throw new IllegalArgumentException("String is shorter than 1");
        }
        if (Pattern.matches("(/|ptid:).*", str)) {
            return new b().h(c.TEMPLATE_NOT_FOUND, str);
        }
        throw new IllegalArgumentException("String does not match pattern");
    }

    private b f(c cVar) {
        b bVar = new b();
        bVar.a = cVar;
        return bVar;
    }

    private b g(c cVar, ax.E4.c cVar2) {
        b bVar = new b();
        bVar.a = cVar;
        bVar.c = cVar2;
        return bVar;
    }

    private b h(c cVar, String str) {
        b bVar = new b();
        bVar.a = cVar;
        bVar.b = str;
        return bVar;
    }

    public c d() {
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
        switch (a.a[cVar.ordinal()]) {
            case 1:
                String str = this.b;
                String str2 = bVar.b;
                return str == str2 || str.equals(str2);
            case 4:
                ax.E4.c cVar2 = this.c;
                ax.E4.c cVar3 = bVar.c;
                if (cVar2 != cVar3 && !cVar2.equals(cVar3)) {
                    return false;
                }
                break;
            case 2:
            case 3:
                return true;
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return C0073b.b.j(this, false);
    }
}
