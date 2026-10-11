/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.serializer;

import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import com.google.gson.Gson;
import com.microsoft.graph.serializer.GsonFactory;
import com.microsoft.graph.serializer.a;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

public class b
implements e {
    private final Gson a;
    private final ax.Q9.b b;

    public b(ax.Q9.b b8) {
        this.b = b8;
        this.a = GsonFactory.a(b8);
    }

    private boolean c(Map.Entry<String, i> entry) {
        return entry.getKey().startsWith("@");
    }

    @Override
    public <T> String a(T object) {
        Iterator iterator = this.b;
        Map.Entry<String, i> entry = new StringBuilder();
        ((StringBuilder)((Object)entry)).append("Serializing type ");
        ((StringBuilder)((Object)entry)).append(object.getClass().getSimpleName());
        iterator.a(((StringBuilder)((Object)entry)).toString());
        iterator = this.a.z(object);
        entry = iterator;
        if (object instanceof d) {
            a a8 = ((d)object).c();
            entry = iterator;
            if (((i)((Object)iterator)).p()) {
                object = ((i)((Object)iterator)).h();
                iterator = ((AbstractMap)a8).entrySet().iterator();
                while (true) {
                    entry = object;
                    if (!iterator.hasNext()) break;
                    entry = iterator.next();
                    if (this.c(entry)) continue;
                    ((l)object).r(entry.getKey(), entry.getValue());
                }
            }
        }
        return ((i)((Object)entry)).toString();
    }

    @Override
    public <T> T b(String object, Class<T> object2) {
        T t8 = this.a.k((String)object, object2);
        if (t8 instanceof d) {
            ax.Q9.b b8 = this.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Deserializing type ");
            stringBuilder.append(((Class)object2).getSimpleName());
            b8.a(stringBuilder.toString());
            object2 = (d)t8;
            object = this.a.k((String)object, l.class);
            object2.d(this, (l)object);
            object2.c().d((l)object);
            return t8;
        }
        ax.Q9.b b9 = this.b;
        object = new StringBuilder();
        ((StringBuilder)object).append("Deserializing a non-IJsonBackedObject type ");
        ((StringBuilder)object).append(((Class)object2).getSimpleName());
        b9.a(((StringBuilder)object).toString());
        return t8;
    }
}

