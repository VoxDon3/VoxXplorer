/*
 * Decompiled with CFR 0.152.
 */
package ax.H6;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import ax.K6.b;
import ax.T.d;
import ax.k6.m;
import ax.u0.l;

public class i {
    private static float a(String[] object, int n8) {
        float f8 = Float.parseFloat(object[n8]);
        if (!(f8 < 0.0f) && !(f8 > 1.0f)) {
            return f8;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Motion easing control point value must be between 0 and 1; instead got: ");
        ((StringBuilder)object).append(f8);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    private static String b(String string, String string2) {
        return string.substring(string2.length() + 1, string.length() - 1);
    }

    private static TimeInterpolator c(String stringArray) {
        if (i.e((String)stringArray, "cubic-bezier")) {
            if ((stringArray = i.b((String)stringArray, "cubic-bezier").split(",")).length == 4) {
                return new PathInterpolator(i.a(stringArray, 0), i.a(stringArray, 1), i.a(stringArray, 2), i.a(stringArray, 3));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            stringBuilder.append(stringArray.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (i.e((String)stringArray, "path")) {
            return new PathInterpolator(d.e(i.b((String)stringArray, "path")));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid motion easing type: ");
        stringBuilder.append((String)stringArray);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static boolean d(String string) {
        return i.e(string, "cubic-bezier") || i.e(string, "path");
        {
        }
    }

    private static boolean e(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("(");
        return string.startsWith(stringBuilder.toString()) && string.endsWith(")");
    }

    public static int f(Context context, int n8, int n9) {
        return b.d(context, n8, n9);
    }

    public static TimeInterpolator g(Context context, int n8, TimeInterpolator object) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(n8, typedValue, true)) {
            return object;
        }
        if (typedValue.type == 3) {
            object = String.valueOf(typedValue.string);
            if (i.d((String)object)) {
                return i.c((String)object);
            }
            return AnimationUtils.loadInterpolator((Context)context, (int)typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static l h(Context context, int n8, int n9) {
        Throwable throwable2;
        block7: {
            Object object;
            block5: {
                block6: {
                    object = b.a(context, n8);
                    context = object == null ? context.obtainStyledAttributes(null, m.W3, 0, n9) : context.obtainStyledAttributes(((TypedValue)object).resourceId, m.W3);
                    object = new l();
                    try {
                        float f8 = context.getFloat(m.Y3, Float.MIN_VALUE);
                        if (f8 == Float.MIN_VALUE) break block5;
                        float f9 = context.getFloat(m.X3, Float.MIN_VALUE);
                        if (f9 == Float.MIN_VALUE) break block6;
                        ((l)object).h(f8);
                        ((l)object).f(f9);
                    }
                    catch (Throwable throwable2) {}
                    context.recycle();
                    return object;
                }
                object = new IllegalArgumentException("A MaterialSpring style must have a damping value.");
                throw object;
                break block7;
            }
            object = new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            throw object;
        }
        context.recycle();
        throw throwable2;
    }
}

