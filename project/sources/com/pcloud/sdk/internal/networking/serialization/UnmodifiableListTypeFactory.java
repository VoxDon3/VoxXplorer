package com.pcloud.sdk.internal.networking.serialization;

import ax.r8.InterfaceC3014w;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public class UnmodifiableListTypeFactory implements InterfaceC3014w {
    @Override // ax.r8.InterfaceC3014w
    public <T> TypeAdapter<T> b(Gson gson, final C3475a<T> c3475a) {
        final TypeAdapter<T> o = gson.o(this, c3475a);
        return new TypeAdapter<T>() { // from class: com.pcloud.sdk.internal.networking.serialization.UnmodifiableListTypeFactory.1
            @Override // com.google.gson.TypeAdapter
            public T c(JsonReader jsonReader) throws IOException {
                T t = (T) o.c(jsonReader);
                return List.class.isAssignableFrom(c3475a.c()) ? (T) DesugarCollections.unmodifiableList((List) t) : t;
            }

            @Override // com.google.gson.TypeAdapter
            public void e(JsonWriter jsonWriter, T t) throws IOException {
                o.e(jsonWriter, t);
            }
        };
    }
}
