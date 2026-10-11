package ax.j6;

/* loaded from: classes3.dex */
final class C implements Runnable {
    final /* synthetic */ D c0;
    final /* synthetic */ AbstractC2327j q;

    C(D d, AbstractC2327j abstractC2327j) {
        this.c0 = d;
        this.q = abstractC2327j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC2324g interfaceC2324g;
        InterfaceC2324g interfaceC2324g2;
        obj = this.c0.b;
        synchronized (obj) {
            try {
                D d = this.c0;
                interfaceC2324g = d.c;
                if (interfaceC2324g != null) {
                    interfaceC2324g2 = d.c;
                    interfaceC2324g2.a(this.q.j());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
