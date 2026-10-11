package ax.G4;

import ax.G4.C0715l;
import ax.G4.D;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Date;

/* loaded from: classes.dex */
public class U extends O {

    static class a extends ax.v4.e<U> {
        public static final a b = new a();

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if ("photo".equals(r1) != false) goto L6;
         */
        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.G4.U s(ax.T4.j r6, boolean r7) throws java.io.IOException, ax.T4.i {
            /*
                r5 = this;
                r0 = 0
                if (r7 != 0) goto L12
                ax.v4.AbstractC3276c.h(r6)
                java.lang.String r1 = ax.v4.AbstractC3274a.q(r6)
                java.lang.String r2 = "photo"
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L13
            L12:
                r1 = r0
            L13:
                if (r1 != 0) goto L7d
                r1 = r0
                r2 = r1
            L17:
                ax.T4.m r3 = r6.j()
                ax.T4.m r4 = ax.T4.m.FIELD_NAME
                if (r3 != r4) goto L6b
                java.lang.String r3 = r6.g()
                r6.H()
                java.lang.String r4 = "dimensions"
                boolean r4 = r4.equals(r3)
                if (r4 == 0) goto L3b
                ax.G4.l$a r0 = ax.G4.C0715l.a.b
                ax.v4.e r0 = ax.v4.C3277d.e(r0)
                java.lang.Object r0 = r0.a(r6)
                ax.G4.l r0 = (ax.G4.C0715l) r0
                goto L17
            L3b:
                java.lang.String r4 = "location"
                boolean r4 = r4.equals(r3)
                if (r4 == 0) goto L50
                ax.G4.D$a r1 = ax.G4.D.a.b
                ax.v4.e r1 = ax.v4.C3277d.e(r1)
                java.lang.Object r1 = r1.a(r6)
                ax.G4.D r1 = (ax.G4.D) r1
                goto L17
            L50:
                java.lang.String r4 = "time_taken"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L67
                ax.v4.c r2 = ax.v4.C3277d.g()
                ax.v4.c r2 = ax.v4.C3277d.d(r2)
                java.lang.Object r2 = r2.a(r6)
                java.util.Date r2 = (java.util.Date) r2
                goto L17
            L67:
                ax.v4.AbstractC3276c.o(r6)
                goto L17
            L6b:
                ax.G4.U r3 = new ax.G4.U
                r3.<init>(r0, r1, r2)
                if (r7 != 0) goto L75
                ax.v4.AbstractC3276c.e(r6)
            L75:
                java.lang.String r6 = r3.a()
                ax.v4.C3275b.a(r3, r6)
                return r3
            L7d:
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
            throw new UnsupportedOperationException("Method not decompiled: ax.G4.U.a.s(ax.T4.j, boolean):ax.G4.U");
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(U u, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            r("photo", gVar);
            if (u.a != null) {
                gVar.o("dimensions");
                C3277d.e(C0715l.a.b).k(u.a, gVar);
            }
            if (u.b != null) {
                gVar.o("location");
                C3277d.e(D.a.b).k(u.b, gVar);
            }
            if (u.c != null) {
                gVar.o("time_taken");
                C3277d.d(C3277d.g()).k(u.c, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public U(C0715l c0715l, D d, Date date) {
        super(c0715l, d, date);
    }

    @Override // ax.G4.O
    public String a() {
        return a.b.j(this, true);
    }

    @Override // ax.G4.O
    public boolean equals(Object obj) {
        D d;
        D d2;
        Date date;
        Date date2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        U u = (U) obj;
        C0715l c0715l = this.a;
        C0715l c0715l2 = u.a;
        return (c0715l == c0715l2 || (c0715l != null && c0715l.equals(c0715l2))) && ((d = this.b) == (d2 = u.b) || (d != null && d.equals(d2))) && ((date = this.c) == (date2 = u.c) || (date != null && date.equals(date2)));
    }

    @Override // ax.G4.O
    public int hashCode() {
        return getClass().toString().hashCode();
    }

    @Override // ax.G4.O
    public String toString() {
        return a.b.j(this, false);
    }

    public U() {
        this(null, null, null);
    }
}
