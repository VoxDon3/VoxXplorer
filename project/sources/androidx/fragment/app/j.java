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
import ax.b0.C1446g;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class j<E> extends ax.A0.e {
    private final Activity a;
    private final Context b;
    private final Handler c;
    private final int d;
    final FragmentManager e;

    j(f fVar) {
        this(fVar, fVar, new Handler(), 0);
    }

    @Override // ax.A0.e
    public View c(int i) {
        return null;
    }

    @Override // ax.A0.e
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

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.b);
    }

    @Deprecated
    public void k(Fragment fragment, String[] strArr, int i) {
    }

    public boolean l(String str) {
        return false;
    }

    public void m(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ax.Q.b.l(this.b, intent, bundle);
    }

    @Deprecated
    public void n(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        ax.P.b.x(this.a, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void o() {
    }

    j(Activity activity, Context context, Handler handler, int i) {
        this.e = new m();
        this.a = activity;
        this.b = (Context) C1446g.h(context, "context == null");
        this.c = (Handler) C1446g.h(handler, "handler == null");
        this.d = i;
    }
}
