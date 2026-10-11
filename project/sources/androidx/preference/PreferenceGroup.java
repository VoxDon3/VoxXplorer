package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import ax.B.k;
import ax.b2.C1484l;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    final k<String, Long> R0;
    private final Handler S0;
    private final List<Preference> T0;
    private boolean U0;
    private int V0;
    private boolean W0;
    private int X0;
    private final Runnable Y0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.R0.clear();
            }
        }
    }

    public interface b {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.R0 = new k<>();
        this.S0 = new Handler(Looper.getMainLooper());
        this.U0 = true;
        this.V0 = 0;
        this.W0 = false;
        this.X0 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.Y0 = new a();
        this.T0 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1484l.A0, i, i2);
        int i3 = C1484l.C0;
        this.U0 = ax.S.k.b(obtainStyledAttributes, i3, i3, true);
        int i4 = C1484l.B0;
        if (obtainStyledAttributes.hasValue(i4)) {
            e1(ax.S.k.d(obtainStyledAttributes, i4, i4, SubsamplingScaleImageView.TILE_SIZE_AUTO));
        }
        obtainStyledAttributes.recycle();
    }

    private boolean d1(Preference preference) {
        boolean remove;
        synchronized (this) {
            try {
                preference.j0();
                if (preference.E() == this) {
                    preference.d(null);
                }
                remove = this.T0.remove(preference);
                if (remove) {
                    String B = preference.B();
                    if (B != null) {
                        this.R0.put(B, Long.valueOf(preference.x()));
                        this.S0.removeCallbacks(this.Y0);
                        this.S0.post(this.Y0);
                    }
                    if (this.W0) {
                        preference.f0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    public void T0(Preference preference) {
        U0(preference);
    }

    public boolean U0(Preference preference) {
        long f;
        if (this.T0.contains(preference)) {
            return true;
        }
        if (preference.B() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.E() != null) {
                preferenceGroup = preferenceGroup.E();
            }
            String B = preference.B();
            if (preferenceGroup.V0(B) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + B + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.D() == Integer.MAX_VALUE) {
            if (this.U0) {
                int i = this.V0;
                this.V0 = i + 1;
                preference.I0(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).f1(this.U0);
            }
        }
        int binarySearch = Collections.binarySearch(this.T0, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        if (!b1(preference)) {
            return false;
        }
        synchronized (this) {
            this.T0.add(binarySearch, preference);
        }
        g K = K();
        String B2 = preference.B();
        if (B2 == null || !this.R0.containsKey(B2)) {
            f = K.f();
        } else {
            f = this.R0.get(B2).longValue();
            this.R0.remove(B2);
        }
        preference.b0(K, f);
        preference.d(this);
        if (this.W0) {
            preference.Z();
        }
        Y();
        return true;
    }

    public <T extends Preference> T V0(CharSequence charSequence) {
        T t;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(B(), charSequence)) {
            return this;
        }
        int Z0 = Z0();
        for (int i = 0; i < Z0; i++) {
            PreferenceGroup preferenceGroup = (T) Y0(i);
            if (TextUtils.equals(preferenceGroup.B(), charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t = (T) preferenceGroup.V0(charSequence)) != null) {
                return t;
            }
        }
        return null;
    }

    public int W0() {
        return this.X0;
    }

    @Override // androidx.preference.Preference
    public void X(boolean z) {
        super.X(z);
        int Z0 = Z0();
        for (int i = 0; i < Z0; i++) {
            Y0(i).i0(this, z);
        }
    }

    public b X0() {
        return null;
    }

    public Preference Y0(int i) {
        return this.T0.get(i);
    }

    @Override // androidx.preference.Preference
    public void Z() {
        super.Z();
        this.W0 = true;
        int Z0 = Z0();
        for (int i = 0; i < Z0; i++) {
            Y0(i).Z();
        }
    }

    public int Z0() {
        return this.T0.size();
    }

    protected boolean a1() {
        return true;
    }

    protected boolean b1(Preference preference) {
        preference.i0(this, O0());
        return true;
    }

    public boolean c1(Preference preference) {
        boolean d1 = d1(preference);
        Y();
        return d1;
    }

    public void e1(int i) {
        if (i != Integer.MAX_VALUE && !Q()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.X0 = i;
    }

    @Override // androidx.preference.Preference
    public void f0() {
        super.f0();
        this.W0 = false;
        int Z0 = Z0();
        for (int i = 0; i < Z0; i++) {
            Y0(i).f0();
        }
    }

    public void f1(boolean z) {
        this.U0 = z;
    }

    void g1() {
        synchronized (this) {
            Collections.sort(this.T0);
        }
    }

    @Override // androidx.preference.Preference
    protected void k0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(c.class)) {
            super.k0(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        this.X0 = cVar.q;
        super.k0(cVar.getSuperState());
    }

    @Override // androidx.preference.Preference
    protected Parcelable l0() {
        return new c(super.l0(), this.X0);
    }

    @Override // androidx.preference.Preference
    protected void n(Bundle bundle) {
        super.n(bundle);
        int Z0 = Z0();
        for (int i = 0; i < Z0; i++) {
            Y0(i).n(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected void p(Bundle bundle) {
        super.p(bundle);
        int Z0 = Z0();
        for (int i = 0; i < Z0; i++) {
            Y0(i).p(bundle);
        }
    }

    static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();
        int q;

        class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.q = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.q);
        }

        c(Parcelable parcelable, int i) {
            super(parcelable);
            this.q = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
