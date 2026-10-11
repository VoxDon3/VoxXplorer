/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.license.components;

import ax.r8.i;
import ax.r8.l;
import ax.r8.m;
import ax.r8.o;
import ax.r8.w;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class RuntimeTypeAdapterFactory<T>
implements w {
    private final String c0;
    private final Map<String, Class<?>> d0;
    private final Map<Class<?>, String> e0;
    private final Class<?> q;

    public <R> TypeAdapter<R> b(Gson gson, a<R> object) {
        if (((a)((Object)object)).c() != this.q) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.d0.entrySet()) {
            TypeAdapter<?> typeAdapter = gson.o(this, a.a(entry.getValue()));
            linkedHashMap.put(entry.getKey(), typeAdapter);
            linkedHashMap2.put(entry.getValue(), typeAdapter);
        }
        return new TypeAdapter<R>(this, linkedHashMap, linkedHashMap2){
            final Map a;
            final Map b;
            final RuntimeTypeAdapterFactory c;
            {
                this.c = runtimeTypeAdapterFactory;
                this.a = map;
                this.b = map2;
            }

            @Override
            public R c(JsonReader object) throws IOException {
                Object object2 = ((i)(object = ax.t8.l.a((JsonReader)object))).h().y(this.c.c0);
                if (object2 != null) {
                    TypeAdapter typeAdapter = (TypeAdapter)this.a.get(object2 = ((i)object2).k());
                    if (typeAdapter != null) {
                        return typeAdapter.a((i)object);
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("cannot deserialize ");
                    ((StringBuilder)object).append(this.c.q);
                    ((StringBuilder)object).append(" subtype named ");
                    ((StringBuilder)object).append((String)object2);
                    ((StringBuilder)object).append("; did you forget to register a subtype?");
                    throw new m(((StringBuilder)object).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("cannot deserialize ");
                ((StringBuilder)object).append(this.c.q);
                ((StringBuilder)object).append(" because it does not define a field named ");
                ((StringBuilder)object).append(this.c.c0);
                throw new m(((StringBuilder)object).toString());
            }

            @Override
            public void e(JsonWriter object, R object2) throws IOException {
                Class<?> object32 = object2.getClass();
                String string = (String)this.c.e0.get(object32);
                Object object3 = (TypeAdapter)this.b.get(object32);
                if (object3 != null) {
                    if (!((l)(object3 = ((TypeAdapter)object3).d(object2).h())).x(this.c.c0)) {
                        object2 = new l();
                        ((l)object2).r(this.c.c0, new o(string));
                        for (Map.Entry entry : ((l)object3).s()) {
                            ((l)object2).r((String)entry.getKey(), (i)entry.getValue());
                        }
                        ax.t8.l.b((i)object2, (JsonWriter)object);
                        return;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("cannot serialize ");
                    ((StringBuilder)object).append(object32.getName());
                    ((StringBuilder)object).append(" because it already defines a field named ");
                    ((StringBuilder)object).append(this.c.c0);
                    throw new m(((StringBuilder)object).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("cannot serialize ");
                ((StringBuilder)object).append(object32.getName());
                ((StringBuilder)object).append("; did you forget to register a subtype?");
                throw new m(((StringBuilder)object).toString());
            }
        }.b();
    }
}

