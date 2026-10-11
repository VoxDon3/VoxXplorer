/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A4;
import ax.b6.C;
import java.util.concurrent.Callable;

public final class F0
implements Callable {
    private C a;

    public /* synthetic */ F0(C c8) {
        this.a = c8;
    }

    public final Object call() {
        return new A4(this.a.c);
    }
}

