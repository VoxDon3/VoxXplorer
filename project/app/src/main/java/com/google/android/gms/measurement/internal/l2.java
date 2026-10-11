/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import ax.M5.p;
import com.google.android.gms.measurement.internal.g2;

public final class l2 {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    private final g2 e;

    public l2(g2 g22, String string, long l8) {
        this.e = g22;
        p.f(string);
        this.a = string;
        this.b = l8;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.J().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long l8) {
        SharedPreferences.Editor editor = this.e.J().edit();
        editor.putLong(this.a, l8);
        editor.apply();
        this.d = l8;
    }
}

