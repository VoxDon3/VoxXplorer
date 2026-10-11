/*
 * Decompiled with CFR 0.152.
 */
package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint(value={"BanParcelableUsage"})
public class ParcelableVolumeInfo
implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>(){

        public ParcelableVolumeInfo a(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public ParcelableVolumeInfo[] b(int n8) {
            return new ParcelableVolumeInfo[n8];
        }
    };
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int q;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.q = parcel.readInt();
        this.d0 = parcel.readInt();
        this.e0 = parcel.readInt();
        this.f0 = parcel.readInt();
        this.c0 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.q);
        parcel.writeInt(this.d0);
        parcel.writeInt(this.e0);
        parcel.writeInt(this.f0);
        parcel.writeInt(this.c0);
    }
}

