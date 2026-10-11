package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: ax.G4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0695b {
    protected final String a;
    protected final boolean b;

    /* renamed from: ax.G4.b$a */
    static class a extends ax.v4.e<C0695b> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0695b s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            String str2 = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            Boolean bool = Boolean.FALSE;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("path".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("autorename".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"path\" missing.");
            }
            C0695b c0695b = new C0695b(str2, bool.booleanValue());
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0695b, c0695b.a());
            return c0695b;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0695b c0695b, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("path");
            C3277d.f().k(c0695b.a, gVar);
            gVar.o("autorename");
            C3277d.a().k(Boolean.valueOf(c0695b.b), gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0695b(String str, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'path' is null");
        }
        if (!Pattern.matches("(/(.|[\\r\\n])*)|(ns:[0-9]+(/.*)?)", str)) {
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        this.a = str;
        this.b = z;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        C0695b c0695b;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((str = this.a) == (str2 = (c0695b = (C0695b) obj).a) || str.equals(str2)) && this.b == c0695b.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
