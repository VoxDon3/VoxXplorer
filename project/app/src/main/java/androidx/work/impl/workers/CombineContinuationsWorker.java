/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import ax.Gb.l;

public final class CombineContinuationsWorker
extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        super(context, workerParameters);
    }

    @Override
    public c.a o() {
        c.a a8 = c.a.d(this.g());
        l.e(a8, "success(inputData)");
        return a8;
    }
}

