package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Notebook;
import com.microsoft.graph.extensions.OnenoteEntityHierarchyModel;
import com.microsoft.graph.extensions.OnenotePage;
import com.microsoft.graph.extensions.OnenotePageCollectionPage;
import com.microsoft.graph.extensions.SectionGroup;
import com.microsoft.graph.extensions.SectionLinks;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseOnenoteSection extends OnenoteEntityHierarchyModel implements d {

    @InterfaceC3059a
    @InterfaceC3061c("isDefault")
    public Boolean r;

    @InterfaceC3059a
    @InterfaceC3061c("links")
    public SectionLinks s;

    @InterfaceC3059a
    @InterfaceC3061c("pagesUrl")
    public String t;

    @InterfaceC3059a
    @InterfaceC3061c("parentNotebook")
    public Notebook u;

    @InterfaceC3059a
    @InterfaceC3061c("parentSectionGroup")
    public SectionGroup v;
    public transient OnenotePageCollectionPage w;
    private transient C3003l x;
    private transient e y;

    @Override // com.microsoft.graph.generated.BaseOnenoteEntityHierarchyModel, com.microsoft.graph.generated.BaseOnenoteEntitySchemaObjectModel, com.microsoft.graph.generated.BaseOnenoteEntityBaseModel, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.y = eVar;
        this.x = c3003l;
        if (c3003l.x("pages")) {
            BaseOnenotePageCollectionResponse baseOnenotePageCollectionResponse = new BaseOnenotePageCollectionResponse();
            if (c3003l.x("pages@odata.nextLink")) {
                baseOnenotePageCollectionResponse.b = c3003l.t("pages@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("pages").toString(), C3003l[].class);
            OnenotePage[] onenotePageArr = new OnenotePage[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                OnenotePage onenotePage = (OnenotePage) eVar.b(c3003lArr[i].toString(), OnenotePage.class);
                onenotePageArr[i] = onenotePage;
                onenotePage.d(eVar, c3003lArr[i]);
            }
            baseOnenotePageCollectionResponse.a = Arrays.asList(onenotePageArr);
            this.w = new OnenotePageCollectionPage(baseOnenotePageCollectionResponse, null);
        }
    }
}
