/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A;
import ax.b6.B;
import ax.b6.Z;
import ax.b6.Z2;
import ax.b6.k;
import ax.b6.s;
import ax.b6.y2;
import java.util.List;

public final class y
extends A {
    public y() {
        this.a.add(Z.g0);
        this.a.add(Z.h0);
        this.a.add(Z.i0);
        this.a.add(Z.j0);
        this.a.add(Z.k0);
        this.a.add(Z.l0);
        this.a.add(Z.m0);
    }

    @Override
    public final s b(String string, Z2 z22, List<s> list) {
        switch (B.a[y2.c(string).ordinal()]) {
            default: {
                return super.a(string);
            }
            case 7: {
                y2.f(Z.m0, 2, list);
                return new k(Double.valueOf(y2.i(z22.b(list.get(0)).f()) ^ y2.i(z22.b(list.get(1)).f())));
            }
            case 6: {
                y2.f(Z.l0, 2, list);
                return new k(Double.valueOf(y2.m(z22.b(list.get(0)).f()) >>> (int)(y2.m(z22.b(list.get(1)).f()) & 0x1FL)));
            }
            case 5: {
                y2.f(Z.k0, 2, list);
                return new k(Double.valueOf(y2.i(z22.b(list.get(0)).f()) >> (int)(y2.m(z22.b(list.get(1)).f()) & 0x1FL)));
            }
            case 4: {
                y2.f(Z.j0, 2, list);
                return new k(Double.valueOf(y2.i(z22.b(list.get(0)).f()) | y2.i(z22.b(list.get(1)).f())));
            }
            case 3: {
                y2.f(Z.i0, 1, list);
                return new k(Double.valueOf(~y2.i(z22.b(list.get(0)).f())));
            }
            case 2: {
                y2.f(Z.h0, 2, list);
                return new k(Double.valueOf(y2.i(z22.b(list.get(0)).f()) << (int)(y2.m(z22.b(list.get(1)).f()) & 0x1FL)));
            }
            case 1: 
        }
        y2.f(Z.g0, 2, list);
        return new k(Double.valueOf(y2.i(z22.b(list.get(0)).f()) & y2.i(z22.b(list.get(1)).f())));
    }
}

