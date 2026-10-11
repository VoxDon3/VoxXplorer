/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.os.Looper;
import android.os.Message;
import ax.P0.r;
import ax.S0.h;
import ax.S0.q;
import ax.S0.r;
import ax.S0.s;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class t<T> {
    private final h a;
    private final q b;
    private final b<T> c;
    private final CopyOnWriteArraySet<c<T>> d;
    private final ArrayDeque<Runnable> e;
    private final ArrayDeque<Runnable> f;
    private final Object g;
    private boolean h;
    private boolean i;

    public t(Looper looper, h h8, b<T> b8) {
        this(new CopyOnWriteArraySet<c<T>>(), looper, h8, b8, true);
    }

    private t(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, h h8, b<T> b8, boolean bl) {
        this.a = h8;
        this.d = copyOnWriteArraySet;
        this.c = b8;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = h8.d(looper, new r(this));
        this.i = bl;
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet object, int n8, a a8) {
        object = ((CopyOnWriteArraySet)object).iterator();
        while (object.hasNext()) {
            ((c)object.next()).a(n8, a8);
        }
    }

    public static /* synthetic */ boolean b(t t8, Message message) {
        return t8.g(message);
    }

    private boolean g(Message object) {
        object = this.d.iterator();
        while (object.hasNext()) {
            ((c)object.next()).b(this.c);
            if (!this.b.e(1)) continue;
        }
        return true;
    }

    private void l() {
        if (!this.i) {
            return;
        }
        boolean bl = Thread.currentThread() == this.b.l().getThread();
        ax.S0.a.g(bl);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(T t8) {
        ax.S0.a.e(t8);
        Object object = this.g;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    if (this.h) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                CopyOnWriteArraySet<c<T>> copyOnWriteArraySet = this.d;
                c<T> c8 = new c<T>(t8);
                copyOnWriteArraySet.add(c8);
                return;
            }
            throw throwable2;
        }
    }

    public t<T> d(Looper looper, h h8, b<T> b8) {
        return new t<T>(this.d, looper, h8, b8, this.i);
    }

    public t<T> e(Looper looper, b<T> b8) {
        return this.d(looper, this.a, b8);
    }

    public void f() {
        this.l();
        if (!this.f.isEmpty()) {
            if (!this.b.e(1)) {
                q q8 = this.b;
                q8.b(q8.d(1));
            }
            boolean bl = this.e.isEmpty();
            this.e.addAll(this.f);
            this.f.clear();
            if (bl) {
                while (!this.e.isEmpty()) {
                    this.e.peekFirst().run();
                    this.e.removeFirst();
                }
            }
        }
    }

    public void h(int n8, a<T> a8) {
        this.l();
        CopyOnWriteArraySet<c<T>> copyOnWriteArraySet = new CopyOnWriteArraySet<c<T>>(this.d);
        this.f.add(new s(copyOnWriteArraySet, n8, a8));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void i() {
        this.l();
        Object object = this.g;
        synchronized (object) {
            this.h = true;
        }
        Iterator<c<T>> iterator = this.d.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.d.clear();
                return;
            }
            iterator.next().c(this.c);
        }
    }

    public void j(T t8) {
        this.l();
        for (c<T> c8 : this.d) {
            if (!c8.a.equals(t8)) continue;
            c8.c(this.c);
            this.d.remove(c8);
        }
    }

    public void k(int n8, a<T> a8) {
        this.h(n8, a8);
        this.f();
    }

    public static interface a<T> {
        public void invoke(T var1);
    }

    public static interface b<T> {
        public void a(T var1, ax.P0.r var2);
    }

    private static final class c<T> {
        public final T a;
        private r.b b;
        private boolean c;
        private boolean d;

        public c(T t8) {
            this.a = t8;
            this.b = new r.b();
        }

        public void a(int n8, a<T> a8) {
            if (!this.d) {
                if (n8 != -1) {
                    this.b.a(n8);
                }
                this.c = true;
                a8.invoke(this.a);
            }
        }

        public void b(b<T> b8) {
            if (!this.d && this.c) {
                ax.P0.r r8 = this.b.e();
                this.b = new r.b();
                this.c = false;
                b8.a(this.a, r8);
            }
        }

        public void c(b<T> b8) {
            this.d = true;
            if (this.c) {
                this.c = false;
                b8.a(this.a, this.b.e());
            }
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && c.class == object.getClass()) {
                return this.a.equals(((c)object).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }
}

