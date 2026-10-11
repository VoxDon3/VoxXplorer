package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: ax.G4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0736y extends C0716l0 {
    protected final String b;
    protected final String c;
    protected final boolean d;
    protected final boolean e;

    /* renamed from: ax.G4.y$a */
    static class a extends ax.v4.e<C0736y> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0736y s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            Boolean bool = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            Boolean bool2 = Boolean.FALSE;
            String str2 = null;
            String str3 = null;
            Boolean bool3 = bool2;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("read_only".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else if ("parent_shared_folder_id".equals(g)) {
                    str2 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else if ("shared_folder_id".equals(g)) {
                    str3 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else if ("traverse_only".equals(g)) {
                    bool2 = C3277d.a().a(jVar);
                } else if ("no_access".equals(g)) {
                    bool3 = C3277d.a().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (bool == null) {
                throw new ax.T4.i(jVar, "Required field \"read_only\" missing.");
            }
            C0736y c0736y = new C0736y(bool.booleanValue(), str2, str3, bool2.booleanValue(), bool3.booleanValue());
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0736y, c0736y.a());
            return c0736y;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0736y c0736y, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("read_only");
            C3277d.a().k(Boolean.valueOf(c0736y.a), gVar);
            if (c0736y.b != null) {
                gVar.o("parent_shared_folder_id");
                C3277d.d(C3277d.f()).k(c0736y.b, gVar);
            }
            if (c0736y.c != null) {
                gVar.o("shared_folder_id");
                C3277d.d(C3277d.f()).k(c0736y.c, gVar);
            }
            gVar.o("traverse_only");
            C3277d.a().k(Boolean.valueOf(c0736y.d), gVar);
            gVar.o("no_access");
            C3277d.a().k(Boolean.valueOf(c0736y.e), gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0736y(boolean z, String str, String str2, boolean z2, boolean z3) {
        super(z);
        if (str != null && !Pattern.matches("[-_0-9a-zA-Z:]+", str)) {
            throw new IllegalArgumentException("String 'parentSharedFolderId' does not match pattern");
        }
        this.b = str;
        if (str2 != null && !Pattern.matches("[-_0-9a-zA-Z:]+", str2)) {
            throw new IllegalArgumentException("String 'sharedFolderId' does not match pattern");
        }
        this.c = str2;
        this.d = z2;
        this.e = z3;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            C0736y c0736y = (C0736y) obj;
            if (this.a == c0736y.a && (((str = this.b) == (str2 = c0736y.b) || (str != null && str.equals(str2))) && (((str3 = this.c) == (str4 = c0736y.c) || (str3 != null && str3.equals(str4))) && this.d == c0736y.d && this.e == c0736y.e))) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.G4.C0716l0
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
