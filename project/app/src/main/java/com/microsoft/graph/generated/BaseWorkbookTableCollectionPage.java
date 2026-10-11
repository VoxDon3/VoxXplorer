/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.K0;
import com.microsoft.graph.extensions.WorkbookTable;
import com.microsoft.graph.generated.BaseWorkbookTableCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseWorkbookTableCollectionPage
extends BaseCollectionPage<WorkbookTable, K0>
implements IBaseCollectionPage {
    public BaseWorkbookTableCollectionPage(BaseWorkbookTableCollectionResponse baseWorkbookTableCollectionResponse, K0 k02) {
        super(baseWorkbookTableCollectionResponse.a, k02);
    }
}

