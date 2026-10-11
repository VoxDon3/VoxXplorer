/*
 * Decompiled with CFR 0.152.
 */
package ax.l1;

import ax.P0.N;
import ax.P0.P;
import ax.P0.v;
import ax.S0.u;
import ax.i1.F;
import ax.j1.d;
import ax.l1.H;
import ax.m1.e;
import java.util.List;

public interface D
extends H {
    public boolean a(int var1, long var2);

    public void c(long var1, long var3, long var5, List<? extends d> var7, ax.j1.e[] var8);

    public int d();

    public boolean e(long var1, ax.j1.b var3, List<? extends d> var4);

    public void f();

    public void g(boolean var1);

    public void i();

    public int k(long var1, List<? extends d> var3);

    public int l();

    public v m();

    public int n();

    public boolean o(int var1, long var2);

    public void p(float var1);

    public Object q();

    public void r();

    public void s();

    public static final class a {
        public final P a;
        public final int[] b;
        public final int c;

        public a(P p8, int ... nArray) {
            this(p8, nArray, 0);
        }

        public a(P p8, int[] nArray, int n8) {
            if (nArray.length == 0) {
                u.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.a = p8;
            this.b = nArray;
            this.c = n8;
        }
    }

    public static interface b {
        public D[] a(a[] var1, e var2, F.b var3, N var4);
    }
}

