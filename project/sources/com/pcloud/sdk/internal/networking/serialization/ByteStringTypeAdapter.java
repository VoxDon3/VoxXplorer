package com.pcloud.sdk.internal.networking.serialization;

import ax.xc.h;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes3.dex */
public class ByteStringTypeAdapter extends TypeAdapter<h> {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public h c(JsonReader jsonReader) throws IOException {
        return h.j(jsonReader.nextString());
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(JsonWriter jsonWriter, h hVar) throws IOException {
        jsonWriter.value(hVar.t());
    }
}
