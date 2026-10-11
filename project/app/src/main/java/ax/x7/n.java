/*
 * Decompiled with CFR 0.152.
 */
package ax.x7;

import android.content.Context;
import android.text.TextUtils;
import ax.M5.p;
import ax.M5.s;
import ax.R5.o;

public final class n {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private n(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        p.p(o.a(string) ^ true, "ApplicationId must be set.");
        this.b = string;
        this.a = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = string6;
        this.g = string7;
    }

    public static n a(Context object) {
        String string = ((s)(object = new s((Context)object))).a("google_app_id");
        if (TextUtils.isEmpty((CharSequence)string)) {
            return null;
        }
        return new n(string, ((s)object).a("google_api_key"), ((s)object).a("firebase_database_url"), ((s)object).a("ga_trackingId"), ((s)object).a("gcm_defaultSenderId"), ((s)object).a("google_storage_bucket"), ((s)object).a("project_id"));
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

    public boolean equals(Object object) {
        if (!(object instanceof n)) {
            return false;
        }
        object = (n)object;
        return ax.M5.n.b(this.b, ((n)object).b) && ax.M5.n.b(this.a, ((n)object).a) && ax.M5.n.b(this.c, ((n)object).c) && ax.M5.n.b(this.d, ((n)object).d) && ax.M5.n.b(this.e, ((n)object).e) && ax.M5.n.b(this.f, ((n)object).f) && ax.M5.n.b(this.g, ((n)object).g);
    }

    public int hashCode() {
        return ax.M5.n.c(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return ax.M5.n.d(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
}

