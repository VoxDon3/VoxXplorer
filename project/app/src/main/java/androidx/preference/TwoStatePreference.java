/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.h;

public abstract class TwoStatePreference
extends Preference {
    protected boolean R0;
    private CharSequence S0;
    private CharSequence T0;
    private boolean U0;
    private boolean V0;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
    }

    @Override
    public boolean O0() {
        boolean bl = this.V0 ? this.R0 : !this.R0;
        return bl || super.O0();
        {
        }
    }

    public boolean T0() {
        return this.R0;
    }

    public void U0(boolean bl) {
        boolean bl2 = this.R0 != bl;
        if (bl2 || !this.U0) {
            this.R0 = bl;
            this.U0 = true;
            this.q0(bl);
            if (bl2) {
                this.X(this.O0());
                this.W();
            }
        }
    }

    public void V0(boolean bl) {
        this.V0 = bl;
    }

    public void W0(CharSequence charSequence) {
        this.T0 = charSequence;
        if (!this.T0()) {
            this.W();
        }
    }

    public void X0(CharSequence charSequence) {
        this.S0 = charSequence;
        if (this.T0()) {
            this.W();
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void Y0(View var1_1) {
        if (var1_1 instanceof TextView) {
            var1_1 = (TextView)var1_1;
            var5_2 = this.R0;
            var4_3 = 0;
            if (var5_2 && !TextUtils.isEmpty((CharSequence)this.S0)) {
                var1_1.setText(this.S0);
lbl7:
                // 2 sources

                while (true) {
                    var2_4 = 0;
                    break;
                }
            } else {
                if (!this.R0 && !TextUtils.isEmpty((CharSequence)this.T0)) {
                    var1_1.setText(this.T0);
                    ** continue;
                }
                var2_4 = 1;
            }
            var3_5 = var2_4;
            if (var2_4 != 0) {
                var6_6 = this.M();
                var3_5 = var2_4;
                if (!TextUtils.isEmpty((CharSequence)var6_6)) {
                    var1_1.setText(var6_6);
                    var3_5 = 0;
                }
            }
            if ((var2_4 = var3_5 == 0 ? var4_3 : 8) != var1_1.getVisibility()) {
                var1_1.setVisibility(var2_4);
            }
        }
    }

    protected void Z0(h h8) {
        this.Y0(h8.N(0x1020010));
    }

    @Override
    protected void d0() {
        super.d0();
        boolean bl = this.T0() ^ true;
        if (this.h(bl)) {
            this.U0(bl);
        }
    }

    @Override
    protected Object g0(TypedArray typedArray, int n8) {
        return typedArray.getBoolean(n8, false);
    }

    @Override
    protected void k0(Parcelable object) {
        if (object != null && object.getClass().equals(a.class)) {
            object = (a)((Object)object);
            super.k0(object.getSuperState());
            this.U0(object.q);
            return;
        }
        super.k0((Parcelable)object);
    }

    @Override
    protected Parcelable l0() {
        Object object = super.l0();
        if (this.T()) {
            return object;
        }
        object = new a((Parcelable)object);
        object.q = this.T0();
        return object;
    }

    @Override
    protected void m0(Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = Boolean.FALSE;
        }
        this.U0(this.F((Boolean)object2));
    }

    static class a
    extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>(){

            public a a(Parcel parcel) {
                return new a(parcel);
            }

            public a[] b(int n8) {
                return new a[n8];
            }
        };
        boolean q;

        a(Parcel parcel) {
            super(parcel);
            int n8 = parcel.readInt();
            boolean bl = true;
            if (n8 != 1) {
                bl = false;
            }
            this.q = bl;
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.q ? 1 : 0);
        }
    }
}

