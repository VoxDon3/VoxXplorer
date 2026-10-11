package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import ax.m.C2506a;
import ax.o.C2653a;

/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0577h extends CheckedTextView implements ax.h0.n {
    private final C0578i a;
    private final C0574e b;
    private final w c;
    private C0583n d;

    public C0577h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506a.s);
    }

    private C0583n getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0583n(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        w wVar = this.c;
        if (wVar != null) {
            wVar.b();
        }
        C0574e c0574e = this.b;
        if (c0574e != null) {
            c0574e.b();
        }
        C0578i c0578i = this.a;
        if (c0578i != null) {
            c0578i.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ax.h0.j.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0574e c0574e = this.b;
        if (c0574e != null) {
            return c0574e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0574e c0574e = this.b;
        if (c0574e != null) {
            return c0574e.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0578i c0578i = this.a;
        if (c0578i != null) {
            return c0578i.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0578i c0578i = this.a;
        if (c0578i != null) {
            return c0578i.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0584o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0574e c0574e = this.b;
        if (c0574e != null) {
            c0574e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0574e c0574e = this.b;
        if (c0574e != null) {
            c0574e.g(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0578i c0578i = this.a;
        if (c0578i != null) {
            c0578i.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.c;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.c;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ax.h0.j.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0574e c0574e = this.b;
        if (c0574e != null) {
            c0574e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0574e c0574e = this.b;
        if (c0574e != null) {
            c0574e.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0578i c0578i = this.a;
        if (c0578i != null) {
            c0578i.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0578i c0578i = this.a;
        if (c0578i != null) {
            c0578i.g(mode);
        }
    }

    @Override // ax.h0.n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.w(colorStateList);
        this.c.b();
    }

    @Override // ax.h0.n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.x(mode);
        this.c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.c;
        if (wVar != null) {
            wVar.q(context, i);
        }
    }

    public C0577h(Context context, AttributeSet attributeSet, int i) {
        super(I.b(context), attributeSet, i);
        H.a(this, getContext());
        w wVar = new w(this);
        this.c = wVar;
        wVar.m(attributeSet, i);
        wVar.b();
        C0574e c0574e = new C0574e(this);
        this.b = c0574e;
        c0574e.e(attributeSet, i);
        C0578i c0578i = new C0578i(this);
        this.a = c0578i;
        c0578i.d(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C2653a.b(getContext(), i));
    }
}
