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
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import ax.c0.C1759d;
import ax.c0.C1760d0;
import ax.g0.C2098c;
import ax.g0.C2100e;
import ax.m.C2506a;

/* renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0581l extends EditText implements ax.c0.K, ax.h0.n {
    private final C0574e a;
    private final w b;
    private final v c;
    private final ax.h0.l d;
    private final C0582m e;
    private a f;

    /* renamed from: androidx.appcompat.widget.l$a */
    class a {
        a() {
        }

        public TextClassifier a() {
            return C0581l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C0581l.super.setTextClassifier(textClassifier);
        }
    }

    public C0581l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506a.D);
    }

    private a getSuperCaller() {
        if (this.f == null) {
            this.f = new a();
        }
        return this.f;
    }

    @Override // ax.c0.K
    public C1759d a(C1759d c1759d) {
        return this.d.a(this, c1759d);
    }

    void d(C0582m c0582m) {
        KeyListener keyListener = getKeyListener();
        if (c0582m.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a2 = c0582m.a(keyListener);
            if (a2 == keyListener) {
                return;
            }
            super.setKeyListener(a2);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.b();
        }
        w wVar = this.b;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ax.h0.j.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0574e c0574e = this.a;
        if (c0574e != null) {
            return c0574e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0574e c0574e = this.a;
        if (c0574e != null) {
            return c0574e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        v vVar;
        return (Build.VERSION.SDK_INT >= 28 || (vVar = this.c) == null) ? getSuperCaller().a() : vVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] E;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.r(this, onCreateInputConnection, editorInfo);
        InputConnection a2 = C0584o.a(onCreateInputConnection, editorInfo, this);
        if (a2 != null && Build.VERSION.SDK_INT <= 30 && (E = C1760d0.E(this)) != null) {
            C2098c.d(editorInfo, E);
            a2 = C2100e.c(this, a2, editorInfo);
        }
        return this.e.d(a2, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (t.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (t.b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.b;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.b;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ax.h0.j.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.j(mode);
        }
    }

    @Override // ax.h0.n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.w(colorStateList);
        this.b.b();
    }

    @Override // ax.h0.n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.x(mode);
        this.b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.b;
        if (wVar != null) {
            wVar.q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        v vVar;
        if (Build.VERSION.SDK_INT >= 28 || (vVar = this.c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            vVar.b(textClassifier);
        }
    }

    public C0581l(Context context, AttributeSet attributeSet, int i) {
        super(I.b(context), attributeSet, i);
        H.a(this, getContext());
        C0574e c0574e = new C0574e(this);
        this.a = c0574e;
        c0574e.e(attributeSet, i);
        w wVar = new w(this);
        this.b = wVar;
        wVar.m(attributeSet, i);
        wVar.b();
        this.c = new v(this);
        this.d = new ax.h0.l();
        C0582m c0582m = new C0582m(this);
        this.e = c0582m;
        c0582m.c(attributeSet, i);
        d(c0582m);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
