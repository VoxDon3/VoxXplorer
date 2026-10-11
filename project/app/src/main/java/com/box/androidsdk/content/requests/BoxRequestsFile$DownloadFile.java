/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequestDownload;
import java.io.OutputStream;

public class BoxRequestsFile$DownloadFile
extends BoxRequestDownload<BoxDownload, BoxRequestsFile$DownloadFile> {
    private static final long serialVersionUID = 8123965031279971588L;

    public BoxRequestsFile$DownloadFile(String string, OutputStream outputStream, String string2, BoxSession boxSession) {
        super(string, BoxDownload.class, outputStream, string2, boxSession);
    }
}

