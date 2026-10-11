package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    protected boolean R0;
    private CharSequence S0;
    private CharSequence T0;
    private boolean U0;
    private boolean V0;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public boolean O0() {
        return (this.V0 ? this.R0 : !this.R0) || super.O0();
    }

    public boolean T0() {
        return this.R0;
    }

    public void U0(boolean z) {
        boolean z2 = this.R0 != z;
        if (z2 || !this.U0) {
            this.R0 = z;
            this.U0 = true;
            q0(z);
            if (z2) {
                X(O0());
                W();
            }
        }
    }

    public void V0(boolean z) {
        this.V0 = z;
    }

    public void W0(CharSequence charSequence) {
        this.T0 = charSequence;
        if (T0()) {
            return;
        }
        W();
    }

    public void X0(CharSequence charSequence) {
        this.S0 = charSequence;
        if (T0()) {
            W();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void Y0(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.R0
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.S0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.S0
            r5.setText(r0)
        L19:
            r0 = 0
            goto L2e
        L1b:
            boolean r0 = r4.R0
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.T0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.T0
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.M()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = 0
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.Y0(android.view.View):void");
    }

    protected void Z0(h hVar) {
        Y0(hVar.N(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected void d0() {
        super.d0();
        boolean z = !T0();
        if (h(Boolean.valueOf(z))) {
            U0(z);
        }
    }

    @Override // androidx.preference.Preference
    protected Object g0(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    protected void k0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.k0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.k0(aVar.getSuperState());
        U0(aVar.q);
    }

    @Override // androidx.preference.Preference
    protected Parcelable l0() {
        Parcelable l0 = super.l0();
        if (T()) {
            return l0;
        }
        a aVar = new a(l0);
        aVar.q = T0();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void m0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        U0(F(((Boolean) obj).booleanValue()));
    }

    static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0032a();
        boolean q;

        /* renamed from: androidx.preference.TwoStatePreference$a$a, reason: collision with other inner class name */
        class C0032a implements Parcelable.Creator<a> {
            C0032a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        a(Parcel parcel) {
            super(parcel);
            this.q = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.q ? 1 : 0);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
