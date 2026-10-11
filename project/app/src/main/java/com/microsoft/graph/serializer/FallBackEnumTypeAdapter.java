/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.serializer;

import ax.Q9.b;
import ax.r8.w;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FallBackEnumTypeAdapter
implements w {
    private final b q = new ax.Q9.a();

    @Override
    public <T> TypeAdapter<T> b(Gson object, a<T> object22) {
        if (!((Class)(object22 = ((a)object22).c())).isEnum()) {
            return null;
        }
        object = new HashMap();
        for (Object object22 : ((Class)object22).getEnumConstants()) {
            object.put(object22.toString(), object22);
        }
        return new TypeAdapter<T>(this, (Map)object){
            final Map a;
            final FallBackEnumTypeAdapter b;
            {
                this.b = fallBackEnumTypeAdapter;
                this.a = map;
            }

            @Override
            public T c(JsonReader object) throws IOException {
                if (((JsonReader)object).peek() == JsonToken.NULL) {
                    ((JsonReader)object).nextNull();
                    return null;
                }
                Object v8 = this.a.get(object = ((JsonReader)object).nextString());
                if (v8 == null) {
                    this.b.q.a(String.format("The following value %s could not be recognized as a member of the enum", object));
                    return this.a.get("unexpectedValue");
                }
                return v8;
            }

            @Override
            public void e(JsonWriter jsonWriter, T t8) throws IOException {
                if (t8 == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.value(t8.toString());
            }
        };
    }
}

