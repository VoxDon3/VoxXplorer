/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import ax.f6.o;
import com.google.android.gms.measurement.internal.h3;

final class h2 {
    private final o a;

    h2(o o8) {
        this.a = o8;
    }

    static h2 b(String object) {
        object = !TextUtils.isEmpty((CharSequence)object) && object.length() <= 1 ? h3.c(object.charAt(0)) : o.c0;
        return new h2((o)((Object)object));
    }

    final o a() {
        return this.a;
    }

    final String c() {
        return String.valueOf(h3.a(this.a));
    }
}

