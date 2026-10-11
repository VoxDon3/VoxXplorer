/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.Fb.a;
import ax.G0.h;
import ax.Gb.l;
import ax.sb.n;
import ax.sb.o;

public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
implements f {
    final d c0;
    final ax.Qb.l<Object> d0;
    final a<Object> e0;
    final d.b q;

    @Override
    public void b(h object, d.a object2) {
        l.f(object, "source");
        l.f(object2, "event");
        if (object2 == d.a.Companion.c(this.q)) {
            this.c0.c(this);
            object2 = this.d0;
            object = this.e0;
            try {
                n.a a8 = n.q;
                object = n.a(object.invoke());
            }
            catch (Throwable throwable) {
                n.a a9 = n.q;
                object = n.a(o.a(throwable));
            }
            object2.f(object);
        } else if (object2 == d.a.ON_DESTROY) {
            this.c0.c(this);
            object = this.d0;
            object2 = n.q;
            object.f(n.a(o.a(new ax.G0.f())));
        }
    }
}

