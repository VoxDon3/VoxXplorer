/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

abstract class d {
    d() {
    }

    abstract <V extends View> int a(V var1, ViewGroup.MarginLayoutParams var2);

    abstract int b();

    abstract int c();

    abstract <V extends View> ViewPropertyAnimator d(V var1, int var2);

    abstract <V extends View> void e(V var1, int var2);
}

