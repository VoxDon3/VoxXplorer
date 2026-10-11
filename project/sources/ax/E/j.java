package ax.E;

import ax.E.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j implements b.a {
    private static float n = 0.001f;
    private final int a = -1;
    private int b = 16;
    private int c = 16;
    int[] d = new int[16];
    int[] e = new int[16];
    int[] f = new int[16];
    float[] g = new float[16];
    int[] h = new int[16];
    int[] i = new int[16];
    int j = 0;
    int k = -1;
    private final b l;
    protected final c m;

    j(b bVar, c cVar) {
        this.l = bVar;
        this.m = cVar;
        clear();
    }

    private void l(i iVar, int i) {
        int[] iArr;
        int i2 = iVar.d0 % this.c;
        int[] iArr2 = this.d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.e[i] = -1;
    }

    private void m(int i, i iVar, float f) {
        this.f[i] = iVar.d0;
        this.g[i] = f;
        this.h[i] = -1;
        this.i[i] = -1;
        iVar.d(this.l);
        iVar.n0++;
        this.j++;
    }

    private int n() {
        for (int i = 0; i < this.b; i++) {
            if (this.f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void o() {
        int i = this.b * 2;
        this.f = Arrays.copyOf(this.f, i);
        this.g = Arrays.copyOf(this.g, i);
        this.h = Arrays.copyOf(this.h, i);
        this.i = Arrays.copyOf(this.i, i);
        this.e = Arrays.copyOf(this.e, i);
        for (int i2 = this.b; i2 < i; i2++) {
            this.f[i2] = -1;
            this.e[i2] = -1;
        }
        this.b = i;
    }

    private void q(int i, i iVar, float f) {
        int n2 = n();
        m(n2, iVar, f);
        if (i != -1) {
            this.h[n2] = i;
            int[] iArr = this.i;
            iArr[n2] = iArr[i];
            iArr[i] = n2;
        } else {
            this.h[n2] = -1;
            if (this.j > 0) {
                this.i[n2] = this.k;
                this.k = n2;
            } else {
                this.i[n2] = -1;
            }
        }
        int i2 = this.i[n2];
        if (i2 != -1) {
            this.h[i2] = n2;
        }
        l(iVar, n2);
    }

    private void r(i iVar) {
        int[] iArr;
        int i;
        int i2 = iVar.d0;
        int i3 = i2 % this.c;
        int[] iArr2 = this.d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f[i4] == i2) {
            int[] iArr3 = this.e;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.e;
            i = iArr[i4];
            if (i == -1 || this.f[i] == i2) {
                break;
            } else {
                i4 = i;
            }
        }
        if (i == -1 || this.f[i] != i2) {
            return;
        }
        iArr[i4] = iArr[i];
        iArr[i] = -1;
    }

    @Override // ax.E.b.a
    public void a(i iVar, float f, boolean z) {
        float f2 = n;
        if (f <= (-f2) || f >= f2) {
            int p = p(iVar);
            if (p == -1) {
                h(iVar, f);
                return;
            }
            float[] fArr = this.g;
            float f3 = fArr[p] + f;
            fArr[p] = f3;
            float f4 = n;
            if (f3 <= (-f4) || f3 >= f4) {
                return;
            }
            fArr[p] = 0.0f;
            j(iVar, z);
        }
    }

    @Override // ax.E.b.a
    public int b() {
        return this.j;
    }

    @Override // ax.E.b.a
    public float c(i iVar) {
        int p = p(iVar);
        if (p != -1) {
            return this.g[p];
        }
        return 0.0f;
    }

    @Override // ax.E.b.a
    public void clear() {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            i d = d(i2);
            if (d != null) {
                d.l(this.l);
            }
        }
        for (int i3 = 0; i3 < this.b; i3++) {
            this.f[i3] = -1;
            this.e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.c; i4++) {
            this.d[i4] = -1;
        }
        this.j = 0;
        this.k = -1;
    }

    @Override // ax.E.b.a
    public i d(int i) {
        int i2 = this.j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.m.d[this.f[i3]];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // ax.E.b.a
    public float e(b bVar, boolean z) {
        float c = c(bVar.a);
        j(bVar.a, z);
        j jVar = (j) bVar.e;
        int b = jVar.b();
        int i = 0;
        int i2 = 0;
        while (i < b) {
            int i3 = jVar.f[i2];
            if (i3 != -1) {
                a(this.m.d[i3], jVar.g[i2] * c, z);
                i++;
            }
            i2++;
        }
        return c;
    }

    @Override // ax.E.b.a
    public void f() {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // ax.E.b.a
    public float g(int i) {
        int i2 = this.j;
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.g[i3];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // ax.E.b.a
    public void h(i iVar, float f) {
        float f2 = n;
        if (f > (-f2) && f < f2) {
            j(iVar, true);
            return;
        }
        if (this.j == 0) {
            m(0, iVar, f);
            l(iVar, 0);
            this.k = 0;
            return;
        }
        int p = p(iVar);
        if (p != -1) {
            this.g[p] = f;
            return;
        }
        if (this.j + 1 >= this.b) {
            o();
        }
        int i = this.j;
        int i2 = this.k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f[i2];
            int i6 = iVar.d0;
            if (i5 == i6) {
                this.g[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.i[i2];
            if (i2 == -1) {
                break;
            }
        }
        q(i3, iVar, f);
    }

    @Override // ax.E.b.a
    public boolean i(i iVar) {
        return p(iVar) != -1;
    }

    @Override // ax.E.b.a
    public float j(i iVar, boolean z) {
        int p = p(iVar);
        if (p == -1) {
            return 0.0f;
        }
        r(iVar);
        float f = this.g[p];
        if (this.k == p) {
            this.k = this.i[p];
        }
        this.f[p] = -1;
        int[] iArr = this.h;
        int i = iArr[p];
        if (i != -1) {
            int[] iArr2 = this.i;
            iArr2[i] = iArr2[p];
        }
        int i2 = this.i[p];
        if (i2 != -1) {
            iArr[i2] = iArr[p];
        }
        this.j--;
        iVar.n0--;
        if (z) {
            iVar.l(this.l);
        }
        return f;
    }

    @Override // ax.E.b.a
    public void k(float f) {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        if (this.j != 0 && iVar != null) {
            int i = iVar.d0;
            int i2 = this.d[i % this.c];
            if (i2 == -1) {
                return -1;
            }
            if (this.f[i2] == i) {
                return i2;
            }
            do {
                i2 = this.e[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.f[i2] != i);
            if (i2 != -1 && this.f[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            i d = d(i2);
            if (d != null) {
                String str2 = str + d + " = " + g(i2) + " ";
                int p = p(d);
                String str3 = str2 + "[p: ";
                String str4 = (this.h[p] != -1 ? str3 + this.m.d[this.f[this.h[p]]] : str3 + "none") + ", n: ";
                str = (this.i[p] != -1 ? str4 + this.m.d[this.f[this.i[p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
