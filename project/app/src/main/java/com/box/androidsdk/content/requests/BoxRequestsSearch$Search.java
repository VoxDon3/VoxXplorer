/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.models.BoxIteratorItems;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestItem;
import com.box.androidsdk.content.utils.SdkUtils;

public class BoxRequestsSearch$Search
extends BoxRequestItem<BoxIteratorItems, BoxRequestsSearch$Search> {
    public static String f0 = "name";
    private static final long serialVersionUID = 8123965031279971584L;

    public BoxRequestsSearch$Search(String string, String string2, BoxSession boxSession) {
        super(BoxIteratorItems.class, null, string2, boxSession);
        this.H("query", string);
        this.mRequestMethod = BoxRequest.Methods.q;
    }

    public BoxRequestsSearch$Search F(String[] stringArray) {
        this.H("ancestor_folder_ids", SdkUtils.b(stringArray, ","));
        return this;
    }

    public BoxRequestsSearch$Search G(String[] stringArray) {
        this.H("content_types", SdkUtils.b(stringArray, ","));
        return this;
    }

    public BoxRequestsSearch$Search H(String string, String string2) {
        this.mQueryMap.put(string, string2);
        return this;
    }

    public BoxRequestsSearch$Search I(int n8) {
        this.H("limit", String.valueOf(n8));
        return this;
    }
}

