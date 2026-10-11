package com.google.firebase.installations;

import android.text.TextUtils;
import ax.f8.C2084b;
import ax.f8.InterfaceC2083a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class i {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    private static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static i d;
    private final InterfaceC2083a a;

    private i(InterfaceC2083a interfaceC2083a) {
        this.a = interfaceC2083a;
    }

    public static i c() {
        return d(C2084b.b());
    }

    public static i d(InterfaceC2083a interfaceC2083a) {
        if (d == null) {
            d = new i(interfaceC2083a);
        }
        return d;
    }

    static boolean g(String str) {
        return c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(ax.d8.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + b;
    }
}
