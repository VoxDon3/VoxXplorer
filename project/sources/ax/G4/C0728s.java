package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import ax.w4.C3344d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/* renamed from: ax.G4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0728s {
    protected final Boolean a;
    protected final String b;
    protected final String c;
    protected final Date d;

    /* renamed from: ax.G4.s$a */
    static class a extends ax.v4.e<C0728s> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0728s s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            Date date = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("is_lockholder".equals(g)) {
                    bool = (Boolean) C3277d.d(C3277d.a()).a(jVar);
                } else if ("lockholder_name".equals(g)) {
                    str2 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else if ("lockholder_account_id".equals(g)) {
                    str3 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else if ("created".equals(g)) {
                    date = (Date) C3277d.d(C3277d.g()).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            C0728s c0728s = new C0728s(bool, str2, str3, date);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0728s, c0728s.a());
            return c0728s;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0728s c0728s, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            if (c0728s.a != null) {
                gVar.o("is_lockholder");
                C3277d.d(C3277d.a()).k(c0728s.a, gVar);
            }
            if (c0728s.b != null) {
                gVar.o("lockholder_name");
                C3277d.d(C3277d.f()).k(c0728s.b, gVar);
            }
            if (c0728s.c != null) {
                gVar.o("lockholder_account_id");
                C3277d.d(C3277d.f()).k(c0728s.c, gVar);
            }
            if (c0728s.d != null) {
                gVar.o("created");
                C3277d.d(C3277d.g()).k(c0728s.d, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0728s(Boolean bool, String str, String str2, Date date) {
        this.a = bool;
        this.b = str;
        if (str2 != null) {
            if (str2.length() < 40) {
                throw new IllegalArgumentException("String 'lockholderAccountId' is shorter than 40");
            }
            if (str2.length() > 40) {
                throw new IllegalArgumentException("String 'lockholderAccountId' is longer than 40");
            }
        }
        this.c = str2;
        this.d = C3344d.b(date);
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Date date;
        Date date2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        C0728s c0728s = (C0728s) obj;
        Boolean bool = this.a;
        Boolean bool2 = c0728s.a;
        return (bool == bool2 || (bool != null && bool.equals(bool2))) && ((str = this.b) == (str2 = c0728s.b) || (str != null && str.equals(str2))) && (((str3 = this.c) == (str4 = c0728s.c) || (str3 != null && str3.equals(str4))) && ((date = this.d) == (date2 = c0728s.d) || (date != null && date.equals(date2))));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public String toString() {
        return a.b.j(this, false);
    }

    public C0728s() {
        this(null, null, null, null);
    }
}
