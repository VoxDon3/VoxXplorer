package ax.Qb;

import java.util.concurrent.locks.LockSupport;

/* renamed from: ax.Qb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0931e<T> extends AbstractC0923a<T> {
    private final Thread e0;
    private final AbstractC0928c0 f0;

    public C0931e(ax.wb.i iVar, Thread thread, AbstractC0928c0 abstractC0928c0) {
        super(iVar, true, true);
        this.e0 = thread;
        this.f0 = abstractC0928c0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T O0() {
        C0927c.a();
        try {
            AbstractC0928c0 abstractC0928c0 = this.f0;
            if (abstractC0928c0 != null) {
                AbstractC0928c0.f1(abstractC0928c0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC0928c0 abstractC0928c02 = this.f0;
                    long i1 = abstractC0928c02 != null ? abstractC0928c02.i1() : Long.MAX_VALUE;
                    if (a0()) {
                        AbstractC0928c0 abstractC0928c03 = this.f0;
                        if (abstractC0928c03 != null) {
                            AbstractC0928c0.a1(abstractC0928c03, false, 1, null);
                        }
                        C0927c.a();
                        T t = (T) A0.h(W());
                        C0966z c0966z = t instanceof C0966z ? (C0966z) t : null;
                        if (c0966z == null) {
                            return t;
                        }
                        throw c0966z.a;
                    }
                    C0927c.a();
                    LockSupport.parkNanos(this, i1);
                } catch (Throwable th) {
                    AbstractC0928c0 abstractC0928c04 = this.f0;
                    if (abstractC0928c04 != null) {
                        AbstractC0928c0.a1(abstractC0928c04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            z(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            C0927c.a();
            throw th2;
        }
    }

    @Override // ax.Qb.z0
    protected boolean b0() {
        return true;
    }

    @Override // ax.Qb.z0
    protected void w(Object obj) {
        if (ax.Gb.l.a(Thread.currentThread(), this.e0)) {
            return;
        }
        Thread thread = this.e0;
        C0927c.a();
        LockSupport.unpark(thread);
    }
}
