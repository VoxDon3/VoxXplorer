/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.util.Base64;
import ax.Q2.f;
import ax.Y2.a;
import ax.u3.B;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class c0 {
    private String a;

    public c0(f f8) {
        this.a = ax.Y2.a.a().c(f8);
    }

    private String b(String string) {
        try {
            Object object = new DESedeKeySpec(this.a.getBytes("UTF8"));
            SecretKey secretKey = SecretKeyFactory.getInstance("DESede").generateSecret((KeySpec)object);
            byte[] byArray = Base64.decode((String)string, (int)0);
            object = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            ((Cipher)object).init(2, secretKey);
            object = new String(((Cipher)object).doFinal(byArray), "UTF8");
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return string;
        }
    }

    private String c(String object, String string) {
        try {
            Object object2 = SecretKeyFactory.getInstance("PBEwithSHA256AND256BITAES-CBC-BC");
            Object object3 = new byte[16];
            byte[] byArray = Base64.decode((String)string, (int)0);
            System.arraycopy(byArray, 0, object3, 0, 16);
            PBEKeySpec pBEKeySpec = new PBEKeySpec(((String)object).toCharArray(), (byte[])object3, 256, 256);
            object3 = ((SecretKeyFactory)object2).generateSecret(pBEKeySpec).getEncoded();
            object = new SecretKeySpec((byte[])object3, "AES/CBC/PKCS5Padding");
            object3 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            object2 = new IvParameterSpec(byArray, 16, 16);
            ((Cipher)object3).init(2, (Key)object, (AlgorithmParameterSpec)object2);
            object = new String(((Cipher)object3).doFinal(byArray, 32, byArray.length - 32), "UTF8");
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return string;
        }
    }

    private String d(String object, String string) {
        try {
            Object object2 = SecretKeyFactory.getInstance("PBEwithSHA256AND256BITAES-CBC-BC");
            Object object3 = new byte[16];
            byte[] byArray = Base64.decode((String)string, (int)0);
            System.arraycopy(byArray, 0, object3, 0, 16);
            PBEKeySpec pBEKeySpec = new PBEKeySpec(((String)object).toCharArray(), (byte[])object3, 256, 256);
            object3 = ((SecretKeyFactory)object2).generateSecret(pBEKeySpec).getEncoded();
            object = new SecretKeySpec((byte[])object3, "AES/GCM/NoPadding");
            object2 = Cipher.getInstance("AES/GCM/NoPadding");
            object3 = new IvParameterSpec;
            object3(byArray, 16, 12);
            ((Cipher)object2).init(2, (Key)object, (AlgorithmParameterSpec)object3);
            object = new String(((Cipher)object2).doFinal(byArray, 28, byArray.length - 28), "UTF8");
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return string;
        }
    }

    public String a(int n8, String string, String string2) {
        if (string2 == null) {
            return null;
        }
        if (n8 == 3) {
            return this.d(string, string2);
        }
        if (n8 == 2) {
            return this.c(string, string2);
        }
        return this.b(string2);
    }

    public String e(String object, String string) {
        if (string == null) {
            return null;
        }
        try {
            Object object2 = SecretKeyFactory.getInstance("PBEwithSHA256AND256BITAES-CBC-BC");
            byte[] byArray = new byte[16];
            Object object3 = new SecureRandom();
            ((SecureRandom)object3).nextBytes(byArray);
            Object object4 = new PBEKeySpec(((String)object).toCharArray(), byArray, 256, 256);
            object4 = ((SecretKeyFactory)object2).generateSecret((KeySpec)object4).getEncoded();
            object = new SecretKeySpec((byte[])object4, "AES/GCM/NoPadding");
            object2 = Cipher.getInstance("AES/GCM/NoPadding");
            object4 = new byte[12];
            ((SecureRandom)object3).nextBytes((byte[])object4);
            object3 = new IvParameterSpec((byte[])object4);
            ((Cipher)object2).init(1, (Key)object, (AlgorithmParameterSpec)object3);
            object = Base64.encodeToString((byte[])B.d(byArray, (byte[])object4, ((Cipher)object2).doFinal(string.getBytes("UTF8"))), (int)0);
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return string;
        }
    }
}

