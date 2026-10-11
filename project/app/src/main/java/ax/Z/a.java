/*
 * Decompiled with CFR 0.152.
 */
package ax.Z;

import android.graphics.Typeface;
import android.os.Handler;
import ax.Z.j;
import ax.Z.k;

class a {
    private final k.c a;
    private final Handler b;

    a(k.c c8, Handler handler) {
        this.a = c8;
        this.b = handler;
    }

    private void a(int n8) {
        k.c c8 = this.a;
        this.b.post(new Runnable(){
            final int c0;
            final a d0;
            final k.c q;
            {
                this.d0 = a8;
                this.q = c8;
                this.c0 = n8;
            }

            @Override
            public void run() {
                this.q.a(this.c0);
            }
        });
    }

    private void c(Typeface typeface) {
        k.c c8 = this.a;
        this.b.post(new Runnable(){
            final Typeface c0;
            final a d0;
            final k.c q;
            {
                this.d0 = a8;
                this.q = c8;
                this.c0 = typeface;
            }

            @Override
            public void run() {
                this.q.b(this.c0);
            }
        });
    }

    void b(j.e e8) {
        if (e8.a()) {
            this.c(e8.a);
            return;
        }
        this.a(e8.b);
    }
}

