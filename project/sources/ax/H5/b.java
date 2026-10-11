package ax.H5;

/* loaded from: classes3.dex */
public class b {
    private int a = 1;

    public b a(Object obj) {
        this.a = (this.a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.a;
    }

    public final b c(boolean z) {
        this.a = (this.a * 31) + (z ? 1 : 0);
        return this;
    }
}
