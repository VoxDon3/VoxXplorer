/*
 * Decompiled with CFR 0.152.
 */
package ax.y7;

import android.text.TextUtils;
import ax.A7.a;
import ax.y7.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class b {
    private static final String[] g = new String[]{"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    static final DateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    private final String a;
    private final String b;
    private final String c;
    private final Date d;
    private final long e;
    private final long f;

    public b(String string, String string2, String string3, Date date, long l8, long l9) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = date;
        this.e = l8;
        this.f = l9;
    }

    static b a(a.c c8) {
        String string;
        block0: {
            string = c8.d;
            if (string != null) break block0;
            string = "";
        }
        return new b(c8.b, String.valueOf(c8.c), string, new Date(c8.m), c8.e, c8.j);
    }

    static b b(Map<String, String> object) throws a {
        String string;
        String string2;
        long l8;
        long l9;
        Date date;
        block5: {
            ax.y7.b.g(object);
            date = h.parse(object.get("experimentStartTime"));
            l9 = Long.parseLong(object.get("triggerTimeoutMillis"));
            l8 = Long.parseLong(object.get("timeToLiveMillis"));
            string2 = object.get("experimentId");
            string = object.get("variantId");
            if (object.containsKey("triggerEvent")) {
                object = object.get("triggerEvent");
                break block5;
            }
            object = "";
        }
        try {
            object = new b(string2, string, (String)object, date, l9, l8);
            return object;
        }
        catch (NumberFormatException numberFormatException) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", numberFormatException);
        }
        catch (ParseException parseException) {
            throw new a("Could not process experiment: parsing experiment start time failed.", parseException);
        }
    }

    private static void g(Map<String, String> map) throws a {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string : g) {
            if (map.containsKey(string)) continue;
            arrayList.add(string);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
    }

    String c() {
        return this.a;
    }

    long d() {
        return this.d.getTime();
    }

    String e() {
        return this.b;
    }

    a.c f(String string) {
        a.c c8 = new a.c();
        c8.a = string;
        c8.m = this.d();
        c8.b = this.a;
        c8.c = this.b;
        string = TextUtils.isEmpty((CharSequence)this.c) ? null : this.c;
        c8.d = string;
        c8.e = this.e;
        c8.j = this.f;
        return c8;
    }
}

