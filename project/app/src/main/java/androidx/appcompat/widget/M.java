/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.F;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import ax.c0.d0;
import ax.c0.n0;
import ax.c0.p0;
import ax.m.f;
import ax.m.h;
import ax.m.j;
import ax.t.a;
import ax.u.l;

public class M
implements l {
    Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private c n;
    private int o = 0;
    private int p = 0;
    private Drawable q;

    public M(Toolbar toolbar, boolean bl) {
        this(toolbar, bl, ax.m.h.a, ax.m.e.n);
    }

    public M(Toolbar object, boolean bl, int n8, int n9) {
        this.a = object;
        this.i = ((Toolbar)object).getTitle();
        this.j = ((Toolbar)object).getSubtitle();
        boolean bl2 = this.i != null;
        this.h = bl2;
        this.g = ((Toolbar)object).getNavigationIcon();
        object = L.v(object.getContext(), null, ax.m.j.a, ax.m.a.c, 0);
        this.q = ((L)object).g(ax.m.j.l);
        if (bl) {
            Object object2 = ((L)object).p(ax.m.j.r);
            if (!TextUtils.isEmpty((CharSequence)object2)) {
                this.setTitle((CharSequence)object2);
            }
            if (!TextUtils.isEmpty((CharSequence)(object2 = ((L)object).p(ax.m.j.p)))) {
                this.h((CharSequence)object2);
            }
            if ((object2 = ((L)object).g(ax.m.j.n)) != null) {
                this.e((Drawable)object2);
            }
            if ((object2 = ((L)object).g(ax.m.j.m)) != null) {
                this.setIcon((Drawable)object2);
            }
            if (this.g == null && (object2 = this.q) != null) {
                this.J((Drawable)object2);
            }
            this.q(((L)object).k(ax.m.j.h, 0));
            n9 = ((L)object).n(ax.m.j.g, 0);
            if (n9 != 0) {
                this.F(LayoutInflater.from((Context)this.a.getContext()).inflate(n9, (ViewGroup)this.a, false));
                this.q(this.b | 0x10);
            }
            if ((n9 = ((L)object).m(ax.m.j.j, 0)) > 0) {
                object2 = this.a.getLayoutParams();
                ((ViewGroup.LayoutParams)object2).height = n9;
                this.a.setLayoutParams((ViewGroup.LayoutParams)object2);
            }
            int n10 = ((L)object).e(ax.m.j.f, -1);
            n9 = ((L)object).e(ax.m.j.e, -1);
            if (n10 >= 0 || n9 >= 0) {
                this.a.K(Math.max(n10, 0), Math.max(n9, 0));
            }
            if ((n9 = ((L)object).n(ax.m.j.s, 0)) != 0) {
                object2 = this.a;
                ((Toolbar)object2).O(object2.getContext(), n9);
            }
            if ((n9 = ((L)object).n(ax.m.j.q, 0)) != 0) {
                object2 = this.a;
                ((Toolbar)object2).N(object2.getContext(), n9);
            }
            if ((n9 = ((L)object).n(ax.m.j.o, 0)) != 0) {
                this.a.setPopupTheme(n9);
            }
        } else {
            this.b = this.E();
        }
        ((L)object).x();
        this.G(n8);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new View.OnClickListener(this){
            final a a;
            final M b;
            {
                this.b = m8;
                this.a = new a(m8.a.getContext(), 0, 16908332, 0, 0, m8.i);
            }

            public void onClick(View object) {
                object = this.b;
                Window.Callback callback = object.l;
                if (callback != null && object.m) {
                    callback.onMenuItemSelected(0, (MenuItem)this.a);
                }
            }
        });
    }

    private int E() {
        if (this.a.getNavigationIcon() != null) {
            this.q = this.a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    private void K(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
            if (this.h) {
                d0.n0(this.a.getRootView(), charSequence);
            }
        }
    }

    private void L() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty((CharSequence)this.k)) {
                this.a.setNavigationContentDescription(this.p);
                return;
            }
            this.a.setNavigationContentDescription(this.k);
        }
    }

    private void M() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.a.setNavigationIcon(null);
    }

    private void N() {
        Drawable drawable;
        int n8 = this.b;
        if ((n8 & 2) != 0) {
            if ((n8 & 1) != 0) {
                drawable = this.f;
                if (drawable == null) {
                    drawable = this.e;
                }
            } else {
                drawable = this.e;
            }
        } else {
            drawable = null;
        }
        this.a.setLogo(drawable);
    }

    @Override
    public int A() {
        return this.b;
    }

    @Override
    public void B() {
        Log.i((String)"ToolbarWidgetWrapper", (String)"Progress display unsupported");
    }

    @Override
    public void C() {
        Log.i((String)"ToolbarWidgetWrapper", (String)"Progress display unsupported");
    }

    @Override
    public void D(boolean bl) {
        this.a.setCollapsible(bl);
    }

    public void F(View view) {
        View view2 = this.d;
        if (view2 != null && (this.b & 0x10) != 0) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view != null && (this.b & 0x10) != 0) {
            this.a.addView(view);
        }
    }

    public void G(int n8) {
        if (n8 != this.p) {
            this.p = n8;
            if (TextUtils.isEmpty((CharSequence)this.a.getNavigationContentDescription())) {
                this.H(this.p);
            }
        }
    }

    public void H(int n8) {
        String string = n8 == 0 ? null : this.b().getString(n8);
        this.I(string);
    }

    public void I(CharSequence charSequence) {
        this.k = charSequence;
        this.L();
    }

    public void J(Drawable drawable) {
        this.g = drawable;
        this.M();
    }

    @Override
    public void a(Drawable drawable) {
        this.a.setBackground(drawable);
    }

    @Override
    public Context b() {
        return this.a.getContext();
    }

    @Override
    public void c(Menu menu, j.a a8) {
        if (this.n == null) {
            c c8;
            this.n = c8 = new c(this.a.getContext());
            c8.p(ax.m.f.g);
        }
        this.n.h(a8);
        this.a.L((e)menu, this.n);
    }

    @Override
    public void collapseActionView() {
        this.a.e();
    }

    @Override
    public boolean d() {
        return this.a.B();
    }

    @Override
    public void e(Drawable drawable) {
        this.f = drawable;
        this.N();
    }

    @Override
    public int f() {
        return this.a.getHeight();
    }

    @Override
    public void g() {
        this.m = true;
    }

    @Override
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override
    public void h(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override
    public boolean i() {
        return this.a.d();
    }

    @Override
    public boolean j() {
        return this.a.A();
    }

    @Override
    public boolean k() {
        return this.a.w();
    }

    @Override
    public boolean l() {
        return this.a.R();
    }

    @Override
    public void m() {
        this.a.f();
    }

    @Override
    public void n(F f8) {
        Toolbar toolbar;
        Object object = this.c;
        if (object != null && (object = object.getParent()) == (toolbar = this.a)) {
            toolbar.removeView(this.c);
        }
        this.c = f8;
        if (f8 != null && this.o == 2) {
            this.a.addView((View)f8, 0);
            object = (Toolbar.g)this.c.getLayoutParams();
            object.width = -2;
            object.height = -2;
            object.a = 8388691;
            f8.setAllowCollapse(true);
        }
    }

    @Override
    public int o() {
        return this.a.getVisibility();
    }

    @Override
    public boolean p() {
        return this.a.v();
    }

    @Override
    public void q(int n8) {
        int n9 = this.b ^ n8;
        this.b = n8;
        if (n9 != 0) {
            View view;
            if ((n9 & 4) != 0) {
                if ((n8 & 4) != 0) {
                    this.L();
                }
                this.M();
            }
            if ((n9 & 3) != 0) {
                this.N();
            }
            if ((n9 & 8) != 0) {
                if ((n8 & 8) != 0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                } else {
                    this.a.setTitle(null);
                    this.a.setSubtitle(null);
                }
            }
            if ((n9 & 0x10) != 0 && (view = this.d) != null) {
                if ((n8 & 0x10) != 0) {
                    this.a.addView(view);
                    return;
                }
                this.a.removeView(view);
            }
        }
    }

    @Override
    public Menu r() {
        return this.a.getMenu();
    }

    @Override
    public void s(int n8) {
        Drawable drawable = n8 != 0 ? ax.o.a.b(this.b(), n8) : null;
        this.e(drawable);
    }

    @Override
    public void setIcon(int n8) {
        Drawable drawable = n8 != 0 ? ax.o.a.b(this.b(), n8) : null;
        this.setIcon(drawable);
    }

    @Override
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        this.N();
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.h = true;
        this.K(charSequence);
    }

    @Override
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            this.K(charSequence);
        }
    }

    @Override
    public int t() {
        return this.o;
    }

    @Override
    public n0 u(int n8, long l8) {
        n0 n02 = d0.e((View)this.a);
        float f8 = n8 == 0 ? 1.0f : 0.0f;
        return n02.b(f8).e(l8).g(new p0(this, n8){
            private boolean a;
            final int b;
            final M c;
            {
                this.c = m8;
                this.b = n8;
                this.a = false;
            }

            @Override
            public void a(View view) {
                this.a = true;
            }

            @Override
            public void b(View view) {
                if (!this.a) {
                    this.c.a.setVisibility(this.b);
                }
            }

            @Override
            public void c(View view) {
                this.c.a.setVisibility(0);
            }
        });
    }

    @Override
    public void v(int n8) {
        Drawable drawable = n8 != 0 ? ax.o.a.b(this.b(), n8) : null;
        this.J(drawable);
    }

    @Override
    public void w(j.a a8, e.a a9) {
        this.a.M(a8, a9);
    }

    @Override
    public void x(int n8) {
        this.a.setVisibility(n8);
    }

    @Override
    public ViewGroup y() {
        return this.a;
    }

    @Override
    public void z(boolean bl) {
    }
}

