/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.Buffer;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.KeySpec;

public class SignatureDSA
implements com.jcraft.jsch.SignatureDSA {
    Signature a;
    KeyFactory b;

    @Override
    public void c(byte[] object, byte[] byArray, byte[] byArray2, byte[] byArray3) throws Exception {
        object = new DSAPrivateKeySpec(new BigInteger((byte[])object), new BigInteger(byArray), new BigInteger(byArray2), new BigInteger(byArray3));
        object = this.b.generatePrivate((KeySpec)object);
        this.a.initSign((PrivateKey)object);
    }

    @Override
    public boolean d(byte[] byArray) throws Exception {
        byte by;
        int n8;
        int n9;
        Object object = new Buffer(byArray);
        byte[] byArray2 = byArray;
        if (new String(((Buffer)object).p(), StandardCharsets.UTF_8).equals("ssh-dss")) {
            n9 = ((Buffer)object).i();
            n8 = ((Buffer)object).n();
            byArray2 = new byte[n9];
            System.arraycopy(byArray, n8, byArray2, 0, n9);
        }
        byArray = new byte[20];
        System.arraycopy(byArray2, 0, byArray, 0, 20);
        byArray = this.k(byArray);
        object = new byte[20];
        System.arraycopy(byArray2, 20, object, 0, 20);
        object = this.k((byte[])object);
        n9 = (byArray[0] & 0x80) != 0 ? 1 : 0;
        n8 = (object[0] & 0x80) != 0 ? 1 : 0;
        byArray2 = new byte[byArray.length + ((Object)object).length + 6 + n9 + n8];
        byArray2[0] = 48;
        byArray2[1] = by = (byte)(byArray.length + ((Object)object).length + 4);
        byte by2 = (byte)n9;
        byArray2[1] = by = (byte)(by + by2);
        byte by3 = (byte)n8;
        byArray2[1] = (byte)(by + by3);
        byArray2[2] = 2;
        byArray2[3] = by = (byte)byArray.length;
        byArray2[3] = (byte)(by + by2);
        System.arraycopy(byArray, 0, byArray2, n9 + 4, byArray.length);
        byArray2[byArray2[3] + 4] = 2;
        byArray2[byArray2[3] + 5] = (byte)((Object)object).length;
        n9 = byArray2[3] + 5;
        byArray2[n9] = (byte)(byArray2[n9] + by3);
        System.arraycopy(object, 0, byArray2, byArray2[3] + 6 + n8, ((Object)object).length);
        return this.a.verify(byArray2);
    }

    @Override
    public void e() throws Exception {
        this.a = Signature.getInstance("SHA1withDSA");
        this.b = KeyFactory.getInstance("DSA");
    }

    @Override
    public void f(byte[] byArray) throws Exception {
        this.a.update(byArray);
    }

    @Override
    public void h(byte[] object, byte[] byArray, byte[] byArray2, byte[] byArray3) throws Exception {
        object = new DSAPublicKeySpec(new BigInteger((byte[])object), new BigInteger(byArray), new BigInteger(byArray2), new BigInteger(byArray3));
        object = this.b.generatePublic((KeySpec)object);
        this.a.initVerify((PublicKey)object);
    }

    @Override
    public byte[] j() throws Exception {
        byte[] byArray = this.a.sign();
        int n8 = byArray[3] & 0xFF;
        byte[] byArray2 = new byte[n8];
        int n9 = 0;
        System.arraycopy(byArray, 4, byArray2, 0, n8);
        int n10 = byArray[n8 + 5] & 0xFF;
        byte[] byArray3 = new byte[n10];
        System.arraycopy(byArray, n8 + 6, byArray3, 0, n10);
        byArray = new byte[40];
        int n11 = n8 > 20 ? 1 : 0;
        int n12 = n8 > 20 ? 0 : 20 - n8;
        int n13 = n8;
        if (n8 > 20) {
            n13 = 20;
        }
        System.arraycopy(byArray2, n11, byArray, n12, n13);
        n11 = n9;
        if (n10 > 20) {
            n11 = 1;
        }
        n12 = n10 > 20 ? 20 : 40 - n10;
        n13 = n10;
        if (n10 > 20) {
            n13 = 20;
        }
        System.arraycopy(byArray3, n11, byArray, n12, n13);
        return byArray;
    }

    protected byte[] k(byte[] byArray) {
        byte[] byArray2 = byArray;
        if (byArray.length > 1) {
            byArray2 = byArray;
            if (byArray[0] == 0) {
                byArray2 = byArray;
                if ((byArray[1] & 0x80) == 0) {
                    int n8 = byArray.length - 1;
                    byArray2 = new byte[n8];
                    System.arraycopy(byArray, 1, byArray2, 0, n8);
                    byArray2 = this.k(byArray2);
                }
            }
        }
        return byArray2;
    }
}

