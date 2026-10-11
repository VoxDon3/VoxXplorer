/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.appcompat.widget.L;
import ax.U.c;

class b {
    private static final int[] c = new int[]{16843067, 16843068};
    private final ProgressBar a;
    private Bitmap b;

    b(ProgressBar progressBar) {
        this.a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private Drawable e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            drawable = (AnimationDrawable)drawable;
            int n8 = drawable.getNumberOfFrames();
            AnimationDrawable animationDrawable = new AnimationDrawable();
            animationDrawable.setOneShot(drawable.isOneShot());
            for (int i8 = 0; i8 < n8; ++i8) {
                Drawable drawable2 = this.d(drawable.getFrame(i8), true);
                drawable2.setLevel(10000);
                animationDrawable.addFrame(drawable2, drawable.getDuration(i8));
            }
            animationDrawable.setLevel(10000);
            return animationDrawable;
        }
        return drawable;
    }

    Bitmap b() {
        return this.b;
    }

    void c(AttributeSet object, int n8) {
        object = L.v(this.a.getContext(), (AttributeSet)object, c, n8, 0);
        Drawable drawable = ((L)object).h(0);
        if (drawable != null) {
            this.a.setIndeterminateDrawable(this.e(drawable));
        }
        if ((drawable = ((L)object).h(1)) != null) {
            this.a.setProgressDrawable(this.d(drawable, false));
        }
        ((L)object).x();
    }

    Drawable d(Drawable drawable, boolean bl) {
        if (drawable instanceof c) {
            c c8 = (c)drawable;
            Drawable drawable2 = c8.b();
            if (drawable2 != null) {
                c8.a(this.d(drawable2, bl));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                int n8;
                drawable = (LayerDrawable)drawable;
                int n9 = drawable.getNumberOfLayers();
                LayerDrawable layerDrawable = new Drawable[n9];
                int n10 = 0;
                for (n8 = 0; n8 < n9; ++n8) {
                    int n11 = drawable.getId(n8);
                    Drawable drawable3 = drawable.getDrawable(n8);
                    bl = n11 == 16908301 || n11 == 16908303;
                    layerDrawable[n8] = this.d(drawable3, bl);
                }
                layerDrawable = new LayerDrawable((Drawable[])layerDrawable);
                for (n8 = n10; n8 < n9; ++n8) {
                    layerDrawable.setId(n8, drawable.getId(n8));
                    if (Build.VERSION.SDK_INT < 23) continue;
                    ax.u.b$a.a((LayerDrawable)drawable, layerDrawable, n8);
                }
                return layerDrawable;
            }
            if (drawable instanceof BitmapDrawable) {
                drawable = (BitmapDrawable)drawable;
                Bitmap bitmap = drawable.getBitmap();
                if (this.b == null) {
                    this.b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(this.a());
                bitmap = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
                shapeDrawable.getPaint().setShader((Shader)bitmap);
                shapeDrawable.getPaint().setColorFilter(drawable.getPaint().getColorFilter());
                if (bl) {
                    return new ClipDrawable((Drawable)shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }

    private static class a {
        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int n8) {
            layerDrawable2.setLayerGravity(n8, layerDrawable.getLayerGravity(n8));
            layerDrawable2.setLayerWidth(n8, layerDrawable.getLayerWidth(n8));
            layerDrawable2.setLayerHeight(n8, layerDrawable.getLayerHeight(n8));
            layerDrawable2.setLayerInsetLeft(n8, layerDrawable.getLayerInsetLeft(n8));
            layerDrawable2.setLayerInsetRight(n8, layerDrawable.getLayerInsetRight(n8));
            layerDrawable2.setLayerInsetTop(n8, layerDrawable.getLayerInsetTop(n8));
            layerDrawable2.setLayerInsetBottom(n8, layerDrawable.getLayerInsetBottom(n8));
            layerDrawable2.setLayerInsetStart(n8, layerDrawable.getLayerInsetStart(n8));
            layerDrawable2.setLayerInsetEnd(n8, layerDrawable.getLayerInsetEnd(n8));
        }
    }
}

