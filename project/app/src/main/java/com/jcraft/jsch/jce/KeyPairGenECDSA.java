/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.jce.Util;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

public class KeyPairGenECDSA
implements com.jcraft.jsch.KeyPairGenECDSA {
    byte[] a;
    byte[] b;
    byte[] c;
    ECPublicKey d;
    ECPrivateKey e;
    ECParameterSpec f;

    private byte[] f(byte[] byArray) {
        byte[] byArray2 = new byte[byArray.length + 1];
        System.arraycopy(byArray, 0, byArray2, 1, byArray.length);
        Util.a(byArray);
        return byArray2;
    }

    ECPrivateKey a() {
        return this.e;
    }

    ECPublicKey b() {
        return this.d;
    }

    public byte[] c() {
        return this.b;
    }

    public byte[] d() {
        return this.c;
    }

    public void e(int n8) throws Exception {
        block8: {
            Object object;
            block6: {
                block7: {
                    block5: {
                        if (n8 != 256) break block5;
                        object = "secp256r1";
                        break block6;
                    }
                    if (n8 != 384) break block7;
                    object = "secp384r1";
                    break block6;
                }
                if (n8 != 521) break block8;
                object = "secp521r1";
            }
            for (int i8 = 0; i8 < 1000; ++i8) {
                Object object2 = KeyPairGenerator.getInstance("EC");
                ((KeyPairGenerator)object2).initialize(new ECGenParameterSpec((String)object));
                object2 = ((KeyPairGenerator)object2).genKeyPair();
                this.e = (ECPrivateKey)((KeyPair)object2).getPrivate();
                this.d = object2 = (ECPublicKey)((KeyPair)object2).getPublic();
                this.f = object2.getParams();
                this.a = this.e.getS().toByteArray();
                object2 = this.d.getW();
                this.b = ((ECPoint)object2).getAffineX().toByteArray();
                object2 = ((ECPoint)object2).getAffineY().toByteArray();
                this.c = (byte[])object2;
                byte[] byArray = this.b;
                if (byArray.length == ((Object)object2).length && (n8 == 256 && byArray.length == 32 || n8 == 384 && byArray.length == 48 || n8 == 521 && byArray.length == 66)) break;
            }
            if (((Object)(object = (Object)this.a)).length < this.b.length) {
                this.a = this.f((byte[])object);
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unsupported key size: ");
        stringBuilder.append(n8);
        throw new JSchException(stringBuilder.toString());
    }
}

