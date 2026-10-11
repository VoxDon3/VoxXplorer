/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.M5.p;

final class y {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    y(String string, String string2, long l8, long l9, long l10, long l11, long l12, Long l13, Long l14, Long l15, Boolean bl) {
        p.f(string);
        p.f(string2);
        boolean bl2 = false;
        boolean bl3 = l8 >= 0L;
        p.a(bl3);
        bl3 = l9 >= 0L;
        p.a(bl3);
        bl3 = l10 >= 0L;
        p.a(bl3);
        bl3 = bl2;
        if (l12 >= 0L) {
            bl3 = true;
        }
        p.a(bl3);
        this.a = string;
        this.b = string2;
        this.c = l8;
        this.d = l9;
        this.e = l10;
        this.f = l11;
        this.g = l12;
        this.h = l13;
        this.i = l14;
        this.j = l15;
        this.k = bl;
    }

    y(String string, String string2, long l8, long l9, long l10, long l11, Long l12, Long l13, Long l14, Boolean bl) {
        this(string, string2, 0L, 0L, 0L, l10, 0L, null, null, null, null);
    }

    final y a(long l8) {
        return new y(this.a, this.b, this.c, this.d, this.e, l8, this.g, this.h, this.i, this.j, this.k);
    }

    final y b(long l8, long l9) {
        return new y(this.a, this.b, this.c, this.d, this.e, this.f, l8, l9, this.i, this.j, this.k);
    }

    final y c(Long l8, Long l9, Boolean bl) {
        if (bl != null && !bl.booleanValue()) {
            bl = null;
        }
        return new y(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l8, l9, bl);
    }
}

