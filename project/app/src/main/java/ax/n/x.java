/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.a;
import ax.c0.u;
import ax.i.n;
import ax.n.d;
import ax.n.f;
import ax.n.w;

public class x
extends n
implements d {
    private f d;
    private final u.a e = new w(this);

    public x(Context context) {
        this(context, 0);
    }

    public x(Context context, int n8) {
        super(context, x.f(context, n8));
        f f8 = this.e();
        f8.Q(x.f(context, n8));
        f8.z(null);
    }

    private static int f(Context context, int n8) {
        if (n8 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ax.m.a.B, typedValue, true);
            return typedValue.resourceId;
        }
        return n8;
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.c();
        this.e().e(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        this.e().A();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View view = this.getWindow().getDecorView();
        return u.e(this.e, view, (Window.Callback)this, keyEvent);
    }

    public f e() {
        if (this.d == null) {
            this.d = f.k(this, this);
        }
        return this.d;
    }

    public <T extends View> T findViewById(int n8) {
        return this.e().l(n8);
    }

    boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean h(int n8) {
        return this.e().I(n8);
    }

    public void invalidateOptionsMenu() {
        this.e().w();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        this.e().v();
        super.onCreate(bundle);
        this.e().z(bundle);
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.e().F();
    }

    @Override
    public void onSupportActionModeFinished(a a8) {
    }

    @Override
    public void onSupportActionModeStarted(a a8) {
    }

    @Override
    public a onWindowStartingSupportActionMode(a.a a8) {
        return null;
    }

    @Override
    public void setContentView(int n8) {
        this.c();
        this.e().K(n8);
    }

    @Override
    public void setContentView(View view) {
        this.c();
        this.e().L(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.c();
        this.e().M(view, layoutParams);
    }

    public void setTitle(int n8) {
        super.setTitle(n8);
        this.e().R(this.getContext().getString(n8));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.e().R(charSequence);
    }
}

