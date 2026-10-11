/*
 * Decompiled with CFR 0.152.
 */
package ax.w2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import ax.S.k;
import ax.T.d;
import ax.w2.f;
import ax.w2.h;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g {
    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f8) throws XmlPullParserException, IOException {
        return g.b(context, resources, theme, xmlPullParser, Xml.asAttributeSet((XmlPullParser)xmlPullParser), null, 0, f8);
    }

    private static Animator b(Context object, Resources object2, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int n8, float f8) throws XmlPullParserException, IOException {
        int n9;
        int n10;
        ArrayList<PropertyValuesHolder[]> arrayList;
        PropertyValuesHolder[] propertyValuesHolderArray;
        int n11;
        block12: {
            n11 = xmlPullParser.getDepth();
            propertyValuesHolderArray = null;
            arrayList = null;
            while (true) {
                int n12 = xmlPullParser.next();
                n10 = 0;
                n9 = 0;
                if (n12 == 3 && xmlPullParser.getDepth() <= n11 || n12 == 1) break block12;
                if (n12 != 2) continue;
                PropertyValuesHolder[] propertyValuesHolderArray2 = xmlPullParser.getName();
                if (propertyValuesHolderArray2.equals("objectAnimator")) {
                    propertyValuesHolderArray2 = g.n((Context)object, object2, theme, attributeSet, f8, xmlPullParser);
                    n10 = n9;
                } else if (propertyValuesHolderArray2.equals("animator")) {
                    propertyValuesHolderArray2 = g.l((Context)object, object2, theme, attributeSet, null, f8, xmlPullParser);
                    n10 = n9;
                } else if (propertyValuesHolderArray2.equals("set")) {
                    propertyValuesHolderArray2 = new AnimatorSet();
                    propertyValuesHolderArray = k.s(object2, theme, attributeSet, ax.w2.a.h);
                    g.b((Context)object, object2, theme, xmlPullParser, attributeSet, (AnimatorSet)propertyValuesHolderArray2, k.k((TypedArray)propertyValuesHolderArray, xmlPullParser, "ordering", 0, 0), f8);
                    propertyValuesHolderArray.recycle();
                    n10 = n9;
                } else {
                    if (!propertyValuesHolderArray2.equals("propertyValuesHolder")) break;
                    propertyValuesHolderArray2 = g.p((Context)object, object2, theme, xmlPullParser, Xml.asAttributeSet((XmlPullParser)xmlPullParser));
                    if (propertyValuesHolderArray2 != null && propertyValuesHolderArray instanceof ValueAnimator) {
                        ((ValueAnimator)propertyValuesHolderArray).setValues(propertyValuesHolderArray2);
                    }
                    n10 = 1;
                    propertyValuesHolderArray2 = propertyValuesHolderArray;
                }
                propertyValuesHolderArray = propertyValuesHolderArray2;
                if (animatorSet == null) continue;
                propertyValuesHolderArray = propertyValuesHolderArray2;
                if (n10 != 0) continue;
                ArrayList<PropertyValuesHolder[]> arrayList2 = arrayList;
                if (arrayList == null) {
                    arrayList2 = new ArrayList<PropertyValuesHolder[]>();
                }
                arrayList2.add(propertyValuesHolderArray2);
                propertyValuesHolderArray = propertyValuesHolderArray2;
                arrayList = arrayList2;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unknown animator name: ");
            ((StringBuilder)object).append(xmlPullParser.getName());
            throw new RuntimeException(((StringBuilder)object).toString());
        }
        if (animatorSet != null && arrayList != null) {
            object = new Animator[arrayList.size()];
            n11 = arrayList.size();
            n9 = 0;
            while (n9 < n11) {
                object2 = arrayList.get(n9);
                ++n9;
                object[n10] = (Animator)object2;
                ++n10;
            }
            if (n8 == 0) {
                animatorSet.playTogether((Animator[])object);
                return propertyValuesHolderArray;
            }
            animatorSet.playSequentially((Animator[])object);
        }
        return propertyValuesHolderArray;
    }

    private static Keyframe c(Keyframe keyframe, float f8) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat((float)f8);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt((float)f8);
        }
        return Keyframe.ofObject((float)f8);
    }

    private static void d(Keyframe[] keyframeArray, float f8, int n8, int n9) {
        f8 /= (float)(n9 - n8 + 2);
        while (n8 <= n9) {
            keyframeArray[n8].setFraction(keyframeArray[n8 - 1].getFraction() + f8);
            ++n8;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static PropertyValuesHolder e(TypedArray object, int n8, int n9, int n10, String charSequence) {
        Object var12_18;
        StringBuilder stringBuilder;
        int n11;
        int var3_8;
        int n12;
        TypedValue typedValue = object.peekValue(n12);
        boolean bl = typedValue != null;
        int n13 = bl ? typedValue.type : 0;
        TypedValue typedValue2 = object.peekValue((int)var3_8);
        boolean bl2 = typedValue2 != null;
        int n14 = bl2 ? typedValue2.type : 0;
        int n15 = n11;
        if (n11 == 4) {
            n15 = bl && g.h(n13) || bl2 && g.h(n14) ? 3 : 0;
        }
        n11 = n15 == 0 ? 1 : 0;
        Object var12_12 = null;
        if (n15 == 2) {
            String string = object.getString(n12);
            String string2 = object.getString((int)var3_8);
            d.b[] bArray = d.d(string);
            d.b[] bArray2 = d.d(string2);
            if (bArray != null || bArray2 != null) {
                if (bArray != null) {
                    a a8 = new a();
                    if (bArray2 == null) {
                        return PropertyValuesHolder.ofObject((String)((Object)stringBuilder), (TypeEvaluator)a8, (Object[])new Object[]{bArray});
                    }
                    if (d.b(bArray, bArray2)) {
                        return PropertyValuesHolder.ofObject((String)((Object)stringBuilder), (TypeEvaluator)a8, (Object[])new Object[]{bArray, bArray2});
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(" Can't morph from ");
                    stringBuilder.append(string);
                    stringBuilder.append(" to ");
                    stringBuilder.append(string2);
                    throw new InflateException(stringBuilder.toString());
                }
                if (bArray2 != null) {
                    return PropertyValuesHolder.ofObject((String)((Object)stringBuilder), (TypeEvaluator)new a(), (Object[])new Object[]{bArray2});
                }
            }
            return null;
        }
        h h8 = n15 == 3 ? h.a() : null;
        if (n11 != 0) {
            Object var0_3;
            if (bl) {
                float f8 = n13 == 5 ? object.getDimension(n12, 0.0f) : object.getFloat(n12, 0.0f);
                if (bl2) {
                    float f9 = n14 == 5 ? object.getDimension((int)var3_8, 0.0f) : object.getFloat((int)var3_8, 0.0f);
                    PropertyValuesHolder propertyValuesHolder = PropertyValuesHolder.ofFloat((String)((Object)stringBuilder), (float[])new float[]{f8, f9});
                } else {
                    PropertyValuesHolder propertyValuesHolder = PropertyValuesHolder.ofFloat((String)((Object)stringBuilder), (float[])new float[]{f8});
                }
            } else {
                float f10 = n14 == 5 ? object.getDimension((int)var3_8, 0.0f) : object.getFloat((int)var3_8, 0.0f);
                PropertyValuesHolder propertyValuesHolder = PropertyValuesHolder.ofFloat((String)((Object)stringBuilder), (float[])new float[]{f10});
            }
            void var12_14 = var0_3;
        } else if (bl) {
            n11 = n13 == 5 ? (int)object.getDimension(n12, 0.0f) : (g.h(n13) ? object.getColor(n12, 0) : object.getInt(n12, 0));
            if (bl2) {
                n12 = n14 == 5 ? (int)object.getDimension((int)var3_8, 0.0f) : (g.h(n14) ? object.getColor((int)var3_8, 0) : object.getInt((int)var3_8, 0));
                PropertyValuesHolder propertyValuesHolder = PropertyValuesHolder.ofInt((String)((Object)stringBuilder), (int[])new int[]{n11, n12});
            } else {
                PropertyValuesHolder propertyValuesHolder = PropertyValuesHolder.ofInt((String)((Object)stringBuilder), (int[])new int[]{n11});
            }
        } else if (bl2) {
            n11 = n14 == 5 ? (int)object.getDimension((int)var3_8, 0.0f) : (g.h(n14) ? object.getColor((int)var3_8, 0) : object.getInt((int)var3_8, 0));
            PropertyValuesHolder propertyValuesHolder = PropertyValuesHolder.ofInt((String)((Object)stringBuilder), (int[])new int[]{n11});
        }
        if (var12_18 != null && h8 != null) {
            var12_18.setEvaluator((TypeEvaluator)h8);
        }
        return var12_18;
    }

    private static int f(TypedArray typedArray, int n8, int n9) {
        TypedValue typedValue = typedArray.peekValue(n8);
        int n10 = 1;
        n8 = typedValue != null ? 1 : 0;
        int n11 = n8 != 0 ? typedValue.type : 0;
        typedArray = typedArray.peekValue(n9);
        n9 = typedArray != null ? n10 : 0;
        n10 = n9 != 0 ? typedArray.type : 0;
        if (n8 != 0 && g.h(n11) || n9 != 0 && g.h(n10)) {
            return 3;
        }
        return 0;
    }

    private static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        resources = k.s(resources, theme, attributeSet, ax.w2.a.j);
        int n8 = 0;
        theme = k.t((TypedArray)resources, xmlPullParser, "value", 0);
        int n9 = n8;
        if (theme != null) {
            n9 = n8;
            if (g.h(theme.type)) {
                n9 = 3;
            }
        }
        resources.recycle();
        return n9;
    }

    private static boolean h(int n8) {
        return n8 >= 28 && n8 <= 31;
    }

    public static Animator i(Context context, int n8) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator((Context)context, (int)n8);
        }
        return g.j(context, context.getResources(), context.getTheme(), n8);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int n8) throws Resources.NotFoundException {
        return g.k(context, resources, theme, n8, 1.0f);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Animator k(Context var0, Resources var1_2, Resources.Theme var2_4, int var3_6, float var4_7) throws Resources.NotFoundException {
        block7: {
            block8: {
                block6: {
                    var6_8 = null;
                    var7_9 = null;
                    var5_10 = null;
                    try {
                        var5_10 = var8_11 = var1_2.getAnimation(var3_6);
                        var6_8 = var8_11;
                        var7_9 = var8_11;
                        var0 = g.a((Context)var0, (Resources)var1_2, (Resources.Theme)var2_4, (XmlPullParser)var8_11, var4_7);
                        if (var8_11 == null) break block6;
                    }
                    catch (Throwable var0_1) {
                        break block7;
                    }
                    catch (IOException var2_5) {
                        break block8;
                    }
                    catch (XmlPullParserException var1_3) {
                        ** GOTO lbl38
                    }
                    var8_11.close();
                }
                return var0;
            }
            var5_10 = var6_8;
            {
                var5_10 = var6_8;
                var5_10 = var6_8;
                var1_2 = new StringBuilder();
                var5_10 = var6_8;
                var1_2.append("Can't load animation resource ID #0x");
                var5_10 = var6_8;
                var1_2.append(Integer.toHexString(var3_6));
                var5_10 = var6_8;
                var0 = new Resources.NotFoundException(var1_2.toString());
                var5_10 = var6_8;
                var0.initCause(var2_5);
                var5_10 = var6_8;
                throw var0;
lbl38:
                // 1 sources

                var5_10 = var7_9;
                var5_10 = var7_9;
                var5_10 = var7_9;
                var2_4 = new StringBuilder();
                var5_10 = var7_9;
                var2_4.append("Can't load animation resource ID #0x");
                var5_10 = var7_9;
                var2_4.append(Integer.toHexString(var3_6));
                var5_10 = var7_9;
                var0 = new Resources.NotFoundException(var2_4.toString());
                var5_10 = var7_9;
                var0.initCause(var1_3);
                var5_10 = var7_9;
                throw var0;
            }
        }
        if (var5_10 != null) {
            var5_10.close();
        }
        throw var0_1;
    }

    private static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f8, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArray = k.s(resources, theme, attributeSet, ax.w2.a.g);
        theme = k.s(resources, theme, attributeSet, ax.w2.a.k);
        resources = valueAnimator;
        if (valueAnimator == null) {
            resources = new ValueAnimator();
        }
        g.q((ValueAnimator)resources, typedArray, (TypedArray)theme, f8, xmlPullParser);
        int n8 = k.l(typedArray, xmlPullParser, "interpolator", 0, 0);
        if (n8 > 0) {
            resources.setInterpolator((TimeInterpolator)f.a(context, n8));
        }
        typedArray.recycle();
        if (theme != null) {
            theme.recycle();
        }
        return resources;
    }

    private static Keyframe m(Context context, Resources object, Resources.Theme theme, AttributeSet attributeSet, int n8, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        theme = k.s(object, theme, attributeSet, ax.w2.a.j);
        float f8 = k.j((TypedArray)theme, xmlPullParser, "fraction", 3, -1.0f);
        object = k.t((TypedArray)theme, xmlPullParser, "value", 0);
        boolean bl = object != null;
        int n9 = n8;
        if (n8 == 4) {
            n9 = bl && g.h(object.type) ? 3 : 0;
        }
        object = bl ? (n9 != 0 ? (n9 != 1 && n9 != 3 ? null : Keyframe.ofInt((float)f8, (int)k.k((TypedArray)theme, xmlPullParser, "value", 0, 0))) : Keyframe.ofFloat((float)f8, (float)k.j((TypedArray)theme, xmlPullParser, "value", 0, 0.0f))) : (n9 == 0 ? Keyframe.ofFloat((float)f8) : Keyframe.ofInt((float)f8));
        n8 = k.l((TypedArray)theme, xmlPullParser, "interpolator", 1, 0);
        if (n8 > 0) {
            object.setInterpolator((TimeInterpolator)f.a(context, n8));
        }
        theme.recycle();
        return object;
    }

    private static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f8, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        g.l(context, resources, theme, attributeSet, (ValueAnimator)objectAnimator, f8, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder o(Context context, Resources keyframeArray, Resources.Theme object, XmlPullParser xmlPullParser, String string, int n8) throws XmlPullParserException, IOException {
        int n9;
        int n10;
        Keyframe keyframe = null;
        Resources.Theme theme = object;
        Context context2 = context;
        context = keyframe;
        while ((n10 = xmlPullParser.next()) != 3 && n10 != 1) {
            if (!xmlPullParser.getName().equals("keyframe")) continue;
            n10 = n8;
            if (n8 == 4) {
                n10 = g.g((Resources)keyframeArray, theme, Xml.asAttributeSet((XmlPullParser)xmlPullParser), xmlPullParser);
            }
            object = Xml.asAttributeSet((XmlPullParser)xmlPullParser);
            keyframe = g.m(context2, (Resources)keyframeArray, theme, (AttributeSet)object, n10, xmlPullParser);
            object = context;
            if (keyframe != null) {
                object = context;
                if (context == null) {
                    object = new ArrayList();
                }
                object.add(keyframe);
            }
            xmlPullParser.next();
            n8 = n10;
            context = object;
        }
        if (context != null && (n9 = context.size()) > 0) {
            int n11 = 0;
            object = (Keyframe)context.get(0);
            keyframeArray = (Keyframe)context.get(n9 - 1);
            float f8 = keyframeArray.getFraction();
            n10 = n9;
            if (f8 < 1.0f) {
                if (f8 < 0.0f) {
                    keyframeArray.setFraction(1.0f);
                    n10 = n9;
                } else {
                    context.add(context.size(), g.c((Keyframe)keyframeArray, 1.0f));
                    n10 = n9 + 1;
                }
            }
            f8 = object.getFraction();
            n9 = n10;
            if (f8 != 0.0f) {
                if (f8 < 0.0f) {
                    object.setFraction(0.0f);
                    n9 = n10;
                } else {
                    context.add(0, g.c((Keyframe)object, 0.0f));
                    n9 = n10 + 1;
                }
            }
            keyframeArray = new Keyframe[n9];
            context.toArray(keyframeArray);
            for (n10 = n11; n10 < n9; ++n10) {
                context = keyframeArray[n10];
                if (!(context.getFraction() < 0.0f)) continue;
                if (n10 == 0) {
                    context.setFraction(0.0f);
                    continue;
                }
                int n12 = n9 - 1;
                if (n10 == n12) {
                    context.setFraction(1.0f);
                    continue;
                }
                n11 = n10 + 1;
                int n13 = n10;
                while (n11 < n12 && !(keyframeArray[n11].getFraction() >= 0.0f)) {
                    n13 = n11++;
                }
                g.d(keyframeArray, keyframeArray[n13 + 1].getFraction() - keyframeArray[n10 - 1].getFraction(), n10, n13);
            }
            context = PropertyValuesHolder.ofKeyframe((String)string, (Keyframe[])keyframeArray);
            if (n8 == 3) {
                context.setEvaluator((TypeEvaluator)h.a());
            }
            return context;
        }
        return null;
    }

    private static PropertyValuesHolder[] p(Context propertyValuesHolderArray, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int n8;
        int n9;
        ArrayList arrayList = null;
        while (true) {
            n9 = xmlPullParser.getEventType();
            if (n9 == 3 || n9 == 1) break;
            if (n9 != 2) {
                xmlPullParser.next();
                continue;
            }
            if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray typedArray = k.s(resources, theme, attributeSet, ax.w2.a.i);
                String string = k.m(typedArray, xmlPullParser, "propertyName", 3);
                n8 = k.k(typedArray, xmlPullParser, "valueType", 2, 4);
                Object object = g.o((Context)propertyValuesHolderArray, resources, theme, xmlPullParser, string, n8);
                PropertyValuesHolder propertyValuesHolder = object;
                if (object == null) {
                    propertyValuesHolder = g.e(typedArray, n8, 0, 1, string);
                }
                object = arrayList;
                if (propertyValuesHolder != null) {
                    object = arrayList;
                    if (arrayList == null) {
                        object = new ArrayList();
                    }
                    ((ArrayList)object).add(propertyValuesHolder);
                }
                typedArray.recycle();
                arrayList = object;
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            n9 = arrayList.size();
            propertyValuesHolderArray = new PropertyValuesHolder[n9];
            for (n8 = 0; n8 < n9; ++n8) {
                propertyValuesHolderArray[n8] = (PropertyValuesHolder)arrayList.get(n8);
            }
            return propertyValuesHolderArray;
        }
        return null;
    }

    private static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f8, XmlPullParser xmlPullParser) {
        int n8;
        long l8 = k.k(typedArray, xmlPullParser, "duration", 1, 300);
        long l9 = k.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int n9 = n8 = k.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (k.r(xmlPullParser, "valueFrom")) {
            n9 = n8;
            if (k.r(xmlPullParser, "valueTo")) {
                int n10 = n8;
                if (n8 == 4) {
                    n10 = g.f(typedArray, 5, 6);
                }
                PropertyValuesHolder propertyValuesHolder = g.e(typedArray, n10, 5, 6, "");
                n9 = n10;
                if (propertyValuesHolder != null) {
                    valueAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                    n9 = n10;
                }
            }
        }
        valueAnimator.setDuration(l8);
        valueAnimator.setStartDelay(l9);
        valueAnimator.setRepeatCount(k.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(k.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            g.r(valueAnimator, typedArray2, n9, f8, xmlPullParser);
        }
    }

    private static void r(ValueAnimator object, TypedArray typedArray, int n8, float f8, XmlPullParser object2) {
        ObjectAnimator objectAnimator = (ObjectAnimator)object;
        String string = k.m(typedArray, object2, "pathData", 1);
        if (string != null) {
            object = k.m(typedArray, object2, "propertyXName", 2);
            object2 = k.m(typedArray, object2, "propertyYName", 3);
            if (n8 != 2) {
                // empty if block
            }
            if (object == null && object2 == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append(typedArray.getPositionDescription());
                ((StringBuilder)object).append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(((StringBuilder)object).toString());
            }
            g.s(d.e(string), objectAnimator, f8 * 0.5f, (String)object, (String)object2);
            return;
        }
        objectAnimator.setPropertyName(k.m(typedArray, object2, "propertyName", 0));
    }

    private static void s(Path object, ObjectAnimator objectAnimator, float f8, String string, String string2) {
        float f9;
        PathMeasure pathMeasure = new PathMeasure(object, false);
        ArrayList<Float> arrayList = new ArrayList<Float>();
        float f10 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f11 = 0.0f;
        do {
            f9 = f11 + pathMeasure.getLength();
            arrayList.add(Float.valueOf(f9));
            f11 = f9;
        } while (pathMeasure.nextContour());
        object = new PathMeasure(object, false);
        int n8 = Math.min(100, (int)(f9 / f8) + 1);
        float[] fArray = new float[n8];
        float[] fArray2 = new float[n8];
        float[] fArray3 = new float[2];
        f11 = f9 / (float)(n8 - 1);
        int n9 = 0;
        int n10 = 0;
        f8 = f10;
        while (true) {
            pathMeasure = null;
            if (n9 >= n8) break;
            object.getPosTan(f8 - ((Float)arrayList.get(n10)).floatValue(), fArray3, null);
            fArray[n9] = fArray3[0];
            fArray2[n9] = fArray3[1];
            f8 += f11;
            int n11 = n10 + 1;
            int n12 = n10;
            if (n11 < arrayList.size()) {
                n12 = n10;
                if (f8 > ((Float)arrayList.get(n11)).floatValue()) {
                    object.nextContour();
                    n12 = n11;
                }
            }
            ++n9;
            n10 = n12;
        }
        object = string != null ? PropertyValuesHolder.ofFloat((String)string, (float[])fArray) : null;
        string = pathMeasure;
        if (string2 != null) {
            string = PropertyValuesHolder.ofFloat((String)string2, (float[])fArray2);
        }
        if (object == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{string});
            return;
        }
        if (string == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{object});
            return;
        }
        objectAnimator.setValues(new PropertyValuesHolder[]{object, string});
    }

    private static class a
    implements TypeEvaluator<d.b[]> {
        private d.b[] a;

        a() {
        }

        public d.b[] a(float f8, d.b[] bArray, d.b[] bArray2) {
            if (d.b(bArray, bArray2)) {
                if (!d.b(this.a, bArray)) {
                    this.a = d.f(bArray);
                }
                for (int i8 = 0; i8 < bArray.length; ++i8) {
                    this.a[i8].h(bArray[i8], bArray2[i8], f8);
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}

