/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import ax.M5.p;
import com.google.android.gms.measurement.internal.g2;

public final class m2 {
    private final String a;
    private boolean b;
    private String c;
    private final g2 d;

    public m2(g2 g22, String string, String string2) {
        this.d = g22;
        p.f(string);
        this.a = string;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.J().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String string) {
        SharedPreferences.Editor editor = this.d.J().edit();
        editor.putString(this.a, string);
        editor.apply();
        this.c = string;
    }
}

