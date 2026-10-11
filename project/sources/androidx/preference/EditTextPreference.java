package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import ax.S.k;
import ax.b2.C1478f;
import ax.b2.C1482j;
import ax.b2.C1484l;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    private String X0;

    public interface a {
    }

    public static final class c implements Preference.g<EditTextPreference> {
        private static c a;

        private c() {
        }

        public static c b() {
            if (a == null) {
                a = new c();
            }
            return a;
        }

        @Override // androidx.preference.Preference.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.a1()) ? editTextPreference.s().getString(C1482j.c) : editTextPreference.a1();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1484l.w, i, i2);
        int i3 = C1484l.x;
        if (k.b(obtainStyledAttributes, i3, i3, false)) {
            K0(c.b());
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean O0() {
        return TextUtils.isEmpty(this.X0) || super.O0();
    }

    a Z0() {
        return null;
    }

    public String a1() {
        return this.X0;
    }

    public void b1(String str) {
        boolean O0 = O0();
        this.X0 = str;
        s0(str);
        boolean O02 = O0();
        if (O02 != O0) {
            X(O02);
        }
        W();
    }

    @Override // androidx.preference.Preference
    protected Object g0(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected void k0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(b.class)) {
            super.k0(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.k0(bVar.getSuperState());
        b1(bVar.q);
    }

    @Override // androidx.preference.Preference
    protected Parcelable l0() {
        Parcelable l0 = super.l0();
        if (T()) {
            return l0;
        }
        b bVar = new b(l0);
        bVar.q = a1();
        return bVar;
    }

    @Override // androidx.preference.Preference
    protected void m0(Object obj) {
        b1(H((String) obj));
    }

    private static class b extends Preference.b {
        public static final Parcelable.Creator<b> CREATOR = new a();
        String q;

        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        b(Parcel parcel) {
            super(parcel);
            this.q = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.q);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, C1478f.d, R.attr.editTextPreferenceStyle));
    }
}
