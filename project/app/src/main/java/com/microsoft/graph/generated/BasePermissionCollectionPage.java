/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.t0;
import com.microsoft.graph.extensions.Permission;
import com.microsoft.graph.generated.BasePermissionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BasePermissionCollectionPage
extends BaseCollectionPage<Permission, t0>
implements IBaseCollectionPage {
    public BasePermissionCollectionPage(BasePermissionCollectionResponse basePermissionCollectionResponse, t0 t02) {
        super(basePermissionCollectionResponse.a, t02);
    }
}

