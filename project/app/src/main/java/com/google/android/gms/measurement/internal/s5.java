/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.c2;
import com.google.android.gms.measurement.internal.q5;
import java.util.List;
import java.util.Map;

final class s5
implements c2 {
    private final String a;
    private final q5 b;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    s5(q5 q52, String string) {
        this.a = string;
        this.b = q52;
    }

    @Override
    public final void a(String string, int n8, Throwable throwable, byte[] byArray, Map<String, List<String>> map) {
        this.b.K(true, n8, throwable, byArray, this.a);
    }
}

