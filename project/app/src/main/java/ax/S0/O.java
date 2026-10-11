/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.net.Uri;
import android.text.TextUtils;

public final class O {
    private static int[] a(String string) {
        int n8;
        int n9;
        int n10;
        int n11;
        int[] nArray;
        block19: {
            block17: {
                block18: {
                    int n12;
                    block16: {
                        block15: {
                            block14: {
                                block13: {
                                    nArray = new int[4];
                                    if (TextUtils.isEmpty((CharSequence)string)) {
                                        nArray[0] = -1;
                                        return nArray;
                                    }
                                    n11 = string.length();
                                    n10 = string.indexOf(35);
                                    if (n10 != -1) {
                                        n11 = n10;
                                    }
                                    n9 = string.indexOf(63);
                                    if (n9 == -1) break block13;
                                    n10 = n9;
                                    if (n9 <= n11) break block14;
                                }
                                n10 = n11;
                            }
                            if ((n8 = string.indexOf(47)) == -1) break block15;
                            n9 = n8;
                            if (n8 <= n10) break block16;
                        }
                        n9 = n10;
                    }
                    n8 = n12 = string.indexOf(58);
                    if (n12 > n9) {
                        n8 = -1;
                    }
                    if ((n9 = n8 + 2) >= n10 || string.charAt(n8 + 1) != '/' || string.charAt(n9) != '/') break block17;
                    n12 = string.indexOf(47, n8 + 3);
                    if (n12 == -1) break block18;
                    n9 = n12;
                    if (n12 <= n10) break block19;
                }
                n9 = n10;
                break block19;
            }
            n9 = n8 + 1;
        }
        nArray[0] = n8;
        nArray[1] = n9;
        nArray[2] = n10;
        nArray[3] = n11;
        return nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String b(StringBuilder stringBuilder, int n8, int n9) {
        if (n8 >= n9) {
            return stringBuilder.toString();
        }
        int n10 = n8;
        if (stringBuilder.charAt(n8) == '/') {
            n10 = n8 + 1;
        }
        int n11 = n8 = n10;
        while (true) {
            block13: {
                int n12;
                block12: {
                    block11: {
                        if (n8 > n9) {
                            return stringBuilder.toString();
                        }
                        if (n8 != n9) break block11;
                        n12 = n8;
                        break block12;
                    }
                    if (stringBuilder.charAt(n8) != '/') break block13;
                    n12 = n8 + 1;
                }
                int n13 = n11 + 1;
                if (n8 == n13 && stringBuilder.charAt(n11) == '.') {
                    stringBuilder.delete(n11, n12);
                    n12 = n9 - (n12 - n11);
                    n9 = n11;
                } else {
                    if (n8 == n11 + 2 && stringBuilder.charAt(n11) == '.' && stringBuilder.charAt(n13) == '.') {
                        n8 = stringBuilder.lastIndexOf("/", n11 - 2) + 1;
                        n11 = n8 > n10 ? n8 : n10;
                        stringBuilder.delete(n11, n12);
                        n12 = n9 - (n12 - n11);
                    } else {
                        ++n8;
                        n12 = n9;
                    }
                    n9 = n8;
                }
                n8 = n9;
                n11 = n9;
                n9 = n12;
                continue;
            }
            ++n8;
        }
    }

    public static String c(String string, String object) {
        int[] nArray;
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        string = object;
        if (object == null) {
            string = "";
        }
        if ((nArray = O.a(string))[0] != -1) {
            stringBuilder.append(string);
            O.b(stringBuilder, nArray[1], nArray[2]);
            return stringBuilder.toString();
        }
        object = O.a(string2);
        if (nArray[3] == 0) {
            stringBuilder.append(string2, 0, (int)object[3]);
            stringBuilder.append(string);
            return stringBuilder.toString();
        }
        if (nArray[2] == 0) {
            stringBuilder.append(string2, 0, (int)object[2]);
            stringBuilder.append(string);
            return stringBuilder.toString();
        }
        Object object2 = nArray[1];
        if (object2 != 0) {
            object2 = object[0] + true;
            stringBuilder.append(string2, 0, (int)object2);
            stringBuilder.append(string);
            return O.b(stringBuilder, nArray[1] + object2, object2 + nArray[2]);
        }
        if (string.charAt((int)object2) == '/') {
            stringBuilder.append(string2, 0, (int)object[1]);
            stringBuilder.append(string);
            object2 = object[1];
            return O.b(stringBuilder, object2, nArray[2] + object2);
        }
        Object object3 = object[0];
        object2 = object[1];
        if (object3 + 2 < object2 && object2 == object[2]) {
            stringBuilder.append(string2, 0, (int)object2);
            stringBuilder.append('/');
            stringBuilder.append(string);
            object2 = object[1];
            return O.b(stringBuilder, object2, nArray[2] + object2 + 1);
        }
        object2 = string2.lastIndexOf(47, (int)(object[2] - true));
        object2 = object2 == -1 ? (Object)object[1] : ++object2;
        stringBuilder.append(string2, 0, (int)object2);
        stringBuilder.append(string);
        return O.b(stringBuilder, (int)object[1], object2 + nArray[2]);
    }

    public static Uri d(String string, String string2) {
        return Uri.parse((String)O.c(string, string2));
    }
}

