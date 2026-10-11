/*
 * Decompiled with CFR 0.152.
 */
package ax.p1;

import ax.S0.F;
import ax.S0.G;
import ax.S0.d0;
import ax.p1.e;
import java.util.ArrayList;
import java.util.zip.Inflater;

final class f {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e a(byte[] object, int n8) {
        block5: {
            block4: {
                object = new G((byte[])object);
                try {
                    if (!f.c((G)object)) break block4;
                    object = f.f((G)object);
                    break block5;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    return null;
                }
            }
            object = f.e((G)object);
        }
        if (object == null) {
            return null;
        }
        int n9 = ((ArrayList)object).size();
        if (n9 == 1) {
            return new e((e.a)((ArrayList)object).get(0), n8);
        }
        if (n9 == 2) return new e((e.a)((ArrayList)object).get(0), (e.a)((ArrayList)object).get(1), n8);
        return null;
    }

    private static int b(int n8) {
        return -(n8 & 1) ^ n8 >> 1;
    }

    private static boolean c(G g8) {
        g8.c0(4);
        int n8 = g8.v();
        g8.b0(0);
        return n8 == 1886547818;
    }

    private static e.a d(G g8) {
        int n8;
        int n9;
        int n10;
        int n11 = g8.v();
        float[] fArray = null;
        if (n11 > 10000) {
            return null;
        }
        float[] fArray2 = new float[n11];
        for (n10 = 0; n10 < n11; ++n10) {
            fArray2[n10] = g8.u();
        }
        int n12 = g8.v();
        if (n12 > 32000) {
            return null;
        }
        double d8 = Math.log(2.0);
        int n13 = (int)Math.ceil(Math.log((double)n11 * 2.0) / d8);
        F f8 = new F(g8.f());
        f8.p(g8.g() * 8);
        float[] fArray3 = new float[n12 * 5];
        Object[] objectArray = new int[5];
        int n14 = 0;
        g8 = fArray;
        for (n10 = 0; n10 < n12; ++n10) {
            n9 = 0;
            while (n9 < 5) {
                n8 = objectArray[n9] + f.b(f8.h(n13));
                if (n8 < n11 && n8 >= 0) {
                    fArray3[n14] = fArray2[n8];
                    objectArray[n9] = n8;
                    ++n9;
                    ++n14;
                    continue;
                }
                return g8;
            }
        }
        f8.p(f8.e() + 7 & 0xFFFFFFF8);
        n14 = f8.h(32);
        objectArray = new e.b[n14];
        for (n10 = 0; n10 < n14; ++n10) {
            n13 = f8.h(8);
            int n15 = f8.h(8);
            n8 = f8.h(32);
            if (n8 > 128000) {
                return g8;
            }
            int n16 = (int)Math.ceil(Math.log((double)n12 * 2.0) / d8);
            fArray = new float[n8 * 3];
            fArray2 = new float[n8 * 2];
            n11 = 0;
            for (n9 = 0; n9 < n8; ++n9) {
                if ((n11 += f.b(f8.h(n16))) >= 0 && n11 < n12) {
                    int n17 = n9 * 3;
                    int n18 = n11 * 5;
                    fArray[n17] = fArray3[n18];
                    fArray[n17 + 1] = fArray3[n18 + 1];
                    fArray[n17 + 2] = fArray3[n18 + 2];
                    n17 = n9 * 2;
                    fArray2[n17] = fArray3[n18 + 3];
                    fArray2[n17 + 1] = fArray3[n18 + 4];
                    continue;
                }
                return g8;
            }
            objectArray[n10] = (int)new e.b(n13, fArray, fArray2, n15);
        }
        return new e.a((e.b[])objectArray);
    }

    private static ArrayList<e.a> e(G g8) {
        if (g8.M() != 0) {
            return null;
        }
        g8.c0(7);
        int n8 = g8.v();
        if (n8 == 1684433976) {
            G g9 = new G();
            Inflater inflater = new Inflater(true);
            try {
                boolean bl = d0.F0(g8, g9, inflater);
                if (!bl) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                g8 = g9;
            }
            catch (Throwable throwable) {
                inflater.end();
                throw throwable;
            }
        } else if (n8 != 1918990112) {
            return null;
        }
        return f.g(g8);
    }

    private static ArrayList<e.a> f(G g8) {
        int n8;
        g8.c0(8);
        int n9 = g8.g();
        int n10 = g8.j();
        while (n9 < n10 && (n8 = g8.v() + n9) > n9 && n8 <= n10) {
            n9 = g8.v();
            if (n9 != 2037673328 && n9 != 1836279920) {
                g8.b0(n8);
                n9 = n8;
                continue;
            }
            g8.a0(n8);
            return f.e(g8);
        }
        return null;
    }

    private static ArrayList<e.a> g(G g8) {
        ArrayList<e.a> arrayList = new ArrayList<e.a>();
        int n8 = g8.g();
        int n9 = g8.j();
        while (n8 < n9) {
            int n10 = g8.v() + n8;
            if (n10 > n8 && n10 <= n9) {
                if (g8.v() == 1835365224) {
                    e.a a8 = f.d(g8);
                    if (a8 == null) {
                        return null;
                    }
                    arrayList.add(a8);
                }
                g8.b0(n10);
                n8 = n10;
                continue;
            }
            return null;
        }
        return arrayList;
    }
}

