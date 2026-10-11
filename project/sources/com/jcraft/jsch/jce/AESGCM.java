package com.jcraft.jsch.jce;

import ax.y9.C3517a;
import com.jcraft.jsch.Cipher;
import java.nio.ByteBuffer;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
abstract class AESGCM implements Cipher {
    private javax.crypto.Cipher a;
    private SecretKeySpec b;
    private int c;
    private ByteBuffer d;
    private long e;

    AESGCM() {
    }

    @Override // com.jcraft.jsch.Cipher
    public void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws Exception {
        this.a.update(bArr, i, i2, bArr2, i3);
    }

    @Override // com.jcraft.jsch.Cipher
    public /* synthetic */ void e(int i) {
        C3517a.e(this, i);
    }

    @Override // com.jcraft.jsch.Cipher
    public void f(byte[] bArr, int i, int i2) throws Exception {
        this.a.updateAAD(bArr, i, i2);
    }

    @Override // com.jcraft.jsch.Cipher
    public int g() {
        return 16;
    }

    @Override // com.jcraft.jsch.Cipher
    public void h(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws Exception {
        this.a.doFinal(bArr, i, i2, bArr2, i3);
        long j = this.d.getLong(4) + 1;
        if (j == this.e) {
            throw new IllegalStateException("GCM IV would be reused");
        }
        this.d.putLong(4, j);
        this.a.init(this.c, this.b, new GCMParameterSpec(128, this.d.array()));
    }

    @Override // com.jcraft.jsch.Cipher
    public boolean i() {
        return false;
    }

    @Override // com.jcraft.jsch.Cipher
    public /* synthetic */ boolean j() {
        return C3517a.d(this);
    }

    @Override // com.jcraft.jsch.Cipher
    public void k(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > 12) {
            byte[] bArr3 = new byte[12];
            System.arraycopy(bArr2, 0, bArr3, 0, 12);
            bArr2 = bArr3;
        }
        int d = d();
        if (bArr.length > d) {
            byte[] bArr4 = new byte[d];
            System.arraycopy(bArr, 0, bArr4, 0, d);
            bArr = bArr4;
        }
        this.c = i == 0 ? 1 : 2;
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        this.d = wrap;
        this.e = wrap.getLong(4);
        try {
            this.b = new SecretKeySpec(bArr, "AES");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
            this.a = cipher;
            cipher.init(this.c, this.b, new GCMParameterSpec(128, bArr2));
        } catch (Exception e) {
            this.a = null;
            this.b = null;
            this.d = null;
            throw e;
        }
    }

    @Override // com.jcraft.jsch.Cipher
    public int l() {
        return 16;
    }

    @Override // com.jcraft.jsch.Cipher
    public boolean m() {
        return true;
    }
}
