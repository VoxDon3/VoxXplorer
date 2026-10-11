package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import ax.M5.C0821p;
import com.google.android.gms.measurement.internal.C3667h3;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3655f5 {
    private static final String[] b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};
    private final Map<String, String> a;

    private C3655f5(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.putAll(map);
    }

    private static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static C3655f5 c(SharedPreferences sharedPreferences) {
        HashMap hashMap = new HashMap();
        String f = f(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(f) && f.length() > 754) {
            hashMap.put("GoogleConsent", String.valueOf(f.charAt(754)));
        }
        int a = a(sharedPreferences, "IABTCF_gdprApplies");
        if (a != -1) {
            hashMap.put("gdprApplies", String.valueOf(a));
        }
        int a2 = a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (a2 != -1) {
            hashMap.put("EnableAdvertiserConsentMode", String.valueOf(a2));
        }
        int a3 = a(sharedPreferences, "IABTCF_PolicyVersion");
        if (a3 != -1) {
            hashMap.put("PolicyVersion", String.valueOf(a3));
        }
        String f2 = f(sharedPreferences, "IABTCF_PurposeConsents");
        if (!"\u0000".equals(f2)) {
            hashMap.put("PurposeConsents", f2);
        }
        int a4 = a(sharedPreferences, "IABTCF_CmpSdkID");
        if (a4 != -1) {
            hashMap.put("CmpSdkID", String.valueOf(a4));
        }
        return new C3655f5(hashMap);
    }

    public static String d(String str, boolean z) {
        if (!z || str.length() <= 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i = 1;
        while (true) {
            if (i >= 64) {
                i = 0;
                break;
            }
            if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i)) {
                break;
            }
            i++;
        }
        charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i);
        return String.valueOf(charArray);
    }

    private static String f(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (ClassCastException unused) {
            return "\u0000";
        }
    }

    private final int h() {
        try {
            String str = this.a.get("CmpSdkID");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final int i() {
        try {
            String str = this.a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle b() {
        if (!"1".equals(this.a.get("GoogleConsent")) || !"1".equals(this.a.get("gdprApplies")) || !"1".equals(this.a.get("EnableAdvertiserConsentMode"))) {
            return Bundle.EMPTY;
        }
        int i = i();
        if (i < 0) {
            return Bundle.EMPTY;
        }
        String str = this.a.get("PurposeConsents");
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        String str2 = "denied";
        if (str.length() > 0) {
            bundle.putString(C3667h3.a.AD_STORAGE.q, str.charAt(0) == '1' ? "granted" : "denied");
        }
        if (str.length() > 3) {
            bundle.putString(C3667h3.a.AD_PERSONALIZATION.q, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
        }
        if (str.length() > 6 && i >= 4) {
            String str3 = C3667h3.a.AD_USER_DATA.q;
            if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                str2 = "granted";
            }
            bundle.putString(str3, str2);
        }
        return bundle;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        int h = h();
        if (h < 0 || h > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((h >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(h & 63));
        }
        int i = i();
        if (i < 0 || i > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i));
        }
        C0821p.a(true);
        int i2 = "1".equals(this.a.get("gdprApplies")) ? 2 : 0;
        int i3 = i2 | 4;
        if ("1".equals(this.a.get("EnableAdvertiserConsentMode"))) {
            i3 = i2 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i3));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3655f5) {
            return g().equalsIgnoreCase(((C3655f5) obj).g());
        }
        return false;
    }

    final String g() {
        StringBuilder sb = new StringBuilder();
        for (String str : b) {
            if (this.a.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append(this.a.get(str));
            }
        }
        return sb.toString();
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final String toString() {
        return g();
    }
}
