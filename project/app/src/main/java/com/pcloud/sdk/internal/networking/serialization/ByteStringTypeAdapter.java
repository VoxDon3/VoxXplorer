/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal.networking.serialization;

import ax.xc.h;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class ByteStringTypeAdapter
extends TypeAdapter<h> {
    public h f(JsonReader jsonReader) throws IOException {
        return h.j(jsonReader.nextString());
    }

    public void g(JsonWriter jsonWriter, h h8) throws IOException {
        jsonWriter.value(h8.t());
    }
}

