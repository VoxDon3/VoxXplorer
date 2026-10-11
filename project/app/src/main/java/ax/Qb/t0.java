/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Gb.l;
import ax.Qb.s0;
import java.util.concurrent.CancellationException;

public final class t0
extends CancellationException {
    public final transient s0 q;

    public t0(String string, Throwable throwable, s0 s02) {
        super(string);
        this.q = s02;
        if (throwable != null) {
            this.initCause(throwable);
        }
    }

    public boolean equals(Object object) {
        return object == this || object instanceof t0 && l.a(((Throwable)(object = (t0)object)).getMessage(), this.getMessage()) && l.a(((t0)object).q, this.q) && l.a(((Throwable)object).getCause(), this.getCause());
        {
        }
    }

    @Override
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        Object object = this.getMessage();
        l.c(object);
        int n8 = ((String)object).hashCode();
        int n9 = this.q.hashCode();
        object = this.getCause();
        int n10 = object != null ? object.hashCode() : 0;
        return (n8 * 31 + n9) * 31 + n10;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("; job=");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }
}

