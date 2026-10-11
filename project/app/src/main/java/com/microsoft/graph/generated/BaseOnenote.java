/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.Notebook;
import com.microsoft.graph.extensions.NotebookCollectionPage;
import com.microsoft.graph.extensions.OnenoteOperation;
import com.microsoft.graph.extensions.OnenoteOperationCollectionPage;
import com.microsoft.graph.extensions.OnenotePage;
import com.microsoft.graph.extensions.OnenotePageCollectionPage;
import com.microsoft.graph.extensions.OnenoteResource;
import com.microsoft.graph.extensions.OnenoteResourceCollectionPage;
import com.microsoft.graph.extensions.OnenoteSection;
import com.microsoft.graph.extensions.OnenoteSectionCollectionPage;
import com.microsoft.graph.extensions.SectionGroup;
import com.microsoft.graph.extensions.SectionGroupCollectionPage;
import com.microsoft.graph.generated.BaseNotebook;
import com.microsoft.graph.generated.BaseNotebookCollectionResponse;
import com.microsoft.graph.generated.BaseOnenoteOperation;
import com.microsoft.graph.generated.BaseOnenoteOperationCollectionResponse;
import com.microsoft.graph.generated.BaseOnenotePage;
import com.microsoft.graph.generated.BaseOnenotePageCollectionResponse;
import com.microsoft.graph.generated.BaseOnenoteResource;
import com.microsoft.graph.generated.BaseOnenoteResourceCollectionResponse;
import com.microsoft.graph.generated.BaseOnenoteSection;
import com.microsoft.graph.generated.BaseOnenoteSectionCollectionResponse;
import com.microsoft.graph.generated.BaseSectionGroup;
import com.microsoft.graph.generated.BaseSectionGroupCollectionResponse;
import java.util.Arrays;

public class BaseOnenote
extends Entity
implements d {
    public transient NotebookCollectionPage f;
    public transient OnenoteSectionCollectionPage g;
    public transient SectionGroupCollectionPage h;
    public transient OnenotePageCollectionPage i;
    public transient OnenoteResourceCollectionPage j;
    public transient OnenoteOperationCollectionPage k;
    private transient l l;
    private transient e m;

    @Override
    public void d(e e8, l lArray) {
        Object object;
        int n8;
        Object object2;
        Object object3;
        d d8;
        this.m = e8;
        this.l = lArray;
        boolean bl = lArray.x("notebooks");
        int n9 = 0;
        if (bl) {
            d8 = new BaseNotebookCollectionResponse();
            if (lArray.x("notebooks@odata.nextLink")) {
                ((BaseNotebookCollectionResponse)d8).b = lArray.t("notebooks@odata.nextLink").k();
            }
            object3 = e8.b(lArray.t("notebooks").toString(), l[].class);
            object2 = new Notebook[((l[])object3).length];
            for (n8 = 0; n8 < ((l[])object3).length; ++n8) {
                object2[n8] = object = e8.b(object3[n8].toString(), Notebook.class);
                ((BaseNotebook)object).d(e8, object3[n8]);
            }
            ((BaseNotebookCollectionResponse)d8).a = Arrays.asList(object2);
            this.f = new NotebookCollectionPage((BaseNotebookCollectionResponse)d8, null);
        }
        if (lArray.x("sections")) {
            d8 = new BaseOnenoteSectionCollectionResponse();
            if (lArray.x("sections@odata.nextLink")) {
                ((BaseOnenoteSectionCollectionResponse)d8).b = lArray.t("sections@odata.nextLink").k();
            }
            object2 = e8.b(lArray.t("sections").toString(), l[].class);
            object = new OnenoteSection[((Object[])object2).length];
            for (n8 = 0; n8 < ((Object[])object2).length; ++n8) {
                object[n8] = object3 = e8.b(((i)object2[n8]).toString(), OnenoteSection.class);
                ((BaseOnenoteSection)object3).d(e8, (l)object2[n8]);
            }
            ((BaseOnenoteSectionCollectionResponse)d8).a = Arrays.asList(object);
            this.g = new OnenoteSectionCollectionPage((BaseOnenoteSectionCollectionResponse)d8, null);
        }
        if (lArray.x("sectionGroups")) {
            d8 = new BaseSectionGroupCollectionResponse();
            if (lArray.x("sectionGroups@odata.nextLink")) {
                ((BaseSectionGroupCollectionResponse)d8).b = lArray.t("sectionGroups@odata.nextLink").k();
            }
            object3 = e8.b(lArray.t("sectionGroups").toString(), l[].class);
            object2 = new SectionGroup[((l[])object3).length];
            for (n8 = 0; n8 < ((l[])object3).length; ++n8) {
                object2[n8] = object = e8.b(object3[n8].toString(), SectionGroup.class);
                ((BaseSectionGroup)object).d(e8, (l)object3[n8]);
            }
            ((BaseSectionGroupCollectionResponse)d8).a = Arrays.asList(object2);
            this.h = new SectionGroupCollectionPage((BaseSectionGroupCollectionResponse)d8, null);
        }
        if (lArray.x("pages")) {
            object3 = new BaseOnenotePageCollectionResponse();
            if (lArray.x("pages@odata.nextLink")) {
                ((BaseOnenotePageCollectionResponse)object3).b = lArray.t("pages@odata.nextLink").k();
            }
            object2 = e8.b(lArray.t("pages").toString(), l[].class);
            object = new OnenotePage[((Object[])object2).length];
            for (n8 = 0; n8 < ((Object[])object2).length; ++n8) {
                d8 = e8.b(((i)object2[n8]).toString(), OnenotePage.class);
                object[n8] = d8;
                ((BaseOnenotePage)d8).d(e8, (l)object2[n8]);
            }
            ((BaseOnenotePageCollectionResponse)object3).a = Arrays.asList(object);
            this.i = new OnenotePageCollectionPage((BaseOnenotePageCollectionResponse)object3, null);
        }
        if (lArray.x("resources")) {
            object2 = new BaseOnenoteResourceCollectionResponse();
            if (lArray.x("resources@odata.nextLink")) {
                ((BaseOnenoteResourceCollectionResponse)object2).b = lArray.t("resources@odata.nextLink").k();
            }
            object3 = e8.b(lArray.t("resources").toString(), l[].class);
            object = new OnenoteResource[((l[])object3).length];
            for (n8 = 0; n8 < ((l[])object3).length; ++n8) {
                d8 = e8.b(object3[n8].toString(), OnenoteResource.class);
                object[n8] = d8;
                ((BaseOnenoteResource)d8).d(e8, (l)object3[n8]);
            }
            ((BaseOnenoteResourceCollectionResponse)object2).a = Arrays.asList(object);
            this.j = new OnenoteResourceCollectionPage((BaseOnenoteResourceCollectionResponse)object2, null);
        }
        if (lArray.x("operations")) {
            d8 = new BaseOnenoteOperationCollectionResponse();
            if (lArray.x("operations@odata.nextLink")) {
                ((BaseOnenoteOperationCollectionResponse)d8).b = lArray.t("operations@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("operations").toString(), l[].class);
            object3 = new OnenoteOperation[lArray.length];
            for (n8 = n9; n8 < lArray.length; ++n8) {
                object3[n8] = object2 = e8.b(lArray[n8].toString(), OnenoteOperation.class);
                ((BaseOnenoteOperation)object2).d(e8, lArray[n8]);
            }
            ((BaseOnenoteOperationCollectionResponse)d8).a = Arrays.asList(object3);
            this.k = new OnenoteOperationCollectionPage((BaseOnenoteOperationCollectionResponse)d8, null);
        }
    }
}

