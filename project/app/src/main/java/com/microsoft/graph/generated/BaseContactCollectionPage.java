/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.H;
import com.microsoft.graph.extensions.Contact;
import com.microsoft.graph.generated.BaseContactCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseContactCollectionPage
extends BaseCollectionPage<Contact, H>
implements IBaseCollectionPage {
    public BaseContactCollectionPage(BaseContactCollectionResponse baseContactCollectionResponse, H h8) {
        super(baseContactCollectionResponse.a, h8);
    }
}

