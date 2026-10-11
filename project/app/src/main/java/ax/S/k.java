/*
 * Decompiled with CFR 0.152.
 */
package ax.S;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import ax.S.c;
import ax.S.d;
import org.xmlpull.v1.XmlPullParser;

public class k {
    public static int a(Context context, int n8, int n9) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n8, typedValue, true);
        if (typedValue.resourceId != 0) {
            return n8;
        }
        return n9;
    }

    public static boolean b(TypedArray typedArray, int n8, int n9, boolean bl) {
        return typedArray.getBoolean(n8, typedArray.getBoolean(n9, bl));
    }

    public static Drawable c(TypedArray typedArray, int n8, int n9) {
        Drawable drawable = typedArray.getDrawable(n8);
        if (drawable == null) {
            return typedArray.getDrawable(n9);
        }
        return drawable;
    }

    public static int d(TypedArray typedArray, int n8, int n9, int n10) {
        return typedArray.getInt(n8, typedArray.getInt(n9, n10));
    }

    public static boolean e(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n8, boolean bl) {
        if (!k.r(xmlPullParser, string)) {
            return bl;
        }
        return typedArray.getBoolean(n8, bl);
    }

    public static int f(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n8, int n9) {
        if (!k.r(xmlPullParser, string)) {
            return n9;
        }
        return typedArray.getColor(n8, n9);
    }

    public static ColorStateList g(TypedArray object, XmlPullParser xmlPullParser, Resources.Theme theme, String string, int n8) {
        if (k.r(xmlPullParser, string)) {
            xmlPullParser = new TypedValue();
            object.getValue(n8, (TypedValue)xmlPullParser);
            int n9 = xmlPullParser.type;
            if (n9 != 2) {
                if (n9 >= 28 && n9 <= 31) {
                    return k.h((TypedValue)xmlPullParser);
                }
                return c.d(object.getResources(), object.getResourceId(n8, 0), theme);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Failed to resolve attribute at index ");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(": ");
            ((StringBuilder)object).append(xmlPullParser);
            throw new UnsupportedOperationException(((StringBuilder)object).toString());
        }
        return null;
    }

    private static ColorStateList h(TypedValue typedValue) {
        return ColorStateList.valueOf((int)typedValue.data);
    }

    public static d i(TypedArray object, XmlPullParser xmlPullParser, Resources.Theme theme, String string, int n8, int n9) {
        if (k.r(xmlPullParser, string)) {
            xmlPullParser = new TypedValue();
            object.getValue(n8, (TypedValue)xmlPullParser);
            int n10 = xmlPullParser.type;
            if (n10 >= 28 && n10 <= 31) {
                return d.b(xmlPullParser.data);
            }
            if ((object = d.g(object.getResources(), object.getResourceId(n8, 0), theme)) != null) {
                return object;
            }
        }
        return d.b(n9);
    }

    public static float j(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n8, float f8) {
        if (!k.r(xmlPullParser, string)) {
            return f8;
        }
        return typedArray.getFloat(n8, f8);
    }

    public static int k(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n8, int n9) {
        if (!k.r(xmlPullParser, string)) {
            return n9;
        }
        return typedArray.getInt(n8, n9);
    }

    public static int l(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n8, int n9) {
        if (!k.r(xmlPullParser, string)) {
            return n9;
        }
        return typedArray.getResourceId(n8, n9);
    }

    public static String m(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n8) {
        if (!k.r(xmlPullParser, string)) {
            return null;
        }
        return typedArray.getString(n8);
    }

    public static int n(TypedArray typedArray, int n8, int n9, int n10) {
        return typedArray.getResourceId(n8, typedArray.getResourceId(n9, n10));
    }

    public static String o(TypedArray typedArray, int n8, int n9) {
        String string = typedArray.getString(n8);
        if (string == null) {
            return typedArray.getString(n9);
        }
        return string;
    }

    public static CharSequence p(TypedArray typedArray, int n8, int n9) {
        CharSequence charSequence = typedArray.getText(n8);
        if (charSequence == null) {
            return typedArray.getText(n9);
        }
        return charSequence;
    }

    public static CharSequence[] q(TypedArray typedArray, int n8, int n9) {
        CharSequence[] charSequenceArray = typedArray.getTextArray(n8);
        if (charSequenceArray == null) {
            return typedArray.getTextArray(n9);
        }
        return charSequenceArray;
    }

    public static boolean r(XmlPullParser xmlPullParser, String string) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", string) != null;
    }

    public static TypedArray s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] nArray) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, nArray);
        }
        return theme.obtainStyledAttributes(attributeSet, nArray, 0, 0);
    }

    public static TypedValue t(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n8) {
        if (!k.r(xmlPullParser, string)) {
            return null;
        }
        return typedArray.peekValue(n8);
    }
}

