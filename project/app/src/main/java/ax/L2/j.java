/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import ax.L2.k;
import java.util.concurrent.Callable;

public final class j
implements Callable {
    public final k a;
    public final int b;
    public final int c;

    public /* synthetic */ j(k k8, int n8, int n9) {
        this.a = k8;
        this.b = n8;
        this.c = n9;
    }

    public final Object call() {
        return k.a(this.a, this.b, this.c);
    }
}

