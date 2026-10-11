package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ax.u6.InterfaceC3212a;

/* loaded from: classes3.dex */
public final class h extends c {
    private static final int[] d = {1};
    private static final int[] e = {1, 0};
    private int c = 0;

    @Override // com.google.android.material.carousel.c
    public e g(InterfaceC3212a interfaceC3212a, View view) {
        boolean z;
        int b = interfaceC3212a.b();
        if (interfaceC3212a.g()) {
            b = interfaceC3212a.a();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (interfaceC3212a.g()) {
            f = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float d2 = d() + f;
        float max = Math.max(c() + f, d2);
        float f2 = b;
        float min = Math.min(measuredHeight + f, f2);
        float a = ax.W.a.a((measuredHeight / 3.0f) + f, d2 + f, max + f);
        float f3 = (min + a) / 2.0f;
        int[] iArr = d;
        float f4 = 2.0f * d2;
        if (f2 <= f4) {
            iArr = new int[]{0};
        }
        int[] iArr2 = e;
        if (interfaceC3212a.e() == 1) {
            iArr = c.a(iArr);
            iArr2 = c.a(iArr2);
        }
        int max2 = (int) Math.max(1.0d, Math.floor(((f2 - (d.i(iArr2) * f3)) - (d.i(iArr) * max)) / min));
        int ceil = (int) Math.ceil(f2 / min);
        int i = (ceil - max2) + 1;
        int[] iArr3 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = ceil - i2;
        }
        a c = a.c(f2, a, d2, max, iArr, f3, iArr2, min, iArr3);
        this.c = c.e();
        boolean i3 = i(c, interfaceC3212a.f());
        int i4 = c.d;
        if (i4 == 0 && c.c == 0 && f2 > f4) {
            c.c = 1;
            z = true;
        } else {
            z = i3;
        }
        if (z) {
            c = a.c(f2, a, d2, max, new int[]{c.c}, f3, new int[]{i4}, min, new int[]{c.g});
        }
        return d.d(view.getContext(), f, b, c, interfaceC3212a.e());
    }

    @Override // com.google.android.material.carousel.c
    public boolean h(InterfaceC3212a interfaceC3212a, int i) {
        if (i >= this.c || interfaceC3212a.f() < this.c) {
            return i >= this.c && interfaceC3212a.f() < this.c;
        }
        return true;
    }

    boolean i(a aVar, int i) {
        int e2 = aVar.e() - i;
        boolean z = e2 > 0 && (aVar.c > 0 || aVar.d > 1);
        while (e2 > 0) {
            int i2 = aVar.c;
            if (i2 > 0) {
                aVar.c = i2 - 1;
            } else {
                int i3 = aVar.d;
                if (i3 > 1) {
                    aVar.d = i3 - 1;
                }
            }
            e2--;
        }
        return z;
    }
}
