/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.Z1;
import com.google.android.gms.measurement.internal.l5;
import com.google.android.gms.measurement.internal.q2;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class s2
implements Callable {
    private q2 a;
    private String b;

    public /* synthetic */ s2(q2 q22, String string) {
        this.a = q22;
        this.b = string;
    }

    public final Object call() {
        Object object = this.a;
        String string = this.b;
        object = ((l5)object).q().H0(string);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("platform", "android");
        hashMap.put("package_name", string);
        hashMap.put("gmp_version", 97001L);
        if (object != null) {
            string = ((Z1)object).o();
            if (string != null) {
                hashMap.put("app_version", string);
            }
            hashMap.put("app_version_int", ((Z1)object).U());
            hashMap.put("dynamite_version", ((Z1)object).v0());
        }
        return hashMap;
    }
}

