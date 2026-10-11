package com.google.gson.internal.sql;

import ax.r8.C3009r;
import ax.r8.InterfaceC3014w;
import ax.x8.C3475a;
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

/* loaded from: classes3.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {
    static final InterfaceC3014w b = new InterfaceC3014w() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // ax.r8.InterfaceC3014w
        public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
            if (c3475a.c() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Time c(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        try {
            synchronized (this) {
                time = new Time(this.a.parse(nextString).getTime());
            }
            return time;
        } catch (ParseException e) {
            throw new C3009r("Failed parsing '" + nextString + "' as SQL Time; at path " + jsonReader.getPreviousPath(), e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(JsonWriter jsonWriter, Time time) throws IOException {
        String format;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time);
        }
        jsonWriter.value(format);
    }

    private SqlTimeTypeAdapter() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
}
