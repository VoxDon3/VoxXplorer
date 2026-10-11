package ax.Bc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
class a extends f {

    /* renamed from: ax.Bc.a$a, reason: collision with other inner class name */
    class C0057a extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
        private CipherInputStream c0;
        final /* synthetic */ e d0;
        final /* synthetic */ String e0;
        final /* synthetic */ byte[] f0;
        final /* synthetic */ InputStream g0;
        private boolean q;

        C0057a(e eVar, String str, byte[] bArr, InputStream inputStream) {
            this.d0 = eVar;
            this.e0 = str;
            this.f0 = bArr;
            this.g0 = inputStream;
        }

        private CipherInputStream a() throws IOException {
            byte[] digest;
            if (this.q) {
                return this.c0;
            }
            byte[] bArr = this.d0.d;
            if (bArr == null) {
                throw new IOException("Missing AES256 properties in " + this.e0);
            }
            if (bArr.length < 2) {
                throw new IOException("AES256 properties too short in " + this.e0);
            }
            int i = bArr[0];
            int i2 = i & 255;
            int i3 = i & 63;
            int i4 = bArr[1];
            int i5 = ((i2 >> 6) & 1) + (i4 & 15);
            int i6 = ((i2 >> 7) & 1) + ((i4 & 255) >> 4);
            int i7 = i6 + 2;
            if (i7 + i5 > bArr.length) {
                throw new IOException("Salt size + IV size too long in " + this.e0);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, 2, bArr2, 0, i6);
            byte[] bArr3 = new byte[16];
            System.arraycopy(this.d0.d, i7, bArr3, 0, i5);
            if (this.f0 == null) {
                throw new ax.zc.b(this.e0);
            }
            if (i3 == 63) {
                digest = new byte[32];
                System.arraycopy(bArr2, 0, digest, 0, i6);
                byte[] bArr4 = this.f0;
                System.arraycopy(bArr4, 0, digest, i6, Math.min(bArr4.length, 32 - i6));
            } else {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] bArr5 = new byte[8];
                    for (long j = 0; j < (1 << i3); j++) {
                        messageDigest.update(bArr2);
                        messageDigest.update(this.f0);
                        messageDigest.update(bArr5);
                        for (int i8 = 0; i8 < 8; i8++) {
                            byte b = (byte) (bArr5[i8] + 1);
                            bArr5[i8] = b;
                            if (b != 0) {
                                break;
                            }
                        }
                    }
                    digest = messageDigest.digest();
                } catch (NoSuchAlgorithmException e) {
                    throw new IOException("SHA-256 is unsupported by your Java implementation", e);
                }
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(digest, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                CipherInputStream cipherInputStream = new CipherInputStream(this.g0, cipher);
                this.c0 = cipherInputStream;
                this.q = true;
                return cipherInputStream;
            } catch (GeneralSecurityException e2) {
                throw new IOException("Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)", e2);
            }
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            CipherInputStream cipherInputStream = this.c0;
            if (cipherInputStream != null) {
                cipherInputStream.close();
            }
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            return a().read();
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            return a().read(bArr, i, i2);
        }
    }

    a() {
        super(new Class[0]);
    }

    @Override // ax.Bc.f
    InputStream b(String str, InputStream inputStream, long j, e eVar, byte[] bArr, int i) throws IOException {
        return new C0057a(eVar, str, bArr, inputStream);
    }
}
