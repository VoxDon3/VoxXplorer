/*
 * Decompiled with CFR 0.152.
 */
package ax.la;

import ax.la.e;
import java.util.concurrent.Callable;

public final class d
implements Callable {
    public final String a;

    public /* synthetic */ d(String string) {
        this.a = string;
    }

    public final Object call() {
        return e.a(this.a);
    }
}

