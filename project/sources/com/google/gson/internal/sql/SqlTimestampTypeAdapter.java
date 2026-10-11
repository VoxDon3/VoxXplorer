package com.google.gson.internal.sql;

import ax.r8.InterfaceC3014w;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes3.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {
    static final InterfaceC3014w b = new InterfaceC3014w() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // ax.r8.InterfaceC3014w
        public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
            if (c3475a.c() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.n(Date.class));
            }
            return null;
        }
    };
    private final TypeAdapter<Date> a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Timestamp c(JsonReader jsonReader) throws IOException {
        Date c = this.a.c(jsonReader);
        if (c != null) {
            return new Timestamp(c.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.a.e(jsonWriter, timestamp);
    }

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.a = typeAdapter;
    }
}
