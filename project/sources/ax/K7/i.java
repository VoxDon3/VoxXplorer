package ax.K7;

import ax.L7.F;
import com.google.auto.value.AutoValue;
import org.json.JSONException;
import org.json.JSONObject;

@AutoValue
/* loaded from: classes3.dex */
public abstract class i {
    public static final ax.U7.a a = new ax.W7.d().j(a.a).i();

    static i a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static i b(String str, String str2, String str3, String str4, long j) {
        return new b(str, str2, i(str3), str4, j);
    }

    private static String i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public F.e.d.AbstractC0138e h() {
        return F.e.d.AbstractC0138e.a().d(F.e.d.AbstractC0138e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
