/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.j;

public final class c
extends IllegalStateException {
    private c(String string, Throwable throwable) {
        super(string, throwable);
    }

    public static IllegalStateException a(j<?> object) {
        if (!((j)object).l()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = ((j)object).i();
        object = exception != null ? "failure" : (((j)object).m() ? "result ".concat(String.valueOf(((j)object).j())) : (((j)object).k() ? "cancellation" : "unknown issue"));
        return new c("Complete with: ".concat((String)object), exception);
    }
}

