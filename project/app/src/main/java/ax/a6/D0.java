/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.T;
import ax.a6.j0;
import java.util.concurrent.Executor;

public final class D0 {
    private final Executor a;

    D0(Executor executor) {
        this.a = executor;
    }

    public final void a(String object, String string, j0 ... j0Array) {
        object = new T((String)object, string, j0Array);
        this.a.execute((Runnable)object);
    }
}

