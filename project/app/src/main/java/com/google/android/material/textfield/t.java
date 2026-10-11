/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import ax.F6.z;
import ax.U.a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

class t {
    static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable;
        Drawable drawable2 = drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = a.r(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                drawable.setTintList(ColorStateList.valueOf((int)colorStateList.getColorForState(t.c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            drawable2 = drawable;
            if (mode != null) {
                drawable.setTintMode(mode);
                drawable2 = drawable;
            }
        }
        if (checkableImageButton.getDrawable() != drawable2) {
            checkableImageButton.setImageDrawable(drawable2);
        }
    }

    static ImageView.ScaleType b(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 5) {
                            if (n8 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    private static int[] c(TextInputLayout object, CheckableImageButton object2) {
        object = object.getDrawableState();
        object2 = object2.getDrawableState();
        int n8 = ((TextInputLayout)object).length;
        object = Arrays.copyOf((int[])object, ((TextInputLayout)object).length + ((CheckableImageButton)object2).length);
        System.arraycopy(object2, 0, object, n8, ((CheckableImageButton)object2).length);
        return object;
    }

    static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int n8 = colorStateList.getColorForState(t.c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            textInputLayout = a.r(drawable).mutate();
            textInputLayout.setTintList(ColorStateList.valueOf((int)n8));
            checkableImageButton.setImageDrawable((Drawable)textInputLayout);
        }
    }

    static void e(CheckableImageButton checkableImageButton) {
        if (Build.VERSION.SDK_INT < 23) {
            checkableImageButton.setBackground(ax.L6.a.b(checkableImageButton.getContext(), (int)z.c(checkableImageButton.getContext(), 4)));
        }
    }

    private static void f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean bl = checkableImageButton.hasOnClickListeners();
        boolean bl2 = false;
        int n8 = 1;
        boolean bl3 = onLongClickListener != null;
        if (bl || bl3) {
            bl2 = true;
        }
        checkableImageButton.setFocusable(bl2);
        checkableImageButton.setClickable(bl);
        checkableImageButton.setPressable(bl);
        checkableImageButton.setLongClickable(bl3);
        if (!bl2) {
            n8 = 2;
        }
        checkableImageButton.setImportantForAccessibility(n8);
    }

    static void g(CheckableImageButton checkableImageButton, int n8) {
        checkableImageButton.setMinimumWidth(n8);
        checkableImageButton.setMinimumHeight(n8);
    }

    static void h(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        t.f(checkableImageButton, onLongClickListener);
    }

    static void i(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        t.f(checkableImageButton, onLongClickListener);
    }

    static void j(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}

