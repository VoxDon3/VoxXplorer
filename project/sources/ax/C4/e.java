package ax.C4;

import ax.T4.f;
import ax.T4.g;
import ax.v4.C3277d;
import java.io.IOException;

/* loaded from: classes.dex */
public class e extends c {

    static class a extends ax.v4.e<e> {
        public static final a b = new a();

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if ("user".equals(r1) != false) goto L6;
         */
        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.C4.e s(ax.T4.j r5, boolean r6) throws java.io.IOException, ax.T4.i {
            /*
                r4 = this;
                r0 = 0
                if (r6 != 0) goto L12
                ax.v4.AbstractC3276c.h(r5)
                java.lang.String r1 = ax.v4.AbstractC3274a.q(r5)
                java.lang.String r2 = "user"
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L13
            L12:
                r1 = r0
            L13:
                if (r1 != 0) goto L75
                r1 = r0
            L16:
                ax.T4.m r2 = r5.j()
                ax.T4.m r3 = ax.T4.m.FIELD_NAME
                if (r2 != r3) goto L4f
                java.lang.String r2 = r5.g()
                r5.H()
                java.lang.String r3 = "root_namespace_id"
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L38
                ax.v4.c r0 = ax.v4.C3277d.f()
                java.lang.Object r0 = r0.a(r5)
                java.lang.String r0 = (java.lang.String) r0
                goto L16
            L38:
                java.lang.String r3 = "home_namespace_id"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L4b
                ax.v4.c r1 = ax.v4.C3277d.f()
                java.lang.Object r1 = r1.a(r5)
                java.lang.String r1 = (java.lang.String) r1
                goto L16
            L4b:
                ax.v4.AbstractC3276c.o(r5)
                goto L16
            L4f:
                if (r0 == 0) goto L6d
                if (r1 == 0) goto L65
                ax.C4.e r2 = new ax.C4.e
                r2.<init>(r0, r1)
                if (r6 != 0) goto L5d
                ax.v4.AbstractC3276c.e(r5)
            L5d:
                java.lang.String r5 = r2.c()
                ax.v4.C3275b.a(r2, r5)
                return r2
            L65:
                ax.T4.i r6 = new ax.T4.i
                java.lang.String r0 = "Required field \"home_namespace_id\" missing."
                r6.<init>(r5, r0)
                throw r6
            L6d:
                ax.T4.i r6 = new ax.T4.i
                java.lang.String r0 = "Required field \"root_namespace_id\" missing."
                r6.<init>(r5, r0)
                throw r6
            L75:
                ax.T4.i r6 = new ax.T4.i
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "No subtype found that matches tag: \""
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = "\""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r5, r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.C4.e.a.s(ax.T4.j, boolean):ax.C4.e");
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(e eVar, g gVar, boolean z) throws IOException, f {
            if (!z) {
                gVar.o0();
            }
            r("user", gVar);
            gVar.o("root_namespace_id");
            C3277d.f().k(eVar.a, gVar);
            gVar.o("home_namespace_id");
            C3277d.f().k(eVar.b, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public e(String str, String str2) {
        super(str, str2);
    }

    @Override // ax.C4.c
    public String a() {
        return this.b;
    }

    @Override // ax.C4.c
    public String b() {
        return this.a;
    }

    @Override // ax.C4.c
    public String c() {
        return a.b.j(this, true);
    }

    @Override // ax.C4.c
    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        e eVar = (e) obj;
        String str3 = this.a;
        String str4 = eVar.a;
        return (str3 == str4 || str3.equals(str4)) && ((str = this.b) == (str2 = eVar.b) || str.equals(str2));
    }

    @Override // ax.C4.c
    public int hashCode() {
        return getClass().toString().hashCode();
    }

    @Override // ax.C4.c
    public String toString() {
        return a.b.j(this, false);
    }
}
