package ax.W5;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* renamed from: ax.W5.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1047l1 {
    private static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(InterfaceC1041j1 interfaceC1041j1, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(interfaceC1041j1, sb, 0);
        return sb.toString();
    }

    static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(K1.a(new C1061q0(((String) obj).getBytes(O0.b))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1069t0) {
            sb.append(": \"");
            sb.append(K1.a((AbstractC1069t0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof J0) {
            sb.append(" {");
            d((J0) obj, sb, i + 2);
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        b(sb, i3, "key", entry.getKey());
        b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        c(i, sb);
        sb.append("}");
    }

    private static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    private static void d(InterfaceC1041j1 interfaceC1041j1, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC1041j1.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i, substring.substring(0, substring.length() - 4), J0.h(method2, interfaceC1041j1, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i, substring.substring(0, substring.length() - 3), J0.h(method, interfaceC1041j1, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object h = J0.h(method4, interfaceC1041j1, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) J0.h(method5, interfaceC1041j1, new Object[0])).booleanValue()) {
                        }
                        b(sb, i, substring, h);
                    } else if (h instanceof Boolean) {
                        if (!((Boolean) h).booleanValue()) {
                        }
                        b(sb, i, substring, h);
                    } else if (h instanceof Integer) {
                        if (((Integer) h).intValue() == 0) {
                        }
                        b(sb, i, substring, h);
                    } else if (h instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) h).floatValue()) == 0) {
                        }
                        b(sb, i, substring, h);
                    } else if (h instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) h).doubleValue()) == 0) {
                        }
                        b(sb, i, substring, h);
                    } else {
                        if (h instanceof String) {
                            equals = h.equals(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else if (h instanceof AbstractC1069t0) {
                            equals = h.equals(AbstractC1069t0.c0);
                        } else if (h instanceof InterfaceC1041j1) {
                            if (h == ((InterfaceC1041j1) h).f()) {
                            }
                            b(sb, i, substring, h);
                        } else {
                            if ((h instanceof Enum) && ((Enum) h).ordinal() == 0) {
                            }
                            b(sb, i, substring, h);
                        }
                        if (equals) {
                        }
                        b(sb, i, substring, h);
                    }
                }
            }
            i2 = 3;
        }
        if (interfaceC1041j1 instanceof I0) {
            throw null;
        }
        O1 o1 = ((J0) interfaceC1041j1).zzc;
        if (o1 != null) {
            o1.g(sb, i);
        }
    }
}
