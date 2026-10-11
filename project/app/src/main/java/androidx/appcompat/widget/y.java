/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.l;
import ax.c0.d0;
import ax.m.j;
import ax.u.h;
import ax.u.i;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class y {
    private static final RectF l = new RectF();
    @SuppressLint(value={"BanConcurrentHashMap"})
    private static j.ConcurrentHashMap<String, Method> m = new j.ConcurrentHashMap();
    private int a = 0;
    private boolean b = false;
    private float c = -1.0f;
    private float d = -1.0f;
    private float e = -1.0f;
    private int[] f = new int[0];
    private boolean g = false;
    private TextPaint h;
    private final TextView i;
    private final Context j;
    private final d k;

    y(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 29) {
            this.k = new c();
            return;
        }
        if (n8 >= 23) {
            this.k = new b();
            return;
        }
        this.k = new d();
    }

    private int[] b(int[] nArray) {
        int n8;
        ArrayList<Integer> arrayList;
        int n9;
        block5: {
            block4: {
                n9 = nArray.length;
                if (n9 == 0) break block4;
                Arrays.sort(nArray);
                arrayList = new ArrayList<Integer>();
                int n10 = 0;
                for (n8 = 0; n8 < n9; ++n8) {
                    int n11 = nArray[n8];
                    if (n11 <= 0 || Collections.binarySearch(arrayList, n11) >= 0) continue;
                    arrayList.add(n11);
                }
                if (n9 != arrayList.size()) break block5;
            }
            return nArray;
        }
        n9 = arrayList.size();
        nArray = new int[n9];
        for (n8 = n10; n8 < n9; ++n8) {
            nArray[n8] = (Integer)arrayList.get(n8);
        }
        return nArray;
    }

    private void c() {
        this.a = 0;
        this.d = -1.0f;
        this.e = -1.0f;
        this.c = -1.0f;
        this.f = new int[0];
        this.b = false;
    }

    private int e(RectF rectF) {
        int n8 = this.f.length;
        if (n8 != 0) {
            int n9 = 1;
            int n10 = n8 - 1;
            n8 = 0;
            while (n9 <= n10) {
                int n11 = (n9 + n10) / 2;
                if (this.x(this.f[n11], rectF)) {
                    n8 = n9;
                    n9 = n11 + 1;
                    continue;
                }
                n10 = n8 = n11 - 1;
            }
            return this.f[n8];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Method k(String string) {
        Exception exception2;
        Object object;
        block5: {
            block4: {
                Method method;
                try {
                    method = (Method)m.get((Object)string);
                    object = method;
                    if (method != null) break block4;
                }
                catch (Exception exception2) {}
                method = TextView.class.getDeclaredMethod(string, null);
                object = method;
                if (method == null) break block4;
                ((AccessibleObject)method).setAccessible(true);
                m.put((Object)string, (Object)method);
                return method;
                break block5;
            }
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Failed to retrieve TextView#");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("() method");
        Log.w((String)"ACTVAutoSizeHelper", (String)((StringBuilder)object).toString(), (Throwable)exception2);
        return null;
    }

    @SuppressLint(value={"BanUncheckedReflection"})
    static <T> T m(Object object, String string, T t8) {
        try {
            object = y.k(string).invoke(object, null);
        }
        catch (Exception exception) {
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        return (T)object;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to invoke TextView#");
        stringBuilder.append(string);
        stringBuilder.append("() method");
        Log.w((String)"ACTVAutoSizeHelper", (String)stringBuilder.toString(), (Throwable)exception);
        return t8;
    }

    @SuppressLint(value={"BanUncheckedReflection"})
    private void s(float f8) {
        if (f8 != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f8);
            boolean bl = this.i.isInLayout();
            if (this.i.getLayout() != null) {
                block7: {
                    this.b = false;
                    Method method = y.k("nullLayouts");
                    if (method == null) break block7;
                    try {
                        method.invoke(this.i, null);
                    }
                    catch (Exception exception) {
                        Log.w((String)"ACTVAutoSizeHelper", (String)"Failed to invoke TextView#nullLayouts() method", (Throwable)exception);
                    }
                }
                if (!bl) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }

    private boolean u() {
        boolean bl = this.y();
        if (bl && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                int n8 = (int)Math.floor((this.e - this.d) / this.c) + 1;
                int[] nArray = new int[n8];
                for (int i8 = 0; i8 < n8; ++i8) {
                    nArray[i8] = Math.round(this.d + (float)i8 * this.c);
                }
                this.f = this.b(nArray);
            }
            this.b = true;
        } else {
            this.b = false;
        }
        return this.b;
    }

    private void v(TypedArray typedArray) {
        int n8 = typedArray.length();
        int[] nArray = new int[n8];
        if (n8 > 0) {
            for (int i8 = 0; i8 < n8; ++i8) {
                nArray[i8] = typedArray.getDimensionPixelSize(i8, -1);
            }
            this.f = this.b(nArray);
            this.w();
        }
    }

    private boolean w() {
        int[] nArray = this.f;
        int n8 = nArray.length;
        boolean bl = n8 > 0;
        this.g = bl;
        if (bl) {
            this.a = 1;
            this.d = nArray[0];
            this.e = nArray[n8 - 1];
            this.c = -1.0f;
        }
        return bl;
    }

    private boolean x(int n8, RectF rectF) {
        CharSequence charSequence = this.i.getText();
        Object object = this.i.getTransformationMethod();
        CharSequence charSequence2 = charSequence;
        if (object != null) {
            object = object.getTransformation(charSequence, (View)this.i);
            charSequence2 = charSequence;
            if (object != null) {
                charSequence2 = object;
            }
        }
        int n9 = this.i.getMaxLines();
        this.l(n8);
        charSequence = this.d(charSequence2, y.m(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), n9);
        if (n9 != -1 && (charSequence.getLineCount() > n9 || charSequence.getLineEnd(charSequence.getLineCount() - 1) != charSequence2.length())) {
            return false;
        }
        return !((float)charSequence.getHeight() > rectF.bottom);
    }

    private boolean y() {
        return this.i instanceof l ^ true;
    }

    private void z(float f8, float f9, float f10) throws IllegalArgumentException {
        if (!(f8 <= 0.0f)) {
            if (!(f9 <= f8)) {
                if (!(f10 <= 0.0f)) {
                    this.a = 1;
                    this.d = f8;
                    this.e = f9;
                    this.c = f10;
                    this.g = false;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The auto-size step granularity (");
                stringBuilder.append(f10);
                stringBuilder.append("px) is less or equal to (0px)");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Maximum auto-size text size (");
            stringBuilder.append(f9);
            stringBuilder.append("px) is less or equal to minimum auto-size text size (");
            stringBuilder.append(f8);
            stringBuilder.append("px)");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Minimum auto-size text size (");
        stringBuilder.append(f8);
        stringBuilder.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a() {
        block9: {
            if (!this.n()) {
                return;
            }
            if (this.b) {
                if (this.i.getMeasuredHeight() <= 0) return;
                if (this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int n8 = this.k.b(this.i) ? 0x100000 : this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft() - this.i.getTotalPaddingRight();
                int n9 = this.i.getHeight() - this.i.getCompoundPaddingBottom() - this.i.getCompoundPaddingTop();
                if (n8 <= 0) return;
                if (n9 <= 0) {
                    return;
                }
                RectF rectF = l;
                synchronized (rectF) {
                    Throwable throwable2;
                    block8: {
                        block7: {
                            try {
                                rectF.setEmpty();
                                rectF.right = n8;
                                rectF.bottom = n9;
                                float f8 = this.e(rectF);
                                if (f8 == this.i.getTextSize()) break block7;
                                this.t(0, f8);
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                        }
                        break block9;
                    }
                    throw throwable2;
                }
            }
        }
        this.b = true;
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int n8, int n9) {
        if (Build.VERSION.SDK_INT >= 23) {
            return androidx.appcompat.widget.y$a.a(charSequence, alignment, n8, n9, this.i, this.h, this.k);
        }
        float f8 = this.i.getLineSpacingMultiplier();
        float f9 = this.i.getLineSpacingExtra();
        boolean bl = this.i.getIncludeFontPadding();
        return new StaticLayout(charSequence, this.h, n8, alignment, f8, f9, bl);
    }

    int f() {
        return Math.round(this.e);
    }

    int g() {
        return Math.round(this.d);
    }

    int h() {
        return Math.round(this.c);
    }

    int[] i() {
        return this.f;
    }

    int j() {
        return this.a;
    }

    void l(int n8) {
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize((float)n8);
    }

    boolean n() {
        return this.y() && this.a != 0;
    }

    void o(AttributeSet attributeSet, int n8) {
        Context context = this.j;
        int[] nArray = ax.m.j.g0;
        context = context.obtainStyledAttributes(attributeSet, nArray, n8, 0);
        TextView textView = this.i;
        d0.j0((View)textView, textView.getContext(), nArray, attributeSet, (TypedArray)context, n8, 0);
        n8 = ax.m.j.l0;
        if (context.hasValue(n8)) {
            this.a = context.getInt(n8, 0);
        }
        float f8 = context.hasValue(n8 = ax.m.j.k0) ? context.getDimension(n8, -1.0f) : -1.0f;
        n8 = ax.m.j.i0;
        float f9 = context.hasValue(n8) ? context.getDimension(n8, -1.0f) : -1.0f;
        n8 = ax.m.j.h0;
        float f10 = context.hasValue(n8) ? context.getDimension(n8, -1.0f) : -1.0f;
        n8 = ax.m.j.j0;
        if (context.hasValue(n8) && (n8 = context.getResourceId(n8, 0)) > 0) {
            attributeSet = context.getResources().obtainTypedArray(n8);
            this.v((TypedArray)attributeSet);
            attributeSet.recycle();
        }
        context.recycle();
        if (this.y()) {
            if (this.a == 1) {
                if (!this.g) {
                    attributeSet = this.j.getResources().getDisplayMetrics();
                    float f11 = f9;
                    if (f9 == -1.0f) {
                        f11 = TypedValue.applyDimension((int)2, (float)12.0f, (DisplayMetrics)attributeSet);
                    }
                    f9 = f10;
                    if (f10 == -1.0f) {
                        f9 = TypedValue.applyDimension((int)2, (float)112.0f, (DisplayMetrics)attributeSet);
                    }
                    f10 = f8;
                    if (f8 == -1.0f) {
                        f10 = 1.0f;
                    }
                    this.z(f11, f9, f10);
                }
                this.u();
            }
            return;
        }
        this.a = 0;
    }

    void p(int n8, int n9, int n10, int n11) throws IllegalArgumentException {
        if (this.y()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            this.z(TypedValue.applyDimension((int)n11, (float)n8, (DisplayMetrics)displayMetrics), TypedValue.applyDimension((int)n11, (float)n9, (DisplayMetrics)displayMetrics), TypedValue.applyDimension((int)n11, (float)n10, (DisplayMetrics)displayMetrics));
            if (this.u()) {
                this.a();
            }
        }
    }

    void q(int[] nArray, int n8) throws IllegalArgumentException {
        if (this.y()) {
            int n9 = nArray.length;
            int n10 = 0;
            if (n9 > 0) {
                Object object;
                int[] nArray2 = new int[n9];
                if (n8 == 0) {
                    object = Arrays.copyOf(nArray, n9);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    while (true) {
                        object = nArray2;
                        if (n10 >= n9) break;
                        nArray2[n10] = Math.round(TypedValue.applyDimension((int)n8, (float)nArray[n10], (DisplayMetrics)displayMetrics));
                        ++n10;
                    }
                }
                this.f = this.b((int[])object);
                if (!this.w()) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("None of the preset sizes is valid: ");
                    ((StringBuilder)object).append(Arrays.toString(nArray));
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
            } else {
                this.g = false;
            }
            if (this.u()) {
                this.a();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void r(int n8) {
        if (!this.y()) return;
        if (n8 != 0) {
            if (n8 == 1) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                this.z(TypedValue.applyDimension((int)2, (float)12.0f, (DisplayMetrics)displayMetrics), TypedValue.applyDimension((int)2, (float)112.0f, (DisplayMetrics)displayMetrics), 1.0f);
                if (!this.u()) return;
                this.a();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown auto-size text type: ");
            stringBuilder.append(n8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.c();
    }

    void t(int n8, float f8) {
        Context context = this.j;
        context = context == null ? Resources.getSystem() : context.getResources();
        this.s(TypedValue.applyDimension((int)n8, (float)f8, (DisplayMetrics)context.getDisplayMetrics()));
    }

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int n8, int n9, TextView textView, TextPaint textPaint, d d8) {
            charSequence = StaticLayout.Builder.obtain((CharSequence)charSequence, (int)0, (int)charSequence.length(), (TextPaint)textPaint, (int)n8);
            alignment = charSequence.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            n8 = n9;
            if (n9 == -1) {
                n8 = Integer.MAX_VALUE;
            }
            alignment.setMaxLines(n8);
            try {
                d8.a((StaticLayout.Builder)charSequence, textView);
            }
            catch (ClassCastException classCastException) {
                Log.w((String)"ACTVAutoSizeHelper", (String)"Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return charSequence.build();
        }
    }

    private static class b
    extends d {
        b() {
        }

        @Override
        void a(StaticLayout.Builder builder, TextView textView) {
            ax.u.h.a(builder, y.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class c
    extends b {
        c() {
        }

        @Override
        void a(StaticLayout.Builder builder, TextView textView) {
            ax.u.h.a(builder, ax.u.i.a(textView));
        }

        @Override
        boolean b(TextView textView) {
            return ax.u.j.a(textView);
        }
    }

    private static class d {
        d() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return y.m(textView, "getHorizontallyScrolling", Boolean.FALSE);
        }
    }
}

