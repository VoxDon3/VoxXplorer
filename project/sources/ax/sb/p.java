package ax.sb;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class p<T> implements InterfaceC3076h<T>, Serializable {
    private volatile Object c0;
    private final Object d0;
    private ax.Fb.a<? extends T> q;

    public p(ax.Fb.a<? extends T> aVar, Object obj) {
        ax.Gb.l.f(aVar, "initializer");
        this.q = aVar;
        this.c0 = r.a;
        this.d0 = obj == null ? this : obj;
    }

    @Override // ax.sb.InterfaceC3076h
    public boolean b() {
        return this.c0 != r.a;
    }

    @Override // ax.sb.InterfaceC3076h
    public T getValue() {
        T t;
        T t2 = (T) this.c0;
        r rVar = r.a;
        if (t2 != rVar) {
            return t2;
        }
        synchronized (this.d0) {
            t = (T) this.c0;
            if (t == rVar) {
                ax.Fb.a<? extends T> aVar = this.q;
                ax.Gb.l.c(aVar);
                t = aVar.invoke();
                this.c0 = t;
                this.q = null;
            }
        }
        return t;
    }

    public String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ p(ax.Fb.a aVar, Object obj, int i, ax.Gb.g gVar) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }
}
