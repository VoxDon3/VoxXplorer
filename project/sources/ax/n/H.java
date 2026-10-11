package ax.n;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import ax.c0.C1760d0;
import ax.c0.C1780n0;
import ax.c0.C1784p0;
import ax.c0.InterfaceC1782o0;
import ax.c0.InterfaceC1786q0;
import ax.m.C2506a;
import ax.n.AbstractC2559a;
import ax.s.C3034a;
import ax.s.C3037d;
import ax.s.C3038e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class H extends AbstractC2559a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;
    Context a;
    private Context b;
    private Activity c;
    ActionBarOverlayLayout d;
    ActionBarContainer e;
    ax.u.l f;
    ActionBarContextView g;
    View h;
    androidx.appcompat.widget.F i;
    private boolean l;
    d m;
    androidx.appcompat.view.a n;
    a.InterfaceC0007a o;
    private boolean p;
    private boolean r;
    boolean u;
    boolean v;
    private boolean w;
    C3038e y;
    private boolean z;
    private ArrayList<Object> j = new ArrayList<>();
    private int k = -1;
    private ArrayList<AbstractC2559a.b> q = new ArrayList<>();
    private int s = 0;
    boolean t = true;
    private boolean x = true;
    final InterfaceC1782o0 B = new a();
    final InterfaceC1782o0 C = new b();
    final InterfaceC1786q0 D = new c();

    class a extends C1784p0 {
        a() {
        }

        @Override // ax.c0.InterfaceC1782o0
        public void b(View view) {
            View view2;
            H h = H.this;
            if (h.t && (view2 = h.h) != null) {
                view2.setTranslationY(0.0f);
                H.this.e.setTranslationY(0.0f);
            }
            H.this.e.setVisibility(8);
            H.this.e.setTransitioning(false);
            H h2 = H.this;
            h2.y = null;
            h2.N();
            ActionBarOverlayLayout actionBarOverlayLayout = H.this.d;
            if (actionBarOverlayLayout != null) {
                C1760d0.i0(actionBarOverlayLayout);
            }
        }
    }

    class b extends C1784p0 {
        b() {
        }

        @Override // ax.c0.InterfaceC1782o0
        public void b(View view) {
            H h = H.this;
            h.y = null;
            h.e.requestLayout();
        }
    }

    class c implements InterfaceC1786q0 {
        c() {
        }

        @Override // ax.c0.InterfaceC1786q0
        public void a(View view) {
            ((View) H.this.e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.a implements e.a {
        private final Context c;
        private final androidx.appcompat.view.menu.e d;
        private a.InterfaceC0007a e;
        private WeakReference<View> f;

        public d(Context context, a.InterfaceC0007a interfaceC0007a) {
            this.c = context;
            this.e = interfaceC0007a;
            androidx.appcompat.view.menu.e T = new androidx.appcompat.view.menu.e(context).T(1);
            this.d = T;
            T.S(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            a.InterfaceC0007a interfaceC0007a = this.e;
            if (interfaceC0007a != null) {
                return interfaceC0007a.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.e == null) {
                return;
            }
            k();
            H.this.g.l();
        }

        @Override // androidx.appcompat.view.a
        public void c() {
            H h = H.this;
            if (h.m != this) {
                return;
            }
            if (H.M(h.u, h.v, false)) {
                this.e.a(this);
            } else {
                H h2 = H.this;
                h2.n = this;
                h2.o = this.e;
            }
            this.e = null;
            H.this.L(false);
            H.this.g.g();
            H h3 = H.this;
            h3.d.setHideOnContentScrollEnabled(h3.A);
            H.this.m = null;
        }

        @Override // androidx.appcompat.view.a
        public View d() {
            WeakReference<View> weakReference = this.f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.a
        public Menu e() {
            return this.d;
        }

        @Override // androidx.appcompat.view.a
        public MenuInflater f() {
            return new C3037d(this.c);
        }

        @Override // androidx.appcompat.view.a
        public CharSequence g() {
            return H.this.g.getSubtitle();
        }

        @Override // androidx.appcompat.view.a
        public CharSequence i() {
            return H.this.g.getTitle();
        }

        @Override // androidx.appcompat.view.a
        public void k() {
            if (H.this.m != this) {
                return;
            }
            this.d.f0();
            try {
                this.e.c(this, this.d);
            } finally {
                this.d.e0();
            }
        }

        @Override // androidx.appcompat.view.a
        public boolean l() {
            return H.this.g.j();
        }

        @Override // androidx.appcompat.view.a
        public void m(View view) {
            H.this.g.setCustomView(view);
            this.f = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.a
        public void n(int i) {
            o(H.this.a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.a
        public void o(CharSequence charSequence) {
            H.this.g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.a
        public void q(int i) {
            r(H.this.a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.a
        public void r(CharSequence charSequence) {
            H.this.g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.a
        public void s(boolean z) {
            super.s(z);
            H.this.g.setTitleOptional(z);
        }

        public boolean t() {
            this.d.f0();
            try {
                return this.e.b(this, this.d);
            } finally {
                this.d.e0();
            }
        }
    }

    public H(Activity activity, boolean z) {
        this.c = activity;
        View decorView = activity.getWindow().getDecorView();
        U(decorView);
        if (z) {
            return;
        }
        this.h = decorView.findViewById(R.id.content);
    }

    static boolean M(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ax.u.l Q(View view) {
        if (view instanceof ax.u.l) {
            return (ax.u.l) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void T() {
        if (this.w) {
            this.w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            Z(false);
        }
    }

    private void U(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ax.m.f.p);
        this.d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f = Q(view.findViewById(ax.m.f.a));
        this.g = (ActionBarContextView) view.findViewById(ax.m.f.f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ax.m.f.c);
        this.e = actionBarContainer;
        ax.u.l lVar = this.f;
        if (lVar == null || this.g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = lVar.b();
        boolean z = (this.f.A() & 4) != 0;
        if (z) {
            this.l = true;
        }
        C3034a b2 = C3034a.b(this.a);
        C(b2.a() || z);
        V(b2.g());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, ax.m.j.a, C2506a.c, 0);
        if (obtainStyledAttributes.getBoolean(ax.m.j.k, false)) {
            W(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(ax.m.j.i, 0);
        if (dimensionPixelSize != 0) {
            A(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void V(boolean z) {
        this.r = z;
        if (z) {
            this.e.setTabContainer(null);
            this.f.n(this.i);
        } else {
            this.f.n(null);
            this.e.setTabContainer(this.i);
        }
        boolean z2 = S() == 2;
        androidx.appcompat.widget.F f = this.i;
        if (f != null) {
            if (z2) {
                f.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.d;
                if (actionBarOverlayLayout != null) {
                    C1760d0.i0(actionBarOverlayLayout);
                }
            } else {
                f.setVisibility(8);
            }
        }
        this.f.D(!this.r && z2);
        this.d.setHasNonEmbeddedTabs(!this.r && z2);
    }

    private boolean X() {
        return this.e.isLaidOut();
    }

    private void Y() {
        if (this.w) {
            return;
        }
        this.w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        Z(false);
    }

    private void Z(boolean z) {
        if (M(this.u, this.v, this.w)) {
            if (this.x) {
                return;
            }
            this.x = true;
            P(z);
            return;
        }
        if (this.x) {
            this.x = false;
            O(z);
        }
    }

    @Override // ax.n.AbstractC2559a
    public void A(float f) {
        C1760d0.r0(this.e, f);
    }

    @Override // ax.n.AbstractC2559a
    public void B(int i) {
        this.f.v(i);
    }

    @Override // ax.n.AbstractC2559a
    public void C(boolean z) {
        this.f.z(z);
    }

    @Override // ax.n.AbstractC2559a
    public void D(Drawable drawable) {
        this.f.e(drawable);
    }

    @Override // ax.n.AbstractC2559a
    public void E(boolean z) {
        C3038e c3038e;
        this.z = z;
        if (z || (c3038e = this.y) == null) {
            return;
        }
        c3038e.a();
    }

    @Override // ax.n.AbstractC2559a
    public void F(CharSequence charSequence) {
        this.f.h(charSequence);
    }

    @Override // ax.n.AbstractC2559a
    public void G(int i) {
        H(this.a.getString(i));
    }

    @Override // ax.n.AbstractC2559a
    public void H(CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override // ax.n.AbstractC2559a
    public void I(CharSequence charSequence) {
        this.f.setWindowTitle(charSequence);
    }

    @Override // ax.n.AbstractC2559a
    public void J() {
        if (this.u) {
            this.u = false;
            Z(false);
        }
    }

    @Override // ax.n.AbstractC2559a
    public androidx.appcompat.view.a K(a.InterfaceC0007a interfaceC0007a) {
        d dVar = this.m;
        if (dVar != null) {
            dVar.c();
        }
        this.d.setHideOnContentScrollEnabled(false);
        this.g.k();
        d dVar2 = new d(this.g.getContext(), interfaceC0007a);
        if (!dVar2.t()) {
            return null;
        }
        this.m = dVar2;
        dVar2.k();
        this.g.h(dVar2);
        L(true);
        return dVar2;
    }

    public void L(boolean z) {
        C1780n0 u;
        C1780n0 f;
        if (z) {
            Y();
        } else {
            T();
        }
        if (!X()) {
            if (z) {
                this.f.x(4);
                this.g.setVisibility(0);
                return;
            } else {
                this.f.x(0);
                this.g.setVisibility(8);
                return;
            }
        }
        if (z) {
            f = this.f.u(4, 100L);
            u = this.g.f(0, 200L);
        } else {
            u = this.f.u(0, 200L);
            f = this.g.f(8, 100L);
        }
        C3038e c3038e = new C3038e();
        c3038e.d(f, u);
        c3038e.h();
    }

    void N() {
        a.InterfaceC0007a interfaceC0007a = this.o;
        if (interfaceC0007a != null) {
            interfaceC0007a.a(this.n);
            this.n = null;
            this.o = null;
        }
    }

    public void O(boolean z) {
        View view;
        C3038e c3038e = this.y;
        if (c3038e != null) {
            c3038e.a();
        }
        if (this.s != 0 || (!this.z && !z)) {
            this.B.b(null);
            return;
        }
        this.e.setAlpha(1.0f);
        this.e.setTransitioning(true);
        C3038e c3038e2 = new C3038e();
        float f = -this.e.getHeight();
        if (z) {
            this.e.getLocationInWindow(new int[]{0, 0});
            f -= r5[1];
        }
        C1780n0 l = C1760d0.e(this.e).l(f);
        l.j(this.D);
        c3038e2.c(l);
        if (this.t && (view = this.h) != null) {
            c3038e2.c(C1760d0.e(view).l(f));
        }
        c3038e2.f(E);
        c3038e2.e(250L);
        c3038e2.g(this.B);
        this.y = c3038e2;
        c3038e2.h();
    }

    public void P(boolean z) {
        View view;
        View view2;
        C3038e c3038e = this.y;
        if (c3038e != null) {
            c3038e.a();
        }
        this.e.setVisibility(0);
        if (this.s == 0 && (this.z || z)) {
            this.e.setTranslationY(0.0f);
            float f = -this.e.getHeight();
            if (z) {
                this.e.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.e.setTranslationY(f);
            C3038e c3038e2 = new C3038e();
            C1780n0 l = C1760d0.e(this.e).l(0.0f);
            l.j(this.D);
            c3038e2.c(l);
            if (this.t && (view2 = this.h) != null) {
                view2.setTranslationY(f);
                c3038e2.c(C1760d0.e(this.h).l(0.0f));
            }
            c3038e2.f(F);
            c3038e2.e(250L);
            c3038e2.g(this.C);
            this.y = c3038e2;
            c3038e2.h();
        } else {
            this.e.setAlpha(1.0f);
            this.e.setTranslationY(0.0f);
            if (this.t && (view = this.h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            C1760d0.i0(actionBarOverlayLayout);
        }
    }

    public int R() {
        return this.d.getActionBarHideOffset();
    }

    public int S() {
        return this.f.t();
    }

    public void W(boolean z) {
        if (z && !this.d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z;
        this.d.setHideOnContentScrollEnabled(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.v) {
            this.v = false;
            Z(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z) {
        this.t = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.v) {
            return;
        }
        this.v = true;
        Z(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        C3038e c3038e = this.y;
        if (c3038e != null) {
            c3038e.a();
            this.y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f(int i) {
        this.s = i;
    }

    @Override // ax.n.AbstractC2559a
    public void g(AbstractC2559a.b bVar) {
        this.q.add(bVar);
    }

    @Override // ax.n.AbstractC2559a
    public boolean i() {
        ax.u.l lVar = this.f;
        if (lVar == null || !lVar.p()) {
            return false;
        }
        this.f.collapseActionView();
        return true;
    }

    @Override // ax.n.AbstractC2559a
    public void j(boolean z) {
        if (z == this.p) {
            return;
        }
        this.p = z;
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            this.q.get(i).a(z);
        }
    }

    @Override // ax.n.AbstractC2559a
    public int k() {
        return this.f.A();
    }

    @Override // ax.n.AbstractC2559a
    public int l() {
        return this.e.getHeight();
    }

    @Override // ax.n.AbstractC2559a
    public Context m() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(C2506a.g, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // ax.n.AbstractC2559a
    public void n() {
        if (this.u) {
            return;
        }
        this.u = true;
        Z(false);
    }

    @Override // ax.n.AbstractC2559a
    public boolean p() {
        int l = l();
        if (this.x) {
            return l == 0 || R() < l;
        }
        return false;
    }

    @Override // ax.n.AbstractC2559a
    public void q(Configuration configuration) {
        V(C3034a.b(this.a).g());
    }

    @Override // ax.n.AbstractC2559a
    public boolean s(int i, KeyEvent keyEvent) {
        Menu e;
        d dVar = this.m;
        if (dVar == null || (e = dVar.e()) == null) {
            return false;
        }
        e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e.performShortcut(i, keyEvent, 0);
    }

    @Override // ax.n.AbstractC2559a
    public void v(Drawable drawable) {
        this.e.setPrimaryBackground(drawable);
    }

    @Override // ax.n.AbstractC2559a
    public void w(boolean z) {
        if (this.l) {
            return;
        }
        x(z);
    }

    @Override // ax.n.AbstractC2559a
    public void x(boolean z) {
        y(z ? 4 : 0, 4);
    }

    @Override // ax.n.AbstractC2559a
    public void y(int i, int i2) {
        int A = this.f.A();
        if ((i2 & 4) != 0) {
            this.l = true;
        }
        this.f.q((i & i2) | ((~i2) & A));
    }

    @Override // ax.n.AbstractC2559a
    public void z(boolean z) {
        y(z ? 8 : 0, 8);
    }

    public H(Dialog dialog) {
        U(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }
}
