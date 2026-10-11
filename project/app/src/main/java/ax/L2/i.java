/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import ax.L2.k;
import java.util.concurrent.Callable;

public final class i
implements Callable {
    public final k a;

    public /* synthetic */ i(k k8) {
        this.a = k8;
    }

    public final Object call() {
        return k.b(this.a);
    }
}

