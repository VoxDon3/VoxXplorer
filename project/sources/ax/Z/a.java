package ax.Z;

import android.graphics.Typeface;
import android.os.Handler;
import ax.Z.j;
import ax.Z.k;

/* loaded from: classes.dex */
class a {
    private final k.c a;
    private final Handler b;

    /* renamed from: ax.Z.a$a, reason: collision with other inner class name */
    class RunnableC0228a implements Runnable {
        final /* synthetic */ Typeface c0;
        final /* synthetic */ k.c q;

        RunnableC0228a(k.c cVar, Typeface typeface) {
            this.q = cVar;
            this.c0 = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.b(this.c0);
        }
    }

    class b implements Runnable {
        final /* synthetic */ int c0;
        final /* synthetic */ k.c q;

        b(k.c cVar, int i) {
            this.q = cVar;
            this.c0 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.a(this.c0);
        }
    }

    a(k.c cVar, Handler handler) {
        this.a = cVar;
        this.b = handler;
    }

    private void a(int i) {
        this.b.post(new b(this.a, i));
    }

    private void c(Typeface typeface) {
        this.b.post(new RunnableC0228a(this.a, typeface));
    }

    void b(j.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }
}
