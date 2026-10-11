/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import ax.u3.c;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class d {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a(InputStream inputStream, c object) throws IOException {
        Throwable throwable2;
        block25: {
            MessageDigest messageDigest;
            MessageDigest messageDigest2;
            MessageDigest messageDigest3;
            a a8;
            block24: {
                Object object2;
                a8 = new a();
                messageDigest3 = null;
                try {
                    messageDigest2 = MessageDigest.getInstance("MD5");
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    messageDigest2 = null;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    messageDigest = null;
                }
                try {
                    object2 = MessageDigest.getInstance("SHA256");
                    messageDigest3 = object2;
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
                object2 = new byte[8192];
                int n8 = 0;
                do {
                    int n9;
                    block23: {
                        try {
                            while ((n9 = inputStream.read((byte[])object2)) >= 0) {
                                if (n9 != 0) break block23;
                                try {
                                    Thread.sleep(5L);
                                }
                                catch (InterruptedException interruptedException) {
                                    // empty catch block
                                }
                                if (n8 <= 1000) {
                                    ++n8;
                                    continue;
                                }
                                object = new IOException("Read erro : too many read zero");
                                throw object;
                            }
                            break block24;
                        }
                        catch (Throwable throwable2) {
                            break block25;
                        }
                    }
                    if (messageDigest2 != null) {
                        messageDigest2.update((byte[])object2, 0, n9);
                    }
                    if (messageDigest != null) {
                        messageDigest.update((byte[])object2, 0, n9);
                    }
                    if (messageDigest3 == null) continue;
                    messageDigest3.update((byte[])object2, 0, n9);
                } while (object == null || !object.isCancelled());
                object = new IOException("cancelled");
                throw object;
            }
            if (messageDigest2 != null) {
                a8.a = d.c(messageDigest2);
            }
            if (messageDigest != null) {
                a8.b = d.c(messageDigest);
            }
            if (messageDigest3 != null) {
                a8.c = d.c(messageDigest3);
            }
            try {
                inputStream.close();
                return a8;
            }
            catch (IOException iOException) {
                return a8;
            }
        }
        try {
            inputStream.close();
        }
        catch (IOException iOException) {
            throw throwable2;
        }
        throw throwable2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String b(InputStream var0, long var1_4, c var3_5) throws IOException {
        block21: {
            block22: {
                try {
                    var8_7 = MessageDigest.getInstance("MD5");
                }
                catch (NoSuchAlgorithmException var8_8) {
                    var8_7 = null;
                }
                var9_9 = new byte[8192];
                var4_10 = 0;
                do {
                    block19: {
                        block20: {
                            if (var3_5 == null) ** GOTO lbl14
                            if (var3_5.isCancelled()) {
                                var3_5 = new IOException("cancelled");
                                throw var3_5;
                            }
lbl14:
                            // 3 sources

                            if ((var5_11 = var0.read(var9_9, 0, (int)Math.min(8192L, var1_4))) < 0) break;
                            if (var5_11 == 0) {
                                try {
                                    Thread.sleep(5L);
                                }
                                catch (InterruptedException var10_13) {
                                    // empty catch block
                                }
                                if (var4_10 <= 1000) {
                                    ++var4_10;
                                    var6_12 = var1_4;
                                    break block19;
                                } else {
                                    var3_5 = new IOException("Read erro : too many read zero");
                                    throw var3_5;
                                }
                            }
                            if (var8_7 == null) break block20;
                            var8_7.update(var9_9, 0, var5_11);
                        }
                        var6_12 = var1_4 - (long)var5_11;
                    }
                    var1_4 = var6_12;
                } while (var6_12 > 0L);
                if (var8_7 == null) break block22;
                try {
                    var3_5 = d.c(var8_7);
                }
                catch (Throwable var3_6) {
                    break block21;
                }
                try {
                    var0.close();
                    return var3_5;
                }
                catch (IOException var0_1) {
                    return var3_5;
                }
            }
            try {
                var0.close();
                return null;
            }
            catch (IOException var0_2) {
                return null;
            }
        }
        try {
            var0.close();
        }
        catch (IOException var0_3) {
            throw var3_6;
        }
        throw var3_6;
    }

    private static String c(MessageDigest object) {
        Object object2 = ((MessageDigest)object).digest();
        object = new BigInteger(1, (byte[])object2).toString(16);
        int n8 = ((byte[])object2).length;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("%");
        ((StringBuilder)object2).append(n8 * 2);
        ((StringBuilder)object2).append("s");
        return String.format(((StringBuilder)object2).toString(), object).replace(' ', '0');
    }

    public static class a {
        public String a;
        public String b;
        public String c;
    }
}

