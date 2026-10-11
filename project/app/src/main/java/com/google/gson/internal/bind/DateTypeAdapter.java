/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.r8.r;
import ax.r8.w;
import ax.t8.d;
import ax.t8.i;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter
extends TypeAdapter<Date> {
    public static final w b = new w(){

        @Override
        public <T> TypeAdapter<T> b(Gson gson, a<T> a8) {
            if (a8.c() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    private final List<DateFormat> a;

    public DateTypeAdapter() {
        ArrayList<DateFormat> arrayList = new ArrayList<DateFormat>();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.d()) {
            arrayList.add(i.c(2, 2));
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
        Object object = this.a;
        synchronized (object) {
            try {
                Iterator<DateFormat> iterator = this.a.iterator();
                while (true) {
                    if (iterator.hasNext()) {
                        Cloneable cloneable = iterator.next();
                        return cloneable.parse(string);
                    }
                    // MONITOREXIT @DISABLED, blocks:[0, 4, 8] lbl11 : MonitorExitStatement: MONITOREXIT : var3_4
                    try {
                        object = new ParsePosition(0);
                        return ax.v8.a.c(string, (ParsePosition)object);
                    }
                    catch (ParseException parseException) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Failed parsing '");
                        ((StringBuilder)object).append(string);
                        ((StringBuilder)object).append("' as Date; at path ");
                        ((StringBuilder)object).append(jsonReader.getPreviousPath());
                        throw new r(((StringBuilder)object).toString(), parseException);
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

    public Date g(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.f(jsonReader);
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
        DateFormat dateFormat = this.a.get(0);
        List<DateFormat> list = this.a;
        synchronized (list) {
            object = dateFormat.format((Date)object);
        }
        jsonWriter.value((String)object);
    }
}

