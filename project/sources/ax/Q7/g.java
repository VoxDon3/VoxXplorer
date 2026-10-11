package ax.Q7;

import ax.J7.InterfaceC0777w;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class g {
    private final InterfaceC0777w a;

    g(InterfaceC0777w interfaceC0777w) {
        this.a = interfaceC0777w;
    }

    private static h a(int i) {
        if (i == 3) {
            return new l();
        }
        ax.G7.g.f().d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt("settings_version")).a(this.a, jSONObject);
    }
}
