/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.u0;
import com.microsoft.graph.extensions.Person;
import com.microsoft.graph.generated.BasePersonCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BasePersonCollectionPage
extends BaseCollectionPage<Person, u0>
implements IBaseCollectionPage {
    public BasePersonCollectionPage(BasePersonCollectionResponse basePersonCollectionResponse, u0 u02) {
        super(basePersonCollectionResponse.a, u02);
    }
}

