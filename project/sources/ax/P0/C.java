package ax.P0;

import ax.P0.A;
import ax.S0.d0;
import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class C {
    private final a[] a;
    public final long b;

    public interface a {
        C0912v a();

        void b(A.b bVar);

        byte[] c();
    }

    public C(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public C a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new C(this.b, (a[]) d0.f1(this.a, aVarArr));
    }

    public C b(C c) {
        return c == null ? this : a(c.a);
    }

    public C c(long j) {
        return this.b == j ? this : new C(j, this.a);
    }

    public a d(int i) {
        return this.a[i];
    }

    public int e() {
        return this.a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C.class == obj.getClass()) {
            C c = (C) obj;
            if (Arrays.equals(this.a, c.a) && this.b == c.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + ax.u7.h.g(this.b);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.a));
        if (this.b == -9223372036854775807L) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = ", presentationTimeUs=" + this.b;
        }
        sb.append(str);
        return sb.toString();
    }

    public C(long j, a... aVarArr) {
        this.b = j;
        this.a = aVarArr;
    }

    public C(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    public C(long j, List<? extends a> list) {
        this(j, (a[]) list.toArray(new a[0]));
    }
}
