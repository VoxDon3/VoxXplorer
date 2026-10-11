/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.i;
import ax.Sc.k;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

public class g
extends k {
    private static final g a = new g();
    private static final HashMap<String, Integer> b;
    private static final int[] c;
    private static final int[][] d;

    static {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        b = hashMap;
        hashMap.put("file", 0);
        Integer n8 = 1;
        hashMap.put("cdir", n8);
        hashMap.put("pdir", n8);
        hashMap.put("dir", n8);
        c = new int[]{0, 1, 2};
        d = new int[][]{new int[0], {2}, {1}, {2, 1}, {0}, {0, 2}, {0, 1}, {0, 1, 2}};
    }

    private void d(i i8, String object) {
        for (Object object2 : (Object)((String)object).toCharArray()) {
            if (object2 != 97) {
                if (object2 != 112) {
                    if (object2 != 114) {
                        if (object2 != 119) {
                            if (object2 != 108) {
                                if (object2 != 109) {
                                    switch (object2) {
                                        default: {
                                            break;
                                        }
                                        case 101: {
                                            i8.m(0, 0, true);
                                            break;
                                        }
                                        case 100: {
                                            i8.m(0, 1, true);
                                            break;
                                        }
                                        case 99: {
                                            i8.m(0, 1, true);
                                            break;
                                        }
                                    }
                                    continue;
                                }
                                i8.m(0, 1, true);
                                continue;
                            }
                            i8.m(0, 2, true);
                            continue;
                        }
                        i8.m(0, 1, true);
                        continue;
                    }
                    i8.m(0, 0, true);
                    continue;
                }
                i8.m(0, 1, true);
                continue;
            }
            i8.m(0, 1, true);
        }
    }

    public static g e() {
        return a;
    }

    public static i g(String string) {
        return a.c(string);
    }

    public static Calendar h(String string) {
        boolean bl;
        Cloneable cloneable;
        if (string.contains(".")) {
            cloneable = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            bl = true;
        } else {
            cloneable = new SimpleDateFormat("yyyyMMddHHmmss");
            bl = false;
        }
        Cloneable cloneable2 = java.util.DesugarTimeZone.getTimeZone((String)"GMT");
        cloneable.setTimeZone((TimeZone)cloneable2);
        cloneable2 = new GregorianCalendar((TimeZone)cloneable2);
        ParsePosition parsePosition = new ParsePosition(0);
        cloneable.setLenient(false);
        cloneable = cloneable.parse(string, parsePosition);
        if (parsePosition.getIndex() != string.length()) {
            return null;
        }
        ((Calendar)cloneable2).setTime((Date)cloneable);
        if (!bl) {
            ((Calendar)cloneable2).clear(14);
        }
        return cloneable2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public i c(String var1_1) {
        block16: {
            var9_2 = var1_1.startsWith(" ");
            var10_3 = null;
            if (var9_2) {
                if (var1_1.length() > 1) {
                    var10_3 = new i();
                    var10_3.n((String)var1_1);
                    var10_3.l(var1_1.substring(1));
                    return var10_3;
                }
                return null;
            }
            var13_4 = var1_1.split(" ", 2);
            if (((String[])var13_4).length != 2 || var13_4[1].isEmpty()) break block16;
            var12_5 = var13_4[0];
            if (!var12_5.endsWith(";")) {
                return null;
            }
            var11_6 = new i();
            var11_6.n((String)var1_1);
            var11_6.l(var13_4[1]);
            var12_5 = var12_5.split(";");
            var9_2 = var13_4[0].toLowerCase(Locale.ENGLISH).contains("unix.mode=");
            var5_7 = var12_5.length;
            var1_1 = var10_3;
            block0: for (var2_8 = 0; var2_8 < var5_7; ++var2_8) {
                block17: {
                    block18: {
                        block19: {
                            var13_4 = var12_5[var2_8].split("=", -1);
                            if (((String[])var13_4).length != 2) {
                                return var1_1;
                            }
                            var14_14 = var13_4[0];
                            var10_3 = Locale.ENGLISH;
                            var14_14 = var14_14.toLowerCase((Locale)var10_3);
                            if ((var13_4 = var13_4[1]).isEmpty()) continue;
                            var15_15 = var13_4.toLowerCase((Locale)var10_3);
                            if ("size".equals(var14_14) || "sizd".equals(var14_14)) break block17;
                            if ("modify".equals(var14_14)) {
                                var10_3 = g.h((String)var13_4);
                                if (var10_3 == null) {
                                    return var1_1;
                                }
                                var11_6.p((Calendar)var10_3);
                                continue;
                            }
                            if ("type".equals(var14_14)) {
                                var10_3 = g.b.get(var15_15);
                                if (var10_3 == null) {
                                    var11_6.q(3);
                                    continue;
                                }
                                var11_6.q(var10_3.intValue());
                                continue;
                            }
                            if (!var14_14.startsWith("unix.")) break block18;
                            if ("group".equals(var14_14 = var14_14.substring(5).toLowerCase((Locale)var10_3))) {
                                var11_6.i((String)var13_4);
                                var10_3 = var1_1;
lbl49:
                                // 4 sources

                                while (true) {
                                    var1_1 = var10_3;
                                    continue block0;
                                    break;
                                }
                            }
                            if (!"owner".equals(var14_14)) break block19;
                            var11_6.r((String)var13_4);
                            var10_3 = var1_1;
                            ** GOTO lbl49
                        }
                        var10_3 = var1_1;
                        if (!"mode".equals(var14_14)) ** GOTO lbl49
                        var6_11 = var13_4.length();
                        var3_9 = 0;
                        while (true) {
                            var10_3 = var1_1;
                            if (var3_9 < 3) ** break;
                            ** continue;
                            var4_10 = var13_4.charAt(var6_11 - 3 + var3_9) - 48;
                            var10_3 = var1_1;
                            if (var4_10 >= 0) {
                                var10_3 = var1_1;
                                if (var4_10 <= 7) {
                                    var14_14 = g.d[var4_10];
                                    var7_12 = ((Object)var14_14).length;
                                    var4_10 = 0;
                                    while (true) {
                                        var10_3 = var1_1;
                                        if (var4_10 >= var7_12) break;
                                        var8_13 = var14_14[var4_10];
                                        var11_6.m(g.c[var3_9], (int)var8_13, true);
                                        ++var4_10;
                                    }
                                }
                            }
                            ++var3_9;
                            var1_1 = var10_3;
                        }
                    }
                    var1_1 = var10_3 = var1_1;
                    if (var9_2) continue;
                    if (!"perm".equals(var14_14)) {
                        var1_1 = var10_3;
                        if (!"perms".equals(var14_14)) continue;
                    }
                    this.d(var11_6, var15_15);
                    var1_1 = var10_3;
                    continue;
                }
                var11_6.o(Long.parseLong((String)var13_4));
            }
            return var11_6;
        }
        return null;
    }
}

