package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import ax.S.k;
import ax.b2.C1478f;
import ax.b2.C1484l;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    private CharSequence R0;
    private CharSequence S0;
    private Drawable T0;
    private CharSequence U0;
    private CharSequence V0;
    private int W0;

    public interface a {
        <T extends Preference> T n(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1484l.j, i, i2);
        String o = k.o(obtainStyledAttributes, C1484l.t, C1484l.k);
        this.R0 = o;
        if (o == null) {
            this.R0 = O();
        }
        this.S0 = k.o(obtainStyledAttributes, C1484l.s, C1484l.l);
        this.T0 = k.c(obtainStyledAttributes, C1484l.q, C1484l.m);
        this.U0 = k.o(obtainStyledAttributes, C1484l.v, C1484l.n);
        this.V0 = k.o(obtainStyledAttributes, C1484l.u, C1484l.o);
        this.W0 = k.n(obtainStyledAttributes, C1484l.r, C1484l.p, 0);
        obtainStyledAttributes.recycle();
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

    @Override // androidx.preference.Preference
    protected void d0() {
        K().u(this);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, C1478f.b, R.attr.dialogPreferenceStyle));
    }
}
