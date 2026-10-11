/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.C5;
import ax.b6.U4;
import ax.b6.k4;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

final class V4 {
    private static final char[] a;

    static {
        char[] cArray = new char[80];
        a = cArray;
        Arrays.fill(cArray, ' ');
    }

    static String a(U4 u42, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(string);
        V4.c(u42, stringBuilder, 0);
        return stringBuilder.toString();
    }

    private static void b(int n8, StringBuilder stringBuilder) {
        while (n8 > 0) {
            char[] cArray = a;
            int n9 = n8 > cArray.length ? cArray.length : n8;
            stringBuilder.append(cArray, 0, n9);
            n8 -= n9;
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private static void c(U4 var0, StringBuilder var1_1, int var2_2) {
        var9_3 = new HashSet<String>();
        var7_4 = new HashMap<K, V>();
        var8_5 = new TreeMap<String, Object>();
        for (Object var11_9 : var0.getClass().getDeclaredMethods()) {
            if (Modifier.isStatic(var11_9.getModifiers()) || var11_9.getName().length() < 3) continue;
            if (var11_9.getName().startsWith("set")) {
                var9_3.add(var11_9.getName());
                continue;
            }
            if (!Modifier.isPublic(var11_9.getModifiers()) || var11_9.getParameterTypes().length != 0) continue;
            if (var11_9.getName().startsWith("has")) {
                var7_4.put(var11_9.getName(), var11_9);
                continue;
            }
            if (!var11_9.getName().startsWith("get")) continue;
            var8_5.put(var11_9.getName(), var11_9);
        }
        for (Object var12_12 : var8_5.entrySet()) {
            block22: {
                block18: {
                    block17: {
                        block21: {
                            block20: {
                                block19: {
                                    var11_9 = ((String)var12_12.getKey()).substring(3);
                                    if (var11_9.endsWith("List") && !var11_9.endsWith("OrBuilderList") && !var11_9.equals("List") && (var13_13 = (Method)var12_12.getValue()) != null && var13_13.getReturnType().equals(List.class)) {
                                        V4.d(var1_1, var2_2, var11_9.substring(0, var11_9.length() - 4), k4.v((Method)var13_13, var0, new Object[0]));
                                        continue;
                                    }
                                    if (var11_9.endsWith("Map") && !var11_9.equals("Map") && (var13_13 = (Method)var12_12.getValue()) != null && var13_13.getReturnType().equals(Map.class) && !var13_13.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(var13_13.getModifiers())) {
                                        V4.d(var1_1, var2_2, var11_9.substring(0, var11_9.length() - 3), k4.v((Method)var13_13, var0, new Object[0]));
                                        continue;
                                    }
                                    var13_13 = new StringBuilder("set");
                                    var13_13.append((String)var11_9);
                                    if (!var9_3.contains(var13_13.toString())) continue;
                                    if (var11_9.endsWith("Bytes")) {
                                        var14_14 = var11_9.substring(0, var11_9.length() - 5);
                                        var13_13 = new StringBuilder("get");
                                        var13_13.append(var14_14);
                                        if (var8_5.containsKey(var13_13.toString())) continue;
                                    }
                                    var12_12 = (Method)var12_12.getValue();
                                    var13_13 = new StringBuilder("has");
                                    var13_13.append((String)var11_9);
                                    var13_13 = (Method)var7_4.get(var13_13.toString());
                                    if (var12_12 == null) continue;
                                    var12_12 = k4.v((Method)var12_12, var0, new Object[0]);
                                    if (var13_13 != null) break block18;
                                    var5_10 = var12_12 instanceof Boolean;
                                    var6_11 = true;
                                    if (var5_10) {
                                        if (!((Boolean)var12_12).booleanValue()) lbl-1000:
                                        // 5 sources

                                        {
                                            while (true) {
                                                var5_10 = true;
                                                break block17;
                                                break;
                                            }
                                        }
lbl52:
                                        // 6 sources

                                        while (true) {
                                            var5_10 = false;
                                            break block17;
                                            break;
                                        }
                                    }
                                    if (!(var12_12 instanceof Integer)) break block19;
                                    if ((Integer)var12_12 != 0) ** GOTO lbl52
                                    ** GOTO lbl-1000
                                }
                                if (!(var12_12 instanceof Float)) break block20;
                                if (Float.floatToRawIntBits(((Float)var12_12).floatValue()) != 0) ** GOTO lbl52
                                ** GOTO lbl-1000
                            }
                            if (!(var12_12 instanceof Double)) break block21;
                            if (Double.doubleToRawLongBits((Double)var12_12) != 0L) ** GOTO lbl52
                            ** GOTO lbl-1000
                        }
                        if (var12_12 instanceof String) {
                            var5_10 = var12_12.equals("");
                        } else if (var12_12 instanceof B3) {
                            var5_10 = var12_12.equals(B3.c0);
                        } else {
                            if (var12_12 instanceof U4 != false ? var12_12 == ((U4)var12_12).h() : var12_12 instanceof Enum != false && ((Enum)var12_12).ordinal() == 0) ** break;
                            ** continue;
                            ** continue;
                        }
                    }
                    var5_10 = !var5_10 ? var6_11 : false;
                    break block22;
                }
                var5_10 = (Boolean)k4.v((Method)var13_13, var0, new Object[0]);
            }
            if (!var5_10) continue;
            V4.d(var1_1, var2_2, (String)var11_9, var12_12);
        }
        if (var0 instanceof k4.d && (var7_4 = ((k4.d)var0).zzc.p()).hasNext()) {
            var0 = (k4.c)((Map.Entry)var7_4.next()).getKey();
            throw new NoSuchMethodError();
        }
        var0 = ((k4)var0).zzb;
        if (var0 != null) {
            var0.h(var1_1, var2_2);
        }
    }

    static void d(StringBuilder stringBuilder, int n8, String object, Object iterator) {
        int n9;
        block12: {
            block11: {
                block10: {
                    if (!(iterator instanceof List)) break block10;
                    iterator = ((List)((Object)iterator)).iterator();
                    while (iterator.hasNext()) {
                        V4.d(stringBuilder, n8, (String)object, iterator.next());
                    }
                    break block11;
                }
                if (iterator instanceof Map) {
                    iterator = ((Map)((Object)iterator)).entrySet().iterator();
                    while (iterator.hasNext()) {
                        V4.d(stringBuilder, n8, (String)object, (Map.Entry)iterator.next());
                    }
                }
                break block12;
            }
            return;
        }
        stringBuilder.append('\n');
        V4.b(n8, stringBuilder);
        if (!((String)object).isEmpty()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(Character.toLowerCase(((String)object).charAt(0)));
            for (n9 = 1; n9 < ((String)object).length(); ++n9) {
                char c8 = ((String)object).charAt(n9);
                if (Character.isUpperCase(c8)) {
                    stringBuilder2.append("_");
                }
                stringBuilder2.append(Character.toLowerCase(c8));
            }
            object = stringBuilder2.toString();
        }
        stringBuilder.append((String)object);
        if (iterator instanceof String) {
            stringBuilder.append(": \"");
            stringBuilder.append(C5.a(B3.l((String)((Object)iterator))));
            stringBuilder.append('\"');
            return;
        }
        if (iterator instanceof B3) {
            stringBuilder.append(": \"");
            stringBuilder.append(C5.a((B3)((Object)iterator)));
            stringBuilder.append('\"');
            return;
        }
        if (iterator instanceof k4) {
            stringBuilder.append(" {");
            V4.c((k4)((Object)iterator), stringBuilder, n8 + 2);
            stringBuilder.append("\n");
            V4.b(n8, stringBuilder);
            stringBuilder.append("}");
            return;
        }
        if (iterator instanceof Map.Entry) {
            stringBuilder.append(" {");
            object = (Map.Entry)((Object)iterator);
            n9 = n8 + 2;
            V4.d(stringBuilder, n9, "key", object.getKey());
            V4.d(stringBuilder, n9, "value", object.getValue());
            stringBuilder.append("\n");
            V4.b(n8, stringBuilder);
            stringBuilder.append("}");
            return;
        }
        stringBuilder.append(": ");
        stringBuilder.append(iterator);
    }
}

