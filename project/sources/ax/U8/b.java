package ax.U8;

/* loaded from: classes3.dex */
public abstract class b<T> {
    protected a a;
    protected T b;

    public b(a aVar) {
        this.a = aVar;
    }

    public a a() {
        return this.a;
    }

    public T b() {
        return this.b;
    }

    public abstract void c(ax.Z8.a<?> aVar);

    public String toString() {
        return "AvPair{avId=" + this.a.name() + ", value=" + this.b + '}';
    }

    public b(a aVar, T t) {
        this.a = aVar;
        this.b = t;
    }
}
