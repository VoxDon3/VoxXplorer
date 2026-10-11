package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.d;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();
    final String c0;
    final boolean d0;
    final int e0;
    final int f0;
    final String g0;
    final boolean h0;
    final boolean i0;
    final boolean j0;
    final Bundle k0;
    final boolean l0;
    final int m0;
    Bundle n0;
    final String q;

    class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i) {
            return new p[i];
        }
    }

    p(Fragment fragment) {
        this.q = fragment.getClass().getName();
        this.c0 = fragment.f;
        this.d0 = fragment.o;
        this.e0 = fragment.x;
        this.f0 = fragment.y;
        this.g0 = fragment.z;
        this.h0 = fragment.C;
        this.i0 = fragment.m;
        this.j0 = fragment.B;
        this.k0 = fragment.g;
        this.l0 = fragment.A;
        this.m0 = fragment.S.ordinal();
    }

    Fragment a(i iVar, ClassLoader classLoader) {
        Fragment a2 = iVar.a(classLoader, this.q);
        Bundle bundle = this.k0;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.v2(this.k0);
        a2.f = this.c0;
        a2.o = this.d0;
        a2.q = true;
        a2.x = this.e0;
        a2.y = this.f0;
        a2.z = this.g0;
        a2.C = this.h0;
        a2.m = this.i0;
        a2.B = this.j0;
        a2.A = this.l0;
        a2.S = d.b.values()[this.m0];
        Bundle bundle2 = this.n0;
        if (bundle2 != null) {
            a2.b = bundle2;
            return a2;
        }
        a2.b = new Bundle();
        return a2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.q);
        sb.append(" (");
        sb.append(this.c0);
        sb.append(")}:");
        if (this.d0) {
            sb.append(" fromLayout");
        }
        if (this.f0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f0));
        }
        String str = this.g0;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.g0);
        }
        if (this.h0) {
            sb.append(" retainInstance");
        }
        if (this.i0) {
            sb.append(" removing");
        }
        if (this.j0) {
            sb.append(" detached");
        }
        if (this.l0) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.q);
        parcel.writeString(this.c0);
        parcel.writeInt(this.d0 ? 1 : 0);
        parcel.writeInt(this.e0);
        parcel.writeInt(this.f0);
        parcel.writeString(this.g0);
        parcel.writeInt(this.h0 ? 1 : 0);
        parcel.writeInt(this.i0 ? 1 : 0);
        parcel.writeInt(this.j0 ? 1 : 0);
        parcel.writeBundle(this.k0);
        parcel.writeInt(this.l0 ? 1 : 0);
        parcel.writeBundle(this.n0);
        parcel.writeInt(this.m0);
    }

    p(Parcel parcel) {
        this.q = parcel.readString();
        this.c0 = parcel.readString();
        this.d0 = parcel.readInt() != 0;
        this.e0 = parcel.readInt();
        this.f0 = parcel.readInt();
        this.g0 = parcel.readString();
        this.h0 = parcel.readInt() != 0;
        this.i0 = parcel.readInt() != 0;
        this.j0 = parcel.readInt() != 0;
        this.k0 = parcel.readBundle();
        this.l0 = parcel.readInt() != 0;
        this.n0 = parcel.readBundle();
        this.m0 = parcel.readInt();
    }
}
