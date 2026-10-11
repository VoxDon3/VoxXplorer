/*
 * Decompiled with CFR 0.152.
 */
package ax.Lc;

import ax.Lc.c;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class b {
    private static final String[] a;
    public static final String b;
    private static final char c;
    private static final char d;
    private static final Pattern e;
    private static final Pattern f;

    static {
        char c8;
        a = new String[0];
        b = Character.toString('.');
        c = c8 = File.separatorChar;
        d = ax.Lc.b.a(c8);
        e = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        f = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }

    static char a(char c8) {
        if (c8 == '/') {
            return '\\';
        }
        if (c8 == '\\') {
            return '/';
        }
        throw new IllegalArgumentException(String.valueOf(c8));
    }

    static String[] b(String object) {
        if (((String)object).indexOf(63) == -1 && ((String)object).indexOf(42) == -1) {
            return new String[]{object};
        }
        object = ((String)object).toCharArray();
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        int n8 = ((Object)object).length;
        Object object2 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object3 = object[i8];
            if (object3 != 63 && object3 != 42) {
                stringBuilder.append((char)object3);
            } else {
                if (stringBuilder.length() != 0) {
                    arrayList.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
                if (object3 == 63) {
                    arrayList.add("?");
                } else if (object2 != 42) {
                    arrayList.add("*");
                }
            }
            object2 = object3;
        }
        if (stringBuilder.length() != 0) {
            arrayList.add(stringBuilder.toString());
        }
        return arrayList.toArray(a);
    }

    /*
     * Unable to fully structure code
     */
    public static boolean c(String var0, String var1_1, c var2_2) {
        if (var0 == null && var1_1 == null) {
            return true;
        }
        if (var0 != null && var1_1 != null) {
            var2_2 = ax.Lc.c.l(var2_2, ax.Lc.c.d0);
            var1_1 = ax.Lc.b.b((String)var1_1);
            var7_3 = new ArrayDeque<int[]>(var1_1.length);
            var6_4 = 0;
            var3_5 = 0;
            var5_6 = 0;
            do {
                if (!var7_3.isEmpty()) {
                    var8_8 = (int[])var7_3.pop();
                    var5_6 = var8_8[0];
                    var3_5 = var8_8[1];
                    var6_4 = 1;
                }
                while (true) {
                    var4_7 = var3_5;
                    if (var5_6 >= var1_1.length) break;
                    if (var1_1[var5_6].equals("?")) {
                        var3_5 = var4_7 = var3_5 + 1;
                        if (var4_7 > var0.length()) break;
lbl22:
                        // 2 sources

                        while (true) {
                            var6_4 = 0;
                            break;
                        }
                    } else if (var1_1[var5_6].equals("*")) {
                        if (var5_6 == var1_1.length - 1) {
                            var3_5 = var0.length();
                        }
                        var6_4 = 1;
                    } else {
                        if (var6_4 != 0) {
                            if ((var3_5 = var2_2.h(var0, var3_5, var1_1[var5_6])) == -1) {
                                var4_7 = var3_5;
                                break;
                            }
                            var6_4 = var2_2.h(var0, var3_5 + 1, var1_1[var5_6]);
                            var4_7 = var3_5;
                            if (var6_4 >= 0) {
                                var7_3.push(new int[]{var5_6, var6_4});
                                var4_7 = var3_5;
                            }
                        } else {
                            var4_7 = var3_5;
                            if (!var2_2.j(var0, var3_5, var1_1[var5_6])) {
                                var4_7 = var3_5;
                                break;
                            }
                        }
                        var3_5 = var4_7 + var1_1[var5_6].length();
                        ** continue;
                    }
                    ++var5_6;
                }
                if (var5_6 == var1_1.length && var4_7 == var0.length()) {
                    return true;
                }
                var3_5 = var4_7;
            } while (!var7_3.isEmpty());
        }
        return false;
    }
}

