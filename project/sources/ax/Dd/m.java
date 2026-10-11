package ax.Dd;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public final class m extends c {
    private final byte[] b;

    public m(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.b = bArr;
        ax.Id.a.d(secureRandom, bArr);
    }

    public n a() {
        byte[] bArr = new byte[32];
        ax.Id.a.e(this.b, 0, bArr, 0);
        return new n(bArr, 0);
    }

    public void b(n nVar, byte[] bArr, int i) {
        byte[] bArr2 = new byte[32];
        nVar.a(bArr2, 0);
        if (!ax.Id.a.a(this.b, 0, bArr2, 0, bArr, i)) {
            throw new IllegalStateException("X25519 agreement failed");
        }
    }
}
