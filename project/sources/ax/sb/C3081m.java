package ax.sb;

import java.io.Serializable;

/* renamed from: ax.sb.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3081m<A, B> implements Serializable {
    private final B c0;
    private final A q;

    public C3081m(A a, B b) {
        this.q = a;
        this.c0 = b;
    }

    public final A a() {
        return this.q;
    }

    public final B b() {
        return this.c0;
    }

    public final A c() {
        return this.q;
    }

    public final B d() {
        return this.c0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3081m)) {
            return false;
        }
        C3081m c3081m = (C3081m) obj;
        return ax.Gb.l.a(this.q, c3081m.q) && ax.Gb.l.a(this.c0, c3081m.c0);
    }

    public int hashCode() {
        A a = this.q;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.c0;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.q + ", " + this.c0 + ')';
    }
}
