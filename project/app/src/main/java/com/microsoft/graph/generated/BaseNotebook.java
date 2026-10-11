/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.T0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.NotebookLinks;
import com.microsoft.graph.extensions.OnenoteEntityHierarchyModel;
import com.microsoft.graph.extensions.OnenoteSection;
import com.microsoft.graph.extensions.OnenoteSectionCollectionPage;
import com.microsoft.graph.extensions.SectionGroup;
import com.microsoft.graph.extensions.SectionGroupCollectionPage;
import com.microsoft.graph.generated.BaseOnenoteSectionCollectionResponse;
import com.microsoft.graph.generated.BaseSectionGroup;
import com.microsoft.graph.generated.BaseSectionGroupCollectionResponse;
import java.util.Arrays;

public class BaseNotebook
extends OnenoteEntityHierarchyModel
implements d {
    private transient e A;
    @a
    @c(value="isDefault")
    public Boolean r;
    @a
    @c(value="userRole")
    public T0 s;
    @a
    @c(value="isShared")
    public Boolean t;
    @a
    @c(value="sectionsUrl")
    public String u;
    @a
    @c(value="sectionGroupsUrl")
    public String v;
    @a
    @c(value="links")
    public NotebookLinks w;
    public transient OnenoteSectionCollectionPage x;
    public transient SectionGroupCollectionPage y;
    private transient l z;

    @Override
    public void d(e e8, l lArray) {
        int n8;
        OnenoteSection[] onenoteSectionArray;
        Object[] objectArray;
        d d8;
        this.A = e8;
        this.z = lArray;
        boolean bl = lArray.x("sections");
        int n9 = 0;
        if (bl) {
            d8 = new BaseOnenoteSectionCollectionResponse();
            if (lArray.x("sections@odata.nextLink")) {
                ((BaseOnenoteSectionCollectionResponse)d8).b = lArray.t("sections@odata.nextLink").k();
            }
            objectArray = e8.b(lArray.t("sections").toString(), l[].class);
            onenoteSectionArray = new OnenoteSection[objectArray.length];
            for (n8 = 0; n8 < objectArray.length; ++n8) {
                OnenoteSection onenoteSection;
                onenoteSectionArray[n8] = onenoteSection = e8.b(((i)objectArray[n8]).toString(), OnenoteSection.class);
                onenoteSection.d(e8, (l)objectArray[n8]);
            }
            ((BaseOnenoteSectionCollectionResponse)d8).a = Arrays.asList(onenoteSectionArray);
            this.x = new OnenoteSectionCollectionPage((BaseOnenoteSectionCollectionResponse)d8, null);
        }
        if (lArray.x("sectionGroups")) {
            onenoteSectionArray = new BaseSectionGroupCollectionResponse();
            if (lArray.x("sectionGroups@odata.nextLink")) {
                onenoteSectionArray.b = lArray.t("sectionGroups@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("sectionGroups").toString(), l[].class);
            objectArray = new SectionGroup[lArray.length];
            for (n8 = n9; n8 < lArray.length; ++n8) {
                d8 = e8.b(lArray[n8].toString(), SectionGroup.class);
                objectArray[n8] = d8;
                ((BaseSectionGroup)d8).d(e8, lArray[n8]);
            }
            onenoteSectionArray.a = Arrays.asList(objectArray);
            this.y = new SectionGroupCollectionPage((BaseSectionGroupCollectionResponse)onenoteSectionArray, null);
        }
    }
}

