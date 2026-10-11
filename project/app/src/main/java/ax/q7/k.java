/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.a;
import ax.q7.n;
import ax.q7.q;
import java.io.Serializable;

public abstract class k<T>
implements Serializable {
    k() {
    }

    public static <T> k<T> a() {
        return a.f();
    }

    public static <T> k<T> d(T t8) {
        return new q<T>(n.n(t8));
    }

    public abstract T b();

    public abstract boolean c();

    public abstract T e(T var1);
}

