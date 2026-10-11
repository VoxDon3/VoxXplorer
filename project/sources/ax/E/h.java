package ax.E;

import ax.E.b;
import java.util.Arrays;
import java.util.Comparator;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class h extends ax.E.b {
    private int g;
    private i[] h;
    private i[] i;
    private int j;
    b k;
    c l;

    class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.d0 - iVar2.d0;
        }
    }

    class b {
        i a;
        h b;

        public b(h hVar) {
            this.b = hVar;
        }

        public boolean a(i iVar, float f) {
            boolean z = true;
            if (!this.a.q) {
                for (int i = 0; i < 9; i++) {
                    float f2 = iVar.j0[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.a.j0[i] = f3;
                    } else {
                        this.a.j0[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.a.j0;
                float f4 = fArr[i2] + (iVar.j0[i2] * f);
                fArr[i2] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.a.j0[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                h.this.G(this.a);
            }
            return false;
        }

        public void b(i iVar) {
            this.a = iVar;
        }

        public final boolean c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.a.j0[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = iVar.j0[i];
                float f2 = this.a.j0[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.a.j0, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.a.j0[i] + " ";
                }
            }
            return str + "] " + this.a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.g = 128;
        this.h = new i[128];
        this.i = new i[128];
        this.j = 0;
        this.k = new b(this);
        this.l = cVar;
    }

    private final void F(i iVar) {
        int i;
        int i2 = this.j + 1;
        i[] iVarArr = this.h;
        if (i2 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.h = iVarArr2;
            this.i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.h;
        int i3 = this.j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 > 1 && iVarArr3[i3].d0 > iVar.d0) {
            int i5 = 0;
            while (true) {
                i = this.j;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new a());
            for (int i6 = 0; i6 < this.j; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        iVar.q = true;
        iVar.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i = 0;
        while (i < this.j) {
            if (this.h[i] == iVar) {
                while (true) {
                    int i2 = this.j;
                    if (i >= i2 - 1) {
                        this.j = i2 - 1;
                        iVar.q = false;
                        return;
                    } else {
                        i[] iVarArr = this.h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // ax.E.b
    public void B(d dVar, ax.E.b bVar, boolean z) {
        i iVar = bVar.a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.e;
        int b2 = aVar.b();
        for (int i = 0; i < b2; i++) {
            i d = aVar.d(i);
            float g = aVar.g(i);
            this.k.b(d);
            if (this.k.a(iVar, g)) {
                F(d);
            }
            this.b += bVar.b * g;
        }
        G(iVar);
    }

    @Override // ax.E.b, ax.E.d.a
    public void b(i iVar) {
        this.k.b(iVar);
        this.k.e();
        iVar.j0[iVar.f0] = 1.0f;
        F(iVar);
    }

    @Override // ax.E.b, ax.E.d.a
    public i c(d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.j; i2++) {
            i iVar = this.h[i2];
            if (!zArr[iVar.d0]) {
                this.k.b(iVar);
                if (i == -1) {
                    if (!this.k.c()) {
                    }
                    i = i2;
                } else {
                    if (!this.k.d(this.h[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    @Override // ax.E.b, ax.E.d.a
    public void clear() {
        this.j = 0;
        this.b = 0.0f;
    }

    @Override // ax.E.b, ax.E.d.a
    public boolean isEmpty() {
        return this.j == 0;
    }

    @Override // ax.E.b
    public String toString() {
        String str = HttpUrl.FRAGMENT_ENCODE_SET + " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.j; i++) {
            this.k.b(this.h[i]);
            str = str + this.k + " ";
        }
        return str;
    }
}
