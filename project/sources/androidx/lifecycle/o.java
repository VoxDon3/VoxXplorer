package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.d;

/* loaded from: classes.dex */
public class o {
    private final g a;
    private final Handler b;
    private a c;

    public static final class a implements Runnable {
        private final d.a c0;
        private boolean d0;
        private final g q;

        public a(g gVar, d.a aVar) {
            ax.Gb.l.f(gVar, "registry");
            ax.Gb.l.f(aVar, "event");
            this.q = gVar;
            this.c0 = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d0) {
                return;
            }
            this.q.h(this.c0);
            this.d0 = true;
        }
    }

    public o(ax.G0.h hVar) {
        ax.Gb.l.f(hVar, "provider");
        this.a = new g(hVar);
        this.b = new Handler();
    }

    private final void f(d.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.c = aVar3;
        Handler handler = this.b;
        ax.Gb.l.c(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public d a() {
        return this.a;
    }

    public void b() {
        f(d.a.ON_START);
    }

    public void c() {
        f(d.a.ON_CREATE);
    }

    public void d() {
        f(d.a.ON_STOP);
        f(d.a.ON_DESTROY);
    }

    public void e() {
        f(d.a.ON_START);
    }
}
