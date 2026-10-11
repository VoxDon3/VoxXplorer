/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.h;

@Deprecated
class ReflectiveGenericLifecycleObserver
implements f {
    private final a.a c0;
    private final Object q;

    ReflectiveGenericLifecycleObserver(Object object) {
        this.q = object;
        this.c0 = a.c.c(object.getClass());
    }

    @Override
    public void b(h h8, d.a a8) {
        this.c0.a(h8, a8, this.q);
    }
}

