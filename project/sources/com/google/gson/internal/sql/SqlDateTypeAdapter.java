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
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes3.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    static final InterfaceC3014w b = new InterfaceC3014w() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // ax.r8.InterfaceC3014w
        public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
            if (c3475a.c() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date c(JsonReader jsonReader) throws IOException {
        java.util.Date parse;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        try {
            synchronized (this) {
                parse = this.a.parse(nextString);
            }
            return new Date(parse.getTime());
        } catch (ParseException e) {
            throw new C3009r("Failed parsing '" + nextString + "' as SQL Date; at path " + jsonReader.getPreviousPath(), e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(JsonWriter jsonWriter, Date date) throws IOException {
        String format;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date);
        }
        jsonWriter.value(format);
    }

    private SqlDateTypeAdapter() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
}
