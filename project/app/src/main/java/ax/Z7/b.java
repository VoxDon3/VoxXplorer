/*
 * Decompiled with CFR 0.152.
 */
package ax.Z7;

import ax.Z7.f;
import java.util.concurrent.Callable;

public final class b
implements Callable {
    public final f a;

    public /* synthetic */ b(f f8) {
        this.a = f8;
    }

    public final Object call() {
        return f.e(this.a);
    }
}

