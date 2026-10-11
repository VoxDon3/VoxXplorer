package ax.W5;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class X implements Serializable, W {
    volatile transient boolean c0;
    transient Object d0;
    final W q;

    X(W w) {
        this.q = w;
    }

    @Override // ax.W5.W
    public final Object a() {
        if (!this.c0) {
            synchronized (this) {
                try {
                    if (!this.c0) {
                        Object a = this.q.a();
                        this.d0 = a;
                        this.c0 = true;
                        return a;
                    }
                } finally {
                }
            }
        }
        return this.d0;
    }

    public final String toString() {
        Object obj;
        if (this.c0) {
            obj = "<supplier that returned " + String.valueOf(this.d0) + ">";
        } else {
            obj = this.q;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }
}
