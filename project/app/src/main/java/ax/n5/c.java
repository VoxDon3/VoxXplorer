/*
 * Decompiled with CFR 0.152.
 */
package ax.n5;

import ax.n5.a;
import ax.n5.d;
import ax.n5.e;
import ax.n5.f;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class c<T> {
    public static <T> c<T> f(T t8) {
        return new a<T>(null, t8, e.q, null, null);
    }

    public static <T> c<T> g(T t8) {
        return new a<T>(null, t8, e.d0, null, null);
    }

    public abstract Integer a();

    public abstract d b();

    public abstract T c();

    public abstract e d();

    public abstract f e();
}

