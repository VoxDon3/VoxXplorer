/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import java.util.concurrent.Executor;

public class x
implements Executor {
    @Override
    public void execute(Runnable runnable2) {
        runnable2.run();
    }
}

