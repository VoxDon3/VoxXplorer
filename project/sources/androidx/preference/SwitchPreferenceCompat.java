package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import ax.S.k;
import ax.b2.C1478f;
import ax.b2.C1480h;
import ax.b2.C1484l;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a W0;
    private CharSequence X0;
    private CharSequence Y0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreferenceCompat.this.h(Boolean.valueOf(z))) {
                SwitchPreferenceCompat.this.U0(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.W0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1484l.Z0, i, i2);
        X0(k.o(obtainStyledAttributes, C1484l.h1, C1484l.a1));
        W0(k.o(obtainStyledAttributes, C1484l.g1, C1484l.b1));
        b1(k.o(obtainStyledAttributes, C1484l.j1, C1484l.d1));
        a1(k.o(obtainStyledAttributes, C1484l.i1, C1484l.e1));
        V0(k.b(obtainStyledAttributes, C1484l.f1, C1484l.c1, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c1(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.R0);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.X0);
            switchCompat.setTextOff(this.Y0);
            switchCompat.setOnCheckedChangeListener(this.W0);
        }
    }

    private void d1(View view) {
        if (((AccessibilityManager) s().getSystemService("accessibility")).isEnabled()) {
            c1(view.findViewById(C1480h.f));
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
        c1(hVar.N(C1480h.f));
        Z0(hVar);
    }

    @Override // androidx.preference.Preference
    protected void p0(View view) {
        super.p0(view);
        d1(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1478f.k);
    }
}
