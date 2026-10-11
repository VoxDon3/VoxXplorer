/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.k0;
import com.microsoft.graph.extensions.Message;
import com.microsoft.graph.generated.BaseMessageCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseMessageCollectionPage
extends BaseCollectionPage<Message, k0>
implements IBaseCollectionPage {
    public BaseMessageCollectionPage(BaseMessageCollectionResponse baseMessageCollectionResponse, k0 k02) {
        super(baseMessageCollectionResponse.a, k02);
    }
}

