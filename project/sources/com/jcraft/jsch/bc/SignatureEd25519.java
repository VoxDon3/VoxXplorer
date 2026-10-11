package com.jcraft.jsch.bc;

/* loaded from: classes3.dex */
public class SignatureEd25519 extends SignatureEdDSA {
    @Override // com.jcraft.jsch.bc.SignatureEdDSA, com.jcraft.jsch.SignatureEdDSA
    public /* bridge */ /* synthetic */ void a(byte[] bArr) throws Exception {
        super.a(bArr);
    }

    @Override // com.jcraft.jsch.bc.SignatureEdDSA, com.jcraft.jsch.Signature
    public /* bridge */ /* synthetic */ boolean d(byte[] bArr) throws Exception {
        return super.d(bArr);
    }

    @Override // com.jcraft.jsch.bc.SignatureEdDSA, com.jcraft.jsch.Signature
    public /* bridge */ /* synthetic */ void e() throws Exception {
        super.e();
    }

    @Override // com.jcraft.jsch.bc.SignatureEdDSA, com.jcraft.jsch.Signature
    public /* bridge */ /* synthetic */ void f(byte[] bArr) throws Exception {
        super.f(bArr);
    }

    @Override // com.jcraft.jsch.bc.SignatureEdDSA, com.jcraft.jsch.SignatureEdDSA
    public /* bridge */ /* synthetic */ void i(byte[] bArr) throws Exception {
        super.i(bArr);
    }

    @Override // com.jcraft.jsch.bc.SignatureEdDSA, com.jcraft.jsch.Signature
    public /* bridge */ /* synthetic */ byte[] j() throws Exception {
        return super.j();
    }

    @Override // com.jcraft.jsch.bc.SignatureEdDSA
    String k() {
        return "Ed25519";
    }

    @Override // com.jcraft.jsch.bc.SignatureEdDSA
    String l() {
        return "ssh-ed25519";
    }
}
