/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Gb.l;
import ax.sb.t;

public final class A {
    public final Object a;
    public final ax.Fb.l<Throwable, t> b;

    public A(Object object, ax.Fb.l<? super Throwable, t> l8) {
        this.a = object;
        this.b = l8;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof A)) {
            return false;
        }
        object = (A)object;
        if (!l.a(this.a, ((A)object).a)) {
            return false;
        }
        return l.a(this.b, ((A)object).b);
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = object == null ? 0 : object.hashCode();
        return n8 * 31 + this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CompletedWithCancellation(result=");
        stringBuilder.append(this.a);
        stringBuilder.append(", onCancellation=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

