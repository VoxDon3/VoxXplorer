package ax.G1;

import ax.S0.G;

/* loaded from: classes.dex */
public final class a extends b {
    public final long a;
    public final long b;
    public final byte[] c;

    private a(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    static a d(G g, int i, long j) {
        long O = g.O();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        g.q(bArr, 0, i2);
        return new a(O, bArr, j);
    }

    @Override // ax.G1.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.a + ", identifier= " + this.b + " }";
    }
}
