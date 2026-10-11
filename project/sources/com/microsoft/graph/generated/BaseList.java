package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
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
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseList extends BaseItem implements d {
    private transient C3003l A;
    private transient e B;

    @InterfaceC3059a
    @InterfaceC3061c("displayName")
    public String s;

    @InterfaceC3059a
    @InterfaceC3061c("list")
    public ListInfo t;

    @InterfaceC3059a
    @InterfaceC3061c("sharepointIds")
    public SharepointIds u;

    @InterfaceC3059a
    @InterfaceC3061c("system")
    public SystemFacet v;
    public transient ColumnDefinitionCollectionPage w;
    public transient ContentTypeCollectionPage x;

    @InterfaceC3059a
    @InterfaceC3061c("drive")
    public Drive y;
    public transient ListItemCollectionPage z;

    @Override // com.microsoft.graph.generated.BaseBaseItem, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.B = eVar;
        this.A = c3003l;
        if (c3003l.x("columns")) {
            BaseColumnDefinitionCollectionResponse baseColumnDefinitionCollectionResponse = new BaseColumnDefinitionCollectionResponse();
            if (c3003l.x("columns@odata.nextLink")) {
                baseColumnDefinitionCollectionResponse.b = c3003l.t("columns@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("columns").toString(), C3003l[].class);
            ColumnDefinition[] columnDefinitionArr = new ColumnDefinition[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                ColumnDefinition columnDefinition = (ColumnDefinition) eVar.b(c3003lArr[i].toString(), ColumnDefinition.class);
                columnDefinitionArr[i] = columnDefinition;
                columnDefinition.d(eVar, c3003lArr[i]);
            }
            baseColumnDefinitionCollectionResponse.a = Arrays.asList(columnDefinitionArr);
            this.w = new ColumnDefinitionCollectionPage(baseColumnDefinitionCollectionResponse, null);
        }
        if (c3003l.x("contentTypes")) {
            BaseContentTypeCollectionResponse baseContentTypeCollectionResponse = new BaseContentTypeCollectionResponse();
            if (c3003l.x("contentTypes@odata.nextLink")) {
                baseContentTypeCollectionResponse.b = c3003l.t("contentTypes@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("contentTypes").toString(), C3003l[].class);
            ContentType[] contentTypeArr = new ContentType[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                ContentType contentType = (ContentType) eVar.b(c3003lArr2[i2].toString(), ContentType.class);
                contentTypeArr[i2] = contentType;
                contentType.d(eVar, c3003lArr2[i2]);
            }
            baseContentTypeCollectionResponse.a = Arrays.asList(contentTypeArr);
            this.x = new ContentTypeCollectionPage(baseContentTypeCollectionResponse, null);
        }
        if (c3003l.x("items")) {
            BaseListItemCollectionResponse baseListItemCollectionResponse = new BaseListItemCollectionResponse();
            if (c3003l.x("items@odata.nextLink")) {
                baseListItemCollectionResponse.b = c3003l.t("items@odata.nextLink").k();
            }
            C3003l[] c3003lArr3 = (C3003l[]) eVar.b(c3003l.t("items").toString(), C3003l[].class);
            ListItem[] listItemArr = new ListItem[c3003lArr3.length];
            for (int i3 = 0; i3 < c3003lArr3.length; i3++) {
                ListItem listItem = (ListItem) eVar.b(c3003lArr3[i3].toString(), ListItem.class);
                listItemArr[i3] = listItem;
                listItem.d(eVar, c3003lArr3[i3]);
            }
            baseListItemCollectionResponse.a = Arrays.asList(listItemArr);
            this.z = new ListItemCollectionPage(baseListItemCollectionResponse, null);
        }
    }
}
