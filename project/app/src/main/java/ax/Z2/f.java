/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.c3.K;
import java.io.Serializable;

public class f
implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>(){

        public f a(Parcel parcel) {
            return new f(parcel);
        }

        public f[] b(int n8) {
            return new f[n8];
        }
    };
    public int c0;
    public Bundle d0;
    public boolean e0;
    public ax.Q2.f q;

    private f(Parcel parcel) {
        this.q = (ax.Q2.f)((Object)parcel.readSerializable());
        this.c0 = parcel.readInt();
        this.d0 = (Bundle)parcel.readParcelable(Bundle.class.getClassLoader());
        int n8 = parcel.readInt();
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        this.e0 = bl;
    }

    public f(K k8, boolean bl) {
        this.q = k8.d();
        this.c0 = k8.b();
        this.e0 = bl;
    }

    public f(K k8, boolean bl, Bundle bundle) {
        this(k8, bl);
        this.d0 = bundle;
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

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeSerializable((Serializable)((Object)this.q));
        parcel.writeInt(this.c0);
        parcel.writeParcelable((Parcelable)this.d0, n8);
        parcel.writeInt(this.e0 ? 1 : 0);
    }
}

