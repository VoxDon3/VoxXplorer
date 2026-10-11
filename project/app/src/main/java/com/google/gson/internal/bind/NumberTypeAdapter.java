/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.r8.r;
import ax.r8.u;
import ax.r8.v;
import ax.r8.w;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class NumberTypeAdapter
extends TypeAdapter<Number> {
    private static final w b = NumberTypeAdapter.g(u.c0);
    private final v a;

    private NumberTypeAdapter(v v8) {
        this.a = v8;
    }

    public static w f(v v8) {
        if (v8 == u.c0) {
            return b;
        }
        return NumberTypeAdapter.g(v8);
    }

    private static w g(v v8) {
        return new w(new NumberTypeAdapter(v8)){
            final NumberTypeAdapter q;
            {
                this.q = numberTypeAdapter;
            }

            @Override
            public <T> TypeAdapter<T> b(Gson gson, ax.x8.a<T> a8) {
                if (a8.c() == Number.class) {
                    return this.q;
                }
                return null;
            }
        };
    }

    public Number h(JsonReader jsonReader) throws IOException {
        JsonToken jsonToken = jsonReader.peek();
        int n8 = com.google.gson.internal.bind.NumberTypeAdapter$a.a[jsonToken.ordinal()];
        if (n8 != 1) {
            if (n8 != 2 && n8 != 3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expecting number, got: ");
                stringBuilder.append((Object)jsonToken);
                stringBuilder.append("; at path ");
                stringBuilder.append(jsonReader.getPath());
                throw new r(stringBuilder.toString());
            }
            return this.a.d(jsonReader);
        }
        jsonReader.nextNull();
        return null;
    }

    public void i(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}

