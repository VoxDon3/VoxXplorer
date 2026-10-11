/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.SignatureECDSA;
import com.jcraft.jsch.jce.Util;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;

abstract class SignatureECDSAN
implements SignatureECDSA {
    Signature a;
    KeyFactory b;

    SignatureECDSAN() {
    }

    private static byte[] k(byte[] byArray) {
        if (byArray[0] != 0) {
            return byArray;
        }
        int n8 = byArray.length - 1;
        byte[] byArray2 = new byte[n8];
        System.arraycopy(byArray, 1, byArray2, 0, n8);
        Util.a(byArray);
        return byArray2;
    }

    private static byte[] m(byte[] byArray) {
        if ((byArray[0] & 0x80) == 0) {
            return byArray;
        }
        byte[] byArray2 = new byte[byArray.length + 1];
        System.arraycopy(byArray, 0, byArray2, 1, byArray.length);
        Util.a(byArray);
        return byArray2;
    }

    private static byte[] n(byte[] byArray) {
        int n8;
        int n9;
        block4: {
            block3: {
                if (byArray.length < 2) break block3;
                n9 = 0;
                while (n9 < byArray.length - 1 && byArray[n9] == 0 && (byArray[n8 = n9 + 1] & 0x80) == 0) {
                    n9 = n8;
                }
                if (n9 != 0) break block4;
            }
            return byArray;
        }
        n8 = byArray.length - n9;
        byte[] byArray2 = new byte[n8];
        System.arraycopy(byArray, n9, byArray2, 0, n8);
        Util.a(byArray);
        return byArray2;
    }

    @Override
    public void a(byte[] object) throws Exception {
        Object object2 = SignatureECDSAN.m((byte[])object);
        object = ((byte[])object2).length >= 64 ? (Object)"secp521r1" : (((byte[])object2).length >= 48 ? (Object)"secp384r1" : (Object)"secp256r1");
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec((String)object));
        object = algorithmParameters.getParameterSpec(ECParameterSpec.class);
        object2 = new BigInteger(1, (byte[])object2);
        object = this.b.generatePrivate(new ECPrivateKeySpec((BigInteger)object2, (ECParameterSpec)object));
        this.a.initSign((PrivateKey)object);
    }

    @Override
    public void b(byte[] object, byte[] object2) throws Exception {
        byte[] byArray = SignatureECDSAN.m((byte[])object);
        object2 = SignatureECDSAN.m(object2);
        object = byArray.length >= 64 ? (Object)"secp521r1" : (byArray.length >= 48 ? (Object)"secp384r1" : (Object)"secp256r1");
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec((String)object));
        object = algorithmParameters.getParameterSpec(ECParameterSpec.class);
        object2 = new ECPoint(new BigInteger(1, byArray), new BigInteger(1, (byte[])object2));
        object = this.b.generatePublic(new ECPublicKeySpec((ECPoint)object2, (ECParameterSpec)object));
        this.a.initVerify((PublicKey)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean d(byte[] byArray) throws Exception {
        Object object;
        if (byArray[0] == 48) {
            byte by = byArray[1];
            object = byArray;
            if (by + 2 == byArray.length) return this.a.verify((byte[])object);
            if ((by & 0x80) != 0) {
                object = byArray;
                if ((byArray[2] & 0xFF) + 3 == byArray.length) return this.a.verify((byte[])object);
            }
        }
        object = new Buffer(byArray);
        ((Buffer)object).p();
        ((Buffer)object).i();
        byArray = ((Buffer)object).l();
        byte[] byArray2 = ((Buffer)object).l();
        object = SignatureECDSAN.n(SignatureECDSAN.m(byArray));
        byArray2 = SignatureECDSAN.n(SignatureECDSAN.m(byArray2));
        if (((Object)object).length < 64) {
            byArray = new byte[((Object)object).length + 6 + byArray2.length];
            byArray[0] = 48;
            byArray[1] = (byte)(((Object)object).length + 4 + byArray2.length);
            byArray[2] = 2;
            byArray[3] = (byte)((Object)object).length;
            System.arraycopy(object, 0, byArray, 4, ((Object)object).length);
            byArray[((Object)object).length + 4] = 2;
            byArray[((Object)object).length + 5] = (byte)byArray2.length;
            System.arraycopy(byArray2, 0, byArray, ((Object)object).length + 6, byArray2.length);
        } else {
            byArray = new byte[((Object)object).length + 6 + byArray2.length + 1];
            byArray[0] = 48;
            byArray[1] = -127;
            byArray[2] = (byte)(((Object)object).length + 4 + byArray2.length);
            byArray[3] = 2;
            byArray[4] = (byte)((Object)object).length;
            System.arraycopy(object, 0, byArray, 5, ((Object)object).length);
            byArray[((Object)object).length + 5] = 2;
            byArray[((Object)object).length + 6] = (byte)byArray2.length;
            System.arraycopy(byArray2, 0, byArray, ((Object)object).length + 7, byArray2.length);
        }
        object = byArray;
        return this.a.verify((byte[])object);
    }

    @Override
    public void e() throws Exception {
        String string = this.l();
        string = string.equals("ecdsa-sha2-nistp384") ? "SHA384withECDSA" : (string.equals("ecdsa-sha2-nistp521") ? "SHA512withECDSA" : "SHA256withECDSA");
        this.a = Signature.getInstance(string);
        this.b = KeyFactory.getInstance("EC");
    }

    @Override
    public void f(byte[] byArray) throws Exception {
        this.a.update(byArray);
    }

    @Override
    public byte[] j() throws Exception {
        byte[] byArray;
        block5: {
            int n8;
            int n9;
            byte by;
            byte[] byArray2;
            block6: {
                byArray = byArray2 = this.a.sign();
                if (byArray2[0] != 48) break block5;
                by = byArray2[1];
                n9 = byArray2.length;
                n8 = 3;
                if (by + 2 == n9) break block6;
                byArray = byArray2;
                if ((by & 0x80) == 0) break block5;
                byArray = byArray2;
                if ((byArray2[2] & 0xFF) + 3 != byArray2.length) break block5;
            }
            n9 = n8;
            if ((by & 0x80) != 0) {
                n9 = n8;
                if ((byArray2[2] & 0xFF) + 3 == byArray2.length) {
                    n9 = 4;
                }
            }
            by = byArray2[n9];
            Object object = new byte[by];
            n8 = byArray2[n9 + 2 + by];
            byArray = new byte[n8];
            System.arraycopy(byArray2, n9 + 1, object, 0, by);
            System.arraycopy(byArray2, n9 + 3 + byArray2[n9], byArray, 0, n8);
            byArray2 = SignatureECDSAN.k((byte[])object);
            byArray = SignatureECDSAN.k(byArray);
            object = new Buffer();
            ((Buffer)object).x(byArray2);
            ((Buffer)object).x(byArray);
            byArray = new byte[((Buffer)object).j()];
            ((Buffer)object).C(0);
            ((Buffer)object).e(byArray);
        }
        return byArray;
    }

    abstract String l();
}

