/*
 * Decompiled with CFR 0.152.
 */
package ax.Nd;

import ax.Od.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;

public final class j {
    private static String a;

    static {
        try {
            PrivilegedAction<String> privilegedAction = new PrivilegedAction<String>(){

                public String a() {
                    return System.getProperty("line.separator");
                }
            };
            a = AccessController.doPrivileged(privilegedAction);
        }
        catch (Exception exception) {
            try {
                a = String.format("%n", new Object[0]);
            }
            catch (Exception exception2) {
                a = "\n";
            }
        }
    }

    public static char[] a(byte[] byArray) {
        int n8 = byArray.length;
        char[] cArray = new char[n8];
        for (int i8 = 0; i8 != n8; ++i8) {
            cArray[i8] = (char)(byArray[i8] & 0xFF);
        }
        return cArray;
    }

    public static String b(byte[] byArray) {
        return new String(j.a(byArray));
    }

    public static String c(byte[] byArray) {
        char[] cArray = new char[byArray.length];
        int n8 = e.b(byArray, cArray);
        if (n8 >= 0) {
            return new String(cArray, 0, n8);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static String d() {
        return a;
    }

    public static byte[] e(String string) {
        int n8 = string.length();
        byte[] byArray = new byte[n8];
        for (int i8 = 0; i8 != n8; ++i8) {
            byArray[i8] = (byte)string.charAt(i8);
        }
        return byArray;
    }

    public static String f(String string) {
        char[] cArray = string.toCharArray();
        boolean bl = false;
        for (int i8 = 0; i8 != cArray.length; ++i8) {
            char c8 = cArray[i8];
            boolean bl2 = bl;
            if ('A' <= c8) {
                bl2 = bl;
                if ('Z' >= c8) {
                    cArray[i8] = (char)(c8 + 32);
                    bl2 = true;
                }
            }
            bl = bl2;
        }
        if (bl) {
            string = new String(cArray);
        }
        return string;
    }

    /*
     * Unable to fully structure code
     */
    public static void g(char[] var0, OutputStream var1_1) throws IOException {
        for (var2_2 = 0; var2_2 < var0.length; ++var2_2) {
            block4: {
                block5: {
                    var3_3 = var0[var2_2];
                    if (var3_3 < 128) break block4;
                    if (var3_3 >= 2048) break block5;
                    var4_4 = var3_3 >> 6 | 192;
lbl6:
                    // 2 sources

                    while (true) {
                        var1_1.write(var4_4);
                        ** GOTO lbl18
                        break;
                    }
                }
                if (var3_3 < 55296 || var3_3 > 57343) ** GOTO lbl22
                if (++var2_2 >= var0.length) ** GOTO lbl21
                var4_4 = var0[var2_2];
                if (var3_3 <= 56319) {
                    var3_3 = ((var3_3 & 1023) << 10 | var4_4 & 1023) + 65536;
                    var1_1.write(var3_3 >> 18 | 240);
                    var1_1.write(var3_3 >> 12 & 63 | 128);
                    var1_1.write(var3_3 >> 6 & 63 | 128);
lbl18:
                    // 2 sources

                    var3_3 = var3_3 & 63 | 128;
                } else {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
lbl21:
                    // 1 sources

                    throw new IllegalStateException("invalid UTF-16 codepoint");
lbl22:
                    // 1 sources

                    var1_1.write(var3_3 >> 12 | 224);
                    var4_4 = var3_3 >> 6 & 63 | 128;
                    ** continue;
                }
            }
            var1_1.write(var3_3);
        }
    }

    public static byte[] h(String string) {
        return j.i(string.toCharArray());
    }

    public static byte[] i(char[] cArray) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            j.g(cArray, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String j(String string) {
        char[] cArray = string.toCharArray();
        boolean bl = false;
        for (int i8 = 0; i8 != cArray.length; ++i8) {
            char c8 = cArray[i8];
            boolean bl2 = bl;
            if ('a' <= c8) {
                bl2 = bl;
                if ('z' >= c8) {
                    cArray[i8] = (char)(c8 - 32);
                    bl2 = true;
                }
            }
            bl = bl2;
        }
        if (bl) {
            string = new String(cArray);
        }
        return string;
    }
}

