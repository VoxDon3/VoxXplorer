package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import ax.S.k;
import ax.b2.C1478f;
import ax.b2.C1484l;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    private CharSequence[] X0;
    private CharSequence[] Y0;
    private Set<String> Z0;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Z0 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1484l.E, i, i2);
        this.X0 = k.q(obtainStyledAttributes, C1484l.H, C1484l.F);
        this.Y0 = k.q(obtainStyledAttributes, C1484l.I, C1484l.G);
        obtainStyledAttributes.recycle();
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
        t0(set);
        W();
    }

    @Override // androidx.preference.Preference
    protected Object g0(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected void k0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.k0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.k0(aVar.getSuperState());
        c1(aVar.q);
    }

    @Override // androidx.preference.Preference
    protected Parcelable l0() {
        Parcelable l0 = super.l0();
        if (T()) {
            return l0;
        }
        a aVar = new a(l0);
        aVar.q = b1();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void m0(Object obj) {
        c1(I((Set) obj));
    }

    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0031a();
        Set<String> q;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a, reason: collision with other inner class name */
        class C0031a implements Parcelable.Creator<a> {
            C0031a() {
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
            int readInt = parcel.readInt();
            this.q = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.q, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.q.size());
            Set<String> set = this.q;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, C1478f.b, R.attr.dialogPreferenceStyle));
    }
}
