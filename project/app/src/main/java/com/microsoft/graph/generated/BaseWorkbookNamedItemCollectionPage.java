/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.I0;
import com.microsoft.graph.extensions.WorkbookNamedItem;
import com.microsoft.graph.generated.BaseWorkbookNamedItemCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseWorkbookNamedItemCollectionPage
extends BaseCollectionPage<WorkbookNamedItem, I0>
implements IBaseCollectionPage {
    public BaseWorkbookNamedItemCollectionPage(BaseWorkbookNamedItemCollectionResponse baseWorkbookNamedItemCollectionResponse, I0 i02) {
        super(baseWorkbookNamedItemCollectionResponse.a, i02);
    }
}

