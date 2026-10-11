/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.N0;
import com.microsoft.graph.extensions.WorkbookWorksheet;
import com.microsoft.graph.generated.BaseWorkbookWorksheetCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseWorkbookWorksheetCollectionPage
extends BaseCollectionPage<WorkbookWorksheet, N0>
implements IBaseCollectionPage {
    public BaseWorkbookWorksheetCollectionPage(BaseWorkbookWorksheetCollectionResponse baseWorkbookWorksheetCollectionResponse, N0 n02) {
        super(baseWorkbookWorksheetCollectionResponse.a, n02);
    }
}

