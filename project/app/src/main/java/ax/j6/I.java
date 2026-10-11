/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import java.util.concurrent.Executor;

final class I
implements Executor {
    I() {
    }

    @Override
    public final void execute(Runnable runnable2) {
        runnable2.run();
    }
}

