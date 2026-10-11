/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct;

public final class e {
    static String a(String string, String string2) {
        int n8 = string.length() - string2.length();
        if (n8 >= 0 && n8 <= 1) {
            StringBuilder stringBuilder = new StringBuilder(string.length() + string2.length());
            for (n8 = 0; n8 < string.length(); ++n8) {
                stringBuilder.append(string.charAt(n8));
                if (string2.length() <= n8) continue;
                stringBuilder.append(string2.charAt(n8));
            }
            return stringBuilder.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}

