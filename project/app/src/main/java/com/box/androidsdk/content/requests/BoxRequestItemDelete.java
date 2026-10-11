/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.models.BoxVoid;
import com.box.androidsdk.content.requests.BoxRequest;

public abstract class BoxRequestItemDelete<R extends BoxRequest<BoxVoid, R>>
extends BoxRequest<BoxVoid, R> {
    protected String mId;

    public BoxRequestItemDelete(String string, String string2, BoxSession boxSession) {
        super(BoxVoid.class, string2, boxSession);
        this.mId = string;
        this.mRequestMethod = BoxRequest.Methods.e0;
    }
}

