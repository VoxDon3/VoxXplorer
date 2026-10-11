/*
 * Decompiled with CFR 0.152.
 */
package ax.ba;

import android.graphics.Bitmap;
import ax.ba.f;
import ax.ba.g;
import ax.ha.a;
import ax.ka.d;

final class b
implements Runnable {
    private final String c0;
    private final a d0;
    private final String e0;
    private final ax.fa.a f0;
    private final ax.ia.a g0;
    private final f h0;
    private final ax.ca.f i0;
    private final Bitmap q;

    public b(Bitmap bitmap, g g8, f f8, ax.ca.f f9) {
        this.q = bitmap;
        this.c0 = g8.a;
        this.d0 = g8.c;
        this.e0 = g8.b;
        this.f0 = g8.e.w();
        this.g0 = g8.f;
        this.h0 = f8;
        this.i0 = f9;
    }

    private boolean a() {
        String string = this.h0.h(this.d0);
        return this.e0.equals(string) ^ true;
    }

    @Override
    public void run() {
        if (this.d0.j()) {
            d.a("ImageAware was collected by GC. Task is cancelled. [%s]", this.e0);
            this.g0.d(this.c0, this.d0.h());
            return;
        }
        if (this.a()) {
            d.a("ImageAware is reused for another image. Task is cancelled. [%s]", this.e0);
            this.g0.d(this.c0, this.d0.h());
            return;
        }
        d.a("Display image in ImageAware (loaded from %1$s) [%2$s]", new Object[]{this.i0, this.e0});
        this.f0.a(this.q, this.d0, this.i0);
        this.h0.e(this.d0);
        this.g0.c(this.c0, this.d0.h(), this.q);
    }
}

