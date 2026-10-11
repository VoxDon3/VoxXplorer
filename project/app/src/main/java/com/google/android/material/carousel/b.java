/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

abstract class b {
    final int a;

    private b(int n8) {
        this.a = n8;
    }

    private static b b(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager){
            final CarouselLayoutManager b;
            {
                this.b = carouselLayoutManager;
                super(n8);
            }

            @Override
            public void a(RectF rectF, RectF rectF2, RectF rectF3) {
                float f8 = rectF2.left;
                float f9 = rectF3.left;
                if (f8 < f9 && rectF2.right > f9) {
                    f8 = f9 - f8;
                    rectF.left += f8;
                    rectF2.left += f8;
                }
                if ((f8 = rectF2.right) > (f9 = rectF3.right) && rectF2.left < f9) {
                    rectF.right = Math.max(rectF.right - (f8 -= f9), rectF.left);
                    rectF2.right = Math.max(rectF2.right - f8, rectF2.left);
                }
            }

            @Override
            public RectF e(float f8, float f9, float f10, float f11) {
                return new RectF(f11, 0.0f, f9 - f11, f8);
            }

            @Override
            int f() {
                return this.b.c0() - this.b.i0();
            }

            @Override
            int g() {
                return 0;
            }

            @Override
            int h() {
                return this.b.t0();
            }

            @Override
            int i() {
                if (this.b.G2()) {
                    return this.h();
                }
                return this.g();
            }

            @Override
            int j() {
                return this.b.l0();
            }

            @Override
            public void k(View view, int n8, int n9) {
                int n10 = this.j();
                int n11 = this.n(view);
                this.b.E0(view, n8, n10, n9, n10 + n11);
            }

            @Override
            public void l(RectF rectF, RectF rectF2, RectF rectF3) {
                float f8;
                if (rectF2.right <= rectF3.left) {
                    rectF.right = f8 = (float)Math.floor(rectF.right) - 1.0f;
                    rectF.left = Math.min(rectF.left, f8);
                }
                if (rectF2.left >= rectF3.right) {
                    rectF.left = f8 = (float)Math.ceil(rectF.left) + 1.0f;
                    rectF.right = Math.max(f8, rectF.right);
                }
            }

            @Override
            public void m(View view, Rect rect, float f8, float f9) {
                view.offsetLeftAndRight((int)(f9 - ((float)rect.left + f8)));
            }

            int n(View view) {
                RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
                return this.b.X(view) + q8.topMargin + q8.bottomMargin;
            }
        };
    }

    static b c(CarouselLayoutManager carouselLayoutManager, int n8) {
        if (n8 != 0) {
            if (n8 == 1) {
                return b.d(carouselLayoutManager);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return b.b(carouselLayoutManager);
    }

    private static b d(CarouselLayoutManager carouselLayoutManager) {
        return new b(1, carouselLayoutManager){
            final CarouselLayoutManager b;
            {
                this.b = carouselLayoutManager;
                super(n8);
            }

            @Override
            public void a(RectF rectF, RectF rectF2, RectF rectF3) {
                float f8 = rectF2.top;
                float f9 = rectF3.top;
                if (f8 < f9 && rectF2.bottom > f9) {
                    f8 = f9 - f8;
                    rectF.top += f8;
                    rectF3.top += f8;
                }
                if ((f9 = rectF2.bottom) > (f8 = rectF3.bottom) && rectF2.top < f8) {
                    f8 = f9 - f8;
                    rectF.bottom = Math.max(rectF.bottom - f8, rectF.top);
                    rectF2.bottom = Math.max(rectF2.bottom - f8, rectF2.top);
                }
            }

            @Override
            public RectF e(float f8, float f9, float f10, float f11) {
                return new RectF(0.0f, f10, f9, f8 - f10);
            }

            @Override
            int f() {
                return this.b.c0();
            }

            @Override
            int g() {
                return this.b.j0();
            }

            @Override
            int h() {
                return this.b.t0() - this.b.k0();
            }

            @Override
            int i() {
                return this.j();
            }

            @Override
            int j() {
                return 0;
            }

            @Override
            public void k(View view, int n8, int n9) {
                int n10 = this.g();
                int n11 = this.n(view);
                this.b.E0(view, n10, n8, n10 + n11, n9);
            }

            @Override
            public void l(RectF rectF, RectF rectF2, RectF rectF3) {
                float f8;
                if (rectF2.bottom <= rectF3.top) {
                    rectF.bottom = f8 = (float)Math.floor(rectF.bottom) - 1.0f;
                    rectF.top = Math.min(rectF.top, f8);
                }
                if (rectF2.top >= rectF3.bottom) {
                    rectF.top = f8 = (float)Math.ceil(rectF.top) + 1.0f;
                    rectF.bottom = Math.max(f8, rectF.bottom);
                }
            }

            @Override
            public void m(View view, Rect rect, float f8, float f9) {
                view.offsetTopAndBottom((int)(f9 - ((float)rect.top + f8)));
            }

            int n(View view) {
                RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
                return this.b.Y(view) + q8.leftMargin + q8.rightMargin;
            }
        };
    }

    abstract void a(RectF var1, RectF var2, RectF var3);

    abstract RectF e(float var1, float var2, float var3, float var4);

    abstract int f();

    abstract int g();

    abstract int h();

    abstract int i();

    abstract int j();

    abstract void k(View var1, int var2, int var3);

    abstract void l(RectF var1, RectF var2, RectF var3);

    abstract void m(View var1, Rect var2, float var3, float var4);
}

