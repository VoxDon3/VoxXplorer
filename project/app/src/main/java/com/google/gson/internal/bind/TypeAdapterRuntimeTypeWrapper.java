/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper<T>
extends TypeAdapter<T> {
    private final Gson a;
    private final TypeAdapter<T> b;
    private final Type c;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.a = gson;
        this.b = typeAdapter;
        this.c = type;
    }

    private Type f(Type clazz, Object object) {
        Class<?> clazz2;
        block2: {
            block3: {
                clazz2 = clazz;
                if (object == null) break block2;
                if (clazz == Object.class || clazz instanceof TypeVariable) break block3;
                clazz2 = clazz;
                if (!(clazz instanceof Class)) break block2;
            }
            clazz2 = object.getClass();
        }
        return clazz2;
    }

    @Override
    public T c(JsonReader jsonReader) throws IOException {
        return this.b.c(jsonReader);
    }

    @Override
    public void e(JsonWriter jsonWriter, T t8) throws IOException {
        Object object = this.b;
        Object object2 = this.f(this.c, t8);
        if (object2 != this.c && (object = this.a.m(ax.x8.a.b((Type)object2))) instanceof ReflectiveTypeAdapterFactory.Adapter && !((object2 = this.b) instanceof ReflectiveTypeAdapterFactory.Adapter)) {
            object = object2;
        }
        ((TypeAdapter)object).e(jsonWriter, t8);
    }
}

