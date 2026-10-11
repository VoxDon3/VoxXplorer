package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: ax.G4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0717m {
    protected final String a;
    protected final String b;

    /* renamed from: ax.G4.m$a */
    static class a extends ax.v4.e<C0717m> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0717m s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            String str3 = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("path".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("rev".equals(g)) {
                    str3 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"path\" missing.");
            }
            C0717m c0717m = new C0717m(str2, str3);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0717m, c0717m.a());
            return c0717m;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0717m c0717m, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("path");
            C3277d.f().k(c0717m.a, gVar);
            if (c0717m.b != null) {
                gVar.o("rev");
                C3277d.d(C3277d.f()).k(c0717m.b, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0717m(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'path' is null");
        }
        if (!Pattern.matches("(/(.|[\\r\\n])*|id:.*)|(rev:[0-9a-f]{9,})|(ns:[0-9]+(/.*)?)", str)) {
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        this.a = str;
        if (str2 != null) {
            if (str2.length() < 9) {
                throw new IllegalArgumentException("String 'rev' is shorter than 9");
            }
            if (!Pattern.matches("[0-9a-f]+", str2)) {
                throw new IllegalArgumentException("String 'rev' does not match pattern");
            }
        }
        this.b = str2;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        C0717m c0717m = (C0717m) obj;
        String str3 = this.a;
        String str4 = c0717m.a;
        return (str3 == str4 || str3.equals(str4)) && ((str = this.b) == (str2 = c0717m.b) || (str != null && str.equals(str2)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
