/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import ax.K5.a;
import ax.M5.n;

public final class b<O extends a.d> {
    private final int a;
    private final a b;
    private final a.d c;
    private final String d;

    private b(a a8, a.d d8, String string) {
        this.b = a8;
        this.c = d8;
        this.d = string;
        this.a = n.c(a8, d8, string);
    }

    public static <O extends a.d> b<O> a(a<O> a8, O o8, String string) {
        return new b<O>(a8, o8, string);
    }

    public final String b() {
        return this.b.c();
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        return n.b(this.b, ((b)object).b) && n.b(this.c, ((b)object).c) && n.b(this.d, ((b)object).d);
    }

    public final int hashCode() {
        return this.a;
    }
}

