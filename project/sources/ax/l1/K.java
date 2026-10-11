package ax.l1;

import ax.P0.V;
import ax.S0.C0968a;
import ax.Y0.W;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class K {
    public final int a;
    public final W[] b;
    public final InterfaceC2445D[] c;
    public final V d;
    public final Object e;

    public K(W[] wArr, InterfaceC2445D[] interfaceC2445DArr, V v, Object obj) {
        C0968a.a(wArr.length == interfaceC2445DArr.length);
        this.b = wArr;
        this.c = (InterfaceC2445D[]) interfaceC2445DArr.clone();
        this.d = v;
        this.e = obj;
        this.a = wArr.length;
    }

    public boolean a(K k) {
        if (k == null || k.c.length != this.c.length) {
            return false;
        }
        for (int i = 0; i < this.c.length; i++) {
            if (!b(k, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(K k, int i) {
        return k != null && Objects.equals(this.b[i], k.b[i]) && Objects.equals(this.c[i], k.c[i]);
    }

    public boolean c(int i) {
        return this.b[i] != null;
    }
}
