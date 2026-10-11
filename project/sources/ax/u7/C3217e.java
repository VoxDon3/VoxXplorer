package ax.u7;

import ax.q7.n;
import java.io.Serializable;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* renamed from: ax.u7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3217e implements Serializable {
    private static final C3217e e0 = new C3217e(new int[0]);
    private final transient int c0;
    private final int d0;
    private final int[] q;

    private C3217e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static C3217e a(int[] iArr) {
        return iArr.length == 0 ? e0 : new C3217e(Arrays.copyOf(iArr, iArr.length));
    }

    public static C3217e e() {
        return e0;
    }

    public int b(int i) {
        n.l(i, d());
        return this.q[this.c0 + i];
    }

    public boolean c() {
        return this.d0 == this.c0;
    }

    public int d() {
        return this.d0 - this.c0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3217e)) {
            return false;
        }
        C3217e c3217e = (C3217e) obj;
        if (d() != c3217e.d()) {
            return false;
        }
        for (int i = 0; i < d(); i++) {
            if (b(i) != c3217e.b(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.c0; i2 < this.d0; i2++) {
            i = (i * 31) + C3218f.j(this.q[i2]);
        }
        return i;
    }

    public String toString() {
        if (c()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(d() * 5);
        sb.append('[');
        sb.append(this.q[this.c0]);
        int i = this.c0;
        while (true) {
            i++;
            if (i >= this.d0) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.q[i]);
        }
    }

    private C3217e(int[] iArr, int i, int i2) {
        this.q = iArr;
        this.c0 = i;
        this.d0 = i2;
    }
}
