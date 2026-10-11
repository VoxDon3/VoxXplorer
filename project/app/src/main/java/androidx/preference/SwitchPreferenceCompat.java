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
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.TwoStatePreference;
import androidx.preference.h;
import ax.S.k;
import ax.b2.f;
import ax.b2.l;

public class SwitchPreferenceCompat
extends TwoStatePreference {
    private final a W0 = new a(this);
    private CharSequence X0;
    private CharSequence Y0;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.k);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        context = context.obtainStyledAttributes(attributeSet, l.Z0, n8, n9);
        this.X0(k.o((TypedArray)context, l.h1, l.a1));
        this.W0(k.o((TypedArray)context, l.g1, l.b1));
        this.b1(k.o((TypedArray)context, l.j1, l.d1));
        this.a1(k.o((TypedArray)context, l.i1, l.e1));
        this.V0(k.b((TypedArray)context, l.f1, l.c1, false));
        context.recycle();
    }

    private void c1(View object) {
        boolean bl = object instanceof SwitchCompat;
        if (bl) {
            ((SwitchCompat)((Object)object)).setOnCheckedChangeListener(null);
        }
        if (object instanceof Checkable) {
            ((Checkable)object).setChecked(this.R0);
        }
        if (bl) {
            object = (SwitchCompat)((Object)object);
            ((SwitchCompat)((Object)object)).setTextOn(this.X0);
            ((SwitchCompat)((Object)object)).setTextOff(this.Y0);
            object.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this.W0);
        }
    }

    private void d1(View view) {
        if (!((AccessibilityManager)this.s().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.c1(view.findViewById(ax.b2.h.f));
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
        this.c1(h8.N(ax.b2.h.f));
        this.Z0(h8);
    }

    @Override
    protected void p0(View view) {
        super.p0(view);
        this.d1(view);
    }

    private class a
    implements CompoundButton.OnCheckedChangeListener {
        final SwitchPreferenceCompat a;

        a(SwitchPreferenceCompat switchPreferenceCompat) {
            this.a = switchPreferenceCompat;
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

