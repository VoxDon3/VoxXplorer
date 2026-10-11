package ax.D2;

import ax.B2.i;
import ax.B2.p;
import ax.K2.v;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    static final String d = i.i("DelayedWorkTracker");
    final b a;
    private final p b;
    private final Map<String, Runnable> c = new HashMap();

    /* renamed from: ax.D2.a$a, reason: collision with other inner class name */
    class RunnableC0067a implements Runnable {
        final /* synthetic */ v q;

        RunnableC0067a(v vVar) {
            this.q = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.e().a(a.d, "Scheduling work " + this.q.a);
            a.this.a.a(this.q);
        }
    }

    public a(b bVar, p pVar) {
        this.a = bVar;
        this.b = pVar;
    }

    public void a(v vVar) {
        Runnable remove = this.c.remove(vVar.a);
        if (remove != null) {
            this.b.b(remove);
        }
        RunnableC0067a runnableC0067a = new RunnableC0067a(vVar);
        this.c.put(vVar.a, runnableC0067a);
        this.b.a(vVar.a() - System.currentTimeMillis(), runnableC0067a);
    }

    public void b(String str) {
        Runnable remove = this.c.remove(str);
        if (remove != null) {
            this.b.b(remove);
        }
    }
}
