package androidx.work;

import androidx.work.b;
import ax.B2.g;
import ax.Gb.l;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends g {
    private final Object c(Object obj, Object obj2, Class<?> cls) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        l.e(newInstance, "newArray");
        return newInstance;
    }

    private final Object d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        l.c(componentType);
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        l.e(newInstance, "newArray");
        return newInstance;
    }

    private final Object e(Object obj, Class<?> cls) {
        Object newInstance = Array.newInstance(cls, 1);
        Array.set(newInstance, 0, obj);
        l.e(newInstance, "newArray");
        return newInstance;
    }

    @Override // ax.B2.g
    public b b(List<b> list) {
        l.f(list, "inputs");
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            Map<String, Object> h = it.next().h();
            l.e(h, "input.keyValueMap");
            for (Map.Entry<String, Object> entry : h.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = hashMap.get(key);
                l.e(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (l.a(cls2, cls)) {
                        l.e(value, "value");
                        value = d(obj, value);
                    } else {
                        if (!l.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        value = c(obj, value, cls);
                    }
                } else if (!cls.isArray()) {
                    value = e(value, cls);
                }
                l.e(value, "if (existingValue == nul…      }\n                }");
                hashMap.put(key, value);
            }
        }
        aVar.d(hashMap);
        b a = aVar.a();
        l.e(a, "output.build()");
        return a;
    }
}
