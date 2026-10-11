/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.models.BoxIteratorItems;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestItem;

public class BoxRequestsFolder$GetFolderItems
extends BoxRequestItem<BoxIteratorItems, BoxRequestsFolder$GetFolderItems> {
    private static final long serialVersionUID = 8123965031279971524L;

    public BoxRequestsFolder$GetFolderItems(String string, String string2, BoxSession boxSession) {
        super(BoxIteratorItems.class, string, string2, boxSession);
        this.mRequestMethod = BoxRequest.Methods.q;
        this.mQueryMap.put("limit", "1000");
        this.mQueryMap.put("offset", "0");
    }

    public BoxRequestsFolder$GetFolderItems F(int n8) {
        this.mQueryMap.put("limit", String.valueOf(n8));
        return this;
    }

    public BoxRequestsFolder$GetFolderItems G(int n8) {
        this.mQueryMap.put("offset", String.valueOf(n8));
        return this;
    }
}

