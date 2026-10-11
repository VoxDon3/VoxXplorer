package ax.D7;

/* loaded from: classes3.dex */
public class x<T> implements ax.a8.b<T> {
    private static final Object c = new Object();
    private volatile Object a = c;
    private volatile ax.a8.b<T> b;

    public x(ax.a8.b<T> bVar) {
        this.b = bVar;
    }

    @Override // ax.a8.b
    public T get() {
        T t;
        T t2 = (T) this.a;
        Object obj = c;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.a;
                if (t == obj) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
