/*
 * Decompiled with CFR 0.152.
 */
package ax.l6;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import ax.B.k;
import ax.l6.i;
import java.util.ArrayList;
import java.util.List;

public class h {
    private final k<String, i> a = new k();
    private final k<String, PropertyValuesHolder[]> b = new k();

    private static void a(h object, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            animator = (ObjectAnimator)animator;
            ((h)object).h(animator.getPropertyName(), animator.getValues());
            ((h)object).i(animator.getPropertyName(), i.b((ValueAnimator)animator));
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Animator must be an ObjectAnimator: ");
        ((StringBuilder)object).append(animator);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public static h b(Context context, TypedArray typedArray, int n8) {
        if (typedArray.hasValue(n8) && (n8 = typedArray.getResourceId(n8, 0)) != 0) {
            return h.c(context, n8);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h c(Context object, int n8) {
        Exception exception2;
        block3: {
            Animator animator;
            try {
                animator = AnimatorInflater.loadAnimator((Context)object, (int)n8);
                if (animator instanceof AnimatorSet) {
                    return h.d(((AnimatorSet)animator).getChildAnimations());
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            if (animator == null) return null;
            object = new ArrayList();
            object.add(animator);
            return h.d((List<Animator>)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Can't load animation resource ID #0x");
        ((StringBuilder)object).append(Integer.toHexString(n8));
        Log.w((String)"MotionSpec", (String)((StringBuilder)object).toString(), (Throwable)exception2);
        return null;
    }

    private static h d(List<Animator> list) {
        h h8 = new h();
        int n8 = list.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            h.a(h8, list.get(i8));
        }
        return h8;
    }

    public i e(String string) {
        if (this.g(string)) {
            return this.a.get(string);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        object = (h)object;
        return this.a.equals(((h)object).a);
    }

    public long f() {
        int n8 = this.a.size();
        long l8 = 0L;
        for (int i8 = 0; i8 < n8; ++i8) {
            i i9 = this.a.k(i8);
            l8 = Math.max(l8, i9.c() + i9.d());
        }
        return l8;
    }

    public boolean g(String string) {
        return this.a.get(string) != null;
    }

    public void h(String string, PropertyValuesHolder[] propertyValuesHolderArray) {
        this.b.put(string, propertyValuesHolderArray);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(String string, i i8) {
        this.a.put(string, i8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\n');
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" timings: ");
        stringBuilder.append(this.a);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}

