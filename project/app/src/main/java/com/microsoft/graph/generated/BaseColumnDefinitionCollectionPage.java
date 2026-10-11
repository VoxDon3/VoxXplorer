/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.F;
import com.microsoft.graph.extensions.ColumnDefinition;
import com.microsoft.graph.generated.BaseColumnDefinitionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseColumnDefinitionCollectionPage
extends BaseCollectionPage<ColumnDefinition, F>
implements IBaseCollectionPage {
    public BaseColumnDefinitionCollectionPage(BaseColumnDefinitionCollectionResponse baseColumnDefinitionCollectionResponse, F f8) {
        super(baseColumnDefinitionCollectionResponse.a, f8);
    }
}

