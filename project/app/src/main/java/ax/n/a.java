/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.a;
import ax.m.j;

public abstract class a {
    public abstract void A(float var1);

    public abstract void B(int var1);

    public abstract void C(boolean var1);

    public abstract void D(Drawable var1);

    public abstract void E(boolean var1);

    public abstract void F(CharSequence var1);

    public abstract void G(int var1);

    public abstract void H(CharSequence var1);

    public abstract void I(CharSequence var1);

    public abstract void J();

    public androidx.appcompat.view.a K(a.a a8) {
        return null;
    }

    public abstract void g(b var1);

    public boolean h() {
        return false;
    }

    public abstract boolean i();

    public abstract void j(boolean var1);

    public abstract int k();

    public abstract int l();

    public abstract Context m();

    public abstract void n();

    public boolean o() {
        return false;
    }

    public abstract boolean p();

    public void q(Configuration configuration) {
    }

    void r() {
    }

    public abstract boolean s(int var1, KeyEvent var2);

    public boolean t(KeyEvent keyEvent) {
        return false;
    }

    public boolean u() {
        return false;
    }

    public abstract void v(Drawable var1);

    public abstract void w(boolean var1);

    public abstract void x(boolean var1);

    public abstract void y(int var1, int var2);

    public abstract void z(boolean var1);

    public static class a
    extends ViewGroup.MarginLayoutParams {
        public int a;

        public a(int n8, int n9) {
            super(n8, n9);
            this.a = 8388627;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            context = context.obtainStyledAttributes(attributeSet, j.t);
            this.a = context.getInt(j.u, 0);
            context.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public a(a a8) {
            super((ViewGroup.MarginLayoutParams)a8);
            this.a = 0;
            this.a = a8.a;
        }
    }

    public static interface b {
        public void a(boolean var1);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }
}

