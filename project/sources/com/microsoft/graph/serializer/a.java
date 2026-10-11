package com.microsoft.graph.serializer;

import ax.T9.d;
import ax.r8.AbstractC3000i;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class a extends HashMap<String, AbstractC3000i> {
    private final d q;

    public a(d dVar) {
        this.q = dVar;
    }

    private Set<String> b() {
        Field[] fields = this.q.getClass().getFields();
        HashSet hashSet = new HashSet();
        for (Field field : fields) {
            InterfaceC3061c interfaceC3061c = (InterfaceC3061c) field.getAnnotation(InterfaceC3061c.class);
            if (interfaceC3061c != null && field.getAnnotation(InterfaceC3059a.class) != null) {
                hashSet.add(interfaceC3061c.value());
            }
        }
        return hashSet;
    }

    private Set<String> c(C3003l c3003l) {
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, AbstractC3000i>> it = c3003l.s().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getKey());
        }
        return hashSet;
    }

    final void d(C3003l c3003l) {
        Set<String> b = b();
        HashSet<String> hashSet = new HashSet(c(c3003l));
        hashSet.removeAll(b);
        for (String str : hashSet) {
            put(str, c3003l.t(str));
        }
    }
}
