/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C;
import com.google.android.gms.measurement.internal.D;

public final class a2 {
    public String a;
    private String b;
    private long c;
    public Bundle d;

    private a2(String string, String string2, Bundle bundle, long l8) {
        this.a = string;
        this.b = string2;
        string = bundle;
        if (bundle == null) {
            string = new Bundle();
        }
        this.d = string;
        this.c = l8;
    }

    public static a2 b(D d8) {
        return new a2(d8.q, d8.d0, d8.c0.B(), d8.e0);
    }

    public final D a() {
        return new D(this.a, new C(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        String string = this.b;
        String string2 = this.a;
        String string3 = String.valueOf(this.d);
        StringBuilder stringBuilder = new StringBuilder("origin=");
        stringBuilder.append(string);
        stringBuilder.append(",name=");
        stringBuilder.append(string2);
        stringBuilder.append(",params=");
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }
}

