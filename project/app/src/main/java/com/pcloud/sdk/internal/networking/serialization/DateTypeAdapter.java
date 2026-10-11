/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal.networking.serialization;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Date;

public class DateTypeAdapter
extends TypeAdapter<Date> {
    public Date f(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NUMBER) {
            return new Date(jsonReader.nextLong() * 1000L);
        }
        return null;
    }

    public void g(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.value(date.getTime());
    }
}

