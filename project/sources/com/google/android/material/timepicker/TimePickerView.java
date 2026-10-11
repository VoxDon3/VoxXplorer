package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import ax.k6.C2406g;
import ax.k6.C2408i;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {
    private final ClockHandView A;
    private final ClockFaceView B;
    private final MaterialButtonToggleGroup C;
    private final View.OnClickListener D;
    private final Chip y;
    private final Chip z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.C(TimePickerView.this);
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.D(TimePickerView.this);
            return false;
        }
    }

    class c implements View.OnTouchListener {
        final /* synthetic */ GestureDetector a;

        c(GestureDetector gestureDetector) {
            this.a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ e C(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d D(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void E() {
        Chip chip = this.y;
        int i = C2406g.L;
        chip.setTag(i, 12);
        this.z.setTag(i, 10);
        this.y.setOnClickListener(this.D);
        this.z.setOnClickListener(this.D);
        this.y.setAccessibilityClassName("android.view.View");
        this.z.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void F() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.y.setOnTouchListener(cVar);
        this.z.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.z.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.D = new a();
        LayoutInflater.from(context).inflate(C2408i.n, this);
        this.B = (ClockFaceView) findViewById(C2406g.k);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C2406g.n);
        this.C = materialButtonToggleGroup;
        materialButtonToggleGroup.q(new MaterialButtonToggleGroup.b() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.b
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i2, boolean z) {
                TimePickerView.this.getClass();
            }
        });
        this.y = (Chip) findViewById(C2406g.q);
        this.z = (Chip) findViewById(C2406g.o);
        this.A = (ClockHandView) findViewById(C2406g.l);
        F();
        E();
    }
}
