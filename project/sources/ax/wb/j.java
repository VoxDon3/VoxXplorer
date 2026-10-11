package ax.wb;

import ax.Fb.p;
import ax.Gb.l;
import ax.wb.i;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class j implements i, Serializable {
    public static final j q = new j();

    private j() {
    }

    @Override // ax.wb.i
    public <E extends i.b> E a(i.c<E> cVar) {
        l.f(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // ax.wb.i
    public i m(i.c<?> cVar) {
        l.f(cVar, "key");
        return this;
    }

    @Override // ax.wb.i
    public i p(i iVar) {
        l.f(iVar, "context");
        return iVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // ax.wb.i
    public <R> R v(R r, p<? super R, ? super i.b, ? extends R> pVar) {
        l.f(pVar, "operation");
        return r;
    }
}
