package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import ax.L5.C0793e;
import ax.L5.H;
import ax.L5.InterfaceC0794f;
import ax.L5.J;
import ax.M5.C0821p;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public class LifecycleCallback {
    protected final InterfaceC0794f a;

    protected LifecycleCallback(InterfaceC0794f interfaceC0794f) {
        this.a = interfaceC0794f;
    }

    public static InterfaceC0794f c(Activity activity) {
        return d(new C0793e(activity));
    }

    protected static InterfaceC0794f d(C0793e c0793e) {
        if (c0793e.d()) {
            return J.M2(c0793e.b());
        }
        if (c0793e.c()) {
            return H.c(c0793e.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC0794f getChimeraLifecycleFragmentImpl(C0793e c0793e) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity z = this.a.z();
        C0821p.l(z);
        return z;
    }

    public void e(int i, int i2, Intent intent) {
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
