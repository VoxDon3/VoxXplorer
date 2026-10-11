/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A;
import ax.b6.M;
import ax.b6.Z;
import ax.b6.Z2;
import ax.b6.h;
import ax.b6.s;
import ax.b6.y2;
import java.util.List;

public final class J
extends A {
    protected J() {
        this.a.add(Z.d0);
        this.a.add(Z.X0);
        this.a.add(Z.a1);
    }

    @Override
    public final s b(String object, Z2 z22, List<s> list) {
        int n8 = M.a[y2.c((String)object).ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return super.a((String)object);
                }
                y2.f(Z.a1, 2, list);
                object = z22.b(list.get(0));
                if (object.e().booleanValue()) {
                    return object;
                }
                return z22.b(list.get(1));
            }
            y2.f(Z.X0, 1, list);
            return new h(z22.b(list.get(0)).e() ^ true);
        }
        y2.f(Z.d0, 2, list);
        object = z22.b(list.get(0));
        if (!object.e().booleanValue()) {
            return object;
        }
        return z22.b(list.get(1));
    }
}

