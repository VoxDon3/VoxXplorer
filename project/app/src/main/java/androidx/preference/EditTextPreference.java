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
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import ax.S.k;
import ax.b2.f;
import ax.b2.j;
import ax.b2.l;

public class EditTextPreference
extends DialogPreference {
    private String X0;

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, f.d, 16842898));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        context = context.obtainStyledAttributes(attributeSet, l.w, n8, n9);
        n8 = l.x;
        if (k.b((TypedArray)context, n8, n8, false)) {
            this.K0(c.b());
        }
        context.recycle();
    }

    @Override
    public boolean O0() {
        return TextUtils.isEmpty((CharSequence)this.X0) || super.O0();
        {
        }
    }

    a Z0() {
        return null;
    }

    public String a1() {
        return this.X0;
    }

    public void b1(String string) {
        boolean bl = this.O0();
        this.X0 = string;
        this.s0(string);
        boolean bl2 = this.O0();
        if (bl2 != bl) {
            this.X(bl2);
        }
        this.W();
    }

    @Override
    protected Object g0(TypedArray typedArray, int n8) {
        return typedArray.getString(n8);
    }

    @Override
    protected void k0(Parcelable object) {
        if (object != null && object.getClass().equals(b.class)) {
            object = (b)((Object)object);
            super.k0(object.getSuperState());
            this.b1(object.q);
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
        object = new b((Parcelable)object);
        object.q = this.a1();
        return object;
    }

    @Override
    protected void m0(Object object) {
        this.b1(this.H((String)object));
    }

    public static interface a {
    }

    private static class b
    extends Preference.b {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>(){

            public b a(Parcel parcel) {
                return new b(parcel);
            }

            public b[] b(int n8) {
                return new b[n8];
            }
        };
        String q;

        b(Parcel parcel) {
            super(parcel);
            this.q = parcel.readString();
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeString(this.q);
        }
    }

    public static final class c
    implements Preference.g<EditTextPreference> {
        private static c a;

        private c() {
        }

        public static c b() {
            if (a == null) {
                a = new c();
            }
            return a;
        }

        public CharSequence c(EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty((CharSequence)editTextPreference.a1())) {
                return editTextPreference.s().getString(j.c);
            }
            return editTextPreference.a1();
        }
    }
}

