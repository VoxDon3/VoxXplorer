package ax.Bd;

/* loaded from: classes3.dex */
public class a implements b {
    private long[] a;

    @Override // ax.Bd.b
    public void a(byte[] bArr) {
        this.a = d.d(bArr);
    }

    @Override // ax.Bd.b
    public void b(long j, byte[] bArr) {
        long[] l = d.l();
        if (j > 0) {
            long[] jArr = new long[2];
            d.f(this.a, jArr);
            do {
                if ((1 & j) != 0) {
                    d.j(l, jArr);
                }
                d.m(jArr, jArr);
                j >>>= 1;
            } while (j > 0);
        }
        d.b(l, bArr);
    }
}
