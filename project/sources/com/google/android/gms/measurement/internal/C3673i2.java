package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import ax.M5.C0821p;
import ax.b6.C1602k7;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3673i2 {
    private final String a;
    private final Bundle b;
    private Bundle c;
    private final /* synthetic */ C3659g2 d;

    public C3673i2(C3659g2 c3659g2, String str, Bundle bundle) {
        this.d = c3659g2;
        C0821p.f(str);
        this.a = str;
        this.b = new Bundle();
    }

    private final String c(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str);
                    if (!C1602k7.a() || !this.d.d().t(F.B0)) {
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", ax.ba.d.d);
                        } else {
                            this.d.k().G().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                    } else if (obj instanceof String) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "s");
                    } else if (obj instanceof Long) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "l");
                    } else if (obj instanceof int[]) {
                        jSONObject.put("v", Arrays.toString((int[]) obj));
                        jSONObject.put("t", "ia");
                    } else if (obj instanceof long[]) {
                        jSONObject.put("v", Arrays.toString((long[]) obj));
                        jSONObject.put("t", "la");
                    } else if (obj instanceof Double) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", ax.ba.d.d);
                    } else {
                        this.d.k().G().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    this.d.k().G().b("Cannot serialize bundle value to SharedPreferences", e);
                }
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120 A[Catch: NumberFormatException | JSONException -> 0x0128, NumberFormatException | JSONException -> 0x0128, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0128, blocks: (B:13:0x0025, B:31:0x0091, B:31:0x0091, B:34:0x00a2, B:34:0x00a2, B:36:0x00a8, B:36:0x00a8, B:38:0x00b6, B:38:0x00b6, B:40:0x00c8, B:40:0x00c8, B:42:0x00d1, B:42:0x00d1, B:46:0x00d5, B:46:0x00d5, B:48:0x00db, B:48:0x00db, B:50:0x00e9, B:50:0x00e9, B:52:0x00fb, B:52:0x00fb, B:54:0x0104, B:54:0x0104, B:58:0x0108, B:58:0x0108, B:60:0x0114, B:60:0x0114, B:62:0x0120, B:62:0x0120, B:64:0x0052, B:67:0x005c, B:70:0x0066, B:73:0x0070, B:76:0x007a), top: B:12:0x0025, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3673i2.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.d.J().edit();
        if (bundle.size() == 0) {
            edit.remove(this.a);
        } else {
            edit.putString(this.a, c(bundle));
        }
        edit.apply();
        this.c = bundle;
    }
}
