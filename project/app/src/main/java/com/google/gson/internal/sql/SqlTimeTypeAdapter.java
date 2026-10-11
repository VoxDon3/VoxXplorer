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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

final class SqlTimeTypeAdapter
extends TypeAdapter<Time> {
    static final w b = new w(){

        @Override
        public <T> TypeAdapter<T> b(Gson gson, a<T> a8) {
            if (a8.c() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    private SqlTimeTypeAdapter() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Time f(JsonReader jsonReader) throws IOException {
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
            stringBuilder.append("' as SQL Time; at path ");
            stringBuilder.append(jsonReader.getPreviousPath());
            throw new r(stringBuilder.toString(), parseException);
        }
        {
            Date date = this.a.parse(string);
            return new Time(date.getTime());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(JsonWriter jsonWriter, Time object) throws IOException {
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

