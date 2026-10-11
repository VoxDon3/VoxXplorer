package ax.E;

import ax.E.d;
import ax.E.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements d.a {
    public a e;
    i a = null;
    float b = 0.0f;
    boolean c = false;
    ArrayList<i> d = new ArrayList<>();
    boolean f = false;

    public interface a {
        void a(i iVar, float f, boolean z);

        int b();

        float c(i iVar);

        void clear();

        i d(int i);

        float e(b bVar, boolean z);

        void f();

        float g(int i);

        void h(i iVar, float f);

        boolean i(i iVar);

        float j(i iVar, boolean z);

        void k(float f);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.n0 <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int b = this.e.b();
        i iVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < b; i++) {
            float g = this.e.g(i);
            if (g < 0.0f) {
                i d = this.e.d(i);
                if ((zArr == null || !zArr[d.d0]) && d != iVar && (((aVar = d.k0) == i.a.SLACK || aVar == i.a.ERROR) && g < f)) {
                    f = g;
                    iVar2 = d;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z) {
        if (iVar == null || !iVar.h0) {
            return;
        }
        this.b += iVar.g0 * this.e.c(iVar);
        this.e.j(iVar, z);
        if (z) {
            iVar.l(this);
        }
        if (d.t && this.e.b() == 0) {
            this.f = true;
            dVar.a = true;
        }
    }

    public void B(d dVar, b bVar, boolean z) {
        this.b += bVar.b * this.e.e(bVar, z);
        if (z) {
            bVar.a.l(this);
        }
        if (d.t && this.a != null && this.e.b() == 0) {
            this.f = true;
            dVar.a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z) {
        if (iVar == null || !iVar.o0) {
            return;
        }
        float c = this.e.c(iVar);
        this.b += iVar.q0 * c;
        this.e.j(iVar, z);
        if (z) {
            iVar.l(this);
        }
        this.e.a(dVar.n.d[iVar.p0], c, z);
        if (d.t && this.e.b() == 0) {
            this.f = true;
            dVar.a = true;
        }
    }

    public void D(d dVar) {
        if (dVar.g.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int b = this.e.b();
            for (int i = 0; i < b; i++) {
                i d = this.e.d(i);
                if (d.e0 != -1 || d.h0 || d.o0) {
                    this.d.add(d);
                }
            }
            int size = this.d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = this.d.get(i2);
                    if (iVar.h0) {
                        A(dVar, iVar, true);
                    } else if (iVar.o0) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.g[iVar.e0], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
        if (d.t && this.a != null && this.e.b() == 0) {
            this.f = true;
            dVar.a = true;
        }
    }

    @Override // ax.E.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.a = null;
            this.e.clear();
            for (int i = 0; i < bVar.e.b(); i++) {
                this.e.a(bVar.e.d(i), bVar.e.g(i), true);
            }
        }
    }

    @Override // ax.E.d.a
    public void b(i iVar) {
        int i = iVar.f0;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.e.h(iVar, f);
    }

    @Override // ax.E.d.a
    public i c(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // ax.E.d.a
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public b d(d dVar, int i) {
        this.e.h(dVar.o(i, "ep"), 1.0f);
        this.e.h(dVar.o(i, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i) {
        this.e.h(iVar, i);
        return this;
    }

    boolean f(d dVar) {
        boolean z;
        i g = g(dVar);
        if (g == null) {
            z = true;
        } else {
            x(g);
            z = false;
        }
        if (this.e.b() == 0) {
            this.f = true;
        }
        return z;
    }

    i g(d dVar) {
        boolean u;
        boolean u2;
        int b = this.e.b();
        i iVar = null;
        i iVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < b; i++) {
            float g = this.e.g(i);
            i d = this.e.d(i);
            if (d.k0 == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    u2 = u(d, dVar);
                } else if (f > g) {
                    u2 = u(d, dVar);
                } else if (!z && u(d, dVar)) {
                    f = g;
                    iVar = d;
                    z = true;
                }
                z = u2;
                f = g;
                iVar = d;
            } else if (iVar == null && g < 0.0f) {
                if (iVar2 == null) {
                    u = u(d, dVar);
                } else if (f2 > g) {
                    u = u(d, dVar);
                } else if (!z2 && u(d, dVar)) {
                    f2 = g;
                    iVar2 = d;
                    z2 = true;
                }
                z2 = u;
                f2 = g;
                iVar2 = d;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // ax.E.d.a
    public i getKey() {
        return this.a;
    }

    b h(i iVar, i iVar2, int i, float f, i iVar3, i iVar4, int i2) {
        if (iVar2 == iVar3) {
            this.e.h(iVar, 1.0f);
            this.e.h(iVar4, 1.0f);
            this.e.h(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.h(iVar, 1.0f);
            this.e.h(iVar2, -1.0f);
            this.e.h(iVar3, -1.0f);
            this.e.h(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return this;
            }
        } else {
            if (f <= 0.0f) {
                this.e.h(iVar, -1.0f);
                this.e.h(iVar2, 1.0f);
                this.b = i;
                return this;
            }
            if (f >= 1.0f) {
                this.e.h(iVar4, -1.0f);
                this.e.h(iVar3, 1.0f);
                this.b = -i2;
                return this;
            }
            float f2 = 1.0f - f;
            this.e.h(iVar, f2 * 1.0f);
            this.e.h(iVar2, f2 * (-1.0f));
            this.e.h(iVar3, (-1.0f) * f);
            this.e.h(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * f2) + (i2 * f);
                return this;
            }
        }
        return this;
    }

    b i(i iVar, int i) {
        this.a = iVar;
        float f = i;
        iVar.g0 = f;
        this.b = f;
        this.f = true;
        return this;
    }

    @Override // ax.E.d.a
    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.e.b() == 0;
    }

    b j(i iVar, i iVar2, float f) {
        this.e.h(iVar, -1.0f);
        this.e.h(iVar2, f);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f) {
        this.e.h(iVar, -1.0f);
        this.e.h(iVar2, 1.0f);
        this.e.h(iVar3, f);
        this.e.h(iVar4, -f);
        return this;
    }

    public b l(float f, float f2, float f3, i iVar, i iVar2, i iVar3, i iVar4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.e.h(iVar, 1.0f);
            this.e.h(iVar2, -1.0f);
            this.e.h(iVar4, 1.0f);
            this.e.h(iVar3, -1.0f);
            return this;
        }
        if (f == 0.0f) {
            this.e.h(iVar, 1.0f);
            this.e.h(iVar2, -1.0f);
            return this;
        }
        if (f3 == 0.0f) {
            this.e.h(iVar3, 1.0f);
            this.e.h(iVar4, -1.0f);
            return this;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.e.h(iVar, 1.0f);
        this.e.h(iVar2, -1.0f);
        this.e.h(iVar4, f4);
        this.e.h(iVar3, -f4);
        return this;
    }

    public b m(i iVar, int i) {
        if (i < 0) {
            this.b = i * (-1);
            this.e.h(iVar, 1.0f);
            return this;
        }
        this.b = i;
        this.e.h(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.h(iVar, 1.0f);
            this.e.h(iVar2, -1.0f);
            return this;
        }
        this.e.h(iVar, -1.0f);
        this.e.h(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.h(iVar, 1.0f);
            this.e.h(iVar2, -1.0f);
            this.e.h(iVar3, -1.0f);
            return this;
        }
        this.e.h(iVar, -1.0f);
        this.e.h(iVar2, 1.0f);
        this.e.h(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.h(iVar, 1.0f);
            this.e.h(iVar2, -1.0f);
            this.e.h(iVar3, 1.0f);
            return this;
        }
        this.e.h(iVar, -1.0f);
        this.e.h(iVar2, 1.0f);
        this.e.h(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f) {
        this.e.h(iVar3, 0.5f);
        this.e.h(iVar4, 0.5f);
        this.e.h(iVar, -0.5f);
        this.e.h(iVar2, -0.5f);
        this.b = -f;
        return this;
    }

    void r() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = f * (-1.0f);
            this.e.f();
        }
    }

    boolean s() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.k0 == i.a.UNRESTRICTED || this.b >= 0.0f;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.e.i(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.a;
        if (iVar2 != null) {
            this.e.h(iVar2, -1.0f);
            this.a.e0 = -1;
            this.a = null;
        }
        float j = this.e.j(iVar, true) * (-1.0f);
        this.a = iVar;
        if (j == 1.0f) {
            return;
        }
        this.b /= j;
        this.e.k(j);
    }

    public void y() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.E.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.e = new ax.E.a(this, cVar);
    }
}
