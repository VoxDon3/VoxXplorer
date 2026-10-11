package ax.S;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import ax.S.h;
import ax.b0.C1441b;
import ax.b0.C1446g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    private static final WeakHashMap<d, SparseArray<c>> b = new WeakHashMap<>(0);
    private static final Object c = new Object();

    static class a {
        static Drawable a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    static class b {
        static int a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    private static class c {
        final ColorStateList a;
        final Configuration b;
        final int c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.a = colorStateList;
            this.b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class d {
        final Resources a;
        final Resources.Theme b;

        d(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.a.equals(dVar.a) && C1441b.a(this.b, dVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return C1441b.b(this.a, this.b);
        }
    }

    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i, Handler handler) {
            e(handler).post(new Runnable() { // from class: ax.S.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.e.this.f(i);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: ax.S.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.e.this.g(typeface);
                }
            });
        }

        public abstract void f(int i);

        public abstract void g(Typeface typeface);
    }

    public static final class f {

        static class a {
            private static final Object a = new Object();
            private static Method b;
            private static boolean c;

            @SuppressLint({"BanUncheckedReflection"})
            static void a(Resources.Theme theme) {
                synchronized (a) {
                    if (!c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        c = true;
                    }
                    Method method = b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            b = null;
                        }
                    }
                }
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                b.a(theme);
            } else if (i >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            try {
                WeakHashMap<d, SparseArray<c>> weakHashMap = b;
                SparseArray<c> sparseArray = weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i, new c(colorStateList, dVar.a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r2.c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList b(ax.S.h.d r5, int r6) {
        /*
            java.lang.Object r0 = ax.S.h.c
            monitor-enter(r0)
            java.util.WeakHashMap<ax.S.h$d, android.util.SparseArray<ax.S.h$c>> r1 = ax.S.h.b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            ax.S.h$c r2 = (ax.S.h.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.S.h.b(ax.S.h$d, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        d dVar = new d(resources, theme);
        ColorStateList b2 = b(dVar, i);
        if (b2 != null) {
            return b2;
        }
        ColorStateList k = k(resources, i, theme);
        if (k == null) {
            return Build.VERSION.SDK_INT >= 23 ? b.b(resources, i, theme) : resources.getColorStateList(i);
        }
        a(dVar, i, k, theme);
        return k;
    }

    public static Drawable e(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return a.a(resources, i, theme);
    }

    public static Drawable f(Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return a.b(resources, i, i2, theme);
    }

    public static Typeface g(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int i, TypedValue typedValue, int i2, e eVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i, typedValue, i2, eVar, null, true, false);
    }

    public static void i(Context context, int i, e eVar, Handler handler) throws Resources.NotFoundException {
        C1446g.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            m(context, i, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    private static TypedValue j() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList k(Resources resources, int i, Resources.Theme theme) {
        if (l(resources, i)) {
            return null;
        }
        try {
            return ax.S.c.a(resources, resources.getXml(i), theme);
        } catch (Exception e2) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean l(Resources resources, int i) {
        TypedValue j = j();
        resources.getValue(i, j, true);
        int i2 = j.type;
        return i2 >= 28 && i2 <= 31;
    }

    private static Typeface m(Context context, int i, TypedValue typedValue, int i2, e eVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface n = n(context, resources, typedValue, i, i2, eVar, handler, z, z2);
        if (n != null || eVar != null || z2) {
            return n;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface n(android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, ax.S.h.e r18, android.os.Handler r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.S.h.n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, ax.S.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
