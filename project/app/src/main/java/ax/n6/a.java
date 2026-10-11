/*
 * Decompiled with CFR 0.152.
 */
package ax.n6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ax.F6.u;
import ax.F6.w;
import ax.K6.e;
import ax.O6.h;
import ax.O6.l;
import ax.k6.k;
import ax.n6.c;
import ax.n6.d;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

public class a
extends Drawable
implements u.b {
    private static final int n = ax.k6.l.q;
    private static final int o = ax.k6.c.a;
    private final WeakReference<Context> a;
    private final h b;
    private final u c;
    private final Rect d;
    private final c e;
    private float f;
    private float g;
    private int h;
    private float i;
    private float j;
    private float k;
    private WeakReference<View> l;
    private WeakReference<FrameLayout> m;

    private a(Context context, int n8, int n9, int n10, c.a object) {
        u u8;
        this.a = new WeakReference<Context>(context);
        w.c(context);
        this.d = new Rect();
        this.c = u8 = new u(this);
        u8.g().setTextAlign(Paint.Align.CENTER);
        this.e = object = new c(context, n8, n9, n10, (c.a)object);
        n8 = this.y() ? ((c)object).m() : ((c)object).i();
        n9 = this.y() ? ((c)object).l() : ((c)object).h();
        this.b = new h(ax.O6.l.b(context, n8, n9).m());
        this.K();
    }

    private void B() {
        this.c.g().setAlpha(this.getAlpha());
        this.invalidateSelf();
    }

    private void C() {
        ColorStateList colorStateList = ColorStateList.valueOf((int)this.e.e());
        if (this.b.B() != colorStateList) {
            this.b.g0(colorStateList);
            this.invalidateSelf();
        }
    }

    private void D() {
        this.c.l(true);
        this.F();
        this.N();
        this.invalidateSelf();
    }

    private void E() {
        Object object = this.l;
        if (object != null && object.get() != null) {
            View view = (View)this.l.get();
            object = this.m;
            object = object != null ? (FrameLayout)object.get() : null;
            this.M(view, (FrameLayout)object);
        }
    }

    private void F() {
        Context context = (Context)this.a.get();
        if (context == null) {
            return;
        }
        h h8 = this.b;
        int n8 = this.y() ? this.e.m() : this.e.i();
        int n9 = this.y() ? this.e.l() : this.e.h();
        h8.setShapeAppearanceModel(ax.O6.l.b(context, n8, n9).m());
        this.invalidateSelf();
    }

    private void G() {
        e e8;
        Context context;
        block3: {
            block2: {
                context = (Context)this.a.get();
                if (context == null) break block2;
                e8 = new e(context, this.e.z());
                if (this.c.e() != e8) break block3;
            }
            return;
        }
        this.c.k(e8, context);
        this.H();
        this.N();
        this.invalidateSelf();
    }

    private void H() {
        this.c.g().setColor(this.e.j());
        this.invalidateSelf();
    }

    private void I() {
        this.O();
        this.c.l(true);
        this.N();
        this.invalidateSelf();
    }

    private void J() {
        this.setVisible(this.e.F(), false);
    }

    private void K() {
        this.F();
        this.G();
        this.I();
        this.D();
        this.B();
        this.C();
        this.H();
        this.E();
        this.N();
        this.J();
    }

    private static void L(View view) {
        view = (ViewGroup)view.getParent();
        view.setClipChildren(false);
        view.setClipToPadding(false);
    }

    private void N() {
        Context context = (Context)this.a.get();
        Object object = this.l;
        ViewGroup viewGroup = null;
        object = object != null ? (View)object.get() : null;
        if (context != null && object != null) {
            Rect rect = new Rect();
            rect.set(this.d);
            context = new Rect();
            object.getDrawingRect((Rect)context);
            WeakReference<FrameLayout> weakReference = this.m;
            if (weakReference != null) {
                viewGroup = (ViewGroup)weakReference.get();
            }
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(object, (Rect)context);
            }
            this.d((Rect)context, (View)object);
            ax.n6.d.d(this.d, this.f, this.g, this.j, this.k);
            float f8 = this.i;
            if (f8 != -1.0f) {
                this.b.c0(f8);
            }
            if (!rect.equals((Object)this.d)) {
                this.b.setBounds(this.d);
            }
        }
    }

    private void O() {
        if (this.m() != -2) {
            this.h = (int)Math.pow(10.0, (double)this.m() - 1.0) - 1;
            return;
        }
        this.h = this.n();
    }

    private void b(View view) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = frameLayout = this.j();
        if (frameLayout == null) {
            frameLayout2 = view.getParent();
        }
        if (frameLayout2 instanceof View && frameLayout2.getParent() instanceof View) {
            this.c(view, (View)frameLayout2.getParent());
        }
    }

    private void c(View view, View view2) {
        boolean bl;
        float f8;
        float f9;
        FrameLayout frameLayout = this.j();
        if (frameLayout == null) {
            f9 = view.getY();
            f8 = view.getX();
            view = view.getParent();
        } else {
            f9 = 0.0f;
            f8 = 0.0f;
            view = frameLayout;
        }
        while ((bl = view instanceof View) && view != view2 && (frameLayout = view.getParent()) instanceof ViewGroup && !((ViewGroup)frameLayout).getClipChildren()) {
            frameLayout = view;
            f9 += frameLayout.getY();
            f8 += frameLayout.getX();
            view = view.getParent();
        }
        if (bl) {
            float f10 = this.v(f9);
            float f11 = this.l(f8);
            f9 = this.h(view.getHeight(), f9);
            f8 = this.r(view.getWidth(), f8);
            if (f10 < 0.0f) {
                this.g += Math.abs(f10);
            }
            if (f11 < 0.0f) {
                this.f += Math.abs(f11);
            }
            if (f9 > 0.0f) {
                this.g -= Math.abs(f9);
            }
            if (f8 > 0.0f) {
                this.f -= Math.abs(f8);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void d(Rect rect, View view) {
        float f8 = this.y() ? this.e.d : this.e.c;
        this.i = f8;
        if (f8 != -1.0f) {
            this.j = f8;
            this.k = f8;
        } else {
            f8 = this.y() ? this.e.g : this.e.e;
            this.j = Math.round(f8 /= 2.0f);
            f8 = this.y() ? this.e.h : this.e.f;
            this.k = Math.round(f8 /= 2.0f);
        }
        if (this.y()) {
            String string = this.g();
            this.j = Math.max(this.j, this.c.h(string) / 2.0f + (float)this.e.g());
            this.k = f8 = Math.max(this.k, this.c.f(string) / 2.0f + (float)this.e.k());
            this.j = Math.max(this.j, f8);
        }
        int n8 = this.x();
        int n9 = this.e.f();
        this.g = n9 != 8388691 && n9 != 0x800055 ? (float)(rect.top + n8) : (float)(rect.bottom - n8);
        n8 = this.w();
        n9 = this.e.f();
        if (n9 != 0x800033 && n9 != 8388691) {
            f8 = this.e.l == 0 ? (view.getLayoutDirection() == 0 ? (float)rect.right + this.j - (float)n8 : (float)rect.left - this.j + (float)n8) : (view.getLayoutDirection() == 0 ? (float)rect.right - this.j + (this.k * 2.0f - (float)n8) : (float)rect.left + this.j - (this.k * 2.0f - (float)n8));
            this.f = f8;
        } else {
            f8 = this.e.l == 0 ? (view.getLayoutDirection() == 0 ? (float)rect.left + this.j - (this.k * 2.0f - (float)n8) : (float)rect.right - this.j + (this.k * 2.0f - (float)n8)) : (view.getLayoutDirection() == 0 ? (float)rect.left - this.j + (float)n8 : (float)rect.right + this.j - (float)n8);
            this.f = f8;
        }
        if (this.e.E()) {
            this.b(view);
            return;
        }
        this.c(view, null);
    }

    public static a e(Context context) {
        return new a(context, 0, o, n, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void f(Canvas canvas) {
        String string = this.g();
        if (string != null) {
            Rect rect = new Rect();
            this.c.g().getTextBounds(string, 0, string.length(), rect);
            float f8 = this.g - rect.exactCenterY();
            float f9 = this.f;
            int n8 = rect.bottom <= 0 ? (int)f8 : Math.round(f8);
            f8 = n8;
            canvas.drawText(string, f9, f8, (Paint)this.c.g());
        }
    }

    private String g() {
        if (this.A()) {
            return this.t();
        }
        if (this.z()) {
            return this.p();
        }
        return null;
    }

    private float h(float f8, float f9) {
        return this.g + this.k - f8 + f9;
    }

    private CharSequence k() {
        return this.e.p();
    }

    private float l(float f8) {
        return this.f - this.j + f8;
    }

    private String p() {
        if (this.h != -2 && this.o() > this.h) {
            Context context = (Context)this.a.get();
            if (context == null) {
                return "";
            }
            return String.format(this.e.x(), context.getString(ax.k6.k.p), this.h, "+");
        }
        return NumberFormat.getInstance(this.e.x()).format(this.o());
    }

    private String q() {
        if (this.e.q() != 0) {
            Context context = (Context)this.a.get();
            if (context == null) {
                return null;
            }
            if (this.h != -2 && this.o() > this.h) {
                return context.getString(this.e.n(), new Object[]{this.h});
            }
            return context.getResources().getQuantityString(this.e.q(), this.o(), new Object[]{this.o()});
        }
        return null;
    }

    private float r(float f8, float f9) {
        return this.f + this.j - f8 + f9;
    }

    private String t() {
        String string = this.s();
        int n8 = this.m();
        if (n8 != -2 && string != null && string.length() > n8) {
            Context context = (Context)this.a.get();
            if (context == null) {
                return "";
            }
            string = string.substring(0, n8 - 1);
            return String.format(context.getString(ax.k6.k.i), string, "\u2026");
        }
        return string;
    }

    private CharSequence u() {
        CharSequence charSequence = this.e.o();
        if (charSequence != null) {
            return charSequence;
        }
        return this.s();
    }

    private float v(float f8) {
        return this.g - this.k + f8;
    }

    private int w() {
        int n8 = this.y() ? this.e.r() : this.e.s();
        int n9 = n8;
        if (this.e.k == 1) {
            n9 = this.y() ? this.e.j : this.e.i;
            n9 = n8 + n9;
        }
        return n9 + this.e.b();
    }

    private int x() {
        int n8;
        int n9 = this.e.B();
        if (this.y()) {
            n8 = this.e.A();
            Context context = (Context)this.a.get();
            n9 = n8;
            if (context != null) {
                float f8 = ax.l6.a.b(0.0f, 1.0f, 0.3f, 1.0f, ax.K6.c.e(context) - 1.0f);
                n9 = ax.l6.a.c(n8, n8 - this.e.t(), f8);
            }
        }
        n8 = n9;
        if (this.e.k == 0) {
            n8 = n9 - Math.round(this.k);
        }
        return n8 + this.e.c();
    }

    private boolean y() {
        return this.A() || this.z();
        {
        }
    }

    public boolean A() {
        return this.e.D();
    }

    public void M(View view, FrameLayout frameLayout) {
        this.l = new WeakReference<View>(view);
        this.m = new WeakReference<FrameLayout>(frameLayout);
        ax.n6.a.L(view);
        this.N();
        this.invalidateSelf();
    }

    @Override
    public void a() {
        this.invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!this.getBounds().isEmpty() && this.getAlpha() != 0 && this.isVisible()) {
            this.b.draw(canvas);
            if (this.y()) {
                this.f(canvas);
            }
        }
    }

    public int getAlpha() {
        return this.e.d();
    }

    public int getIntrinsicHeight() {
        return this.d.height();
    }

    public int getIntrinsicWidth() {
        return this.d.width();
    }

    public int getOpacity() {
        return -3;
    }

    public CharSequence i() {
        if (!this.isVisible()) {
            return null;
        }
        if (this.A()) {
            return this.u();
        }
        if (this.z()) {
            return this.q();
        }
        return this.k();
    }

    public boolean isStateful() {
        return false;
    }

    public FrameLayout j() {
        WeakReference<FrameLayout> weakReference = this.m;
        if (weakReference != null) {
            return (FrameLayout)weakReference.get();
        }
        return null;
    }

    public int m() {
        return this.e.u();
    }

    public int n() {
        return this.e.v();
    }

    public int o() {
        if (this.e.C()) {
            return this.e.w();
        }
        return 0;
    }

    @Override
    public boolean onStateChange(int[] nArray) {
        return super.onStateChange(nArray);
    }

    public String s() {
        return this.e.y();
    }

    public void setAlpha(int n8) {
        this.e.H(n8);
        this.B();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean z() {
        return !this.e.D() && this.e.C();
    }
}

