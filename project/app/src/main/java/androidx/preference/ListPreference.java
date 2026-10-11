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
import android.util.Log;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import ax.S.k;
import ax.b2.f;
import ax.b2.j;
import ax.b2.l;

public class ListPreference
extends DialogPreference {
    private CharSequence[] X0;
    private CharSequence[] Y0;
    private String Z0;
    private String a1;
    private boolean b1;

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, f.b, 0x1010091));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, l.y, n8, n9);
        this.X0 = k.q(typedArray, l.B, l.z);
        this.Y0 = k.q(typedArray, l.C, l.A);
        int n10 = l.D;
        if (k.b(typedArray, n10, n10, false)) {
            this.K0(b.b());
        }
        typedArray.recycle();
        context = context.obtainStyledAttributes(attributeSet, l.J, n8, n9);
        this.a1 = k.o((TypedArray)context, l.r0, l.R);
        context.recycle();
    }

    private int e1() {
        return this.Z0(this.Z0);
    }

    @Override
    public void J0(CharSequence charSequence) {
        super.J0(charSequence);
        if (charSequence == null) {
            this.a1 = null;
            return;
        }
        this.a1 = charSequence.toString();
    }

    @Override
    public CharSequence M() {
        CharSequence charSequence;
        block6: {
            CharSequence charSequence2;
            block5: {
                if (this.N() != null) {
                    return this.N().a(this);
                }
                CharSequence charSequence3 = this.b1();
                charSequence2 = super.M();
                String string = this.a1;
                if (string == null) break block5;
                charSequence = charSequence3;
                if (charSequence3 == null) {
                    charSequence = "";
                }
                if (!TextUtils.equals((CharSequence)(charSequence = String.format(string, charSequence)), (CharSequence)charSequence2)) break block6;
            }
            return charSequence2;
        }
        Log.w((String)"ListPreference", (String)"Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return charSequence;
    }

    public int Z0(String string) {
        CharSequence[] charSequenceArray;
        if (string != null && (charSequenceArray = this.Y0) != null) {
            for (int i8 = charSequenceArray.length - 1; i8 >= 0; --i8) {
                if (!TextUtils.equals((CharSequence)this.Y0[i8].toString(), (CharSequence)string)) continue;
                return i8;
            }
        }
        return -1;
    }

    public CharSequence[] a1() {
        return this.X0;
    }

    public CharSequence b1() {
        CharSequence[] charSequenceArray;
        int n8 = this.e1();
        if (n8 >= 0 && (charSequenceArray = this.X0) != null) {
            return charSequenceArray[n8];
        }
        return null;
    }

    public CharSequence[] c1() {
        return this.Y0;
    }

    public String d1() {
        return this.Z0;
    }

    public void f1(int n8) {
        this.g1(this.s().getResources().getTextArray(n8));
    }

    @Override
    protected Object g0(TypedArray typedArray, int n8) {
        return typedArray.getString(n8);
    }

    public void g1(CharSequence[] charSequenceArray) {
        this.X0 = charSequenceArray;
    }

    public void h1(int n8) {
        this.i1(this.s().getResources().getTextArray(n8));
    }

    public void i1(CharSequence[] charSequenceArray) {
        this.Y0 = charSequenceArray;
    }

    public void j1(String string) {
        boolean bl = TextUtils.equals((CharSequence)this.Z0, (CharSequence)string);
        if (!bl || !this.b1) {
            this.Z0 = string;
            this.b1 = true;
            this.s0(string);
            if (!bl) {
                this.W();
            }
        }
    }

    @Override
    protected void k0(Parcelable object) {
        if (object != null && object.getClass().equals(a.class)) {
            object = (a)((Object)object);
            super.k0(object.getSuperState());
            this.j1(object.q);
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
        object.q = this.d1();
        return object;
    }

    @Override
    protected void m0(Object object) {
        this.j1(this.H((String)object));
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
        String q;

        a(Parcel parcel) {
            super(parcel);
            this.q = parcel.readString();
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeString(this.q);
        }
    }

    public static final class b
    implements Preference.g<ListPreference> {
        private static b a;

        private b() {
        }

        public static b b() {
            if (a == null) {
                a = new b();
            }
            return a;
        }

        public CharSequence c(ListPreference listPreference) {
            if (TextUtils.isEmpty((CharSequence)listPreference.b1())) {
                return listPreference.s().getString(j.c);
            }
            return listPreference.b1();
        }
    }
}

