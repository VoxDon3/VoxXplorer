package ax.y7;

import android.text.TextUtils;
import ax.A7.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: ax.y7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3510b {
    private static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    static final DateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    private final String a;
    private final String b;
    private final String c;
    private final Date d;
    private final long e;
    private final long f;

    public C3510b(String str, String str2, String str3, Date date, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j;
        this.f = j2;
    }

    static C3510b a(a.c cVar) {
        String str = cVar.d;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return new C3510b(cVar.b, String.valueOf(cVar.c), str, new Date(cVar.m), cVar.e, cVar.j);
    }

    static C3510b b(Map<String, String> map) throws C3509a {
        g(map);
        try {
            return new C3510b(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : HttpUrl.FRAGMENT_ENCODE_SET, h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e) {
            throw new C3509a("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new C3509a("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    private static void g(Map<String, String> map) throws C3509a {
        ArrayList arrayList = new ArrayList();
        for (String str : g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new C3509a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
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

    a.c f(String str) {
        a.c cVar = new a.c();
        cVar.a = str;
        cVar.m = d();
        cVar.b = this.a;
        cVar.c = this.b;
        cVar.d = TextUtils.isEmpty(this.c) ? null : this.c;
        cVar.e = this.e;
        cVar.j = this.f;
        return cVar;
    }
}
