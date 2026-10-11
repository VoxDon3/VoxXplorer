package ax.x7;

import android.content.Context;
import android.text.TextUtils;
import ax.M5.C0819n;
import ax.M5.C0821p;
import ax.M5.C0823s;

/* loaded from: classes3.dex */
public final class n {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C0821p.p(!ax.R5.o.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static n a(Context context) {
        C0823s c0823s = new C0823s(context);
        String a = c0823s.a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new n(a, c0823s.a("google_api_key"), c0823s.a("firebase_database_url"), c0823s.a("ga_trackingId"), c0823s.a("gcm_defaultSenderId"), c0823s.a("google_storage_bucket"), c0823s.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return C0819n.b(this.b, nVar.b) && C0819n.b(this.a, nVar.a) && C0819n.b(this.c, nVar.c) && C0819n.b(this.d, nVar.d) && C0819n.b(this.e, nVar.e) && C0819n.b(this.f, nVar.f) && C0819n.b(this.g, nVar.g);
    }

    public int hashCode() {
        return C0819n.c(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return C0819n.d(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
}
