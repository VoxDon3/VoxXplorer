/*
 * Decompiled with CFR 0.152.
 */
package ax.b0;

import ax.b0.b;

public class c<F, S> {
    public final F a;
    public final S b;

    public c(F f8, S s8) {
        this.a = f8;
        this.b = s8;
    }

    public static <A, B> c<A, B> a(A a8, B b8) {
        return new c<A, B>(a8, b8);
    }

    public boolean equals(Object object) {
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return ax.b0.b.a(((c)object).a, this.a) && ax.b0.b.a(((c)object).b, this.b);
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.b;
        if (object != null) {
            n8 = object.hashCode();
        }
        return n9 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pair{");
        stringBuilder.append(this.a);
        stringBuilder.append(" ");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

