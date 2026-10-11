package ax.b1;

import android.os.Build;
import ax.S0.C0987u;
import ax.S0.d0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ax.b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1452a {
    public static byte[] a(byte[] bArr) {
        return Build.VERSION.SDK_INT >= 27 ? bArr : d0.x0(c(d0.H(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(d0.H(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return d0.x0(sb.toString());
        } catch (JSONException e) {
            C0987u.d("ClearKeyUtil", "Failed to adjust response data: " + d0.H(bArr), e);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
