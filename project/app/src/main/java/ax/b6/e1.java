/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class e1
implements ThreadFactory {
    private ThreadFactory a = Executors.defaultThreadFactory();

    e1(W0 w02) {
    }

    @Override
    public final Thread newThread(Runnable runnable2) {
        runnable2 = this.a.newThread(runnable2);
        ((Thread)runnable2).setName("ScionFrontendApi");
        return runnable2;
    }
}

