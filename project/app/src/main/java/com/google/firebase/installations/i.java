/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import android.text.TextUtils;
import ax.d8.d;
import ax.f8.a;
import ax.f8.b;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class i {
    public static final long b = TimeUnit.HOURS.toSeconds(1L);
    private static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static i d;
    private final a a;

    private i(a a8) {
        this.a = a8;
    }

    public static i c() {
        return i.d(ax.f8.b.b());
    }

    public static i d(a a8) {
        if (d == null) {
            d = new i(a8);
        }
        return d;
    }

    static boolean g(String string) {
        return c.matcher(string).matches();
    }

    static boolean h(String string) {
        return string.contains(":");
    }

    public long a() {
        return this.a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(this.a());
    }

    public long e() {
        return (long)(Math.random() * 1000.0);
    }

    public boolean f(d d8) {
        if (TextUtils.isEmpty((CharSequence)d8.b())) {
            return true;
        }
        return d8.h() + d8.c() < this.b() + b;
    }
}

