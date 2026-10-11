/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.q;

public class AppCompatImageView
extends ImageView {
    private final e a;
    private final q b;
    private boolean c = false;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context object, AttributeSet attributeSet, int n8) {
        super(I.b((Context)object), attributeSet, n8);
        H.a((View)this, this.getContext());
        object = new e((View)this);
        this.a = object;
        ((e)object).e(attributeSet, n8);
        this.b = object = new q(this);
        ((q)object).g(attributeSet, n8);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.a;
        if (object != null) {
            ((e)object).b();
        }
        if ((object = this.b) != null) {
            ((q)object).c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e e8 = this.a;
        if (e8 != null) {
            return e8.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e e8 = this.a;
        if (e8 != null) {
            return e8.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        q q8 = this.b;
        if (q8 != null) {
            return q8.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        q q8 = this.b;
        if (q8 != null) {
            return q8.e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.b.f() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e e8 = this.a;
        if (e8 != null) {
            e8.f(drawable);
        }
    }

    public void setBackgroundResource(int n8) {
        super.setBackgroundResource(n8);
        e e8 = this.a;
        if (e8 != null) {
            e8.g(n8);
        }
    }

    public void setImageBitmap(Bitmap object) {
        super.setImageBitmap((Bitmap)object);
        object = this.b;
        if (object != null) {
            ((q)object).c();
        }
    }

    public void setImageDrawable(Drawable object) {
        q q8 = this.b;
        if (q8 != null && object != null && !this.c) {
            q8.h((Drawable)object);
        }
        super.setImageDrawable((Drawable)object);
        object = this.b;
        if (object != null) {
            ((q)object).c();
            if (!this.c) {
                this.b.b();
            }
        }
    }

    public void setImageLevel(int n8) {
        super.setImageLevel(n8);
        this.c = true;
    }

    public void setImageResource(int n8) {
        q q8 = this.b;
        if (q8 != null) {
            q8.i(n8);
        }
    }

    public void setImageURI(Uri object) {
        super.setImageURI((Uri)object);
        object = this.b;
        if (object != null) {
            ((q)object).c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e e8 = this.a;
        if (e8 != null) {
            e8.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e e8 = this.a;
        if (e8 != null) {
            e8.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        q q8 = this.b;
        if (q8 != null) {
            q8.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        q q8 = this.b;
        if (q8 != null) {
            q8.k(mode);
        }
    }
}

