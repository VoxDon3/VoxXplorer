/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.models.BoxFile;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequestItemCopy;

public class BoxRequestsFile$CopyFile
extends BoxRequestItemCopy<BoxFile, BoxRequestsFile$CopyFile> {
    private static final long serialVersionUID = 8123965031279971533L;

    public BoxRequestsFile$CopyFile(String string, String string2, String string3, BoxSession boxSession) {
        super(BoxFile.class, string, string2, string3, boxSession);
    }
}

