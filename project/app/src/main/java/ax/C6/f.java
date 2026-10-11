/*
 * Decompiled with CFR 0.152.
 */
package ax.C6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import ax.C6.c;
import ax.C6.d;
import ax.C6.e;
import ax.C6.g;
import ax.C6.h;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class f {
    public static Drawable a(Drawable drawable, Drawable drawable2) {
        return f.b(drawable, drawable2, -1, -1);
    }

    public static Drawable b(Drawable drawable, Drawable drawable2, int n8, int n9) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        boolean bl = n8 != -1 && n9 != -1;
        int n10 = n8;
        if (n8 == -1) {
            n10 = f.h(drawable, drawable2);
        }
        n8 = n9;
        if (n9 == -1) {
            n8 = f.g(drawable, drawable2);
        }
        if (n10 > drawable.getIntrinsicWidth() || n8 > drawable.getIntrinsicHeight()) {
            float f8 = (float)n10 / (float)n8;
            if (f8 >= (float)drawable.getIntrinsicWidth() / (float)drawable.getIntrinsicHeight()) {
                n10 = drawable.getIntrinsicWidth();
                n8 = (int)((float)n10 / f8);
            } else {
                n8 = drawable.getIntrinsicHeight();
                n10 = (int)(f8 * (float)n8);
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            drawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
            ax.C6.a.a((LayerDrawable)drawable, 1, n10, n8);
            ax.C6.b.a((LayerDrawable)drawable, 1, 17);
            return drawable;
        }
        Drawable drawable3 = drawable2;
        if (bl) {
            drawable3 = new h(drawable2, n10, n8);
        }
        drawable2 = new LayerDrawable(new Drawable[]{drawable, drawable3});
        n9 = Math.max((drawable.getIntrinsicWidth() - n10) / 2, 0);
        n8 = Math.max((drawable.getIntrinsicHeight() - n8) / 2, 0);
        drawable2.setLayerInset(1, n9, n8, n9, n8);
        return drawable2;
    }

    public static Drawable c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean bl = Build.VERSION.SDK_INT < 23;
        return f.d(drawable, colorStateList, mode, bl);
    }

    private static Drawable d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean bl) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = ax.U.a.r(drawable).mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
            return drawable;
        }
        if (bl) {
            drawable.mutate();
        }
        return drawable;
    }

    public static int[] e(int[] nArray) {
        for (int i8 = 0; i8 < nArray.length; ++i8) {
            int n8 = nArray[i8];
            if (n8 == 0x10100A0) {
                return nArray;
            }
            if (n8 != 0) continue;
            nArray = (int[])nArray.clone();
            nArray[i8] = 0x10100A0;
            return nArray;
        }
        int[] nArray2 = Arrays.copyOf(nArray, nArray.length + 1);
        nArray2[nArray.length] = 0x10100A0;
        return nArray2;
    }

    public static ColorStateList f(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf((int)((ColorDrawable)drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && c.a(drawable)) {
            return e.a(d.a(drawable));
        }
        return null;
    }

    private static int g(Drawable drawable, Drawable drawable2) {
        int n8 = drawable2.getIntrinsicHeight();
        if (n8 != -1) {
            return n8;
        }
        return drawable.getIntrinsicHeight();
    }

    private static int h(Drawable drawable, Drawable drawable2) {
        int n8 = drawable2.getIntrinsicWidth();
        if (n8 != -1) {
            return n8;
        }
        return drawable.getIntrinsicWidth();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AttributeSet i(Context object, int n8, CharSequence object2) {
        Throwable var0_3;
        block6: {
            try {
                int n9;
                object = object.getResources().getXml(n8);
                while ((n9 = object.next()) != 2 && n9 != 1) {
                }
                if (n9 != 2) {
                    object = new XmlPullParserException("No start tag found");
                    throw object;
                }
                if (TextUtils.equals((CharSequence)object.getName(), (CharSequence)object2)) {
                    return Xml.asAttributeSet((XmlPullParser)object);
                }
            }
            catch (IOException iOException) {
                break block6;
            }
            catch (XmlPullParserException xmlPullParserException) {
                break block6;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Must have a <");
            ((StringBuilder)object).append(object2);
            ((StringBuilder)object).append("> start tag");
            XmlPullParserException xmlPullParserException = new XmlPullParserException(((StringBuilder)object).toString());
            throw xmlPullParserException;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Can't load badge resource ID #0x");
        ((StringBuilder)object2).append(Integer.toHexString(n8));
        object2 = new Resources.NotFoundException(((StringBuilder)object2).toString());
        ((Throwable)object2).initCause((Throwable)var0_3);
        throw object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void j(Outline outline, Path path) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 30) {
            b.a(outline, path);
            return;
        }
        if (n8 < 29) {
            if (!path.isConvex()) return;
            a.a(outline, path);
            return;
        }
        try {
            a.a(outline, path);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    public static void k(Drawable drawable, int n8) {
        boolean bl = n8 != 0;
        if (Build.VERSION.SDK_INT == 21) {
            if (bl) {
                drawable.setColorFilter(n8, PorterDuff.Mode.SRC_IN);
                return;
            }
            drawable.setColorFilter(null);
            return;
        }
        if (bl) {
            drawable.setTint(n8);
            return;
        }
        drawable.setTintList(null);
    }

    public static PorterDuffColorFilter l(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
        }
        return null;
    }

    private static class a {
        static void a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    private static class b {
        static void a(Outline outline, Path path) {
            g.a(outline, path);
        }
    }
}

