package ax.y3;

import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.t;

/* renamed from: ax.y3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3504b extends androidx.viewpager.widget.a {
    private final FragmentManager c;
    private t d = null;
    private Fragment e = null;

    public AbstractC3504b(FragmentManager fragmentManager) {
        this.c = fragmentManager;
    }

    @Override // androidx.viewpager.widget.a
    public void a(View view, int i, Object obj) {
        if (this.d == null) {
            this.d = this.c.o();
        }
        Fragment fragment = (Fragment) obj;
        if (fragment.O0() == null) {
            w(view.getId(), i);
        }
        this.d.m(fragment);
        this.d.q(fragment);
    }

    @Override // androidx.viewpager.widget.a
    public void c(View view) {
        if (this.d == null || this.c.I0()) {
            return;
        }
        this.d.j();
        this.d = null;
        this.c.g0();
    }

    @Override // androidx.viewpager.widget.a
    public Object i(View view, int i) {
        if (this.d == null) {
            this.d = this.c.o();
        }
        Fragment k0 = this.c.k0(w(view.getId(), i));
        if (k0 != null) {
            this.d.h(k0);
        } else {
            k0 = v(i);
            if (k0 == null) {
                return null;
            }
            this.d.c(view.getId(), k0, w(view.getId(), i));
        }
        if (k0 != this.e) {
            k0.y2(false);
        }
        return k0;
    }

    @Override // androidx.viewpager.widget.a
    public boolean k(View view, Object obj) {
        Object R0 = ((Fragment) obj).R0();
        for (Object obj2 = view; obj2 instanceof View; obj2 = ((View) obj2).getParent()) {
            if (obj2 == R0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable o() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void p(View view, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.y2(false);
            }
            if (fragment != null) {
                fragment.y2(true);
            }
            this.e = fragment;
        }
    }

    public abstract Fragment v(int i);

    protected String w(int i, int i2) {
        return "android:switcher:" + i + ":" + i2;
    }

    @Override // androidx.viewpager.widget.a
    public void s(View view) {
    }

    @Override // androidx.viewpager.widget.a
    public void n(Parcelable parcelable, ClassLoader classLoader) {
    }
}
