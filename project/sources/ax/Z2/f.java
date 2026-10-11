package ax.Z2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.c3.K;

/* loaded from: classes.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();
    public int c0;
    public Bundle d0;
    public boolean e0;
    public ax.Q2.f q;

    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public ax.Q2.f a() {
        return this.q;
    }

    public int b() {
        return this.c0;
    }

    public boolean c() {
        return this.q != null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.q);
        parcel.writeInt(this.c0);
        parcel.writeParcelable(this.d0, i);
        parcel.writeInt(this.e0 ? 1 : 0);
    }

    public f(K k, boolean z) {
        this.q = k.d();
        this.c0 = k.b();
        this.e0 = z;
    }

    private f(Parcel parcel) {
        this.q = (ax.Q2.f) parcel.readSerializable();
        this.c0 = parcel.readInt();
        this.d0 = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
        this.e0 = parcel.readInt() == 1;
    }

    public f(K k, boolean z, Bundle bundle) {
        this(k, z);
        this.d0 = bundle;
    }
}
