/*
 * Decompiled with CFR 0.152.
 */
package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.b;

@SuppressLint(value={"BanParcelableUsage"})
public class ParcelImpl
implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator<ParcelImpl>(){

        public ParcelImpl a(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] b(int n8) {
            return new ParcelImpl[n8];
        }
    };
    private final ax.x2.b q;

    protected ParcelImpl(Parcel parcel) {
        this.q = new b(parcel).u();
    }

    public ParcelImpl(ax.x2.b b8) {
        this.q = b8;
    }

    public <T extends ax.x2.b> T a() {
        return (T)this.q;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        new b(parcel).L(this.q);
    }
}

