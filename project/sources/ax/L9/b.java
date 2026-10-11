package ax.L9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes3.dex */
public class b implements d {
    private final ThreadPoolExecutor a = (ThreadPoolExecutor) Executors.newCachedThreadPool();
    private final g b = new g();
    private final ax.Q9.b c;

    class a implements Runnable {
        final /* synthetic */ Object c0;
        final /* synthetic */ ax.L9.c q;

        a(ax.L9.c cVar, Object obj) {
            this.q = cVar;
            this.c0 = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.c(this.c0);
        }
    }

    /* renamed from: ax.L9.b$b, reason: collision with other inner class name */
    class RunnableC0142b implements Runnable {
        final /* synthetic */ int c0;
        final /* synthetic */ int d0;
        final /* synthetic */ e q;

        RunnableC0142b(e eVar, int i, int i2) {
            this.q = eVar;
            this.c0 = i;
            this.d0 = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.a(this.c0, this.d0);
        }
    }

    class c implements Runnable {
        final /* synthetic */ ax.M9.d c0;
        final /* synthetic */ ax.L9.c q;

        c(ax.L9.c cVar, ax.M9.d dVar) {
            this.q = cVar;
            this.c0 = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.b(this.c0);
        }
    }

    public b(ax.Q9.b bVar) {
        this.c = bVar;
    }

    @Override // ax.L9.d
    public <Result> void a(Result result, ax.L9.c<Result> cVar) {
        this.c.a("Starting foreground task, current active count:" + this.b.b() + ", with result " + result);
        this.b.execute(new a(cVar, result));
    }

    @Override // ax.L9.d
    public void b(Runnable runnable) {
        this.c.a("Starting background task, current active count: " + this.a.getActiveCount());
        this.a.execute(runnable);
    }

    @Override // ax.L9.d
    public <Result> void c(ax.M9.d dVar, ax.L9.c<Result> cVar) {
        this.c.a("Starting foreground task, current active count:" + this.b.b() + ", with exception " + dVar);
        this.b.execute(new c(cVar, dVar));
    }

    @Override // ax.L9.d
    public <Result> void d(int i, int i2, e<Result> eVar) {
        this.c.a("Starting foreground task, current active count:" + this.b.b() + ", with progress  " + i + ", max progress" + i2);
        this.b.execute(new RunnableC0142b(eVar, i, i2));
    }
}
