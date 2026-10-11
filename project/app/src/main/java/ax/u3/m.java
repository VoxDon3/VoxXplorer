/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import ax.X2.Q;
import ax.u3.o;

public class m {
    private final Handler a = new Handler(Looper.getMainLooper());
    private boolean b;
    private Runnable c;
    private boolean d;
    private Runnable e;

    public void d(int n8, int n9, Intent intent) {
        if ((this.c != null || this.b) && Q.z0()) {
            this.g();
        }
        if ((this.e != null || this.d) && Q.J1()) {
            this.h();
        }
    }

    public void e(c object) {
        if (!Q.z0()) {
            return;
        }
        this.c = object = new Runnable(){
            final m c0;
            final c q;
            {
                this.c0 = m8;
                this.q = c8;
            }

            @Override
            public void run() {
                if (!this.c0.b) {
                    return;
                }
                if (o.c()) {
                    this.q.a();
                    this.c0.g();
                    return;
                }
                this.c0.a.postDelayed((Runnable)this, 500L);
            }
        };
        this.a.postDelayed((Runnable)object, 500L);
        this.b = true;
    }

    public void f(Context object, c c8) {
        if (!Q.J1()) {
            return;
        }
        object = new Runnable(){
            final c c0;
            final m d0;
            final Context q;
            {
                this.d0 = m8;
                this.q = context;
                this.c0 = c8;
            }

            @Override
            public void run() {
                if (!this.d0.d) {
                    return;
                }
                if (o.d(this.q)) {
                    this.c0.a();
                    this.d0.h();
                    return;
                }
                this.d0.a.postDelayed((Runnable)this, 500L);
            }
        };
        this.e = object;
        this.a.postDelayed((Runnable)object, 500L);
        this.d = true;
    }

    public void g() {
        Runnable runnable2 = this.c;
        if (runnable2 != null) {
            this.a.removeCallbacks(runnable2);
            this.c = null;
        }
        this.b = false;
    }

    public void h() {
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            this.a.removeCallbacks(runnable2);
            this.e = null;
        }
        this.d = false;
    }

    public static interface c {
        public void a();
    }
}

