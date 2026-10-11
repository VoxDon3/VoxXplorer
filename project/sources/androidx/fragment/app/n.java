package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();
    ArrayList<String> c0;
    C0586b[] d0;
    int e0;
    String f0;
    ArrayList<String> g0;
    ArrayList<c> h0;
    ArrayList<FragmentManager.k> i0;
    ArrayList<String> q;

    class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i) {
            return new n[i];
        }
    }

    public n() {
        this.f0 = null;
        this.g0 = new ArrayList<>();
        this.h0 = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.q);
        parcel.writeStringList(this.c0);
        parcel.writeTypedArray(this.d0, i);
        parcel.writeInt(this.e0);
        parcel.writeString(this.f0);
        parcel.writeStringList(this.g0);
        parcel.writeTypedList(this.h0);
        parcel.writeTypedList(this.i0);
    }

    public n(Parcel parcel) {
        this.f0 = null;
        this.g0 = new ArrayList<>();
        this.h0 = new ArrayList<>();
        this.q = parcel.createStringArrayList();
        this.c0 = parcel.createStringArrayList();
        this.d0 = (C0586b[]) parcel.createTypedArray(C0586b.CREATOR);
        this.e0 = parcel.readInt();
        this.f0 = parcel.readString();
        this.g0 = parcel.createStringArrayList();
        this.h0 = parcel.createTypedArrayList(c.CREATOR);
        this.i0 = parcel.createTypedArrayList(FragmentManager.k.CREATOR);
    }
}
