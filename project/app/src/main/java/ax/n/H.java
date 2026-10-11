/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
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
import androidx.appcompat.widget.F;
import androidx.appcompat.widget.Toolbar;
import ax.c0.d0;
import ax.c0.n0;
import ax.c0.o0;
import ax.c0.p0;
import ax.c0.q0;
import ax.m.f;
import ax.m.j;
import ax.n.a;
import ax.s.e;
import ax.u.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class H
extends a
implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;
    final o0 B;
    final o0 C;
    final q0 D;
    Context a;
    private Context b;
    private Activity c;
    ActionBarOverlayLayout d;
    ActionBarContainer e;
    l f;
    ActionBarContextView g;
    View h;
    F i;
    private ArrayList<Object> j = new ArrayList();
    private int k = -1;
    private boolean l;
    d m;
    androidx.appcompat.view.a n;
    a.a o;
    private boolean p;
    private ArrayList<a.b> q = new ArrayList();
    private boolean r;
    private int s = 0;
    boolean t = true;
    boolean u;
    boolean v;
    private boolean w;
    private boolean x = true;
    e y;
    private boolean z;

    public H(Activity activity, boolean bl) {
        this.B = new p0(this){
            final H a;
            {
                this.a = h8;
            }

            @Override
            public void b(View object) {
                object = this.a;
                if (((H)object).t && (object = ((H)object).h) != null) {
                    object.setTranslationY(0.0f);
                    this.a.e.setTranslationY(0.0f);
                }
                this.a.e.setVisibility(8);
                this.a.e.setTransitioning(false);
                object = this.a;
                ((H)object).y = null;
                ((H)object).N();
                object = this.a.d;
                if (object != null) {
                    d0.i0((View)object);
                }
            }
        };
        this.C = new p0(this){
            final H a;
            {
                this.a = h8;
            }

            @Override
            public void b(View object) {
                object = this.a;
                object.y = null;
                object.e.requestLayout();
            }
        };
        this.D = new q0(this){
            final H a;
            {
                this.a = h8;
            }

            @Override
            public void a(View view) {
                ((View)this.a.e.getParent()).invalidate();
            }
        };
        this.c = activity;
        activity = activity.getWindow().getDecorView();
        this.U((View)activity);
        if (!bl) {
            this.h = activity.findViewById(0x1020002);
        }
    }

    public H(Dialog dialog) {
        this.B = new /* invalid duplicate definition of identical inner class */;
        this.C = new /* invalid duplicate definition of identical inner class */;
        this.D = new /* invalid duplicate definition of identical inner class */;
        this.U(dialog.getWindow().getDecorView());
    }

    static boolean M(boolean bl, boolean bl2, boolean bl3) {
        if (bl3) {
            return true;
        }
        return !bl && !bl2;
        {
        }
    }

    private l Q(View object) {
        if (object instanceof l) {
            return (l)object;
        }
        if (object instanceof Toolbar) {
            return ((Toolbar)object).getWrapper();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't make a decor toolbar out of ");
        object = object != null ? object.getClass().getSimpleName() : "null";
        stringBuilder.append((String)object);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private void T() {
        if (this.w) {
            this.w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            this.Z(false);
        }
    }

    private void U(View object) {
        Object object2;
        this.d = object2 = (ActionBarOverlayLayout)object.findViewById(ax.m.f.p);
        if (object2 != null) {
            object2.setActionBarVisibilityCallback(this);
        }
        this.f = this.Q(object.findViewById(ax.m.f.a));
        this.g = (ActionBarContextView)object.findViewById(ax.m.f.f);
        object2 = (ActionBarContainer)object.findViewById(ax.m.f.c);
        this.e = object2;
        object = this.f;
        if (object != null && this.g != null && object2 != null) {
            this.a = object.b();
            int n8 = (this.f.A() & 4) != 0 ? 1 : 0;
            if (n8 != 0) {
                this.l = true;
            }
            boolean bl = ((ax.s.a)(object = ax.s.a.b(this.a))).a() || n8 != 0;
            this.C(bl);
            this.V(((ax.s.a)object).g());
            object = this.a.obtainStyledAttributes(null, ax.m.j.a, ax.m.a.c, 0);
            if (object.getBoolean(ax.m.j.k, false)) {
                this.W(true);
            }
            if ((n8 = object.getDimensionPixelSize(ax.m.j.i, 0)) != 0) {
                this.A(n8);
            }
            object.recycle();
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(this.getClass().getSimpleName());
        ((StringBuilder)object).append(" can only be used with a compatible window decor layout");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private void V(boolean bl) {
        this.r = bl;
        if (!bl) {
            this.f.n(null);
            this.e.setTabContainer(this.i);
        } else {
            this.e.setTabContainer(null);
            this.f.n(this.i);
        }
        int n8 = this.S();
        boolean bl2 = true;
        n8 = n8 == 2 ? 1 : 0;
        Object object = this.i;
        if (object != null) {
            if (n8 != 0) {
                object.setVisibility(0);
                object = this.d;
                if (object != null) {
                    d0.i0((View)object);
                }
            } else {
                object.setVisibility(8);
            }
        }
        object = this.f;
        bl = !this.r && n8 != 0;
        object.D(bl);
        object = this.d;
        bl = !this.r && n8 != 0 ? bl2 : false;
        ((ActionBarOverlayLayout)object).setHasNonEmbeddedTabs(bl);
    }

    private boolean X() {
        return this.e.isLaidOut();
    }

    private void Y() {
        if (!this.w) {
            this.w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            this.Z(false);
        }
    }

    private void Z(boolean bl) {
        if (H.M(this.u, this.v, this.w)) {
            if (!this.x) {
                this.x = true;
                this.P(bl);
                return;
            }
        } else if (this.x) {
            this.x = false;
            this.O(bl);
        }
    }

    @Override
    public void A(float f8) {
        d0.r0((View)this.e, f8);
    }

    @Override
    public void B(int n8) {
        this.f.v(n8);
    }

    @Override
    public void C(boolean bl) {
        this.f.z(bl);
    }

    @Override
    public void D(Drawable drawable) {
        this.f.e(drawable);
    }

    @Override
    public void E(boolean bl) {
        e e8;
        this.z = bl;
        if (!bl && (e8 = this.y) != null) {
            e8.a();
        }
    }

    @Override
    public void F(CharSequence charSequence) {
        this.f.h(charSequence);
    }

    @Override
    public void G(int n8) {
        this.H(this.a.getString(n8));
    }

    @Override
    public void H(CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override
    public void I(CharSequence charSequence) {
        this.f.setWindowTitle(charSequence);
    }

    @Override
    public void J() {
        if (this.u) {
            this.u = false;
            this.Z(false);
        }
    }

    @Override
    public androidx.appcompat.view.a K(a.a object) {
        d d8 = this.m;
        if (d8 != null) {
            d8.c();
        }
        this.d.setHideOnContentScrollEnabled(false);
        this.g.k();
        object = new d(this, this.g.getContext(), (a.a)object);
        if (((d)object).t()) {
            this.m = object;
            ((d)object).k();
            this.g.h((androidx.appcompat.view.a)object);
            this.L(true);
            return object;
        }
        return null;
    }

    public void L(boolean bl) {
        if (bl) {
            this.Y();
        } else {
            this.T();
        }
        if (this.X()) {
            n0 n02;
            n0 n03;
            if (bl) {
                n03 = this.f.u(4, 100L);
                n02 = this.g.f(0, 200L);
            } else {
                n02 = this.f.u(0, 200L);
                n03 = this.g.f(8, 100L);
            }
            e e8 = new e();
            e8.d(n03, n02);
            e8.h();
            return;
        }
        if (bl) {
            this.f.x(4);
            this.g.setVisibility(0);
            return;
        }
        this.f.x(0);
        this.g.setVisibility(8);
    }

    void N() {
        a.a a8 = this.o;
        if (a8 != null) {
            a8.a(this.n);
            this.n = null;
            this.o = null;
        }
    }

    public void O(boolean bl) {
        e e8 = this.y;
        if (e8 != null) {
            e8.a();
        }
        if (this.s == 0 && (this.z || bl)) {
            Object object;
            float f8;
            this.e.setAlpha(1.0f);
            this.e.setTransitioning(true);
            e8 = new e();
            float f9 = f8 = (float)(-this.e.getHeight());
            if (bl) {
                object = new int[]{0, false};
                this.e.getLocationInWindow((int[])object);
                f9 = f8 - (float)object[1];
            }
            object = d0.e((View)this.e).l(f9);
            object.j(this.D);
            e8.c((n0)object);
            if (this.t && (object = this.h) != null) {
                e8.c(d0.e((View)object).l(f9));
            }
            e8.f(E);
            e8.e(250L);
            e8.g(this.B);
            this.y = e8;
            e8.h();
            return;
        }
        this.B.b(null);
    }

    public void P(boolean bl) {
        Object object = this.y;
        if (object != null) {
            ((e)object).a();
        }
        this.e.setVisibility(0);
        if (this.s == 0 && (this.z || bl)) {
            float f8;
            this.e.setTranslationY(0.0f);
            float f9 = f8 = (float)(-this.e.getHeight());
            if (bl) {
                object = new int[2];
                object[0] = false;
                object[1] = false;
                this.e.getLocationInWindow((int[])object);
                f9 = f8 - (float)object[1];
            }
            this.e.setTranslationY(f9);
            object = new e();
            n0 n02 = d0.e((View)this.e).l(0.0f);
            n02.j(this.D);
            ((e)object).c(n02);
            if (this.t && (n02 = this.h) != null) {
                n02.setTranslationY(f9);
                ((e)object).c(d0.e(this.h).l(0.0f));
            }
            ((e)object).f(F);
            ((e)object).e(250L);
            ((e)object).g(this.C);
            this.y = object;
            ((e)object).h();
        } else {
            this.e.setAlpha(1.0f);
            this.e.setTranslationY(0.0f);
            if (this.t && (object = this.h) != null) {
                object.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        object = this.d;
        if (object != null) {
            d0.i0((View)object);
        }
    }

    public int R() {
        return this.d.getActionBarHideOffset();
    }

    public int S() {
        return this.f.t();
    }

    public void W(boolean bl) {
        if (bl && !this.d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = bl;
        this.d.setHideOnContentScrollEnabled(bl);
    }

    @Override
    public void a() {
        if (this.v) {
            this.v = false;
            this.Z(true);
        }
    }

    @Override
    public void b() {
    }

    @Override
    public void c(boolean bl) {
        this.t = bl;
    }

    @Override
    public void d() {
        if (!this.v) {
            this.v = true;
            this.Z(true);
        }
    }

    @Override
    public void e() {
        e e8 = this.y;
        if (e8 != null) {
            e8.a();
            this.y = null;
        }
    }

    @Override
    public void f(int n8) {
        this.s = n8;
    }

    @Override
    public void g(a.b b8) {
        this.q.add(b8);
    }

    @Override
    public boolean i() {
        l l8 = this.f;
        if (l8 != null && l8.p()) {
            this.f.collapseActionView();
            return true;
        }
        return false;
    }

    @Override
    public void j(boolean bl) {
        if (bl != this.p) {
            this.p = bl;
            int n8 = this.q.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.q.get(i8).a(bl);
            }
        }
    }

    @Override
    public int k() {
        return this.f.A();
    }

    @Override
    public int l() {
        return this.e.getHeight();
    }

    @Override
    public Context m() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(ax.m.a.g, typedValue, true);
            int n8 = typedValue.resourceId;
            this.b = n8 != 0 ? new ContextThemeWrapper(this.a, n8) : this.a;
        }
        return this.b;
    }

    @Override
    public void n() {
        if (!this.u) {
            this.u = true;
            this.Z(false);
        }
    }

    @Override
    public boolean p() {
        int n8 = this.l();
        return this.x && (n8 == 0 || this.R() < n8);
    }

    @Override
    public void q(Configuration configuration) {
        this.V(ax.s.a.b(this.a).g());
    }

    @Override
    public boolean s(int n8, KeyEvent keyEvent) {
        d d8 = this.m;
        if (d8 == null) {
            return false;
        }
        if ((d8 = d8.e()) != null) {
            int n9 = keyEvent != null ? keyEvent.getDeviceId() : -1;
            n9 = KeyCharacterMap.load((int)n9).getKeyboardType();
            boolean bl = true;
            if (n9 == 1) {
                bl = false;
            }
            d8.setQwertyMode(bl);
            return d8.performShortcut(n8, keyEvent, 0);
        }
        return false;
    }

    @Override
    public void v(Drawable drawable) {
        this.e.setPrimaryBackground(drawable);
    }

    @Override
    public void w(boolean bl) {
        if (!this.l) {
            this.x(bl);
        }
    }

    @Override
    public void x(boolean bl) {
        int n8 = bl ? 4 : 0;
        this.y(n8, 4);
    }

    @Override
    public void y(int n8, int n9) {
        int n10 = this.f.A();
        if ((n9 & 4) != 0) {
            this.l = true;
        }
        this.f.q(n8 & n9 | ~n9 & n10);
    }

    @Override
    public void z(boolean bl) {
        int n8 = bl ? 8 : 0;
        this.y(n8, 8);
    }

    public class d
    extends androidx.appcompat.view.a
    implements e.a {
        private final Context c;
        private final androidx.appcompat.view.menu.e d;
        private a.a e;
        private WeakReference<View> f;
        final H g;

        public d(H object, Context context, a.a a8) {
            this.g = object;
            this.c = context;
            this.e = a8;
            this.d = object = new androidx.appcompat.view.menu.e(context).T(1);
            ((androidx.appcompat.view.menu.e)object).S(this);
        }

        @Override
        public boolean a(androidx.appcompat.view.menu.e object, MenuItem menuItem) {
            object = this.e;
            if (object != null) {
                return object.d(this, menuItem);
            }
            return false;
        }

        @Override
        public void b(androidx.appcompat.view.menu.e e8) {
            if (this.e == null) {
                return;
            }
            this.k();
            this.g.g.l();
        }

        @Override
        public void c() {
            H h8 = this.g;
            if (h8.m != this) {
                return;
            }
            if (!H.M(h8.u, h8.v, false)) {
                h8 = this.g;
                h8.n = this;
                h8.o = this.e;
            } else {
                this.e.a(this);
            }
            this.e = null;
            this.g.L(false);
            this.g.g.g();
            h8 = this.g;
            h8.d.setHideOnContentScrollEnabled(h8.A);
            this.g.m = null;
        }

        @Override
        public View d() {
            WeakReference<View> weakReference = this.f;
            if (weakReference != null) {
                return (View)weakReference.get();
            }
            return null;
        }

        @Override
        public Menu e() {
            return this.d;
        }

        @Override
        public MenuInflater f() {
            return new ax.s.d(this.c);
        }

        @Override
        public CharSequence g() {
            return this.g.g.getSubtitle();
        }

        @Override
        public CharSequence i() {
            return this.g.g.getTitle();
        }

        @Override
        public void k() {
            if (this.g.m != this) {
                return;
            }
            this.d.f0();
            try {
                this.e.c(this, this.d);
                return;
            }
            finally {
                this.d.e0();
            }
        }

        @Override
        public boolean l() {
            return this.g.g.j();
        }

        @Override
        public void m(View view) {
            this.g.g.setCustomView(view);
            this.f = new WeakReference<View>(view);
        }

        @Override
        public void n(int n8) {
            this.o(this.g.a.getResources().getString(n8));
        }

        @Override
        public void o(CharSequence charSequence) {
            this.g.g.setSubtitle(charSequence);
        }

        @Override
        public void q(int n8) {
            this.r(this.g.a.getResources().getString(n8));
        }

        @Override
        public void r(CharSequence charSequence) {
            this.g.g.setTitle(charSequence);
        }

        @Override
        public void s(boolean bl) {
            super.s(bl);
            this.g.g.setTitleOptional(bl);
        }

        public boolean t() {
            this.d.f0();
            try {
                boolean bl = this.e.b(this, this.d);
                return bl;
            }
            finally {
                this.d.e0();
            }
        }
    }
}

