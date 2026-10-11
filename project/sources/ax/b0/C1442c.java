package ax.b0;

/* renamed from: ax.b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1442c<F, S> {
    public final F a;
    public final S b;

    public C1442c(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public static <A, B> C1442c<A, B> a(A a, B b) {
        return new C1442c<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1442c)) {
            return false;
        }
        C1442c c1442c = (C1442c) obj;
        return C1441b.a(c1442c.a, this.a) && C1441b.a(c1442c.b, this.b);
    }

    public int hashCode() {
        F f = this.a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
