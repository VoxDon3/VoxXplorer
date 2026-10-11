/*
 * Decompiled with CFR 0.152.
 */
package ax.D1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;
import java.util.Arrays;

public final class c
implements C.a {
    public final byte[] a;
    public final String b;
    public final String c;

    public c(byte[] byArray, String string, String string2) {
        this.a = byArray;
        this.b = string;
        this.c = string2;
    }

    @Override
    public /* synthetic */ v a() {
        return B.b(this);
    }

    @Override
    public void b(A.b b8) {
        String string = this.b;
        if (string != null) {
            b8.p0(string);
        }
    }

    @Override
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            return Arrays.equals(this.a, ((c)object).a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.b, this.c, this.a.length);
    }
}

