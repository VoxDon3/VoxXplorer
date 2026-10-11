/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import ax.S.k;
import ax.b2.f;
import ax.b2.l;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference
extends DialogPreference {
    private CharSequence[] X0;
    private CharSequence[] Y0;
    private Set<String> Z0 = new HashSet<String>();

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, f.b, 0x1010091));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        context = context.obtainStyledAttributes(attributeSet, l.E, n8, n9);
        this.X0 = k.q((TypedArray)context, l.H, l.F);
        this.Y0 = k.q((TypedArray)context, l.I, l.G);
        context.recycle();
    }

    public CharSequence[] Z0() {
        return this.X0;
    }

    public CharSequence[] a1() {
        return this.Y0;
    }

    public Set<String> b1() {
        return this.Z0;
    }

    public void c1(Set<String> set) {
        this.Z0.clear();
        this.Z0.addAll(set);
        this.t0(set);
        this.W();
    }

    @Override
    protected Object g0(TypedArray object, int n8) {
        CharSequence[] charSequenceArray = object.getTextArray(n8);
        object = new HashSet();
        int n9 = charSequenceArray.length;
        for (n8 = 0; n8 < n9; ++n8) {
            object.add(charSequenceArray[n8].toString());
        }
        return object;
    }

    @Override
    protected void k0(Parcelable object) {
        if (object != null && object.getClass().equals(a.class)) {
            object = (a)((Object)object);
            super.k0(object.getSuperState());
            this.c1(object.q);
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
        object.q = this.b1();
        return object;
    }

    @Override
    protected void m0(Object object) {
        this.c1(this.I((Set)object));
    }

    private static class a
    extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>(){

            public a a(Parcel parcel) {
                return new a(parcel);
            }

            public a[] b(int n8) {
                return new a[n8];
            }
        };
        Set<String> q;

        a(Parcel parcel) {
            super(parcel);
            int n8 = parcel.readInt();
            this.q = new HashSet<String>();
            String[] stringArray = new String[n8];
            parcel.readStringArray(stringArray);
            Collections.addAll(this.q, stringArray);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.q.size());
            Set<String> set = this.q;
            parcel.writeStringArray(set.toArray(new String[set.size()]));
        }
    }
}

