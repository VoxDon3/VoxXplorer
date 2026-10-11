/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.os.Build;
import ax.S0.d0;
import ax.S0.u;
import org.json.JSONException;
import org.json.JSONObject;

final class a {
    public static byte[] a(byte[] byArray) {
        if (Build.VERSION.SDK_INT >= 27) {
            return byArray;
        }
        return d0.x0(a.c(d0.H(byArray)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] b(byte[] byArray) {
        Object object;
        if (Build.VERSION.SDK_INT >= 27) {
            return byArray;
        }
        try {
            object = new JSONObject(d0.H(byArray));
            Object object2 = new StringBuilder("{\"keys\":[");
            object = object.getJSONArray("keys");
            for (int i8 = 0; i8 < object.length(); ++i8) {
                if (i8 != 0) {
                    ((StringBuilder)object2).append(",");
                }
                JSONObject jSONObject = object.getJSONObject(i8);
                ((StringBuilder)object2).append("{\"k\":\"");
                ((StringBuilder)object2).append(a.d(jSONObject.getString("k")));
                ((StringBuilder)object2).append("\",\"kid\":\"");
                ((StringBuilder)object2).append(a.d(jSONObject.getString("kid")));
                ((StringBuilder)object2).append("\",\"kty\":\"");
                ((StringBuilder)object2).append(jSONObject.getString("kty"));
                ((StringBuilder)object2).append("\"}");
            }
            ((StringBuilder)object2).append("]}");
            return d0.x0(((StringBuilder)object2).toString());
        }
        catch (JSONException jSONException) {}
        object = new StringBuilder();
        ((StringBuilder)object).append("Failed to adjust response data: ");
        ((StringBuilder)object).append(d0.H(byArray));
        u.d("ClearKeyUtil", ((StringBuilder)object).toString(), jSONException);
        return byArray;
    }

    private static String c(String string) {
        return string.replace('+', '-').replace('/', '_');
    }

    private static String d(String string) {
        return string.replace('-', '+').replace('_', '/');
    }
}

