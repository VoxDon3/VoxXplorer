/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.BaseItem;
import com.microsoft.graph.extensions.ColumnDefinition;
import com.microsoft.graph.extensions.ColumnDefinitionCollectionPage;
import com.microsoft.graph.extensions.ContentType;
import com.microsoft.graph.extensions.ContentTypeCollectionPage;
import com.microsoft.graph.extensions.Drive;
import com.microsoft.graph.extensions.ListInfo;
import com.microsoft.graph.extensions.ListItem;
import com.microsoft.graph.extensions.ListItemCollectionPage;
import com.microsoft.graph.extensions.SharepointIds;
import com.microsoft.graph.extensions.SystemFacet;
import com.microsoft.graph.generated.BaseColumnDefinition;
import com.microsoft.graph.generated.BaseColumnDefinitionCollectionResponse;
import com.microsoft.graph.generated.BaseContentType;
import com.microsoft.graph.generated.BaseContentTypeCollectionResponse;
import com.microsoft.graph.generated.BaseListItem;
import com.microsoft.graph.generated.BaseListItemCollectionResponse;
import java.util.Arrays;

public class BaseList
extends BaseItem
implements d {
    private transient l A;
    private transient e B;
    @a
    @c(value="displayName")
    public String s;
    @a
    @c(value="list")
    public ListInfo t;
    @a
    @c(value="sharepointIds")
    public SharepointIds u;
    @a
    @c(value="system")
    public SystemFacet v;
    public transient ColumnDefinitionCollectionPage w;
    public transient ContentTypeCollectionPage x;
    @a
    @c(value="drive")
    public Drive y;
    public transient ListItemCollectionPage z;

    @Override
    public void d(e e8, l lArray) {
        d d8;
        int n8;
        Object object;
        Object[] objectArray;
        d d9;
        this.B = e8;
        this.A = lArray;
        boolean bl = lArray.x("columns");
        int n9 = 0;
        if (bl) {
            d9 = new BaseColumnDefinitionCollectionResponse();
            if (lArray.x("columns@odata.nextLink")) {
                ((BaseColumnDefinitionCollectionResponse)d9).b = lArray.t("columns@odata.nextLink").k();
            }
            objectArray = e8.b(lArray.t("columns").toString(), l[].class);
            object = new ColumnDefinition[objectArray.length];
            for (n8 = 0; n8 < objectArray.length; ++n8) {
                d8 = e8.b(objectArray[n8].toString(), ColumnDefinition.class);
                object[n8] = d8;
                ((BaseColumnDefinition)d8).d(e8, (l)objectArray[n8]);
            }
            ((BaseColumnDefinitionCollectionResponse)d9).a = Arrays.asList(object);
            this.w = new ColumnDefinitionCollectionPage((BaseColumnDefinitionCollectionResponse)d9, null);
        }
        if (lArray.x("contentTypes")) {
            d8 = new BaseContentTypeCollectionResponse();
            if (lArray.x("contentTypes@odata.nextLink")) {
                ((BaseContentTypeCollectionResponse)d8).b = lArray.t("contentTypes@odata.nextLink").k();
            }
            objectArray = e8.b(lArray.t("contentTypes").toString(), l[].class);
            object = new ContentType[objectArray.length];
            for (n8 = 0; n8 < objectArray.length; ++n8) {
                d9 = e8.b(((i)objectArray[n8]).toString(), ContentType.class);
                object[n8] = d9;
                ((BaseContentType)d9).d(e8, (l)objectArray[n8]);
            }
            ((BaseContentTypeCollectionResponse)d8).a = Arrays.asList(object);
            this.x = new ContentTypeCollectionPage((BaseContentTypeCollectionResponse)d8, null);
        }
        if (lArray.x("items")) {
            d8 = new BaseListItemCollectionResponse();
            if (lArray.x("items@odata.nextLink")) {
                ((BaseListItemCollectionResponse)d8).b = lArray.t("items@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("items").toString(), l[].class);
            objectArray = new ListItem[lArray.length];
            for (n8 = n9; n8 < lArray.length; ++n8) {
                objectArray[n8] = object = e8.b(lArray[n8].toString(), ListItem.class);
                ((BaseListItem)object).d(e8, lArray[n8]);
            }
            ((BaseListItemCollectionResponse)d8).a = Arrays.asList(objectArray);
            this.z = new ListItemCollectionPage((BaseListItemCollectionResponse)d8, null);
        }
    }
}

