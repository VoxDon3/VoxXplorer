/*
 * Decompiled with CFR 0.152.
 */
package ax.ac;

import java.util.concurrent.Executor;

final class a
implements Executor {
    public static final a q = new a();

    private a() {
    }

    @Override
    public void execute(Runnable runnable2) {
        runnable2.run();
    }
}

