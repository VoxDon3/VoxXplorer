package ax.j6;

/* loaded from: classes3.dex */
final class w implements Runnable {
    final /* synthetic */ x q;

    w(x xVar) {
        this.q = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC2321d interfaceC2321d;
        InterfaceC2321d interfaceC2321d2;
        obj = this.q.b;
        synchronized (obj) {
            try {
                x xVar = this.q;
                interfaceC2321d = xVar.c;
                if (interfaceC2321d != null) {
                    interfaceC2321d2 = xVar.c;
                    interfaceC2321d2.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
