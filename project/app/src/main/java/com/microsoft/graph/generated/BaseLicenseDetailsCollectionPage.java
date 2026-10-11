/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.g0;
import com.microsoft.graph.extensions.LicenseDetails;
import com.microsoft.graph.generated.BaseLicenseDetailsCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseLicenseDetailsCollectionPage
extends BaseCollectionPage<LicenseDetails, g0>
implements IBaseCollectionPage {
    public BaseLicenseDetailsCollectionPage(BaseLicenseDetailsCollectionResponse baseLicenseDetailsCollectionResponse, g0 g02) {
        super(baseLicenseDetailsCollectionResponse.a, g02);
    }
}

