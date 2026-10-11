/*
 * Decompiled with CFR 0.152.
 */
package ax.M2;

import java.util.concurrent.Executor;

final class b
extends Enum<b>
implements Executor {
    private static final b[] c0;
    public static final /* enum */ b q;

    static {
        q = new b();
        c0 = b.h();
    }

    private static /* synthetic */ b[] h() {
        return new b[]{q};
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])c0.clone();
    }

    @Override
    public void execute(Runnable runnable2) {
        runnable2.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}

