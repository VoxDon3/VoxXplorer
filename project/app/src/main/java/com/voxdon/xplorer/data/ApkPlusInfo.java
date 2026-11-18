/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.data;

import androidx.annotation.Keep;
import ax.U2.f;

@Keep
public class ApkPlusInfo {
    public static final String ICON_FILENAME = "icon.png";
    public static final String INFO_FILENAME = "apk+.json";
    public String app_name;
    public int min_sdk_version;
    public String package_name;
    public long version_code;
    public String version_name;

    public void fillInfo(f f8) {
        this.app_name = f8.q();
        this.package_name = f8.r();
        this.version_code = f8.y();
        this.version_name = f8.x();
        this.min_sdk_version = f8.p();
    }
}

