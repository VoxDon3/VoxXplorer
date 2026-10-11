/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import ax.d0.H;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.r;

abstract class s {
    final TextInputLayout a;
    final r b;
    final Context c;
    final CheckableImageButton d;

    s(r r8) {
        this.a = r8.a;
        this.b = r8;
        this.c = r8.getContext();
        this.d = r8.r();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int n8, int n9, int n10) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    boolean i(int n8) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText) {
    }

    void o(View view, H h8) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean bl) {
    }

    final void r() {
        this.b.L(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }
}

