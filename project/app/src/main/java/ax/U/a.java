/*
 * Decompiled with CFR 0.152.
 */
package ax.U;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import ax.U.c;
import ax.U.e;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class a {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    public static void a(Drawable drawable, Resources.Theme theme) {
        ax.U.a$a.a(drawable, theme);
    }

    public static boolean b(Drawable drawable) {
        return ax.U.a$a.b(drawable);
    }

    public static void c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            ax.U.a.c(((InsetDrawable)drawable).getDrawable());
            return;
        }
        if (drawable instanceof c) {
            ax.U.a.c(((c)drawable).b());
            return;
        }
        if (drawable instanceof DrawableContainer && (drawableContainerState = (DrawableContainer.DrawableContainerState)((DrawableContainer)drawable).getConstantState()) != null) {
            int n8 = drawableContainerState.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                drawable = drawableContainerState.getChild(i8);
                if (drawable == null) continue;
                ax.U.a.c(drawable);
            }
        }
    }

    public static int d(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter e(Drawable drawable) {
        return ax.U.a$a.c(drawable);
    }

    public static int f(Drawable drawable) {
        Method method;
        if (Build.VERSION.SDK_INT >= 23) {
            return ax.U.a$b.a(drawable);
        }
        if (!d) {
            try {
                c = method = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                Log.i((String)"DrawableCompat", (String)"Failed to retrieve getLayoutDirection() method", (Throwable)noSuchMethodException);
            }
            d = true;
        }
        if ((method = c) != null) {
            try {
                int n8 = (Integer)method.invoke(drawable, null);
                return n8;
            }
            catch (Exception exception) {
                Log.i((String)"DrawableCompat", (String)"Failed to invoke getLayoutDirection() via reflection", (Throwable)exception);
                c = null;
            }
        }
        return 0;
    }

    public static void g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ax.U.a$a.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(Drawable drawable, boolean bl) {
        drawable.setAutoMirrored(bl);
    }

    public static void k(Drawable drawable, float f8, float f9) {
        ax.U.a$a.e(drawable, f8, f9);
    }

    public static void l(Drawable drawable, int n8, int n9, int n10, int n11) {
        ax.U.a$a.f(drawable, n8, n9, n10, n11);
    }

    public static boolean m(Drawable drawable, int n8) {
        Method method;
        if (Build.VERSION.SDK_INT >= 23) {
            return ax.U.a$b.b(drawable, n8);
        }
        if (!b) {
            try {
                a = method = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                Log.i((String)"DrawableCompat", (String)"Failed to retrieve setLayoutDirection(int) method", (Throwable)noSuchMethodException);
            }
            b = true;
        }
        if ((method = a) != null) {
            try {
                method.invoke(drawable, n8);
                return true;
            }
            catch (Exception exception) {
                Log.i((String)"DrawableCompat", (String)"Failed to invoke setLayoutDirection(int) via reflection", (Throwable)exception);
                a = null;
            }
        }
        return false;
    }

    public static void n(Drawable drawable, int n8) {
        ax.U.a$a.g(drawable, n8);
    }

    public static void o(Drawable drawable, ColorStateList colorStateList) {
        ax.U.a$a.h(drawable, colorStateList);
    }

    public static void p(Drawable drawable, PorterDuff.Mode mode) {
        ax.U.a$a.i(drawable, mode);
    }

    public static <T extends Drawable> T q(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (drawable instanceof c) {
            drawable2 = ((c)drawable).b();
        }
        return (T)drawable2;
    }

    public static Drawable r(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 && !(drawable instanceof ax.U.b)) {
            return new e(drawable);
        }
        return drawable;
    }

    static class a {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f8, float f9) {
            drawable.setHotspot(f8, f9);
        }

        static void f(Drawable drawable, int n8, int n9, int n10, int n11) {
            drawable.setHotspotBounds(n8, n9, n10, n11);
        }

        static void g(Drawable drawable, int n8) {
            drawable.setTint(n8);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    static class b {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int n8) {
            return drawable.setLayoutDirection(n8);
        }
    }
}

