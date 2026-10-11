package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import ax.p.C2745a;
import ax.q.C2829a;
import ax.q.C2830b;
import ax.w2.C3333e;
import ax.w2.C3338j;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class C {
    private static C i;
    private WeakHashMap<Context, ax.B.l<ColorStateList>> a;
    private ax.B.k<String, e> b;
    private ax.B.l<String> c;
    private final WeakHashMap<Context, ax.B.h<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    private TypedValue e;
    private boolean f;
    private f g;
    private static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    private static final c j = new c(6);

    static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.C.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C2745a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    private static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.C.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3333e.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    private static class c extends ax.B.j<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        private static int j(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter k(int i, PorterDuff.Mode mode) {
            return c(Integer.valueOf(j(i, mode)));
        }

        PorterDuffColorFilter l(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(j(i, mode)), porterDuffColorFilter);
        }
    }

    static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.C.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    C2829a.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    private interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
        boolean a(Context context, int i, Drawable drawable);

        PorterDuff.Mode b(int i);

        Drawable c(C c, Context context, int i);

        ColorStateList d(Context context, int i);

        boolean e(Context context, int i, Drawable drawable);
    }

    private static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.C.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3338j.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.b == null) {
            this.b = new ax.B.k<>();
        }
        this.b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            ax.B.h<WeakReference<Drawable.ConstantState>> hVar = this.d.get(context);
            if (hVar == null) {
                hVar = new ax.B.h<>();
                this.d.put(context, hVar);
            }
            hVar.k(j2, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        ax.B.l<ColorStateList> lVar = this.a.get(context);
        if (lVar == null) {
            lVar = new ax.B.l<>();
            this.a.put(context, lVar);
        }
        lVar.b(i2, colorStateList);
    }

    private void d(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable j2 = j(context, C2830b.a);
        if (j2 == null || !q(j2)) {
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        f fVar = this.g;
        Drawable c2 = fVar == null ? null : fVar.c(this, context, i2);
        if (c2 != null) {
            c2.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e2, c2);
        }
        return c2;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized C h() {
        C c2;
        synchronized (C.class) {
            try {
                if (i == null) {
                    C c3 = new C();
                    i = c3;
                    p(c3);
                }
                c2 = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2;
    }

    private synchronized Drawable i(Context context, long j2) {
        ax.B.h<WeakReference<Drawable.ConstantState>> hVar = this.d.get(context);
        if (hVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> f2 = hVar.f(j2);
        if (f2 != null) {
            Drawable.ConstantState constantState = f2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            hVar.l(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter k;
        synchronized (C.class) {
            c cVar = j;
            k = cVar.k(i2, mode);
            if (k == null) {
                k = new PorterDuffColorFilter(i2, mode);
                cVar.l(i2, mode, k);
            }
        }
        return k;
    }

    private ColorStateList n(Context context, int i2) {
        ax.B.l<ColorStateList> lVar;
        WeakHashMap<Context, ax.B.l<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap == null || (lVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return lVar.f(i2);
    }

    private static void p(C c2) {
        if (Build.VERSION.SDK_INT < 24) {
            c2.a("vector", new g());
            c2.a("animated-vector", new b());
            c2.a("animated-selector", new a());
            c2.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof C3338j) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i2) {
        int next;
        ax.B.k<String, e> kVar = this.b;
        if (kVar == null || kVar.isEmpty()) {
            return null;
        }
        ax.B.l<String> lVar = this.c;
        if (lVar != null) {
            String f2 = lVar.f(i2);
            if ("appcompat_skip_skip".equals(f2) || (f2 != null && this.b.get(f2) == null)) {
                return null;
            }
        } else {
            this.c = new ax.B.l<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.c.b(i2, name);
                e eVar = this.b.get(name);
                if (eVar != null) {
                    i3 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i3 != null) {
                    i3.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e2, i3);
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
        }
        if (i3 == null) {
            this.c.b(i2, "appcompat_skip_skip");
        }
        return i3;
    }

    private Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList m = m(context, i2);
        if (m != null) {
            Drawable r = ax.U.a.r(drawable.mutate());
            ax.U.a.o(r, m);
            PorterDuff.Mode o = o(i2);
            if (o != null) {
                ax.U.a.p(r, o);
            }
            return r;
        }
        f fVar = this.g;
        if ((fVar == null || !fVar.e(context, i2, drawable)) && !x(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    static void w(Drawable drawable, J j2, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = j2.d;
        if (z || j2.c) {
            drawable.setColorFilter(g(z ? j2.a : null, j2.c ? j2.b : h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable r;
        try {
            d(context);
            r = r(context, i2);
            if (r == null) {
                r = f(context, i2);
            }
            if (r == null) {
                r = ax.Q.b.e(context, i2);
            }
            if (r != null) {
                r = v(context, i2, z, r);
            }
            if (r != null) {
                A.b(r);
            }
        } catch (Throwable th) {
            throw th;
        }
        return r;
    }

    synchronized ColorStateList m(Context context, int i2) {
        ColorStateList n;
        n = n(context, i2);
        if (n == null) {
            f fVar = this.g;
            n = fVar == null ? null : fVar.d(context, i2);
            if (n != null) {
                c(context, i2, n);
            }
        }
        return n;
    }

    PorterDuff.Mode o(int i2) {
        f fVar = this.g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i2);
    }

    public synchronized void s(Context context) {
        ax.B.h<WeakReference<Drawable.ConstantState>> hVar = this.d.get(context);
        if (hVar != null) {
            hVar.c();
        }
    }

    synchronized Drawable t(Context context, N n, int i2) {
        try {
            Drawable r = r(context, i2);
            if (r == null) {
                r = n.a(i2);
            }
            if (r == null) {
                return null;
            }
            return v(context, i2, false, r);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void u(f fVar) {
        this.g = fVar;
    }

    boolean x(Context context, int i2, Drawable drawable) {
        f fVar = this.g;
        return fVar != null && fVar.a(context, i2, drawable);
    }
}
