package j$.util;

/* renamed from: j$.util.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3958z {
    public static final C3958z c = new C3958z();
    public final boolean a;
    public final int b;

    public C3958z() {
        this.a = false;
        this.b = 0;
    }

    public C3958z(int i) {
        this.a = true;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3958z)) {
            return false;
        }
        C3958z c3958z = (C3958z) obj;
        boolean z = this.a;
        return (z && c3958z.a) ? this.b == c3958z.b : z == c3958z.a;
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public final String toString() {
        if (this.a) {
            return "OptionalInt[" + this.b + "]";
        }
        return "OptionalInt.empty";
    }
}
