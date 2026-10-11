package ax.Xb;

import ax.Qb.N;

/* loaded from: classes3.dex */
public final class k extends h {
    public final Runnable d0;

    public k(Runnable runnable, long j, i iVar) {
        super(j, iVar);
        this.d0 = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.d0.run();
        } finally {
            this.c0.a();
        }
    }

    public String toString() {
        return "Task[" + N.a(this.d0) + '@' + N.b(this.d0) + ", " + this.q + ", " + this.c0 + ']';
    }
}
