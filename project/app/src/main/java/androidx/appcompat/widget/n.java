/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import ax.m.j;
import ax.x0.f;

class n {
    private final TextView a;
    private final f b;

    n(TextView textView) {
        this.a = textView;
        this.b = new f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArray) {
        return this.b.a(inputFilterArray);
    }

    public boolean b() {
        return this.b.b();
    }

    void c(AttributeSet attributeSet, int n8) {
        Throwable throwable2;
        block4: {
            boolean bl;
            block3: {
                attributeSet = this.a.getContext().obtainStyledAttributes(attributeSet, j.g0, n8, 0);
                try {
                    n8 = j.u0;
                    boolean bl2 = attributeSet.hasValue(n8);
                    bl = true;
                    if (!bl2) break block3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                bl = attributeSet.getBoolean(n8, true);
            }
            attributeSet.recycle();
            this.e(bl);
            return;
        }
        attributeSet.recycle();
        throw throwable2;
    }

    void d(boolean bl) {
        this.b.c(bl);
    }

    void e(boolean bl) {
        this.b.d(bl);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.b.e(transformationMethod);
    }
}

