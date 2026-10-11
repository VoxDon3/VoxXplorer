/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import java.util.concurrent.CancellationException;

public final class h0 {
    public static final CancellationException a(String object, Throwable throwable) {
        object = new CancellationException((String)object);
        ((Throwable)object).initCause(throwable);
        return object;
    }
}

