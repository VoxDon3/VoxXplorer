package ax.E4;

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
public final class f {
    public static final f c = new f().d(c.RESTRICTED_CONTENT);
    public static final f d = new f().d(c.OTHER);
    private c a;
    private String b;

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
        }
    }

    public static class b extends ax.v4.f<f> {
        public static final b b = new b();

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public f a(j jVar) throws IOException, i {
            String q;
            boolean z;
            f fVar;
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
                fVar = f.c(C3277d.f().a(jVar));
            } else {
                fVar = "restricted_content".equals(q) ? f.c : f.d;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return fVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(f fVar, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[fVar.b().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    gVar.s0("other");
                    return;
                } else {
                    gVar.s0("restricted_content");
                    return;
                }
            }
            gVar.o0();
            r("template_not_found", gVar);
            gVar.o("template_not_found");
            C3277d.f().k(fVar.b, gVar);
            gVar.m();
        }
    }

    public enum c {
        TEMPLATE_NOT_FOUND,
        RESTRICTED_CONTENT,
        OTHER
    }

    private f() {
    }

    public static f c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Value is null");
        }
        if (str.length() < 1) {
            throw new IllegalArgumentException("String is shorter than 1");
        }
        if (Pattern.matches("(/|ptid:).*", str)) {
            return new f().e(c.TEMPLATE_NOT_FOUND, str);
        }
        throw new IllegalArgumentException("String does not match pattern");
    }

    private f d(c cVar) {
        f fVar = new f();
        fVar.a = cVar;
        return fVar;
    }

    private f e(c cVar, String str) {
        f fVar = new f();
        fVar.a = cVar;
        fVar.b = str;
        return fVar;
    }

    public c b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        c cVar = this.a;
        if (cVar != fVar.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i != 1) {
            return i == 2 || i == 3;
        }
        String str = this.b;
        String str2 = fVar.b;
        return str == str2 || str.equals(str2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
