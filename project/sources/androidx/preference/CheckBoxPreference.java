package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import ax.S.k;
import ax.b2.C1478f;
import ax.b2.C1484l;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final a W0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (CheckBoxPreference.this.h(Boolean.valueOf(z))) {
                CheckBoxPreference.this.U0(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a1(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.R0);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.W0);
        }
    }

    private void b1(View view) {
        if (((AccessibilityManager) s().getSystemService("accessibility")).isEnabled()) {
            a1(view.findViewById(R.id.checkbox));
            Y0(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void c0(h hVar) {
        super.c0(hVar);
        a1(hVar.N(R.id.checkbox));
        Z0(hVar);
    }

    @Override // androidx.preference.Preference
    protected void p0(View view) {
        super.p0(view);
        b1(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.W0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1484l.c, i, i2);
        X0(k.o(obtainStyledAttributes, C1484l.i, C1484l.d));
        W0(k.o(obtainStyledAttributes, C1484l.h, C1484l.e));
        V0(k.b(obtainStyledAttributes, C1484l.g, C1484l.f, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, C1478f.a, R.attr.checkBoxPreferenceStyle));
    }
}
