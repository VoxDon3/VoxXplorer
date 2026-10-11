/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import ax.P0.A;
import ax.P0.v;
import ax.S0.d0;
import ax.u7.h;
import java.util.Arrays;
import java.util.List;

public final class C {
    private final a[] a;
    public final long b;

    public C(long l8, List<? extends a> list) {
        this(l8, list.toArray(new a[0]));
    }

    public C(long l8, a ... aArray) {
        this.b = l8;
        this.a = aArray;
    }

    public C(List<? extends a> list) {
        this(list.toArray(new a[0]));
    }

    public C(a ... aArray) {
        this(-9223372036854775807L, aArray);
    }

    public C a(a ... aArray) {
        if (aArray.length == 0) {
            return this;
        }
        return new C(this.b, d0.f1(this.a, aArray));
    }

    public C b(C c8) {
        if (c8 == null) {
            return this;
        }
        return this.a(c8.a);
    }

    public C c(long l8) {
        if (this.b == l8) {
            return this;
        }
        return new C(l8, this.a);
    }

    public a d(int n8) {
        return this.a[n8];
    }

    public int e() {
        return this.a.length;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && C.class == object.getClass()) {
            object = (C)object;
            if (Arrays.equals(this.a, ((C)object).a) && this.b == ((C)object).b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a) * 31 + h.g(this.b);
    }

    public String toString() {
        CharSequence charSequence;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("entries=");
        stringBuilder.append(Arrays.toString(this.a));
        if (this.b == -9223372036854775807L) {
            charSequence = "";
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(", presentationTimeUs=");
            ((StringBuilder)charSequence).append(this.b);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append((String)charSequence);
        return stringBuilder.toString();
    }

    public static interface a {
        public v a();

        public void b(A.b var1);

        public byte[] c();
    }
}

