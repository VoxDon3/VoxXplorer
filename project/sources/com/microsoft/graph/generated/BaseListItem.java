package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.BaseItem;
import com.microsoft.graph.extensions.ContentTypeInfo;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.extensions.FieldValueSet;
import com.microsoft.graph.extensions.ListItemVersion;
import com.microsoft.graph.extensions.ListItemVersionCollectionPage;
import com.microsoft.graph.extensions.SharepointIds;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseListItem extends BaseItem implements d {

    @InterfaceC3059a
    @InterfaceC3061c("contentType")
    public ContentTypeInfo s;

    @InterfaceC3059a
    @InterfaceC3061c("sharepointIds")
    public SharepointIds t;

    @InterfaceC3059a
    @InterfaceC3061c("driveItem")
    public DriveItem u;

    @InterfaceC3059a
    @InterfaceC3061c("fields")
    public FieldValueSet v;
    public transient ListItemVersionCollectionPage w;
    private transient C3003l x;
    private transient e y;

    @Override // com.microsoft.graph.generated.BaseBaseItem, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.y = eVar;
        this.x = c3003l;
        if (c3003l.x("versions")) {
            BaseListItemVersionCollectionResponse baseListItemVersionCollectionResponse = new BaseListItemVersionCollectionResponse();
            if (c3003l.x("versions@odata.nextLink")) {
                baseListItemVersionCollectionResponse.b = c3003l.t("versions@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("versions").toString(), C3003l[].class);
            ListItemVersion[] listItemVersionArr = new ListItemVersion[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                ListItemVersion listItemVersion = (ListItemVersion) eVar.b(c3003lArr[i].toString(), ListItemVersion.class);
                listItemVersionArr[i] = listItemVersion;
                listItemVersion.d(eVar, c3003lArr[i]);
            }
            baseListItemVersionCollectionResponse.a = Arrays.asList(listItemVersionArr);
            this.w = new ListItemVersionCollectionPage(baseListItemVersionCollectionResponse, null);
        }
    }
}
