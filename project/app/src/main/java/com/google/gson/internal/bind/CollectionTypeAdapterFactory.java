/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.r8.w;
import ax.t8.b;
import ax.t8.c;
import ax.t8.h;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory
implements w {
    private final c q;

    public CollectionTypeAdapterFactory(c c8) {
        this.q = c8;
    }

    @Override
    public <T> TypeAdapter<T> b(Gson gson, a<T> a8) {
        Type type = a8.d();
        Class<T> clazz = a8.c();
        if (!Collection.class.isAssignableFrom(clazz)) {
            return null;
        }
        type = b.h(type, clazz);
        return new Adapter(gson, type, gson.m(a.b(type)), this.q.a(a8));
    }

    private static final class Adapter<E>
    extends TypeAdapter<Collection<E>> {
        private final TypeAdapter<E> a;
        private final h<? extends Collection<E>> b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, h<? extends Collection<E>> h8) {
            this.a = new TypeAdapterRuntimeTypeWrapper<E>(gson, typeAdapter, type);
            this.b = h8;
        }

        public Collection<E> f(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collection = this.b.a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collection.add(this.a.c(jsonReader));
            }
            jsonReader.endArray();
            return collection;
        }

        public void g(JsonWriter jsonWriter, Collection<E> collection2) throws IOException {
            if (collection2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (Collection<E> collection2 : collection2) {
                this.a.e(jsonWriter, collection2);
            }
            jsonWriter.endArray();
        }
    }
}

