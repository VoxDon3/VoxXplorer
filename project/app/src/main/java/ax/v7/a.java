/*
 * Decompiled with CFR 0.152.
 */
package ax.v7;

import java.util.concurrent.Executor;

final class a
extends Enum<a>
implements Executor {
    private static final a[] c0;
    public static final /* enum */ a q;

    static {
        q = new a();
        c0 = a.h();
    }

    private static /* synthetic */ a[] h() {
        return new a[]{q};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])c0.clone();
    }

    @Override
    public void execute(Runnable runnable2) {
        runnable2.run();
    }

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}

