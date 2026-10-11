package ax.Dd;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public final class o extends c {
    private final byte[] b;

    public o(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[56];
        this.b = bArr;
        ax.Id.c.d(secureRandom, bArr);
    }

    public p a() {
        byte[] bArr = new byte[56];
        ax.Id.c.e(this.b, 0, bArr, 0);
        return new p(bArr, 0);
    }

    public void b(p pVar, byte[] bArr, int i) {
        byte[] bArr2 = new byte[56];
        pVar.a(bArr2, 0);
        if (!ax.Id.c.a(this.b, 0, bArr2, 0, bArr, i)) {
            throw new IllegalStateException("X448 agreement failed");
        }
    }
}
