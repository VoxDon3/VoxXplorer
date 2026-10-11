package ax.Dd;

/* loaded from: classes3.dex */
public final class h extends c {
    private final byte[] b;
    private i c;

    public h(byte[] bArr) {
        this(d(bArr), 0);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 57) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 57");
    }

    public i a() {
        i iVar;
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    byte[] bArr = new byte[57];
                    ax.Jd.b.t(this.b, 0, bArr, 0);
                    this.c = new i(bArr, 0);
                }
                iVar = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public byte[] b() {
        return ax.Nd.a.d(this.b);
    }

    public void c(int i, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        byte[] bArr4 = new byte[57];
        a().a(bArr4, 0);
        if (i == 0) {
            ax.Jd.b.O(this.b, 0, bArr4, 0, bArr, bArr2, i2, i3, bArr3, i4);
        } else {
            if (i != 1) {
                throw new IllegalArgumentException("algorithm");
            }
            if (64 != i3) {
                throw new IllegalArgumentException("msgLen");
            }
            ax.Jd.b.P(this.b, 0, bArr4, 0, bArr, bArr2, i2, bArr3, i4);
        }
    }

    public h(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[57];
        this.b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 57);
    }
}
