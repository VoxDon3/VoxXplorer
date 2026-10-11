/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.M0;
import com.microsoft.graph.extensions.WorkbookTableRow;
import com.microsoft.graph.generated.BaseWorkbookTableRowCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseWorkbookTableRowCollectionPage
extends BaseCollectionPage<WorkbookTableRow, M0>
implements IBaseCollectionPage {
    public BaseWorkbookTableRowCollectionPage(BaseWorkbookTableRowCollectionResponse baseWorkbookTableRowCollectionResponse, M0 m02) {
        super(baseWorkbookTableRowCollectionResponse.a, m02);
    }
}

