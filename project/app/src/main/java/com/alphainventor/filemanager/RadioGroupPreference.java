/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import androidx.preference.Preference;
import androidx.preference.h;

public class RadioGroupPreference
extends Preference {
    private RadioGroup R0;
    private a S0;

    public RadioGroupPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RadioGroup T0() {
        return this.R0;
    }

    public void U0(a a8) {
        this.S0 = a8;
    }

    @Override
    public void c0(h h8) {
        super.c0(h8);
        this.R0 = (RadioGroup)h8.N(2131362725);
        a a8 = this.S0;
        if (a8 != null) {
            a8.a(h8);
        }
    }

    public static interface a {
        public void a(h var1);
    }
}

