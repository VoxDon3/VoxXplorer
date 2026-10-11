package ax.p1;

import ax.S0.F;
import ax.S0.G;
import ax.S0.d0;
import ax.p1.e;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
final class f {
    public static e a(byte[] bArr, int i) {
        ArrayList<e.a> arrayList;
        G g = new G(bArr);
        try {
            arrayList = c(g) ? f(g) : e(g);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new e(arrayList.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayList.get(0), arrayList.get(1), i);
    }

    private static int b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static boolean c(G g) {
        g.c0(4);
        int v = g.v();
        g.b0(0);
        return v == 1886547818;
    }

    private static e.a d(G g) {
        int v = g.v();
        e.a aVar = null;
        if (v > 10000) {
            return null;
        }
        float[] fArr = new float[v];
        for (int i = 0; i < v; i++) {
            fArr[i] = g.u();
        }
        int v2 = g.v();
        if (v2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(v * 2.0d) / log);
        F f = new F(g.f());
        int i2 = 8;
        f.p(g.g() * 8);
        float[] fArr2 = new float[v2 * 5];
        int[] iArr = new int[5];
        int i3 = 0;
        int i4 = 0;
        while (i3 < v2) {
            e.a aVar2 = aVar;
            int i5 = 0;
            while (i5 < 5) {
                int b = iArr[i5] + b(f.h(ceil));
                if (b >= v || b < 0) {
                    return aVar2;
                }
                fArr2[i4] = fArr[b];
                iArr[i5] = b;
                i5++;
                i4++;
            }
            i3++;
            aVar = aVar2;
        }
        e.a aVar3 = aVar;
        f.p((f.e() + 7) & (-8));
        int i6 = 32;
        int h = f.h(32);
        e.b[] bVarArr = new e.b[h];
        int i7 = 0;
        while (i7 < h) {
            int h2 = f.h(i2);
            int h3 = f.h(i2);
            int h4 = f.h(i6);
            if (h4 > 128000) {
                return aVar3;
            }
            int i8 = h;
            int ceil2 = (int) Math.ceil(Math.log(v2 * d) / log);
            float[] fArr3 = new float[h4 * 3];
            float[] fArr4 = new float[h4 * 2];
            int i9 = 0;
            int i10 = 0;
            while (i9 < h4) {
                int b2 = i10 + b(f.h(ceil2));
                if (b2 < 0 || b2 >= v2) {
                    return aVar3;
                }
                int i11 = i9 * 3;
                int i12 = b2 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i9 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
                i9++;
                i10 = b2;
            }
            bVarArr[i7] = new e.b(h2, fArr3, fArr4, h3);
            i7++;
            h = i8;
            i6 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new e.a(bVarArr);
    }

    private static ArrayList<e.a> e(G g) {
        if (g.M() != 0) {
            return null;
        }
        g.c0(7);
        int v = g.v();
        if (v == 1684433976) {
            G g2 = new G();
            Inflater inflater = new Inflater(true);
            try {
                if (!d0.F0(g, g2, inflater)) {
                    return null;
                }
                inflater.end();
                g = g2;
            } finally {
                inflater.end();
            }
        } else if (v != 1918990112) {
            return null;
        }
        return g(g);
    }

    private static ArrayList<e.a> f(G g) {
        int v;
        g.c0(8);
        int g2 = g.g();
        int j = g.j();
        while (g2 < j && (v = g.v() + g2) > g2 && v <= j) {
            int v2 = g.v();
            if (v2 == 2037673328 || v2 == 1836279920) {
                g.a0(v);
                return e(g);
            }
            g.b0(v);
            g2 = v;
        }
        return null;
    }

    private static ArrayList<e.a> g(G g) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int g2 = g.g();
        int j = g.j();
        while (g2 < j) {
            int v = g.v() + g2;
            if (v <= g2 || v > j) {
                return null;
            }
            if (g.v() == 1835365224) {
                e.a d = d(g);
                if (d == null) {
                    return null;
                }
                arrayList.add(d);
            }
            g.b0(v);
            g2 = v;
        }
        return arrayList;
    }
}
