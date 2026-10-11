/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

public final class i
extends RuntimeException {
    private final transient ax.wb.i q;

    public i(ax.wb.i i8) {
        this.q = i8;
    }

    @Override
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public String getLocalizedMessage() {
        return this.q.toString();
    }
}

