/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.y0;
import com.microsoft.graph.extensions.ProfilePhoto;
import com.microsoft.graph.generated.BaseProfilePhotoCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseProfilePhotoCollectionPage
extends BaseCollectionPage<ProfilePhoto, y0>
implements IBaseCollectionPage {
    public BaseProfilePhotoCollectionPage(BaseProfilePhotoCollectionResponse baseProfilePhotoCollectionResponse, y0 y02) {
        super(baseProfilePhotoCollectionResponse.a, y02);
    }
}

