package ax.n5;

/* renamed from: ax.n5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2580b {
    private final String a;

    private C2580b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.a = str;
    }

    public static C2580b b(String str) {
        return new C2580b(str);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2580b) {
            return this.a.equals(((C2580b) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.a + "\"}";
    }
}
