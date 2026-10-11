package com.box.androidsdk.content.models;

import com.box.androidsdk.content.utils.SdkUtils;
import java.io.File;

/* loaded from: classes.dex */
public class BoxDownload extends BoxJsonObject {
    public BoxDownload(String str, long j, String str2, String str3, String str4, String str5) {
        if (!SdkUtils.l(str)) {
            G(str);
        }
        y("content_length", Long.valueOf(j));
        if (!SdkUtils.l(str2)) {
            z("content_type", str2);
        }
        if (!SdkUtils.l(str3)) {
            E(str3);
        }
        if (!SdkUtils.l(str4)) {
            z("date", str4);
        }
        if (SdkUtils.l(str5)) {
            return;
        }
        z("expiration", str5);
    }

    public String C() {
        return u("file_name");
    }

    public File D() {
        return null;
    }

    protected void E(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        int indexOf = str.indexOf("-");
        y("start_range", Long.valueOf(Long.parseLong(str.substring(str.indexOf("bytes") + 6, indexOf))));
        y("end_range", Long.valueOf(Long.parseLong(str.substring(indexOf + 1, lastIndexOf))));
        y("total_range", Long.valueOf(Long.parseLong(str.substring(lastIndexOf + 1))));
    }

    protected void G(String str) {
        for (String str2 : str.split(";")) {
            String trim = str2.trim();
            if (trim.startsWith("filename=")) {
                z("file_name", trim.endsWith("\"") ? trim.substring(trim.indexOf("\"") + 1, trim.length() - 1) : trim.substring(9));
            }
        }
    }
}
