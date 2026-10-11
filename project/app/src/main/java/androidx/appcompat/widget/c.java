/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import ax.c0.b;
import ax.u.B;
import ax.u.s;
import java.util.ArrayList;

class c
extends androidx.appcompat.view.menu.a
implements b.a {
    c A;
    private b B;
    final f C;
    int D;
    d k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private final SparseBooleanArray x = new SparseBooleanArray();
    e y;
    a z;

    public c(Context context) {
        super(context, ax.m.g.c, ax.m.g.b);
        this.C = new f(this);
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup)this.i;
        if (viewGroup == null) {
            return null;
        }
        int n8 = viewGroup.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = viewGroup.getChildAt(i8);
            if (!(view instanceof k.a) || ((k.a)view).getItemData() != menuItem) continue;
            return view;
        }
        return null;
    }

    public Drawable A() {
        d d8 = this.k;
        if (d8 != null) {
            return d8.getDrawable();
        }
        if (this.m) {
            return this.l;
        }
        return null;
    }

    public boolean B() {
        Object object;
        c c8 = this.A;
        if (c8 != null && (object = this.i) != null) {
            ((View)object).removeCallbacks((Runnable)c8);
            this.A = null;
            return true;
        }
        object = this.y;
        if (object != null) {
            ((i)object).b();
            return true;
        }
        return false;
    }

    public boolean C() {
        a a8 = this.z;
        if (a8 != null) {
            a8.b();
            return true;
        }
        return false;
    }

    public boolean D() {
        return this.A != null || this.E();
        {
        }
    }

    public boolean E() {
        e e8 = this.y;
        return e8 != null && e8.d();
    }

    public void F(Configuration object) {
        if (!this.s) {
            this.r = ax.s.a.b(this.b).d();
        }
        if ((object = this.c) != null) {
            ((androidx.appcompat.view.menu.e)object).L(true);
        }
    }

    public void G(boolean bl) {
        this.v = bl;
    }

    public void H(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.b(this.c);
    }

    public void I(Drawable drawable) {
        d d8 = this.k;
        if (d8 != null) {
            d8.setImageDrawable(drawable);
            return;
        }
        this.m = true;
        this.l = drawable;
    }

    public void J(boolean bl) {
        this.n = bl;
        this.o = true;
    }

    public boolean K() {
        Object object;
        if (this.n && !this.E() && (object = this.c) != null && this.i != null && this.A == null && !((androidx.appcompat.view.menu.e)object).z().isEmpty()) {
            this.A = object = new c(this, new e(this, this.b, this.c, (View)this.k, true));
            ((View)this.i).post((Runnable)object);
            return true;
        }
        return false;
    }

    @Override
    public void a(androidx.appcompat.view.menu.e e8, boolean bl) {
        this.y();
        super.a(e8, bl);
    }

    @Override
    public void c(g object, k.a a8) {
        a8.e((g)object, 0);
        object = (ActionMenuView)this.i;
        a8 = (ActionMenuItemView)a8;
        ((ActionMenuItemView)a8).setItemInvoker((e.b)object);
        if (this.B == null) {
            this.B = new b(this);
        }
        ((ActionMenuItemView)a8).setPopupCallback(this.B);
    }

    @Override
    public void d(boolean bl) {
        Object object;
        int n8;
        int n9;
        super.d(bl);
        ((View)this.i).requestLayout();
        Object object2 = this.c;
        int n10 = 0;
        if (object2 != null) {
            object2 = ((androidx.appcompat.view.menu.e)object2).s();
            n9 = ((ArrayList)object2).size();
            for (n8 = 0; n8 < n9; ++n8) {
                object = ((ArrayList)object2).get(n8).b();
                if (object == null) continue;
                ((ax.c0.b)object).i(this);
            }
        }
        object2 = (object2 = this.c) != null ? ((androidx.appcompat.view.menu.e)object2).z() : null;
        n8 = n10;
        if (this.n) {
            n8 = n10;
            if (object2 != null) {
                n9 = ((ArrayList)object2).size();
                if (n9 == 1) {
                    n8 = ((g)((ArrayList)object2).get(0)).isActionViewExpanded() ^ 1;
                } else {
                    n8 = n10;
                    if (n9 > 0) {
                        n8 = 1;
                    }
                }
            }
        }
        if (n8 != 0) {
            if (this.k == null) {
                this.k = new d(this, this.a);
            }
            if ((object2 = (ViewGroup)this.k.getParent()) != this.i) {
                if (object2 != null) {
                    object2.removeView((View)this.k);
                }
                object2 = (ActionMenuView)this.i;
                object2.addView((View)this.k, (ViewGroup.LayoutParams)((ActionMenuView)object2).F());
            }
        } else {
            object2 = this.k;
            if (object2 != null && (object2 = object2.getParent()) == (object = this.i)) {
                ((ViewGroup)object).removeView((View)this.k);
            }
        }
        ((ActionMenuView)this.i).setOverflowReserved(this.n);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean e() {
        block38: {
            block39: {
                var17_1 = this.c;
                if (var17_1 != null) {
                    var17_1 = var17_1.E();
                    var4_2 = var17_1.size();
                } else {
                    var17_1 = null;
                    var4_2 = 0;
                }
                var1_3 = this.r;
                var10_4 = this.q;
                var11_5 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                var18_6 = (ViewGroup)this.i;
                var6_8 = 0;
                var5_9 = 0;
                var3_10 = 0;
                for (var2_7 = 0; var2_7 < var4_2; ++var2_7) {
                    var19_12 = (g)var17_1.get(var2_7);
                    if (var19_12.o()) {
                        ++var5_9;
                    } else if (var19_12.n()) {
                        ++var3_10;
                    } else {
                        var6_8 = 1;
                    }
                    var7_11 = var1_3;
                    if (this.v) {
                        var7_11 = var1_3;
                        if (var19_12.isActionViewExpanded()) {
                            var7_11 = 0;
                        }
                    }
                    var1_3 = var7_11;
                }
                var2_7 = var1_3;
                if (!this.n) break block38;
                if (var6_8 != 0) break block39;
                var2_7 = var1_3;
                if (var3_10 + var5_9 <= var1_3) break block38;
            }
            var2_7 = var1_3 - 1;
        }
        var1_3 = var2_7 - var5_9;
        var20_13 = this.x;
        var20_13.clear();
        if (this.t) {
            var2_7 = this.w;
            var3_10 = var10_4 / var2_7;
            var8_14 = var2_7 + var10_4 % var2_7 / var3_10;
        } else {
            var8_14 = 0;
            var3_10 = 0;
        }
        var2_7 = 0;
        var7_11 = var10_4;
        var10_4 = var4_2;
        for (var9_15 = 0; var9_15 < var10_4; ++var9_15) {
            block36: {
                block40: {
                    block37: {
                        block41: {
                            block42: {
                                var19_12 = (g)var17_1.get(var9_15);
                                if (var19_12.o()) {
                                    var21_21 = this.n(var19_12, null, var18_6);
                                    if (this.t) {
                                        var3_10 -= ActionMenuView.L((View)var21_21, var8_14, var3_10, var11_5, 0);
                                    } else {
                                        var21_21.measure(var11_5, var11_5);
                                    }
                                    var6_8 = var21_21.getMeasuredWidth();
                                    var5_9 = var7_11 - var6_8;
                                    var4_2 = var2_7;
                                    if (var2_7 == 0) {
                                        var4_2 = var6_8;
                                    }
                                    if ((var2_7 = var19_12.getGroupId()) != 0) {
                                        var20_13.put(var2_7, true);
                                    }
                                    var19_12.u(true);
lbl68:
                                    // 2 sources

                                    while (true) {
                                        var2_7 = var4_2;
                                        break block36;
                                        break;
                                    }
                                }
                                if (!var19_12.n()) break block40;
                                var12_16 = var19_12.getGroupId();
                                var16_20 = var20_13.get(var12_16);
                                var13_17 = !(var1_3 <= 0 && var16_20 == false || var7_11 <= 0 || this.t != false && var3_10 <= 0) ? 1 : 0;
                                var15_19 = var13_17;
                                var14_18 = var13_17;
                                var5_9 = var7_11;
                                var6_8 = var3_10;
                                var4_2 = var2_7;
                                if (var13_17 == 0) break block37;
                                var21_21 = this.n(var19_12, null, var18_6);
                                if (this.t) {
                                    var5_9 = ActionMenuView.L((View)var21_21, var8_14, var3_10, var11_5, 0);
                                    var3_10 = var4_2 = var3_10 - var5_9;
                                    if (var5_9 == 0) {
                                        var15_19 = 0;
                                        var3_10 = var4_2;
                                    }
                                } else {
                                    var21_21.measure(var11_5, var11_5);
                                }
                                var6_8 = var21_21.getMeasuredWidth();
                                var5_9 = var7_11 - var6_8;
                                var4_2 = var2_7;
                                if (var2_7 == 0) {
                                    var4_2 = var6_8;
                                }
                                if (!this.t) break block41;
                                if (var5_9 < 0) break block42;
lbl97:
                                // 2 sources

                                while (true) {
                                    var2_7 = 1;
                                    ** GOTO lbl103
                                    break;
                                }
                            }
                            while (true) {
                                var2_7 = 0;
lbl103:
                                // 2 sources

                                var14_18 = var15_19 & var2_7;
                                var6_8 = var3_10;
                                break block37;
                                break;
                            }
                        }
                        if (var5_9 + var4_2 <= 0) ** continue;
                        ** continue;
                    }
                    if (var14_18 != 0 && var12_16 != 0) {
                        var20_13.put(var12_16, true);
                        var2_7 = var1_3;
                    } else {
                        var2_7 = var1_3;
                        if (var16_20) {
                            var20_13.put(var12_16, false);
                            var3_10 = 0;
                            while (true) {
                                var2_7 = var1_3;
                                if (var3_10 >= var9_15) break;
                                var21_21 = (g)var17_1.get(var3_10);
                                var2_7 = var1_3;
                                if (var21_21.getGroupId() == var12_16) {
                                    var2_7 = var1_3;
                                    if (var21_21.l()) {
                                        var2_7 = var1_3 + 1;
                                    }
                                    var21_21.u(false);
                                }
                                ++var3_10;
                                var1_3 = var2_7;
                            }
                        }
                    }
                    var1_3 = var2_7;
                    if (var14_18 != 0) {
                        var1_3 = var2_7 - 1;
                    }
                    var19_12.u((boolean)var14_18);
                    var3_10 = var6_8;
                    ** continue;
                }
                var19_12.u(false);
                var5_9 = var7_11;
            }
            var7_11 = var5_9;
        }
        return true;
    }

    @Override
    public void i(Context object, androidx.appcompat.view.menu.e e8) {
        super.i((Context)object, e8);
        e8 = object.getResources();
        object = ax.s.a.b((Context)object);
        if (!this.o) {
            this.n = ((ax.s.a)object).h();
        }
        if (!this.u) {
            this.p = ((ax.s.a)object).c();
        }
        if (!this.s) {
            this.r = ((ax.s.a)object).d();
        }
        int n8 = this.p;
        if (this.n) {
            if (this.k == null) {
                this.k = object = new d(this, this.a);
                if (this.m) {
                    ((AppCompatImageView)((Object)object)).setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int n9 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                this.k.measure(n9, n9);
            }
            n8 -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = n8;
        this.w = (int)(e8.getDisplayMetrics().density * 56.0f);
    }

    @Override
    public boolean k(m m8) {
        boolean bl = m8.hasVisibleItems();
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        Object object = m8;
        while (((m)object).g0() != this.c) {
            object = (m)((m)object).g0();
        }
        if ((object = this.z(((m)object).getItem())) == null) {
            return false;
        }
        this.D = m8.getItem().getItemId();
        int n8 = m8.size();
        int n9 = 0;
        while (true) {
            bl = bl2;
            if (n9 >= n8) break;
            MenuItem menuItem = m8.getItem(n9);
            if (menuItem.isVisible() && menuItem.getIcon() != null) {
                bl = true;
                break;
            }
            ++n9;
        }
        this.z = object = new a(this, this.b, m8, (View)object);
        ((i)object).g(bl);
        this.z.k();
        super.k(m8);
        return true;
    }

    @Override
    public boolean l(ViewGroup viewGroup, int n8) {
        if (viewGroup.getChildAt(n8) == this.k) {
            return false;
        }
        return super.l(viewGroup, n8);
    }

    @Override
    public View n(g g8, View object, ViewGroup viewGroup) {
        View view = g8.getActionView();
        if (view == null || g8.j()) {
            view = super.n(g8, (View)object, viewGroup);
        }
        int n8 = g8.isActionViewExpanded() ? 8 : 0;
        view.setVisibility(n8);
        object = (ActionMenuView)viewGroup;
        g8 = view.getLayoutParams();
        if (!((ActionMenuView)object).checkLayoutParams((ViewGroup.LayoutParams)g8)) {
            view.setLayoutParams((ViewGroup.LayoutParams)((ActionMenuView)object).E((ViewGroup.LayoutParams)g8));
        }
        return view;
    }

    @Override
    public k o(ViewGroup object) {
        k k8 = this.i;
        if (k8 != (object = super.o((ViewGroup)object))) {
            ((ActionMenuView)object).setPresenter(this);
        }
        return object;
    }

    @Override
    public boolean q(int n8, g g8) {
        return g8.l();
    }

    public boolean y() {
        return this.B() | this.C();
    }

    private class a
    extends i {
        final c m;

        public a(c c8, Context object, m object2, View view) {
            this.m = c8;
            super((Context)object, (androidx.appcompat.view.menu.e)object2, view, false, ax.m.a.l);
            if (!((g)((m)object2).getItem()).l()) {
                object2 = c8.k;
                object = object2;
                if (object2 == null) {
                    object = (View)c8.i;
                }
                this.f((View)object);
            }
            this.j(c8.C);
        }

        @Override
        protected void e() {
            c c8 = this.m;
            c8.z = null;
            c8.D = 0;
            super.e();
        }
    }

    private class b
    extends ActionMenuItemView.b {
        final c a;

        b(c c8) {
            this.a = c8;
        }

        @Override
        public ax.t.e a() {
            a a8 = this.a.z;
            if (a8 != null) {
                return a8.c();
            }
            return null;
        }
    }

    private class c
    implements Runnable {
        final c c0;
        private e q;

        public c(c c8, e e8) {
            this.c0 = c8;
            this.q = e8;
        }

        @Override
        public void run() {
            View view;
            if (this.c0.c != null) {
                this.c0.c.d();
            }
            if ((view = (View)this.c0.i) != null && view.getWindowToken() != null && this.q.n()) {
                this.c0.y = this.q;
            }
            this.c0.A = null;
        }
    }

    private class d
    extends AppCompatImageView
    implements ActionMenuView.a {
        final c d;

        public d(c c8, Context context) {
            this.d = c8;
            super(context, null, ax.m.a.k);
            this.setClickable(true);
            this.setFocusable(true);
            this.setVisibility(0);
            this.setEnabled(true);
            ax.u.B.a((View)this, this.getContentDescription());
            this.setOnTouchListener(new s(this, (View)this, c8){
                final c j;
                final d k;
                {
                    this.k = d8;
                    this.j = c8;
                    super(view);
                }

                @Override
                public ax.t.e b() {
                    e e8 = this.k.d.y;
                    if (e8 == null) {
                        return null;
                    }
                    return e8.c();
                }

                @Override
                public boolean c() {
                    this.k.d.K();
                    return true;
                }

                @Override
                public boolean d() {
                    c c8 = this.k.d;
                    if (c8.A != null) {
                        return false;
                    }
                    c8.B();
                    return true;
                }
            });
        }

        @Override
        public boolean a() {
            return false;
        }

        @Override
        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            this.playSoundEffect(0);
            this.d.K();
            return true;
        }

        protected boolean setFrame(int n8, int n9, int n10, int n11) {
            boolean bl = super.setFrame(n8, n9, n10, n11);
            Drawable drawable = this.getDrawable();
            Drawable drawable2 = this.getBackground();
            if (drawable != null && drawable2 != null) {
                int n12 = this.getWidth();
                n11 = this.getHeight();
                n8 = Math.max(n12, n11) / 2;
                int n13 = this.getPaddingLeft();
                int n14 = this.getPaddingRight();
                n10 = this.getPaddingTop();
                n9 = this.getPaddingBottom();
                n12 = (n12 + (n13 - n14)) / 2;
                n9 = (n11 + (n10 - n9)) / 2;
                ax.U.a.l(drawable2, n12 - n8, n9 - n8, n12 + n8, n9 + n8);
            }
            return bl;
        }
    }

    private class e
    extends i {
        final c m;

        public e(c c8, Context context, androidx.appcompat.view.menu.e e8, View view, boolean bl) {
            this.m = c8;
            super(context, e8, view, bl, ax.m.a.l);
            this.h(0x800005);
            this.j(c8.C);
        }

        @Override
        protected void e() {
            if (this.m.c != null) {
                this.m.c.close();
            }
            this.m.y = null;
            super.e();
        }
    }

    private class f
    implements j.a {
        final c a;

        f(c c8) {
            this.a = c8;
        }

        @Override
        public void a(androidx.appcompat.view.menu.e e8, boolean bl) {
            j.a a8;
            if (e8 instanceof m) {
                e8.D().e(false);
            }
            if ((a8 = this.a.m()) != null) {
                a8.a(e8, bl);
            }
        }

        @Override
        public boolean b(androidx.appcompat.view.menu.e e8) {
            if (e8 == this.a.c) {
                return false;
            }
            this.a.D = ((m)e8).getItem().getItemId();
            j.a a8 = this.a.m();
            if (a8 != null) {
                return a8.b(e8);
            }
            return false;
        }
    }
}

