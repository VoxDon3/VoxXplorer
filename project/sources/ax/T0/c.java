package ax.T0;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.G;
import ax.S0.d0;
import ax.q7.C2880g;
import ax.u7.C3218f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements C.a {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public c(String str, byte[] bArr, int i, int i2) {
        f(str, bArr, i2);
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    private static String e(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("track types = ");
        C2880g.f(',').b(sb, list);
        return sb.toString();
    }

    private static void f(String str, byte[] bArr, int i) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i == 23 && bArr.length == 4) {
                    z = true;
                }
                C0968a.a(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                C0968a.a(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i == 78 && bArr.length == 8) {
                    z = true;
                }
                C0968a.a(z);
                break;
            case "auxiliary.tracks.map":
                C0968a.a(i == 0);
                break;
        }
    }

    @Override // ax.P0.C.a
    public /* synthetic */ C0912v a() {
        return B.b(this);
    }

    @Override // ax.P0.C.a
    public /* synthetic */ void b(A.b bVar) {
        B.c(this, bVar);
    }

    @Override // ax.P0.C.a
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public List<Integer> d() {
        C0968a.h(this.a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b = this.b[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(this.b[i + 2]));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.a.equals(cVar.a) && Arrays.equals(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.a.hashCode()) * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        String e;
        int i = this.d;
        if (i == 0) {
            if (this.a.equals("auxiliary.tracks.map")) {
                e = e(d());
            }
            e = d0.B1(this.b);
        } else if (i == 1) {
            e = d0.H(this.b);
        } else if (i == 23) {
            e = String.valueOf(Float.intBitsToFloat(C3218f.h(this.b)));
        } else if (i == 67) {
            e = String.valueOf(C3218f.h(this.b));
        } else if (i != 75) {
            if (i == 78) {
                e = String.valueOf(new G(this.b).T());
            }
            e = d0.B1(this.b);
        } else {
            e = String.valueOf(b.a(this.b[0]));
        }
        return "mdta: key=" + this.a + ", value=" + e;
    }
}
