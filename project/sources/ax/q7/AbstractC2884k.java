package ax.q7;

import java.io.Serializable;

/* renamed from: ax.q7.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2884k<T> implements Serializable {
    AbstractC2884k() {
    }

    public static <T> AbstractC2884k<T> a() {
        return C2874a.f();
    }

    public static <T> AbstractC2884k<T> d(T t) {
        return new q(n.n(t));
    }

    public abstract T b();

    public abstract boolean c();

    public abstract T e(T t);
}
