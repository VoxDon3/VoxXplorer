/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class c {
    private static final Method a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        }
        catch (Throwable throwable) {
            method = null;
        }
        a = method;
    }

    public static final boolean a(Executor executor) {
        Method method;
        block5: {
            block4: {
                try {
                    executor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor)executor : null;
                    if (executor != null) break block4;
                    return false;
                }
                catch (Throwable throwable) {
                    return false;
                }
            }
            method = a;
            if (method != null) break block5;
            return false;
        }
        method.invoke(executor, Boolean.TRUE);
        return true;
    }
}

