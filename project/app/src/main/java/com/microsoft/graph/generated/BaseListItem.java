/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.BaseItem;
import com.microsoft.graph.extensions.ContentTypeInfo;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.extensions.FieldValueSet;
import com.microsoft.graph.extensions.ListItemVersion;
import com.microsoft.graph.extensions.ListItemVersionCollectionPage;
import com.microsoft.graph.extensions.SharepointIds;
import com.microsoft.graph.generated.BaseListItemVersionCollectionResponse;
import java.util.Arrays;

public class BaseListItem
extends BaseItem
implements d {
    @a
    @c(value="contentType")
    public ContentTypeInfo s;
    @a
    @c(value="sharepointIds")
    public SharepointIds t;
    @a
    @c(value="driveItem")
    public DriveItem u;
    @a
    @c(value="fields")
    public FieldValueSet v;
    public transient ListItemVersionCollectionPage w;
    private transient l x;
    private transient e y;

    @Override
    public void d(e e8, l listItemVersionArray) {
        this.y = e8;
        this.x = listItemVersionArray;
        if (listItemVersionArray.x("versions")) {
            BaseListItemVersionCollectionResponse baseListItemVersionCollectionResponse = new BaseListItemVersionCollectionResponse();
            if (listItemVersionArray.x("versions@odata.nextLink")) {
                baseListItemVersionCollectionResponse.b = listItemVersionArray.t("versions@odata.nextLink").k();
            }
            l[] lArray = e8.b(listItemVersionArray.t("versions").toString(), l[].class);
            listItemVersionArray = new ListItemVersion[lArray.length];
            for (int i8 = 0; i8 < lArray.length; ++i8) {
                ListItemVersion listItemVersion;
                listItemVersionArray[i8] = listItemVersion = e8.b(lArray[i8].toString(), ListItemVersion.class);
                listItemVersion.d(e8, lArray[i8]);
            }
            baseListItemVersionCollectionResponse.a = Arrays.asList(listItemVersionArray);
            this.w = new ListItemVersionCollectionPage(baseListItemVersionCollectionResponse, null);
        }
    }
}

