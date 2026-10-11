package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import ax.S.k;
import ax.b2.C1478f;
import ax.b2.C1482j;
import ax.b2.C1484l;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private CharSequence[] X0;
    private CharSequence[] Y0;
    private String Z0;
    private String a1;
    private boolean b1;

    public static final class b implements Preference.g<ListPreference> {
        private static b a;

        private b() {
        }

        public static b b() {
            if (a == null) {
                a = new b();
            }
            return a;
        }

        @Override // androidx.preference.Preference.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.b1()) ? listPreference.s().getString(C1482j.c) : listPreference.b1();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1484l.y, i, i2);
        this.X0 = k.q(obtainStyledAttributes, C1484l.B, C1484l.z);
        this.Y0 = k.q(obtainStyledAttributes, C1484l.C, C1484l.A);
        int i3 = C1484l.D;
        if (k.b(obtainStyledAttributes, i3, i3, false)) {
            K0(b.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C1484l.J, i, i2);
        this.a1 = k.o(obtainStyledAttributes2, C1484l.r0, C1484l.R);
        obtainStyledAttributes2.recycle();
    }

    private int e1() {
        return Z0(this.Z0);
    }

    @Override // androidx.preference.Preference
    public void J0(CharSequence charSequence) {
        super.J0(charSequence);
        if (charSequence == null) {
            this.a1 = null;
        } else {
            this.a1 = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    public CharSequence M() {
        if (N() != null) {
            return N().a(this);
        }
        CharSequence b1 = b1();
        CharSequence M = super.M();
        String str = this.a1;
        if (str != null) {
            if (b1 == null) {
                b1 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String format = String.format(str, b1);
            if (!TextUtils.equals(format, M)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return M;
    }

    public int Z0(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.Y0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.Y0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] a1() {
        return this.X0;
    }

    public CharSequence b1() {
        CharSequence[] charSequenceArr;
        int e1 = e1();
        if (e1 < 0 || (charSequenceArr = this.X0) == null) {
            return null;
        }
        return charSequenceArr[e1];
    }

    public CharSequence[] c1() {
        return this.Y0;
    }

    public String d1() {
        return this.Z0;
    }

    public void f1(int i) {
        g1(s().getResources().getTextArray(i));
    }

    @Override // androidx.preference.Preference
    protected Object g0(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public void g1(CharSequence[] charSequenceArr) {
        this.X0 = charSequenceArr;
    }

    public void h1(int i) {
        i1(s().getResources().getTextArray(i));
    }

    public void i1(CharSequence[] charSequenceArr) {
        this.Y0 = charSequenceArr;
    }

    public void j1(String str) {
        boolean equals = TextUtils.equals(this.Z0, str);
        if (equals && this.b1) {
            return;
        }
        this.Z0 = str;
        this.b1 = true;
        s0(str);
        if (equals) {
            return;
        }
        W();
    }

    @Override // androidx.preference.Preference
    protected void k0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.k0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.k0(aVar.getSuperState());
        j1(aVar.q);
    }

    @Override // androidx.preference.Preference
    protected Parcelable l0() {
        Parcelable l0 = super.l0();
        if (T()) {
            return l0;
        }
        a aVar = new a(l0);
        aVar.q = d1();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void m0(Object obj) {
        j1(H((String) obj));
    }

    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0030a();
        String q;

        /* renamed from: androidx.preference.ListPreference$a$a, reason: collision with other inner class name */
        class C0030a implements Parcelable.Creator<a> {
            C0030a() {
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
            this.q = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.q);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, C1478f.b, R.attr.dialogPreferenceStyle));
    }
}
