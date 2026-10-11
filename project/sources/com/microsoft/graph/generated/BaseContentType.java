package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.ColumnLink;
import com.microsoft.graph.extensions.ColumnLinkCollectionPage;
import com.microsoft.graph.extensions.ContentTypeOrder;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.ItemReference;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseContentType extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("description")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("group")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("hidden")
    public Boolean h;

    @InterfaceC3059a
    @InterfaceC3061c("inheritedFrom")
    public ItemReference i;

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String j;

    @InterfaceC3059a
    @InterfaceC3061c("order")
    public ContentTypeOrder k;

    @InterfaceC3059a
    @InterfaceC3061c("parentId")
    public String l;

    @InterfaceC3059a
    @InterfaceC3061c("readOnly")
    public Boolean m;

    @InterfaceC3059a
    @InterfaceC3061c("sealed")
    public Boolean n;
    public transient ColumnLinkCollectionPage o;
    private transient C3003l p;
    private transient e q;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.q = eVar;
        this.p = c3003l;
        if (c3003l.x("columnLinks")) {
            BaseColumnLinkCollectionResponse baseColumnLinkCollectionResponse = new BaseColumnLinkCollectionResponse();
            if (c3003l.x("columnLinks@odata.nextLink")) {
                baseColumnLinkCollectionResponse.b = c3003l.t("columnLinks@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("columnLinks").toString(), C3003l[].class);
            ColumnLink[] columnLinkArr = new ColumnLink[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                ColumnLink columnLink = (ColumnLink) eVar.b(c3003lArr[i].toString(), ColumnLink.class);
                columnLinkArr[i] = columnLink;
                columnLink.d(eVar, c3003lArr[i]);
            }
            baseColumnLinkCollectionResponse.a = Arrays.asList(columnLinkArr);
            this.o = new ColumnLinkCollectionPage(baseColumnLinkCollectionResponse, null);
        }
    }
}
