/*
 * Decompiled with CFR 0.152.
 */
package ax.S;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import ax.O.g;
import ax.S.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class f {
    private static a a(a a8, int n8, int n9, boolean bl, int n10) {
        if (a8 != null) {
            return a8;
        }
        if (bl) {
            return new a(n8, n10, n9);
        }
        return new a(n8, n9);
    }

    static Shader b(Resources object, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String string = xmlPullParser.getName();
        if (string.equals("gradient")) {
            string = k.s((Resources)object, theme, attributeSet, g.A);
            float f8 = k.j((TypedArray)string, xmlPullParser, "startX", g.J, 0.0f);
            float f9 = k.j((TypedArray)string, xmlPullParser, "startY", g.K, 0.0f);
            float f10 = k.j((TypedArray)string, xmlPullParser, "endX", g.L, 0.0f);
            float f11 = k.j((TypedArray)string, xmlPullParser, "endY", g.M, 0.0f);
            float f12 = k.j((TypedArray)string, xmlPullParser, "centerX", g.E, 0.0f);
            float f13 = k.j((TypedArray)string, xmlPullParser, "centerY", g.F, 0.0f);
            int n8 = k.k((TypedArray)string, xmlPullParser, "type", g.D, 0);
            int n9 = k.f((TypedArray)string, xmlPullParser, "startColor", g.B, 0);
            boolean bl = k.r(xmlPullParser, "centerColor");
            int n10 = k.f((TypedArray)string, xmlPullParser, "centerColor", g.I, 0);
            int n11 = k.f((TypedArray)string, xmlPullParser, "endColor", g.C, 0);
            int n12 = k.k((TypedArray)string, xmlPullParser, "tileMode", g.H, 0);
            float f14 = k.j((TypedArray)string, xmlPullParser, "gradientRadius", g.G, 0.0f);
            string.recycle();
            object = f.a(f.c((Resources)object, xmlPullParser, attributeSet, theme), n9, n11, bl, n10);
            if (n8 != 1) {
                if (n8 != 2) {
                    return new LinearGradient(f8, f9, f10, f11, ((a)object).a, ((a)object).b, f.d(n12));
                }
                return new SweepGradient(f12, f13, ((a)object).a, ((a)object).b);
            }
            if (!(f14 <= 0.0f)) {
                return new RadialGradient(f12, f13, f14, ((a)object).a, ((a)object).b, f.d(n12));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
        ((StringBuilder)object).append(": invalid gradient color tag ");
        ((StringBuilder)object).append(string);
        throw new XmlPullParserException(((StringBuilder)object).toString());
    }

    private static a c(Resources object, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int n8;
        int n9;
        int n10 = xmlPullParser.getDepth() + 1;
        ArrayList<Float> arrayList = new ArrayList<Float>(20);
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(20);
        while ((n9 = xmlPullParser.next()) != 1 && ((n8 = xmlPullParser.getDepth()) >= n10 || n9 != 3)) {
            if (n9 != 2 || n8 > n10 || !xmlPullParser.getName().equals("item")) continue;
            TypedArray typedArray = k.s((Resources)object, theme, attributeSet, g.N);
            n8 = g.O;
            boolean bl = typedArray.hasValue(n8);
            n9 = g.P;
            boolean bl2 = typedArray.hasValue(n9);
            if (bl && bl2) {
                n8 = typedArray.getColor(n8, 0);
                float f8 = typedArray.getFloat(n9, 0.0f);
                typedArray.recycle();
                arrayList2.add(n8);
                arrayList.add(Float.valueOf(f8));
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
            ((StringBuilder)object).append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
            throw new XmlPullParserException(((StringBuilder)object).toString());
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    static final class a {
        final int[] a;
        final float[] b;

        a(int n8, int n9) {
            this.a = new int[]{n8, n9};
            this.b = new float[]{0.0f, 1.0f};
        }

        a(int n8, int n9, int n10) {
            this.a = new int[]{n8, n9, n10};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int n8 = list.size();
            this.a = new int[n8];
            this.b = new float[n8];
            for (int i8 = 0; i8 < n8; ++i8) {
                this.a[i8] = list.get(i8);
                this.b[i8] = list2.get(i8).floatValue();
            }
        }
    }
}

