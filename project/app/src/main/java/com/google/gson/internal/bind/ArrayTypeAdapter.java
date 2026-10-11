/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.r8.w;
import ax.t8.b;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E>
extends TypeAdapter<Object> {
    public static final w c = new w(){

        @Override
        public <T> TypeAdapter<T> b(Gson gson, a<T> object) {
            if (!((object = ((a)object).d()) instanceof GenericArrayType || object instanceof Class && ((Class)object).isArray())) {
                return null;
            }
            object = ax.t8.b.g((Type)object);
            return new ArrayTypeAdapter(gson, gson.m(ax.x8.a.b((Type)object)), ax.t8.b.k((Type)object));
        }
    };
    private final Class<E> a;
    private final TypeAdapter<E> b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> clazz) {
        this.b = new TypeAdapterRuntimeTypeWrapper<E>(gson, typeAdapter, clazz);
        this.a = clazz;
    }

    @Override
    public Object c(JsonReader object) throws IOException {
        if (((JsonReader)object).peek() == JsonToken.NULL) {
            ((JsonReader)object).nextNull();
            return null;
        }
        ArrayList<E> arrayList = new ArrayList<E>();
        ((JsonReader)object).beginArray();
        while (((JsonReader)object).hasNext()) {
            arrayList.add(this.b.c((JsonReader)object));
        }
        ((JsonReader)object).endArray();
        int n8 = arrayList.size();
        object = Array.newInstance(this.a, n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            Array.set(object, i8, arrayList.get(i8));
        }
        return object;
    }

    @Override
    public void e(JsonWriter jsonWriter, Object object) throws IOException {
        if (object == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int n8 = Array.getLength(object);
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object2 = Array.get(object, i8);
            this.b.e(jsonWriter, object2);
        }
        jsonWriter.endArray();
    }
}

