/*
 * Decompiled with CFR 0.152.
 */
package ax.sb;

import ax.Fb.a;
import ax.Gb.g;
import ax.Gb.l;
import ax.sb.h;
import ax.sb.r;
import java.io.Serializable;

final class p<T>
implements h<T>,
Serializable {
    private volatile Object c0;
    private final Object d0;
    private a<? extends T> q;

    public p(a<? extends T> object, Object object2) {
        l.f(object, "initializer");
        this.q = object;
        this.c0 = r.a;
        object = object2;
        if (object2 == null) {
            object = this;
        }
        this.d0 = object;
    }

    public /* synthetic */ p(a a8, Object object, int n8, g g8) {
        if ((n8 & 2) != 0) {
            object = null;
        }
        this(a8, object);
    }

    @Override
    public boolean b() {
        return this.c0 != r.a;
    }

    @Override
    public T getValue() {
        a<T> a8 = this.c0;
        r r8 = r.a;
        if (a8 != r8) {
            return (T)a8;
        }
        Object object = this.d0;
        synchronized (object) {
            block5: {
                a8 = this.c0;
                if (a8 != r8) break block5;
                a8 = this.q;
                l.c(a8);
                this.c0 = a8 = a8.invoke();
                this.q = null;
            }
            return (T)a8;
        }
    }

    public String toString() {
        if (this.b()) {
            return String.valueOf(this.getValue());
        }
        return "Lazy value not initialized yet.";
    }
}

