package ax.Qb;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class t0 extends CancellationException {
    public final transient InterfaceC0959s0 q;

    public t0(String str, Throwable th, InterfaceC0959s0 interfaceC0959s0) {
        super(str);
        this.q = interfaceC0959s0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return ax.Gb.l.a(t0Var.getMessage(), getMessage()) && ax.Gb.l.a(t0Var.q, this.q) && ax.Gb.l.a(t0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        ax.Gb.l.c(message);
        int hashCode = ((message.hashCode() * 31) + this.q.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.q;
    }
}
