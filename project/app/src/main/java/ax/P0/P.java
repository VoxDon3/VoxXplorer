/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.os.Bundle;
import ax.P0.D;
import ax.P0.O;
import ax.P0.v;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.g;
import ax.S0.u;
import ax.r7.z;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class P {
    private static final String f = d0.G0(0);
    private static final String g = d0.G0(1);
    public final int a;
    public final String b;
    public final int c;
    private final v[] d;
    private int e;

    public P(String string, v ... vArray) {
        int n8;
        boolean bl = vArray.length > 0;
        ax.S0.a.a(bl);
        this.b = string;
        this.d = vArray;
        this.a = vArray.length;
        int n9 = n8 = D.k(vArray[0].o);
        if (n8 == -1) {
            n9 = D.k(vArray[0].n);
        }
        this.c = n9;
        this.h();
    }

    public P(v ... vArray) {
        this("", vArray);
    }

    public static P a(Bundle bundle) {
        AbstractCollection abstractCollection = bundle.getParcelableArrayList(f);
        abstractCollection = abstractCollection == null ? z.z() : ax.S0.g.b(new O(), (List<Bundle>)((Object)abstractCollection));
        return new P(bundle.getString(g, ""), abstractCollection.toArray(new v[0]));
    }

    private static void d(String string, String string2, String string3, int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Different ");
        stringBuilder.append(string);
        stringBuilder.append(" combined in one TrackGroup: '");
        stringBuilder.append(string2);
        stringBuilder.append("' (track 0) and '");
        stringBuilder.append(string3);
        stringBuilder.append("' (track ");
        stringBuilder.append(n8);
        stringBuilder.append(")");
        u.d("TrackGroup", "", new IllegalStateException(stringBuilder.toString()));
    }

    private static String e(String string) {
        if (string != null && !string.equals("und")) {
            return string;
        }
        return "";
    }

    private static int f(int n8) {
        return n8 | 0x4000;
    }

    private void h() {
        v[] vArray;
        String string = P.e(this.d[0].d);
        int n8 = P.f(this.d[0].f);
        for (int i8 = 1; i8 < (vArray = this.d).length; ++i8) {
            if (!string.equals(P.e(vArray[i8].d))) {
                vArray = this.d;
                P.d("languages", vArray[0].d, vArray[i8].d, i8);
                return;
            }
            if (n8 == P.f(this.d[i8].f)) continue;
            P.d("role flags", Integer.toBinaryString(this.d[0].f), Integer.toBinaryString(this.d[i8].f), i8);
            return;
        }
    }

    public v b(int n8) {
        return this.d[n8];
    }

    public int c(v v8) {
        v[] vArray;
        for (int i8 = 0; i8 < (vArray = this.d).length; ++i8) {
            if (v8 != vArray[i8]) continue;
            return i8;
        }
        return -1;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && P.class == object.getClass()) {
            object = (P)object;
            if (this.b.equals(((P)object).b) && Arrays.equals(this.d, ((P)object).d)) {
                return true;
            }
        }
        return false;
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>(this.d.length);
        v[] vArray = this.d;
        int n8 = vArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add(vArray[i8].k());
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public int hashCode() {
        if (this.e == 0) {
            this.e = (527 + this.b.hashCode()) * 31 + Arrays.hashCode(this.d);
        }
        return this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(": ");
        stringBuilder.append(Arrays.toString(this.d));
        return stringBuilder.toString();
    }
}

