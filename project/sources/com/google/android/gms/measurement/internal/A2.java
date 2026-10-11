package com.google.android.gms.measurement.internal;

import ax.M5.C0821p;
import java.lang.Thread;

/* loaded from: classes3.dex */
final class A2 implements Thread.UncaughtExceptionHandler {
    private final String a;
    private final /* synthetic */ C3779z2 b;

    public A2(C3779z2 c3779z2, String str) {
        this.b = c3779z2;
        C0821p.l(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.k().G().b(this.a, th);
    }
}
