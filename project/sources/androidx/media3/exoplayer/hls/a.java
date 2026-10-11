package androidx.media3.exoplayer.hls;

import android.net.Uri;
import ax.S0.C0968a;
import ax.U0.z;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
class a implements ax.U0.g {
    private final ax.U0.g a;
    private final byte[] b;
    private final byte[] c;
    private CipherInputStream d;

    public a(ax.U0.g gVar, byte[] bArr, byte[] bArr2) {
        this.a = gVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // ax.U0.g
    public final Uri b() {
        return this.a.b();
    }

    @Override // ax.P0.InterfaceC0902k
    public final int c(byte[] bArr, int i, int i2) throws IOException {
        C0968a.e(this.d);
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // ax.U0.g
    public void close() throws IOException {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // ax.U0.g
    public final void d(z zVar) {
        C0968a.e(zVar);
        this.a.d(zVar);
    }

    @Override // ax.U0.g
    public final long f(ax.U0.k kVar) throws IOException {
        try {
            Cipher q = q();
            try {
                q.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                ax.U0.i iVar = new ax.U0.i(this.a, kVar);
                this.d = new CipherInputStream(iVar, q);
                iVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // ax.U0.g
    public final Map<String, List<String>> l() {
        return this.a.l();
    }

    protected Cipher q() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }
}
