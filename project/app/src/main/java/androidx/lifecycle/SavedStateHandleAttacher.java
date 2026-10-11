/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.h;
import ax.G0.q;
import ax.Gb.l;

public final class SavedStateHandleAttacher
implements f {
    private final q q;

    public SavedStateHandleAttacher(q q8) {
        l.f(q8, "provider");
        this.q = q8;
    }

    @Override
    public void b(h object, d.a a8) {
        l.f(object, "source");
        l.f((Object)a8, "event");
        if (a8 == d.a.ON_CREATE) {
            object.getLifecycle().c(this);
            this.q.d();
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Next event must be ON_CREATE, it was ");
        ((StringBuilder)object).append((Object)a8);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }
}

