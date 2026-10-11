/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import android.annotation.SuppressLint;
import ax.p5.n;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

abstract class j {
    @SuppressLint(value={"ThreadPoolCreation"})
    static Executor a() {
        return new n(Executors.newSingleThreadExecutor());
    }
}

