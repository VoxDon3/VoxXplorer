/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal.networking.serialization;

import ax.r8.w;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public class UnmodifiableListTypeFactory
implements w {
    @Override
    public <T> TypeAdapter<T> b(Gson gson, a<T> a8) {
        return new TypeAdapter<T>(this, gson.o(this, a8), a8){
            final TypeAdapter a;
            final a b;
            final UnmodifiableListTypeFactory c;
            {
                this.c = unmodifiableListTypeFactory;
                this.a = typeAdapter;
                this.b = a8;
            }

            @Override
            public T c(JsonReader object) throws IOException {
                Object t8 = this.a.c((JsonReader)object);
                object = t8;
                if (List.class.isAssignableFrom(this.b.c())) {
                    object = java.util.DesugarCollections.unmodifiableList((List)((List)t8));
                }
                return object;
            }

            @Override
            public void e(JsonWriter jsonWriter, T t8) throws IOException {
                this.a.e(jsonWriter, t8);
            }
        };
    }
}

