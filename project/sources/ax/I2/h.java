package ax.I2;

import android.content.Context;
import ax.sb.t;
import ax.tb.C3139o;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h<T> {
    private final ax.N2.c a;
    private final Context b;
    private final Object c;
    private final LinkedHashSet<ax.G2.a<T>> d;
    private T e;

    protected h(Context context, ax.N2.c cVar) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(cVar, "taskExecutor");
        this.a = cVar;
        Context applicationContext = context.getApplicationContext();
        ax.Gb.l.e(applicationContext, "context.applicationContext");
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List list, h hVar) {
        ax.Gb.l.f(list, "$listenersList");
        ax.Gb.l.f(hVar, "this$0");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ax.G2.a) it.next()).a(hVar.e);
        }
    }

    public final void c(ax.G2.a<T> aVar) {
        String str;
        ax.Gb.l.f(aVar, "listener");
        synchronized (this.c) {
            try {
                if (this.d.add(aVar)) {
                    if (this.d.size() == 1) {
                        this.e = e();
                        ax.B2.i e = ax.B2.i.e();
                        str = i.a;
                        e.a(str, getClass().getSimpleName() + ": initial state = " + this.e);
                        h();
                    }
                    aVar.a(this.e);
                }
                t tVar = t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final Context d() {
        return this.b;
    }

    public abstract T e();

    public final void f(ax.G2.a<T> aVar) {
        ax.Gb.l.f(aVar, "listener");
        synchronized (this.c) {
            try {
                if (this.d.remove(aVar) && this.d.isEmpty()) {
                    i();
                }
                t tVar = t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(T t) {
        synchronized (this.c) {
            T t2 = this.e;
            if (t2 == null || !ax.Gb.l.a(t2, t)) {
                this.e = t;
                final List V = C3139o.V(this.d);
                this.a.a().execute(new Runnable() { // from class: ax.I2.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(V, this);
                    }
                });
                t tVar = t.a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
