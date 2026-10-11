package ax.P0;

import android.os.Bundle;
import android.os.Parcelable;
import ax.S0.C0968a;
import ax.S0.C0974g;
import ax.S0.C0987u;
import ax.S0.d0;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2991z;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class P {
    private static final String f = d0.G0(0);
    private static final String g = d0.G0(1);
    public final int a;
    public final String b;
    public final int c;
    private final C0912v[] d;
    private int e;

    public P(C0912v... c0912vArr) {
        this(HttpUrl.FRAGMENT_ENCODE_SET, c0912vArr);
    }

    public static P a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        return new P(bundle.getString(g, HttpUrl.FRAGMENT_ENCODE_SET), (C0912v[]) (parcelableArrayList == null ? AbstractC2991z.z() : C0974g.b(new InterfaceC2879f() { // from class: ax.P0.O
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return C0912v.e((Bundle) obj);
            }
        }, parcelableArrayList)).toArray(new C0912v[0]));
    }

    private static void d(String str, String str2, String str3, int i) {
        C0987u.d("TrackGroup", HttpUrl.FRAGMENT_ENCODE_SET, new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    private static String e(String str) {
        return (str == null || str.equals("und")) ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    private static int f(int i) {
        return i | Http2.INITIAL_MAX_FRAME_SIZE;
    }

    private void h() {
        String e = e(this.d[0].d);
        int f2 = f(this.d[0].f);
        int i = 1;
        while (true) {
            C0912v[] c0912vArr = this.d;
            if (i >= c0912vArr.length) {
                return;
            }
            if (!e.equals(e(c0912vArr[i].d))) {
                C0912v[] c0912vArr2 = this.d;
                d("languages", c0912vArr2[0].d, c0912vArr2[i].d, i);
                return;
            } else {
                if (f2 != f(this.d[i].f)) {
                    d("role flags", Integer.toBinaryString(this.d[0].f), Integer.toBinaryString(this.d[i].f), i);
                    return;
                }
                i++;
            }
        }
    }

    public C0912v b(int i) {
        return this.d[i];
    }

    public int c(C0912v c0912v) {
        int i = 0;
        while (true) {
            C0912v[] c0912vArr = this.d;
            if (i >= c0912vArr.length) {
                return -1;
            }
            if (c0912v == c0912vArr[i]) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P.class == obj.getClass()) {
            P p = (P) obj;
            if (this.b.equals(p.b) && Arrays.equals(this.d, p.d)) {
                return true;
            }
        }
        return false;
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.d.length);
        for (C0912v c0912v : this.d) {
            arrayList.add(c0912v.k());
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public int hashCode() {
        if (this.e == 0) {
            this.e = ((527 + this.b.hashCode()) * 31) + Arrays.hashCode(this.d);
        }
        return this.e;
    }

    public String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }

    public P(String str, C0912v... c0912vArr) {
        C0968a.a(c0912vArr.length > 0);
        this.b = str;
        this.d = c0912vArr;
        this.a = c0912vArr.length;
        int k = D.k(c0912vArr[0].o);
        this.c = k == -1 ? D.k(c0912vArr[0].n) : k;
        h();
    }
}
