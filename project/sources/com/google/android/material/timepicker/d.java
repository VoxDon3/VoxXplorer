package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ax.O6.h;
import ax.O6.j;
import ax.k6.C2406g;
import ax.k6.C2408i;
import ax.k6.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
class d extends ConstraintLayout {
    private h A;
    private final Runnable y;
    private int z;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B(List<View> list, androidx.constraintlayout.widget.e eVar, int i) {
        Iterator<View> it = list.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            eVar.h(it.next().getId(), C2406g.c, i, f);
            f += 360.0f / list.size();
        }
    }

    private Drawable C() {
        h hVar = new h();
        this.A = hVar;
        hVar.d0(new j(0.5f));
        this.A.g0(ColorStateList.valueOf(-1));
        return this.A;
    }

    private static boolean G(View view) {
        return "skip".equals(view.getTag());
    }

    private void I() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.y);
            handler.post(this.y);
        }
    }

    int D(int i) {
        return i == 2 ? Math.round(this.z * 0.66f) : this.z;
    }

    public int E() {
        return this.z;
    }

    public void F(int i) {
        this.z = i;
        H();
    }

    protected void H() {
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.f(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != C2406g.c && !G(childAt)) {
                int i2 = (Integer) childAt.getTag(C2406g.m);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            B((List) entry.getValue(), eVar, D(((Integer) entry.getKey()).intValue()));
        }
        eVar.c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        I();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        H();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        I();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.A.g0(ColorStateList.valueOf(i));
    }

    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C2408i.k, this);
        setBackground(C());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.v4, i, 0);
        this.z = obtainStyledAttributes.getDimensionPixelSize(m.w4, 0);
        this.y = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                d.this.H();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
