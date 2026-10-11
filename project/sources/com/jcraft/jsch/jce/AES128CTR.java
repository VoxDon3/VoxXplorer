package com.jcraft.jsch.jce;

import ax.y9.C3517a;
import com.jcraft.jsch.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class AES128CTR implements Cipher {
    private javax.crypto.Cipher a;

    @Override // com.jcraft.jsch.Cipher
    public void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws Exception {
        this.a.update(bArr, i, i2, bArr2, i3);
    }

    @Override // com.jcraft.jsch.Cipher
    public int d() {
        return 16;
    }

    @Override // com.jcraft.jsch.Cipher
    public /* synthetic */ void e(int i) {
        C3517a.e(this, i);
    }

    @Override // com.jcraft.jsch.Cipher
    public /* synthetic */ void f(byte[] bArr, int i, int i2) {
        C3517a.f(this, bArr, i, i2);
    }

    @Override // com.jcraft.jsch.Cipher
    public /* synthetic */ int g() {
        return C3517a.b(this);
    }

    @Override // com.jcraft.jsch.Cipher
    public /* synthetic */ void h(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        C3517a.a(this, bArr, i, i2, bArr2, i3);
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
        if (bArr2.length > 16) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr2, 0, bArr3, 0, 16);
            bArr2 = bArr3;
        }
        if (bArr.length > 16) {
            byte[] bArr4 = new byte[16];
            System.arraycopy(bArr, 0, bArr4, 0, 16);
            bArr = bArr4;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CTR/NoPadding");
            this.a = cipher;
            cipher.init(i == 0 ? 1 : 2, secretKeySpec, new IvParameterSpec(bArr2));
        } catch (Exception e) {
            this.a = null;
            throw e;
        }
    }

    @Override // com.jcraft.jsch.Cipher
    public int l() {
        return 16;
    }

    @Override // com.jcraft.jsch.Cipher
    public /* synthetic */ boolean m() {
        return C3517a.c(this);
    }
}
