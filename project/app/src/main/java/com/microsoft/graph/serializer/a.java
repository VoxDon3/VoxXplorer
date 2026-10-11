/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.serializer;

import ax.T9.d;
import ax.r8.i;
import ax.r8.l;
import ax.s8.c;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class a
extends HashMap<String, i> {
    private final d q;

    public a(d d8) {
        this.q = d8;
    }

    private Set<String> b() {
        Field[] fieldArray = this.q.getClass().getFields();
        HashSet<String> hashSet = new HashSet<String>();
        for (Field field : fieldArray) {
            c c8 = field.getAnnotation(c.class);
            if (c8 == null || field.getAnnotation(ax.s8.a.class) == null) continue;
            hashSet.add(c8.value());
        }
        return hashSet;
    }

    private Set<String> c(l object) {
        HashSet<String> hashSet = new HashSet<String>();
        object = ((l)object).s().iterator();
        while (object.hasNext()) {
            hashSet.add((String)((Map.Entry)object.next()).getKey());
        }
        return hashSet;
    }

    final void d(l l8) {
        Object object = this.b();
        Object object2 = new HashSet<String>(this.c(l8));
        object2.removeAll((Collection<?>)object);
        object2 = object2.iterator();
        while (object2.hasNext()) {
            object = (String)object2.next();
            ((AbstractMap)this).put(object, l8.t((String)object));
        }
    }
}

