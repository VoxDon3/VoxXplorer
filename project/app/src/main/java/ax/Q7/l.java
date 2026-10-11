/*
 * Decompiled with CFR 0.152.
 */
package ax.Q7;

import ax.J7.w;
import ax.Q7.d;
import ax.Q7.h;
import org.json.JSONException;
import org.json.JSONObject;

class l
implements h {
    l() {
    }

    private static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(w w8, long l8, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return w8.a() + l8 * 1000L;
    }

    @Override
    public d a(w w8, JSONObject jSONObject) throws JSONException {
        int n8 = jSONObject.optInt("settings_version", 0);
        int n9 = jSONObject.optInt("cache_duration", 3600);
        double d8 = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0);
        double d9 = jSONObject.optDouble("on_demand_backoff_base", 1.2);
        int n10 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        d.b b8 = jSONObject.has("session") ? l.c(jSONObject.getJSONObject("session")) : l.c(new JSONObject());
        d.a a8 = l.b(jSONObject.getJSONObject("features"));
        return new d(l.d(w8, n9, jSONObject), b8, a8, n8, n9, d8, d9, n10);
    }
}

