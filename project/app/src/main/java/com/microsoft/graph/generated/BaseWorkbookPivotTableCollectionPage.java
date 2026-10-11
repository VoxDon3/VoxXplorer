/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.J0;
import com.microsoft.graph.extensions.WorkbookPivotTable;
import com.microsoft.graph.generated.BaseWorkbookPivotTableCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseWorkbookPivotTableCollectionPage
extends BaseCollectionPage<WorkbookPivotTable, J0>
implements IBaseCollectionPage {
    public BaseWorkbookPivotTableCollectionPage(BaseWorkbookPivotTableCollectionResponse baseWorkbookPivotTableCollectionResponse, J0 j02) {
        super(baseWorkbookPivotTableCollectionResponse.a, j02);
    }
}

