/*
 * Decompiled with CFR 0.152.
 */
package ax.S;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import ax.S.e;
import ax.S.i;
import ax.S.j;
import ax.b0.g;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class h {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal();
    private static final WeakHashMap<d, SparseArray<c>> b = new WeakHashMap(0);
    private static final Object c = new Object();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(d d8, int n8, ColorStateList colorStateList, Resources.Theme theme) {
        Object object = c;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                SparseArray sparseArray;
                Object object2;
                block3: {
                    try {
                        WeakHashMap<d, SparseArray<c>> weakHashMap = b;
                        sparseArray = object2 = weakHashMap.get(d8);
                        if (object2 != null) break block3;
                        sparseArray = new SparseArray();
                        weakHashMap.put(d8, (SparseArray<c>)sparseArray);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = new c(colorStateList, d8.a.getConfiguration(), theme);
                sparseArray.append(n8, object2);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ColorStateList b(d d8, int n8) {
        Object object = c;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                SparseArray<c> sparseArray;
                block4: {
                    c c8;
                    block5: {
                        try {
                            sparseArray = b.get(d8);
                            if (sparseArray == null) return null;
                            if (sparseArray.size() <= 0) return null;
                            c8 = (c)sparseArray.get(n8);
                            if (c8 == null) return null;
                            if (!c8.b.equals(d8.a.getConfiguration())) break block4;
                            d8 = d8.b;
                            if (d8 != null) break block5;
                            if (c8.c == 0) return c8.a;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    if (d8 != null && c8.c == d8.hashCode()) {
                        return c8.a;
                    }
                }
                sparseArray.remove(n8);
                return null;
            }
            throw throwable2;
        }
    }

    public static Typeface c(Context context, int n8) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return h.m(context, n8, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int n8, Resources.Theme theme) throws Resources.NotFoundException {
        d d8 = new d(resources, theme);
        ColorStateList colorStateList = h.b(d8, n8);
        if (colorStateList != null) {
            return colorStateList;
        }
        colorStateList = h.k(resources, n8, theme);
        if (colorStateList != null) {
            h.a(d8, n8, colorStateList, theme);
            return colorStateList;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return ax.S.h$b.b(resources, n8, theme);
        }
        return resources.getColorStateList(n8);
    }

    public static Drawable e(Resources resources, int n8, Resources.Theme theme) throws Resources.NotFoundException {
        return ax.S.h$a.a(resources, n8, theme);
    }

    public static Drawable f(Resources resources, int n8, int n9, Resources.Theme theme) throws Resources.NotFoundException {
        return ax.S.h$a.b(resources, n8, n9, theme);
    }

    public static Typeface g(Context context, int n8) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return h.m(context, n8, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int n8, TypedValue typedValue, int n9, e e8) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return h.m(context, n8, typedValue, n9, e8, null, true, false);
    }

    public static void i(Context context, int n8, e e8, Handler handler) throws Resources.NotFoundException {
        g.g(e8);
        if (context.isRestricted()) {
            e8.c(-4, handler);
            return;
        }
        h.m(context, n8, new TypedValue(), 0, e8, handler, false, false);
    }

    private static TypedValue j() {
        TypedValue typedValue;
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue2 = typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        return typedValue2;
    }

    private static ColorStateList k(Resources resources, int n8, Resources.Theme theme) {
        if (h.l(resources, n8)) {
            return null;
        }
        XmlResourceParser xmlResourceParser = resources.getXml(n8);
        try {
            resources = ax.S.c.a(resources, (XmlPullParser)xmlResourceParser, theme);
            return resources;
        }
        catch (Exception exception) {
            Log.w((String)"ResourcesCompat", (String)"Failed to inflate ColorStateList, leaving it to the framework", (Throwable)exception);
            return null;
        }
    }

    private static boolean l(Resources resources, int n8) {
        TypedValue typedValue = h.j();
        resources.getValue(n8, typedValue, true);
        n8 = typedValue.type;
        return n8 >= 28 && n8 <= 31;
    }

    private static Typeface m(Context object, int n8, TypedValue typedValue, int n9, e e8, Handler handler, boolean bl, boolean bl2) {
        Resources resources = object.getResources();
        resources.getValue(n8, typedValue, true);
        object = h.n((Context)object, resources, typedValue, n8, n9, e8, handler, bl, bl2);
        if (object == null && e8 == null && !bl2) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Font resource ID #0x");
            ((StringBuilder)object).append(Integer.toHexString(n8));
            ((StringBuilder)object).append(" could not be retrieved.");
            throw new Resources.NotFoundException(((StringBuilder)object).toString());
        }
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Typeface n(Context object, Resources object2, TypedValue typedValue, int n8, int n9, e e8, Handler handler, boolean bl, boolean bl2) {
        block16: {
            Throwable var0_4;
            CharSequence charSequence;
            block15: {
                Throwable var0_2;
                block14: {
                    block13: {
                        charSequence = typedValue.string;
                        if (charSequence == null) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Resource \"");
                            ((StringBuilder)object).append(object2.getResourceName(n8));
                            ((StringBuilder)object).append("\" (");
                            ((StringBuilder)object).append(Integer.toHexString(n8));
                            ((StringBuilder)object).append(") is not a Font: ");
                            ((StringBuilder)object).append(typedValue);
                            throw new Resources.NotFoundException(((StringBuilder)object).toString());
                        }
                        if (!((String)(charSequence = charSequence.toString())).startsWith("res/")) {
                            if (e8 == null) return null;
                            e8.c(-3, handler);
                            return null;
                        }
                        Object object3 = ax.T.e.f((Resources)object2, n8, (String)charSequence, typedValue.assetCookie, n9);
                        if (object3 != null) {
                            if (e8 == null) return object3;
                            e8.d((Typeface)object3, handler);
                            return object3;
                        }
                        if (bl2) {
                            return null;
                        }
                        if (!((String)charSequence).toLowerCase().endsWith(".xml")) break block13;
                        object3 = ax.S.e.b((XmlPullParser)object2.getXml(n8), (Resources)object2);
                        if (object3 == null) {
                            Log.e((String)"ResourcesCompat", (String)"Failed to find font-family tag");
                            if (e8 == null) return null;
                            e8.c(-3, handler);
                            return null;
                        }
                        int n10 = typedValue.assetCookie;
                        try {
                            return ax.T.e.c((Context)object, (e.b)object3, (Resources)object2, n8, (String)charSequence, n10, n9, e8, handler, bl);
                        }
                        catch (IOException iOException) {
                            break block14;
                        }
                        catch (XmlPullParserException xmlPullParserException) {
                            break block15;
                        }
                    }
                    try {
                        object = ax.T.e.d((Context)object, (Resources)object2, n8, (String)charSequence, typedValue.assetCookie, n9);
                        if (e8 == null) return object;
                        if (object != null) {
                            e8.d((Typeface)object, handler);
                            return object;
                        }
                    }
                    catch (IOException iOException) {
                        break block14;
                    }
                    catch (XmlPullParserException xmlPullParserException) {
                        break block15;
                    }
                    e8.c(-3, handler);
                    return object;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Failed to read xml resource ");
                ((StringBuilder)object2).append((String)charSequence);
                Log.e((String)"ResourcesCompat", (String)((StringBuilder)object2).toString(), (Throwable)var0_2);
                break block16;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Failed to parse xml resource ");
            ((StringBuilder)object2).append((String)charSequence);
            Log.e((String)"ResourcesCompat", (String)((StringBuilder)object2).toString(), (Throwable)var0_4);
        }
        if (e8 == null) return null;
        e8.c(-3, handler);
        return null;
    }

    static class a {
        static Drawable a(Resources resources, int n8, Resources.Theme theme) {
            return resources.getDrawable(n8, theme);
        }

        static Drawable b(Resources resources, int n8, int n9, Resources.Theme theme) {
            return resources.getDrawableForDensity(n8, n9, theme);
        }
    }

    static class b {
        static int a(Resources resources, int n8, Resources.Theme theme) {
            return resources.getColor(n8, theme);
        }

        static ColorStateList b(Resources resources, int n8, Resources.Theme theme) {
            return resources.getColorStateList(n8, theme);
        }
    }

    private static class c {
        final ColorStateList a;
        final Configuration b;
        final int c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.a = colorStateList;
            this.b = configuration;
            int n8 = theme == null ? 0 : theme.hashCode();
            this.c = n8;
        }
    }

    private static final class d {
        final Resources a;
        final Resources.Theme b;

        d(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && d.class == object.getClass()) {
                object = (d)object;
                if (this.a.equals(((d)object).a) && ax.b0.b.a(this.b, ((d)object).b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ax.b0.b.b(this.a, this.b);
        }
    }

    public static abstract class e {
        public static /* synthetic */ void a(e e8, Typeface typeface) {
            e8.g(typeface);
        }

        public static /* synthetic */ void b(e e8, int n8) {
            e8.f(n8);
        }

        public static Handler e(Handler handler) {
            Handler handler2 = handler;
            if (handler == null) {
                handler2 = new Handler(Looper.getMainLooper());
            }
            return handler2;
        }

        public final void c(int n8, Handler handler) {
            e.e(handler).post((Runnable)new j(this, n8));
        }

        public final void d(Typeface typeface, Handler handler) {
            e.e(handler).post((Runnable)new i(this, typeface));
        }

        public abstract void f(int var1);

        public abstract void g(Typeface var1);
    }

    public static final class f {
        public static void a(Resources.Theme theme) {
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 29) {
                b.a(theme);
                return;
            }
            if (n8 >= 23) {
                a.a(theme);
            }
        }

        static class a {
            private static final Object a = new Object();
            private static Method b;
            private static boolean c;

            /*
             * WARNING - void declaration
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @SuppressLint(value={"BanUncheckedReflection"})
            static void a(Resources.Theme theme) {
                Object object = a;
                synchronized (object) {
                    Throwable throwable2;
                    block10: {
                        block11: {
                            Method method;
                            block9: {
                                try {
                                    boolean bl = c;
                                    if (bl) break block9;
                                    try {
                                        b = method = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                        ((AccessibleObject)method).setAccessible(true);
                                    }
                                    catch (NoSuchMethodException noSuchMethodException) {
                                        Log.i((String)"ResourcesCompat", (String)"Failed to retrieve rebase() method", (Throwable)noSuchMethodException);
                                    }
                                }
                                catch (Throwable throwable2) {
                                    break block10;
                                }
                                c = true;
                            }
                            if ((method = b) != null) {
                                Throwable var0_4;
                                try {
                                    method.invoke(theme, null);
                                    break block11;
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                }
                                catch (IllegalAccessException illegalAccessException) {
                                    // empty catch block
                                }
                                Log.i((String)"ResourcesCompat", (String)"Failed to invoke rebase() method via reflection", (Throwable)var0_4);
                                b = null;
                            }
                        }
                        return;
                    }
                    throw throwable2;
                }
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }
    }
}

