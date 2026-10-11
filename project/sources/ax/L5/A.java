package ax.L5;

/* loaded from: classes3.dex */
final class A implements Runnable {
    final /* synthetic */ C c0;
    final /* synthetic */ ax.i6.l q;

    A(C c, ax.i6.l lVar) {
        this.c0 = c;
        this.q = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C.c2(this.c0, this.q);
    }
}
