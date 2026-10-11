package com.jcraft.jsch.jce;

/* loaded from: classes3.dex */
public class SignatureECDSA384 extends SignatureECDSAN {
    @Override // com.jcraft.jsch.jce.SignatureECDSAN, com.jcraft.jsch.SignatureECDSA
    public /* bridge */ /* synthetic */ void a(byte[] bArr) throws Exception {
        super.a(bArr);
    }

    @Override // com.jcraft.jsch.jce.SignatureECDSAN, com.jcraft.jsch.SignatureECDSA
    public /* bridge */ /* synthetic */ void b(byte[] bArr, byte[] bArr2) throws Exception {
        super.b(bArr, bArr2);
    }

    @Override // com.jcraft.jsch.jce.SignatureECDSAN, com.jcraft.jsch.Signature
    public /* bridge */ /* synthetic */ boolean d(byte[] bArr) throws Exception {
        return super.d(bArr);
    }

    @Override // com.jcraft.jsch.jce.SignatureECDSAN, com.jcraft.jsch.Signature
    public /* bridge */ /* synthetic */ void e() throws Exception {
        super.e();
    }

    @Override // com.jcraft.jsch.jce.SignatureECDSAN, com.jcraft.jsch.Signature
    public /* bridge */ /* synthetic */ void f(byte[] bArr) throws Exception {
        super.f(bArr);
    }

    @Override // com.jcraft.jsch.jce.SignatureECDSAN, com.jcraft.jsch.Signature
    public /* bridge */ /* synthetic */ byte[] j() throws Exception {
        return super.j();
    }

    @Override // com.jcraft.jsch.jce.SignatureECDSAN
    String l() {
        return "ecdsa-sha2-nistp384";
    }
}
