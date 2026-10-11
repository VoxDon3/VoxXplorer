/*
 * Decompiled with CFR 0.152.
 */
package ax.i;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.savedstate.a;
import ax.G0.h;
import ax.G0.w;
import ax.i.l;
import ax.i.m;
import ax.i.u;
import ax.i.x;
import ax.n2.c;
import ax.n2.e;

public class n
extends Dialog
implements h,
u,
ax.n2.d {
    private g a;
    private final c b;
    private final OnBackPressedDispatcher c;

    public n(Context context, int n8) {
        ax.Gb.l.f(context, "context");
        super(context, n8);
        this.b = ax.n2.c.d.a(this);
        this.c = new OnBackPressedDispatcher(new m(this));
    }

    public static /* synthetic */ void a(n n8) {
        n.d(n8);
    }

    private final g b() {
        g g8;
        g g9 = g8 = this.a;
        if (g8 == null) {
            this.a = g9 = new g(this);
        }
        return g9;
    }

    private static final void d(n n8) {
        ax.Gb.l.f(n8, "this$0");
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ax.Gb.l.f(view, "view");
        this.c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = this.getWindow();
        ax.Gb.l.c(window);
        window = window.getDecorView();
        ax.Gb.l.e(window, "window!!.decorView");
        w.a((View)window, this);
        window = this.getWindow();
        ax.Gb.l.c(window);
        window = window.getDecorView();
        ax.Gb.l.e(window, "window!!.decorView");
        x.a((View)window, this);
        window = this.getWindow();
        ax.Gb.l.c(window);
        window = window.getDecorView();
        ax.Gb.l.e(window, "window!!.decorView");
        e.a((View)window, this);
    }

    @Override
    public d getLifecycle() {
        return this.b();
    }

    @Override
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.c;
    }

    @Override
    public a getSavedStateRegistry() {
        return this.b.b();
    }

    public void onBackPressed() {
        this.c.k();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = l.a(this);
            ax.Gb.l.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.n(onBackInvokedDispatcher);
        }
        this.b.d(bundle);
        this.b().h(d.a.ON_CREATE);
    }

    public Bundle onSaveInstanceState() {
        Bundle bundle = super.onSaveInstanceState();
        ax.Gb.l.e(bundle, "super.onSaveInstanceState()");
        this.b.e(bundle);
        return bundle;
    }

    protected void onStart() {
        super.onStart();
        this.b().h(d.a.ON_RESUME);
    }

    protected void onStop() {
        this.b().h(d.a.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    public void setContentView(int n8) {
        this.c();
        super.setContentView(n8);
    }

    public void setContentView(View view) {
        ax.Gb.l.f(view, "view");
        this.c();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ax.Gb.l.f(view, "view");
        this.c();
        super.setContentView(view, layoutParams);
    }
}

