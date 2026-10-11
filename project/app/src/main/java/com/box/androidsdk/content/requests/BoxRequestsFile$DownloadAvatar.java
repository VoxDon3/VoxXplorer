/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequestDownload;
import com.box.androidsdk.content.requests.BoxRequestsFile$DownloadFile;
import java.io.File;

public class BoxRequestsFile$DownloadAvatar
extends BoxRequestDownload<BoxDownload, BoxRequestsFile$DownloadFile> {
    public BoxRequestsFile$DownloadAvatar(String string, File file, String string2, BoxSession boxSession) {
        super(string, BoxDownload.class, file, string2, boxSession);
    }

    public BoxRequestsFile$DownloadAvatar I(String string) {
        this.mQueryMap.put("pic_type", string);
        return this;
    }
}

