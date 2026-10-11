/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.I0;
import ax.W5.J0;
import ax.W5.K1;
import ax.W5.O0;
import ax.W5.j1;
import ax.W5.q0;
import ax.W5.t0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

final class l1 {
    private static final char[] a;

    static {
        char[] cArray = new char[80];
        a = cArray;
        Arrays.fill(cArray, ' ');
    }

    static String a(j1 j12, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(string);
        l1.d(j12, stringBuilder, 0);
        return stringBuilder.toString();
    }

    static void b(StringBuilder stringBuilder, int n8, String object, Object iterator) {
        int n9;
        block12: {
            block11: {
                block10: {
                    if (!(iterator instanceof List)) break block10;
                    iterator = ((List)((Object)iterator)).iterator();
                    while (iterator.hasNext()) {
                        l1.b(stringBuilder, n8, (String)object, iterator.next());
                    }
                    break block11;
                }
                if (iterator instanceof Map) {
                    iterator = ((Map)((Object)iterator)).entrySet().iterator();
                    while (iterator.hasNext()) {
                        l1.b(stringBuilder, n8, (String)object, (Map.Entry)iterator.next());
                    }
                }
                break block12;
            }
            return;
        }
        stringBuilder.append('\n');
        l1.c(n8, stringBuilder);
        CharSequence charSequence = object;
        if (!((String)object).isEmpty()) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(Character.toLowerCase(((String)object).charAt(0)));
            for (n9 = 1; n9 < ((String)object).length(); ++n9) {
                char c8 = ((String)object).charAt(n9);
                if (Character.isUpperCase(c8)) {
                    ((StringBuilder)charSequence).append("_");
                }
                ((StringBuilder)charSequence).append(Character.toLowerCase(c8));
            }
            charSequence = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append((String)charSequence);
        if (iterator instanceof String) {
            stringBuilder.append(": \"");
            stringBuilder.append(K1.a(new q0(((String)((Object)iterator)).getBytes(O0.b))));
            stringBuilder.append('\"');
            return;
        }
        if (iterator instanceof t0) {
            stringBuilder.append(": \"");
            stringBuilder.append(K1.a((t0)((Object)iterator)));
            stringBuilder.append('\"');
            return;
        }
        if (iterator instanceof J0) {
            stringBuilder.append(" {");
            l1.d((J0)((Object)iterator), stringBuilder, n8 + 2);
            stringBuilder.append("\n");
            l1.c(n8, stringBuilder);
            stringBuilder.append("}");
            return;
        }
        if (iterator instanceof Map.Entry) {
            stringBuilder.append(" {");
            object = (Map.Entry)((Object)iterator);
            n9 = n8 + 2;
            l1.b(stringBuilder, n9, "key", object.getKey());
            l1.b(stringBuilder, n9, "value", object.getValue());
            stringBuilder.append("\n");
            l1.c(n8, stringBuilder);
            stringBuilder.append("}");
            return;
        }
        stringBuilder.append(": ");
        stringBuilder.append(iterator);
    }

    private static void c(int n8, StringBuilder stringBuilder) {
        while (n8 > 0) {
            int n9 = 80;
            if (n8 <= 80) {
                n9 = n8;
            }
            stringBuilder.append(a, 0, n9);
            n8 -= n9;
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private static void d(j1 var0, StringBuilder var1_1, int var2_2) {
        var8_3 = new HashSet<String>();
        var6_4 = new HashMap<String, Object>();
        var7_5 = new TreeMap<String, Object>();
        for (Object var10_9 : var0.getClass().getDeclaredMethods()) {
            if (Modifier.isStatic(var10_9.getModifiers()) || var10_9.getName().length() < 3) continue;
            if (var10_9.getName().startsWith("set")) {
                var8_3.add(var10_9.getName());
                continue;
            }
            if (!Modifier.isPublic(var10_9.getModifiers()) || var10_9.getParameterTypes().length != 0) continue;
            if (var10_9.getName().startsWith("has")) {
                var6_4.put(var10_9.getName(), var10_9);
                continue;
            }
            if (!var10_9.getName().startsWith("get")) continue;
            var7_5.put(var10_9.getName(), var10_9);
        }
        for (Object var11_11 : var7_5.entrySet()) {
            block12: {
                block10: {
                    block16: {
                        block15: {
                            block14: {
                                block13: {
                                    block11: {
                                        var10_9 = ((String)var11_11.getKey()).substring(3);
                                        if (var10_9.endsWith("List") && !var10_9.endsWith("OrBuilderList") && !var10_9.equals("List") && (var12_12 = (Method)var11_11.getValue()) != null && var12_12.getReturnType().equals(List.class)) {
                                            l1.b(var1_1, var2_2, var10_9.substring(0, var10_9.length() - 4), J0.h((Method)var12_12, var0, new Object[0]));
                                            continue;
                                        }
                                        if (var10_9.endsWith("Map") && !var10_9.equals("Map") && (var12_12 = (Method)var11_11.getValue()) != null && var12_12.getReturnType().equals(Map.class) && !var12_12.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(var12_12.getModifiers())) {
                                            l1.b(var1_1, var2_2, var10_9.substring(0, var10_9.length() - 3), J0.h((Method)var12_12, var0, new Object[0]));
                                            continue;
                                        }
                                        if (!var8_3.contains("set".concat((String)var10_9)) || var10_9.endsWith("Bytes") && var7_5.containsKey("get".concat(String.valueOf(var10_9.substring(0, var10_9.length() - 5))))) continue;
                                        var12_12 = (Method)var11_11.getValue();
                                        var11_11 = (Method)var6_4.get("has".concat((String)var10_9));
                                        if (var12_12 == null) continue;
                                        var12_12 = J0.h((Method)var12_12, var0, new Object[0]);
                                        if (var11_11 != null) break block10;
                                        if (!(var12_12 instanceof Boolean)) break block11;
                                        if (!((Boolean)var12_12).booleanValue()) continue;
                                        break block12;
                                    }
                                    if (!(var12_12 instanceof Integer)) break block13;
                                    if ((Integer)var12_12 == 0) continue;
                                    break block12;
                                }
                                if (!(var12_12 instanceof Float)) break block14;
                                if (Float.floatToRawIntBits(((Float)var12_12).floatValue()) == 0) continue;
                                break block12;
                            }
                            if (!(var12_12 instanceof Double)) break block15;
                            if (Double.doubleToRawLongBits((Double)var12_12) == 0L) continue;
                            break block12;
                        }
                        if (!(var12_12 instanceof String)) break block16;
                        var5_10 = var12_12.equals("");
                        ** GOTO lbl55
                    }
                    if (var12_12 instanceof t0) {
                        var5_10 = var12_12.equals(t0.c0);
lbl55:
                        // 2 sources

                        if (var5_10) continue;
                    } else if (!(var12_12 instanceof j1 != false ? var12_12 != ((j1)var12_12).f() : var12_12 instanceof Enum == false || ((Enum)var12_12).ordinal() != 0)) continue;
                    break block12;
                }
                if (!((Boolean)J0.h((Method)var11_11, var0, new Object[0])).booleanValue()) continue;
            }
            l1.b(var1_1, var2_2, (String)var10_9, var12_12);
        }
        if (!(var0 instanceof I0)) {
            var0 = ((J0)var0).zzc;
            if (var0 != null) {
                var0.g(var1_1, var2_2);
            }
            return;
        }
        var0 = (I0)var0;
        throw null;
    }
}

