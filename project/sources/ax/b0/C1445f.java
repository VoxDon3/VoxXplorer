package ax.b0;

import ax.Gb.l;

/* renamed from: ax.b0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1445f<T> extends C1444e<T> {
    private final Object c;

    public C1445f(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // ax.b0.C1444e, ax.b0.InterfaceC1443d
    public boolean a(T t) {
        boolean a;
        l.f(t, "instance");
        synchronized (this.c) {
            a = super.a(t);
        }
        return a;
    }

    @Override // ax.b0.C1444e, ax.b0.InterfaceC1443d
    public T b() {
        T t;
        synchronized (this.c) {
            t = (T) super.b();
        }
        return t;
    }
}
