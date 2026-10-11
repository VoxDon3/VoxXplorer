package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: ax.G4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0733v extends C0716l0 {
    protected final String b;
    protected final String c;

    /* renamed from: ax.G4.v$a */
    static class a extends ax.v4.e<C0733v> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0733v s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            String str2 = null;
            String str3 = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("read_only".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else if ("parent_shared_folder_id".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("modified_by".equals(g)) {
                    str3 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (bool == null) {
                throw new ax.T4.i(jVar, "Required field \"read_only\" missing.");
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"parent_shared_folder_id\" missing.");
            }
            C0733v c0733v = new C0733v(bool.booleanValue(), str2, str3);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0733v, c0733v.a());
            return c0733v;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0733v c0733v, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("read_only");
            C3277d.a().k(Boolean.valueOf(c0733v.a), gVar);
            gVar.o("parent_shared_folder_id");
            C3277d.f().k(c0733v.b, gVar);
            if (c0733v.c != null) {
                gVar.o("modified_by");
                C3277d.d(C3277d.f()).k(c0733v.c, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0733v(boolean z, String str, String str2) {
        super(z);
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'parentSharedFolderId' is null");
        }
        if (!Pattern.matches("[-_0-9a-zA-Z:]+", str)) {
            throw new IllegalArgumentException("String 'parentSharedFolderId' does not match pattern");
        }
        this.b = str;
        if (str2 != null) {
            if (str2.length() < 40) {
                throw new IllegalArgumentException("String 'modifiedBy' is shorter than 40");
            }
            if (str2.length() > 40) {
                throw new IllegalArgumentException("String 'modifiedBy' is longer than 40");
            }
        }
        this.c = str2;
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
            C0733v c0733v = (C0733v) obj;
            if (this.a == c0733v.a && (((str = this.b) == (str2 = c0733v.b) || str.equals(str2)) && ((str3 = this.c) == (str4 = c0733v.c) || (str3 != null && str3.equals(str4))))) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.G4.C0716l0
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.b, this.c});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
