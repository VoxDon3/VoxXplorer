/*
 * Decompiled with CFR 0.152.
 */
package ax.S;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import ax.S.a;
import ax.S.g;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class c {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int n8;
        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlPullParser);
        while ((n8 = xmlPullParser.next()) != 2 && n8 != 1) {
        }
        if (n8 == 2) {
            return c.b(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources object, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String string = xmlPullParser.getName();
        if (string.equals("selector")) {
            return c.e((Resources)object, xmlPullParser, attributeSet, theme);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
        ((StringBuilder)object).append(": invalid color state list tag ");
        ((StringBuilder)object).append(string);
        throw new XmlPullParserException(((StringBuilder)object).toString());
    }

    private static TypedValue c() {
        TypedValue typedValue;
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue2 = typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        return typedValue2;
    }

    public static ColorStateList d(Resources resources, int n8, Resources.Theme theme) {
        try {
            resources = c.a(resources, (XmlPullParser)resources.getXml(n8), theme);
            return resources;
        }
        catch (Exception exception) {
            Log.e((String)"CSLCompat", (String)"Failed to inflate ColorStateList.", (Throwable)exception);
            return null;
        }
    }

    private static ColorStateList e(Resources object, XmlPullParser object2, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int n8;
        int n9;
        int n10 = object2.getDepth() + 1;
        int[][] nArrayArray = new int[20][];
        int[] nArray = new int[20];
        int n11 = 0;
        while ((n9 = object2.next()) != 1 && ((n8 = object2.getDepth()) >= n10 || n9 != 3)) {
            Object object3 = nArray;
            Object object4 = nArrayArray;
            int n12 = n11;
            if (n9 == 2) {
                object3 = nArray;
                object4 = nArrayArray;
                n12 = n11;
                if (n8 <= n10) {
                    if (!object2.getName().equals("item")) {
                        object3 = nArray;
                        object4 = nArrayArray;
                        n12 = n11;
                    } else {
                        object3 = c.h(object, theme, attributeSet, ax.O.g.b);
                        n12 = object3.getResourceId(n8 = ax.O.g.c, -1);
                        if (n12 != -1 && !c.f(object, n12)) {
                            try {
                                n12 = c.a(object, (XmlPullParser)object.getXml(n12), theme).getDefaultColor();
                            }
                            catch (Exception exception) {
                                n12 = object3.getColor(ax.O.g.c, -65281);
                            }
                        } else {
                            n12 = object3.getColor(n8, -65281);
                        }
                        n8 = ax.O.g.d;
                        boolean bl = object3.hasValue(n8);
                        float f8 = 1.0f;
                        if (bl) {
                            f8 = object3.getFloat(n8, 1.0f);
                        } else {
                            n8 = ax.O.g.f;
                            if (object3.hasValue(n8)) {
                                f8 = object3.getFloat(n8, 1.0f);
                            }
                        }
                        float f9 = Build.VERSION.SDK_INT >= 31 && object3.hasValue(n8 = ax.O.g.e) ? object3.getFloat(n8, -1.0f) : object3.getFloat(ax.O.g.g, -1.0f);
                        object3.recycle();
                        int n13 = attributeSet.getAttributeCount();
                        object4 = new int[n13];
                        n8 = 0;
                        for (n9 = 0; n9 < n13; ++n9) {
                            int n14 = attributeSet.getAttributeNameResource(n9);
                            int n15 = n8;
                            if (n14 != 16843173) {
                                n15 = n8;
                                if (n14 != 16843551) {
                                    n15 = n8;
                                    if (n14 != ax.O.a.a) {
                                        n15 = n8;
                                        if (n14 != ax.O.a.b) {
                                            n15 = attributeSet.getAttributeBooleanValue(n9, false) ? n14 : -n14;
                                            object4[n8] = (int[])n15;
                                            n15 = n8 + 1;
                                        }
                                    }
                                }
                            }
                            n8 = n15;
                        }
                        object4 = StateSet.trimStateSet((int[])object4, (int)n8);
                        object3 = g.a(nArray, n11, c.g(n12, f8, f9));
                        object4 = (int[][])g.b(nArrayArray, n11, object4);
                        n12 = n11 + 1;
                    }
                }
            }
            nArray = object3;
            nArrayArray = object4;
            n11 = n12;
        }
        object = new int[n11];
        object2 = new int[n11][];
        System.arraycopy(nArray, 0, object, 0, n11);
        System.arraycopy(nArrayArray, 0, object2, 0, n11);
        return new ColorStateList((int[][])object2, (int[])object);
    }

    private static boolean f(Resources resources, int n8) {
        TypedValue typedValue = c.c();
        resources.getValue(n8, typedValue, true);
        n8 = typedValue.type;
        return n8 >= 28 && n8 <= 31;
    }

    private static int g(int n8, float f8, float f9) {
        boolean bl = f9 >= 0.0f && f9 <= 100.0f;
        if (f8 == 1.0f && !bl) {
            return n8;
        }
        int n9 = ax.W.a.b((int)((float)Color.alpha((int)n8) * f8 + 0.5f), 0, 255);
        int n10 = n8;
        if (bl) {
            a a8 = ax.S.a.c(n8);
            n10 = ax.S.a.m(a8.j(), a8.i(), f9);
        }
        return n10 & 0xFFFFFF | n9 << 24;
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] nArray) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, nArray);
        }
        return theme.obtainStyledAttributes(attributeSet, nArray, 0, 0);
    }
}

