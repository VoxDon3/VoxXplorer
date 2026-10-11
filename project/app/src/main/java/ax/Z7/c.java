/*
 * Decompiled with CFR 0.152.
 */
package ax.Z7;

import ax.Z7.f;
import java.util.concurrent.Callable;

public final class c
implements Callable {
    public final f a;

    public /* synthetic */ c(f f8) {
        this.a = f8;
    }

    public final Object call() {
        return f.b(this.a);
    }
}

