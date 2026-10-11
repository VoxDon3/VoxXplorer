package com.jcraft.jsch.jce;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.SignatureECDSA;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;

/* loaded from: classes3.dex */
abstract class SignatureECDSAN implements SignatureECDSA {
    Signature a;
    KeyFactory b;

    SignatureECDSAN() {
    }

    private static byte[] k(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        Util.a(bArr);
        return bArr2;
    }

    private static byte[] m(byte[] bArr) {
        if ((bArr[0] & 128) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        Util.a(bArr);
        return bArr2;
    }

    private static byte[] n(byte[] bArr) {
        if (bArr.length >= 2) {
            int i = 0;
            while (i < bArr.length - 1 && bArr[i] == 0) {
                int i2 = i + 1;
                if ((bArr[i2] & 128) != 0) {
                    break;
                }
                i = i2;
            }
            if (i != 0) {
                int length = bArr.length - i;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, i, bArr2, 0, length);
                Util.a(bArr);
                return bArr2;
            }
        }
        return bArr;
    }

    @Override // com.jcraft.jsch.SignatureECDSA
    public void a(byte[] bArr) throws Exception {
        byte[] m = m(bArr);
        String str = m.length >= 64 ? "secp521r1" : m.length >= 48 ? "secp384r1" : "secp256r1";
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.a.initSign(this.b.generatePrivate(new ECPrivateKeySpec(new BigInteger(1, m), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // com.jcraft.jsch.SignatureECDSA
    public void b(byte[] bArr, byte[] bArr2) throws Exception {
        byte[] m = m(bArr);
        byte[] m2 = m(bArr2);
        String str = m.length >= 64 ? "secp521r1" : m.length >= 48 ? "secp384r1" : "secp256r1";
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.a.initVerify(this.b.generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, m), new BigInteger(1, m2)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (((r11[2] & 255) + 3) != r11.length) goto L10;
     */
    @Override // com.jcraft.jsch.Signature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(byte[] r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.jce.SignatureECDSAN.d(byte[]):boolean");
    }

    @Override // com.jcraft.jsch.Signature
    public void e() throws Exception {
        String l = l();
        this.a = Signature.getInstance(l.equals("ecdsa-sha2-nistp384") ? "SHA384withECDSA" : l.equals("ecdsa-sha2-nistp521") ? "SHA512withECDSA" : "SHA256withECDSA");
        this.b = KeyFactory.getInstance("EC");
    }

    @Override // com.jcraft.jsch.Signature
    public void f(byte[] bArr) throws Exception {
        this.a.update(bArr);
    }

    @Override // com.jcraft.jsch.Signature
    public byte[] j() throws Exception {
        byte[] sign = this.a.sign();
        if (sign[0] != '0') {
            return sign;
        }
        int i = sign[1];
        int i2 = 3;
        if (i + 2 != sign.length && ((i & 128) == 0 || (sign[2] & 255) + 3 != sign.length)) {
            return sign;
        }
        if ((i & 128) != 0 && (sign[2] & 255) + 3 == sign.length) {
            i2 = 4;
        }
        int i3 = sign[i2];
        byte[] bArr = new byte[i3];
        int i4 = sign[i2 + 2 + i3];
        byte[] bArr2 = new byte[i4];
        System.arraycopy(sign, i2 + 1, bArr, 0, i3);
        System.arraycopy(sign, i2 + 3 + sign[i2], bArr2, 0, i4);
        byte[] k = k(bArr);
        byte[] k2 = k(bArr2);
        Buffer buffer = new Buffer();
        buffer.x(k);
        buffer.x(k2);
        byte[] bArr3 = new byte[buffer.j()];
        buffer.C(0);
        buffer.e(bArr3);
        return bArr3;
    }

    abstract String l();
}
