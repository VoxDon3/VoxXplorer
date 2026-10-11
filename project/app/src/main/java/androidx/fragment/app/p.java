/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.d;

@SuppressLint(value={"BanParcelableUsage"})
final class p
implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new Parcelable.Creator<p>(){

        public p a(Parcel parcel) {
            return new p(parcel);
        }

        public p[] b(int n8) {
            return new p[n8];
        }
    };
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

    p(Parcel parcel) {
        this.q = parcel.readString();
        this.c0 = parcel.readString();
        int n8 = parcel.readInt();
        boolean bl = false;
        boolean bl2 = n8 != 0;
        this.d0 = bl2;
        this.e0 = parcel.readInt();
        this.f0 = parcel.readInt();
        this.g0 = parcel.readString();
        bl2 = parcel.readInt() != 0;
        this.h0 = bl2;
        bl2 = parcel.readInt() != 0;
        this.i0 = bl2;
        bl2 = parcel.readInt() != 0;
        this.j0 = bl2;
        this.k0 = parcel.readBundle();
        bl2 = bl;
        if (parcel.readInt() != 0) {
            bl2 = true;
        }
        this.l0 = bl2;
        this.n0 = parcel.readBundle();
        this.m0 = parcel.readInt();
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

    Fragment a(i object, ClassLoader classLoader) {
        object = ((i)object).a(classLoader, this.q);
        Bundle bundle = this.k0;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        ((Fragment)object).v2(this.k0);
        ((Fragment)object).f = this.c0;
        ((Fragment)object).o = this.d0;
        ((Fragment)object).q = true;
        ((Fragment)object).x = this.e0;
        ((Fragment)object).y = this.f0;
        ((Fragment)object).z = this.g0;
        ((Fragment)object).C = this.h0;
        ((Fragment)object).m = this.i0;
        ((Fragment)object).B = this.j0;
        ((Fragment)object).A = this.l0;
        ((Fragment)object).S = d.b.values()[this.m0];
        classLoader = this.n0;
        if (classLoader != null) {
            ((Fragment)object).b = classLoader;
            return object;
        }
        ((Fragment)object).b = new Bundle();
        return object;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentState{");
        stringBuilder.append(this.q);
        stringBuilder.append(" (");
        stringBuilder.append(this.c0);
        stringBuilder.append(")}:");
        if (this.d0) {
            stringBuilder.append(" fromLayout");
        }
        if (this.f0 != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.f0));
        }
        if ((string = this.g0) != null && !string.isEmpty()) {
            stringBuilder.append(" tag=");
            stringBuilder.append(this.g0);
        }
        if (this.h0) {
            stringBuilder.append(" retainInstance");
        }
        if (this.i0) {
            stringBuilder.append(" removing");
        }
        if (this.j0) {
            stringBuilder.append(" detached");
        }
        if (this.l0) {
            stringBuilder.append(" hidden");
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
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
}

