/*
 * Decompiled with CFR 0.152.
 */
package ax.K7;

import ax.K7.m;
import java.util.List;
import java.util.concurrent.Callable;

public final class k
implements Callable {
    public final m a;
    public final List b;

    public /* synthetic */ k(m m8, List list) {
        this.a = m8;
        this.b = list;
    }

    public final Object call() {
        return m.a(this.a, this.b);
    }
}

