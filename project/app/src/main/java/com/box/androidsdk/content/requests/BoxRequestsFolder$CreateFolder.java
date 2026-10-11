/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.models.BoxFolder;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestItem;
import java.util.AbstractMap;

public class BoxRequestsFolder$CreateFolder
extends BoxRequestItem<BoxFolder, BoxRequestsFolder$CreateFolder> {
    private static final long serialVersionUID = 8123965031279971505L;

    public BoxRequestsFolder$CreateFolder(String string, String string2, String string3, BoxSession boxSession) {
        super(BoxFolder.class, null, string3, boxSession);
        this.mRequestMethod = BoxRequest.Methods.c0;
        this.G(string);
        this.F(string2);
    }

    public BoxRequestsFolder$CreateFolder F(String string) {
        ((AbstractMap)this.mBodyMap).put("name", string);
        return this;
    }

    public BoxRequestsFolder$CreateFolder G(String object) {
        object = BoxFolder.S((String)object);
        ((AbstractMap)this.mBodyMap).put("parent", object);
        return this;
    }
}

