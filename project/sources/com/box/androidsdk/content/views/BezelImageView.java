package com.box.androidsdk.content.views;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import ax.I3.e;

/* loaded from: classes.dex */
public class BezelImageView extends ImageView {
    private Paint a;
    private Paint b;
    private Rect c;
    private RectF d;
    private Drawable e;
    private Drawable f;
    private ColorMatrixColorFilter g;
    private boolean h;
    private boolean i;
    private Bitmap j;
    private int k;
    private int l;

    public BezelImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas) {
        canvas.saveLayer(this.d, this.b);
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(21)
    private void b(Canvas canvas) {
        canvas.saveLayer(this.d, this.b, 12);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful()) {
            this.e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f.setState(getDrawableState());
        }
        if (isDuplicateParentStateEnabled()) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.e || drawable == this.f) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Rect rect = this.c;
        if (rect == null) {
            return;
        }
        int width = rect.width();
        int height = this.c.height();
        if (width == 0 || height == 0) {
            return;
        }
        if (!this.i || width != this.k || height != this.l) {
            if (width == this.k && height == this.l) {
                this.j.eraseColor(0);
            } else {
                this.j.recycle();
                this.j = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.k = width;
                this.l = height;
            }
            Canvas canvas2 = new Canvas(this.j);
            if (this.f != null) {
                int save = canvas2.save();
                this.f.draw(canvas2);
                this.b.setColorFilter((this.h && isPressed()) ? this.g : null);
                if (Build.VERSION.SDK_INT > 21) {
                    a(canvas2);
                } else {
                    b(canvas2);
                }
                super.onDraw(canvas2);
                canvas2.restoreToCount(save);
            } else if (this.h && isPressed()) {
                int save2 = canvas2.save();
                canvas2.drawRect(0.0f, 0.0f, this.k, this.l, this.a);
                this.b.setColorFilter(this.g);
                if (Build.VERSION.SDK_INT > 21) {
                    a(canvas2);
                } else {
                    b(canvas2);
                }
                super.onDraw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                super.onDraw(canvas2);
            }
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.draw(canvas2);
            }
        }
        Bitmap bitmap = this.j;
        Rect rect2 = this.c;
        canvas.drawBitmap(bitmap, rect2.left, rect2.top, (Paint) null);
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        this.c = new Rect(0, 0, i3 - i, i4 - i2);
        this.d = new RectF(this.c);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(this.c);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setBounds(this.c);
        }
        if (frame) {
            this.i = false;
        }
        return frame;
    }

    @Override // android.widget.ImageView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || drawable == this.f || super.verifyDrawable(drawable);
    }

    public BezelImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = false;
        this.i = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(e.d);
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(e.b);
        this.e = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.h = obtainStyledAttributes.getBoolean(e.c, this.h);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-16777216);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.j = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        if (this.h) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.g = new ColorMatrixColorFilter(colorMatrix);
        }
    }
}
