/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import ax.c0.F0;
import ax.c0.s0;
import ax.l6.a;
import java.util.List;

class b
extends s0.b {
    private final View c;
    private int d;
    private int e;
    private final int[] f = new int[2];

    public b(View view) {
        super(0);
        this.c = view;
    }

    @Override
    public void b(s0 s02) {
        this.c.setTranslationY(0.0f);
    }

    @Override
    public void c(s0 s02) {
        this.c.getLocationOnScreen(this.f);
        this.d = this.f[1];
    }

    @Override
    public F0 d(F0 f02, List<s0> object) {
        object = object.iterator();
        while (object.hasNext()) {
            s0 s02 = (s0)object.next();
            if ((s02.c() & F0.m.c()) == 0) continue;
            float f8 = a.c(this.e, 0, s02.b());
            this.c.setTranslationY(f8);
            break;
        }
        return f02;
    }

    @Override
    public s0.a e(s0 s02, s0.a a8) {
        this.c.getLocationOnScreen(this.f);
        int n8 = this.f[1];
        this.e = n8 = this.d - n8;
        this.c.setTranslationY((float)n8);
        return a8;
    }
}

