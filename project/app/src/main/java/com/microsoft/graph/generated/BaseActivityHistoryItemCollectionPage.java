/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.B;
import com.microsoft.graph.extensions.ActivityHistoryItem;
import com.microsoft.graph.generated.BaseActivityHistoryItemCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseActivityHistoryItemCollectionPage
extends BaseCollectionPage<ActivityHistoryItem, B>
implements IBaseCollectionPage {
    public BaseActivityHistoryItemCollectionPage(BaseActivityHistoryItemCollectionResponse baseActivityHistoryItemCollectionResponse, B b8) {
        super(baseActivityHistoryItemCollectionResponse.a, b8);
    }
}

