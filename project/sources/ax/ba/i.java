package ax.ba;

import android.graphics.Bitmap;
import android.os.Handler;

/* loaded from: classes3.dex */
final class i implements Runnable {
    private final Bitmap c0;
    private final g d0;
    private final Handler e0;
    private final f q;

    public i(f fVar, Bitmap bitmap, g gVar, Handler handler) {
        this.q = fVar;
        this.c0 = bitmap;
        this.d0 = gVar;
        this.e0 = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        ax.ka.d.a("PostProcess image before displaying [%s]", this.d0.b);
        this.d0.e.D();
        throw null;
    }
}
