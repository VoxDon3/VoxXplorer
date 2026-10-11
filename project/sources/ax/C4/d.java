package ax.C4;

import ax.T4.f;
import ax.T4.g;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class d extends c {
    protected final String c;

    static class a extends ax.v4.e<d> {
        public static final a b = new a();

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if ("team".equals(r1) != false) goto L6;
         */
        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.C4.d s(ax.T4.j r6, boolean r7) throws java.io.IOException, ax.T4.i {
            /*
                r5 = this;
                r0 = 0
                if (r7 != 0) goto L12
                ax.v4.AbstractC3276c.h(r6)
                java.lang.String r1 = ax.v4.AbstractC3274a.q(r6)
                java.lang.String r2 = "team"
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L13
            L12:
                r1 = r0
            L13:
                if (r1 != 0) goto L93
                r1 = r0
                r2 = r1
            L17:
                ax.T4.m r3 = r6.j()
                ax.T4.m r4 = ax.T4.m.FIELD_NAME
                if (r3 != r4) goto L63
                java.lang.String r3 = r6.g()
                r6.H()
                java.lang.String r4 = "root_namespace_id"
                boolean r4 = r4.equals(r3)
                if (r4 == 0) goto L39
                ax.v4.c r0 = ax.v4.C3277d.f()
                java.lang.Object r0 = r0.a(r6)
                java.lang.String r0 = (java.lang.String) r0
                goto L17
            L39:
                java.lang.String r4 = "home_namespace_id"
                boolean r4 = r4.equals(r3)
                if (r4 == 0) goto L4c
                ax.v4.c r1 = ax.v4.C3277d.f()
                java.lang.Object r1 = r1.a(r6)
                java.lang.String r1 = (java.lang.String) r1
                goto L17
            L4c:
                java.lang.String r4 = "home_path"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L5f
                ax.v4.c r2 = ax.v4.C3277d.f()
                java.lang.Object r2 = r2.a(r6)
                java.lang.String r2 = (java.lang.String) r2
                goto L17
            L5f:
                ax.v4.AbstractC3276c.o(r6)
                goto L17
            L63:
                if (r0 == 0) goto L8b
                if (r1 == 0) goto L83
                if (r2 == 0) goto L7b
                ax.C4.d r3 = new ax.C4.d
                r3.<init>(r0, r1, r2)
                if (r7 != 0) goto L73
                ax.v4.AbstractC3276c.e(r6)
            L73:
                java.lang.String r6 = r3.c()
                ax.v4.C3275b.a(r3, r6)
                return r3
            L7b:
                ax.T4.i r7 = new ax.T4.i
                java.lang.String r0 = "Required field \"home_path\" missing."
                r7.<init>(r6, r0)
                throw r7
            L83:
                ax.T4.i r7 = new ax.T4.i
                java.lang.String r0 = "Required field \"home_namespace_id\" missing."
                r7.<init>(r6, r0)
                throw r7
            L8b:
                ax.T4.i r7 = new ax.T4.i
                java.lang.String r0 = "Required field \"root_namespace_id\" missing."
                r7.<init>(r6, r0)
                throw r7
            L93:
                ax.T4.i r7 = new ax.T4.i
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "No subtype found that matches tag: \""
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = "\""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r6, r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.C4.d.a.s(ax.T4.j, boolean):ax.C4.d");
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(d dVar, g gVar, boolean z) throws IOException, f {
            if (!z) {
                gVar.o0();
            }
            r("team", gVar);
            gVar.o("root_namespace_id");
            C3277d.f().k(dVar.a, gVar);
            gVar.o("home_namespace_id");
            C3277d.f().k(dVar.b, gVar);
            gVar.o("home_path");
            C3277d.f().k(dVar.c, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public d(String str, String str2, String str3) {
        super(str, str2);
        if (str3 == null) {
            throw new IllegalArgumentException("Required value for 'homePath' is null");
        }
        this.c = str3;
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
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        d dVar = (d) obj;
        String str5 = this.a;
        String str6 = dVar.a;
        return (str5 == str6 || str5.equals(str6)) && ((str = this.b) == (str2 = dVar.b) || str.equals(str2)) && ((str3 = this.c) == (str4 = dVar.c) || str3.equals(str4));
    }

    @Override // ax.C4.c
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.c});
    }

    @Override // ax.C4.c
    public String toString() {
        return a.b.j(this, false);
    }
}
