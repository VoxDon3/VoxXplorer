/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import androidx.fragment.app.m;
import ax.A0.e;
import ax.Q.b;
import ax.b0.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class j<E>
extends e {
    private final Activity a;
    private final Context b;
    private final Handler c;
    private final int d;
    final FragmentManager e = new m();

    j(Activity activity, Context context, Handler handler, int n8) {
        this.a = activity;
        this.b = g.h(context, "context == null");
        this.c = g.h(handler, "handler == null");
        this.d = n8;
    }

    j(f f8) {
        this(f8, (Context)f8, new Handler(), 0);
    }

    @Override
    public View c(int n8) {
        return null;
    }

    @Override
    public boolean d() {
        return true;
    }

    Activity e() {
        return this.a;
    }

    Context f() {
        return this.b;
    }

    public Handler g() {
        return this.c;
    }

    public void h(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from((Context)this.b);
    }

    @Deprecated
    public void k(Fragment fragment, String[] stringArray, int n8) {
    }

    public boolean l(String string) {
        return false;
    }

    public void m(Fragment fragment, @SuppressLint(value={"UnknownNullness"}) Intent intent, int n8, Bundle bundle) {
        if (n8 == -1) {
            ax.Q.b.l(this.b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void n(Fragment fragment, @SuppressLint(value={"UnknownNullness"}) IntentSender intentSender, int n8, Intent intent, int n9, int n10, int n11, Bundle bundle) throws IntentSender.SendIntentException {
        if (n8 == -1) {
            ax.P.b.x(this.a, intentSender, n8, intent, n9, n10, n11, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void o() {
    }
}

