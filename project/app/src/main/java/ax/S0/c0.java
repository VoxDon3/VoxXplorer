/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import ax.S0.d0;
import java.util.concurrent.ThreadFactory;

public final class c0
implements ThreadFactory {
    public final String a;

    public /* synthetic */ c0(String string) {
        this.a = string;
    }

    @Override
    public final Thread newThread(Runnable runnable2) {
        return d0.a(this.a, runnable2);
    }
}

