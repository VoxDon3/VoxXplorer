package androidx.lifecycle;

import androidx.lifecycle.d;
import ax.v.C3243c;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object k = new Object();
    final Object a = new Object();
    private ax.w.b<ax.G0.m<? super T>, LiveData<T>.c> b = new ax.w.b<>();
    int c = 0;
    private boolean d;
    private volatile Object e;
    volatile Object f;
    private int g;
    private boolean h;
    private boolean i;
    private final Runnable j;

    class LifecycleBoundObserver extends LiveData<T>.c implements f {
        final ax.G0.h f0;

        LifecycleBoundObserver(ax.G0.h hVar, ax.G0.m<? super T> mVar) {
            super(mVar);
            this.f0 = hVar;
        }

        @Override // androidx.lifecycle.f
        public void b(ax.G0.h hVar, d.a aVar) {
            d.b b = this.f0.getLifecycle().b();
            if (b == d.b.DESTROYED) {
                LiveData.this.m(this.q);
                return;
            }
            d.b bVar = null;
            while (bVar != b) {
                h(k());
                bVar = b;
                b = this.f0.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        void i() {
            this.f0.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean j(ax.G0.h hVar) {
            return this.f0 == hVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return this.f0.getLifecycle().b().h(d.b.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.f;
                LiveData.this.f = LiveData.k;
            }
            LiveData.this.n(obj);
        }
    }

    private class b extends LiveData<T>.c {
        b(ax.G0.m<? super T> mVar) {
            super(mVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return true;
        }
    }

    private abstract class c {
        boolean c0;
        int d0 = -1;
        final ax.G0.m<? super T> q;

        c(ax.G0.m<? super T> mVar) {
            this.q = mVar;
        }

        void h(boolean z) {
            if (z == this.c0) {
                return;
            }
            this.c0 = z;
            LiveData.this.c(z ? 1 : -1);
            if (this.c0) {
                LiveData.this.e(this);
            }
        }

        void i() {
        }

        boolean j(ax.G0.h hVar) {
            return false;
        }

        abstract boolean k();
    }

    public LiveData() {
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }

    static void b(String str) {
        if (C3243c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(LiveData<T>.c cVar) {
        if (cVar.c0) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i = cVar.d0;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            cVar.d0 = i2;
            cVar.q.a((Object) this.e);
        }
    }

    void c(int i) {
        int i2 = this.c;
        this.c = i + i2;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            try {
                int i3 = this.c;
                if (i2 == i3) {
                    this.d = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    j();
                } else if (z2) {
                    k();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
    }

    void e(LiveData<T>.c cVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                ax.w.b<ax.G0.m<? super T>, LiveData<T>.c>.d h = this.b.h();
                while (h.hasNext()) {
                    d((c) h.next().getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public T f() {
        T t = (T) this.e;
        if (t != k) {
            return t;
        }
        return null;
    }

    public boolean g() {
        return this.c > 0;
    }

    public void h(ax.G0.h hVar, ax.G0.m<? super T> mVar) {
        b("observe");
        if (hVar.getLifecycle().b() == d.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(hVar, mVar);
        LiveData<T>.c l = this.b.l(mVar, lifecycleBoundObserver);
        if (l != null && !l.j(hVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (l != null) {
            return;
        }
        hVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void i(ax.G0.m<? super T> mVar) {
        b("observeForever");
        b bVar = new b(mVar);
        LiveData<T>.c l = this.b.l(mVar, bVar);
        if (l instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (l != null) {
            return;
        }
        bVar.h(true);
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = t;
        }
        if (z) {
            C3243c.g().c(this.j);
        }
    }

    public void m(ax.G0.m<? super T> mVar) {
        b("removeObserver");
        LiveData<T>.c n = this.b.n(mVar);
        if (n == null) {
            return;
        }
        n.i();
        n.h(false);
    }

    protected void n(T t) {
        b("setValue");
        this.g++;
        this.e = t;
        e(null);
    }
}
