/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.views;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import ax.I3.e;

public class BezelImageView
extends ImageView {
    private Paint a;
    private Paint b;
    private Rect c;
    private RectF d;
    private Drawable e;
    private Drawable f;
    private ColorMatrixColorFilter g;
    private boolean h = false;
    private boolean i = false;
    private Bitmap j;
    private int k;
    private int l;

    public BezelImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BezelImageView(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        context = context.obtainStyledAttributes(attributeSet, ax.I3.e.a, n8, 0);
        attributeSet = context.getDrawable(ax.I3.e.d);
        this.f = attributeSet;
        if (attributeSet != null) {
            attributeSet.setCallback((Drawable.Callback)this);
        }
        attributeSet = context.getDrawable(ax.I3.e.b);
        this.e = attributeSet;
        if (attributeSet != null) {
            attributeSet.setCallback((Drawable.Callback)this);
        }
        this.h = context.getBoolean(ax.I3.e.c, this.h);
        context.recycle();
        context = new Paint();
        this.a = context;
        context.setColor(-16777216);
        context = new Paint();
        this.b = context;
        context.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.j = Bitmap.createBitmap((int)1, (int)1, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        if (this.h) {
            context = new ColorMatrix();
            context.setSaturation(0.0f);
            this.g = new ColorMatrixColorFilter((ColorMatrix)context);
        }
    }

    private void a(Canvas canvas) {
        canvas.saveLayer(this.d, this.b);
    }

    @SuppressLint(value={"WrongConstant"})
    @TargetApi(value=21)
    private void b(Canvas canvas) {
        canvas.saveLayer(this.d, this.b, 12);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful()) {
            this.e.setState(this.getDrawableState());
        }
        if ((drawable = this.f) != null && drawable.isStateful()) {
            this.f.setState(this.getDrawableState());
        }
        if (this.isDuplicateParentStateEnabled()) {
            this.postInvalidateOnAnimation();
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        if (drawable != this.e && drawable != this.f) {
            super.invalidateDrawable(drawable);
            return;
        }
        this.invalidate();
    }

    protected void onDraw(Canvas canvas) {
        Object object = this.c;
        if (object != null) {
            int n8 = object.width();
            int n9 = this.c.height();
            if (n8 != 0 && n9 != 0) {
                Rect rect;
                if (!this.i || n8 != this.k || n9 != this.l) {
                    if (n8 == this.k && n9 == this.l) {
                        this.j.eraseColor(0);
                    } else {
                        this.j.recycle();
                        this.j = Bitmap.createBitmap((int)n8, (int)n9, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                        this.k = n8;
                        this.l = n9;
                    }
                    rect = new Canvas(this.j);
                    if (this.f != null) {
                        n9 = rect.save();
                        this.f.draw((Canvas)rect);
                        Paint paint = this.b;
                        object = this.h && this.isPressed() ? this.g : null;
                        paint.setColorFilter((ColorFilter)object);
                        if (Build.VERSION.SDK_INT > 21) {
                            this.a((Canvas)rect);
                        } else {
                            this.b((Canvas)rect);
                        }
                        super.onDraw((Canvas)rect);
                        rect.restoreToCount(n9);
                    } else if (this.h && this.isPressed()) {
                        n9 = rect.save();
                        rect.drawRect(0.0f, 0.0f, (float)this.k, (float)this.l, this.a);
                        this.b.setColorFilter((ColorFilter)this.g);
                        if (Build.VERSION.SDK_INT > 21) {
                            this.a((Canvas)rect);
                        } else {
                            this.b((Canvas)rect);
                        }
                        super.onDraw((Canvas)rect);
                        rect.restoreToCount(n9);
                    } else {
                        super.onDraw((Canvas)rect);
                    }
                    object = this.e;
                    if (object != null) {
                        object.draw((Canvas)rect);
                    }
                }
                object = this.j;
                rect = this.c;
                canvas.drawBitmap((Bitmap)object, (float)rect.left, (float)rect.top, null);
            }
        }
    }

    protected boolean setFrame(int n8, int n9, int n10, int n11) {
        boolean bl = super.setFrame(n8, n9, n10, n11);
        this.c = new Rect(0, 0, n10 - n8, n11 - n9);
        this.d = new RectF(this.c);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(this.c);
        }
        if ((drawable = this.f) != null) {
            drawable.setBounds(this.c);
        }
        if (bl) {
            this.i = false;
        }
        return bl;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || drawable == this.f || super.verifyDrawable(drawable);
        {
        }
    }
}

