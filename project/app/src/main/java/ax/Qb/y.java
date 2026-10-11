/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Gb.g;
import ax.Gb.l;
import ax.Qb.j;
import ax.Qb.m;
import ax.sb.t;

final class y {
    public final Object a;
    public final j b;
    public final ax.Fb.l<Throwable, t> c;
    public final Object d;
    public final Throwable e;

    public y(Object object, j j8, ax.Fb.l<? super Throwable, t> l8, Object object2, Throwable throwable) {
        this.a = object;
        this.b = j8;
        this.c = l8;
        this.d = object2;
        this.e = throwable;
    }

    public /* synthetic */ y(Object object, j j8, ax.Fb.l l8, Object object2, Throwable throwable, int n8, g g8) {
        if ((n8 & 2) != 0) {
            j8 = null;
        }
        if ((n8 & 4) != 0) {
            l8 = null;
        }
        if ((n8 & 8) != 0) {
            object2 = null;
        }
        if ((n8 & 0x10) != 0) {
            throwable = null;
        }
        this(object, j8, l8, object2, throwable);
    }

    public static /* synthetic */ y b(y y8, Object object, j j8, ax.Fb.l l8, Object object2, Throwable throwable, int n8, Object object3) {
        if ((n8 & 1) != 0) {
            object = y8.a;
        }
        if ((n8 & 2) != 0) {
            j8 = y8.b;
        }
        if ((n8 & 4) != 0) {
            l8 = y8.c;
        }
        if ((n8 & 8) != 0) {
            object2 = y8.d;
        }
        if ((n8 & 0x10) != 0) {
            throwable = y8.e;
        }
        return y8.a(object, j8, l8, object2, throwable);
    }

    public final y a(Object object, j j8, ax.Fb.l<? super Throwable, t> l8, Object object2, Throwable throwable) {
        return new y(object, j8, l8, object2, throwable);
    }

    public final boolean c() {
        return this.e != null;
    }

    public final void d(m<?> m8, Throwable throwable) {
        ax.Fb.l<Throwable, t> l8 = this.b;
        if (l8 != null) {
            m8.o((j)l8, throwable);
        }
        if ((l8 = this.c) != null) {
            m8.p(l8, throwable);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof y)) {
            return false;
        }
        object = (y)object;
        if (!l.a(this.a, ((y)object).a)) {
            return false;
        }
        if (!l.a(this.b, ((y)object).b)) {
            return false;
        }
        if (!l.a(this.c, ((y)object).c)) {
            return false;
        }
        if (!l.a(this.d, ((y)object).d)) {
            return false;
        }
        return l.a(this.e, ((y)object).e);
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.b;
        int n10 = object == null ? 0 : object.hashCode();
        object = this.c;
        int n11 = object == null ? 0 : object.hashCode();
        object = this.d;
        int n12 = object == null ? 0 : object.hashCode();
        object = this.e;
        if (object != null) {
            n8 = object.hashCode();
        }
        return (((n9 * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CompletedContinuation(result=");
        stringBuilder.append(this.a);
        stringBuilder.append(", cancelHandler=");
        stringBuilder.append(this.b);
        stringBuilder.append(", onCancellation=");
        stringBuilder.append(this.c);
        stringBuilder.append(", idempotentResume=");
        stringBuilder.append(this.d);
        stringBuilder.append(", cancelCause=");
        stringBuilder.append(this.e);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

