package com.jcraft.jsch.bc;

import ax.Dd.k;
import ax.Dd.l;
import ax.xd.C3490b;
import ax.y9.C3517a;
import ax.zd.C3570d;
import com.jcraft.jsch.Cipher;
import java.nio.ByteBuffer;
import javax.crypto.AEADBadTagException;

/* loaded from: classes3.dex */
public class ChaCha20Poly1305 implements Cipher {
    private C3490b a;
    private C3490b b;
    private k c;
    private k d;
    private int e;
    private C3570d f;

    private static boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    @Override // com.jcraft.jsch.Cipher
    public void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws Exception {
        this.a.g(bArr, i, i2, bArr2, i3);
    }

    @Override // com.jcraft.jsch.Cipher
    public int d() {
        return 64;
    }

    @Override // com.jcraft.jsch.Cipher
    public void e(int i) throws Exception {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(0, i);
        this.a.e(this.e == 0, new l(this.c, allocate.array(), 0, allocate.array().length));
        this.b.e(this.e == 0, new l(this.d, allocate.array(), 0, allocate.array().length));
        byte[] bArr = new byte[64];
        this.b.g(bArr, 0, 64, bArr, 0);
        this.f.e(new k(bArr, 0, 32));
    }

    @Override // com.jcraft.jsch.Cipher
    public /* synthetic */ void f(byte[] bArr, int i, int i2) {
        C3517a.f(this, bArr, i, i2);
    }

    @Override // com.jcraft.jsch.Cipher
    public int g() {
        return 16;
    }

    @Override // com.jcraft.jsch.Cipher
    public void h(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws Exception {
        if (this.e == 1) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr, i2, bArr3, 0, 16);
            byte[] bArr4 = new byte[16];
            this.f.b(bArr, i, i2);
            this.f.c(bArr4, 0);
            if (!b(bArr3, bArr4)) {
                throw new AEADBadTagException("Tag mismatch");
            }
        }
        this.b.g(bArr, i + 4, i2 - 4, bArr2, i3 + 4);
        if (this.e == 0) {
            this.f.b(bArr2, i3, i2);
            this.f.c(bArr2, i2);
        }
    }

    @Override // com.jcraft.jsch.Cipher
    public boolean i() {
        return false;
    }

    @Override // com.jcraft.jsch.Cipher
    public boolean j() {
        return true;
    }

    @Override // com.jcraft.jsch.Cipher
    public void k(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr.length > 64) {
            byte[] bArr3 = new byte[64];
            System.arraycopy(bArr, 0, bArr3, 0, 64);
            bArr = bArr3;
        }
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        System.arraycopy(bArr, 32, bArr4, 0, 32);
        System.arraycopy(bArr, 0, bArr5, 0, 32);
        this.e = i;
        try {
            this.c = new k(bArr4, 0, 32);
            this.d = new k(bArr5, 0, 32);
            this.a = new C3490b();
            this.b = new C3490b();
            this.f = new C3570d();
        } catch (Exception e) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            throw e;
        }
    }

    @Override // com.jcraft.jsch.Cipher
    public int l() {
        return 8;
    }

    @Override // com.jcraft.jsch.Cipher
    public boolean m() {
        return true;
    }
}
