package com.google.gson;

import ax.r8.AbstractC3000i;
import ax.r8.C3001j;
import ax.u8.C3220a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class TypeAdapter<T> {
    public final T a(AbstractC3000i abstractC3000i) {
        try {
            return c(new com.google.gson.internal.bind.a(abstractC3000i));
        } catch (IOException e) {
            throw new C3001j(e);
        }
    }

    public final TypeAdapter<T> b() {
        return new TypeAdapter<T>() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public T c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return (T) TypeAdapter.this.c(jsonReader);
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void e(JsonWriter jsonWriter, T t) throws IOException {
                if (t == null) {
                    jsonWriter.nullValue();
                } else {
                    TypeAdapter.this.e(jsonWriter, t);
                }
            }
        };
    }

    public abstract T c(JsonReader jsonReader) throws IOException;

    public final AbstractC3000i d(T t) {
        try {
            C3220a c3220a = new C3220a();
            e(c3220a, t);
            return c3220a.a();
        } catch (IOException e) {
            throw new C3001j(e);
        }
    }

    public abstract void e(JsonWriter jsonWriter, T t) throws IOException;
}
