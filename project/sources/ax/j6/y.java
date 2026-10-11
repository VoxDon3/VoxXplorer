package ax.j6;

/* loaded from: classes3.dex */
final class y implements Runnable {
    final /* synthetic */ z c0;
    final /* synthetic */ AbstractC2327j q;

    y(z zVar, AbstractC2327j abstractC2327j) {
        this.c0 = zVar;
        this.q = abstractC2327j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC2322e interfaceC2322e;
        InterfaceC2322e interfaceC2322e2;
        obj = this.c0.b;
        synchronized (obj) {
            try {
                z zVar = this.c0;
                interfaceC2322e = zVar.c;
                if (interfaceC2322e != null) {
                    interfaceC2322e2 = zVar.c;
                    interfaceC2322e2.a(this.q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
