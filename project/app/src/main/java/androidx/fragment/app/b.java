/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.lifecycle.d;
import java.util.ArrayList;

@SuppressLint(value={"BanParcelableUsage"})
final class b
implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>(){

        public b a(Parcel parcel) {
            return new b(parcel);
        }

        public b[] b(int n8) {
            return new b[n8];
        }
    };
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

    b(Parcel parcel) {
        this.q = parcel.createIntArray();
        this.c0 = parcel.createStringArrayList();
        this.d0 = parcel.createIntArray();
        this.e0 = parcel.createIntArray();
        this.f0 = parcel.readInt();
        this.g0 = parcel.readString();
        this.h0 = parcel.readInt();
        this.i0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.j0 = (CharSequence)creator.createFromParcel(parcel);
        this.k0 = parcel.readInt();
        this.l0 = (CharSequence)creator.createFromParcel(parcel);
        this.m0 = parcel.createStringArrayList();
        this.n0 = parcel.createStringArrayList();
        boolean bl = parcel.readInt() != 0;
        this.o0 = bl;
    }

    b(a a8) {
        int n8 = a8.c.size();
        this.q = new int[n8 * 6];
        if (a8.i) {
            this.c0 = new ArrayList(n8);
            this.d0 = new int[n8];
            this.e0 = new int[n8];
            int n9 = 0;
            int n10 = 0;
            while (true) {
                int n11 = n10;
                if (n9 >= n8) break;
                t.a a9 = a8.c.get(n9);
                this.q[n11] = a9.a;
                ArrayList<String> arrayList = this.c0;
                Object object = a9.b;
                object = object != null ? ((Fragment)object).f : null;
                arrayList.add((String)object);
                object = this.q;
                object[n11 + 1] = a9.c;
                object[n11 + 2] = a9.d;
                object[n11 + 3] = a9.e;
                object[n11 + 4] = a9.f;
                n10 = n11 + 6;
                object[n11 + 5] = a9.g;
                this.d0[n9] = a9.h.ordinal();
                this.e0[n9] = a9.i.ordinal();
                ++n9;
            }
            this.f0 = a8.h;
            this.g0 = a8.k;
            this.h0 = a8.v;
            this.i0 = a8.l;
            this.j0 = a8.m;
            this.k0 = a8.n;
            this.l0 = a8.o;
            this.m0 = a8.p;
            this.n0 = a8.q;
            this.o0 = a8.r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    private void a(a a8) {
        int n8 = 0;
        int n9 = 0;
        while (true) {
            Object object = n8;
            n8 = this.q.length;
            boolean bl = true;
            if (object >= n8) break;
            t.a a9 = new t.a();
            Object object2 = this.q;
            n8 = object + 1;
            a9.a = object2[object];
            if (FragmentManager.J0(2)) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Instantiate ");
                ((StringBuilder)object2).append(a8);
                ((StringBuilder)object2).append(" op #");
                ((StringBuilder)object2).append(n9);
                ((StringBuilder)object2).append(" base fragment #");
                ((StringBuilder)object2).append(this.q[n8]);
                Log.v((String)"FragmentManager", (String)((StringBuilder)object2).toString());
            }
            a9.h = d.b.values()[this.d0[n9]];
            a9.i = d.b.values()[this.e0[n9]];
            object2 = this.q;
            if (object2[n8] == 0) {
                bl = false;
            }
            a9.c = bl;
            Object object3 = object2[object + 2];
            a9.d = (int)object3;
            Object object4 = object2[object + 3];
            a9.e = (int)object4;
            Object object5 = object2[object + 4];
            a9.f = (int)object5;
            n8 = object + 6;
            a9.g = object = (Object)object2[object + 5];
            a8.d = (int)object3;
            a8.e = (int)object4;
            a8.f = (int)object5;
            a8.g = object;
            a8.f(a9);
            ++n9;
        }
        a8.h = this.f0;
        a8.k = this.g0;
        a8.i = true;
        a8.l = this.i0;
        a8.m = this.j0;
        a8.n = this.k0;
        a8.o = this.l0;
        a8.p = this.m0;
        a8.q = this.n0;
        a8.r = this.o0;
    }

    public a b(FragmentManager fragmentManager) {
        a a8 = new a(fragmentManager);
        this.a(a8);
        a8.v = this.h0;
        for (int i8 = 0; i8 < this.c0.size(); ++i8) {
            String string = this.c0.get(i8);
            if (string == null) continue;
            a8.c.get((int)i8).b = fragmentManager.h0(string);
        }
        a8.w(1);
        return a8;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeIntArray(this.q);
        parcel.writeStringList(this.c0);
        parcel.writeIntArray(this.d0);
        parcel.writeIntArray(this.e0);
        parcel.writeInt(this.f0);
        parcel.writeString(this.g0);
        parcel.writeInt(this.h0);
        parcel.writeInt(this.i0);
        TextUtils.writeToParcel((CharSequence)this.j0, (Parcel)parcel, (int)0);
        parcel.writeInt(this.k0);
        TextUtils.writeToParcel((CharSequence)this.l0, (Parcel)parcel, (int)0);
        parcel.writeStringList(this.m0);
        parcel.writeStringList(this.n0);
        parcel.writeInt(this.o0 ? 1 : 0);
    }
}

