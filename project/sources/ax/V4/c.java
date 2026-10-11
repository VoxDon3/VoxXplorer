package ax.V4;

import ax.T4.j;
import ax.T4.k;

/* loaded from: classes.dex */
public abstract class c extends k {
    protected transient j c0;

    protected c(j jVar, String str) {
        super(str, jVar == null ? null : jVar.f());
        this.c0 = jVar;
    }

    @Override // ax.T4.k, java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    protected c(j jVar, String str, Throwable th) {
        super(str, jVar == null ? null : jVar.f(), th);
        this.c0 = jVar;
    }
}
