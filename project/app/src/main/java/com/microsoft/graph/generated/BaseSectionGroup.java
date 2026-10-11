/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Notebook;
import com.microsoft.graph.extensions.OnenoteEntityHierarchyModel;
import com.microsoft.graph.extensions.OnenoteSection;
import com.microsoft.graph.extensions.OnenoteSectionCollectionPage;
import com.microsoft.graph.extensions.SectionGroup;
import com.microsoft.graph.extensions.SectionGroupCollectionPage;
import com.microsoft.graph.generated.BaseOnenoteSection;
import com.microsoft.graph.generated.BaseOnenoteSectionCollectionResponse;
import com.microsoft.graph.generated.BaseSectionGroupCollectionResponse;
import java.util.Arrays;

public class BaseSectionGroup
extends OnenoteEntityHierarchyModel
implements d {
    @a
    @c(value="sectionsUrl")
    public String r;
    @a
    @c(value="sectionGroupsUrl")
    public String s;
    @a
    @c(value="parentNotebook")
    public Notebook t;
    @a
    @c(value="parentSectionGroup")
    public SectionGroup u;
    public transient OnenoteSectionCollectionPage v;
    public transient SectionGroupCollectionPage w;
    private transient l x;
    private transient e y;

    @Override
    public void d(e e8, l lArray) {
        OnenoteEntityHierarchyModel onenoteEntityHierarchyModel;
        int n8;
        l[] lArray2;
        SectionGroup[] sectionGroupArray;
        this.y = e8;
        this.x = lArray;
        boolean bl = lArray.x("sections");
        int n9 = 0;
        if (bl) {
            sectionGroupArray = new BaseOnenoteSectionCollectionResponse();
            if (lArray.x("sections@odata.nextLink")) {
                sectionGroupArray.b = lArray.t("sections@odata.nextLink").k();
            }
            lArray2 = e8.b(lArray.t("sections").toString(), l[].class);
            OnenoteSection[] onenoteSectionArray = new OnenoteSection[lArray2.length];
            for (n8 = 0; n8 < lArray2.length; ++n8) {
                onenoteEntityHierarchyModel = e8.b(lArray2[n8].toString(), OnenoteSection.class);
                onenoteSectionArray[n8] = onenoteEntityHierarchyModel;
                ((BaseOnenoteSection)onenoteEntityHierarchyModel).d(e8, lArray2[n8]);
            }
            sectionGroupArray.a = Arrays.asList(onenoteSectionArray);
            this.v = new OnenoteSectionCollectionPage((BaseOnenoteSectionCollectionResponse)sectionGroupArray, null);
        }
        if (lArray.x("sectionGroups")) {
            lArray2 = new BaseSectionGroupCollectionResponse();
            if (lArray.x("sectionGroups@odata.nextLink")) {
                lArray2.b = lArray.t("sectionGroups@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("sectionGroups").toString(), l[].class);
            sectionGroupArray = new SectionGroup[lArray.length];
            for (n8 = n9; n8 < lArray.length; ++n8) {
                onenoteEntityHierarchyModel = e8.b(lArray[n8].toString(), SectionGroup.class);
                sectionGroupArray[n8] = onenoteEntityHierarchyModel;
                ((BaseSectionGroup)onenoteEntityHierarchyModel).d(e8, lArray[n8]);
            }
            lArray2.a = Arrays.asList(sectionGroupArray);
            this.w = new SectionGroupCollectionPage((BaseSectionGroupCollectionResponse)lArray2, null);
        }
    }
}

