/*
 * Decompiled with CFR 0.152.
 */
package ax.Q7;

import ax.J7.w;
import ax.Q7.b;
import ax.Q7.d;
import ax.Q7.h;
import ax.Q7.l;
import org.json.JSONException;
import org.json.JSONObject;

public class g {
    private final w a;

    g(w w8) {
        this.a = w8;
    }

    private static h a(int n8) {
        if (n8 != 3) {
            ax.G7.g g8 = ax.G7.g.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not determine SettingsJsonTransform for settings version ");
            stringBuilder.append(n8);
            stringBuilder.append(". Using default settings values.");
            g8.d(stringBuilder.toString());
            return new b();
        }
        return new l();
    }

    public d b(JSONObject jSONObject) throws JSONException {
        return g.a(jSONObject.getInt("settings_version")).a(this.a, jSONObject);
    }
}

