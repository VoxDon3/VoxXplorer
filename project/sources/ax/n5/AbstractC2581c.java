package ax.n5;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: ax.n5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2581c<T> {
    public static <T> AbstractC2581c<T> f(T t) {
        return new C2579a(null, t, e.DEFAULT, null, null);
    }

    public static <T> AbstractC2581c<T> g(T t) {
        return new C2579a(null, t, e.HIGHEST, null, null);
    }

    public abstract Integer a();

    public abstract d b();

    public abstract T c();

    public abstract e d();

    public abstract f e();
}
