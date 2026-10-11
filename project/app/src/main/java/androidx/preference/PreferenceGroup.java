/*
 * Decompiled with CFR 0.152.
 */
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
import androidx.preference.g;
import ax.S.k;
import ax.b2.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class PreferenceGroup
extends Preference {
    final ax.B.k<String, Long> R0 = new ax.B.k();
    private final Handler S0 = new Handler(Looper.getMainLooper());
    private final List<Preference> T0;
    private boolean U0 = true;
    private int V0 = 0;
    private boolean W0 = false;
    private int X0 = Integer.MAX_VALUE;
    private final Runnable Y0 = new Runnable(this){
        final PreferenceGroup q;
        {
            this.q = preferenceGroup;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            synchronized (this) {
                this.q.R0.clear();
                return;
            }
        }
    };

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        this.T0 = new ArrayList<Preference>();
        context = context.obtainStyledAttributes(attributeSet, l.A0, n8, n9);
        n8 = l.C0;
        this.U0 = k.b((TypedArray)context, n8, n8, true);
        n8 = l.B0;
        if (context.hasValue(n8)) {
            this.e1(k.d((TypedArray)context, n8, n8, Integer.MAX_VALUE));
        }
        context.recycle();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean d1(Preference preference) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl;
                block6: {
                    try {
                        preference.j0();
                        if (preference.E() != this) break block6;
                        preference.d(null);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                if (bl = this.T0.remove(preference)) {
                    String string = preference.B();
                    if (string != null) {
                        this.R0.put(string, preference.x());
                        this.S0.removeCallbacks(this.Y0);
                        this.S0.post(this.Y0);
                    }
                    if (this.W0) {
                        preference.f0();
                    }
                }
                return bl;
            }
            throw throwable2;
        }
    }

    public void T0(Preference preference) {
        this.U0(preference);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean U0(Preference preference) {
        long l8;
        int n8;
        int n9;
        String string;
        Object object;
        if (this.T0.contains(preference)) {
            return true;
        }
        if (preference.B() != null) {
            object = this;
            while (((Preference)object).E() != null) {
                object = ((Preference)object).E();
            }
            string = preference.B();
            if (((PreferenceGroup)object).V0(string) != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Found duplicated key: \"");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("\". This can cause unintended behaviour, please use unique keys for every preference.");
                Log.e((String)"PreferenceGroup", (String)((StringBuilder)object).toString());
            }
        }
        if (preference.D() == Integer.MAX_VALUE) {
            if (this.U0) {
                n9 = this.V0;
                this.V0 = n9 + 1;
                preference.I0(n9);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup)preference).f1(this.U0);
            }
        }
        n9 = n8 = Collections.binarySearch(this.T0, preference);
        if (n8 < 0) {
            n9 = n8 * -1 - 1;
        }
        if (!this.b1(preference)) {
            return false;
        }
        synchronized (this) {
            this.T0.add(n9, preference);
        }
        object = this.K();
        string = preference.B();
        if (string != null && this.R0.containsKey(string)) {
            l8 = this.R0.get(string);
            this.R0.remove(string);
        } else {
            l8 = ((g)object).f();
        }
        preference.b0((g)object, l8);
        preference.d(this);
        if (this.W0) {
            preference.Z();
        }
        this.Y();
        return true;
    }

    public <T extends Preference> T V0(CharSequence charSequence) {
        if (charSequence != null) {
            if (TextUtils.equals((CharSequence)this.B(), (CharSequence)charSequence)) {
                return (T)this;
            }
            int n8 = this.Z0();
            for (int i8 = 0; i8 < n8; ++i8) {
                Preference preference = this.Y0(i8);
                if (TextUtils.equals((CharSequence)preference.B(), (CharSequence)charSequence)) {
                    return (T)preference;
                }
                if (!(preference instanceof PreferenceGroup) || (preference = ((PreferenceGroup)preference).V0(charSequence)) == null) continue;
                return (T)preference;
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public int W0() {
        return this.X0;
    }

    @Override
    public void X(boolean bl) {
        super.X(bl);
        int n8 = this.Z0();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.Y0(i8).i0(this, bl);
        }
    }

    public b X0() {
        return null;
    }

    public Preference Y0(int n8) {
        return this.T0.get(n8);
    }

    @Override
    public void Z() {
        super.Z();
        this.W0 = true;
        int n8 = this.Z0();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.Y0(i8).Z();
        }
    }

    public int Z0() {
        return this.T0.size();
    }

    protected boolean a1() {
        return true;
    }

    protected boolean b1(Preference preference) {
        preference.i0(this, this.O0());
        return true;
    }

    public boolean c1(Preference preference) {
        boolean bl = this.d1(preference);
        this.Y();
        return bl;
    }

    public void e1(int n8) {
        if (n8 != Integer.MAX_VALUE && !this.Q()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(" should have a key defined if it contains an expandable preference");
            Log.e((String)"PreferenceGroup", (String)stringBuilder.toString());
        }
        this.X0 = n8;
    }

    @Override
    public void f0() {
        super.f0();
        this.W0 = false;
        int n8 = this.Z0();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.Y0(i8).f0();
        }
    }

    public void f1(boolean bl) {
        this.U0 = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void g1() {
        synchronized (this) {
            Collections.sort(this.T0);
            return;
        }
    }

    @Override
    protected void k0(Parcelable object) {
        if (object != null && object.getClass().equals(c.class)) {
            object = (c)((Object)object);
            this.X0 = object.q;
            super.k0(object.getSuperState());
            return;
        }
        super.k0((Parcelable)object);
    }

    @Override
    protected Parcelable l0() {
        return new c(super.l0(), this.X0);
    }

    @Override
    protected void n(Bundle bundle) {
        super.n(bundle);
        int n8 = this.Z0();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.Y0(i8).n(bundle);
        }
    }

    @Override
    protected void p(Bundle bundle) {
        super.p(bundle);
        int n8 = this.Z0();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.Y0(i8).p(bundle);
        }
    }

    public static interface b {
    }

    static class c
    extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>(){

            public c a(Parcel parcel) {
                return new c(parcel);
            }

            public c[] b(int n8) {
                return new c[n8];
            }
        };
        int q;

        c(Parcel parcel) {
            super(parcel);
            this.q = parcel.readInt();
        }

        c(Parcelable parcelable, int n8) {
            super(parcelable);
            this.q = n8;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.q);
        }
    }
}

