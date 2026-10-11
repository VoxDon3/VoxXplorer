/*
 * Decompiled with CFR 0.152.
 */
package ax.ba;

import android.graphics.Bitmap;
import android.os.Handler;
import ax.ba.f;
import ax.ba.g;
import ax.ka.d;

final class i
implements Runnable {
    private final Bitmap c0;
    private final g d0;
    private final Handler e0;
    private final f q;

    public i(f f8, Bitmap bitmap, g g8, Handler handler) {
        this.q = f8;
        this.c0 = bitmap;
        this.d0 = g8;
        this.e0 = handler;
    }

    @Override
    public void run() {
        d.a("PostProcess image before displaying [%s]", this.d0.b);
        this.d0.e.D();
        throw null;
    }
}

