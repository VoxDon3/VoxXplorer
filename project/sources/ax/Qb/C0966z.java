package ax.Qb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: ax.Qb.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0966z {
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C0966z.class, "_handled");
    private volatile int _handled;
    public final Throwable a;

    public C0966z(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    public final boolean a() {
        return b.get(this) != 0;
    }

    public final boolean b() {
        return b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return N.a(this) + '[' + this.a + ']';
    }

    public /* synthetic */ C0966z(Throwable th, boolean z, int i, ax.Gb.g gVar) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
