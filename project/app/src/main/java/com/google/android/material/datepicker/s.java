/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

class s {
    private static final s c = new s(null, null);
    private final Long a;
    private final TimeZone b;

    private s(Long l8, TimeZone timeZone) {
        this.a = l8;
        this.b = timeZone;
    }

    static s c() {
        return c;
    }

    Calendar a() {
        return this.b(this.b);
    }

    Calendar b(TimeZone cloneable) {
        cloneable = cloneable == null ? Calendar.getInstance() : Calendar.getInstance((TimeZone)cloneable);
        Long l8 = this.a;
        if (l8 != null) {
            ((Calendar)cloneable).setTimeInMillis(l8);
        }
        return cloneable;
    }
}

