package com.voxdon.xplorer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import androidx.preference.Preference;
import androidx.preference.h;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class RadioGroupPreference extends Preference {
    private RadioGroup R0;
    private a S0;

    public interface a {
        void a(h hVar);
    }

    public RadioGroupPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RadioGroup T0() {
        return this.R0;
    }

    public void U0(a aVar) {
        this.S0 = aVar;
    }

    @Override // androidx.preference.Preference
    public void c0(h hVar) {
        super.c0(hVar);
        this.R0 = (RadioGroup) hVar.N(R.id.radio_group);
        a aVar = this.S0;
        if (aVar != null) {
            aVar.a(hVar);
        }
    }
}
