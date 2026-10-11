/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import ax.r8.i;
import ax.r8.j;
import com.google.gson.internal.bind.a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public abstract class TypeAdapter<T> {
    public final T a(i i8) {
        try {
            a a8 = new a(i8);
            i8 = this.c(a8);
        }
        catch (IOException iOException) {
            throw new j(iOException);
        }
        return (T)i8;
    }

    public final TypeAdapter<T> b() {
        return new TypeAdapter<T>(this){
            final TypeAdapter a;
            {
                this.a = typeAdapter;
            }

            @Override
            public T c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return this.a.c(jsonReader);
            }

            @Override
            public void e(JsonWriter jsonWriter, T t8) throws IOException {
                if (t8 == null) {
                    jsonWriter.nullValue();
                    return;
                }
                this.a.e(jsonWriter, t8);
            }
        };
    }

    public abstract T c(JsonReader var1) throws IOException;

    public final i d(T object) {
        try {
            ax.u8.a a8 = new ax.u8.a();
            this.e(a8, object);
            object = a8.a();
            return object;
        }
        catch (IOException iOException) {
            throw new j(iOException);
        }
    }

    public abstract void e(JsonWriter var1, T var2) throws IOException;
}

