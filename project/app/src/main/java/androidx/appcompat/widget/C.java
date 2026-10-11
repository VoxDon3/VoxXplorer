/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.N;
import ax.B.h;
import ax.B.k;
import ax.B.l;
import ax.w2.j;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class C {
    private static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    private static C i;
    private static final c j;
    private WeakHashMap<Context, l<ColorStateList>> a;
    private k<String, e> b;
    private l<String> c;
    private final WeakHashMap<Context, h<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private f g;

    static {
        j = new c(6);
    }

    private void a(String string, e e8) {
        if (this.b == null) {
            this.b = new k();
        }
        this.b.put(string, e8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean b(Context object, long l8, Drawable object2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block4: {
                    Drawable.ConstantState constantState;
                    block5: {
                        try {
                            constantState = object2.getConstantState();
                            if (constantState == null) break block4;
                            h<WeakReference<Drawable.ConstantState>> h8 = this.d.get(object);
                            object2 = h8;
                            if (h8 != null) break block5;
                            object2 = new h();
                            this.d.put((Context)object, (h<WeakReference<Drawable.ConstantState>>)object2);
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    object = new WeakReference(constantState);
                    ((h)object2).k(l8, object);
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    private void c(Context context, int n8, ColorStateList colorStateList) {
        l<ColorStateList> l8;
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        l<Object> l9 = l8 = this.a.get(context);
        if (l8 == null) {
            l9 = new l();
            this.a.put(context, l9);
        }
        l9.b(n8, colorStateList);
    }

    private void d(Context context) {
        block3: {
            block2: {
                if (this.f) break block2;
                this.f = true;
                if ((context = this.j(context, ax.q.b.a)) == null || !C.q((Drawable)context)) break block3;
            }
            return;
        }
        this.f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    private static long e(TypedValue typedValue) {
        return (long)typedValue.assetCookie << 32 | (long)typedValue.data;
    }

    private Drawable f(Context context, int n8) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(n8, typedValue, true);
        long l8 = C.e(typedValue);
        Object object = this.i(context, l8);
        if (object != null) {
            return object;
        }
        object = this.g;
        object = object == null ? null : object.c(this, context, n8);
        if (object != null) {
            object.setChangingConfigurations(typedValue.changingConfigurations);
            this.b(context, l8, (Drawable)object);
        }
        return object;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] nArray) {
        if (colorStateList != null && mode != null) {
            return C.l(colorStateList.getColorForState(nArray, 0), mode);
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static C h() {
        synchronized (C.class) {
            try {
                C c8;
                if (i != null) return i;
                i = c8 = new C();
                C.p(c8);
                return i;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Drawable i(Context context, long l8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                h<WeakReference<Drawable.ConstantState>> h8;
                block5: {
                    try {
                        h8 = this.d.get(context);
                        if (h8 != null) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return null;
                }
                Drawable.ConstantState constantState = h8.f(l8);
                if (constantState == null) return null;
                if ((constantState = (Drawable.ConstantState)constantState.get()) != null) {
                    return constantState.newDrawable(context.getResources());
                }
                h8.l(l8);
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static PorterDuffColorFilter l(int n8, PorterDuff.Mode mode) {
        synchronized (C.class) {
            Throwable throwable2;
            block5: {
                PorterDuffColorFilter porterDuffColorFilter;
                block4: {
                    try {
                        PorterDuffColorFilter porterDuffColorFilter2;
                        c c8 = j;
                        porterDuffColorFilter = porterDuffColorFilter2 = c8.k(n8, mode);
                        if (porterDuffColorFilter2 != null) break block4;
                        porterDuffColorFilter = new PorterDuffColorFilter(n8, mode);
                        c8.l(n8, mode, porterDuffColorFilter);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return porterDuffColorFilter;
            }
            throw throwable2;
        }
    }

    private ColorStateList n(Context object, int n8) {
        WeakHashMap<Context, l<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap != null && (object = weakHashMap.get(object)) != null) {
            return (ColorStateList)((l)object).f(n8);
        }
        return null;
    }

    private static void p(C c8) {
        if (Build.VERSION.SDK_INT < 24) {
            c8.a("vector", new g());
            c8.a("animated-vector", new b());
            c8.a("animated-selector", new a());
            c8.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return drawable instanceof j || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Drawable r(Context context, int n8) {
        block15: {
            Object object;
            block16: {
                Object object2 = this.b;
                if (object2 == null || ((k)object2).isEmpty()) break block15;
                object2 = this.c;
                if (object2 != null) {
                    if ("appcompat_skip_skip".equals(object2 = (String)((l)object2).f(n8)) || object2 != null && this.b.get((String)object2) == null) {
                        return null;
                    }
                } else {
                    this.c = new l();
                }
                if (this.e == null) {
                    this.e = new TypedValue();
                }
                TypedValue typedValue = this.e;
                object2 = context.getResources();
                object2.getValue(n8, typedValue, true);
                long l8 = C.e(typedValue);
                Drawable drawable = this.i(context, l8);
                if (drawable != null) {
                    return drawable;
                }
                CharSequence charSequence = typedValue.string;
                object = drawable;
                if (charSequence != null) {
                    object = drawable;
                    if (charSequence.toString().endsWith(".xml")) {
                        Exception exception2;
                        block14: {
                            block13: {
                                object = drawable;
                                try {
                                    int n9;
                                    charSequence = object2.getXml(n8);
                                    object = drawable;
                                    AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)charSequence);
                                    do {
                                        object = drawable;
                                    } while ((n9 = charSequence.next()) != 2 && n9 != 1);
                                    if (n9 != 2) {
                                        object = drawable;
                                        object = drawable;
                                        context = new XmlPullParserException("No start tag found");
                                        object = drawable;
                                        throw context;
                                    }
                                    object = drawable;
                                    object2 = charSequence.getName();
                                    object = drawable;
                                    this.c.b(n8, (String)object2);
                                    object = drawable;
                                    e e8 = this.b.get((String)object2);
                                    object2 = drawable;
                                    if (e8 == null) break block13;
                                    object = drawable;
                                    object2 = e8.a(context, (XmlPullParser)charSequence, attributeSet, context.getTheme());
                                }
                                catch (Exception exception2) {
                                    break block14;
                                }
                            }
                            object = object2;
                            if (object2 != null) {
                                object = object2;
                                object2.setChangingConfigurations(typedValue.changingConfigurations);
                                object = object2;
                                this.b(context, l8, (Drawable)object2);
                                object = object2;
                            }
                            break block16;
                        }
                        Log.e((String)"ResourceManagerInternal", (String)"Exception while inflating drawable", (Throwable)exception2);
                    }
                }
            }
            if (object == null) {
                this.c.b(n8, "appcompat_skip_skip");
            }
            return object;
        }
        return null;
    }

    private Drawable v(Context context, int n8, boolean bl, Drawable drawable) {
        Object object = this.m(context, n8);
        if (object != null) {
            context = ax.U.a.r(drawable.mutate());
            ax.U.a.o((Drawable)context, (ColorStateList)object);
            drawable = this.o(n8);
            if (drawable != null) {
                ax.U.a.p((Drawable)context, (PorterDuff.Mode)drawable);
            }
            return context;
        }
        object = this.g;
        if (!(object != null && object.e(context, n8, drawable) || this.x(context, n8, drawable) || !bl)) {
            return null;
        }
        return drawable;
    }

    static void w(Drawable drawable, J j8, int[] nArray) {
        Object object = drawable.getState();
        if (drawable.mutate() == drawable) {
            boolean bl;
            if (drawable instanceof LayerDrawable && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(object);
            }
            if (!(bl = j8.d) && !j8.c) {
                drawable.clearColorFilter();
            } else {
                object = bl ? (Object)j8.a : null;
                j8 = j8.c ? j8.b : h;
                drawable.setColorFilter((ColorFilter)C.g((ColorStateList)object, (PorterDuff.Mode)j8, nArray));
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d((String)"ResourceManagerInternal", (String)"Mutated drawable is not the same instance as the input.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Drawable j(Context context, int n8) {
        synchronized (this) {
            return this.k(context, n8, false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Drawable k(Context context, int n8, boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Drawable drawable;
                Drawable drawable2;
                block6: {
                    try {
                        this.d(context);
                        drawable = drawable2 = this.r(context, n8);
                        if (drawable2 != null) break block6;
                        drawable = this.f(context, n8);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                drawable2 = drawable;
                if (drawable == null) {
                    drawable2 = ax.Q.b.e(context, n8);
                }
                drawable = drawable2;
                if (drawable2 != null) {
                    drawable = this.v(context, n8, bl, drawable2);
                }
                if (drawable != null) {
                    A.b(drawable);
                }
                return drawable;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    ColorStateList m(Context context, int n8) {
        synchronized (this) {
            try {
                Object object = this.n(context, n8);
                Object object2 = object;
                if (object != null) return object2;
                object = this.g;
                if (object == null) {
                    return null;
                }
                object = object.d(context, n8);
                object2 = object;
                if (object == null) return object2;
                this.c(context, n8, (ColorStateList)object);
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    PorterDuff.Mode o(int n8) {
        f f8 = this.g;
        if (f8 == null) {
            return null;
        }
        return f8.b(n8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void s(Context object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        object = this.d.get(object);
                        if (object == null) break block4;
                        ((h)object).c();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Drawable t(Context context, N n8, int n9) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Drawable drawable;
                block4: {
                    try {
                        Drawable drawable2;
                        drawable = drawable2 = this.r(context, n9);
                        if (drawable2 != null) break block4;
                        drawable = n8.a(n9);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if (drawable == null) return null;
                return this.v(context, n9, false, drawable);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void u(f f8) {
        synchronized (this) {
            this.g = f8;
            return;
        }
    }

    boolean x(Context context, int n8, Drawable drawable) {
        f f8 = this.g;
        return f8 != null && f8.a(context, n8, drawable);
    }

    static class a
    implements e {
        a() {
        }

        @Override
        public Drawable a(Context object, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                object = ax.p.a.m(object, object.getResources(), xmlPullParser, attributeSet, theme);
                return object;
            }
            catch (Exception exception) {
                Log.e((String)"AsldcInflateDelegate", (String)"Exception while inflating <animated-selector>", (Throwable)exception);
                return null;
            }
        }
    }

    private static class b
    implements e {
        b() {
        }

        @Override
        public Drawable a(Context object, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                object = ax.w2.e.b(object, object.getResources(), xmlPullParser, attributeSet, theme);
                return object;
            }
            catch (Exception exception) {
                Log.e((String)"AvdcInflateDelegate", (String)"Exception while inflating <animated-vector>", (Throwable)exception);
                return null;
            }
        }
    }

    private static class c
    extends ax.B.j<Integer, PorterDuffColorFilter> {
        public c(int n8) {
            super(n8);
        }

        private static int j(int n8, PorterDuff.Mode mode) {
            return (n8 + 31) * 31 + mode.hashCode();
        }

        PorterDuffColorFilter k(int n8, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter)this.c(androidx.appcompat.widget.C$c.j(n8, mode));
        }

        PorterDuffColorFilter l(int n8, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return this.d(androidx.appcompat.widget.C$c.j(n8, mode), porterDuffColorFilter);
        }
    }

    static class d
    implements e {
        d() {
        }

        @Override
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String string = attributeSet.getClassAttribute();
            if (string != null) {
                try {
                    string = d.class.getClassLoader().loadClass(string).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    ax.q.a.c((Drawable)string, context.getResources(), xmlPullParser, attributeSet, theme);
                    return string;
                }
                catch (Exception exception) {
                    Log.e((String)"DrawableDelegate", (String)"Exception while inflating <drawable>", (Throwable)exception);
                }
            }
            return null;
        }
    }

    private static interface e {
        public Drawable a(Context var1, XmlPullParser var2, AttributeSet var3, Resources.Theme var4);
    }

    public static interface f {
        public boolean a(Context var1, int var2, Drawable var3);

        public PorterDuff.Mode b(int var1);

        public Drawable c(C var1, Context var2, int var3);

        public ColorStateList d(Context var1, int var2);

        public boolean e(Context var1, int var2, Drawable var3);
    }

    private static class g
    implements e {
        g() {
        }

        @Override
        public Drawable a(Context object, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                object = ax.w2.j.c(object.getResources(), xmlPullParser, attributeSet, theme);
                return object;
            }
            catch (Exception exception) {
                Log.e((String)"VdcInflateDelegate", (String)"Exception while inflating <vector>", (Throwable)exception);
                return null;
            }
        }
    }
}

