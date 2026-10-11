/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import androidx.work.b;
import ax.B2.g;
import ax.Gb.l;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ArrayCreatingInputMerger
extends g {
    private final Object c(Object object, Object object2, Class<?> object3) {
        int n8 = Array.getLength(object);
        object3 = Array.newInstance(object3, n8 + 1);
        System.arraycopy(object, 0, object3, 0, n8);
        Array.set(object3, n8, object2);
        l.e(object3, "newArray");
        return object3;
    }

    private final Object d(Object object, Object object2) {
        int n8 = Array.getLength(object);
        int n9 = Array.getLength(object2);
        Object object3 = object.getClass().getComponentType();
        l.c(object3);
        object3 = Array.newInstance(object3, n8 + n9);
        System.arraycopy(object, 0, object3, 0, n8);
        System.arraycopy(object2, 0, object3, n8, n9);
        l.e(object3, "newArray");
        return object3;
    }

    private final Object e(Object object, Class<?> object2) {
        object2 = Array.newInstance(object2, 1);
        Array.set(object2, 0, object);
        l.e(object2, "newArray");
        return object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public b b(List<b> object2) {
        l.f(object2, "inputs");
        b.a a8 = new b.a();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            Map<String, Object> map = ((b)iterator.next()).h();
            l.e(map, "input.keyValueMap");
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                block12: {
                    Object var1_13;
                    String string;
                    block10: {
                        Class<?> clazz;
                        Class<?> var1_8;
                        Object v8;
                        Object object;
                        block11: {
                            block9: {
                                string = entry.getKey();
                                object = entry.getValue();
                                if (object != null) {
                                    Class<?> clazz2 = object.getClass();
                                } else {
                                    Class<String> clazz3 = String.class;
                                }
                                v8 = hashMap.get(string);
                                l.e(string, "key");
                                if (v8 != null) break block9;
                                if (var1_8.isArray()) {
                                    Object object3 = object;
                                } else {
                                    Object object4 = this.e(object, (Class<?>)var1_8);
                                }
                                break block10;
                            }
                            clazz = v8.getClass();
                            if (!l.a(clazz, var1_8)) break block11;
                            l.e(object, "value");
                            Object object5 = this.d(v8, object);
                            break block10;
                        }
                        if (!l.a(clazz.getComponentType(), var1_8)) break block12;
                        Object object6 = this.c(v8, object, (Class<?>)var1_8);
                    }
                    l.e(var1_13, "if (existingValue == nul\u2026      }\n                }");
                    hashMap.put(string, var1_13);
                    continue;
                }
                throw new IllegalArgumentException();
            }
        }
        a8.d(hashMap);
        b b8 = a8.a();
        l.e(b8, "output.build()");
        return b8;
    }
}

