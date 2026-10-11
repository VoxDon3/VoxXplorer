/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.b6.C6;
import com.google.android.gms.measurement.internal.q2;
import java.util.Map;

final class y2
implements C6 {
    private final String a;
    private final q2 b;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    y2(q2 q22, String string) {
        this.a = string;
        this.b = q22;
    }

    @Override
    public final String h(String string) {
        Map map = (Map)q2.E(this.b).get(this.a);
        if (map != null && map.containsKey(string)) {
            return (String)map.get(string);
        }
        return null;
    }
}

