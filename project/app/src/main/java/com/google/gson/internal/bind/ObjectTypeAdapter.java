/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.r8.u;
import ax.r8.v;
import ax.r8.w;
import ax.t8.g;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ObjectTypeAdapter
extends TypeAdapter<Object> {
    private static final w c = ObjectTypeAdapter.g(u.q);
    private final Gson a;
    private final v b;

    private ObjectTypeAdapter(Gson gson, v v8) {
        this.a = gson;
        this.b = v8;
    }

    public static w f(v v8) {
        if (v8 == u.q) {
            return c;
        }
        return ObjectTypeAdapter.g(v8);
    }

    private static w g(v v8) {
        return new w(v8){
            final v q;
            {
                this.q = v8;
            }

            @Override
            public <T> TypeAdapter<T> b(Gson gson, ax.x8.a<T> a8) {
                if (a8.c() == Object.class) {
                    return new ObjectTypeAdapter(gson, this.q);
                }
                return null;
            }
        };
    }

    private Object h(JsonReader object, JsonToken jsonToken) throws IOException {
        int n8 = com.google.gson.internal.bind.ObjectTypeAdapter$a.a[jsonToken.ordinal()];
        if (n8 != 3) {
            if (n8 != 4) {
                if (n8 != 5) {
                    if (n8 == 6) {
                        ((JsonReader)object).nextNull();
                        return null;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unexpected token: ");
                    ((StringBuilder)object).append((Object)jsonToken);
                    throw new IllegalStateException(((StringBuilder)object).toString());
                }
                return ((JsonReader)object).nextBoolean();
            }
            return this.b.d((JsonReader)object);
        }
        return ((JsonReader)object).nextString();
    }

    private Object i(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int n8 = com.google.gson.internal.bind.ObjectTypeAdapter$a.a[jsonToken.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                return null;
            }
            jsonReader.beginObject();
            return new g();
        }
        jsonReader.beginArray();
        return new ArrayList();
    }

    @Override
    public Object c(JsonReader jsonReader) throws IOException {
        Object object = jsonReader.peek();
        Object object2 = this.i(jsonReader, (JsonToken)((Object)object));
        if (object2 == null) {
            return this.h(jsonReader, (JsonToken)((Object)object));
        }
        ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
        while (true) {
            if (jsonReader.hasNext()) {
                String string = object2 instanceof Map ? jsonReader.nextName() : null;
                JsonToken jsonToken = jsonReader.peek();
                Object object3 = this.i(jsonReader, jsonToken);
                boolean bl = object3 != null;
                object = object3;
                if (object3 == null) {
                    object = this.h(jsonReader, jsonToken);
                }
                if (object2 instanceof List) {
                    ((List)object2).add(object);
                } else {
                    ((Map)object2).put(string, object);
                }
                if (!bl) continue;
                arrayDeque.addLast(object2);
                object2 = object;
                continue;
            }
            if (object2 instanceof List) {
                jsonReader.endArray();
            } else {
                jsonReader.endObject();
            }
            if (arrayDeque.isEmpty()) {
                return object2;
            }
            object2 = arrayDeque.removeLast();
        }
    }

    @Override
    public void e(JsonWriter jsonWriter, Object object) throws IOException {
        if (object == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter<?> typeAdapter = this.a.n(object.getClass());
        if (typeAdapter instanceof ObjectTypeAdapter) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
            return;
        }
        typeAdapter.e(jsonWriter, object);
    }
}

