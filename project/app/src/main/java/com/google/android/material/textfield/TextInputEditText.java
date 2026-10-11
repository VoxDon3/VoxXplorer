/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ax.F6.i;
import ax.F6.w;
import ax.V6.a;
import ax.k6.l;
import ax.k6.m;
import com.google.android.material.textfield.TextInputLayout;

public class TextInputEditText
extends androidx.appcompat.widget.l {
    private final Rect g = new Rect();
    private boolean h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.D);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int n8) {
        super(a.d(context, attributeSet, n8, 0), attributeSet, n8);
        context = w.i(context, attributeSet, m.O5, n8, l.k, new int[0]);
        this.setTextInputLayoutFocusedRectEnabled(context.getBoolean(m.P5, false));
        context.recycle();
    }

    private String e(TextInputLayout object) {
        Editable editable = this.getText();
        object = ((TextInputLayout)((Object)object)).getHint();
        boolean bl = TextUtils.isEmpty((CharSequence)editable);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        CharSequence charSequence = "";
        object = !bl2 ? object.toString() : "";
        if (!bl) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(editable);
            if (!TextUtils.isEmpty((CharSequence)object)) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(", ");
                ((StringBuilder)charSequence).append((String)object);
                charSequence = ((StringBuilder)charSequence).toString();
            }
            stringBuilder.append((String)charSequence);
            return stringBuilder.toString();
        }
        if (!TextUtils.isEmpty((CharSequence)object)) {
            return object;
        }
        return "";
    }

    private boolean f(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.h;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        ViewParent viewParent = this.getParent();
        while (viewParent instanceof View) {
            if (viewParent instanceof TextInputLayout) {
                return (TextInputLayout)viewParent;
            }
            viewParent = viewParent.getParent();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = this.getTextInputLayout();
        if (this.f(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.g);
            rect.bottom = this.g.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = this.getTextInputLayout();
        if (this.f(textInputLayout)) {
            boolean bl = textInputLayout.getGlobalVisibleRect(rect, point);
            if (bl && point != null) {
                point.offset(-this.getScrollX(), -this.getScrollY());
            }
            return bl;
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && textInputLayout.T()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && textInputLayout.T() && super.getHint() == null && i.d()) {
            this.setHint("");
        }
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = this.getHintFromLayout();
        }
        return inputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            accessibilityNodeInfo.setText((CharSequence)this.e(textInputLayout));
        }
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = this.getTextInputLayout();
        if (this.f(textInputLayout) && rect != null) {
            int n8 = textInputLayout.getHeight();
            int n9 = this.getHeight();
            this.g.set(rect.left, rect.top, rect.right, rect.bottom + (n8 - n9));
            return super.requestRectangleOnScreen(this.g);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean bl) {
        this.h = bl;
    }
}

