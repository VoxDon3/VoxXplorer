/*
 * Decompiled with CFR 0.152.
 */
package ax.j8;

import com.google.firebase.remoteconfig.internal.b;
import java.util.concurrent.Callable;

public final class c
implements Callable {
    public final b a;
    public final com.google.firebase.remoteconfig.internal.c b;

    public /* synthetic */ c(b b8, com.google.firebase.remoteconfig.internal.c c8) {
        this.a = b8;
        this.b = c8;
    }

    public final Object call() {
        return com.google.firebase.remoteconfig.internal.b.b(this.a, this.b);
    }
}

