/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.m;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.w;
import ax.h0.j;
import ax.h0.n;
import ax.o.a;

public class d
extends AutoCompleteTextView
implements n {
    private static final int[] d = new int[]{16843126};
    private final e a;
    private final w b;
    private final m c;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.p);
    }

    public d(Context object, AttributeSet attributeSet, int n8) {
        super(I.b((Context)object), attributeSet, n8);
        H.a((View)this, this.getContext());
        object = L.v(this.getContext(), attributeSet, d, n8, 0);
        if (((L)object).s(0)) {
            this.setDropDownBackgroundDrawable(((L)object).g(0));
        }
        ((L)object).x();
        this.a = object = new e((View)this);
        ((e)object).e(attributeSet, n8);
        this.b = object = new w((TextView)this);
        ((w)object).m(attributeSet, n8);
        ((w)object).b();
        this.c = object = new m((EditText)this);
        ((m)object).c(attributeSet, n8);
        this.a((m)object);
    }

    void a(m m8) {
        KeyListener keyListener = this.getKeyListener();
        if (m8.b(keyListener)) {
            boolean bl = super.isFocusable();
            boolean bl2 = super.isClickable();
            boolean bl3 = super.isLongClickable();
            int n8 = super.getInputType();
            if ((m8 = m8.a(keyListener)) != keyListener) {
                super.setKeyListener((KeyListener)m8);
                super.setRawInputType(n8);
                super.setFocusable(bl);
                super.setClickable(bl2);
                super.setLongClickable(bl3);
            }
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.a;
        if (object != null) {
            ((e)object).b();
        }
        if ((object = this.b) != null) {
            ((w)object).b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.o(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = o.a(super.onCreateInputConnection(editorInfo), editorInfo, (View)this);
        return this.c.d(inputConnection, editorInfo);
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

    public void setCompoundDrawables(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawables((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((w)object).p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelative((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((w)object).p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.p((TextView)this, callback));
    }

    public void setDropDownBackgroundResource(int n8) {
        this.setDropDownBackgroundDrawable(ax.o.a.b(this.getContext(), n8));
    }

    public void setEmojiCompatEnabled(boolean bl) {
        this.c.e(bl);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.a(keyListener));
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

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.w(colorStateList);
        this.b.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.x(mode);
        this.b.b();
    }

    public void setTextAppearance(Context context, int n8) {
        super.setTextAppearance(context, n8);
        w w8 = this.b;
        if (w8 != null) {
            w8.q(context, n8);
        }
    }
}

