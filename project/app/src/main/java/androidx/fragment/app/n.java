/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import java.util.ArrayList;

@SuppressLint(value={"BanParcelableUsage"})
final class n
implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new Parcelable.Creator<n>(){

        public n a(Parcel parcel) {
            return new n(parcel);
        }

        public n[] b(int n8) {
            return new n[n8];
        }
    };
    ArrayList<String> c0;
    b[] d0;
    int e0;
    String f0 = null;
    ArrayList<String> g0 = new ArrayList();
    ArrayList<c> h0 = new ArrayList();
    ArrayList<FragmentManager.k> i0;
    ArrayList<String> q;

    public n() {
    }

    public n(Parcel parcel) {
        this.q = parcel.createStringArrayList();
        this.c0 = parcel.createStringArrayList();
        this.d0 = (b[])parcel.createTypedArray(b.CREATOR);
        this.e0 = parcel.readInt();
        this.f0 = parcel.readString();
        this.g0 = parcel.createStringArrayList();
        this.h0 = parcel.createTypedArrayList(c.CREATOR);
        this.i0 = parcel.createTypedArrayList(FragmentManager.k.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeStringList(this.q);
        parcel.writeStringList(this.c0);
        parcel.writeTypedArray((Parcelable[])this.d0, n8);
        parcel.writeInt(this.e0);
        parcel.writeString(this.f0);
        parcel.writeStringList(this.g0);
        parcel.writeTypedList(this.h0);
        parcel.writeTypedList(this.i0);
    }
}

