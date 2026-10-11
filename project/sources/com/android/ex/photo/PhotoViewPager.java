package com.android.ex.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import ax.c0.C;

/* loaded from: classes.dex */
public class PhotoViewPager extends ViewPager {
    private float l0;
    private int m0;
    private float n0;
    private float o0;
    private c p0;

    class a implements ViewPager.k {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.k
        public void a(View view, float f) {
            if (f < 0.0f || f >= 1.0f) {
                view.setTranslationX(0.0f);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return;
            }
            try {
                view.setTranslationX((-f) * view.getWidth());
                view.setAlpha(Math.max(0.0f, 1.0f - f));
                float max = Math.max(0.0f, 1.0f - (f * 0.3f));
                view.setScaleX(max);
                view.setScaleY(max);
            } catch (IllegalArgumentException unused) {
                view.setTranslationX(0.0f);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public interface c {
        b b(float f, float f2);
    }

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        U();
    }

    private void U() {
        Q(true, new a());
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        c cVar = this.p0;
        b b2 = cVar != null ? cVar.b(this.n0, this.o0) : b.NONE;
        b bVar = b.BOTH;
        boolean z = b2 == bVar || b2 == b.LEFT;
        boolean z2 = b2 == bVar || b2 == b.RIGHT;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.m0 = -1;
        }
        if (action == 0) {
            this.l0 = motionEvent.getX();
            this.n0 = motionEvent.getRawX();
            this.o0 = motionEvent.getRawY();
            this.m0 = C.c(motionEvent, 0);
        } else if (action != 2) {
            if (action == 6) {
                int b3 = C.b(motionEvent);
                if (C.c(motionEvent, b3) == this.m0) {
                    int i2 = b3 != 0 ? 0 : 1;
                    this.l0 = C.d(motionEvent, i2);
                    this.m0 = C.c(motionEvent, i2);
                }
            }
        } else if ((z || z2) && (i = this.m0) != -1) {
            float d = C.d(motionEvent, C.a(motionEvent, i));
            if (z && z2) {
                this.l0 = d;
                return false;
            }
            if (z && d > this.l0) {
                this.l0 = d;
                return false;
            }
            if (z2 && d < this.l0) {
                this.l0 = d;
                return false;
            }
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException | IndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setOnInterceptTouchListener(c cVar) {
        this.p0 = cVar;
    }
}
