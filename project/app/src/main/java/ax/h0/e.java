/*
 * Decompiled with CFR 0.152.
 */
package ax.h0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

public class e {
    public static ColorStateList a(ImageView imageView) {
        return a.a(imageView);
    }

    public static PorterDuff.Mode b(ImageView imageView) {
        return a.b(imageView);
    }

    public static void c(ImageView imageView, ColorStateList colorStateList) {
        int n8 = Build.VERSION.SDK_INT;
        a.c(imageView, colorStateList);
        if (n8 == 21 && (colorStateList = imageView.getDrawable()) != null && a.a(imageView) != null) {
            if (colorStateList.isStateful()) {
                colorStateList.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable((Drawable)colorStateList);
        }
    }

    public static void d(ImageView imageView, PorterDuff.Mode mode) {
        int n8 = Build.VERSION.SDK_INT;
        a.d(imageView, mode);
        if (n8 == 21 && (mode = imageView.getDrawable()) != null && a.a(imageView) != null) {
            if (mode.isStateful()) {
                mode.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable((Drawable)mode);
        }
    }

    static class a {
        static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }
}

