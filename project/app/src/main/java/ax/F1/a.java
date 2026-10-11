/*
 * Decompiled with CFR 0.152.
 */
package ax.F1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;
import ax.u7.h;

public final class a
implements C.a {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public a(long l8, long l9, long l10, long l11, long l12) {
        this.a = l8;
        this.b = l9;
        this.c = l10;
        this.d = l11;
        this.e = l12;
    }

    @Override
    public /* synthetic */ v a() {
        return B.b(this);
    }

    @Override
    public /* synthetic */ void b(A.b b8) {
        B.c(this, b8);
    }

    @Override
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && a.class == object.getClass()) {
            object = (a)object;
            if (this.a == ((a)object).a && this.b == ((a)object).b && this.c == ((a)object).c && this.d == ((a)object).d && this.e == ((a)object).e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + h.g(this.a)) * 31 + h.g(this.b)) * 31 + h.g(this.c)) * 31 + h.g(this.d)) * 31 + h.g(this.e);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Motion photo metadata: photoStartPosition=");
        stringBuilder.append(this.a);
        stringBuilder.append(", photoSize=");
        stringBuilder.append(this.b);
        stringBuilder.append(", photoPresentationTimestampUs=");
        stringBuilder.append(this.c);
        stringBuilder.append(", videoStartPosition=");
        stringBuilder.append(this.d);
        stringBuilder.append(", videoSize=");
        stringBuilder.append(this.e);
        return stringBuilder.toString();
    }
}

