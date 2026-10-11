package ax.j6;

import ax.M5.C0821p;

/* renamed from: ax.j6.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2317A implements Runnable {
    final /* synthetic */ B c0;
    final /* synthetic */ AbstractC2327j q;

    RunnableC2317A(B b, AbstractC2327j abstractC2327j) {
        this.c0 = b;
        this.q = abstractC2327j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC2323f interfaceC2323f;
        InterfaceC2323f interfaceC2323f2;
        obj = this.c0.b;
        synchronized (obj) {
            try {
                B b = this.c0;
                interfaceC2323f = b.c;
                if (interfaceC2323f != null) {
                    interfaceC2323f2 = b.c;
                    interfaceC2323f2.d((Exception) C0821p.l(this.q.i()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
