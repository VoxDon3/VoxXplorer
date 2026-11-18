package com.voxdon.xplorer.data;

import androidx.annotation.Keep;
import ax.U2.f;

@Keep
/* loaded from: classes.dex */
public class ApkPlusInfo {
    public static final String ICON_FILENAME = "icon.png";
    public static final String INFO_FILENAME = "apk+.json";
    public String app_name;
    public int min_sdk_version;
    public String package_name;
    public long version_code;
    public String version_name;

    public void fillInfo(f fVar) {
        this.app_name = fVar.q();
        this.package_name = fVar.r();
        this.version_code = fVar.y();
        this.version_name = fVar.x();
        this.min_sdk_version = fVar.p();
    }
}
