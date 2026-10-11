/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import ax.M5.p;
import com.google.android.gms.measurement.internal.h3;
import java.util.HashMap;
import java.util.Map;

public final class f5 {
    private static final String[] b = new String[]{"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};
    private final Map<String, String> a;

    private f5(Map<String, String> map) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        this.a = hashMap;
        hashMap.putAll(map);
    }

    private static int a(SharedPreferences sharedPreferences, String string) {
        try {
            int n8 = sharedPreferences.getInt(string, -1);
            return n8;
        }
        catch (ClassCastException classCastException) {
            return -1;
        }
    }

    public static f5 c(SharedPreferences sharedPreferences) {
        int n8;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string = f5.f(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(string) && string.length() > 754) {
            hashMap.put("GoogleConsent", String.valueOf(string.charAt(754)));
        }
        if ((n8 = f5.a(sharedPreferences, "IABTCF_gdprApplies")) != -1) {
            hashMap.put("gdprApplies", String.valueOf(n8));
        }
        if ((n8 = f5.a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode")) != -1) {
            hashMap.put("EnableAdvertiserConsentMode", String.valueOf(n8));
        }
        if ((n8 = f5.a(sharedPreferences, "IABTCF_PolicyVersion")) != -1) {
            hashMap.put("PolicyVersion", String.valueOf(n8));
        }
        if (!"\u0000".equals(string = f5.f(sharedPreferences, "IABTCF_PurposeConsents"))) {
            hashMap.put("PurposeConsents", string);
        }
        if ((n8 = f5.a(sharedPreferences, "IABTCF_CmpSdkID")) != -1) {
            hashMap.put("CmpSdkID", String.valueOf(n8));
        }
        return new f5(hashMap);
    }

    public static String d(String object, boolean bl) {
        String string = object;
        if (bl) {
            if (((String)object).length() <= 4) {
                string = object;
            } else {
                int n8;
                block5: {
                    object = ((String)object).toCharArray();
                    for (n8 = 1; n8 < 64; ++n8) {
                        if (object[4] != "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(n8)) {
                            continue;
                        }
                        break block5;
                    }
                    n8 = 0;
                }
                object[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | n8);
                string = String.valueOf((char[])object);
            }
        }
        return string;
    }

    private static String f(SharedPreferences object, String string) {
        try {
            object = object.getString(string, "\u0000");
            return object;
        }
        catch (ClassCastException classCastException) {
            return "\u0000";
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final int h() {
        try {
            String string = this.a.get("CmpSdkID");
            if (TextUtils.isEmpty((CharSequence)string)) return -1;
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final int i() {
        try {
            String string = this.a.get("PolicyVersion");
            if (TextUtils.isEmpty((CharSequence)string)) return -1;
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    public final Bundle b() {
        if ("1".equals(this.a.get("GoogleConsent")) && "1".equals(this.a.get("gdprApplies")) && "1".equals(this.a.get("EnableAdvertiserConsentMode"))) {
            String string;
            String string2;
            int n8 = this.i();
            if (n8 < 0) {
                return Bundle.EMPTY;
            }
            String string3 = this.a.get("PurposeConsents");
            if (TextUtils.isEmpty((CharSequence)string3)) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            int n9 = string3.length();
            String string4 = "denied";
            if (n9 > 0) {
                string2 = h3.a.c0.q;
                string = string3.charAt(0) == '1' ? "granted" : "denied";
                bundle.putString(string2, string);
            }
            if (string3.length() > 3) {
                string2 = h3.a.f0.q;
                string = string3.charAt(2) == '1' && string3.charAt(3) == '1' ? "granted" : "denied";
                bundle.putString(string2, string);
            }
            if (string3.length() > 6 && n8 >= 4) {
                string2 = h3.a.e0.q;
                string = string4;
                if (string3.charAt(0) == '1') {
                    string = string4;
                    if (string3.charAt(6) == '1') {
                        string = "granted";
                    }
                }
                bundle.putString(string2, string);
            }
            return bundle;
        }
        return Bundle.EMPTY;
    }

    public final String e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1");
        int n8 = this.h();
        if (n8 >= 0 && n8 <= 4095) {
            stringBuilder.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(n8 >> 6 & 0x3F));
            stringBuilder.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(n8 & 0x3F));
        } else {
            stringBuilder.append("00");
        }
        n8 = this.i();
        if (n8 >= 0 && n8 <= 63) {
            stringBuilder.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(n8));
        } else {
            stringBuilder.append("0");
        }
        p.a(true);
        n8 = "1".equals(this.a.get("gdprApplies")) ? 2 : 0;
        int n9 = n8 | 4;
        if ("1".equals(this.a.get("EnableAdvertiserConsentMode"))) {
            n9 = n8 | 0xC;
        }
        stringBuilder.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(n9));
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        if (!(object instanceof f5)) {
            return false;
        }
        object = (f5)object;
        return this.g().equalsIgnoreCase(((f5)object).g());
    }

    final String g() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : b) {
            if (!this.a.containsKey(string)) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append(";");
            }
            stringBuilder.append(string);
            stringBuilder.append("=");
            stringBuilder.append(this.a.get(string));
        }
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return this.g().hashCode();
    }

    public final String toString() {
        return this.g();
    }
}

