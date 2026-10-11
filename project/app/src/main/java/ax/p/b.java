/*
 * Decompiled with CFR 0.152.
 */
package ax.p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import ax.U.a;

public class b
extends Drawable
implements Drawable.Callback {
    private d a;
    private Rect b;
    private Drawable c;
    private Drawable d;
    private int e = 255;
    private boolean f;
    private int g = -1;
    private boolean h;
    private Runnable i;
    private long j;
    private long k;
    private c l;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d(Drawable drawable) {
        Throwable throwable2;
        block10: {
            block9: {
                if (this.l == null) {
                    this.l = new c();
                }
                drawable.setCallback((Drawable.Callback)this.l.b(drawable.getCallback()));
                try {
                    if (this.a.A > 0 || !this.f) break block9;
                    drawable.setAlpha(this.e);
                }
                catch (Throwable throwable2) {
                    break block10;
                }
            }
            d d8 = this.a;
            if (d8.E) {
                drawable.setColorFilter(d8.D);
            } else {
                if (d8.H) {
                    ax.U.a.o(drawable, d8.F);
                }
                d8 = this.a;
                if (d8.I) {
                    ax.U.a.p(drawable, d8.G);
                }
            }
            drawable.setVisible(this.isVisible(), true);
            drawable.setDither(this.a.x);
            drawable.setState(this.getState());
            drawable.setLevel(this.getLevel());
            drawable.setBounds(this.getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                ax.U.a.m(drawable, ax.U.a.f(this));
            }
            ax.U.a.j(drawable, this.a.C);
            d8 = this.b;
            if (d8 != null) {
                ax.U.a.l(drawable, ((Rect)d8).left, ((Rect)d8).top, ((Rect)d8).right, ((Rect)d8).bottom);
            }
            drawable.setCallback(this.l.a());
            return;
        }
        drawable.setCallback(this.l.a());
        throw throwable2;
    }

    private boolean e() {
        return this.isAutoMirrored() && ax.U.a.f(this) == 1;
    }

    static int f(Resources resources, int n8) {
        if (resources != null) {
            n8 = resources.getDisplayMetrics().densityDpi;
        }
        if (n8 == 0) {
            return 160;
        }
        return n8;
    }

    void a(boolean bl) {
        boolean bl2;
        long l8;
        Drawable drawable;
        long l9;
        boolean bl3;
        block9: {
            block7: {
                block6: {
                    block8: {
                        bl3 = true;
                        this.f = true;
                        l9 = SystemClock.uptimeMillis();
                        drawable = this.c;
                        if (drawable == null) break block6;
                        l8 = this.j;
                        if (l8 == 0L) break block7;
                        if (l8 > l9) break block8;
                        drawable.setAlpha(this.e);
                        this.j = 0L;
                        break block7;
                    }
                    drawable.setAlpha((255 - (int)((l8 - l9) * 255L) / this.a.A) * this.e / 255);
                    bl2 = true;
                    break block9;
                }
                this.j = 0L;
            }
            bl2 = false;
        }
        drawable = this.d;
        if (drawable != null) {
            l8 = this.k;
            if (l8 != 0L) {
                if (l8 <= l9) {
                    drawable.setVisible(false, false);
                    this.d = null;
                    this.k = 0L;
                } else {
                    drawable.setAlpha((int)((l8 - l9) * 255L) / this.a.B * this.e / 255);
                    bl2 = bl3;
                }
            }
        } else {
            this.k = 0L;
        }
        if (bl && bl2) {
            this.scheduleSelf(this.i, l9 + 16L);
        }
    }

    public void applyTheme(Resources.Theme theme) {
        this.a.b(theme);
    }

    d b() {
        throw null;
    }

    int c() {
        return this.g;
    }

    public boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if ((drawable = this.d) != null) {
            drawable.draw(canvas);
        }
    }

    /*
     * Unable to fully structure code
     */
    boolean g(int var1_1) {
        if (var1_1 == this.g) {
            return false;
        }
        var2_2 = SystemClock.uptimeMillis();
        if (this.a.B > 0) {
            var4_3 = this.d;
            if (var4_3 != null) {
                var4_3.setVisible(false, false);
            }
            if ((var4_3 = this.c) != null) {
                this.d = var4_3;
                this.k = (long)this.a.B + var2_2;
            } else {
                this.d = null;
                this.k = 0L;
            }
        } else {
            var4_3 = this.c;
            if (var4_3 != null) {
                var4_3.setVisible(false, false);
            }
        }
        if (var1_1 < 0) ** GOTO lbl-1000
        var4_3 = this.a;
        if (var1_1 < var4_3.h) {
            var4_3 = var4_3.g(var1_1);
            this.c = var4_3;
            this.g = var1_1;
            if (var4_3 != null) {
                var1_1 = this.a.A;
                if (var1_1 > 0) {
                    this.j = var2_2 + (long)var1_1;
                }
                this.d((Drawable)var4_3);
            }
        } else lbl-1000:
        // 2 sources

        {
            this.c = null;
            this.g = -1;
        }
        if (this.j != 0L || this.k != 0L) {
            var4_3 = this.i;
            if (var4_3 == null) {
                this.i = new Runnable(this){
                    final b q;
                    {
                        this.q = b8;
                    }

                    @Override
                    public void run() {
                        this.q.a(true);
                        this.q.invalidateSelf();
                    }
                };
            } else {
                this.unscheduleSelf((Runnable)var4_3);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }

    public int getAlpha() {
        return this.e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.a.c()) {
            this.a.d = this.getChangingConfigurations();
            return this.a;
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
            return;
        }
        super.getHotspotBounds(rect);
    }

    public int getIntrinsicHeight() {
        if (this.a.q()) {
            return this.a.i();
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.a.q()) {
            return this.a.m();
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.a.q()) {
            return this.a.j();
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.a.q()) {
            return this.a.k();
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.c;
        if (drawable != null && drawable.isVisible()) {
            return this.a.n();
        }
        return -2;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            ax.p.b$b.b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean bl;
        int n8;
        Rect rect2 = this.a.l();
        if (rect2 != null) {
            rect.set(rect2);
            n8 = rect2.left;
            int n9 = rect2.top;
            int n10 = rect2.bottom;
            bl = (rect2.right | (n8 | n9 | n10)) != 0;
        } else {
            rect2 = this.c;
            bl = rect2 != null ? rect2.getPadding(rect) : super.getPadding(rect);
        }
        if (this.e()) {
            n8 = rect.left;
            rect.left = rect.right;
            rect.right = n8;
        }
        return bl;
    }

    void h(d d8) {
        this.a = d8;
        int n8 = this.g;
        if (n8 >= 0) {
            d8 = d8.g(n8);
            this.c = d8;
            if (d8 != null) {
                this.d((Drawable)d8);
            }
        }
        this.d = null;
    }

    final void i(Resources resources) {
        this.a.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d d8 = this.a;
        if (d8 != null) {
            d8.p();
        }
        if (drawable == this.c && this.getCallback() != null) {
            this.getCallback().invalidateDrawable((Drawable)this);
        }
    }

    public boolean isAutoMirrored() {
        return this.a.C;
    }

    public void jumpToCurrentState() {
        boolean bl;
        Drawable drawable = this.d;
        boolean bl2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            bl = true;
        } else {
            bl = false;
        }
        drawable = this.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.k != 0L) {
            this.k = 0L;
            bl = true;
        }
        if (this.j != 0L) {
            this.j = 0L;
            bl = bl2;
        }
        if (bl) {
            this.invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            d d8 = this.b();
            d8.r();
            this.h(d8);
            this.h = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        if ((drawable = this.c) != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int n8) {
        return this.a.w(n8, this.c());
    }

    protected boolean onLevelChange(int n8) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(n8);
        }
        drawable = this.c;
        if (drawable != null) {
            return drawable.setLevel(n8);
        }
        return false;
    }

    protected boolean onStateChange(int[] nArray) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setState(nArray);
        }
        drawable = this.c;
        if (drawable != null) {
            return drawable.setState(nArray);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable2, long l8) {
        if (drawable == this.c && this.getCallback() != null) {
            this.getCallback().scheduleDrawable((Drawable)this, runnable2, l8);
        }
    }

    public void setAlpha(int n8) {
        if (!this.f || this.e != n8) {
            this.f = true;
            this.e = n8;
            Drawable drawable = this.c;
            if (drawable != null) {
                if (this.j == 0L) {
                    drawable.setAlpha(n8);
                    return;
                }
                this.a(false);
            }
        }
    }

    public void setAutoMirrored(boolean bl) {
        d d8 = this.a;
        if (d8.C != bl) {
            d8.C = bl;
            d8 = this.c;
            if (d8 != null) {
                ax.U.a.j((Drawable)d8, bl);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        d d8 = this.a;
        d8.E = true;
        if (d8.D != colorFilter) {
            d8.D = colorFilter;
            d8 = this.c;
            if (d8 != null) {
                d8.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean bl) {
        d d8 = this.a;
        if (d8.x != bl) {
            d8.x = bl;
            d8 = this.c;
            if (d8 != null) {
                d8.setDither(bl);
            }
        }
    }

    public void setHotspot(float f8, float f9) {
        Drawable drawable = this.c;
        if (drawable != null) {
            ax.U.a.k(drawable, f8, f9);
        }
    }

    public void setHotspotBounds(int n8, int n9, int n10, int n11) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(n8, n9, n10, n11);
        } else {
            rect.set(n8, n9, n10, n11);
        }
        rect = this.c;
        if (rect != null) {
            ax.U.a.l((Drawable)rect, n8, n9, n10, n11);
        }
    }

    public void setTint(int n8) {
        this.setTintList(ColorStateList.valueOf((int)n8));
    }

    public void setTintList(ColorStateList colorStateList) {
        d d8 = this.a;
        d8.H = true;
        if (d8.F != colorStateList) {
            d8.F = colorStateList;
            ax.U.a.o(this.c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        d d8 = this.a;
        d8.I = true;
        if (d8.G != mode) {
            d8.G = mode;
            ax.U.a.p(this.c, mode);
        }
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        boolean bl3 = super.setVisible(bl, bl2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(bl, bl2);
        }
        if ((drawable = this.c) != null) {
            drawable.setVisible(bl, bl2);
        }
        return bl3;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable2) {
        if (drawable == this.c && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable((Drawable)this, runnable2);
        }
    }

    private static class b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    static class c
    implements Drawable.Callback {
        private Drawable.Callback a;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.a;
            this.a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.a = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable2, long l8) {
            Drawable.Callback callback = this.a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable2, l8);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable2) {
            Drawable.Callback callback = this.a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable2);
            }
        }
    }

    static abstract class d
    extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;
        final b a;
        Resources b;
        int c;
        int d;
        int e;
        SparseArray<Drawable.ConstantState> f;
        Drawable[] g;
        int h;
        boolean i;
        boolean j;
        Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        d(d rect, b object, Resources resources) {
            int n8 = 0;
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = object;
            Object var7_5 = null;
            object = resources != null ? resources : (rect != null ? rect.b : null);
            this.b = object;
            int n9 = rect != null ? rect.c : 0;
            this.c = n9 = ax.p.b.f(resources, n9);
            if (rect != null) {
                this.d = rect.d;
                this.e = rect.e;
                this.v = true;
                this.w = true;
                this.i = rect.i;
                this.l = rect.l;
                this.x = rect.x;
                this.y = rect.y;
                this.z = rect.z;
                this.A = rect.A;
                this.B = rect.B;
                this.C = rect.C;
                this.D = rect.D;
                this.E = rect.E;
                this.F = rect.F;
                this.G = rect.G;
                this.H = rect.H;
                this.I = rect.I;
                if (rect.c == n9) {
                    if (rect.j) {
                        object = var7_5;
                        if (rect.k != null) {
                            object = new Rect(rect.k);
                        }
                        this.k = object;
                        this.j = true;
                    }
                    if (rect.m) {
                        this.n = rect.n;
                        this.o = rect.o;
                        this.p = rect.p;
                        this.q = rect.q;
                        this.m = true;
                    }
                }
                if (rect.r) {
                    this.s = rect.s;
                    this.r = true;
                }
                if (rect.t) {
                    this.u = rect.u;
                    this.t = true;
                }
                object = rect.g;
                this.g = new Drawable[((Drawable[])object).length];
                this.h = rect.h;
                rect = rect.f;
                this.f = rect != null ? rect.clone() : new SparseArray(this.h);
                int n10 = this.h;
                for (n9 = n8; n9 < n10; ++n9) {
                    rect = object[n9];
                    if (rect == null) continue;
                    if ((rect = rect.getConstantState()) != null) {
                        this.f.put(n9, (Object)rect);
                        continue;
                    }
                    this.g[n9] = object[n9];
                }
                return;
            }
            this.g = new Drawable[10];
            this.h = 0;
        }

        private void e() {
            Drawable.ConstantState constantState = this.f;
            if (constantState != null) {
                int n8 = constantState.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    int n9 = this.f.keyAt(i8);
                    constantState = (Drawable.ConstantState)this.f.valueAt(i8);
                    this.g[n9] = this.s(constantState.newDrawable(this.b));
                }
                this.f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                ax.U.a.m(drawable, this.z);
            }
            drawable = drawable.mutate();
            drawable.setCallback((Drawable.Callback)this.a);
            return drawable;
        }

        public final int a(Drawable drawable) {
            int n8 = this.h;
            if (n8 >= this.g.length) {
                this.o(n8, n8 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback((Drawable.Callback)this.a);
            this.g[n8] = drawable;
            ++this.h;
            int n9 = this.e;
            this.e = drawable.getChangingConfigurations() | n9;
            this.p();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return n8;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                this.e();
                int n8 = this.h;
                Drawable[] drawableArray = this.g;
                for (int i8 = 0; i8 < n8; ++i8) {
                    Drawable drawable = drawableArray[i8];
                    if (drawable == null || !ax.U.a.b(drawable)) continue;
                    ax.U.a.a(drawableArray[i8], theme);
                    this.e |= drawableArray[i8].getChangingConfigurations();
                }
                this.y(ax.p.b$b.c(theme));
            }
        }

        public boolean c() {
            if (this.v) {
                return this.w;
            }
            this.e();
            this.v = true;
            int n8 = this.h;
            Drawable[] drawableArray = this.g;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (drawableArray[i8].getConstantState() != null) continue;
                this.w = false;
                return false;
            }
            this.w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int n8 = this.h;
            Drawable[] drawableArray = this.g;
            for (int i8 = 0; i8 < n8; ++i8) {
                Drawable drawable = drawableArray[i8];
                if (!(drawable != null ? ax.U.a.b(drawable) : (drawable = (Drawable.ConstantState)this.f.get(i8)) != null && ax.p.b$b.a((Drawable.ConstantState)drawable))) continue;
                return true;
            }
            return false;
        }

        protected void d() {
            this.m = true;
            this.e();
            int n8 = this.h;
            Drawable[] drawableArray = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                Drawable drawable = drawableArray[i8];
                int n9 = drawable.getIntrinsicWidth();
                if (n9 > this.n) {
                    this.n = n9;
                }
                if ((n9 = drawable.getIntrinsicHeight()) > this.o) {
                    this.o = n9;
                }
                if ((n9 = drawable.getMinimumWidth()) > this.p) {
                    this.p = n9;
                }
                if ((n9 = drawable.getMinimumHeight()) <= this.q) continue;
                this.q = n9;
            }
        }

        final int f() {
            return this.g.length;
        }

        public final Drawable g(int n8) {
            int n9;
            Drawable drawable = this.g[n8];
            if (drawable != null) {
                return drawable;
            }
            drawable = this.f;
            if (drawable != null && (n9 = drawable.indexOfKey(n8)) >= 0) {
                this.g[n8] = drawable = this.s(((Drawable.ConstantState)this.f.valueAt(n9)).newDrawable(this.b));
                this.f.removeAt(n9);
                if (this.f.size() == 0) {
                    this.f = null;
                }
                return drawable;
            }
            return null;
        }

        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final int h() {
            return this.h;
        }

        public final int i() {
            if (!this.m) {
                this.d();
            }
            return this.o;
        }

        public final int j() {
            if (!this.m) {
                this.d();
            }
            return this.q;
        }

        public final int k() {
            if (!this.m) {
                this.d();
            }
            return this.p;
        }

        public final Rect l() {
            boolean bl = this.i;
            Rect rect = null;
            if (bl) {
                return null;
            }
            Rect rect2 = this.k;
            if (rect2 == null && !this.j) {
                this.e();
                Rect rect3 = new Rect();
                int n8 = this.h;
                Drawable[] drawableArray = this.g;
                for (int i8 = 0; i8 < n8; ++i8) {
                    Rect rect4 = rect;
                    if (drawableArray[i8].getPadding(rect3)) {
                        int n9;
                        rect2 = rect;
                        if (rect == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        if ((n9 = rect3.left) > rect2.left) {
                            rect2.left = n9;
                        }
                        if ((n9 = rect3.top) > rect2.top) {
                            rect2.top = n9;
                        }
                        if ((n9 = rect3.right) > rect2.right) {
                            rect2.right = n9;
                        }
                        n9 = rect3.bottom;
                        rect4 = rect2;
                        if (n9 > rect2.bottom) {
                            rect2.bottom = n9;
                            rect4 = rect2;
                        }
                    }
                    rect = rect4;
                }
                this.j = true;
                this.k = rect;
                return rect;
            }
            return rect2;
        }

        public final int m() {
            if (!this.m) {
                this.d();
            }
            return this.n;
        }

        public final int n() {
            if (this.r) {
                return this.s;
            }
            this.e();
            int n8 = this.h;
            Drawable[] drawableArray = this.g;
            int n9 = n8 > 0 ? drawableArray[0].getOpacity() : -2;
            for (int i8 = 1; i8 < n8; ++i8) {
                n9 = Drawable.resolveOpacity((int)n9, (int)drawableArray[i8].getOpacity());
            }
            this.s = n9;
            this.r = true;
            return n9;
        }

        public void o(int n8, int n9) {
            Drawable[] drawableArray = new Drawable[n9];
            Drawable[] drawableArray2 = this.g;
            if (drawableArray2 != null) {
                System.arraycopy(drawableArray2, 0, drawableArray, 0, n8);
            }
            this.g = drawableArray;
        }

        void p() {
            this.r = false;
            this.t = false;
        }

        public final boolean q() {
            return this.l;
        }

        abstract void r();

        public final void t(boolean bl) {
            this.l = bl;
        }

        public final void u(int n8) {
            this.A = n8;
        }

        public final void v(int n8) {
            this.B = n8;
        }

        final boolean w(int n8, int n9) {
            int n10 = this.h;
            Drawable[] drawableArray = this.g;
            boolean bl = false;
            for (int i8 = 0; i8 < n10; ++i8) {
                Drawable drawable = drawableArray[i8];
                boolean bl2 = bl;
                if (drawable != null) {
                    boolean bl3 = Build.VERSION.SDK_INT >= 23 ? ax.U.a.m(drawable, n8) : false;
                    bl2 = bl;
                    if (i8 == n9) {
                        bl2 = bl3;
                    }
                }
                bl = bl2;
            }
            this.z = n8;
            return bl;
        }

        public final void x(boolean bl) {
            this.i = bl;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int n8 = ax.p.b.f(resources, this.c);
                int n9 = this.c;
                this.c = n8;
                if (n9 != n8) {
                    this.m = false;
                    this.j = false;
                }
            }
        }
    }
}

