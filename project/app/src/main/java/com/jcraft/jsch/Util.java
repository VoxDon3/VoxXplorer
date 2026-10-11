/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.HASH;
import com.jcraft.jsch.JSchException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Vector;

class Util {
    private static final byte[] a = Util.v("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=");
    private static String[] b = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    static final byte[] c = Util.v("");

    Util() {
    }

    static byte[] A(byte[] byArray) {
        int n8 = byArray.length;
        int n9 = 0;
        while (n9 < n8) {
            if (byArray[n9] == 92) {
                int n10 = n9 + 1;
                if (n10 == n8) break;
                System.arraycopy(byArray, n10, byArray, n9, byArray.length - n10);
                --n8;
                n9 = n10;
                continue;
            }
            ++n9;
        }
        if (n8 == byArray.length) {
            return byArray;
        }
        byte[] byArray2 = new byte[n8];
        System.arraycopy(byArray, 0, byArray2, 0, n8);
        return byArray2;
    }

    private static byte B(byte by) {
        byte[] byArray;
        if (by == 61) {
            return 0;
        }
        for (int i8 = 0; i8 < (byArray = a).length; ++i8) {
            if (by != byArray[i8]) continue;
            return (byte)i8;
        }
        return 0;
    }

    static boolean a(byte[] byArray, byte[] byArray2) {
        int n8 = byArray.length;
        if (n8 != byArray2.length) {
            return false;
        }
        for (int i8 = 0; i8 < n8; ++i8) {
            if (byArray[i8] == byArray2[i8]) continue;
            return false;
        }
        return true;
    }

    static boolean b(byte[] byArray, byte[] byArray2) {
        if (byArray.length != byArray2.length) {
            return false;
        }
        int n8 = 0;
        for (int i8 = 0; i8 < byArray.length; ++i8) {
            n8 |= byArray[i8] ^ byArray2[i8];
        }
        return n8 == 0;
    }

    static String c(byte[] byArray) {
        return Util.e(byArray, 0, byArray.length, StandardCharsets.UTF_8);
    }

    static String d(byte[] byArray, int n8, int n9) {
        return Util.e(byArray, n8, n9, StandardCharsets.UTF_8);
    }

    static String e(byte[] byArray, int n8, int n9, Charset charset) {
        return new String(byArray, n8, n9, charset);
    }

    static String f(byte[] byArray, Charset charset) {
        return Util.e(byArray, 0, byArray.length, charset);
    }

