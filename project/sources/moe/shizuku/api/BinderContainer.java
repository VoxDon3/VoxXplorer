package moe.shizuku.api;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class BinderContainer implements Parcelable {
    public static final Parcelable.Creator<BinderContainer> CREATOR = new a();
    public IBinder q;

    class a implements Parcelable.Creator<BinderContainer> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BinderContainer createFromParcel(Parcel parcel) {
            return new BinderContainer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BinderContainer[] newArray(int i) {
            return new BinderContainer[i];
        }
    }

    public BinderContainer(IBinder iBinder) {
        this.q = iBinder;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.q);
    }

    protected BinderContainer(Parcel parcel) {
        this.q = parcel.readStrongBinder();
    }
}
