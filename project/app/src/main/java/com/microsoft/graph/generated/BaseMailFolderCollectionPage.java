/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.j0;
import com.microsoft.graph.extensions.MailFolder;
import com.microsoft.graph.generated.BaseMailFolderCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseMailFolderCollectionPage
extends BaseCollectionPage<MailFolder, j0>
implements IBaseCollectionPage {
    public BaseMailFolderCollectionPage(BaseMailFolderCollectionResponse baseMailFolderCollectionResponse, j0 j02) {
        super(baseMailFolderCollectionResponse.a, j02);
    }
}

