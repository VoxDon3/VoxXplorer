package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import ax.S.k;
import ax.b2.C1478f;
import ax.b2.C1484l;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final a W0;
    private CharSequence X0;
    private CharSequence Y0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreference.this.h(Boolean.valueOf(z))) {
                SwitchPreference.this.U0(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.W0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1484l.O0, i, i2);
        X0(k.o(obtainStyledAttributes, C1484l.W0, C1484l.P0));
        W0(k.o(obtainStyledAttributes, C1484l.V0, C1484l.Q0));
        b1(k.o(obtainStyledAttributes, C1484l.Y0, C1484l.S0));
        a1(k.o(obtainStyledAttributes, C1484l.X0, C1484l.T0));
        V0(k.b(obtainStyledAttributes, C1484l.U0, C1484l.R0, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c1(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.R0);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.X0);
            r4.setTextOff(this.Y0);
            r4.setOnCheckedChangeListener(this.W0);
        }
    }

    private void d1(View view) {
        if (((AccessibilityManager) s().getSystemService("accessibility")).isEnabled()) {
            c1(view.findViewById(R.id.switch_widget));
            Y0(view.findViewById(R.id.summary));
        }
    }

    public void a1(CharSequence charSequence) {
        this.Y0 = charSequence;
        W();
    }

    public void b1(CharSequence charSequence) {
        this.X0 = charSequence;
        W();
    }

    @Override // androidx.preference.Preference
    public void c0(h hVar) {
        super.c0(hVar);
        c1(hVar.N(R.id.switch_widget));
        Z0(hVar);
    }

    @Override // androidx.preference.Preference
    protected void p0(View view) {
        super.p0(view);
        d1(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, C1478f.l, R.attr.switchPreferenceStyle));
    }
}
