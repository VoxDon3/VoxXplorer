/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.r8.r;
import ax.r8.w;
import ax.t8.a;
import ax.t8.d;
import ax.t8.i;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
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
import java.util.List;
import java.util.Locale;

public final class DefaultDateTypeAdapter<T extends Date>
extends TypeAdapter<T> {
    private final b<T> a;
    private final List<DateFormat> b;

    private DefaultDateTypeAdapter(b<T> object, int n8, int n9) {
        ArrayList<DateFormat> arrayList = new ArrayList<DateFormat>();
        this.b = arrayList;
        this.a = ax.t8.a.b(object);
        object = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(n8, n9, (Locale)object));
        if (!Locale.getDefault().equals(object)) {
            arrayList.add(DateFormat.getDateTimeInstance(n8, n9));
        }
        if (d.d()) {
            arrayList.add(i.c(n8, n9));
        }
    }

    private DefaultDateTypeAdapter(b<T> object, String string) {
        ArrayList<DateFormat> arrayList = new ArrayList<DateFormat>();
        this.b = arrayList;
        this.a = ax.t8.a.b(object);
        object = Locale.US;
        arrayList.add(new SimpleDateFormat(string, (Locale)object));
        if (!Locale.getDefault().equals(object)) {
            arrayList.add(new SimpleDateFormat(string));
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Date f(JsonReader jsonReader) throws IOException {
        String string = jsonReader.nextString();
        Object object = this.b;
        synchronized (object) {
            try {
                Object object2 = this.b.iterator();
                while (true) {
                    if (object2.hasNext()) {
                        Cloneable cloneable = object2.next();
                        return cloneable.parse(string);
                    }
                    // MONITOREXIT @DISABLED, blocks:[0, 4, 8] lbl11 : MonitorExitStatement: MONITOREXIT : var3_4
                    try {
                        object = new ParsePosition(0);
                        return ax.v8.a.c(string, (ParsePosition)object);
                    }
                    catch (ParseException parseException) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Failed parsing '");
                        ((StringBuilder)object2).append(string);
                        ((StringBuilder)object2).append("' as Date; at path ");
                        ((StringBuilder)object2).append(jsonReader.getPreviousPath());
                        throw new r(((StringBuilder)object2).toString(), parseException);
                    }
                    catch (ParseException parseException) {
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public T g(JsonReader object) throws IOException {
        if (((JsonReader)object).peek() == JsonToken.NULL) {
            ((JsonReader)object).nextNull();
            return null;
        }
        object = this.f((JsonReader)object);
        return this.a.d((Date)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h(JsonWriter jsonWriter, Date object) throws IOException {
        if (object == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = this.b.get(0);
        List<DateFormat> list = this.b;
        synchronized (list) {
            object = dateFormat.format((Date)object);
        }
        jsonWriter.value((String)object);
    }

    public String toString() {
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DefaultDateTypeAdapter(");
            stringBuilder.append(((SimpleDateFormat)dateFormat).toPattern());
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DefaultDateTypeAdapter(");
        stringBuilder.append(dateFormat.getClass().getSimpleName());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static abstract class b<T extends Date> {
        public static final b<Date> b = new b<Date>(Date.class){

            @Override
            protected Date d(Date date) {
                return date;
            }
        };
        private final Class<T> a;

        protected b(Class<T> clazz) {
            this.a = clazz;
        }

        private final w c(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.b(this.a, defaultDateTypeAdapter);
        }

        public final w a(int n8, int n9) {
            return this.c(new DefaultDateTypeAdapter(this, n8, n9));
        }

        public final w b(String string) {
            return this.c(new DefaultDateTypeAdapter(this, string));
        }

        protected abstract T d(Date var1);
    }
}

