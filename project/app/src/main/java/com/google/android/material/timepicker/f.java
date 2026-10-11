/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.timepicker.TimePickerView;

public final class f
implements MaterialButtonToggleGroup.b {
    public final TimePickerView a;

    public /* synthetic */ f(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    @Override
    public final void a(MaterialButtonToggleGroup materialButtonToggleGroup, int n8, boolean bl) {
        TimePickerView.B(this.a, materialButtonToggleGroup, n8, bl);
    }
}

