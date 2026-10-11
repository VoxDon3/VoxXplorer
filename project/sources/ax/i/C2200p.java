package ax.i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ax.i.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2200p {
    private final Executor a;
    private final ax.Fb.a<ax.sb.t> b;
    private final Object c;
    private int d;
    private boolean e;
    private boolean f;
    private final List<ax.Fb.a<ax.sb.t>> g;
    private final Runnable h;

    public C2200p(Executor executor, ax.Fb.a<ax.sb.t> aVar) {
        ax.Gb.l.f(executor, "executor");
        ax.Gb.l.f(aVar, "reportFullyDrawn");
        this.a = executor;
        this.b = aVar;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = new Runnable() { // from class: ax.i.o
            @Override // java.lang.Runnable
            public final void run() {
                C2200p.d(C2200p.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C2200p c2200p) {
        ax.Gb.l.f(c2200p, "this$0");
        synchronized (c2200p.c) {
            try {
                c2200p.e = false;
                if (c2200p.d == 0 && !c2200p.f) {
                    c2200p.b.invoke();
                    c2200p.b();
                }
                ax.sb.t tVar = ax.sb.t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                this.f = true;
                Iterator<T> it = this.g.iterator();
                while (it.hasNext()) {
                    ((ax.Fb.a) it.next()).invoke();
                }
                this.g.clear();
                ax.sb.t tVar = ax.sb.t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.c) {
            z = this.f;
        }
        return z;
    }
}
