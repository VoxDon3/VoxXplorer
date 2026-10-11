/*
 * Decompiled with CFR 0.152.
 */
package ax.ha;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import ax.ca.h;
import ax.ha.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class d
implements a {
    protected Reference<View> a;
    protected boolean b;

    public d(View view) {
        this(view, true);
    }

    public d(View view, boolean bl) {
        if (view != null) {
            this.a = new WeakReference<View>(view);
            this.b = bl;
            return;
        }
        throw new IllegalArgumentException("view must not be null");
    }

    @Override
    public int a() {
        View view = this.a.get();
        if (view == null) {
            return super.hashCode();
        }
        return view.hashCode();
    }

    protected abstract void b(Bitmap var1, View var2);

    protected abstract void c(Drawable var1, View var2);

    @Override
    public int f() {
        View view = this.a.get();
        int n8 = 0;
        int n9 = 0;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int n10 = n9;
            if (this.b) {
                n10 = n9;
                if (layoutParams != null) {
                    n10 = n9;
                    if (layoutParams.height != -2) {
                        n10 = view.getHeight();
                    }
                }
            }
            n8 = n10;
            if (n10 <= 0) {
                n8 = n10;
                if (layoutParams != null) {
                    return layoutParams.height;
                }
            }
        }
        return n8;
    }

    @Override
    public boolean g(Drawable drawable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = this.a.get();
            if (view != null) {
                this.c(drawable, view);
                return true;
            }
        } else {
            ax.ka.d.f("Can't set a drawable into view. You should call ImageLoader on UI thread for it.", new Object[0]);
        }
        return false;
    }

    @Override
    public View h() {
        return this.a.get();
    }

    @Override
    public int i() {
        View view = this.a.get();
        int n8 = 0;
        int n9 = 0;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int n10 = n9;
            if (this.b) {
                n10 = n9;
                if (layoutParams != null) {
                    n10 = n9;
                    if (layoutParams.width != -2) {
                        n10 = view.getWidth();
                    }
                }
            }
            n8 = n10;
            if (n10 <= 0) {
                n8 = n10;
                if (layoutParams != null) {
                    return layoutParams.width;
                }
            }
        }
        return n8;
    }

    @Override
    public boolean j() {
        return this.a.get() == null;
    }

    @Override
    public h k() {
        return h.c0;
    }

    @Override
    public boolean l(Bitmap bitmap) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = this.a.get();
            if (view != null) {
                this.b(bitmap, view);
                return true;
            }
        } else {
            ax.ka.d.f("Can't set a bitmap into view. You should call ImageLoader on UI thread for it.", new Object[0]);
        }
        return false;
    }
}

