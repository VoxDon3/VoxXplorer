/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxFile;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestUpload;
import com.box.androidsdk.content.requests.c;
import java.io.IOException;
import java.io.InputStream;

public class BoxRequestsFile$UploadFile
extends BoxRequestUpload<BoxFile, BoxRequestsFile$UploadFile> {
    private static final long serialVersionUID = 8123965031279971502L;
    String mDestinationFolderId;

    public BoxRequestsFile$UploadFile(InputStream inputStream, String string, String string2, String string3, BoxSession boxSession) {
        super(BoxFile.class, inputStream, string3, boxSession);
        this.mRequestUrlString = string3;
        this.mRequestMethod = BoxRequest.Methods.c0;
        this.mFileName = string;
        this.mStream = inputStream;
        this.mDestinationFolderId = string2;
    }

    @Override
    protected c F() throws IOException, BoxException {
        c c8 = super.F();
        c8.d("parent_id", this.mDestinationFolderId);
        return c8;
    }
}

