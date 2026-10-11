/*
 * Decompiled with CFR 0.152.
 */
package ax.jc;

import ax.jc.c;
import ax.jc.d;
import ax.jc.e;
import ax.jc.h;
import ax.jc.k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class g {
    private final Method a;
    private final d[] b;
    private final String c;
    private final int d;
    private final Class<? extends ax.hc.e> e;
    private final e f;
    private final boolean g;
    private final Class[] h;
    private final boolean i;
    private final h j;
    private final boolean k;

    public g(Map<String, Object> map) {
        this.n(map);
        this.a = (Method)map.get("handler");
        this.b = (d[])map.get("filter");
        this.c = (String)map.get("condition");
        this.d = (Integer)map.get("priority");
        this.e = (Class)map.get("invocation");
        this.f = (e)((Object)map.get("invocationMode"));
        this.g = (Boolean)map.get("envelope");
        this.i = (Boolean)map.get("subtypes");
        this.j = (h)map.get("listener");
        this.k = (Boolean)map.get("synchronized");
        this.h = (Class[])map.get("messages");
    }

    private void n(Map<String, Object> map) {
        Object[] objectArray = new Object[]{"handler", Method.class};
        Object[] objectArray2 = new Object[]{"priority", Integer.class};
        Object object = new Object[]{"invocation", Class.class};
        Object[] objectArray3 = new Object[]{"condition", String.class};
        Object[] objectArray4 = new Object[]{"envelope", Boolean.class};
        Object[] objectArray5 = new Object[]{"subtypes", Boolean.class};
        for (int i8 = 0; i8 < 10; ++i8) {
            Object[] objectArray6 = (new Object[][]{objectArray, objectArray2, object, {"filter", d[].class}, objectArray3, objectArray4, {"messages", Class[].class}, {"synchronized", Boolean.class}, {"listener", h.class}, objectArray5})[i8];
            if (map.get(objectArray6[0]) != null && ((Class)objectArray6[1]).isAssignableFrom(map.get(objectArray6[0]).getClass())) {
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Property ");
            ((StringBuilder)object).append(objectArray6[0]);
            ((StringBuilder)object).append(" was expected to be not null and of type ");
            ((StringBuilder)object).append(objectArray6[1]);
            ((StringBuilder)object).append(" but was: ");
            ((StringBuilder)object).append(map.get(objectArray6[0]));
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
    }

    public boolean a() {
        return this.i;
    }

    public String b() {
        return this.c;
    }

    public d[] c() {
        return this.b;
    }

    public Class[] d() {
        return this.h;
    }

    public Class<? extends ax.hc.e> e() {
        return this.e;
    }

    public Method f() {
        return this.a;
    }

    public int g() {
        return this.d;
    }

    public boolean h(Class<?> clazz) {
        for (Class clazz2 : this.h) {
            if (clazz2.equals(clazz)) {
                return true;
            }
            if (!clazz2.isAssignableFrom(clazz) || !this.a()) continue;
            return true;
        }
        return false;
    }

    public boolean i() {
        return ((Object)((Object)this.f)).equals((Object)ax.jc.e.c0);
    }

    public boolean j() {
        return this.g;
    }

    public boolean k() {
        String string;
        return this.b.length > 0 || (string = this.c) != null && string.trim().length() > 0;
        {
        }
    }

    public boolean l() {
        return this.k;
    }

    public boolean m() {
        return this.j.c();
    }

    public static final class a {
        public static final Map<String, Object> a(Method method, c c8, d[] objectArray, h h8) {
            if (method != null) {
                ax.jc.a a8;
                boolean bl = false;
                d[] dArray = objectArray;
                if (objectArray == null) {
                    dArray = new d[]{};
                }
                objectArray = (a8 = ax.gc.d.c(method, ax.jc.a.class)) != null ? a8.messages() : method.getParameterTypes();
                ((AccessibleObject)method).setAccessible(true);
                HashMap<String, Object> hashMap = new HashMap<String, Object>();
                hashMap.put("handler", method);
                d[] dArray2 = dArray;
                if (c8.condition().length() > 0) {
                    if (ax.ic.a.d()) {
                        dArray2 = new d[dArray.length + 1];
                        for (int i8 = 0; i8 < dArray.length; ++i8) {
                            dArray2[i8] = dArray[i8];
                        }
                        dArray2[dArray.length] = new ax.ic.a();
                    } else {
                        throw new IllegalStateException("A handler uses an EL filter but no EL implementation is available.");
                    }
                }
                hashMap.put("filter", dArray2);
                hashMap.put("condition", ax.jc.g$a.b(c8.condition()));
                hashMap.put("priority", c8.priority());
                hashMap.put("invocation", c8.invocation());
                hashMap.put("invocationMode", (Object)c8.delivery());
                boolean bl2 = a8 != null;
                hashMap.put("envelope", bl2);
                hashMap.put("subtypes", c8.rejectSubtypes() ^ true);
                hashMap.put("listener", h8);
                bl2 = bl;
                if (ax.gc.d.c(method, k.class) != null) {
                    bl2 = true;
                }
                hashMap.put("synchronized", bl2);
                hashMap.put("messages", objectArray);
                return hashMap;
            }
            throw new IllegalArgumentException("The message handler configuration may not be null");
        }

        private static String b(String string) {
            CharSequence charSequence = string;
            if (!string.trim().startsWith("${")) {
                charSequence = string;
                if (!string.trim().startsWith("#{")) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("${");
                    ((StringBuilder)charSequence).append(string);
                    ((StringBuilder)charSequence).append("}");
                    charSequence = ((StringBuilder)charSequence).toString();
                }
            }
            return charSequence;
        }
    }
}

