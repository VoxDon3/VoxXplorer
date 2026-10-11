/*
 * Decompiled with CFR 0.152.
 */
package ax.l1;

import ax.P0.V;
import ax.S0.a;
import ax.Y0.W;
import ax.l1.D;

public final class K {
    public final int a;
    public final W[] b;
    public final D[] c;
    public final V d;
    public final Object e;

    public K(W[] wArray, D[] dArray, V v8, Object object) {
        boolean bl = wArray.length == dArray.length;
        ax.S0.a.a(bl);
        this.b = wArray;
        this.c = (D[])dArray.clone();
        this.d = v8;
        this.e = object;
        this.a = wArray.length;
    }

    public boolean a(K k8) {
        if (k8 != null && k8.c.length == this.c.length) {
            for (int i8 = 0; i8 < this.c.length; ++i8) {
                if (this.b(k8, i8)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean b(K k8, int n8) {
        if (k8 == null) {
            return false;
        }
        return j.Objects.equals((Object)this.b[n8], (Object)k8.b[n8]) && j.Objects.equals((Object)this.c[n8], (Object)k8.c[n8]);
    }

    public boolean c(int n8) {
        return this.b[n8] != null;
    }
}

