/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import ax.k6.g;
import ax.k6.i;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.f;

class TimePickerView
extends ConstraintLayout {
    private final ClockHandView A;
    private final ClockFaceView B;
    private final MaterialButtonToggleGroup C;
    private final View.OnClickListener D = new View.OnClickListener(this){
        final TimePickerView a;
        {
            this.a = timePickerView;
        }

        public void onClick(View view) {
            TimePickerView.C(this.a);
        }
    };
    private final Chip y;
    private final Chip z;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context object, AttributeSet attributeSet, int n8) {
        super((Context)object, attributeSet, n8);
        LayoutInflater.from((Context)object).inflate(i.n, (ViewGroup)this);
        this.B = (ClockFaceView)this.findViewById(g.k);
        object = (MaterialButtonToggleGroup)this.findViewById(g.n);
        this.C = object;
        ((MaterialButtonToggleGroup)((Object)object)).q(new f(this));
        this.y = (Chip)this.findViewById(g.q);
        this.z = (Chip)this.findViewById(g.o);
        this.A = (ClockHandView)this.findViewById(g.l);
        this.F();
        this.E();
    }

    public static /* synthetic */ void B(TimePickerView timePickerView, MaterialButtonToggleGroup materialButtonToggleGroup, int n8, boolean bl) {
        ((Object)((Object)timePickerView)).getClass();
    }

    static /* synthetic */ e C(TimePickerView timePickerView) {
        ((Object)((Object)timePickerView)).getClass();
        return null;
    }

    static /* synthetic */ d D(TimePickerView timePickerView) {
        ((Object)((Object)timePickerView)).getClass();
        return null;
    }

    private void E() {
        Chip chip = this.y;
        int n8 = g.L;
        chip.setTag(n8, 12);
        this.z.setTag(n8, 10);
        this.y.setOnClickListener(this.D);
        this.z.setOnClickListener(this.D);
        this.y.setAccessibilityClassName("android.view.View");
        this.z.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint(value={"ClickableViewAccessibility"})
    private void F() {
        View.OnTouchListener onTouchListener = new View.OnTouchListener(){
            final GestureDetector a;
            final TimePickerView b;
            {
                this.b = timePickerView;
                this.a = gestureDetector;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable)view).isChecked()) {
                    return this.a.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.y.setOnTouchListener(onTouchListener);
        this.z.setOnTouchListener(onTouchListener);
    }

    protected void onVisibilityChanged(View view, int n8) {
        super.onVisibilityChanged(view, n8);
        if (view == this && n8 == 0) {
            this.z.sendAccessibilityEvent(8);
        }
    }

    static interface d {
    }

    static interface e {
    }
}

