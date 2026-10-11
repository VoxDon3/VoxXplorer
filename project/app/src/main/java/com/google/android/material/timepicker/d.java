/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import ax.O6.h;
import ax.O6.j;
import ax.k6.g;
import ax.k6.i;
import ax.k6.m;
import com.google.android.material.timepicker.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class d
extends ConstraintLayout {
    private h A;
    private final Runnable y;
    private int z;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public d(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        LayoutInflater.from((Context)context).inflate(i.k, (ViewGroup)this);
        this.setBackground(this.C());
        context = context.obtainStyledAttributes(attributeSet, m.v4, n8, 0);
        this.z = context.getDimensionPixelSize(m.w4, 0);
        this.y = new c(this);
        context.recycle();
    }

    private void B(List<View> list, e e8, int n8) {
        Iterator<View> iterator = list.iterator();
        float f8 = 0.0f;
        while (iterator.hasNext()) {
            e8.h(iterator.next().getId(), g.c, n8, f8);
            f8 += 360.0f / (float)list.size();
        }
    }

    private Drawable C() {
        h h8;
        this.A = h8 = new h();
        h8.d0(new j(0.5f));
        this.A.g0(ColorStateList.valueOf((int)-1));
        return this.A;
    }

    private static boolean G(View view) {
        return "skip".equals(view.getTag());
    }

    private void I() {
        Handler handler = this.getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.y);
            handler.post(this.y);
        }
    }

    int D(int n8) {
        if (n8 == 2) {
            return Math.round((float)this.z * 0.66f);
        }
        return this.z;
    }

    public int E() {
        return this.z;
    }

    public void F(int n8) {
        this.z = n8;
        this.H();
    }

    /*
     * WARNING - void declaration
     */
    protected void H() {
        e e8 = new e();
        e8.f(this);
        HashMap hashMap = new HashMap();
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            void object2;
            Object object;
            View view = this.getChildAt(i8);
            if (view.getId() == g.c || d.G(view)) continue;
            Object object3 = object = (Integer)view.getTag(g.m);
            if (object == null) {
                Integer n8 = 1;
            }
            if (!hashMap.containsKey(object2)) {
                hashMap.put(object2, new ArrayList());
            }
            ((List)hashMap.get(object2)).add(view);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.B((List)entry.getValue(), e8, this.D((Integer)entry.getKey()));
        }
        e8.c(this);
    }

    public void addView(View view, int n8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, n8, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        this.I();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.H();
    }

    @Override
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.I();
    }

    public void setBackgroundColor(int n8) {
        this.A.g0(ColorStateList.valueOf((int)n8));
    }
}

