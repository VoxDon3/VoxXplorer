package com.jcraft.jsch.jce;

import com.jcraft.jsch.HASH;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public class SHA512 implements HASH {
    MessageDigest a;

    @Override // com.jcraft.jsch.HASH
    public String a() {
        return "SHA512";
    }

    @Override // com.jcraft.jsch.HASH
    public void b(byte[] bArr, int i, int i2) throws Exception {
        this.a.update(bArr, i, i2);
    }

    @Override // com.jcraft.jsch.HASH
    public byte[] c() throws Exception {
        return this.a.digest();
    }

    @Override // com.jcraft.jsch.HASH
    public int d() {
        return 64;
    }

    @Override // com.jcraft.jsch.HASH
    public void e() throws Exception {
        this.a = MessageDigest.getInstance("SHA-512");
    }
}
