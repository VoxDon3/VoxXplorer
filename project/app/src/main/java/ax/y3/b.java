/*
 * Decompiled with CFR 0.152.
 */
package ax.y3;

import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.t;
import androidx.viewpager.widget.a;

public abstract class b
extends a {
    private final FragmentManager c;
    private t d = null;
    private Fragment e = null;

    public b(FragmentManager fragmentManager) {
        this.c = fragmentManager;
    }

    @Override
    public void a(View view, int n8, Object object) {
        if (this.d == null) {
            this.d = this.c.o();
        }
        if (((Fragment)(object = (Fragment)object)).O0() == null) {
            this.w(view.getId(), n8);
        }
        this.d.m((Fragment)object);
        this.d.q((Fragment)object);
    }

    @Override
    public void c(View view) {
        if (this.d != null && !this.c.I0()) {
            this.d.j();
            this.d = null;
            this.c.g0();
        }
    }

    @Override
    public Object i(View object, int n8) {
        if (this.d == null) {
            this.d = this.c.o();
        }
        Object object2 = this.w(object.getId(), n8);
        if ((object2 = this.c.k0((String)object2)) != null) {
            this.d.h((Fragment)object2);
            object = object2;
        } else {
            object2 = this.v(n8);
            if (object2 == null) {
                return null;
            }
            this.d.c(object.getId(), (Fragment)object2, this.w(object.getId(), n8));
            object = object2;
        }
        if (object != this.e) {
            ((Fragment)object).y2(false);
        }
        return object;
    }

    @Override
    public boolean k(View view, Object object) {
        object = ((Fragment)object).R0();
        while (view instanceof View) {
            if (view == object) {
                return true;
            }
            view = view.getParent();
        }
        return false;
    }

    @Override
    public void n(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override
    public Parcelable o() {
        return null;
    }

    @Override
    public void p(View object, int n8, Object object2) {
        object = this.e;
        if ((object2 = (Fragment)object2) != object) {
            if (object != null) {
                ((Fragment)object).y2(false);
            }
            if (object2 != null) {
                ((Fragment)object2).y2(true);
            }
            this.e = object2;
        }
    }

    @Override
    public void s(View view) {
    }

    public abstract Fragment v(int var1);

    protected String w(int n8, int n9) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("android:switcher:");
        stringBuilder.append(n8);
        stringBuilder.append(":");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }
}

