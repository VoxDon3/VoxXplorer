package com.google.gson.internal.bind;

import ax.r8.C3009r;
import ax.r8.InterfaceC3014w;
import ax.t8.C3105a;
import ax.t8.d;
import ax.t8.i;
import ax.v8.C3290a;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {
    private final b<T> a;
    private final List<DateFormat> b;

    public static abstract class b<T extends Date> {
        public static final b<Date> b = new a(Date.class);
        private final Class<T> a;

        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
            protected Date d(Date date) {
                return date;
            }
        }

        protected b(Class<T> cls) {
            this.a = cls;
        }

        private final InterfaceC3014w c(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.b(this.a, defaultDateTypeAdapter);
        }

        public final InterfaceC3014w a(int i, int i2) {
            return c(new DefaultDateTypeAdapter<>(this, i, i2));
        }

        public final InterfaceC3014w b(String str) {
            return c(new DefaultDateTypeAdapter<>(this, str));
        }

        protected abstract T d(Date date);
    }

    private Date f(JsonReader jsonReader) throws IOException {
        String nextString = jsonReader.nextString();
        synchronized (this.b) {
            try {
                Iterator<DateFormat> it = this.b.iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().parse(nextString);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return C3290a.c(nextString, new ParsePosition(0));
                } catch (ParseException e) {
                    throw new C3009r("Failed parsing '" + nextString + "' as Date; at path " + jsonReader.getPreviousPath(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public T c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.a.d(f(jsonReader));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(JsonWriter jsonWriter, Date date) throws IOException {
        String format;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date);
        }
        jsonWriter.value(format);
    }

    public String toString() {
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    private DefaultDateTypeAdapter(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = (b) C3105a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private DefaultDateTypeAdapter(b<T> bVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = (b) C3105a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (d.d()) {
            arrayList.add(i.c(i, i2));
        }
    }
}
