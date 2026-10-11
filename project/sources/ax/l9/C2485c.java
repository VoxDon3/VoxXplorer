package ax.l9;

/* renamed from: ax.l9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2485c {
    private ax.Q8.g a;
    private int b;
    private int c;
    private int d;

    public C2485c(ax.Q8.g gVar, int i, int i2, int i3, boolean z) {
        this.a = gVar;
        this.b = z ? i : Math.max(i, 65536);
        this.c = z ? i2 : Math.max(i2, 65536);
        this.d = z ? i3 : Math.max(i3, 65536);
    }

    public ax.Q8.g a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public String toString() {
        return "NegotiatedProtocol{dialect=" + this.a + ", maxTransactSize=" + this.b + ", maxReadSize=" + this.c + ", maxWriteSize=" + this.d + '}';
    }
}
