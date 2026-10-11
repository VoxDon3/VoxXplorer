/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.G;
import ax.Qb.X;
import ax.Qb.j0;
import java.util.concurrent.Executor;

public final class k0 {
    public static final G a(Executor executor) {
        Object object = executor instanceof X ? (X)executor : null;
        if (object != null && (object = ((X)object).q) != null) {
            return object;
        }
        return new j0(executor);
    }
}

