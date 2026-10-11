/*
 * Decompiled with CFR 0.152.
 */
package ax.E;

import ax.E.b;
import ax.E.c;
import ax.E.i;
import java.util.Arrays;

public class j
implements b.a {
    private static float n = 0.001f;
    private final int a;
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

    j(b b8, c c8) {
        this.a = -1;
        this.l = b8;
        this.m = c8;
        this.clear();
    }

    private void l(i object, int n8) {
        Object object2;
        int n9 = ((i)object).d0 % this.c;
        object = this.d;
        Object object3 = object2 = object[n9];
        if (object2 == -1) {
            object[n9] = n8;
        } else {
            while ((object2 = (object = (Object)this.e)[object3]) != -1) {
                object3 = object2;
            }
            object[object3] = n8;
        }
        this.e[n8] = -1;
    }

    private void m(int n8, i i8, float f8) {
        this.f[n8] = i8.d0;
        this.g[n8] = f8;
        this.h[n8] = -1;
        this.i[n8] = -1;
        i8.d(this.l);
        ++i8.n0;
        ++this.j;
    }

    private int n() {
        for (int i8 = 0; i8 < this.b; ++i8) {
            if (this.f[i8] != -1) continue;
            return i8;
        }
        return -1;
    }

    private void o() {
        int n8 = this.b * 2;
        this.f = Arrays.copyOf(this.f, n8);
        this.g = Arrays.copyOf(this.g, n8);
        this.h = Arrays.copyOf(this.h, n8);
        this.i = Arrays.copyOf(this.i, n8);
        this.e = Arrays.copyOf(this.e, n8);
        for (int i8 = this.b; i8 < n8; ++i8) {
            this.f[i8] = -1;
            this.e[i8] = -1;
        }
        this.b = n8;
    }

    private void q(int n8, i i8, float f8) {
        int n9 = this.n();
        this.m(n9, i8, f8);
        if (n8 != -1) {
            this.h[n9] = n8;
            int[] nArray = this.i;
            nArray[n9] = nArray[n8];
            nArray[n8] = n9;
        } else {
            this.h[n9] = -1;
            if (this.j > 0) {
                this.i[n9] = this.k;
                this.k = n9;
            } else {
                this.i[n9] = -1;
            }
        }
        n8 = this.i[n9];
        if (n8 != -1) {
            this.h[n8] = n9;
        }
        this.l(i8, n9);
    }

    private void r(i object) {
        int[] nArray = this.d;
        int n8 = ((i)object).d0;
        int n9 = n8 % this.c;
        Object object2 = nArray[n9];
        if (object2 != -1) {
            int n10 = object2;
            if (this.f[object2] == n8) {
                object = this.e;
                nArray[n9] = (int)object[object2];
                object[object2] = -1;
                return;
            }
            while ((object2 = (Object)(object = (Object)this.e)[n10]) != -1 && this.f[object2] != n8) {
                n10 = object2;
            }
            if (object2 != -1 && this.f[object2] == n8) {
                object[n10] = object[object2];
                object[object2] = -1;
            }
        }
    }

    @Override
    public void a(i i8, float f8, boolean bl) {
        float f9 = n;
        if (!(f8 > -f9) || !(f8 < f9)) {
            int n8 = this.p(i8);
            if (n8 == -1) {
                this.h(i8, f8);
                return;
            }
            float[] fArray = this.g;
            fArray[n8] = f9 = fArray[n8] + f8;
            f8 = n;
            if (f9 > -f8 && f9 < f8) {
                fArray[n8] = 0.0f;
                this.j(i8, bl);
            }
        }
    }

    @Override
    public int b() {
        return this.j;
    }

    @Override
    public float c(i i8) {
        int n8 = this.p(i8);
        if (n8 != -1) {
            return this.g[n8];
        }
        return 0.0f;
    }

    @Override
    public void clear() {
        int n8;
        int n9 = this.j;
        for (n8 = 0; n8 < n9; ++n8) {
            i i8 = this.d(n8);
            if (i8 == null) continue;
            i8.l(this.l);
        }
        for (n8 = 0; n8 < this.b; ++n8) {
            this.f[n8] = -1;
            this.e[n8] = -1;
        }
        for (n8 = 0; n8 < this.c; ++n8) {
            this.d[n8] = -1;
        }
        this.j = 0;
        this.k = -1;
    }

    @Override
    public i d(int n8) {
        int n9 = this.j;
        if (n9 == 0) {
            return null;
        }
        int n10 = this.k;
        for (int i8 = 0; i8 < n9; ++i8) {
            if (i8 == n8 && n10 != -1) {
                return this.m.d[this.f[n10]];
            }
            if ((n10 = this.i[n10]) == -1) break;
        }
        return null;
    }

    @Override
    public float e(b object, boolean bl) {
        float f8 = this.c(((b)object).a);
        this.j(((b)object).a, bl);
        object = (j)((b)object).e;
        int n8 = ((j)object).b();
        int n9 = 0;
        int n10 = 0;
        while (n9 < n8) {
            int n11 = ((j)object).f[n10];
            int n12 = n9;
            if (n11 != -1) {
                float f9 = ((j)object).g[n10];
                this.a(this.m.d[n11], f9 * f8, bl);
                n12 = n9 + 1;
            }
            ++n10;
            n9 = n12;
        }
        return f8;
    }

    @Override
    public void f() {
        int n8 = this.j;
        int n9 = this.k;
        for (int i8 = 0; i8 < n8; ++i8) {
            float[] fArray = this.g;
            fArray[n9] = fArray[n9] * -1.0f;
            if ((n9 = this.i[n9]) == -1) break;
        }
    }

    @Override
    public float g(int n8) {
        int n9 = this.j;
        int n10 = this.k;
        for (int i8 = 0; i8 < n9; ++i8) {
            if (i8 == n8) {
                return this.g[n10];
            }
            if ((n10 = this.i[n10]) == -1) break;
        }
        return 0.0f;
    }

    @Override
    public void h(i i8, float f8) {
        int n8;
        float f9 = n;
        if (f8 > -f9 && f8 < f9) {
            this.j(i8, true);
            return;
        }
        int n9 = this.j;
        int n10 = 0;
        if (n9 == 0) {
            this.m(0, i8, f8);
            this.l(i8, 0);
            this.k = 0;
            return;
        }
        n9 = this.p(i8);
        if (n9 != -1) {
            this.g[n9] = f8;
            return;
        }
        if (this.j + 1 >= this.b) {
            this.o();
        }
        int n11 = this.j;
        n9 = this.k;
        int n12 = -1;
        while (true) {
            n8 = n12;
            if (n10 >= n11) break;
            int n13 = this.f[n9];
            n8 = i8.d0;
            if (n13 == n8) {
                this.g[n9] = f8;
                return;
            }
            if (n13 < n8) {
                n12 = n9;
            }
            if ((n9 = this.i[n9]) == -1) {
                n8 = n12;
                break;
            }
            ++n10;
        }
        this.q(n8, i8, f8);
    }

    @Override
    public boolean i(i i8) {
        return this.p(i8) != -1;
    }

    @Override
    public float j(i i8, boolean bl) {
        int n8 = this.p(i8);
        if (n8 == -1) {
            return 0.0f;
        }
        this.r(i8);
        float f8 = this.g[n8];
        if (this.k == n8) {
            this.k = this.i[n8];
        }
        this.f[n8] = -1;
        int[] nArray = this.h;
        int n9 = nArray[n8];
        if (n9 != -1) {
            int[] nArray2 = this.i;
            nArray2[n9] = nArray2[n8];
        }
        if ((n9 = this.i[n8]) != -1) {
            nArray[n9] = nArray[n8];
        }
        --this.j;
        --i8.n0;
        if (bl) {
            i8.l(this.l);
        }
        return f8;
    }

    @Override
    public void k(float f8) {
        int n8 = this.j;
        int n9 = this.k;
        for (int i8 = 0; i8 < n8; ++i8) {
            float[] fArray = this.g;
            fArray[n9] = fArray[n9] / f8;
            if ((n9 = this.i[n9]) == -1) break;
        }
    }

    public int p(i i8) {
        if (this.j != 0 && i8 != null) {
            int n8 = i8.d0;
            int n9 = this.c;
            int n10 = this.d[n8 % n9];
            if (n10 == -1) {
                return -1;
            }
            n9 = n10;
            if (this.f[n10] == n8) {
                return n10;
            }
            while ((n9 = this.e[n9]) != -1 && this.f[n9] != n8) {
            }
            if (n9 == -1) {
                return -1;
            }
            if (this.f[n9] == n8) {
                return n9;
            }
        }
        return -1;
    }

    public String toString() {
        Comparable<i> comparable;
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this.hashCode());
        charSequence.append(" { ");
        charSequence = charSequence.toString();
        int n8 = this.j;
        for (int i8 = 0; i8 < n8; ++i8) {
            comparable = this.d(i8);
            if (comparable == null) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(comparable);
            stringBuilder.append(" = ");
            stringBuilder.append(this.g(i8));
            stringBuilder.append(" ");
            charSequence = stringBuilder.toString();
            int n9 = this.p((i)comparable);
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append((String)charSequence);
            ((StringBuilder)comparable).append("[p: ");
            charSequence = ((StringBuilder)comparable).toString();
            if (this.h[n9] != -1) {
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append((String)charSequence);
                ((StringBuilder)comparable).append(this.m.d[this.f[this.h[n9]]]);
                charSequence = ((StringBuilder)comparable).toString();
            } else {
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append((String)charSequence);
                ((StringBuilder)comparable).append("none");
                charSequence = ((StringBuilder)comparable).toString();
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append((String)charSequence);
            ((StringBuilder)comparable).append(", n: ");
            charSequence = ((StringBuilder)comparable).toString();
            if (this.i[n9] != -1) {
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append((String)charSequence);
                ((StringBuilder)comparable).append(this.m.d[this.f[this.i[n9]]]);
                charSequence = ((StringBuilder)comparable).toString();
            } else {
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append((String)charSequence);
                ((StringBuilder)comparable).append("none");
                charSequence = ((StringBuilder)comparable).toString();
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append((String)charSequence);
            ((StringBuilder)comparable).append("]");
            charSequence = ((StringBuilder)comparable).toString();
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append((String)charSequence);
        ((StringBuilder)comparable).append(" }");
        return ((StringBuilder)comparable).toString();
    }
}

