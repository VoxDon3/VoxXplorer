/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import ax.L5.H;
import ax.L5.J;
import ax.L5.e;
import ax.L5.f;
import ax.M5.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
    protected final f a;

    protected LifecycleCallback(f f8) {
        this.a = f8;
    }

    public static f c(Activity activity) {
        return LifecycleCallback.d(new e(activity));
    }

    protected static f d(e e8) {
        if (e8.d()) {
            return J.M2(e8.b());
        }
        if (e8.c()) {
            return H.c(e8.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static f getChimeraLifecycleFragmentImpl(e e8) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
    }

    public Activity b() {
        Activity activity = this.a.z();
        p.l(activity);
        return activity;
    }

    public void e(int n8, int n9, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}

