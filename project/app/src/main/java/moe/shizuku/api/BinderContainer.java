/*
 * Decompiled with CFR 0.152.
 */
package moe.shizuku.api;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class BinderContainer
implements Parcelable {
    public static final Parcelable.Creator<BinderContainer> CREATOR = new Parcelable.Creator<BinderContainer>(){

        public BinderContainer a(Parcel parcel) {
            return new BinderContainer(parcel);
        }

        public BinderContainer[] b(int n8) {
            return new BinderContainer[n8];
        }
    };
    public IBinder q;

    public BinderContainer(IBinder iBinder) {
        this.q = iBinder;
    }

    protected BinderContainer(Parcel parcel) {
        this.q = parcel.readStrongBinder();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeStrongBinder(this.q);
    }
}

