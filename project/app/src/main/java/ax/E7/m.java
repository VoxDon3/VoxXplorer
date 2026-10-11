/*
 * Decompiled with CFR 0.152.
 */
package ax.E7;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class m
extends Enum<m>
implements Executor {
    @SuppressLint(value={"ThreadPoolCreation"})
    private static final Handler c0;
    private static final m[] d0;
    public static final /* enum */ m q;

    static {
        q = new m();
        d0 = m.h();
        c0 = new Handler(Looper.getMainLooper());
    }

    private static /* synthetic */ m[] h() {
        return new m[]{q};
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static m[] values() {
        return (m[])d0.clone();
    }

    @Override
    public void execute(Runnable runnable2) {
        c0.post(runnable2);
    }
}

