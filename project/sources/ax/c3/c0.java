package ax.c3;

import android.util.Base64;
import ax.u3.C3180B;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class c0 {
    private String a;

    public c0(ax.Q2.f fVar) {
        this.a = ax.Y2.a.a().c(fVar);
    }

    private String b(String str) {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(this.a.getBytes("UTF8")));
            byte[] decode = Base64.decode(str, 0);
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(2, generateSecret);
            return new String(cipher.doFinal(decode), "UTF8");
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private String c(String str, String str2) {
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBEwithSHA256AND256BITAES-CBC-BC");
            byte[] bArr = new byte[16];
            byte[] decode = Base64.decode(str2, 0);
            System.arraycopy(decode, 0, bArr, 0, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyFactory.generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 256, 256)).getEncoded(), "AES/CBC/PKCS5Padding");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(decode, 16, 16));
            return new String(cipher.doFinal(decode, 32, decode.length - 32), "UTF8");
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    private String d(String str, String str2) {
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBEwithSHA256AND256BITAES-CBC-BC");
            byte[] bArr = new byte[16];
            byte[] decode = Base64.decode(str2, 0);
            System.arraycopy(decode, 0, bArr, 0, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyFactory.generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 256, 256)).getEncoded(), "AES/GCM/NoPadding");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(decode, 16, 12));
            return new String(cipher.doFinal(decode, 28, decode.length - 28), "UTF8");
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public String a(int i, String str, String str2) {
        if (str2 == null) {
            return null;
        }
        return i == 3 ? d(str, str2) : i == 2 ? c(str, str2) : b(str2);
    }

    public String e(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBEwithSHA256AND256BITAES-CBC-BC");
            byte[] bArr = new byte[16];
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextBytes(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyFactory.generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 256, 256)).getEncoded(), "AES/GCM/NoPadding");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] bArr2 = new byte[12];
            secureRandom.nextBytes(bArr2);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            return Base64.encodeToString(C3180B.d(bArr, bArr2, cipher.doFinal(str2.getBytes("UTF8"))), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }
}
