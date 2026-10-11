package ax.ba;

import android.graphics.Bitmap;
import ax.fa.InterfaceC2087a;
import ax.ha.InterfaceC2175a;
import ax.ia.InterfaceC2293a;

/* renamed from: ax.ba.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC1727b implements Runnable {
    private final String c0;
    private final InterfaceC2175a d0;
    private final String e0;
    private final InterfaceC2087a f0;
    private final InterfaceC2293a g0;
    private final f h0;
    private final ax.ca.f i0;
    private final Bitmap q;

    public RunnableC1727b(Bitmap bitmap, g gVar, f fVar, ax.ca.f fVar2) {
        this.q = bitmap;
        this.c0 = gVar.a;
        this.d0 = gVar.c;
        this.e0 = gVar.b;
        this.f0 = gVar.e.w();
        this.g0 = gVar.f;
        this.h0 = fVar;
        this.i0 = fVar2;
    }

    private boolean a() {
        return !this.e0.equals(this.h0.h(this.d0));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.d0.j()) {
            ax.ka.d.a("ImageAware was collected by GC. Task is cancelled. [%s]", this.e0);
            this.g0.d(this.c0, this.d0.h());
        } else if (a()) {
            ax.ka.d.a("ImageAware is reused for another image. Task is cancelled. [%s]", this.e0);
            this.g0.d(this.c0, this.d0.h());
        } else {
            ax.ka.d.a("Display image in ImageAware (loaded from %1$s) [%2$s]", this.i0, this.e0);
            this.f0.a(this.q, this.d0, this.i0);
            this.h0.e(this.d0);
            this.g0.c(this.c0, this.d0.h(), this.q);
        }
    }
}
