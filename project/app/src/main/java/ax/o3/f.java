/*
 * Decompiled with CFR 0.152.
 */
package ax.o3;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ax.X2.J;
import ax.X2.Q;

public class f
implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR;
    private static int o0;
    public String c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public String j0;
    public int k0;
    public long l0;
    public boolean m0;
    public boolean n0;
    public boolean q;

    static {
        o0 = f.class.getName().length();
        CREATOR = new Parcelable.Creator<f>(){

            public f a(Parcel parcel) {
                return new f(parcel);
            }

            public f[] b(int n8) {
                return new f[n8];
            }
        };
    }

    private f(Parcel parcel) {
        this.c0 = parcel.readString();
        int n8 = parcel.readInt();
        boolean bl = false;
        boolean bl2 = n8 != 0;
        this.q = bl2;
        bl2 = parcel.readInt() != 0;
        this.d0 = bl2;
        bl2 = parcel.readInt() != 0;
        this.e0 = bl2;
        this.j0 = parcel.readString();
        this.k0 = parcel.readInt();
        this.l0 = parcel.readLong();
        bl2 = parcel.readInt() != 0;
        this.m0 = bl2;
        bl2 = parcel.readInt() != 0;
        this.f0 = bl2;
        bl2 = parcel.readInt() != 0;
        this.g0 = bl2;
        bl2 = parcel.readInt() != 0;
        this.h0 = bl2;
        bl2 = bl;
        if (parcel.readInt() != 0) {
            bl2 = true;
        }
        this.i0 = bl2;
    }

    public f(String string, String string2, int n8, long l8, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        this.c0 = string;
        this.q = bl;
        this.d0 = bl2;
        this.e0 = bl3;
        this.j0 = string2;
        this.k0 = n8;
        this.l0 = l8;
        this.f0 = bl4;
        this.g0 = bl5;
        this.i0 = bl6;
    }

    public int a() {
        return (o0 + 4) * 2 + 48 + (this.c0.length() + this.j0.length() + 8) * 2;
    }

    public boolean b(Context context) {
        if (J.x(context)) {
            return false;
        }
        return Q.t() && this.e0 || this.f0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.c0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.d0 ? 1 : 0);
        parcel.writeInt(this.e0 ? 1 : 0);
        parcel.writeString(this.j0);
        parcel.writeInt(this.k0);
        parcel.writeLong(this.l0);
        parcel.writeInt(this.m0 ? 1 : 0);
        parcel.writeInt(this.f0 ? 1 : 0);
        parcel.writeInt(this.g0 ? 1 : 0);
        parcel.writeInt(this.h0 ? 1 : 0);
        parcel.writeInt(this.i0 ? 1 : 0);
    }
}

