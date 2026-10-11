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
import androidx.preference.TwoStatePreference;
import androidx.preference.h;
import ax.S.k;
import ax.b2.f;
import ax.b2.l;

public class CheckBoxPreference
extends TwoStatePreference {
    private final a W0 = new a(this);

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, f.a, 16842895));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        context = context.obtainStyledAttributes(attributeSet, l.c, n8, n9);
        this.X0(k.o((TypedArray)context, l.i, l.d));
        this.W0(k.o((TypedArray)context, l.h, l.e));
        this.V0(k.b((TypedArray)context, l.g, l.f, false));
        context.recycle();
    }

    private void a1(View view) {
        boolean bl = view instanceof CompoundButton;
        if (bl) {
            ((CompoundButton)view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(this.R0);
        }
        if (bl) {
            ((CompoundButton)view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this.W0);
        }
    }

    private void b1(View view) {
        if (!((AccessibilityManager)this.s().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.a1(view.findViewById(0x1020001));
        this.Y0(view.findViewById(0x1020010));
    }

    @Override
    public void c0(h h8) {
        super.c0(h8);
        this.a1(h8.N(0x1020001));
        this.Z0(h8);
    }

    @Override
    protected void p0(View view) {
        super.p0(view);
        this.b1(view);
    }

    private class a
    implements CompoundButton.OnCheckedChangeListener {
        final CheckBoxPreference a;

        a(CheckBoxPreference checkBoxPreference) {
            this.a = checkBoxPreference;
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

