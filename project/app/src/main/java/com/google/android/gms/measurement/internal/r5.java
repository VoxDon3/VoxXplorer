/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.c2;
import com.google.android.gms.measurement.internal.q5;
import java.util.List;
import java.util.Map;

final class r5
implements c2 {
    private final q5 a;

    r5(q5 q52) {
        this.a = q52;
    }

    @Override
    public final void a(String string, int n8, Throwable throwable, byte[] byArray, Map<String, List<String>> map) {
        this.a.B(string, n8, throwable, byArray, map);
    }
}

