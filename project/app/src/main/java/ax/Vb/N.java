/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Gb.l;
import ax.Qb.M0;
import ax.wb.i;

final class N {
    public final i a;
    private final Object[] b;
    private final M0<Object>[] c;
    private int d;

    public N(i i8, int n8) {
        this.a = i8;
        this.b = new Object[n8];
        this.c = new M0[n8];
    }

    public final void a(M0<?> m02, Object m0Array) {
        Object[] objectArray = this.b;
        int n8 = this.d;
        objectArray[n8] = m0Array;
        m0Array = this.c;
        this.d = n8 + 1;
        l.d(m02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        m0Array[n8] = m02;
    }

    public final void b(i i8) {
        int n8 = this.c.length - 1;
        if (n8 >= 0) {
            while (true) {
                int n9 = n8 - 1;
                M0<Object> m02 = this.c[n8];
                l.c(m02);
                m02.L(i8, this.b[n8]);
                if (n9 < 0) break;
                n8 = n9;
            }
        }
    }
}

