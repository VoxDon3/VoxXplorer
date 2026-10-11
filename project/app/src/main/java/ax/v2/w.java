/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ax.v2.A;

class w {
    private static final boolean a;

    static {
        boolean bl = Build.VERSION.SDK_INT >= 28;
        a = bl;
    }

    static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float)(-view2.getScrollX()), (float)(-view2.getScrollY()));
        A.g(view, matrix);
        A.h((View)viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        matrix.mapRect(rectF);
        int n8 = Math.round(rectF.left);
        int n9 = Math.round(rectF.top);
        int n10 = Math.round(rectF.right);
        int n11 = Math.round(rectF.bottom);
        view2 = new ImageView(view.getContext());
        view2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        viewGroup = w.b(view, matrix, rectF, viewGroup);
        if (viewGroup != null) {
            view2.setImageBitmap((Bitmap)viewGroup);
        }
        view2.measure(View.MeasureSpec.makeMeasureSpec((int)(n10 - n8), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)(n11 - n9), (int)0x40000000));
        view2.layout(n8, n9, n10, n11);
        return view2;
    }

    private static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        boolean bl = view.isAttachedToWindow();
        int n8 = viewGroup != null && viewGroup.isAttachedToWindow() ? 1 : 0;
        Picture picture = null;
        if (!bl) {
            if (n8 == 0) {
                return null;
            }
            viewGroup2 = (ViewGroup)view.getParent();
            n8 = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        } else {
            viewGroup2 = null;
            n8 = 0;
        }
        int n9 = Math.round(rectF.width());
        int n10 = Math.round(rectF.height());
        Picture picture2 = picture;
        if (n9 > 0) {
            picture2 = picture;
            if (n10 > 0) {
                float f8 = Math.min(1.0f, 1048576.0f / (float)(n9 * n10));
                n9 = Math.round((float)n9 * f8);
                n10 = Math.round((float)n10 * f8);
                matrix.postTranslate(-rectF.left, -rectF.top);
                matrix.postScale(f8, f8);
                if (a) {
                    picture2 = new Picture();
                    rectF = picture2.beginRecording(n9, n10);
                    rectF.concat(matrix);
                    view.draw((Canvas)rectF);
                    picture2.endRecording();
                    picture2 = ax.v2.w$a.a(picture2);
                } else {
                    picture2 = Bitmap.createBitmap((int)n9, (int)n10, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                    rectF = new Canvas((Bitmap)picture2);
                    rectF.concat(matrix);
                    view.draw((Canvas)rectF);
                }
            }
        }
        if (!bl) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, n8);
        }
        return picture2;
    }

    static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        return animatorSet;
    }

    static class a {
        static Bitmap a(Picture picture) {
            return Bitmap.createBitmap((Picture)picture);
        }
    }
}

