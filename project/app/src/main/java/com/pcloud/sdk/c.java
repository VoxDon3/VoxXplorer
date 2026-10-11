/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

abstract class c {
    static final List<String> a = Arrays.asList("com.android.chrome", "com.chrome.beta", "com.chrome.dev", "org.mozilla.firefox", "org.mozilla.firefox_beta", "org.mozilla.fenix");

    public static String a(Context object, List<String> object2) {
        if (object2.isEmpty()) {
            return null;
        }
        Object object3 = new Intent("android.support.customtabs.action.CustomTabsService");
        if ((object = object.getPackageManager().queryIntentServices((Intent)object3, 0)) != null) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object3 = (String)object2.next();
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    ServiceInfo serviceInfo = ((ResolveInfo)iterator.next()).serviceInfo;
                    if (!((String)object3).equals(serviceInfo.packageName)) continue;
                    return serviceInfo.packageName;
                }
            }
        }
        return null;
    }

    static Map<String, String> b(String object) {
        String[] stringArray = Uri.parse((String)object).getFragment();
        if (stringArray != null) {
            object = new TreeMap();
            for (String string : stringArray.split("&")) {
                int n8 = string.indexOf(61);
                object.put(string.substring(0, n8), string.substring(n8 + 1));
            }
            return object;
        }
        return Collections.EMPTY_MAP;
    }
}

