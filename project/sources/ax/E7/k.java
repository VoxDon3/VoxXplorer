package ax.E7;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class k {

    private enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor) {
        return new l(executor);
    }
}
