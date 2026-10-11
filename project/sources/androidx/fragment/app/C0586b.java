package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.t;
import androidx.lifecycle.d;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0586b implements Parcelable {
    public static final Parcelable.Creator<C0586b> CREATOR = new a();
    final ArrayList<String> c0;
    final int[] d0;
    final int[] e0;
    final int f0;
    final String g0;
    final int h0;
    final int i0;
    final CharSequence j0;
    final int k0;
    final CharSequence l0;
    final ArrayList<String> m0;
    final ArrayList<String> n0;
    final boolean o0;
    final int[] q;

    /* renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator<C0586b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0586b createFromParcel(Parcel parcel) {
            return new C0586b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0586b[] newArray(int i) {
            return new C0586b[i];
        }
    }

    C0586b(C0585a c0585a) {
        int size = c0585a.c.size();
        this.q = new int[size * 6];
        if (!c0585a.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.c0 = new ArrayList<>(size);
        this.d0 = new int[size];
        this.e0 = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            t.a aVar = c0585a.c.get(i2);
            int i3 = i + 1;
            this.q[i] = aVar.a;
            ArrayList<String> arrayList = this.c0;
            Fragment fragment = aVar.b;
            arrayList.add(fragment != null ? fragment.f : null);
            int[] iArr = this.q;
            iArr[i3] = aVar.c ? 1 : 0;
            iArr[i + 2] = aVar.d;
            iArr[i + 3] = aVar.e;
            int i4 = i + 5;
            iArr[i + 4] = aVar.f;
            i += 6;
            iArr[i4] = aVar.g;
            this.d0[i2] = aVar.h.ordinal();
            this.e0[i2] = aVar.i.ordinal();
        }
        this.f0 = c0585a.h;
        this.g0 = c0585a.k;
        this.h0 = c0585a.v;
        this.i0 = c0585a.l;
        this.j0 = c0585a.m;
        this.k0 = c0585a.n;
        this.l0 = c0585a.o;
        this.m0 = c0585a.p;
        this.n0 = c0585a.q;
        this.o0 = c0585a.r;
    }

    private void a(C0585a c0585a) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.q.length) {
                c0585a.h = this.f0;
                c0585a.k = this.g0;
                c0585a.i = true;
                c0585a.l = this.i0;
                c0585a.m = this.j0;
                c0585a.n = this.k0;
                c0585a.o = this.l0;
                c0585a.p = this.m0;
                c0585a.q = this.n0;
                c0585a.r = this.o0;
                return;
            }
            t.a aVar = new t.a();
            int i3 = i + 1;
            aVar.a = this.q[i];
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0585a + " op #" + i2 + " base fragment #" + this.q[i3]);
            }
            aVar.h = d.b.values()[this.d0[i2]];
            aVar.i = d.b.values()[this.e0[i2]];
            int[] iArr = this.q;
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            aVar.c = z;
            int i5 = iArr[i4];
            aVar.d = i5;
            int i6 = iArr[i + 3];
            aVar.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            aVar.f = i8;
            i += 6;
            int i9 = iArr[i7];
            aVar.g = i9;
            c0585a.d = i5;
            c0585a.e = i6;
            c0585a.f = i8;
            c0585a.g = i9;
            c0585a.f(aVar);
            i2++;
        }
    }

    public C0585a b(FragmentManager fragmentManager) {
        C0585a c0585a = new C0585a(fragmentManager);
        a(c0585a);
        c0585a.v = this.h0;
        for (int i = 0; i < this.c0.size(); i++) {
            String str = this.c0.get(i);
            if (str != null) {
                c0585a.c.get(i).b = fragmentManager.h0(str);
            }
        }
        c0585a.w(1);
        return c0585a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.q);
        parcel.writeStringList(this.c0);
        parcel.writeIntArray(this.d0);
        parcel.writeIntArray(this.e0);
        parcel.writeInt(this.f0);
        parcel.writeString(this.g0);
        parcel.writeInt(this.h0);
        parcel.writeInt(this.i0);
        TextUtils.writeToParcel(this.j0, parcel, 0);
        parcel.writeInt(this.k0);
        TextUtils.writeToParcel(this.l0, parcel, 0);
        parcel.writeStringList(this.m0);
        parcel.writeStringList(this.n0);
        parcel.writeInt(this.o0 ? 1 : 0);
    }

    C0586b(Parcel parcel) {
        this.q = parcel.createIntArray();
        this.c0 = parcel.createStringArrayList();
        this.d0 = parcel.createIntArray();
        this.e0 = parcel.createIntArray();
        this.f0 = parcel.readInt();
        this.g0 = parcel.readString();
        this.h0 = parcel.readInt();
        this.i0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.j0 = (CharSequence) creator.createFromParcel(parcel);
        this.k0 = parcel.readInt();
        this.l0 = (CharSequence) creator.createFromParcel(parcel);
        this.m0 = parcel.createStringArrayList();
        this.n0 = parcel.createStringArrayList();
        this.o0 = parcel.readInt() != 0;
    }
}
