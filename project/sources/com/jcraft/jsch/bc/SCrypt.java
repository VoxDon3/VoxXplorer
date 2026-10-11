package com.jcraft.jsch.bc;

import ax.yd.C3528d;
import com.jcraft.jsch.JSchException;

/* loaded from: classes3.dex */
public class SCrypt implements com.jcraft.jsch.SCrypt {
    private Class<?> a;
    private byte[] b;
    private int c;
    private int d;
    private int e;

    @Override // com.jcraft.jsch.KDF
    public byte[] c(byte[] bArr, int i) {
        return C3528d.i(bArr, this.b, this.c, this.d, this.e, i);
    }

    @Override // com.jcraft.jsch.SCrypt
    public void d(byte[] bArr, int i, int i2, int i3) throws Exception {
        try {
            this.a = C3528d.class;
            this.b = bArr;
            this.c = i;
            this.d = i2;
            this.e = i3;
        } catch (NoClassDefFoundError e) {
            throw new JSchException("scrypt unavailable", e);
        }
    }
}
