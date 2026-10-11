/*
 * Decompiled with CFR 0.152.
 */
package ax.yb;

import ax.wb.e;
import ax.wb.i;
import ax.yb.a;

public abstract class j
extends a {
    public j(e<Object> e8) {
        super(e8);
        if (e8 != null) {
            if (e8.b() == ax.wb.j.q) {
                return;
            }
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public i b() {
        return ax.wb.j.q;
    }
}

