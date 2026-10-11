/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.sql;

import ax.r8.r;
import ax.r8.w;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

final class SqlDateTypeAdapter
extends TypeAdapter<java.sql.Date> {
    static final w b = new w(){

        @Override
        public <T> TypeAdapter<T> b(Gson gson, a<T> a8) {
            if (a8.c() == java.sql.Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat a = new SimpleDateFormat("MMM d, yyyy");

    private SqlDateTypeAdapter() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public java.sql.Date f(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String string = jsonReader.nextString();
        try {
            synchronized (this) {
            }
        }
        catch (ParseException parseException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed parsing '");
            stringBuilder.append(string);
            stringBuilder.append("' as SQL Date; at path ");
            stringBuilder.append(jsonReader.getPreviousPath());
            throw new r(stringBuilder.toString(), parseException);
        }
        {
            Date date = this.a.parse(string);
            return new java.sql.Date(date.getTime());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(JsonWriter jsonWriter, java.sql.Date object) throws IOException {
        if (object == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            object = this.a.format((Date)object);
        }
        jsonWriter.value((String)object);
    }
}

