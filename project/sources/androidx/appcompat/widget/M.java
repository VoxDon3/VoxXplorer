package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import ax.c0.C1760d0;
import ax.c0.C1780n0;
import ax.c0.C1784p0;
import ax.m.C2506a;
import ax.o.C2653a;
import ax.t.C3089a;

/* loaded from: classes.dex */
public class M implements ax.u.l {
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
    private C0572c n;
    private int o;
    private int p;
    private Drawable q;

    class a implements View.OnClickListener {
        final C3089a a;

        a() {
            this.a = new C3089a(M.this.a.getContext(), 0, R.id.home, 0, 0, M.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            M m = M.this;
            Window.Callback callback = m.l;
            if (callback == null || !m.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.a);
        }
    }

    class b extends C1784p0 {
        private boolean a = false;
        final /* synthetic */ int b;

        b(int i) {
            this.b = i;
        }

        @Override // ax.c0.C1784p0, ax.c0.InterfaceC1782o0
        public void a(View view) {
            this.a = true;
        }

        @Override // ax.c0.InterfaceC1782o0
        public void b(View view) {
            if (this.a) {
                return;
            }
            M.this.a.setVisibility(this.b);
        }

        @Override // ax.c0.C1784p0, ax.c0.InterfaceC1782o0
        public void c(View view) {
            M.this.a.setVisibility(0);
        }
    }

    public M(Toolbar toolbar, boolean z) {
        this(toolbar, z, ax.m.h.a, ax.m.e.n);
    }

    private int E() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    private void K(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
            if (this.h) {
                C1760d0.n0(this.a.getRootView(), charSequence);
            }
        }
    }

    private void L() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }

    private void M() {
        if ((this.b & 4) == 0) {
            this.a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.g;
        if (drawable == null) {
            drawable = this.q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void N() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f;
            if (drawable == null) {
                drawable = this.e;
            }
        } else {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    @Override // ax.u.l
    public int A() {
        return this.b;
    }

    @Override // ax.u.l
    public void B() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // ax.u.l
    public void C() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // ax.u.l
    public void D(boolean z) {
        this.a.setCollapsible(z);
    }

    public void F(View view) {
        View view2 = this.d;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    public void G(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            H(this.p);
        }
    }

    public void H(int i) {
        I(i == 0 ? null : b().getString(i));
    }

    public void I(CharSequence charSequence) {
        this.k = charSequence;
        L();
    }

    public void J(Drawable drawable) {
        this.g = drawable;
        M();
    }

    @Override // ax.u.l
    public void a(Drawable drawable) {
        this.a.setBackground(drawable);
    }

    @Override // ax.u.l
    public Context b() {
        return this.a.getContext();
    }

    @Override // ax.u.l
    public void c(Menu menu, j.a aVar) {
        if (this.n == null) {
            C0572c c0572c = new C0572c(this.a.getContext());
            this.n = c0572c;
            c0572c.p(ax.m.f.g);
        }
        this.n.h(aVar);
        this.a.L((androidx.appcompat.view.menu.e) menu, this.n);
    }

    @Override // ax.u.l
    public void collapseActionView() {
        this.a.e();
    }

    @Override // ax.u.l
    public boolean d() {
        return this.a.B();
    }

    @Override // ax.u.l
    public void e(Drawable drawable) {
        this.f = drawable;
        N();
    }

    @Override // ax.u.l
    public int f() {
        return this.a.getHeight();
    }

    @Override // ax.u.l
    public void g() {
        this.m = true;
    }

    @Override // ax.u.l
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // ax.u.l
    public void h(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // ax.u.l
    public boolean i() {
        return this.a.d();
    }

    @Override // ax.u.l
    public boolean j() {
        return this.a.A();
    }

    @Override // ax.u.l
    public boolean k() {
        return this.a.w();
    }

    @Override // ax.u.l
    public boolean l() {
        return this.a.R();
    }

    @Override // ax.u.l
    public void m() {
        this.a.f();
    }

    @Override // ax.u.l
    public void n(F f) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = f;
        if (f == null || this.o != 2) {
            return;
        }
        this.a.addView(f, 0);
        Toolbar.g gVar = (Toolbar.g) this.c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.a = 8388691;
        f.setAllowCollapse(true);
    }

    @Override // ax.u.l
    public int o() {
        return this.a.getVisibility();
    }

    @Override // ax.u.l
    public boolean p() {
        return this.a.v();
    }

    @Override // ax.u.l
    public void q(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    L();
                }
                M();
            }
            if ((i2 & 3) != 0) {
                N();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // ax.u.l
    public Menu r() {
        return this.a.getMenu();
    }

    @Override // ax.u.l
    public void s(int i) {
        e(i != 0 ? C2653a.b(b(), i) : null);
    }

    @Override // ax.u.l
    public void setIcon(int i) {
        setIcon(i != 0 ? C2653a.b(b(), i) : null);
    }

    @Override // ax.u.l
    public void setTitle(CharSequence charSequence) {
        this.h = true;
        K(charSequence);
    }

    @Override // ax.u.l
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // ax.u.l
    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        K(charSequence);
    }

    @Override // ax.u.l
    public int t() {
        return this.o;
    }

    @Override // ax.u.l
    public C1780n0 u(int i, long j) {
        return C1760d0.e(this.a).b(i == 0 ? 1.0f : 0.0f).e(j).g(new b(i));
    }

    @Override // ax.u.l
    public void v(int i) {
        J(i != 0 ? C2653a.b(b(), i) : null);
    }

    @Override // ax.u.l
    public void w(j.a aVar, e.a aVar2) {
        this.a.M(aVar, aVar2);
    }

    @Override // ax.u.l
    public void x(int i) {
        this.a.setVisibility(i);
    }

    @Override // ax.u.l
    public ViewGroup y() {
        return this.a;
    }

    @Override // ax.u.l
    public void z(boolean z) {
    }

    public M(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        L v = L.v(toolbar.getContext(), null, ax.m.j.a, C2506a.c, 0);
        this.q = v.g(ax.m.j.l);
        if (z) {
            CharSequence p = v.p(ax.m.j.r);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.p(ax.m.j.p);
            if (!TextUtils.isEmpty(p2)) {
                h(p2);
            }
            Drawable g = v.g(ax.m.j.n);
            if (g != null) {
                e(g);
            }
            Drawable g2 = v.g(ax.m.j.m);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.g == null && (drawable = this.q) != null) {
                J(drawable);
            }
            q(v.k(ax.m.j.h, 0));
            int n = v.n(ax.m.j.g, 0);
            if (n != 0) {
                F(LayoutInflater.from(this.a.getContext()).inflate(n, (ViewGroup) this.a, false));
                q(this.b | 16);
            }
            int m = v.m(ax.m.j.j, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = m;
                this.a.setLayoutParams(layoutParams);
            }
            int e = v.e(ax.m.j.f, -1);
            int e2 = v.e(ax.m.j.e, -1);
            if (e >= 0 || e2 >= 0) {
                this.a.K(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.n(ax.m.j.s, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.O(toolbar2.getContext(), n2);
            }
            int n3 = v.n(ax.m.j.q, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.N(toolbar3.getContext(), n3);
            }
            int n4 = v.n(ax.m.j.o, 0);
            if (n4 != 0) {
                this.a.setPopupTheme(n4);
            }
        } else {
            this.b = E();
        }
        v.x();
        G(i);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    @Override // ax.u.l
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        N();
    }
}
