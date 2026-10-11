/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.n0;
import com.microsoft.graph.extensions.Notebook;
import com.microsoft.graph.generated.BaseNotebookCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseNotebookCollectionPage
extends BaseCollectionPage<Notebook, n0>
implements IBaseCollectionPage {
    public BaseNotebookCollectionPage(BaseNotebookCollectionResponse baseNotebookCollectionResponse, n0 n02) {
        super(baseNotebookCollectionResponse.a, n02);
    }
}

