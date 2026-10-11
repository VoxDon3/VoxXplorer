package ax.n;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.a;

/* renamed from: ax.n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2559a {

    /* renamed from: ax.n.a$b */
    public interface b {
        void a(boolean z);
    }

    @Deprecated
    /* renamed from: ax.n.a$c */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public abstract void A(float f);

    public abstract void B(int i);

    public abstract void C(boolean z);

    public abstract void D(Drawable drawable);

    public abstract void E(boolean z);

    public abstract void F(CharSequence charSequence);

    public abstract void G(int i);

    public abstract void H(CharSequence charSequence);

    public abstract void I(CharSequence charSequence);

    public abstract void J();

    public androidx.appcompat.view.a K(a.InterfaceC0007a interfaceC0007a) {
        return null;
    }

    public abstract void g(b bVar);

    public boolean h() {
        return false;
    }

    public abstract boolean i();

    public abstract void j(boolean z);

    public abstract int k();

    public abstract int l();

    public abstract Context m();

    public abstract void n();

    public boolean o() {
        return false;
    }

    public abstract boolean p();

    public abstract boolean s(int i, KeyEvent keyEvent);

    public boolean t(KeyEvent keyEvent) {
        return false;
    }

    public boolean u() {
        return false;
    }

    public abstract void v(Drawable drawable);

    public abstract void w(boolean z);

    public abstract void x(boolean z);

    public abstract void y(int i, int i2);

    public abstract void z(boolean z);

    /* renamed from: ax.n.a$a, reason: collision with other inner class name */
    public static class C0378a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0378a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.m.j.t);
            this.a = obtainStyledAttributes.getInt(ax.m.j.u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0378a(int i, int i2) {
            super(i, i2);
            this.a = 8388627;
        }

        public C0378a(C0378a c0378a) {
            super((ViewGroup.MarginLayoutParams) c0378a);
            this.a = 0;
            this.a = c0378a.a;
        }

        public C0378a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }

    void r() {
    }

    public void q(Configuration configuration) {
    }
}
