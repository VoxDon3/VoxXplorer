/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.m;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.v;
import androidx.appcompat.widget.w;
import ax.c0.K;
import ax.c0.d;
import ax.c0.d0;
import ax.g0.c;
import ax.h0.j;
import ax.h0.n;

public class l
extends EditText
implements K,
n {
    private final e a;
    private final w b;
    private final v c;
    private final ax.h0.l d;
    private final m e;
    private a f;

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.D);
    }

    public l(Context object, AttributeSet attributeSet, int n8) {
        super(I.b((Context)object), attributeSet, n8);
        H.a((View)this, this.getContext());
        object = new e((View)this);
        this.a = object;
        ((e)object).e(attributeSet, n8);
        this.b = object = new w((TextView)this);
        ((w)object).m(attributeSet, n8);
        ((w)object).b();
        this.c = new v((TextView)this);
        this.d = new ax.h0.l();
        this.e = object = new m(this);
        ((m)object).c(attributeSet, n8);
        this.d((m)object);
    }

    private a getSuperCaller() {
        if (this.f == null) {
            this.f = new a(this);
        }
        return this.f;
    }

    @Override
    public d a(d d8) {
        return this.d.a((View)this, d8);
    }

    void d(m m8) {
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

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        v v8;
        if (Build.VERSION.SDK_INT < 28 && (v8 = this.c) != null) {
            return v8.a();
        }
        return this.getSuperCaller().a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection;
        InputConnection inputConnection2 = super.onCreateInputConnection(editorInfo);
        this.b.r((TextView)this, inputConnection2, editorInfo);
        inputConnection2 = inputConnection = o.a(inputConnection2, editorInfo, (View)this);
        if (inputConnection != null) {
            inputConnection2 = inputConnection;
            if (Build.VERSION.SDK_INT <= 30) {
                String[] stringArray = d0.E((View)this);
                inputConnection2 = inputConnection;
                if (stringArray != null) {
                    ax.g0.c.d(editorInfo, stringArray);
                    inputConnection2 = ax.g0.e.c((View)this, inputConnection, editorInfo);
                }
            }
        }
        return this.e.d(inputConnection2, editorInfo);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 30 && n8 < 33) {
            ((InputMethodManager)this.getContext().getSystemService("input_method")).isActive((View)this);
        }
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (t.a((View)this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int n8) {
        if (t.b((TextView)this, n8)) {
            return true;
        }
        return super.onTextContextMenuItem(n8);
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

    public void setEmojiCompatEnabled(boolean bl) {
        this.e.e(bl);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
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

    public void setTextClassifier(TextClassifier textClassifier) {
        v v8;
        if (Build.VERSION.SDK_INT < 28 && (v8 = this.c) != null) {
            v8.b(textClassifier);
            return;
        }
        this.getSuperCaller().b(textClassifier);
    }

    class a {
        final l a;

        a(l l8) {
            this.a = l8;
        }

        public TextClassifier a() {
            return l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            l.super.setTextClassifier(textClassifier);
        }
    }
}

