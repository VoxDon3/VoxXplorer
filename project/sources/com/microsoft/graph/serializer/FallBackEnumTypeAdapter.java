package com.microsoft.graph.serializer;

import ax.r8.InterfaceC3014w;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class FallBackEnumTypeAdapter implements InterfaceC3014w {
    private final ax.Q9.b q = new ax.Q9.a();

    @Override // ax.r8.InterfaceC3014w
    public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
        Class<? super T> c = c3475a.c();
        if (!c.isEnum()) {
            return null;
        }
        final HashMap hashMap = new HashMap();
        for (Object obj : c.getEnumConstants()) {
            hashMap.put(obj.toString(), obj);
        }
        return new TypeAdapter<T>() { // from class: com.microsoft.graph.serializer.FallBackEnumTypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public T c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                T t = (T) hashMap.get(nextString);
                if (t != null) {
                    return t;
                }
                FallBackEnumTypeAdapter.this.q.a(String.format("The following value %s could not be recognized as a member of the enum", nextString));
                return (T) hashMap.get("unexpectedValue");
            }

            @Override // com.google.gson.TypeAdapter
            public void e(JsonWriter jsonWriter, T t) throws IOException {
                if (t == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(t.toString());
                }
            }
        };
    }
}
