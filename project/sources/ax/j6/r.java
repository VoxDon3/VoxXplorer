package ax.j6;

import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
final class r<T> implements q<T> {
    private final Object a = new Object();
    private final int b;
    private final K c;
    private int d;
    private int e;
    private int f;
    private Exception g;
    private boolean h;

    public r(int i, K k) {
        this.b = i;
        this.c = k;
    }

    private final void b() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g == null) {
                if (this.h) {
                    this.c.r();
                    return;
                } else {
                    this.c.q(null);
                    return;
                }
            }
            this.c.p(new ExecutionException(this.e + " out of " + this.b + " underlying tasks failed", this.g));
        }
    }

    @Override // ax.j6.InterfaceC2324g
    public final void a(T t) {
        synchronized (this.a) {
            this.d++;
            b();
        }
    }

    @Override // ax.j6.InterfaceC2321d
    public final void c() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            b();
        }
    }

    @Override // ax.j6.InterfaceC2323f
    public final void d(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            b();
        }
    }
}
