/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import java.util.List;

@SuppressLint(value={"BanParcelableUsage"})
class c
implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>(){

        public c a(Parcel parcel) {
            return new c(parcel);
        }

        public c[] b(int n8) {
            return new c[n8];
        }
    };
    final List<b> c0;
    final List<String> q;

    c(Parcel parcel) {
        this.q = parcel.createStringArrayList();
        this.c0 = parcel.createTypedArrayList(b.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeStringList(this.q);
        parcel.writeTypedList(this.c0);
    }
}

