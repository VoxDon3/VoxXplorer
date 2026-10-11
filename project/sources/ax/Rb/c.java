package ax.Rb;

import android.os.Handler;
import android.os.Looper;
import ax.Gb.g;
import ax.Gb.l;
import ax.Qb.T;
import ax.Qb.Y;
import ax.Qb.w0;
import ax.wb.i;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class c extends d implements T {
    private volatile c _immediate;
    private final Handler d0;
    private final String e0;
    private final boolean f0;
    private final c g0;

    private c(Handler handler, String str, boolean z) {
        super(null);
        this.d0 = handler;
        this.e0 = str;
        this.f0 = z;
        this._immediate = z ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.g0 = cVar;
    }

    private final void b1(i iVar, Runnable runnable) {
        w0.c(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Y.b().b(iVar, runnable);
    }

    @Override // ax.Qb.G
    public void b(i iVar, Runnable runnable) {
        if (this.d0.post(runnable)) {
            return;
        }
        b1(iVar, runnable);
    }

    @Override // ax.Qb.D0
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public c Z0() {
        return this.g0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).d0 == this.d0;
    }

    @Override // ax.Qb.G
    public boolean f(i iVar) {
        return (this.f0 && l.a(Looper.myLooper(), this.d0.getLooper())) ? false : true;
    }

    public int hashCode() {
        return System.identityHashCode(this.d0);
    }

    @Override // ax.Qb.D0, ax.Qb.G
    public String toString() {
        String a1 = a1();
        if (a1 != null) {
            return a1;
        }
        String str = this.e0;
        if (str == null) {
            str = this.d0.toString();
        }
        if (!this.f0) {
            return str;
        }
        return str + ".immediate";
    }

    public /* synthetic */ c(Handler handler, String str, int i, g gVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public c(Handler handler, String str) {
        this(handler, str, false);
    }
}
