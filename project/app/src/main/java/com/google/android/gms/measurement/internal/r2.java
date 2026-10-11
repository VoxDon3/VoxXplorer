/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.b6.A5;
import com.google.android.gms.measurement.internal.q2;
import com.google.android.gms.measurement.internal.y2;
import java.util.concurrent.Callable;

public final class r2
implements Callable {
    private q2 a;
    private String b;

    public /* synthetic */ r2(q2 q22, String string) {
        this.a = q22;
        this.b = string;
    }

    public final Object call() {
        return new A5("internal.remoteConfig", new y2(this.a, this.b));
    }
}

