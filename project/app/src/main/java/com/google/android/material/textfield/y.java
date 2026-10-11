/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import ax.k6.f;
import ax.k6.k;
import com.google.android.material.textfield.r;
import com.google.android.material.textfield.s;
import com.google.android.material.textfield.x;

class y
extends s {
    private int e = ax.k6.f.a;
    private EditText f;
    private final View.OnClickListener g = new x(this);

    y(r r8, int n8) {
        super(r8);
        if (n8 != 0) {
            this.e = n8;
        }
    }

    public static /* synthetic */ void v(y y8, View view) {
        view = y8.f;
        if (view == null) {
            return;
        }
        int n8 = view.getSelectionEnd();
        if (y8.w()) {
            y8.f.setTransformationMethod(null);
        } else {
            y8.f.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
        }
        if (n8 >= 0) {
            y8.f.setSelection(n8);
        }
        y8.r();
    }

    private boolean w() {
        EditText editText = this.f;
        return editText != null && editText.getTransformationMethod() instanceof PasswordTransformationMethod;
    }

    private static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override
    void b(CharSequence charSequence, int n8, int n9, int n10) {
        this.r();
    }

    @Override
    int c() {
        return k.R;
    }

    @Override
    int d() {
        return this.e;
    }

    @Override
    View.OnClickListener f() {
        return this.g;
    }

    @Override
    boolean l() {
        return true;
    }

    @Override
    boolean m() {
        return this.w() ^ true;
    }

    @Override
    void n(EditText editText) {
        this.f = editText;
        this.r();
    }

    @Override
    void s() {
        if (y.x(this.f)) {
            this.f.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
        }
    }

    @Override
    void u() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
        }
    }
}

