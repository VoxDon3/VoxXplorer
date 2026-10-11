/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.C;
import com.microsoft.graph.extensions.Attachment;
import com.microsoft.graph.generated.BaseAttachmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseAttachmentCollectionPage
extends BaseCollectionPage<Attachment, C>
implements IBaseCollectionPage {
    public BaseAttachmentCollectionPage(BaseAttachmentCollectionResponse baseAttachmentCollectionResponse, C c8) {
        super(baseAttachmentCollectionResponse.a, c8);
    }
}

