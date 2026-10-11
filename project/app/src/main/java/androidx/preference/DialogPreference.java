/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import ax.S.k;
import ax.b2.f;
import ax.b2.l;

public abstract class DialogPreference
extends Preference {
    private CharSequence R0;
    private CharSequence S0;
    private Drawable T0;
    private CharSequence U0;
    private CharSequence V0;
    private int W0;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, f.b, 0x1010091));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public DialogPreference(Context context, AttributeSet object, int n8, int n9) {
        super(context, (AttributeSet)object, n8, n9);
        context = context.obtainStyledAttributes(object, l.j, n8, n9);
        object = k.o((TypedArray)context, l.t, l.k);
        this.R0 = object;
        if (object == null) {
            this.R0 = this.O();
        }
        this.S0 = k.o((TypedArray)context, l.s, l.l);
        this.T0 = k.c((TypedArray)context, l.q, l.m);
        this.U0 = k.o((TypedArray)context, l.v, l.n);
        this.V0 = k.o((TypedArray)context, l.u, l.o);
        this.W0 = k.n((TypedArray)context, l.r, l.p, 0);
        context.recycle();
    }

    public Drawable T0() {
        return this.T0;
    }

    public int U0() {
        return this.W0;
    }

    public CharSequence V0() {
        return this.S0;
    }

    public CharSequence W0() {
        return this.R0;
    }

    public CharSequence X0() {
        return this.V0;
    }

    public CharSequence Y0() {
        return this.U0;
    }

    @Override
    protected void d0() {
        this.K().u(this);
    }

    public static interface a {
        public <T extends Preference> T n(CharSequence var1);
    }
}

