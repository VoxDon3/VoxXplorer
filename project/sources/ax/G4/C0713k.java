package ax.G4;

import ax.v4.C3277d;
import java.io.IOException;

/* renamed from: ax.G4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0713k extends P {

    /* renamed from: ax.G4.k$a */
    static class a extends ax.v4.e<C0713k> {
        public static final a b = new a();

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if ("deleted".equals(r1) != false) goto L6;
         */
        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.G4.C0713k s(ax.T4.j r9, boolean r10) throws java.io.IOException, ax.T4.i {
            /*
                r8 = this;
                r0 = 0
                if (r10 != 0) goto L12
                ax.v4.AbstractC3276c.h(r9)
                java.lang.String r1 = ax.v4.AbstractC3274a.q(r9)
                java.lang.String r2 = "deleted"
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L13
            L12:
                r1 = r0
            L13:
                if (r1 != 0) goto Lbf
                r3 = r0
                r4 = r3
                r5 = r4
                r6 = r5
                r7 = r6
            L1a:
                ax.T4.m r0 = r9.j()
                ax.T4.m r1 = ax.T4.m.FIELD_NAME
                if (r0 != r1) goto La3
                java.lang.String r0 = r9.g()
                r9.H()
                java.lang.String r1 = "name"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L3d
                ax.v4.c r0 = ax.v4.C3277d.f()
                java.lang.Object r0 = r0.a(r9)
                java.lang.String r0 = (java.lang.String) r0
                r3 = r0
                goto L1a
            L3d:
                java.lang.String r1 = "path_lower"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L55
                ax.v4.c r0 = ax.v4.C3277d.f()
                ax.v4.c r0 = ax.v4.C3277d.d(r0)
                java.lang.Object r0 = r0.a(r9)
                java.lang.String r0 = (java.lang.String) r0
                r4 = r0
                goto L1a
            L55:
                java.lang.String r1 = "path_display"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L6d
                ax.v4.c r0 = ax.v4.C3277d.f()
                ax.v4.c r0 = ax.v4.C3277d.d(r0)
                java.lang.Object r0 = r0.a(r9)
                java.lang.String r0 = (java.lang.String) r0
                r5 = r0
                goto L1a
            L6d:
                java.lang.String r1 = "parent_shared_folder_id"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L85
                ax.v4.c r0 = ax.v4.C3277d.f()
                ax.v4.c r0 = ax.v4.C3277d.d(r0)
                java.lang.Object r0 = r0.a(r9)
                java.lang.String r0 = (java.lang.String) r0
                r6 = r0
                goto L1a
            L85:
                java.lang.String r1 = "preview_url"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L9e
                ax.v4.c r0 = ax.v4.C3277d.f()
                ax.v4.c r0 = ax.v4.C3277d.d(r0)
                java.lang.Object r0 = r0.a(r9)
                java.lang.String r0 = (java.lang.String) r0
                r7 = r0
                goto L1a
            L9e:
                ax.v4.AbstractC3276c.o(r9)
                goto L1a
            La3:
                if (r3 == 0) goto Lb7
                ax.G4.k r2 = new ax.G4.k
                r2.<init>(r3, r4, r5, r6, r7)
                if (r10 != 0) goto Laf
                ax.v4.AbstractC3276c.e(r9)
            Laf:
                java.lang.String r9 = r2.d()
                ax.v4.C3275b.a(r2, r9)
                return r2
            Lb7:
                ax.T4.i r10 = new ax.T4.i
                java.lang.String r0 = "Required field \"name\" missing."
                r10.<init>(r9, r0)
                throw r10
            Lbf:
                ax.T4.i r10 = new ax.T4.i
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "No subtype found that matches tag: \""
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = "\""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r10.<init>(r9, r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.G4.C0713k.a.s(ax.T4.j, boolean):ax.G4.k");
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0713k c0713k, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            r("deleted", gVar);
            gVar.o("name");
            C3277d.f().k(c0713k.a, gVar);
            if (c0713k.b != null) {
                gVar.o("path_lower");
                C3277d.d(C3277d.f()).k(c0713k.b, gVar);
            }
            if (c0713k.c != null) {
                gVar.o("path_display");
                C3277d.d(C3277d.f()).k(c0713k.c, gVar);
            }
            if (c0713k.d != null) {
                gVar.o("parent_shared_folder_id");
                C3277d.d(C3277d.f()).k(c0713k.d, gVar);
            }
            if (c0713k.e != null) {
                gVar.o("preview_url");
                C3277d.d(C3277d.f()).k(c0713k.e, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0713k(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3, str4, str5);
    }

    @Override // ax.G4.P
    public String a() {
        return this.a;
    }

    @Override // ax.G4.P
    public String b() {
        return this.c;
    }

    @Override // ax.G4.P
    public String c() {
        return this.b;
    }

    @Override // ax.G4.P
    public String d() {
        return a.b.j(this, true);
    }

    @Override // ax.G4.P
    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        C0713k c0713k = (C0713k) obj;
        String str9 = this.a;
        String str10 = c0713k.a;
        return (str9 == str10 || str9.equals(str10)) && ((str = this.b) == (str2 = c0713k.b) || (str != null && str.equals(str2))) && (((str3 = this.c) == (str4 = c0713k.c) || (str3 != null && str3.equals(str4))) && (((str5 = this.d) == (str6 = c0713k.d) || (str5 != null && str5.equals(str6))) && ((str7 = this.e) == (str8 = c0713k.e) || (str7 != null && str7.equals(str8)))));
    }

    @Override // ax.G4.P
    public int hashCode() {
        return getClass().toString().hashCode();
    }

    @Override // ax.G4.P
    public String toString() {
        return a.b.j(this, false);
    }
}
