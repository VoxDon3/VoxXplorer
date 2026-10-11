package com.jcraft.jsch.bc;

import ax.Dd.k;
import ax.vd.InterfaceC3312i;
import ax.zd.C3569c;
import com.jcraft.jsch.MAC;

/* loaded from: classes3.dex */
abstract class HMAC implements MAC {
    protected int a;
    protected InterfaceC3312i b;
    protected boolean c;
    private C3569c d;
    private final byte[] e = new byte[4];

    HMAC() {
    }

    @Override // com.jcraft.jsch.MAC
    public void a(byte[] bArr) throws Exception {
        int length = bArr.length;
        int i = this.a;
        if (length > i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            bArr = bArr2;
        }
        k kVar = new k(bArr, 0, bArr.length);
        C3569c c3569c = new C3569c(this.b);
        this.d = c3569c;
        c3569c.e(kVar);
    }

    @Override // com.jcraft.jsch.MAC
    public void b(byte[] bArr, int i, int i2) {
        this.d.b(bArr, i, i2);
    }

    @Override // com.jcraft.jsch.MAC
    public void c(byte[] bArr, int i) {
        this.d.c(bArr, i);
    }

    @Override // com.jcraft.jsch.MAC
    public int d() {
        return this.a;
    }

    @Override // com.jcraft.jsch.MAC
    public void e(int i) {
        byte[] bArr = this.e;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        b(bArr, 0, 4);
    }

    @Override // com.jcraft.jsch.MAC
    public boolean f() {
        return this.c;
    }
}
