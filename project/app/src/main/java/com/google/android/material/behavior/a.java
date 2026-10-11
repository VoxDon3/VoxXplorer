/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.google.android.material.behavior.d;

final class a
extends d {
    a() {
    }

    @Override
    <V extends View> int a(V v8, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v8.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override
    int b() {
        return 0;
    }

    @Override
    int c() {
        return 1;
    }

    @Override
    <V extends View> ViewPropertyAnimator d(V v8, int n8) {
        return v8.animate().translationY((float)n8);
    }

    @Override
    <V extends View> void e(V v8, int n8) {
        v8.setTranslationY((float)n8);
    }
}

