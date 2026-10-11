package ax.nb;

/* renamed from: ax.nb.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2648k extends AbstractC2649l {
    private C2639b c;
    private C2639b d;

    public C2648k(C2639b c2639b, C2639b c2639b2) {
        this.a = 129;
        this.c = c2639b;
        this.d = c2639b2;
    }

    @Override // ax.nb.AbstractC2649l
    int c(byte[] bArr, int i) {
        int d = this.c.d(bArr, i) + i;
        return (d + this.d.d(bArr, d)) - i;
    }
}
