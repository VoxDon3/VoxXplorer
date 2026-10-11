/*
 * Decompiled with CFR 0.152.
 */
package com.android.ex.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import ax.c0.C;

public class PhotoViewPager
extends ViewPager {
    private float l0;
    private int m0;
    private float n0;
    private float o0;
    private c p0;

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U();
    }

    private void U() {
        this.Q(true, new ViewPager.k(this){
            final PhotoViewPager a;
            {
                this.a = photoViewPager;
            }

            @Override
            public void a(View view, float f8) {
                if (!(f8 < 0.0f) && !(f8 >= 1.0f)) {
                    float f9 = -f8;
                    try {
                        view.setTranslationX(f9 * (float)view.getWidth());
                        view.setAlpha(Math.max(0.0f, 1.0f - f8));
                        f8 = Math.max(0.0f, 1.0f - f8 * 0.3f);
                        view.setScaleX(f8);
                        view.setScaleY(f8);
                        return;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        view.setTranslationX(0.0f);
                        view.setAlpha(1.0f);
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        return;
                    }
                }
                view.setTranslationX(0.0f);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object object = this.p0;
        object = object != null ? object.b(this.n0, this.o0) : b.q;
        b b8 = b.e0;
        int n8 = 1;
        int n9 = object != b8 && object != b.c0 ? 0 : 1;
        boolean bl = object == b8 || object == b.d0;
        int n10 = motionEvent.getAction() & 0xFF;
        if (n10 == 3 || n10 == 1) {
            this.m0 = -1;
        }
        if (n10 != 0) {
            if (n10 != 2) {
                if (n10 == 6 && C.c(motionEvent, n9 = C.b(motionEvent)) == this.m0) {
                    n9 = n9 == 0 ? n8 : 0;
                    this.l0 = C.d(motionEvent, n9);
                    this.m0 = C.c(motionEvent, n9);
                }
            } else if ((n9 != 0 || bl) && (n8 = this.m0) != -1) {
                float f8 = C.d(motionEvent, C.a(motionEvent, n8));
                if (n9 != 0 && bl) {
                    this.l0 = f8;
                    return false;
                }
                if (n9 != 0 && f8 > this.l0) {
                    this.l0 = f8;
                    return false;
                }
                if (bl && f8 < this.l0) {
                    this.l0 = f8;
                    return false;
                }
            }
        } else {
            this.l0 = motionEvent.getX();
            this.n0 = motionEvent.getRawX();
            this.o0 = motionEvent.getRawY();
            this.m0 = C.c(motionEvent, 0);
        }
        try {
            boolean bl2 = super.onInterceptTouchEvent(motionEvent);
            return bl2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RuntimeException var1_5;
        try {
            boolean bl = super.onTouchEvent(motionEvent);
            return bl;
        }
        catch (NullPointerException nullPointerException) {
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        var1_5.printStackTrace();
        return false;
    }

    public void setOnInterceptTouchListener(c c8) {
        this.p0 = c8;
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        private static final b[] f0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = new b();
            d0 = new b();
            e0 = new b();
            f0 = b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0, d0, e0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])f0.clone();
        }
    }

    public static interface c {
        public b b(float var1, float var2);
    }
}

