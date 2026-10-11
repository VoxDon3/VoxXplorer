package com.google.android.material.bottomsheet;

import android.view.View;
import ax.c0.C1789s0;
import ax.c0.F0;
import ax.l6.C2472a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class b extends C1789s0.b {
    private final View c;
    private int d;
    private int e;
    private final int[] f;

    public b(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // ax.c0.C1789s0.b
    public void b(C1789s0 c1789s0) {
        this.c.setTranslationY(0.0f);
    }

    @Override // ax.c0.C1789s0.b
    public void c(C1789s0 c1789s0) {
        this.c.getLocationOnScreen(this.f);
        this.d = this.f[1];
    }

    @Override // ax.c0.C1789s0.b
    public F0 d(F0 f0, List<C1789s0> list) {
        Iterator<C1789s0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().c() & F0.m.c()) != 0) {
                this.c.setTranslationY(C2472a.c(this.e, 0, r0.b()));
                break;
            }
        }
        return f0;
    }

    @Override // ax.c0.C1789s0.b
    public C1789s0.a e(C1789s0 c1789s0, C1789s0.a aVar) {
        this.c.getLocationOnScreen(this.f);
        int i = this.d - this.f[1];
        this.e = i;
        this.c.setTranslationY(i);
        return aVar;
    }
}
