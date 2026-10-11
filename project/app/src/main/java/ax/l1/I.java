/*
 * Decompiled with CFR 0.152.
 */
package ax.l1;

import android.graphics.Point;
import android.os.SystemClock;
import ax.P0.P;
import ax.P0.V;
import ax.S0.d0;
import ax.i1.q0;
import ax.l1.D;
import ax.l1.G;
import ax.l1.H;
import ax.m1.m;
import ax.r7.z;
import java.util.Arrays;
import java.util.List;

public final class I {
    public static V a(G.a a8, H[] hArray) {
        List[] listArray = new List[hArray.length];
        for (int i8 = 0; i8 < hArray.length; ++i8) {
            Object object = hArray[i8];
            object = object != null ? z.A(object) : z.z();
            listArray[i8] = object;
        }
        return I.b(a8, listArray);
    }

    public static V b(G.a object, List<? extends H>[] object2) {
        Object object3;
        int n8;
        z.a<V.a> a8 = new z.a<V.a>();
        for (n8 = 0; n8 < ((G.a)object).d(); ++n8) {
            q0 q02 = ((G.a)object).g(n8);
            List<? extends H> list = object2[n8];
            for (int i8 = 0; i8 < q02.a; ++i8) {
                P p8 = q02.c(i8);
                boolean bl = ((G.a)object).a(n8, i8, false) != 0;
                int n9 = p8.a;
                int[] nArray = new int[n9];
                boolean[] blArray = new boolean[n9];
                for (n9 = 0; n9 < p8.a; ++n9) {
                    boolean bl2;
                    block5: {
                        nArray[n9] = ((G.a)object).h(n8, i8, n9);
                        for (int i9 = 0; i9 < list.size(); ++i9) {
                            object3 = list.get(i9);
                            if (!object3.b().equals(p8) || object3.t(n9) == -1) continue;
                            bl2 = true;
                            break block5;
                        }
                        bl2 = false;
                    }
                    blArray[n9] = bl2;
                }
                a8.h(new V.a(p8, bl, nArray, blArray));
            }
        }
        object2 = ((G.a)object).j();
        for (n8 = 0; n8 < ((q0)object2).a; ++n8) {
            object = ((q0)object2).c(n8);
            object3 = new int[((P)object).a];
            Arrays.fill((int[])object3, 0);
            a8.h(new V.a((P)object, false, (int[])object3, new boolean[((P)object).a]));
        }
        return new V(a8.k());
    }

    public static m.a c(D d8) {
        long l8 = SystemClock.elapsedRealtime();
        int n8 = d8.length();
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10 = n9;
            if (d8.a(i8, l8)) {
                n10 = n9 + 1;
            }
            n9 = n10;
        }
        return new m.a(1, 0, n8, n9);
    }

    public static Point d(boolean bl, int n8, int n9, int n10, int n11) {
        int n12;
        int n13;
        block6: {
            block5: {
                if (!bl) break block5;
                n13 = 0;
                n12 = n10 > n11 ? 1 : 0;
                if (n8 > n9) {
                    n13 = 1;
                }
                if (n12 != n13) break block6;
            }
            n12 = n8;
            n8 = n9;
            n9 = n12;
        }
        n12 = n10 * n8;
        n13 = n11 * n9;
        if (n12 >= n13) {
            return new Point(n9, d0.k(n13, n10));
        }
        return new Point(d0.k(n12, n11), n8);
    }
}

