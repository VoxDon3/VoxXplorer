/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.ECDH;
import com.jcraft.jsch.jce.KeyPairGenECDSA;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;

public class ECDHN
implements ECDH {
    private static BigInteger d;
    private static BigInteger e;
    byte[] a;
    ECPublicKey b;
    private KeyAgreement c;

    static {
        BigInteger bigInteger;
        BigInteger bigInteger2 = BigInteger.ONE;
        d = bigInteger = bigInteger2.add(bigInteger2);
        e = bigInteger.add(bigInteger2);
    }

    private byte[] e(byte[] byArray, byte[] byArray2) {
        byte[] byArray3 = new byte[byArray.length + 1 + byArray2.length];
        byArray3[0] = 4;
        System.arraycopy(byArray, 0, byArray3, 1, byArray.length);
        System.arraycopy(byArray2, 0, byArray3, byArray.length + 1, byArray2.length);
        return byArray3;
    }

    @Override
    public byte[] a() throws Exception {
        return this.a;
    }

    @Override
    public void b(int n8) throws Exception {
        this.c = KeyAgreement.getInstance("ECDH");
        KeyPairGenECDSA keyPairGenECDSA = new KeyPairGenECDSA();
        keyPairGenECDSA.e(n8);
        this.b = keyPairGenECDSA.b();
        this.a = this.e(keyPairGenECDSA.c(), keyPairGenECDSA.d());
        this.c.init(keyPairGenECDSA.a());
    }

    @Override
    public byte[] c(byte[] object, byte[] byArray) throws Exception {
        object = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, (byte[])object), new BigInteger(1, byArray)), this.b.getParams()));
        this.c.doPhase((Key)object, true);
        return this.c.generateSecret();
    }

    @Override
    public boolean d(byte[] object, byte[] object2) throws Exception {
        BigInteger bigInteger = new BigInteger(1, (byte[])object);
        if (new ECPoint(bigInteger, (BigInteger)(object2 = (Object)new BigInteger(1, (byte[])object2))).equals(ECPoint.POINT_INFINITY)) {
            return false;
        }
        EllipticCurve ellipticCurve = this.b.getParams().getCurve();
        object = ((ECFieldFp)ellipticCurve.getField()).getP();
        BigInteger bigInteger2 = ((BigInteger)object).subtract(BigInteger.ONE);
        if (bigInteger.compareTo(bigInteger2) <= 0 && ((BigInteger)object2).compareTo(bigInteger2) <= 0) {
            bigInteger = bigInteger.multiply(ellipticCurve.getA()).add(ellipticCurve.getB()).add(bigInteger.modPow(e, (BigInteger)object)).mod((BigInteger)object);
            return ((BigInteger)object2).modPow(d, (BigInteger)object).equals(bigInteger);
        }
        return false;
    }
}

