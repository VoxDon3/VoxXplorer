package ax.E;

import ax.E.i;
import ax.H.d;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {
    public static boolean r = false;
    public static boolean s = true;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = false;
    private static int w = 1000;
    public static long x;
    public static long y;
    private a d;
    ax.E.b[] g;
    final c n;
    private a q;
    public boolean a = false;
    int b = 0;
    private HashMap<String, i> c = null;
    private int e = 32;
    private int f = 32;
    public boolean h = false;
    public boolean i = false;
    private boolean[] j = new boolean[32];
    int k = 1;
    int l = 0;
    private int m = 32;
    private i[] o = new i[w];
    private int p = 0;

    interface a {
        void a(a aVar);

        void b(i iVar);

        i c(d dVar, boolean[] zArr);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    class b extends ax.E.b {
        public b(c cVar) {
            this.e = new j(this, cVar);
        }
    }

    public d() {
        this.g = null;
        this.g = new ax.E.b[32];
        C();
        c cVar = new c();
        this.n = cVar;
        this.d = new h(cVar);
        if (v) {
            this.q = new b(cVar);
        } else {
            this.q = new ax.E.b(cVar);
        }
    }

    private final int B(a aVar, boolean z) {
        for (int i = 0; i < this.k; i++) {
            this.j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 < this.k * 2) {
                if (aVar.getKey() != null) {
                    this.j[aVar.getKey().d0] = true;
                }
                i c = aVar.c(this, this.j);
                if (c != null) {
                    boolean[] zArr = this.j;
                    int i3 = c.d0;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                    }
                }
                if (c != null) {
                    float f = Float.MAX_VALUE;
                    int i4 = -1;
                    for (int i5 = 0; i5 < this.l; i5++) {
                        ax.E.b bVar = this.g[i5];
                        if (bVar.a.k0 != i.a.UNRESTRICTED && !bVar.f && bVar.t(c)) {
                            float c2 = bVar.e.c(c);
                            if (c2 < 0.0f) {
                                float f2 = (-bVar.b) / c2;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    if (i4 > -1) {
                        ax.E.b bVar2 = this.g[i4];
                        bVar2.a.e0 = -1;
                        bVar2.x(c);
                        i iVar = bVar2.a;
                        iVar.e0 = i4;
                        iVar.r(this, bVar2);
                    }
                } else {
                    z2 = true;
                }
            }
            return i2;
        }
        return i2;
    }

    private void C() {
        int i = 0;
        if (v) {
            while (i < this.l) {
                ax.E.b bVar = this.g[i];
                if (bVar != null) {
                    this.n.a.a(bVar);
                }
                this.g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.l) {
            ax.E.b bVar2 = this.g[i];
            if (bVar2 != null) {
                this.n.b.a(bVar2);
            }
            this.g[i] = null;
            i++;
        }
    }

    private i a(i.a aVar, String str) {
        i b2 = this.n.c.b();
        if (b2 == null) {
            b2 = new i(aVar, str);
            b2.q(aVar, str);
        } else {
            b2.n();
            b2.q(aVar, str);
        }
        int i = this.p;
        int i2 = w;
        if (i >= i2) {
            int i3 = i2 * 2;
            w = i3;
            this.o = (i[]) Arrays.copyOf(this.o, i3);
        }
        i[] iVarArr = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        iVarArr[i4] = b2;
        return b2;
    }

    private final void l(ax.E.b bVar) {
        int i;
        if (t && bVar.f) {
            bVar.a.p(this, bVar.b);
        } else {
            ax.E.b[] bVarArr = this.g;
            int i2 = this.l;
            bVarArr[i2] = bVar;
            i iVar = bVar.a;
            iVar.e0 = i2;
            this.l = i2 + 1;
            iVar.r(this, bVar);
        }
        if (t && this.a) {
            int i3 = 0;
            while (i3 < this.l) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                ax.E.b bVar2 = this.g[i3];
                if (bVar2 != null && bVar2.f) {
                    bVar2.a.p(this, bVar2.b);
                    if (v) {
                        this.n.a.a(bVar2);
                    } else {
                        this.n.b.a(bVar2);
                    }
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.l;
                        if (i4 >= i) {
                            break;
                        }
                        ax.E.b[] bVarArr2 = this.g;
                        int i6 = i4 - 1;
                        ax.E.b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        i iVar2 = bVar3.a;
                        if (iVar2.e0 == i4) {
                            iVar2.e0 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    private void n() {
        for (int i = 0; i < this.l; i++) {
            ax.E.b bVar = this.g[i];
            bVar.a.g0 = bVar.b;
        }
    }

    public static ax.E.b s(d dVar, i iVar, i iVar2, float f) {
        return dVar.r().j(iVar, iVar2, f);
    }

    private int u(a aVar) throws Exception {
        for (int i = 0; i < this.l; i++) {
            ax.E.b bVar = this.g[i];
            if (bVar.a.k0 != i.a.UNRESTRICTED) {
                float f = 0.0f;
                if (bVar.b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (true) {
                            if (i3 >= this.l) {
                                break;
                            }
                            ax.E.b bVar2 = this.g[i3];
                            if (bVar2.a.k0 != i.a.UNRESTRICTED && !bVar2.f && bVar2.b < f) {
                                if (u) {
                                    int b2 = bVar2.e.b();
                                    int i7 = 0;
                                    while (i7 < b2) {
                                        i d = bVar2.e.d(i7);
                                        float c = bVar2.e.c(d);
                                        if (c > f) {
                                            for (int i8 = 0; i8 < 9; i8++) {
                                                float f3 = d.i0[i8] / c;
                                                if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                    i6 = i8;
                                                    i5 = d.d0;
                                                    i4 = i3;
                                                    f2 = f3;
                                                }
                                            }
                                        }
                                        i7++;
                                        f = 0.0f;
                                    }
                                } else {
                                    for (int i9 = 1; i9 < this.k; i9++) {
                                        i iVar = this.n.d[i9];
                                        float c2 = bVar2.e.c(iVar);
                                        if (c2 > 0.0f) {
                                            for (int i10 = 0; i10 < 9; i10++) {
                                                float f4 = iVar.i0[i10] / c2;
                                                if ((f4 < f2 && i10 == i6) || i10 > i6) {
                                                    i6 = i10;
                                                    i4 = i3;
                                                    i5 = i9;
                                                    f2 = f4;
                                                }
                                            }
                                        }
                                    }
                                    i3++;
                                    f = 0.0f;
                                }
                            }
                            i3++;
                            f = 0.0f;
                        }
                        if (i4 != -1) {
                            ax.E.b bVar3 = this.g[i4];
                            bVar3.a.e0 = -1;
                            bVar3.x(this.n.d[i5]);
                            i iVar2 = bVar3.a;
                            iVar2.e0 = i4;
                            iVar2.r(this, bVar3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.k / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                    return i2;
                }
            }
        }
        return 0;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i = this.e * 2;
        this.e = i;
        this.g = (ax.E.b[]) Arrays.copyOf(this.g, i);
        c cVar = this.n;
        cVar.d = (i[]) Arrays.copyOf(cVar.d, this.e);
        int i2 = this.e;
        this.j = new boolean[i2];
        this.f = i2;
        this.m = i2;
    }

    void A(a aVar) throws Exception {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i = 0;
        while (true) {
            cVar = this.n;
            i[] iVarArr = cVar.d;
            if (i >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.n();
            }
            i++;
        }
        cVar.c.c(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.d, (Object) null);
        HashMap<String, i> hashMap = this.c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.b = 0;
        this.d.clear();
        this.k = 1;
        for (int i2 = 0; i2 < this.l; i2++) {
            ax.E.b bVar = this.g[i2];
            if (bVar != null) {
                bVar.c = false;
            }
        }
        C();
        this.l = 0;
        if (v) {
            this.q = new b(this.n);
        } else {
            this.q = new ax.E.b(this.n);
        }
    }

    public void b(ax.H.e eVar, ax.H.e eVar2, float f, int i) {
        d.b bVar = d.b.LEFT;
        i q = q(eVar.o(bVar));
        d.b bVar2 = d.b.TOP;
        i q2 = q(eVar.o(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q3 = q(eVar.o(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q4 = q(eVar.o(bVar4));
        i q5 = q(eVar2.o(bVar));
        i q6 = q(eVar2.o(bVar2));
        i q7 = q(eVar2.o(bVar3));
        i q8 = q(eVar2.o(bVar4));
        ax.E.b r2 = r();
        double d = f;
        double d2 = i;
        r2.q(q2, q4, q6, q8, (float) (Math.sin(d) * d2));
        d(r2);
        ax.E.b r3 = r();
        r3.q(q, q3, q5, q7, (float) (Math.cos(d) * d2));
        d(r3);
    }

    public void c(i iVar, i iVar2, int i, float f, i iVar3, i iVar4, int i2, int i3) {
        ax.E.b r2 = r();
        r2.h(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i3 != 8) {
            r2.d(this, i3);
        }
        d(r2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(ax.E.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            goto L8a
        L4:
            int r0 = r5.l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.m
            if (r0 >= r2) goto L13
            int r0 = r5.k
            int r0 = r0 + r1
            int r2 = r5.f
            if (r0 < r2) goto L16
        L13:
            r5.y()
        L16:
            boolean r0 = r6.f
            r2 = 0
            if (r0 != 0) goto L85
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L25
            goto L8a
        L25:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L7c
            ax.E.i r0 = r5.p()
            r6.a = r0
            int r3 = r5.l
            r5.l(r6)
            int r4 = r5.l
            int r3 = r3 + r1
            if (r4 != r3) goto L7c
            ax.E.d$a r2 = r5.q
            r2.a(r6)
            ax.E.d$a r2 = r5.q
            r5.B(r2, r1)
            int r2 = r0.e0
            r3 = -1
            if (r2 != r3) goto L7d
            ax.E.i r2 = r6.a
            if (r2 != r0) goto L5a
            ax.E.i r0 = r6.v(r0)
            if (r0 == 0) goto L5a
            r6.x(r0)
        L5a:
            boolean r0 = r6.f
            if (r0 != 0) goto L63
            ax.E.i r0 = r6.a
            r0.r(r5, r6)
        L63:
            boolean r0 = ax.E.d.v
            if (r0 == 0) goto L6f
            ax.E.c r0 = r5.n
            ax.E.f<ax.E.b> r0 = r0.a
            r0.a(r6)
            goto L76
        L6f:
            ax.E.c r0 = r5.n
            ax.E.f<ax.E.b> r0 = r0.b
            r0.a(r6)
        L76:
            int r0 = r5.l
            int r0 = r0 - r1
            r5.l = r0
            goto L7d
        L7c:
            r1 = 0
        L7d:
            boolean r0 = r6.s()
            if (r0 != 0) goto L84
            goto L8a
        L84:
            r2 = r1
        L85:
            if (r2 != 0) goto L8a
            r5.l(r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.E.d.d(ax.E.b):void");
    }

    public ax.E.b e(i iVar, i iVar2, int i, int i2) {
        if (s && i2 == 8 && iVar2.h0 && iVar.e0 == -1) {
            iVar.p(this, iVar2.g0 + i);
            return null;
        }
        ax.E.b r2 = r();
        r2.n(iVar, iVar2, i);
        if (i2 != 8) {
            r2.d(this, i2);
        }
        d(r2);
        return r2;
    }

    public void f(i iVar, int i) {
        if (s && iVar.e0 == -1) {
            float f = i;
            iVar.p(this, f);
            for (int i2 = 0; i2 < this.b + 1; i2++) {
                i iVar2 = this.n.d[i2];
                if (iVar2 != null && iVar2.o0 && iVar2.p0 == iVar.d0) {
                    iVar2.p(this, iVar2.q0 + f);
                }
            }
            return;
        }
        int i3 = iVar.e0;
        if (i3 == -1) {
            ax.E.b r2 = r();
            r2.i(iVar, i);
            d(r2);
            return;
        }
        ax.E.b bVar = this.g[i3];
        if (bVar.f) {
            bVar.b = i;
            return;
        }
        if (bVar.e.b() == 0) {
            bVar.f = true;
            bVar.b = i;
        } else {
            ax.E.b r3 = r();
            r3.m(iVar, i);
            d(r3);
        }
    }

    public void g(i iVar, i iVar2, int i, boolean z) {
        ax.E.b r2 = r();
        i t2 = t();
        t2.f0 = 0;
        r2.o(iVar, iVar2, t2, i);
        d(r2);
    }

    public void h(i iVar, i iVar2, int i, int i2) {
        ax.E.b r2 = r();
        i t2 = t();
        t2.f0 = 0;
        r2.o(iVar, iVar2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.e.c(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void i(i iVar, i iVar2, int i, boolean z) {
        ax.E.b r2 = r();
        i t2 = t();
        t2.f0 = 0;
        r2.p(iVar, iVar2, t2, i);
        d(r2);
    }

    public void j(i iVar, i iVar2, int i, int i2) {
        ax.E.b r2 = r();
        i t2 = t();
        t2.f0 = 0;
        r2.p(iVar, iVar2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.e.c(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f, int i) {
        ax.E.b r2 = r();
        r2.k(iVar, iVar2, iVar3, iVar4, f);
        if (i != 8) {
            r2.d(this, i);
        }
        d(r2);
    }

    void m(ax.E.b bVar, int i, int i2) {
        bVar.e(o(i2, null), i);
    }

    public i o(int i, String str) {
        if (this.k + 1 >= this.f) {
            y();
        }
        i a2 = a(i.a.ERROR, str);
        int i2 = this.b + 1;
        this.b = i2;
        this.k++;
        a2.d0 = i2;
        a2.f0 = i;
        this.n.d[i2] = a2;
        this.d.b(a2);
        return a2;
    }

    public i p() {
        if (this.k + 1 >= this.f) {
            y();
        }
        i a2 = a(i.a.SLACK, null);
        int i = this.b + 1;
        this.b = i;
        this.k++;
        a2.d0 = i;
        this.n.d[i] = a2;
        return a2;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.k + 1 >= this.f) {
            y();
        }
        if (obj instanceof ax.H.d) {
            ax.H.d dVar = (ax.H.d) obj;
            iVar = dVar.i();
            if (iVar == null) {
                dVar.s(this.n);
                iVar = dVar.i();
            }
            int i = iVar.d0;
            if (i != -1 && i <= this.b && this.n.d[i] != null) {
                return iVar;
            }
            if (i != -1) {
                iVar.n();
            }
            int i2 = this.b + 1;
            this.b = i2;
            this.k++;
            iVar.d0 = i2;
            iVar.k0 = i.a.UNRESTRICTED;
            this.n.d[i2] = iVar;
        }
        return iVar;
    }

    public ax.E.b r() {
        ax.E.b b2;
        if (v) {
            b2 = this.n.a.b();
            if (b2 == null) {
                b2 = new b(this.n);
                y++;
            } else {
                b2.y();
            }
        } else {
            b2 = this.n.b.b();
            if (b2 == null) {
                b2 = new ax.E.b(this.n);
                x++;
            } else {
                b2.y();
            }
        }
        i.j();
        return b2;
    }

    public i t() {
        if (this.k + 1 >= this.f) {
            y();
        }
        i a2 = a(i.a.SLACK, null);
        int i = this.b + 1;
        this.b = i;
        this.k++;
        a2.d0 = i;
        this.n.d[i] = a2;
        return a2;
    }

    public c v() {
        return this.n;
    }

    public int x(Object obj) {
        i i = ((ax.H.d) obj).i();
        if (i != null) {
            return (int) (i.g0 + 0.5f);
        }
        return 0;
    }

    public void z() throws Exception {
        if (this.d.isEmpty()) {
            n();
            return;
        }
        if (!this.h && !this.i) {
            A(this.d);
            return;
        }
        for (int i = 0; i < this.l; i++) {
            if (!this.g[i].f) {
                A(this.d);
                return;
            }
        }
        n();
    }
}
