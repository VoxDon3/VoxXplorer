/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import ax.J5.A;
import ax.J5.E;
import java.util.concurrent.Callable;

public final class v
implements Callable {
    public final boolean a;
    public final String b;
    public final A c;

    public /* synthetic */ v(boolean bl, String string, A a8) {
        this.a = bl;
        this.b = string;
        this.c = a8;
    }

    public final Object call() {
        return E.c(this.a, this.b, this.c);
    }
}

