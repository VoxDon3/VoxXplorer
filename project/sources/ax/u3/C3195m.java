package ax.u3;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import ax.X2.Q;

/* renamed from: ax.u3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3195m {
    private final Handler a = new Handler(Looper.getMainLooper());
    private boolean b;
    private Runnable c;
    private boolean d;
    private Runnable e;

    /* renamed from: ax.u3.m$a */
    class a implements Runnable {
        final /* synthetic */ c q;

        a(c cVar) {
            this.q = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3195m.this.b) {
                if (!C3197o.c()) {
                    C3195m.this.a.postDelayed(this, 500L);
                } else {
                    this.q.a();
                    C3195m.this.g();
                }
            }
        }
    }

    /* renamed from: ax.u3.m$b */
    class b implements Runnable {
        final /* synthetic */ c c0;
        final /* synthetic */ Context q;

        b(Context context, c cVar) {
            this.q = context;
            this.c0 = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3195m.this.d) {
                if (!C3197o.d(this.q)) {
                    C3195m.this.a.postDelayed(this, 500L);
                } else {
                    this.c0.a();
                    C3195m.this.h();
                }
            }
        }
    }

    /* renamed from: ax.u3.m$c */
    public interface c {
        void a();
    }

    public void d(int i, int i2, Intent intent) {
        if ((this.c != null || this.b) && Q.z0()) {
            g();
        }
        if ((this.e != null || this.d) && Q.J1()) {
            h();
        }
    }

    public void e(c cVar) {
        if (Q.z0()) {
            a aVar = new a(cVar);
            this.c = aVar;
            this.a.postDelayed(aVar, 500L);
            this.b = true;
        }
    }

    public void f(Context context, c cVar) {
        if (Q.J1()) {
            b bVar = new b(context, cVar);
            this.e = bVar;
            this.a.postDelayed(bVar, 500L);
            this.d = true;
        }
    }

    public void g() {
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
            this.c = null;
        }
        this.b = false;
    }

    public void h() {
        Runnable runnable = this.e;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
            this.e = null;
        }
        this.d = false;
    }
}
