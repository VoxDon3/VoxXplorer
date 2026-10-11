/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import ax.M5.p;
import com.google.android.gms.measurement.internal.g2;

public final class j2 {
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private final g2 e;

    public j2(g2 g22, String string, boolean bl) {
        this.e = g22;
        p.f(string);
        this.a = string;
        this.b = bl;
    }

    public final void a(boolean bl) {
        SharedPreferences.Editor editor = this.e.J().edit();
        editor.putBoolean(this.a, bl);
        editor.apply();
        this.d = bl;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.J().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}