    static void g(byte[] byArray) {
        if (byArray != null) {
            for (int i8 = 0; i8 < byArray.length; ++i8) {
                byArray[i8] = 0;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static String h(String string) {
        String string2 = string;
        try {
            if (!string.startsWith("~")) return string2;
            return string.replace("~", System.getProperty("user.home"));
        }
        catch (SecurityException securityException) {
            return string;
        }
    }

    static Socket i(String string, int n8, int n9) throws JSchException {
        Socket socket = new Socket();
        try {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(string, n8);
            socket.connect(inetSocketAddress, n9);
            return socket;
        }
        catch (Exception exception) {
            try {
                socket.close();
            }
            catch (Exception exception2) {
                // empty catch block
            }
            string = exception instanceof SocketTimeoutException ? "timeout: socket is not established" : ((Object)exception).toString();
            throw new JSchException(string, exception);
        }
    }

    static String j(String string, String[] stringArray) {
        String[] stringArray2 = Util.u(string, ",");
        string = null;
        block0: for (int i8 = 0; i8 < stringArray2.length; ++i8) {
            for (int i9 = 0; i9 < stringArray.length; ++i9) {
                if (stringArray2[i8].equals(stringArray[i9])) continue block0;
            }
            if (string == null) {
                string = stringArray2[i8];
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(",");
            stringBuilder.append(stringArray2[i8]);
            string = stringBuilder.toString();
        }
        return string;
    }

    static byte[] k(byte[] byArray, int n8, int n9) throws JSchException {
        int n10;
        byte[] byArray2 = new byte[n9];
        int n11 = n8;
        int n12 = 0;
        while (true) {
            n10 = n12;
            if (n11 >= n8 + n9) break;
            int n13 = Util.B(byArray[n11]);
            n10 = n11 + 1;
            byArray2[n12] = (byte)(n13 << 2 | (Util.B(byArray[n10]) & 0x30) >>> 4);
            n13 = n11 + 2;
            if (byArray[n13] == 61) {
                n10 = n12 + 1;
                break;
            }
            byArray2[n12 + 1] = (byte)((Util.B(byArray[n10]) & 0xF) << 4 | (Util.B(byArray[n13]) & 0x3C) >>> 2);
            n10 = n11 + 3;
            if (byArray[n10] == 61) {
                n10 = n12 + 2;
                break;
            }
            byArray2[n12 + 2] = (byte)((Util.B(byArray[n13]) & 3) << 6 | Util.B(byArray[n10]) & 0x3F);
            n12 += 3;
            n11 += 4;
            continue;
            break;
        }
        try {
            byArray = new byte[n10];
            System.arraycopy(byArray2, 0, byArray, 0, n10);
            return byArray;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new JSchException("fromBase64: invalid base64 data", arrayIndexOutOfBoundsException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static byte[] l(String object) throws IOException {
        int n8;
        int n9;
        object = Util.h((String)object);
        Object object2 = new File((String)object);
        object = new FileInputStream((String)object);
        try {
            n9 = (int)((File)object2).length();
            object2 = new byte[n9];
            n8 = 0;
        }
        catch (Throwable throwable) {
            try {
                ((InputStream)object).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
            }
            throw throwable;
        }
        while (true) {
            int n10;
            if ((n10 = ((InputStream)object).read((byte[])object2, n8, n9 - n8)) <= 0) {
                ((InputStream)object).close();
                return object2;
            }
            n8 += n10;
        }
    }

    /*
     * Unable to fully structure code
     */
    static String m(HASH var0, byte[] var1_2, boolean var2_3, boolean var3_4) {
        block12: {
            block11: {
                block10: {
                    var0.e();
                    var4_5 = ((byte[])var1_2).length;
                    var5_6 = 0;
                    var0.b((byte[])var1_2, 0, var4_5);
                    var6_7 = var0.c();
                    var1_2 = new StringBuilder;
                    var1_2();
                    if (!var2_3) break block10;
                    var1_2.append(var0.a());
                    var1_2.append(":");
                }
                var4_5 = var5_6;
                if (var3_4) ** GOTO lbl29
                if (!var0.a().equals("MD5")) break block11;
                var4_5 = var5_6;
                ** GOTO lbl29
            }
            var0 = Util.x(var6_7, 0, var6_7.length, false);
            var1_2.append(Util.d((byte[])var0, 0, ((Object)var0).length));
            break block12;
lbl29:
            // 4 sources

            ** while (var4_5 < var6_7.length)
lbl-1000:
            // 1 sources

            {
                var5_6 = var6_7[var4_5];
                var1_2.append(Util.b[(var5_6 & 255) >>> 4 & 15]);
                var1_2.append(Util.b[var5_6 & 15]);
                var4_5 = var5_6 = var4_5 + 1;
                if (var5_6 >= var6_7.length) continue;
                var1_2.append(":");
                var4_5 = var5_6;
                continue;
            }
        }
        try {
            var0 = var1_2.toString();
            return var0;
        }
        catch (Exception var0_1) {
            return "???";
        }
    }

    static String n(String string) {
        try {
            string = System.getenv(string);
            return string;
        }
        catch (SecurityException securityException) {
            return null;
        }
    }

    static String o(String string) {
        try {
            string = System.getProperty(string);
            return string;
        }
        catch (SecurityException securityException) {
            return null;
        }
    }

    static String p(String string, String string2) {
        try {
            string = System.getProperty(string, string2);
            return string;
        }
        catch (SecurityException securityException) {
            return string2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean q(byte[] byArray, int n8, byte[] byArray2, int n9) {
        int n10;
        int n11;
        block35: {
            int n12;
            int n13;
            block30: {
                byte by;
                block31: {
                    block29: {
                        n11 = byArray.length;
                        if (n11 == 0) {
                            return false;
                        }
                        n13 = byArray2.length;
                        while (true) {
                            block34: {
                                block33: {
                                    block32: {
                                        n10 = n8;
                                        n12 = n9;
                                        if (n8 >= n11) break;
                                        n10 = n8;
                                        n12 = n9;
                                        if (n9 >= n13) break;
                                        by = byArray[n8];
                                        if (by != 92) break block32;
                                        if (++n8 == n11) {
                                            return false;
                                        }
                                        by = byArray[n8];
                                        if (by != byArray2[n9]) {
                                            return false;
                                        }
                                        n8 += Util.t(by);
                                        n10 = Util.t(byArray2[n9]);
                                        break block33;
                                    }
                                    if (by == 42) {
                                        while (n8 < n11 && byArray[n8] == 42) {
                                            ++n8;
                                        }
                                        if (n11 == n8) {
                                            return true;
                                        }
                                        n12 = byArray[n8];
                                        if (n12 == 63) break block29;
                                        n10 = n9;
                                        if (n12 != 92) break block30;
                                        if (++n8 == n11) {
                                            return false;
                                        }
                                        break block31;
                                    }
                                    if (by != 63) break block34;
                                    ++n8;
                                    n10 = Util.t(byArray2[n9]);
                                }
                                n9 += n10;
                                continue;
                            }
                            if (by != byArray2[n9]) {
                                return false;
                            }
                            n10 = n8 + Util.t(by);
                            n12 = n9 + Util.t(byArray2[n9]);
                            n8 = n10;
                            n9 = n12;
                            if (n12 < n13) continue;
                            if (n10 >= n11) {
                                return true;
                            }
                            n8 = n10;
                            n9 = n12;
                            if (byArray[n10] == 42) break;
                        }
                        if (n10 == n11 && n12 == n13) {
                            return true;
                        }
                        if (n12 < n13 || byArray[n10] != 42) {
                            return false;
                        }
                        break block35;
                    }
                    while (true) {
                        if (n9 >= n13) {
                            return false;
                        }
                        if (Util.q(byArray, n8, byArray2, n9)) {
                            return true;
                        }
                        n9 += Util.t(byArray2[n9]);
                    }
                }
                by = byArray[n8];
                while (true) {
                    if (n9 >= n13) {
                        return false;
                    }
                    if (by == byArray2[n9] && Util.q(byArray, Util.t(by) + n8, byArray2, Util.t(byArray2[n9]) + n9)) {
                        return true;
                    }
                    n9 += Util.t(byArray2[n9]);
                }
            }
            while (true) {
                if (n10 >= n13) {
                    return false;
                }
                if (n12 == byArray2[n10] && Util.q(byArray, n8, byArray2, n10)) {
                    return true;
                }
                n10 += Util.t(byArray2[n10]);
            }
        }
        while (n10 < n11) {
            if (byArray[n10] != 42) {
                return false;
            }
            ++n10;
        }
        return true;
    }

    static boolean r(byte[] byArray, byte[] byArray2) {
        return Util.s(byArray, 0, byArray2, 0);
    }

    private static boolean s(byte[] byArray, int n8, byte[] byArray2, int n9) {
        if (byArray2.length > 0 && byArray2[0] == 46) {
            if (byArray.length > 0 && byArray[0] == 46) {
                if (byArray.length == 2 && byArray[1] == 42) {
                    return true;
                }
                return Util.q(byArray, n8 + 1, byArray2, n9 + 1);
            }
            return false;
        }
        return Util.q(byArray, n8, byArray2, n9);
    }

    private static int t(byte by) {
        if ((byte)(by & 0x80) == 0) {
            return 1;
        }
        if ((byte)(by & 0xE0) == -64) {
            return 2;
        }
        if ((byte)(by & 0xF0) == -32) {
            return 3;
        }
        return 1;
    }

    static String[] u(String stringArray, String string) {
        int n8;
        if (stringArray == null) {
            return null;
        }
        byte[] byArray = Util.v((String)stringArray);
        Vector<String> vector = new Vector<String>();
        int n9 = 0;
        int n10 = 0;
        while ((n8 = stringArray.indexOf(string, n10)) >= 0) {
            vector.addElement(Util.d(byArray, n10, n8 - n10));
            n10 = n8 + 1;
        }
        vector.addElement(Util.d(byArray, n10, byArray.length - n10));
        n8 = vector.size();
        stringArray = new String[n8];
        for (n10 = n9; n10 < n8; ++n10) {
            stringArray[n10] = (String)vector.elementAt(n10);
        }
        return stringArray;
    }

    static byte[] v(String string) {
        return Util.w(string, StandardCharsets.UTF_8);
    }

    static byte[] w(String string, Charset charset) {
        if (string == null) {
            return null;
        }
        return string.getBytes(charset);
    }

    static byte[] x(byte[] byArray, int n8, int n9, boolean bl) {
        byte[] byArray2;
        int n10;
        byte[] byArray3 = new byte[n9 * 2];
        int n11 = n9 / 3 * 3 + n8;
        int n12 = 0;
        for (n10 = n8; n10 < n11; n10 += 3) {
            int n13 = byArray[n10];
            byArray2 = a;
            byArray3[n12] = byArray2[n13 >>> 2 & 0x3F];
            n13 = byArray[n10];
            int n14 = n10 + 1;
            byArray3[n12 + 1] = byArray2[(n13 & 3) << 4 | byArray[n14] >>> 4 & 0xF];
            n13 = byArray[n14];
            n14 = n10 + 2;
            byArray3[n12 + 2] = byArray2[(n13 & 0xF) << 2 | byArray[n14] >>> 6 & 3];
            n14 = byArray[n14];
            n13 = n12 + 4;
            byArray3[n12 + 3] = byArray2[n14 & 0x3F];
            n12 = n13;
        }
        if ((n9 = n8 + n9 - n11) == 1) {
            n8 = byArray[n10];
            byArray2 = a;
            byArray3[n12] = byArray2[n8 >>> 2 & 0x3F];
            n8 = byArray[n10];
            n9 = n12 + 2;
            byArray3[n12 + 1] = byArray2[(n8 & 3) << 4 & 0x3F];
            n8 = n9;
            if (bl) {
                byArray3[n9] = 61;
                n8 = n12 + 4;
                byArray3[n12 + 3] = 61;
            }
        } else {
            n8 = n12;
            if (n9 == 2) {
                n8 = byArray[n10];
                byArray2 = a;
                byArray3[n12] = byArray2[n8 >>> 2 & 0x3F];
                n8 = byArray[n10];
                n9 = n10 + 1;
                byArray3[n12 + 1] = byArray2[(n8 & 3) << 4 | byArray[n9] >>> 4 & 0xF];
                n8 = byArray[n9];
                n9 = n12 + 3;
                byArray3[n12 + 2] = byArray2[(n8 & 0xF) << 2 & 0x3F];
                n8 = n9;
                if (bl) {
                    n8 = n12 + 4;
                    byArray3[n9] = 61;
                }
            }
        }
        byArray = new byte[n8];
        System.arraycopy(byArray3, 0, byArray, 0, n8);
        return byArray;
    }

    static String y(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int n8 = 0;
        while (n8 < byArray.length) {
            int n9;
            String string = Integer.toHexString(byArray[n8] & 0xFF);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("0x");
            String string2 = string.length() == 1 ? "0" : "";
            stringBuilder2.append(string2);
            stringBuilder2.append(string);
            stringBuilder.append(stringBuilder2.toString());
            n8 = n9 = n8 + 1;
            if (n9 >= byArray.length) continue;
            stringBuilder.append(":");
            n8 = n9;
        }
        return stringBuilder.toString();
    }

    static String z(String string) {
        byte[] byArray;
        byte[] byArray2 = Util.v(string);
        if (byArray2.length == (byArray = Util.A(byArray2)).length) {
            return string;
        }
        return Util.c(byArray);
    }
}

