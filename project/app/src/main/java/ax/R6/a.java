/*
 * Decompiled with CFR 0.152.
 */
package ax.R6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.B.k;

public class a
extends ax.k0.a {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.ClassLoaderCreator<a>(){

        public a a(Parcel parcel) {
            return new a(parcel, null);
        }

        public a b(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }

        public a[] c(int n8) {
            return new a[n8];
        }
    };
    public final k<String, Bundle> d0;

    private a(Parcel parcel, ClassLoader objectArray) {
        super(parcel, (ClassLoader)objectArray);
        int n8 = parcel.readInt();
        String[] stringArray = new String[n8];
        parcel.readStringArray(stringArray);
        objectArray = new Bundle[n8];
        parcel.readTypedArray(objectArray, Bundle.CREATOR);
        this.d0 = new k(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            this.d0.put(stringArray[i8], (Bundle)objectArray[i8]);
        }
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.d0 = new k();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExtendableSavedState{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" states=");
        stringBuilder.append(this.d0);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int n8) {
        super.writeToParcel(parcel, n8);
        int n9 = this.d0.size();
        parcel.writeInt(n9);
        String[] stringArray = new String[n9];
        Bundle[] bundleArray = new Bundle[n9];
        for (n8 = 0; n8 < n9; ++n8) {
            stringArray[n8] = this.d0.f(n8);
            bundleArray[n8] = this.d0.k(n8);
        }
        parcel.writeStringArray(stringArray);
        parcel.writeTypedArray((Parcelable[])bundleArray, 0);
    }
}

