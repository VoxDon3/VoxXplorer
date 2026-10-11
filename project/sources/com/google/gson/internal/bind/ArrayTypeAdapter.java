package com.google.gson.internal.bind;

import ax.r8.InterfaceC3014w;
import ax.t8.C3106b;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {
    public static final InterfaceC3014w c = new InterfaceC3014w() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // ax.r8.InterfaceC3014w
        public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
            Type d = c3475a.d();
            if (!(d instanceof GenericArrayType) && (!(d instanceof Class) || !((Class) d).isArray())) {
                return null;
            }
            Type g = C3106b.g(d);
            return new ArrayTypeAdapter(gson, gson.m(C3475a.b(g)), C3106b.k(g));
        }
    };
    private final Class<E> a;
    private final TypeAdapter<E> b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.a = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public Object c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.b.c(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public void e(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.e(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
