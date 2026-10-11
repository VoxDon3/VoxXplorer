/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.i;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.w;
import ax.h0.j;
import ax.o.a;

public class h
extends CheckedTextView
implements ax.h0.n {
    private final i a;
    private final e b;
    private final w c;
    private n d;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.s);
    }

    public h(Context object, AttributeSet attributeSet, int n8) {
        super(I.b((Context)object), attributeSet, n8);
        H.a((View)this, this.getContext());
        object = new w((TextView)this);
        this.c = object;
        ((w)object).m(attributeSet, n8);
        ((w)object).b();
        this.b = object = new e((View)this);
        ((e)object).e(attributeSet, n8);
        this.a = object = new i(this);
        ((i)object).d(attributeSet, n8);
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
        Object object = this.c;
        if (object != null) {
            ((w)object).b();
        }
        if ((object = this.b) != null) {
            ((e)object).b();
        }
        if ((object = this.a) != null) {
            ((i)object).a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.o(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        i i8 = this.a;
        if (i8 != null) {
            return i8.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        i i8 = this.a;
        if (i8 != null) {
            return i8.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return o.a(super.onCreateInputConnection(editorInfo), editorInfo, (View)this);
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

    public void setCheckMarkDrawable(int n8) {
        this.setCheckMarkDrawable(ax.o.a.b(this.getContext(), n8));
    }

    public void setCheckMarkDrawable(Drawable object) {
        super.setCheckMarkDrawable((Drawable)object);
        object = this.a;
        if (object != null) {
            ((i)object).e();
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.p((TextView)this, callback));
    }

    public void setEmojiCompatEnabled(boolean bl) {
        this.getEmojiTextViewHelper().e(bl);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        i i8 = this.a;
        if (i8 != null) {
            i8.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        i i8 = this.a;
        if (i8 != null) {
            i8.g(mode);
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

    public void setTextAppearance(Context context, int n8) {
        super.setTextAppearance(context, n8);
        w w8 = this.c;
        if (w8 != null) {
            w8.q(context, n8);
        }
    }
}

