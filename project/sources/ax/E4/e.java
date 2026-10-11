package ax.E4;

import ax.E4.d;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class e {
    protected final String a;
    protected final List<d> b;

    public static class a extends ax.v4.e<e> {
        public static final a b = new a();

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public e s(j jVar, boolean z) throws IOException, i {
            String str;
            String str2 = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            List list = null;
            while (jVar.j() == m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("template_id".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("fields".equals(g)) {
                    list = (List) C3277d.c(d.a.b).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new i(jVar, "Required field \"template_id\" missing.");
            }
            if (list == null) {
                throw new i(jVar, "Required field \"fields\" missing.");
            }
            e eVar = new e(str2, list);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(eVar, eVar.a());
            return eVar;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(e eVar, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("template_id");
            C3277d.f().k(eVar.a, gVar);
            gVar.o("fields");
            C3277d.c(d.a.b).k(eVar.b, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public e(String str, List<d> list) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'templateId' is null");
        }
        if (str.length() < 1) {
            throw new IllegalArgumentException("String 'templateId' is shorter than 1");
        }
        if (!Pattern.matches("(/|ptid:).*", str)) {
            throw new IllegalArgumentException("String 'templateId' does not match pattern");
        }
        this.a = str;
        if (list == null) {
            throw new IllegalArgumentException("Required value for 'fields' is null");
        }
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("An item in list 'fields' is null");
            }
        }
        this.b = list;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        List<d> list;
        List<d> list2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.a;
        String str2 = eVar.a;
        return (str == str2 || str.equals(str2)) && ((list = this.b) == (list2 = eVar.b) || list.equals(list2));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
