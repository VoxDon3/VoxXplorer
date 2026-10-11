/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.google.android.material.behavior.d;

final class b
extends d {
    b() {
    }

    @Override
    <V extends View> int a(V v8, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v8.getMeasuredWidth() + marginLayoutParams.leftMargin;
    }

    @Override
    int b() {
        return 0;
    }

    @Override
    int c() {
        return 2;
    }

    @Override
    <V extends View> ViewPropertyAnimator d(V v8, int n8) {
        return v8.animate().translationX((float)(-n8));
    }

    @Override
    <V extends View> void e(V v8, int n8) {
        v8.setTranslationX((float)(-n8));
    }
}

