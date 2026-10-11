package ax.G4;

import ax.G4.C0715l;
import ax.G4.D;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes.dex */
public class Q0 extends O {
    protected final Long d;

    static class a extends ax.v4.e<Q0> {
        public static final a b = new a();

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if ("video".equals(r1) != false) goto L6;
         */
        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.G4.Q0 s(ax.T4.j r7, boolean r8) throws java.io.IOException, ax.T4.i {
            /*
                r6 = this;
                r0 = 0
                if (r8 != 0) goto L12
                ax.v4.AbstractC3276c.h(r7)
                java.lang.String r1 = ax.v4.AbstractC3274a.q(r7)
                java.lang.String r2 = "video"
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L13
            L12:
                r1 = r0
            L13:
                if (r1 != 0) goto L95
                r1 = r0
                r2 = r1
                r3 = r2
            L18:
                ax.T4.m r4 = r7.j()
                ax.T4.m r5 = ax.T4.m.FIELD_NAME
                if (r4 != r5) goto L83
                java.lang.String r4 = r7.g()
                r7.H()
                java.lang.String r5 = "dimensions"
                boolean r5 = r5.equals(r4)
                if (r5 == 0) goto L3c
                ax.G4.l$a r0 = ax.G4.C0715l.a.b
                ax.v4.e r0 = ax.v4.C3277d.e(r0)
                java.lang.Object r0 = r0.a(r7)
                ax.G4.l r0 = (ax.G4.C0715l) r0
                goto L18
            L3c:
                java.lang.String r5 = "location"
                boolean r5 = r5.equals(r4)
                if (r5 == 0) goto L51
                ax.G4.D$a r1 = ax.G4.D.a.b
                ax.v4.e r1 = ax.v4.C3277d.e(r1)
                java.lang.Object r1 = r1.a(r7)
                ax.G4.D r1 = (ax.G4.D) r1
                goto L18
            L51:
                java.lang.String r5 = "time_taken"
                boolean r5 = r5.equals(r4)
                if (r5 == 0) goto L68
                ax.v4.c r2 = ax.v4.C3277d.g()
                ax.v4.c r2 = ax.v4.C3277d.d(r2)
                java.lang.Object r2 = r2.a(r7)
                java.util.Date r2 = (java.util.Date) r2
                goto L18
            L68:
                java.lang.String r5 = "duration"
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto L7f
                ax.v4.c r3 = ax.v4.C3277d.i()
                ax.v4.c r3 = ax.v4.C3277d.d(r3)
                java.lang.Object r3 = r3.a(r7)
                java.lang.Long r3 = (java.lang.Long) r3
                goto L18
            L7f:
                ax.v4.AbstractC3276c.o(r7)
                goto L18
            L83:
                ax.G4.Q0 r4 = new ax.G4.Q0
                r4.<init>(r0, r1, r2, r3)
                if (r8 != 0) goto L8d
                ax.v4.AbstractC3276c.e(r7)
            L8d:
                java.lang.String r7 = r4.a()
                ax.v4.C3275b.a(r4, r7)
                return r4
            L95:
                ax.T4.i r8 = new ax.T4.i
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "No subtype found that matches tag: \""
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = "\""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r7, r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.G4.Q0.a.s(ax.T4.j, boolean):ax.G4.Q0");
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(Q0 q0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            r("video", gVar);
            if (q0.a != null) {
                gVar.o("dimensions");
                C3277d.e(C0715l.a.b).k(q0.a, gVar);
            }
            if (q0.b != null) {
                gVar.o("location");
                C3277d.e(D.a.b).k(q0.b, gVar);
            }
            if (q0.c != null) {
                gVar.o("time_taken");
                C3277d.d(C3277d.g()).k(q0.c, gVar);
            }
            if (q0.d != null) {
                gVar.o("duration");
                C3277d.d(C3277d.i()).k(q0.d, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public Q0(C0715l c0715l, D d, Date date, Long l) {
        super(c0715l, d, date);
        this.d = l;
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
        Long l;
        Long l2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        Q0 q0 = (Q0) obj;
        C0715l c0715l = this.a;
        C0715l c0715l2 = q0.a;
        return (c0715l == c0715l2 || (c0715l != null && c0715l.equals(c0715l2))) && ((d = this.b) == (d2 = q0.b) || (d != null && d.equals(d2))) && (((date = this.c) == (date2 = q0.c) || (date != null && date.equals(date2))) && ((l = this.d) == (l2 = q0.d) || (l != null && l.equals(l2))));
    }

    @Override // ax.G4.O
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.d});
    }

    @Override // ax.G4.O
    public String toString() {
        return a.b.j(this, false);
    }

    public Q0() {
        this(null, null, null, null);
    }
}
