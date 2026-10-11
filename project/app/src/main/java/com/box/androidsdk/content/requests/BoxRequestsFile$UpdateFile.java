/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.models.BoxFile;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequestItemUpdate;

public class BoxRequestsFile$UpdateFile
extends BoxRequestItemUpdate<BoxFile, BoxRequestsFile$UpdateFile> {
    private static final long serialVersionUID = 8123965031279971521L;

    public BoxRequestsFile$UpdateFile(String string, String string2, BoxSession boxSession) {
        super(BoxFile.class, string, string2, boxSession);
    }
}

