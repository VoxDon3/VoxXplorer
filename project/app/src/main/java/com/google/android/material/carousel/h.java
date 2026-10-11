/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.a;
import com.google.android.material.carousel.c;
import com.google.android.material.carousel.d;
import com.google.android.material.carousel.e;

public final class h
extends c {
    private static final int[] d = new int[]{1};
    private static final int[] e = new int[]{1, 0};
    private int c = 0;

    @Override
    public e g(ax.u6.a a8, View view) {
        int n8 = a8.b();
        if (a8.g()) {
            n8 = a8.a();
        }
        Object object = (RecyclerView.q)view.getLayoutParams();
        float f8 = object.topMargin + object.bottomMargin;
        float f9 = view.getMeasuredHeight();
        if (a8.g()) {
            f8 = object.leftMargin + object.rightMargin;
            f9 = view.getMeasuredWidth();
        }
        float f10 = this.d() + f8;
        float f11 = Math.max(this.c() + f8, f10);
        float f12 = n8;
        float f13 = Math.min(f9 + f8, f12);
        float f14 = ax.W.a.a(f9 / 3.0f + f8, f10 + f8, f11 + f8);
        float f15 = (f13 + f14) / 2.0f;
        object = d;
        f9 = 2.0f * f10;
        if (f12 <= f9) {
            object = new int[1];
            object[0] = (RecyclerView.q)false;
        }
        int[] nArray = e;
        Object object2 = object;
        Object object3 = nArray;
        if (a8.e() == 1) {
            object2 = com.google.android.material.carousel.c.a((int[])object);
            object3 = com.google.android.material.carousel.c.a(nArray);
        }
        int n9 = (int)Math.max(1.0, Math.floor((f12 - (float)com.google.android.material.carousel.d.i((int[])object3) * f15 - (float)com.google.android.material.carousel.d.i((int[])object2) * f11) / f13));
        int n10 = (int)Math.ceil(f12 / f13);
        int n11 = n10 - n9 + 1;
        object = new int[n11];
        for (n9 = 0; n9 < n11; ++n9) {
            object[n9] = (RecyclerView.q)(n10 - n9);
        }
        object3 = a.c(f12, f14, f10, f11, (int[])object2, f15, (int[])object3, f13, (int[])object);
        this.c = ((a)object3).e();
        boolean bl = this.i((a)object3, a8.f());
        n11 = ((a)object3).d;
        if (n11 == 0 && ((a)object3).c == 0 && f12 > f9) {
            ((a)object3).c = 1;
            bl = true;
        }
        object = object3;
        if (bl) {
            n9 = ((a)object3).c;
            n10 = ((a)object3).g;
            object = a.c(f12, f14, f10, f11, new int[]{n9}, f15, new int[]{n11}, f13, new int[]{n10});
        }
        return com.google.android.material.carousel.d.d(view.getContext(), f8, n8, (a)object, a8.e());
    }

    @Override
    public boolean h(ax.u6.a a8, int n8) {
        return n8 < this.c && a8.f() >= this.c || n8 >= this.c && a8.f() < this.c;
    }

    boolean i(a a8, int n8) {
        n8 = a8.e() - n8;
        boolean bl = n8 > 0 && (a8.c > 0 || a8.d > 1);
        while (n8 > 0) {
            int n9 = a8.c;
            if (n9 > 0) {
                a8.c = n9 - 1;
            } else {
                n9 = a8.d;
                if (n9 > 1) {
                    a8.d = n9 - 1;
                }
            }
            --n8;
        }
        return bl;
    }
}

