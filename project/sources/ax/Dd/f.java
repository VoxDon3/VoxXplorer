package ax.Dd;

/* loaded from: classes3.dex */
public final class f extends c {
    private final byte[] b;
    private g c;

    public f(byte[] bArr) {
        this(d(bArr), 0);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    public g a() {
        g gVar;
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    byte[] bArr = new byte[32];
                    ax.Jd.a.s(this.b, 0, bArr, 0);
                    this.c = new g(bArr, 0);
                }
                gVar = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public byte[] b() {
        return ax.Nd.a.d(this.b);
    }

    public void c(int i, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        byte[] bArr4 = new byte[32];
        a().a(bArr4, 0);
        if (i == 0) {
            if (bArr != null) {
                throw new IllegalArgumentException("ctx");
            }
            ax.Jd.a.S(this.b, 0, bArr4, 0, bArr2, i2, i3, bArr3, i4);
        } else if (i == 1) {
            ax.Jd.a.T(this.b, 0, bArr4, 0, bArr, bArr2, i2, i3, bArr3, i4);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("algorithm");
            }
            if (64 != i3) {
                throw new IllegalArgumentException("msgLen");
            }
            ax.Jd.a.U(this.b, 0, bArr4, 0, bArr, bArr2, i2, bArr3, i4);
        }
    }

    public f(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }
}
