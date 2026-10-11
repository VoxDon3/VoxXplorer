package ax.Qb;

import ax.Qb.AbstractC0930d0;
import java.util.concurrent.locks.LockSupport;

/* renamed from: ax.Qb.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0932e0 extends AbstractC0928c0 {
    protected abstract Thread l1();

    protected void m1(long j, AbstractC0930d0.a aVar) {
        O.j0.x1(j, aVar);
    }

    protected final void n1() {
        Thread l1 = l1();
        if (Thread.currentThread() != l1) {
            C0927c.a();
            LockSupport.unpark(l1);
        }
    }
}
