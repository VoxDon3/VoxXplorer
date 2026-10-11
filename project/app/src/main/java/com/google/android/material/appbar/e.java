/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.appbar;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import ax.k6.c;
import ax.k6.h;

class e {
    private static final int[] a = new int[]{16843848};

    static void a(View view, float f8) {
        int n8 = view.getResources().getInteger(h.a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        int n9 = c.b0;
        int n10 = -c.c0;
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)view, (String)"elevation", (float[])new float[]{0.0f});
        long l8 = n8;
        objectAnimator = objectAnimator.setDuration(l8);
        stateListAnimator.addState(new int[]{16842910, n9, n10}, (Animator)objectAnimator);
        objectAnimator = ObjectAnimator.ofFloat((Object)view, (String)"elevation", (float[])new float[]{f8}).setDuration(l8);
        stateListAnimator.addState(new int[]{16842910}, (Animator)objectAnimator);
        objectAnimator = ObjectAnimator.ofFloat((Object)view, (String)"elevation", (float[])new float[]{0.0f}).setDuration(0L);
        stateListAnimator.addState(new int[0], (Animator)objectAnimator);
        view.setStateListAnimator(stateListAnimator);
    }
}

