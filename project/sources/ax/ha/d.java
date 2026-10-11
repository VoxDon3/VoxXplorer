package ax.ha;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import ax.ca.h;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public abstract class d implements InterfaceC2175a {
    protected Reference<View> a;
    protected boolean b;

    public d(View view) {
        this(view, true);
    }

    @Override // ax.ha.InterfaceC2175a
    public int a() {
        View view = this.a.get();
        return view == null ? super.hashCode() : view.hashCode();
    }

    protected abstract void b(Bitmap bitmap, View view);

    protected abstract void c(Drawable drawable, View view);

    @Override // ax.ha.InterfaceC2175a
    public int f() {
        View view = this.a.get();
        int i = 0;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (this.b && layoutParams != null && layoutParams.height != -2) {
                i = view.getHeight();
            }
            if (i <= 0 && layoutParams != null) {
                return layoutParams.height;
            }
        }
        return i;
    }

    @Override // ax.ha.InterfaceC2175a
    public boolean g(Drawable drawable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = this.a.get();
            if (view != null) {
                c(drawable, view);
                return true;
            }
        } else {
            ax.ka.d.f("Can't set a drawable into view. You should call ImageLoader on UI thread for it.", new Object[0]);
        }
        return false;
    }

    @Override // ax.ha.InterfaceC2175a
    public View h() {
        return this.a.get();
    }

    @Override // ax.ha.InterfaceC2175a
    public int i() {
        View view = this.a.get();
        int i = 0;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (this.b && layoutParams != null && layoutParams.width != -2) {
                i = view.getWidth();
            }
            if (i <= 0 && layoutParams != null) {
                return layoutParams.width;
            }
        }
        return i;
    }

    @Override // ax.ha.InterfaceC2175a
    public boolean j() {
        return this.a.get() == null;
    }

    @Override // ax.ha.InterfaceC2175a
    public h k() {
        return h.CROP;
    }

    @Override // ax.ha.InterfaceC2175a
    public boolean l(Bitmap bitmap) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = this.a.get();
            if (view != null) {
                b(bitmap, view);
                return true;
            }
        } else {
            ax.ka.d.f("Can't set a bitmap into view. You should call ImageLoader on UI thread for it.", new Object[0]);
        }
        return false;
    }

    public d(View view, boolean z) {
        if (view == null) {
            throw new IllegalArgumentException("view must not be null");
        }
        this.a = new WeakReference(view);
        this.b = z;
    }
}
