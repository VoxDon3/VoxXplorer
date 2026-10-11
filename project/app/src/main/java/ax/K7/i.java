/*
 * Decompiled with CFR 0.152.
 */
package ax.K7;

import ax.K7.a;
import ax.K7.b;
import ax.L7.F;
import ax.W7.d;
import com.google.auto.value.AutoValue;
import org.json.JSONException;
import org.json.JSONObject;

@AutoValue
public abstract class i {
    public static final ax.U7.a a = new d().j(ax.K7.a.a).i();

    static i a(String string) throws JSONException {
        string = new JSONObject(string);
        return i.b(string.getString("rolloutId"), string.getString("parameterKey"), string.getString("parameterValue"), string.getString("variantId"), string.getLong("templateVersion"));
    }

    public static i b(String string, String string2, String string3, String string4, long l8) {
        return new b(string, string2, i.i(string3), string4, l8);
    }

    private static String i(String string) {
        String string2 = string;
        if (string.length() > 256) {
            string2 = string.substring(0, 256);
        }
        return string2;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public F.e.d.e h() {
        return F.e.d.e.a().d(F.e.d.e.b.a().c(this.g()).b(this.e()).a()).b(this.c()).c(this.d()).e(this.f()).a();
    }
}

