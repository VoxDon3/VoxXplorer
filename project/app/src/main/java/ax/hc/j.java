/*
 * Decompiled with CFR 0.152.
 */
package ax.hc;

import ax.cc.d;
import ax.hc.f;
import ax.kc.a;

public class j
extends a
implements f<Object, Object> {
    private f b;

    public j(f f8) {
        super(f8.b());
        this.b = f8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(Object object, Object object2, d d8) {
        synchronized (object) {
            this.b.c(object, object2, d8);
            return;
        }
    }
}

