package ax.j6;

/* loaded from: classes3.dex */
final class s implements Runnable {
    final /* synthetic */ t c0;
    final /* synthetic */ AbstractC2327j q;

    s(t tVar, AbstractC2327j abstractC2327j) {
        this.c0 = tVar;
        this.q = abstractC2327j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K k;
        K k2;
        K k3;
        InterfaceC2319b interfaceC2319b;
        K k4;
        K k5;
        if (this.q.k()) {
            k5 = this.c0.c;
            k5.r();
            return;
        }
        try {
            interfaceC2319b = this.c0.b;
            Object a = interfaceC2319b.a(this.q);
            k4 = this.c0.c;
            k4.q(a);
        } catch (C2325h e) {
            if (e.getCause() instanceof Exception) {
                k3 = this.c0.c;
                k3.p((Exception) e.getCause());
            } else {
                k2 = this.c0.c;
                k2.p(e);
            }
        } catch (Exception e2) {
            k = this.c0.c;
            k.p(e2);
        }
    }
}
