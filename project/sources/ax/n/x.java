package ax.n;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.a;
import ax.c0.C1792u;
import ax.i.DialogC2198n;
import ax.m.C2506a;

/* loaded from: classes.dex */
public class x extends DialogC2198n implements InterfaceC2562d {
    private AbstractC2564f d;
    private final C1792u.a e;

    public x(Context context) {
        this(context, 0);
    }

    private static int f(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2506a.B, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // ax.i.DialogC2198n, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().A();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1792u.e(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public AbstractC2564f e() {
        if (this.d == null) {
            this.d = AbstractC2564f.k(this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) e().l(i);
    }

    boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean h(int i) {
        return e().I(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        e().w();
    }

    @Override // ax.i.DialogC2198n, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        e().v();
        super.onCreate(bundle);
        e().z(bundle);
    }

    @Override // ax.i.DialogC2198n, android.app.Dialog
    protected void onStop() {
        super.onStop();
        e().F();
    }

    @Override // ax.n.InterfaceC2562d
    public androidx.appcompat.view.a onWindowStartingSupportActionMode(a.InterfaceC0007a interfaceC0007a) {
        return null;
    }

    @Override // ax.i.DialogC2198n, android.app.Dialog
    public void setContentView(int i) {
        c();
        e().K(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().R(charSequence);
    }

    public x(Context context, int i) {
        super(context, f(context, i));
        this.e = new C1792u.a() { // from class: ax.n.w
            @Override // ax.c0.C1792u.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return x.this.g(keyEvent);
            }
        };
        AbstractC2564f e = e();
        e.Q(f(context, i));
        e.z(null);
    }

    @Override // ax.i.DialogC2198n, android.app.Dialog
    public void setContentView(View view) {
        c();
        e().L(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        e().R(getContext().getString(i));
    }

    @Override // ax.i.DialogC2198n, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().M(view, layoutParams);
    }

    @Override // ax.n.InterfaceC2562d
    public void onSupportActionModeFinished(androidx.appcompat.view.a aVar) {
    }

    @Override // ax.n.InterfaceC2562d
    public void onSupportActionModeStarted(androidx.appcompat.view.a aVar) {
    }
}
