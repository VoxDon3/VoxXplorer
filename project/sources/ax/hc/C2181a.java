package ax.hc;

import ax.cc.C1857d;
import ax.kc.C2419a;
import java.util.concurrent.ExecutorService;

/* renamed from: ax.hc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2181a extends C2419a implements f {
    private final f b;
    private final ExecutorService c;

    /* renamed from: ax.hc.a$a, reason: collision with other inner class name */
    class RunnableC0325a implements Runnable {
        final /* synthetic */ Object c0;
        final /* synthetic */ C1857d d0;
        final /* synthetic */ Object q;

        RunnableC0325a(Object obj, Object obj2, C1857d c1857d) {
            this.q = obj;
            this.c0 = obj2;
            this.d0 = c1857d;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2181a.this.b.c(this.q, this.c0, this.d0);
        }
    }

    public C2181a(f fVar) {
        super(fVar.b());
        this.b = fVar;
        this.c = (ExecutorService) fVar.b().b().c("bus.handlers.async-executor");
    }

    @Override // ax.hc.f
    public void c(Object obj, Object obj2, C1857d c1857d) {
        this.c.execute(new RunnableC0325a(obj, obj2, c1857d));
    }
}
