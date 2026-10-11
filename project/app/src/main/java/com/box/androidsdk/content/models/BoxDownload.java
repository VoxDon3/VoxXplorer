/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.models;

import com.box.androidsdk.content.models.BoxJsonObject;
import com.box.androidsdk.content.utils.SdkUtils;
import java.io.File;

public class BoxDownload
extends BoxJsonObject {
    public BoxDownload(String string, long l8, String string2, String string3, String string4, String string5) {
        if (!SdkUtils.l(string)) {
            this.G(string);
        }
        this.y("content_length", l8);
        if (!SdkUtils.l(string2)) {
            this.z("content_type", string2);
        }
        if (!SdkUtils.l(string3)) {
            this.E(string3);
        }
        if (!SdkUtils.l(string4)) {
            this.z("date", string4);
        }
        if (!SdkUtils.l(string5)) {
            this.z("expiration", string5);
        }
    }

    public String C() {
        return this.u("file_name");
    }

    public File D() {
        return null;
    }

    protected void E(String string) {
        int n8 = string.lastIndexOf("/");
        int n9 = string.indexOf("-");
        this.y("start_range", Long.parseLong(string.substring(string.indexOf("bytes") + 6, n9)));
        this.y("end_range", Long.parseLong(string.substring(n9 + 1, n8)));
        this.y("total_range", Long.parseLong(string.substring(n8 + 1)));
    }

    protected void G(String string) {
        String[] stringArray = string.split(";");
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            string = stringArray[i8].trim();
            if (!string.startsWith("filename=")) continue;
            string = string.endsWith("\"") ? string.substring(string.indexOf("\"") + 1, string.length() - 1) : string.substring(9);
            this.z("file_name", string);
        }
    }
}

