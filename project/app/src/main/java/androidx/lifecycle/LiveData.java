/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.h;
import ax.G0.m;
import ax.w.b;
import java.util.Map;

public abstract class LiveData<T> {
    static final Object k = new Object();
    final Object a = new Object();
    private ax.w.b<m<? super T>, c> b = new ax.w.b();
    int c = 0;
    private boolean d;
    private volatile Object e;
    volatile Object f;
    private int g;
    private boolean h;
    private boolean i;
    private final Runnable j;

    public LiveData() {
        Object object;
        this.f = object = k;
        this.j = new Runnable(this){
            final LiveData q;
            {
                this.q = liveData;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                Object object;
                Object object2 = this.q.a;
                synchronized (object2) {
                    object = this.q.f;
                    this.q.f = k;
                }
                this.q.n(object);
            }
        };
        this.e = object;
        this.g = -1;
    }

    static void b(String string) {
        if (ax.v.c.g().b()) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot invoke ");
        stringBuilder.append(string);
        stringBuilder.append(" on a background thread");
        throw new IllegalStateException(stringBuilder.toString());
    }

    private void d(c c8) {
        int n8;
        block5: {
            block4: {
                if (!c8.c0) break block4;
                if (!c8.k()) {
                    c8.h(false);
                    return;
                }
                int n9 = c8.d0;
                n8 = this.g;
                if (n9 < n8) break block5;
            }
            return;
        }
        c8.d0 = n8;
        c8.q.a(this.e);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void c(int n8) {
        Throwable throwable2;
        int n9 = this.c;
        this.c = n8 + n9;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            int n10;
            block7: {
                block6: {
                    try {
                        n10 = this.c;
                        if (n9 == n10) {
                            this.d = false;
                            return;
                        }
                        n8 = n9 == 0 && n10 > 0 ? 1 : 0;
                        n9 = n9 > 0 && n10 == 0 ? 1 : 0;
                        if (n8 == 0) break block6;
                        this.j();
                        break block7;
                    }
                    catch (Throwable throwable2) {
                        break;
                    }
                }
                if (n9 != 0) {
                    this.k();
                }
            }
            n9 = n10;
        }
        this.d = false;
        throw throwable2;
    }

    void e(c c8) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        c c9 = c8;
        do {
            block5: {
                this.i = false;
                if (c9 != null) {
                    this.d(c9);
                    c8 = null;
                } else {
                    b.d d8 = this.b.h();
                    do {
                        c8 = c9;
                        if (!d8.hasNext()) break block5;
                        this.d((c)((Map.Entry)d8.next()).getValue());
                    } while (!this.i);
                    c8 = c9;
                }
            }
            c9 = c8;
        } while (this.i);
        this.h = false;
    }

    public T f() {
        Object object = this.e;
        if (object != k) {
            return (T)object;
        }
        return null;
    }

    public boolean g() {
        return this.c > 0;
    }

    public void h(h h8, m<? super T> object) {
        LifecycleBoundObserver lifecycleBoundObserver;
        block5: {
            block4: {
                LiveData.b("observe");
                if (h8.getLifecycle().b() == d.b.q) break block4;
                lifecycleBoundObserver = new LifecycleBoundObserver(this, h8, object);
                if ((object = this.b.l((m<T>)object, lifecycleBoundObserver)) != null && !((c)object).j(h8)) {
                    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
                }
                if (object == null) break block5;
            }
            return;
        }
        h8.getLifecycle().a(lifecycleBoundObserver);
    }

    public void i(m<? super T> object) {
        LiveData.b("observeForever");
        b b8 = new b(this, object);
        object = this.b.l((m<T>)object, b8);
        if (!(object instanceof LifecycleBoundObserver)) {
            if (object != null) {
                return;
            }
            b8.h(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    protected void j() {
    }

    protected void k() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    protected void l(T t8) {
        Object object = this.a;
        // MONITORENTER : object
        boolean bl = this.f == k;
        this.f = t8;
        // MONITOREXIT : object
        if (!bl) {
            return;
        }
        ax.v.c.g().c(this.j);
    }

    public void m(m<? super T> object) {
        LiveData.b("removeObserver");
        object = this.b.n((m<T>)object);
        if (object == null) {
            return;
        }
        ((c)object).i();
        ((c)object).h(false);
    }

    protected void n(T t8) {
        LiveData.b("setValue");
        ++this.g;
        this.e = t8;
        this.e(null);
    }

    class LifecycleBoundObserver
    extends c
    implements f {
        final h f0;
        final LiveData g0;

        LifecycleBoundObserver(LiveData liveData, h h8, m<? super T> m8) {
            this.g0 = liveData;
            super(liveData, m8);
            this.f0 = h8;
        }

        @Override
        public void b(h object, d.a object2) {
            object = this.f0.getLifecycle().b();
            if (object == d.b.q) {
                this.g0.m(this.q);
                return;
            }
            object2 = null;
            while (object2 != object) {
                this.h(this.k());
                d.b b8 = this.f0.getLifecycle().b();
                object2 = object;
                object = b8;
            }
        }

        @Override
        void i() {
            this.f0.getLifecycle().c(this);
        }

        @Override
        boolean j(h h8) {
            return this.f0 == h8;
        }

        @Override
        boolean k() {
            return this.f0.getLifecycle().b().h(d.b.e0);
        }
    }

    private class b
    extends c {
        final LiveData f0;

        b(LiveData liveData, m<? super T> m8) {
            this.f0 = liveData;
            super(liveData, m8);
        }

        @Override
        boolean k() {
            return true;
        }
    }

    private abstract class c {
        boolean c0;
        int d0;
        final LiveData e0;
        final m<? super T> q;

        c(LiveData liveData, m<? super T> m8) {
            this.e0 = liveData;
            this.d0 = -1;
            this.q = m8;
        }

        void h(boolean bl) {
            if (bl != this.c0) {
                this.c0 = bl;
                LiveData liveData = this.e0;
                int n8 = bl ? 1 : -1;
                liveData.c(n8);
                if (this.c0) {
                    this.e0.e(this);
                }
            }
        }

        void i() {
        }

        boolean j(h h8) {
            return false;
        }

        abstract boolean k();
    }
}

