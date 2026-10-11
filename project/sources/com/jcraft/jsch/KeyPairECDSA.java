package com.jcraft.jsch;

import com.jcraft.jsch.JSch;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
class KeyPairECDSA extends KeyPair {
    private static byte[][] v = {new byte[]{6, 8, 42, -122, 72, -50, 61, 3, 1, 7}, new byte[]{6, 5, 43, -127, 4, 0, 34}, new byte[]{6, 5, 43, -127, 4, 0, 35}};
    private static String[] w = {"nistp256", "nistp384", "nistp521"};
    private static final byte[] x = Util.v("-----BEGIN EC PRIVATE KEY-----");
    private static final byte[] y = Util.v("-----END EC PRIVATE KEY-----");
    private byte[] q;
    private byte[] r;
    private byte[] s;
    private byte[] t;
    private int u;

    KeyPairECDSA(JSch.InstanceLogger instanceLogger) {
        this(instanceLogger, null, null, null, null);
    }

    static byte[][] H(byte[] bArr) {
        int i = 0;
        while (bArr[i] != 4) {
            i++;
        }
        int i2 = i + 1;
        int length = (bArr.length - i2) / 2;
        byte[] bArr2 = new byte[length];
        int length2 = (bArr.length - i2) / 2;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, i2, bArr2, 0, length);
        System.arraycopy(bArr, i2 + length, bArr3, 0, length2);
        return new byte[][]{bArr2, bArr3};
    }

    static KeyPair I(JSch.InstanceLogger instanceLogger, Buffer buffer) throws JSchException {
        byte[][] g = buffer.g(5, "invalid key format");
        byte[] bArr = g[1];
        byte[][] H = H(g[2]);
        KeyPairECDSA keyPairECDSA = new KeyPairECDSA(instanceLogger, bArr, H[0], H[1], g[3]);
        keyPairECDSA.b = Util.c(g[4]);
        keyPairECDSA.a = 0;
        return keyPairECDSA;
    }

    static byte[] J(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + 1 + bArr2.length];
        bArr3[0] = 4;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 1, bArr2.length);
        return bArr3;
    }

    @Override // com.jcraft.jsch.KeyPair
    public void f() {
        super.f();
        Util.g(this.t);
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] g() throws JSchException {
        if (r()) {
            throw new JSchException("key is encrypted.");
        }
        Buffer buffer = new Buffer();
        buffer.y(Util.v("ecdsa-sha2-" + Util.c(this.q)));
        buffer.y(this.q);
        buffer.y(J(this.r, this.s));
        buffer.y(this.t);
        buffer.y(Util.v(this.b));
        int j = buffer.j();
        byte[] bArr = new byte[j];
        buffer.f(bArr, 0, j);
        return bArr;
    }

    @Override // com.jcraft.jsch.KeyPair
    byte[] l() {
        return Util.v("ecdsa-sha2-" + Util.c(this.q));
    }

    @Override // com.jcraft.jsch.KeyPair
    byte[] n() {
        byte[] bArr = {1};
        byte[][] bArr2 = v;
        byte[] bArr3 = this.r;
        byte[] bArr4 = bArr2[bArr3.length >= 64 ? (char) 2 : bArr3.length >= 48 ? (char) 1 : (char) 0];
        byte[] J = J(bArr3, this.s);
        int i = ((J.length + 1) & 128) == 0 ? 3 : 4;
        int length = J.length + i;
        byte[] bArr5 = new byte[length];
        System.arraycopy(J, 0, bArr5, i, J.length);
        bArr5[0] = 3;
        if (i == 3) {
            bArr5[1] = (byte) (J.length + 1);
        } else {
            bArr5[1] = -127;
            bArr5[2] = (byte) (J.length + 1);
        }
        int c = c(1) + 3 + c(this.t.length) + this.t.length + 1 + c(bArr4.length) + bArr4.length + 1 + c(length) + length;
        byte[] bArr6 = new byte[c(c) + 1 + c];
        C(bArr6, (byte) -95, C(bArr6, (byte) -96, F(bArr6, D(bArr6, G(bArr6, 0, c), bArr), this.t), bArr4), bArr5);
        return bArr6;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] o() {
        byte[] o = super.o();
        if (o != null) {
            return o;
        }
        if (this.r == null) {
            return null;
        }
        byte[] v2 = Util.v("ecdsa-sha2-" + Util.c(this.q));
        byte[] bArr = this.q;
        byte[] bArr2 = this.r;
        byte[][] bArr3 = {v2, bArr, new byte[bArr2.length + 1 + this.s.length]};
        byte[] bArr4 = bArr3[2];
        bArr4[0] = 4;
        System.arraycopy(bArr2, 0, bArr4, 1, bArr2.length);
        byte[] bArr5 = this.s;
        System.arraycopy(bArr5, 0, bArr3[2], this.r.length + 1, bArr5.length);
        return Buffer.b(bArr3).b;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] p(byte[] bArr) {
        try {
            SignatureECDSA signatureECDSA = (SignatureECDSA) Class.forName(JSch.f("ecdsa-sha2-" + Util.c(this.q))).asSubclass(SignatureECDSA.class).getDeclaredConstructor(null).newInstance(null);
            signatureECDSA.e();
            signatureECDSA.a(this.t);
            signatureECDSA.f(bArr);
            return Buffer.b(new byte[][]{Util.v("ecdsa-sha2-" + Util.c(this.q)), signatureECDSA.j()}).b;
        } catch (Exception e) {
            if (this.c.a().isEnabled(3)) {
                this.c.a().b(3, "failed to generate signature", e);
            }
            return null;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] q(byte[] bArr, String str) {
        return p(bArr);
    }

    @Override // com.jcraft.jsch.KeyPair
    boolean y(byte[] bArr) {
        int i;
        try {
            int i2 = this.a;
            if (i2 == 1) {
                return false;
            }
            if (i2 != 2 && i2 != 5) {
                if (i2 == 4) {
                    Buffer buffer = new Buffer(bArr);
                    if (buffer.i() != buffer.i()) {
                        throw new JSchException("check failed");
                    }
                    Util.c(buffer.p());
                    this.q = buffer.p();
                    if (!Arrays.asList(w).contains(Util.c(this.q))) {
                        throw new IllegalArgumentException("unknown curve name " + Util.c(this.q));
                    }
                    int i3 = buffer.i();
                    buffer.c();
                    int i4 = i3 - 1;
                    int i5 = i4 / 2;
                    byte[] bArr2 = new byte[i5];
                    byte[] bArr3 = new byte[i4 / 2];
                    buffer.e(bArr2);
                    buffer.e(bArr3);
                    this.t = buffer.p();
                    this.b = Util.c(buffer.p());
                    this.r = bArr2;
                    this.s = bArr3;
                    this.u = i5 >= 64 ? 521 : i5 >= 48 ? 384 : 256;
                    return true;
                }
                if (bArr[0] != 48) {
                    return false;
                }
                byte b = bArr[1];
                if ((b & 128) != 0) {
                    int i6 = b & Byte.MAX_VALUE;
                    i = 2;
                    while (true) {
                        int i7 = i6 - 1;
                        if (i6 <= 0) {
                            break;
                        }
                        int i8 = i + 1;
                        byte b2 = bArr[i];
                        i = i8;
                        i6 = i7;
                    }
                } else {
                    i = 2;
                }
                if (bArr[i] != 2) {
                    return false;
                }
                int i9 = i + 1;
                int i10 = i + 2;
                int i11 = bArr[i9];
                int i12 = i11 & 255;
                if ((i11 & 128) != 0) {
                    int i13 = i11 & 127;
                    i12 = 0;
                    while (true) {
                        int i14 = i13 - 1;
                        if (i13 <= 0) {
                            break;
                        }
                        int i15 = (i12 << 8) + (bArr[i10] & 255);
                        i10++;
                        i12 = i15;
                        i13 = i14;
                    }
                }
                int i16 = i10 + i12;
                int i17 = i16 + 1;
                int i18 = i16 + 2;
                int i19 = bArr[i17];
                int i20 = i19 & 255;
                if ((i19 & 128) != 0) {
                    int i21 = i19 & 127;
                    i20 = 0;
                    while (true) {
                        int i22 = i21 - 1;
                        if (i21 <= 0) {
                            break;
                        }
                        int i23 = (i20 << 8) + (bArr[i18] & 255);
                        i18++;
                        i20 = i23;
                        i21 = i22;
                    }
                }
                byte[] bArr4 = new byte[i20];
                this.t = bArr4;
                System.arraycopy(bArr, i18, bArr4, 0, i20);
                int i24 = i18 + i20;
                int i25 = i24 + 1;
                int i26 = i24 + 2;
                int i27 = bArr[i25];
                int i28 = i27 & 255;
                if ((i27 & 128) != 0) {
                    int i29 = i27 & 127;
                    i28 = 0;
                    while (true) {
                        int i30 = i29 - 1;
                        if (i29 <= 0) {
                            break;
                        }
                        int i31 = (i28 << 8) + (bArr[i26] & 255);
                        i26++;
                        i28 = i31;
                        i29 = i30;
                    }
                }
                byte[] bArr5 = new byte[i28];
                System.arraycopy(bArr, i26, bArr5, 0, i28);
                int i32 = i26 + i28;
                int i33 = 0;
                while (true) {
                    byte[][] bArr6 = v;
                    if (i33 >= bArr6.length) {
                        break;
                    }
                    if (Util.a(bArr6[i33], bArr5)) {
                        this.q = Util.v(w[i33]);
                        break;
                    }
                    i33++;
                }
                int i34 = i32 + 1;
                int i35 = i32 + 2;
                int i36 = bArr[i34];
                int i37 = i36 & 255;
                if ((i36 & 128) != 0) {
                    int i38 = i36 & 127;
                    i37 = 0;
                    while (true) {
                        int i39 = i38 - 1;
                        if (i38 <= 0) {
                            break;
                        }
                        int i40 = (i37 << 8) + (bArr[i35] & 255);
                        i35++;
                        i37 = i40;
                        i38 = i39;
                    }
                }
                byte[] bArr7 = new byte[i37];
                System.arraycopy(bArr, i35, bArr7, 0, i37);
                byte[][] H = H(bArr7);
                this.r = H[0];
                this.s = H[1];
                byte[] bArr8 = this.t;
                if (bArr8 != null) {
                    this.u = bArr8.length >= 64 ? 521 : bArr8.length >= 48 ? 384 : 256;
                }
                return true;
            }
            Buffer buffer2 = new Buffer(bArr);
            buffer2.E(bArr.length);
            try {
                byte[] bArr9 = buffer2.g(1, HttpUrl.FRAGMENT_ENCODE_SET)[0];
                this.t = bArr9;
                this.u = bArr9.length >= 64 ? 521 : bArr9.length >= 48 ? 384 : 256;
                return true;
            } catch (JSchException e) {
                if (this.c.a().isEnabled(3)) {
                    this.c.a().b(3, "failed to parse key", e);
                }
                return false;
            }
        } catch (Exception e2) {
            if (this.c.a().isEnabled(3)) {
                this.c.a().b(3, "failed to parse key", e2);
            }
            return false;
        }
    }

    KeyPairECDSA(JSch.InstanceLogger instanceLogger, byte[] bArr) {
        this(instanceLogger, null, null, null, null);
        if (bArr != null) {
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArr, 11, bArr2, 0, 8);
            if (Util.a(bArr2, Util.v("nistp384"))) {
                this.u = 384;
                this.q = bArr2;
            }
            if (Util.a(bArr2, Util.v("nistp521"))) {
                this.u = 521;
                this.q = bArr2;
            }
        }
    }

    KeyPairECDSA(JSch.InstanceLogger instanceLogger, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(instanceLogger);
        this.q = Util.v(w[0]);
        int i = 256;
        this.u = 256;
        if (bArr != null) {
            this.q = bArr;
        }
        this.r = bArr2;
        this.s = bArr3;
        this.t = bArr4;
        if (bArr4 != null) {
            if (bArr4.length >= 64) {
                i = 521;
            } else if (bArr4.length >= 48) {
                i = 384;
            }
            this.u = i;
        }
    }
}
