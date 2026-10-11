/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.S;
import ax.r0.h;
import ax.r0.m0;
import ax.r0.p0;
import ax.r0.y;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class U {
    private static final String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = 0; i8 < string.length(); ++i8) {
            char c8 = string.charAt(i8);
            if (Character.isUpperCase(c8)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase(c8));
        }
        return stringBuilder.toString();
    }

    private static boolean b(Object object) {
        if (object instanceof Boolean) {
            return (Boolean)object ^ true;
        }
        if (object instanceof Integer) {
            return (Integer)object == 0;
        }
        if (object instanceof Float) {
            return ((Float)object).floatValue() == 0.0f;
        }
        if (object instanceof Double) {
            return (Double)object == 0.0;
        }
        if (object instanceof String) {
            return object.equals("");
        }
        if (object instanceof h) {
            return object.equals(h.c0);
        }
        if (object instanceof S) {
            return object == ((S)object).c();
        }
        return object instanceof Enum && ((Enum)object).ordinal() == 0;
    }

    static final void c(StringBuilder stringBuilder, int n8, String object, Object iterator) {
        int n9;
        block12: {
            block11: {
                block10: {
                    if (!(iterator instanceof List)) break block10;
                    iterator = ((List)((Object)iterator)).iterator();
                    while (iterator.hasNext()) {
                        U.c(stringBuilder, n8, (String)object, iterator.next());
                    }
                    break block11;
                }
                if (iterator instanceof Map) {
                    iterator = ((Map)((Object)iterator)).entrySet().iterator();
                    while (iterator.hasNext()) {
                        U.c(stringBuilder, n8, (String)object, (Map.Entry)iterator.next());
                    }
                }
                break block12;
            }
            return;
        }
        stringBuilder.append('\n');
        int n10 = 0;
        int n11 = 0;
        for (n9 = 0; n9 < n8; ++n9) {
            stringBuilder.append(' ');
        }
        stringBuilder.append((String)object);
        if (iterator instanceof String) {
            stringBuilder.append(": \"");
            stringBuilder.append(m0.c((String)((Object)iterator)));
            stringBuilder.append('\"');
            return;
        }
        if (iterator instanceof h) {
            stringBuilder.append(": \"");
            stringBuilder.append(m0.a((h)((Object)iterator)));
            stringBuilder.append('\"');
            return;
        }
        if (iterator instanceof y) {
            stringBuilder.append(" {");
            U.d((y)((Object)iterator), stringBuilder, n8 + 2);
            stringBuilder.append("\n");
            for (n9 = n11; n9 < n8; ++n9) {
                stringBuilder.append(' ');
            }
            stringBuilder.append("}");
            return;
        }
        if (iterator instanceof Map.Entry) {
            stringBuilder.append(" {");
            object = (Map.Entry)((Object)iterator);
            n9 = n8 + 2;
            U.c(stringBuilder, n9, "key", object.getKey());
            U.c(stringBuilder, n9, "value", object.getValue());
            stringBuilder.append("\n");
            for (n9 = n10; n9 < n8; ++n9) {
                stringBuilder.append(' ');
            }
            stringBuilder.append("}");
            return;
        }
        stringBuilder.append(": ");
        stringBuilder.append(iterator.toString());
    }

    private static void d(S object, StringBuilder stringBuilder, int n8) {
        Object object2 = new HashMap<String, Method>();
        Object object3 = new HashMap<String, Method>();
        Object object4 = new TreeSet();
        for (Method object5 : object.getClass().getDeclaredMethods()) {
            object3.put(object5.getName(), object5);
            if (object5.getParameterTypes().length != 0) continue;
            object2.put(object5.getName(), object5);
            if (!object5.getName().startsWith("get")) continue;
            object4.add(object5.getName());
        }
        Object object6 = object4.iterator();
        while (object6.hasNext()) {
            CharSequence charSequence;
            Object object5;
            object4 = (String)object6.next();
            String string = ((String)object4).replaceFirst("get", "");
            boolean bl = string.endsWith("List");
            boolean bl2 = true;
            if (bl && !string.endsWith("OrBuilderList") && !string.equals("List")) {
                object5 = new StringBuilder();
                ((StringBuilder)object5).append(string.substring(0, 1).toLowerCase());
                ((StringBuilder)object5).append(string.substring(1, string.length() - 4));
                charSequence = ((StringBuilder)object5).toString();
                object5 = (Method)object2.get(object4);
                if (object5 != null && ((Method)object5).getReturnType().equals(List.class)) {
                    U.c(stringBuilder, n8, U.a((String)charSequence), y.z((Method)object5, object, new Object[0]));
                    continue;
                }
            }
            if (string.endsWith("Map") && !string.equals("Map")) {
                object5 = new StringBuilder();
                ((StringBuilder)object5).append(string.substring(0, 1).toLowerCase());
                ((StringBuilder)object5).append(string.substring(1, string.length() - 3));
                object5 = ((StringBuilder)object5).toString();
                object4 = (Method)object2.get(object4);
                if (object4 != null && ((Method)object4).getReturnType().equals(Map.class) && !((AccessibleObject)object4).isAnnotationPresent(Deprecated.class) && Modifier.isPublic(((Method)object4).getModifiers())) {
                    U.c(stringBuilder, n8, U.a((String)object5), y.z((Method)object4, object, new Object[0]));
                    continue;
                }
            }
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("set");
            ((StringBuilder)object4).append(string);
            if ((Method)object3.get(((StringBuilder)object4).toString()) == null) continue;
            if (string.endsWith("Bytes")) {
                object4 = new StringBuilder();
                ((StringBuilder)object4).append("get");
                ((StringBuilder)object4).append(string.substring(0, string.length() - 5));
                if (object2.containsKey(((StringBuilder)object4).toString())) continue;
            }
            object4 = new StringBuilder();
            ((StringBuilder)object4).append(string.substring(0, 1).toLowerCase());
            ((StringBuilder)object4).append(string.substring(1));
            object4 = ((StringBuilder)object4).toString();
            object5 = new StringBuilder();
            ((StringBuilder)object5).append("get");
            ((StringBuilder)object5).append(string);
            object5 = (Method)object2.get(((StringBuilder)object5).toString());
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("has");
            ((StringBuilder)charSequence).append(string);
            Method method = (Method)object2.get(((StringBuilder)charSequence).toString());
            if (object5 == null) continue;
            object5 = y.z((Method)object5, object, new Object[0]);
            if (method == null) {
                if (U.b(object5)) {
                    bl2 = false;
                }
            } else {
                bl2 = (Boolean)y.z(method, object, new Object[0]);
            }
            if (!bl2) continue;
            U.c(stringBuilder, n8, U.a((String)object4), object5);
        }
        if (object instanceof y.c) {
            object3 = ((y.c)object).extensions.s();
            while (object3.hasNext()) {
                object2 = (Map.Entry)object3.next();
                object6 = new StringBuilder();
                ((StringBuilder)object6).append("[");
                ((StringBuilder)object6).append(((y.d)object2.getKey()).g());
                ((StringBuilder)object6).append("]");
                U.c(stringBuilder, n8, ((StringBuilder)object6).toString(), object2.getValue());
            }
        }
        if ((object = ((y)object).unknownFields) != null) {
            ((p0)object).m(stringBuilder, n8);
        }
    }

    static String e(S s8, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(string);
        U.d(s8, stringBuilder, 0);
        return stringBuilder.toString();
    }
}

