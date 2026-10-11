/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import ax.M5.p;
import ax.f6.j;
import com.google.android.gms.measurement.internal.g2;

public final class k2 {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final g2 e;

    private k2(g2 object, String string, long l8) {
        this.e = object;
        p.f(string);
        boolean bl = l8 > 0L;
        p.a(bl);
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(":start");
        this.a = ((StringBuilder)object).toString();
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(":count");
        this.b = ((StringBuilder)object).toString();
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(":value");
        this.c = ((StringBuilder)object).toString();
        this.d = l8;
    }

    /* synthetic */ k2(g2 g22, String string, long l8, j j8) {
        this(g22, string, l8);
    }

    private final long c() {
        return this.e.J().getLong(this.a, 0L);
    }

    private final void d() {
        this.e.n();
        long l8 = this.e.b().a();
        SharedPreferences.Editor editor = this.e.J().edit();
        editor.remove(this.b);
        editor.remove(this.c);
        editor.putLong(this.a, l8);
        editor.apply();
    }

    public final Pair<String, Long> a() {
        this.e.n();
        this.e.n();
        long l8 = this.c();
        if (l8 == 0L) {
            this.d();
            l8 = 0L;
        } else {
            l8 = Math.abs(l8 - this.e.b().a());
        }
        long l9 = this.d;
        if (l8 < l9) {
            return null;
        }
        if (l8 > l9 << 1) {
            this.d();
            return null;
        }
        String string = this.e.J().getString(this.c, null);
        l8 = this.e.J().getLong(this.b, 0L);
        this.d();
        if (string != null && l8 > 0L) {
            return new Pair((Object)string, (Object)l8);
        }
        return g2.B;
    }

    public final void b(String string, long l8) {
        long l9;
        this.e.n();
        if (this.c() == 0L) {
            this.d();
        }
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        if ((l9 = this.e.J().getLong(this.b, 0L)) <= 0L) {
            string = this.e.J().edit();
            string.putString(this.c, string2);
            string.putLong(this.b, 1L);
            string.apply();
            return;
        }
        l8 = this.e.i().W0().nextLong();
        boolean bl = (l8 & Long.MAX_VALUE) < Long.MAX_VALUE / ++l9;
        string = this.e.J().edit();
        if (bl) {
            string.putString(this.c, string2);
        }
        string.putLong(this.b, l9);
        string.apply();
    }
}

