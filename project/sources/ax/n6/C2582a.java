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
import android.view.ViewParent;
import android.widget.FrameLayout;
import ax.F6.u;
import ax.F6.w;
import ax.K6.e;
import ax.O6.h;
import ax.k6.C2402c;
import ax.k6.C2410k;
import ax.k6.l;
import ax.l6.C2472a;
import ax.n6.c;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import okhttp3.HttpUrl;

/* renamed from: ax.n6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2582a extends Drawable implements u.b {
    private static final int n = l.q;
    private static final int o = C2402c.a;
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

    private C2582a(Context context, int i, int i2, int i3, c.a aVar) {
        this.a = new WeakReference<>(context);
        w.c(context);
        this.d = new Rect();
        u uVar = new u(this);
        this.c = uVar;
        uVar.g().setTextAlign(Paint.Align.CENTER);
        c cVar = new c(context, i, i2, i3, aVar);
        this.e = cVar;
        this.b = new h(ax.O6.l.b(context, y() ? cVar.m() : cVar.i(), y() ? cVar.l() : cVar.h()).m());
        K();
    }

    private void B() {
        this.c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void C() {
        ColorStateList valueOf = ColorStateList.valueOf(this.e.e());
        if (this.b.B() != valueOf) {
            this.b.g0(valueOf);
            invalidateSelf();
        }
    }

    private void D() {
        this.c.l(true);
        F();
        N();
        invalidateSelf();
    }

    private void E() {
        WeakReference<View> weakReference = this.l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.l.get();
        WeakReference<FrameLayout> weakReference2 = this.m;
        M(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void F() {
        Context context = this.a.get();
        if (context == null) {
            return;
        }
        this.b.setShapeAppearanceModel(ax.O6.l.b(context, y() ? this.e.m() : this.e.i(), y() ? this.e.l() : this.e.h()).m());
        invalidateSelf();
    }

    private void G() {
        e eVar;
        Context context = this.a.get();
        if (context == null || this.c.e() == (eVar = new e(context, this.e.z()))) {
            return;
        }
        this.c.k(eVar, context);
        H();
        N();
        invalidateSelf();
    }

    private void H() {
        this.c.g().setColor(this.e.j());
        invalidateSelf();
    }

    private void I() {
        O();
        this.c.l(true);
        N();
        invalidateSelf();
    }

    private void J() {
        setVisible(this.e.F(), false);
    }

    private void K() {
        F();
        G();
        I();
        D();
        B();
        C();
        H();
        E();
        N();
        J();
    }

    private static void L(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void N() {
        Context context = this.a.get();
        WeakReference<View> weakReference = this.l;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.m;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        d(rect2, view);
        d.d(this.d, this.f, this.g, this.j, this.k);
        float f = this.i;
        if (f != -1.0f) {
            this.b.c0(f);
        }
        if (rect.equals(this.d)) {
            return;
        }
        this.b.setBounds(this.d);
    }

    private void O() {
        if (m() != -2) {
            this.h = ((int) Math.pow(10.0d, m() - 1.0d)) - 1;
        } else {
            this.h = n();
        }
    }

    private void b(View view) {
        ViewParent j = j();
        if (j == null) {
            j = view.getParent();
        }
        if ((j instanceof View) && (j.getParent() instanceof View)) {
            c(view, (View) j.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v9 */
    private void c(View view, View view2) {
        float f;
        float f2;
        View view3;
        boolean z;
        FrameLayout j = j();
        if (j == null) {
            float y = view.getY();
            f2 = view.getX();
            view3 = view.getParent();
            f = y;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            view3 = j;
        }
        while (true) {
            z = view3 instanceof View;
            if (!z || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f += view4.getY();
            f2 += view4.getX();
            view3 = view3.getParent();
        }
        if (z) {
            float v = v(f);
            float l = l(f2);
            View view5 = view3;
            float h = h(view5.getHeight(), f);
            float r = r(view5.getWidth(), f2);
            if (v < 0.0f) {
                this.g += Math.abs(v);
            }
            if (l < 0.0f) {
                this.f += Math.abs(l);
            }
            if (h > 0.0f) {
                this.g -= Math.abs(h);
            }
            if (r > 0.0f) {
                this.f -= Math.abs(r);
            }
        }
    }

    private void d(Rect rect, View view) {
        float f = y() ? this.e.d : this.e.c;
        this.i = f;
        if (f != -1.0f) {
            this.j = f;
            this.k = f;
        } else {
            this.j = Math.round((y() ? this.e.g : this.e.e) / 2.0f);
            this.k = Math.round((y() ? this.e.h : this.e.f) / 2.0f);
        }
        if (y()) {
            String g = g();
            this.j = Math.max(this.j, (this.c.h(g) / 2.0f) + this.e.g());
            float max = Math.max(this.k, (this.c.f(g) / 2.0f) + this.e.k());
            this.k = max;
            this.j = Math.max(this.j, max);
        }
        int x = x();
        int f2 = this.e.f();
        if (f2 == 8388691 || f2 == 8388693) {
            this.g = rect.bottom - x;
        } else {
            this.g = rect.top + x;
        }
        int w = w();
        int f3 = this.e.f();
        if (f3 == 8388659 || f3 == 8388691) {
            this.f = this.e.l == 0 ? view.getLayoutDirection() == 0 ? (rect.left + this.j) - ((this.k * 2.0f) - w) : (rect.right - this.j) + ((this.k * 2.0f) - w) : view.getLayoutDirection() == 0 ? (rect.left - this.j) + w : (rect.right + this.j) - w;
        } else {
            this.f = this.e.l == 0 ? view.getLayoutDirection() == 0 ? (rect.right + this.j) - w : (rect.left - this.j) + w : view.getLayoutDirection() == 0 ? (rect.right - this.j) + ((this.k * 2.0f) - w) : (rect.left + this.j) - ((this.k * 2.0f) - w);
        }
        if (this.e.E()) {
            b(view);
        } else {
            c(view, null);
        }
    }

    public static C2582a e(Context context) {
        return new C2582a(context, 0, o, n, null);
    }

    private void f(Canvas canvas) {
        String g = g();
        if (g != null) {
            Rect rect = new Rect();
            this.c.g().getTextBounds(g, 0, g.length(), rect);
            float exactCenterY = this.g - rect.exactCenterY();
            canvas.drawText(g, this.f, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), this.c.g());
        }
    }

    private String g() {
        if (A()) {
            return t();
        }
        if (z()) {
            return p();
        }
        return null;
    }

    private float h(float f, float f2) {
        return ((this.g + this.k) - f) + f2;
    }

    private CharSequence k() {
        return this.e.p();
    }

    private float l(float f) {
        return (this.f - this.j) + f;
    }

    private String p() {
        if (this.h == -2 || o() <= this.h) {
            return NumberFormat.getInstance(this.e.x()).format(o());
        }
        Context context = this.a.get();
        return context == null ? HttpUrl.FRAGMENT_ENCODE_SET : String.format(this.e.x(), context.getString(C2410k.p), Integer.valueOf(this.h), "+");
    }

    private String q() {
        Context context;
        if (this.e.q() == 0 || (context = this.a.get()) == null) {
            return null;
        }
        return (this.h == -2 || o() <= this.h) ? context.getResources().getQuantityString(this.e.q(), o(), Integer.valueOf(o())) : context.getString(this.e.n(), Integer.valueOf(this.h));
    }

    private float r(float f, float f2) {
        return ((this.f + this.j) - f) + f2;
    }

    private String t() {
        String s = s();
        int m = m();
        if (m == -2 || s == null || s.length() <= m) {
            return s;
        }
        Context context = this.a.get();
        if (context == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return String.format(context.getString(C2410k.i), s.substring(0, m - 1), "…");
    }

    private CharSequence u() {
        CharSequence o2 = this.e.o();
        return o2 != null ? o2 : s();
    }

    private float v(float f) {
        return (this.g - this.k) + f;
    }

    private int w() {
        int r = y() ? this.e.r() : this.e.s();
        if (this.e.k == 1) {
            r += y() ? this.e.j : this.e.i;
        }
        return r + this.e.b();
    }

    private int x() {
        int B = this.e.B();
        if (y()) {
            B = this.e.A();
            Context context = this.a.get();
            if (context != null) {
                B = C2472a.c(B, B - this.e.t(), C2472a.b(0.0f, 1.0f, 0.3f, 1.0f, ax.K6.c.e(context) - 1.0f));
            }
        }
        if (this.e.k == 0) {
            B -= Math.round(this.k);
        }
        return B + this.e.c();
    }

    private boolean y() {
        return A() || z();
    }

    public boolean A() {
        return this.e.D();
    }

    public void M(View view, FrameLayout frameLayout) {
        this.l = new WeakReference<>(view);
        this.m = new WeakReference<>(frameLayout);
        L(view);
        N();
        invalidateSelf();
    }

    @Override // ax.F6.u.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.b.draw(canvas);
        if (y()) {
            f(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public CharSequence i() {
        if (isVisible()) {
            return A() ? u() : z() ? q() : k();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public FrameLayout j() {
        WeakReference<FrameLayout> weakReference = this.m;
        if (weakReference != null) {
            return weakReference.get();
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

    @Override // android.graphics.drawable.Drawable, ax.F6.u.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public String s() {
        return this.e.y();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.e.H(i);
        B();
    }

    public boolean z() {
        return !this.e.D() && this.e.C();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
