/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.j;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.w;
import ax.h0.m;
import ax.o.a;

public class s
extends RadioButton
implements m,
ax.h0.n {
    private final j a;
    private final e b;
    private final w c;
    private n d;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.J);
    }

    public s(Context object, AttributeSet attributeSet, int n8) {
        super(I.b((Context)object), attributeSet, n8);
        H.a((View)this, this.getContext());
        object = new j((CompoundButton)this);
        this.a = object;
        ((j)object).d(attributeSet, n8);
        this.b = object = new e((View)this);
        ((e)object).e(attributeSet, n8);
        this.c = object = new w((TextView)this);
        ((w)object).m(attributeSet, n8);
        this.getEmojiTextViewHelper().c(attributeSet, n8);
    }

    private n getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new n((TextView)this);
        }
        return this.d;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.b;
        if (object != null) {
            ((e)object).b();
        }
        if ((object = this.c) != null) {
            ((w)object).b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e e8 = this.b;
        if (e8 != null) {
            return e8.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e e8 = this.b;
        if (e8 != null) {
            return e8.d();
        }
        return null;
    }

    @Override
    public ColorStateList getSupportButtonTintList() {
        j j8 = this.a;
        if (j8 != null) {
            return j8.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j j8 = this.a;
        if (j8 != null) {
            return j8.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.k();
    }

    public void setAllCaps(boolean bl) {
        super.setAllCaps(bl);
        this.getEmojiTextViewHelper().d(bl);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e e8 = this.b;
        if (e8 != null) {
            e8.f(drawable);
        }
    }

    public void setBackgroundResource(int n8) {
        super.setBackgroundResource(n8);
        e e8 = this.b;
        if (e8 != null) {
            e8.g(n8);
        }
    }

    public void setButtonDrawable(int n8) {
        this.setButtonDrawable(ax.o.a.b(this.getContext(), n8));
    }

    public void setButtonDrawable(Drawable object) {
        super.setButtonDrawable((Drawable)object);
        object = this.a;
        if (object != null) {
            ((j)object).e();
        }
    }

    public void setCompoundDrawables(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawables((Drawable)object, drawable, drawable2, drawable3);
        object = this.c;
        if (object != null) {
            ((w)object).p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelative((Drawable)object, drawable, drawable2, drawable3);
        object = this.c;
        if (object != null) {
            ((w)object).p();
        }
    }

    public void setEmojiCompatEnabled(boolean bl) {
        this.getEmojiTextViewHelper().e(bl);
    }

    public void setFilters(InputFilter[] inputFilterArray) {
        super.setFilters(this.getEmojiTextViewHelper().a(inputFilterArray));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e e8 = this.b;
        if (e8 != null) {
            e8.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e e8 = this.b;
        if (e8 != null) {
            e8.j(mode);
        }
    }

    @Override
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j j8 = this.a;
        if (j8 != null) {
            j8.f(colorStateList);
        }
    }

    @Override
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j j8 = this.a;
        if (j8 != null) {
            j8.g(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.w(colorStateList);
        this.c.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.x(mode);
        this.c.b();
    }
}

