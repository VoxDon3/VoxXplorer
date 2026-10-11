/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.b0;
import java.util.concurrent.ThreadFactory;

public final class a0
implements ThreadFactory {
    public final b0 a;
    public final String b;

    public /* synthetic */ a0(b0 b02, String string) {
        this.a = b02;
        this.b = "Google consent worker";
    }

    @Override
    public final Thread newThread(Runnable runnable2) {
        return b0.a(this.a, this.b, runnable2);
    }
}

