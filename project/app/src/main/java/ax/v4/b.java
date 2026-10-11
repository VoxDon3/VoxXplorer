/*
 * Decompiled with CFR 0.152.
 */
package ax.v4;

import java.util.HashMap;
import java.util.Map;

public class b {
    public static Map<Class<?>, a> a = new HashMap();

    public static void a(Object object, String string) {
        Class<?> clazz = object.getClass();
        if (a.containsKey(clazz)) {
            a.get(clazz).a(object, string);
        }
    }

    public static interface a {
        public void a(Object var1, String var2);
    }
}

