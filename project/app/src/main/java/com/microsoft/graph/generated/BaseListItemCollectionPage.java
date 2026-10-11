/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.h0;
import com.microsoft.graph.extensions.ListItem;
import com.microsoft.graph.generated.BaseListItemCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseListItemCollectionPage
extends BaseCollectionPage<ListItem, h0>
implements IBaseCollectionPage {
    public BaseListItemCollectionPage(BaseListItemCollectionResponse baseListItemCollectionResponse, h0 h02) {
        super(baseListItemCollectionResponse.a, h02);
    }
}

