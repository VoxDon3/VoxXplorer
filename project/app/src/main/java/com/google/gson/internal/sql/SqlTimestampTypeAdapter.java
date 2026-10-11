/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.sql;

import ax.r8.w;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

class SqlTimestampTypeAdapter
extends TypeAdapter<Timestamp> {
    static final w b = new w(){

        @Override
        public <T> TypeAdapter<T> b(Gson gson, a<T> a8) {
            if (a8.c() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.n(Date.class));
            }
            return null;
        }
    };
    private final TypeAdapter<Date> a;

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.a = typeAdapter;
    }

    public Timestamp f(JsonReader object) throws IOException {
        if ((object = this.a.c((JsonReader)object)) != null) {
            return new Timestamp(((Date)object).getTime());
        }
        return null;
    }

    public void g(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.a.e(jsonWriter, timestamp);
    }
}

