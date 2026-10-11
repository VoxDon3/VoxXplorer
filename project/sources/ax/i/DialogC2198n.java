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
import ax.n2.C2575c;
import ax.n2.InterfaceC2576d;

/* renamed from: ax.i.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC2198n extends Dialog implements ax.G0.h, u, InterfaceC2576d {
    private androidx.lifecycle.g a;
    private final C2575c b;
    private final OnBackPressedDispatcher c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC2198n(Context context, int i) {
        super(context, i);
        ax.Gb.l.f(context, "context");
        this.b = C2575c.d.a(this);
        this.c = new OnBackPressedDispatcher(new Runnable() { // from class: ax.i.m
            @Override // java.lang.Runnable
            public final void run() {
                DialogC2198n.d(DialogC2198n.this);
            }
        });
    }

    private final androidx.lifecycle.g b() {
        androidx.lifecycle.g gVar = this.a;
        if (gVar != null) {
            return gVar;
        }
        androidx.lifecycle.g gVar2 = new androidx.lifecycle.g(this);
        this.a = gVar2;
        return gVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DialogC2198n dialogC2198n) {
        ax.Gb.l.f(dialogC2198n, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ax.Gb.l.f(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = getWindow();
        ax.Gb.l.c(window);
        View decorView = window.getDecorView();
        ax.Gb.l.e(decorView, "window!!.decorView");
        ax.G0.w.a(decorView, this);
        Window window2 = getWindow();
        ax.Gb.l.c(window2);
        View decorView2 = window2.getDecorView();
        ax.Gb.l.e(decorView2, "window!!.decorView");
        x.a(decorView2, this);
        Window window3 = getWindow();
        ax.Gb.l.c(window3);
        View decorView3 = window3.getDecorView();
        ax.Gb.l.e(decorView3, "window!!.decorView");
        ax.n2.e.a(decorView3, this);
    }

    @Override // ax.G0.h
    public androidx.lifecycle.d getLifecycle() {
        return b();
    }

    @Override // ax.i.u
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.c;
    }

    @Override // ax.n2.InterfaceC2576d
    public androidx.savedstate.a getSavedStateRegistry() {
        return this.b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.c.k();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.c;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            ax.Gb.l.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.n(onBackInvokedDispatcher);
        }
        this.b.d(bundle);
        b().h(d.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        ax.Gb.l.e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().h(d.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().h(d.a.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        ax.Gb.l.f(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ax.Gb.l.f(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
