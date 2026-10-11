package ax.W3;

import ax.P3.s;
import ax.k4.h;

/* loaded from: classes.dex */
public class a<T> implements s<T> {
    protected final T q;

    public a(T t) {
        this.q = (T) h.d(t);
    }

    @Override // ax.P3.s
    public Class<T> b() {
        return (Class<T>) this.q.getClass();
    }

    @Override // ax.P3.s
    public final T get() {
        return this.q;
    }

    @Override // ax.P3.s
    public final int getSize() {
        return 1;
    }

    @Override // ax.P3.s
    public void recycle() {
    }
}
