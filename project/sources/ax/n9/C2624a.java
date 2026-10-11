package ax.n9;

/* renamed from: ax.n9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2624a implements InterfaceC2625b {
    private String a;
    private int b;

    public C2624a(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2624a c2624a = (C2624a) obj;
        if (this.b != c2624a.b) {
            return false;
        }
        return this.a.equals(c2624a.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
