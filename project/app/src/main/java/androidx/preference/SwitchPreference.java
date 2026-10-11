/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.preference.TwoStatePreference;
import androidx.preference.h;
import ax.S.k;
import ax.b2.f;
import ax.b2.l;

public class SwitchPreference
extends TwoStatePreference {
    private final a W0 = new a(this);
    private CharSequence X0;
    private CharSequence Y0;

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, f.l, 16843629));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        context = context.obtainStyledAttributes(attributeSet, l.O0, n8, n9);
        this.X0(k.o((TypedArray)context, l.W0, l.P0));
        this.W0(k.o((TypedArray)context, l.V0, l.Q0));
        this.b1(k.o((TypedArray)context, l.Y0, l.S0));
        this.a1(k.o((TypedArray)context, l.X0, l.T0));
        this.V0(k.b((TypedArray)context, l.U0, l.R0, false));
        context.recycle();
    }

    private void c1(View view) {
        boolean bl = view instanceof Switch;
        if (bl) {
            ((Switch)view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(this.R0);
        }
        if (bl) {
            view = (Switch)view;
            view.setTextOn(this.X0);
            view.setTextOff(this.Y0);
            view.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this.W0);
        }
    }

    private void d1(View view) {
        if (!((AccessibilityManager)this.s().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.c1(view.findViewById(16908352));
        this.Y0(view.findViewById(0x1020010));
    }

    public void a1(CharSequence charSequence) {
        this.Y0 = charSequence;
        this.W();
    }

    public void b1(CharSequence charSequence) {
        this.X0 = charSequence;
        this.W();
    }

    @Override
    public void c0(h h8) {
        super.c0(h8);
        this.c1(h8.N(16908352));
        this.Z0(h8);
    }

    @Override
    protected void p0(View view) {
        super.p0(view);
        this.d1(view);
    }

    private class a
    implements CompoundButton.OnCheckedChangeListener {
        final SwitchPreference a;

        a(SwitchPreference switchPreference) {
            this.a = switchPreference;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
            if (!this.a.h(bl)) {
                compoundButton.setChecked(bl ^ true);
                return;
            }
            this.a.U0(bl);
        }
    }
}

