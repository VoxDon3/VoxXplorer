/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.L0;
import com.microsoft.graph.extensions.WorkbookTableColumn;
import com.microsoft.graph.generated.BaseWorkbookTableColumnCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseWorkbookTableColumnCollectionPage
extends BaseCollectionPage<WorkbookTableColumn, L0>
implements IBaseCollectionPage {
    public BaseWorkbookTableColumnCollectionPage(BaseWorkbookTableColumnCollectionResponse baseWorkbookTableColumnCollectionResponse, L0 l02) {
        super(baseWorkbookTableColumnCollectionResponse.a, l02);
    }
}

