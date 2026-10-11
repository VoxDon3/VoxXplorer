package ax.G4;

import ax.G4.C0715l;
import ax.G4.D;
import ax.G4.Q0;
import ax.G4.U;
import ax.v4.C3277d;
import ax.w4.C3344d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes.dex */
public class O {
    protected final C0715l a;
    protected final D b;
    protected final Date c;

    static class a extends ax.v4.e<O> {
        public static final a b = new a();

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if (okhttp3.HttpUrl.FRAGMENT_ENCODE_SET.equals(r2) != false) goto L6;
         */
        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.G4.O s(ax.T4.j r6, boolean r7) throws java.io.IOException, ax.T4.i {
            /*
                r5 = this;
                java.lang.String r0 = ""
                r1 = 0
                if (r7 != 0) goto L12
                ax.v4.AbstractC3276c.h(r6)
                java.lang.String r2 = ax.v4.AbstractC3274a.q(r6)
                boolean r3 = r0.equals(r2)
                if (r3 == 0) goto L13
            L12:
                r2 = r1
            L13:
                if (r2 != 0) goto L71
                r0 = r1
                r2 = r0
            L17:
                ax.T4.m r3 = r6.j()
                ax.T4.m r4 = ax.T4.m.FIELD_NAME
                if (r3 != r4) goto L6b
                java.lang.String r3 = r6.g()
                r6.H()
                java.lang.String r4 = "dimensions"
                boolean r4 = r4.equals(r3)
                if (r4 == 0) goto L3b
                ax.G4.l$a r1 = ax.G4.C0715l.a.b
                ax.v4.e r1 = ax.v4.C3277d.e(r1)
                java.lang.Object r1 = r1.a(r6)
                ax.G4.l r1 = (ax.G4.C0715l) r1
                goto L17
            L3b:
                java.lang.String r4 = "location"
                boolean r4 = r4.equals(r3)
                if (r4 == 0) goto L50
                ax.G4.D$a r0 = ax.G4.D.a.b
                ax.v4.e r0 = ax.v4.C3277d.e(r0)
                java.lang.Object r0 = r0.a(r6)
                ax.G4.D r0 = (ax.G4.D) r0
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
                ax.G4.O r3 = new ax.G4.O
                r3.<init>(r1, r0, r2)
                goto L9c
            L71:
                boolean r0 = r0.equals(r2)
                r1 = 1
                if (r0 == 0) goto L7f
                ax.G4.O$a r0 = ax.G4.O.a.b
                ax.G4.O r3 = r0.s(r6, r1)
                goto L9c
            L7f:
                java.lang.String r0 = "photo"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L8e
                ax.G4.U$a r0 = ax.G4.U.a.b
                ax.G4.U r3 = r0.s(r6, r1)
                goto L9c
            L8e:
                java.lang.String r0 = "video"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto La9
                ax.G4.Q0$a r0 = ax.G4.Q0.a.b
                ax.G4.Q0 r3 = r0.s(r6, r1)
            L9c:
                if (r7 != 0) goto La1
                ax.v4.AbstractC3276c.e(r6)
            La1:
                java.lang.String r6 = r3.a()
                ax.v4.C3275b.a(r3, r6)
                return r3
            La9:
                ax.T4.i r7 = new ax.T4.i
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "No subtype found that matches tag: \""
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = "\""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r6, r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.G4.O.a.s(ax.T4.j, boolean):ax.G4.O");
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(O o, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (o instanceof U) {
                U.a.b.t((U) o, gVar, z);
                return;
            }
            if (o instanceof Q0) {
                Q0.a.b.t((Q0) o, gVar, z);
                return;
            }
            if (!z) {
                gVar.o0();
            }
            if (o.a != null) {
                gVar.o("dimensions");
                C3277d.e(C0715l.a.b).k(o.a, gVar);
            }
            if (o.b != null) {
                gVar.o("location");
                C3277d.e(D.a.b).k(o.b, gVar);
            }
            if (o.c != null) {
                gVar.o("time_taken");
                C3277d.d(C3277d.g()).k(o.c, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public O(C0715l c0715l, D d, Date date) {
        this.a = c0715l;
        this.b = d;
        this.c = C3344d.b(date);
    }

    public String a() {
        return a.b.j(this, true);
    }

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
        O o = (O) obj;
        C0715l c0715l = this.a;
        C0715l c0715l2 = o.a;
        return (c0715l == c0715l2 || (c0715l != null && c0715l.equals(c0715l2))) && ((d = this.b) == (d2 = o.b) || (d != null && d.equals(d2))) && ((date = this.c) == (date2 = o.c) || (date != null && date.equals(date2)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return a.b.j(this, false);
    }

    public O() {
        this(null, null, null);
    }
}
