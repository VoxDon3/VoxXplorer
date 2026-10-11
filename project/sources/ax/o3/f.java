package ax.o3;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ax.X2.J;
import ax.X2.Q;

/* loaded from: classes.dex */
public class f implements Parcelable {
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
    private static int o0 = f.class.getName().length();
    public static final Parcelable.Creator<f> CREATOR = new a();

    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
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

    public int a() {
        return ((o0 + 4) * 2) + 48 + ((this.c0.length() + this.j0.length() + 8) * 2);
    }

    public boolean b(Context context) {
        if (J.x(context)) {
            return false;
        }
        return (Q.t() && this.e0) || this.f0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
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

    public f(String str, String str2, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.c0 = str;
        this.q = z;
        this.d0 = z2;
        this.e0 = z3;
        this.j0 = str2;
        this.k0 = i;
        this.l0 = j;
        this.f0 = z4;
        this.g0 = z5;
        this.i0 = z6;
    }

    private f(Parcel parcel) {
        this.c0 = parcel.readString();
        this.q = parcel.readInt() != 0;
        this.d0 = parcel.readInt() != 0;
        this.e0 = parcel.readInt() != 0;
        this.j0 = parcel.readString();
        this.k0 = parcel.readInt();
        this.l0 = parcel.readLong();
        this.m0 = parcel.readInt() != 0;
        this.f0 = parcel.readInt() != 0;
        this.g0 = parcel.readInt() != 0;
        this.h0 = parcel.readInt() != 0;
        this.i0 = parcel.readInt() != 0;
    }
}
