package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Notebook;
import com.microsoft.graph.extensions.OnenoteEntityHierarchyModel;
import com.microsoft.graph.extensions.OnenoteSection;
import com.microsoft.graph.extensions.OnenoteSectionCollectionPage;
import com.microsoft.graph.extensions.SectionGroup;
import com.microsoft.graph.extensions.SectionGroupCollectionPage;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseSectionGroup extends OnenoteEntityHierarchyModel implements d {

    @InterfaceC3059a
    @InterfaceC3061c("sectionsUrl")
    public String r;

    @InterfaceC3059a
    @InterfaceC3061c("sectionGroupsUrl")
    public String s;

    @InterfaceC3059a
    @InterfaceC3061c("parentNotebook")
    public Notebook t;

    @InterfaceC3059a
    @InterfaceC3061c("parentSectionGroup")
    public SectionGroup u;
    public transient OnenoteSectionCollectionPage v;
    public transient SectionGroupCollectionPage w;
    private transient C3003l x;
    private transient e y;

    @Override // com.microsoft.graph.generated.BaseOnenoteEntityHierarchyModel, com.microsoft.graph.generated.BaseOnenoteEntitySchemaObjectModel, com.microsoft.graph.generated.BaseOnenoteEntityBaseModel, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.y = eVar;
        this.x = c3003l;
        if (c3003l.x("sections")) {
            BaseOnenoteSectionCollectionResponse baseOnenoteSectionCollectionResponse = new BaseOnenoteSectionCollectionResponse();
            if (c3003l.x("sections@odata.nextLink")) {
                baseOnenoteSectionCollectionResponse.b = c3003l.t("sections@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("sections").toString(), C3003l[].class);
            OnenoteSection[] onenoteSectionArr = new OnenoteSection[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                OnenoteSection onenoteSection = (OnenoteSection) eVar.b(c3003lArr[i].toString(), OnenoteSection.class);
                onenoteSectionArr[i] = onenoteSection;
                onenoteSection.d(eVar, c3003lArr[i]);
            }
            baseOnenoteSectionCollectionResponse.a = Arrays.asList(onenoteSectionArr);
            this.v = new OnenoteSectionCollectionPage(baseOnenoteSectionCollectionResponse, null);
        }
        if (c3003l.x("sectionGroups")) {
            BaseSectionGroupCollectionResponse baseSectionGroupCollectionResponse = new BaseSectionGroupCollectionResponse();
            if (c3003l.x("sectionGroups@odata.nextLink")) {
                baseSectionGroupCollectionResponse.b = c3003l.t("sectionGroups@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("sectionGroups").toString(), C3003l[].class);
            SectionGroup[] sectionGroupArr = new SectionGroup[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                SectionGroup sectionGroup = (SectionGroup) eVar.b(c3003lArr2[i2].toString(), SectionGroup.class);
                sectionGroupArr[i2] = sectionGroup;
                sectionGroup.d(eVar, c3003lArr2[i2]);
            }
            baseSectionGroupCollectionResponse.a = Arrays.asList(sectionGroupArr);
            this.w = new SectionGroupCollectionPage(baseSectionGroupCollectionResponse, null);
        }
    }
}
