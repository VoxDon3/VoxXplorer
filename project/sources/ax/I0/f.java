package ax.I0;

import androidx.lifecycle.p;
import ax.Fb.l;

/* loaded from: classes.dex */
public final class f<T extends p> {
    private final Class<T> a;
    private final l<a, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Class<T> cls, l<? super a, ? extends T> lVar) {
        ax.Gb.l.f(cls, "clazz");
        ax.Gb.l.f(lVar, "initializer");
        this.a = cls;
        this.b = lVar;
    }

    public final Class<T> a() {
        return this.a;
    }

    public final l<a, T> b() {
        return this.b;
    }
}
