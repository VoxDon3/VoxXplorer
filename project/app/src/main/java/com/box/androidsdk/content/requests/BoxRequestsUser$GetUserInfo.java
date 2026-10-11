/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.models.BoxUser;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestItem;

public class BoxRequestsUser$GetUserInfo
extends BoxRequestItem<BoxUser, BoxRequestsUser$GetUserInfo> {
    public BoxRequestsUser$GetUserInfo(String string, BoxSession boxSession) {
        super(BoxUser.class, null, string, boxSession);
        this.mRequestMethod = BoxRequest.Methods.q;
    }
}

