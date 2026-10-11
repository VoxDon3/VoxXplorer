package ax.Qb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: ax.Qb.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0956q0 extends u0 {
    private static final AtomicIntegerFieldUpdater g0 = AtomicIntegerFieldUpdater.newUpdater(C0956q0.class, "_invoked");
    private volatile int _invoked;
    private final ax.Fb.l<Throwable, ax.sb.t> f0;

    /* JADX WARN: Multi-variable type inference failed */
    public C0956q0(ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        this.f0 = lVar;
    }

    @Override // ax.Fb.l
    public /* bridge */ /* synthetic */ ax.sb.t invoke(Throwable th) {
        x(th);
        return ax.sb.t.a;
    }

    @Override // ax.Qb.B
    public void x(Throwable th) {
        if (g0.compareAndSet(this, 0, 1)) {
            this.f0.invoke(th);
        }
    }
}
