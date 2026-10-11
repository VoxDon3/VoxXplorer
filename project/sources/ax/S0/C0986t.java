package ax.S0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ax.P0.r;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ax.S0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0986t<T> {
    private final InterfaceC0975h a;
    private final InterfaceC0984q b;
    private final b<T> c;
    private final CopyOnWriteArraySet<c<T>> d;
    private final ArrayDeque<Runnable> e;
    private final ArrayDeque<Runnable> f;
    private final Object g;
    private boolean h;
    private boolean i;

    /* renamed from: ax.S0.t$a */
    public interface a<T> {
        void invoke(T t);
    }

    /* renamed from: ax.S0.t$b */
    public interface b<T> {
        void a(T t, ax.P0.r rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.S0.t$c */
    static final class c<T> {
        public final T a;
        private r.b b = new r.b();
        private boolean c;
        private boolean d;

        public c(T t) {
            this.a = t;
        }

        public void a(int i, a<T> aVar) {
            if (this.d) {
                return;
            }
            if (i != -1) {
                this.b.a(i);
            }
            this.c = true;
            aVar.invoke(this.a);
        }

        public void b(b<T> bVar) {
            if (this.d || !this.c) {
                return;
            }
            ax.P0.r e = this.b.e();
            this.b = new r.b();
            this.c = false;
            bVar.a(this.a, e);
        }

        public void c(b<T> bVar) {
            this.d = true;
            if (this.c) {
                this.c = false;
                bVar.a(this.a, this.b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public C0986t(Looper looper, InterfaceC0975h interfaceC0975h, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC0975h, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().b(this.c);
            if (this.b.e(1)) {
                break;
            }
        }
        return true;
    }

    private void l() {
        if (this.i) {
            C0968a.g(Thread.currentThread() == this.b.l().getThread());
        }
    }

    public void c(T t) {
        C0968a.e(t);
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new c<>(t));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0986t<T> d(Looper looper, InterfaceC0975h interfaceC0975h, b<T> bVar) {
        return new C0986t<>(this.d, looper, interfaceC0975h, bVar, this.i);
    }

    public C0986t<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.a, bVar);
    }

    public void f() {
        l();
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.e(1)) {
            InterfaceC0984q interfaceC0984q = this.b;
            interfaceC0984q.b(interfaceC0984q.d(1));
        }
        boolean isEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (isEmpty) {
            while (!this.e.isEmpty()) {
                this.e.peekFirst().run();
                this.e.removeFirst();
            }
        }
    }

    public void h(final int i, final a<T> aVar) {
        l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: ax.S0.s
            @Override // java.lang.Runnable
            public final void run() {
                C0986t.a(copyOnWriteArraySet, i, aVar);
            }
        });
    }

    public void i() {
        l();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().c(this.c);
        }
        this.d.clear();
    }

    public void j(T t) {
        l();
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.a.equals(t)) {
                next.c(this.c);
                this.d.remove(next);
            }
        }
    }

    public void k(int i, a<T> aVar) {
        h(i, aVar);
        f();
    }

    private C0986t(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, InterfaceC0975h interfaceC0975h, b<T> bVar, boolean z) {
        this.a = interfaceC0975h;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.g = new Object();
        this.e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.b = interfaceC0975h.d(looper, new Handler.Callback() { // from class: ax.S0.r
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean g;
                g = C0986t.this.g(message);
                return g;
            }
        });
        this.i = z;
    }
}
