/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.M0;
import ax.W5.U0;
import ax.W5.X0;
import ax.W5.X1;

final class V0
extends X0 {
    /* synthetic */ V0(U0 u02) {
        super(null);
    }

    @Override
    final void a(Object object, long l8) {
        ((M0)X1.f(object, l8)).b();
    }

    @Override
    final void b(Object object, Object object2, long l8) {
        M0 m02 = (M0)X1.f(object, l8);
        M0 m03 = (M0)X1.f(object2, l8);
        int n8 = m02.size();
        int n9 = m03.size();
        object2 = m02;
        if (n8 > 0) {
            object2 = m02;
            if (n9 > 0) {
                object2 = m02;
                if (!m02.c()) {
                    object2 = m02.v(n9 + n8);
                }
                object2.addAll(m03);
            }
        }
        if (n8 <= 0) {
            object2 = m03;
        }
        X1.p(object, l8, object2);
    }
}

