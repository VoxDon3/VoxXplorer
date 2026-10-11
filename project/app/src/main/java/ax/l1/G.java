/*
 * Decompiled with CFR 0.152.
 */
package ax.l1;

import android.util.Pair;
import androidx.media3.exoplayer.N0;
import androidx.media3.exoplayer.s;
import ax.P0.N;
import ax.P0.P;
import ax.P0.V;
import ax.S0.d0;
import ax.Y0.W;
import ax.i1.F;
import ax.i1.q0;
import ax.l1.D;
import ax.l1.H;
import ax.l1.I;
import ax.l1.J;
import ax.l1.K;
import java.util.Arrays;

public abstract class G
extends J {
    private a c;

    private static int n(N0[] n0Array, P p8, int[] nArray, boolean bl) throws s {
        int n8 = n0Array.length;
        int n9 = 0;
        int n10 = 1;
        for (int i8 = 0; i8 < n0Array.length; ++i8) {
            int n11;
            int n12;
            int n13;
            block5: {
                int n14;
                int n15;
                block4: {
                    N0 n02 = n0Array[i8];
                    n15 = 0;
                    for (n14 = 0; n14 < p8.a; ++n14) {
                        n15 = Math.max(n15, ax.Y0.V.i(n02.b(p8.b(n14))));
                    }
                    n14 = nArray[i8] == 0 ? 1 : 0;
                    if (n15 > n9) break block4;
                    n13 = n8;
                    n12 = n9;
                    n11 = n10;
                    if (n15 != n9) break block5;
                    n13 = n8;
                    n12 = n9;
                    n11 = n10;
                    if (!bl) break block5;
                    n13 = n8;
                    n12 = n9;
                    n11 = n10;
                    if (n10 != 0) break block5;
                    n13 = n8;
                    n12 = n9;
                    n11 = n10;
                    if (n14 == 0) break block5;
                }
                n13 = i8;
                n11 = n14;
                n12 = n15;
            }
            n8 = n13;
            n9 = n12;
            n10 = n11;
        }
        return n8;
    }

    private static int[] p(N0 n02, P p8) throws s {
        int[] nArray = new int[p8.a];
        for (int i8 = 0; i8 < p8.a; ++i8) {
            nArray[i8] = n02.b(p8.b(i8));
        }
        return nArray;
    }

    private static int[] q(N0[] n0Array) throws s {
        int n8 = n0Array.length;
        int[] nArray = new int[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            nArray[i8] = n0Array[i8].A();
        }
        return nArray;
    }

    @Override
    public final void i(Object object) {
        this.c = (a)object;
    }

    @Override
    public final K k(N0[] object, q0 pair, F.b object2, N n8) throws s {
        int[] nArray;
        q0[] q0Array;
        int n9;
        int n10;
        int[] nArray2 = new int[((N0[])object).length + 1];
        int n11 = ((N0[])object).length + 1;
        P[][] pArrayArray = new P[n11][];
        int[][][] nArrayArray = new int[((N0[])object).length + 1][][];
        int n12 = 0;
        for (n10 = 0; n10 < n11; ++n10) {
            n9 = pair.a;
            pArrayArray[n10] = new P[n9];
            nArrayArray[n10] = new int[n9][];
        }
        int[] nArray3 = G.q(object);
        for (n10 = 0; n10 < pair.a; ++n10) {
            q0Array = pair.c(n10);
            boolean bl = q0Array.c == 5;
            n9 = G.n(object, (P)q0Array, nArray2, bl);
            nArray = n9 == ((N0[])object).length ? new int[q0Array.a] : G.p(object[n9], (P)q0Array);
            n11 = nArray2[n9];
            pArrayArray[n9][n11] = q0Array;
            nArrayArray[n9][n11] = nArray;
            nArray2[n9] = n11 + 1;
        }
        q0Array = new q0[((N0[])object).length];
        pair = new String[((N0[])object).length];
        nArray = new int[((N0[])object).length];
        for (n10 = n12; n10 < ((N0[])object).length; ++n10) {
            n12 = nArray2[n10];
            q0Array[n10] = new q0(d0.g1(pArrayArray[n10], n12));
            nArrayArray[n10] = (int[][])d0.g1(nArrayArray[n10], n12);
            pair[n10] = object[n10].getName();
            nArray[n10] = object[n10].k();
        }
        n10 = nArray2[((N0[])object).length];
        object = new a((String[])pair, nArray, q0Array, nArray3, nArrayArray, new q0(d0.g1(pArrayArray[((N0[])object).length], n10)));
        pair = this.r((a)object, nArrayArray, nArray3, (F.b)object2, n8);
        object2 = I.a((a)object, (H[])pair.second);
        return new K((W[])pair.first, (D[])pair.second, (V)object2, object);
    }

    public final a o() {
        return this.c;
    }

    protected abstract Pair<W[], D[]> r(a var1, int[][][] var2, int[] var3, F.b var4, N var5) throws s;

    public static final class a {
        private final int a;
        private final String[] b;
        private final int[] c;
        private final q0[] d;
        private final int[] e;
        private final int[][][] f;
        private final q0 g;

        a(String[] stringArray, int[] nArray, q0[] q0Array, int[] nArray2, int[][][] nArray3, q0 q02) {
            this.b = stringArray;
            this.c = nArray;
            this.d = q0Array;
            this.f = nArray3;
            this.e = nArray2;
            this.g = q02;
            this.a = nArray.length;
        }

        public int a(int n8, int n9, boolean bl) {
            int n10 = this.d[n8].c((int)n9).a;
            int[] nArray = new int[n10];
            int n11 = 0;
            for (int i8 = 0; i8 < n10; ++i8) {
                int n12;
                block4: {
                    block3: {
                        int n13 = this.h(n8, n9, i8);
                        if (n13 == 4) break block3;
                        n12 = n11;
                        if (!bl) break block4;
                        n12 = n11;
                        if (n13 != 3) break block4;
                    }
                    nArray[n11] = i8;
                    n12 = n11 + 1;
                }
                n11 = n12;
            }
            return this.b(n8, n9, Arrays.copyOf(nArray, n11));
        }

        public int b(int n8, int n9, int[] nArray) {
            int n10 = 0;
            String string = null;
            boolean bl = false;
            int n11 = 0;
            int n12 = 16;
            while (n10 < nArray.length) {
                int n13 = nArray[n10];
                String string2 = this.d[n8].c((int)n9).b((int)n13).o;
                if (n11 == 0) {
                    string = string2;
                } else {
                    bl |= j.Objects.equals((Object)string, (Object)string2) ^ true;
                }
                n12 = Math.min(n12, ax.Y0.V.f(this.f[n8][n9][n10]));
                ++n10;
                ++n11;
            }
            if (bl) {
                return Math.min(n12, this.e[n8]);
            }
            return n12;
        }

        public int c(int n8, int n9, int n10) {
            return this.f[n8][n9][n10];
        }

        public int d() {
            return this.a;
        }

        public int e(int n8) {
            int[][] nArray = this.f[n8];
            int n9 = nArray.length;
            int n10 = 0;
            for (n8 = 0; n8 < n9; ++n8) {
                int[] nArray2 = nArray[n8];
                int n11 = nArray2.length;
                for (int i8 = 0; i8 < n11; ++i8) {
                    int n12;
                    int n13 = ax.Y0.V.i(nArray2[i8]);
                    int n14 = n12 = 1;
                    if (n13 != 0) {
                        n14 = n12;
                        if (n13 != 1) {
                            n14 = n12;
                            if (n13 != 2) {
                                if (n13 != 3) {
                                    if (n13 == 4) {
                                        return 3;
                                    }
                                    throw new IllegalStateException();
                                }
                                n14 = 2;
                            }
                        }
                    }
                    n10 = Math.max(n10, n14);
                }
            }
            return n10;
        }

        public int f(int n8) {
            return this.c[n8];
        }

        public q0 g(int n8) {
            return this.d[n8];
        }

        public int h(int n8, int n9, int n10) {
            return ax.Y0.V.i(this.c(n8, n9, n10));
        }

        public int i(int n8) {
            int n9 = 0;
            for (int i8 = 0; i8 < this.a; ++i8) {
                int n10 = n9;
                if (this.c[i8] == n8) {
                    n10 = Math.max(n9, this.e(i8));
                }
                n9 = n10;
            }
            return n9;
        }

        public q0 j() {
            return this.g;
        }
    }
}

