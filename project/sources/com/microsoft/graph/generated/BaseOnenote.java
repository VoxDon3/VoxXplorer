package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
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
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseOnenote extends Entity implements d {
    public transient NotebookCollectionPage f;
    public transient OnenoteSectionCollectionPage g;
    public transient SectionGroupCollectionPage h;
    public transient OnenotePageCollectionPage i;
    public transient OnenoteResourceCollectionPage j;
    public transient OnenoteOperationCollectionPage k;
    private transient C3003l l;
    private transient e m;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.m = eVar;
        this.l = c3003l;
        if (c3003l.x("notebooks")) {
            BaseNotebookCollectionResponse baseNotebookCollectionResponse = new BaseNotebookCollectionResponse();
            if (c3003l.x("notebooks@odata.nextLink")) {
                baseNotebookCollectionResponse.b = c3003l.t("notebooks@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("notebooks").toString(), C3003l[].class);
            Notebook[] notebookArr = new Notebook[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                Notebook notebook = (Notebook) eVar.b(c3003lArr[i].toString(), Notebook.class);
                notebookArr[i] = notebook;
                notebook.d(eVar, c3003lArr[i]);
            }
            baseNotebookCollectionResponse.a = Arrays.asList(notebookArr);
            this.f = new NotebookCollectionPage(baseNotebookCollectionResponse, null);
        }
        if (c3003l.x("sections")) {
            BaseOnenoteSectionCollectionResponse baseOnenoteSectionCollectionResponse = new BaseOnenoteSectionCollectionResponse();
            if (c3003l.x("sections@odata.nextLink")) {
                baseOnenoteSectionCollectionResponse.b = c3003l.t("sections@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("sections").toString(), C3003l[].class);
            OnenoteSection[] onenoteSectionArr = new OnenoteSection[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                OnenoteSection onenoteSection = (OnenoteSection) eVar.b(c3003lArr2[i2].toString(), OnenoteSection.class);
                onenoteSectionArr[i2] = onenoteSection;
                onenoteSection.d(eVar, c3003lArr2[i2]);
            }
            baseOnenoteSectionCollectionResponse.a = Arrays.asList(onenoteSectionArr);
            this.g = new OnenoteSectionCollectionPage(baseOnenoteSectionCollectionResponse, null);
        }
        if (c3003l.x("sectionGroups")) {
            BaseSectionGroupCollectionResponse baseSectionGroupCollectionResponse = new BaseSectionGroupCollectionResponse();
            if (c3003l.x("sectionGroups@odata.nextLink")) {
                baseSectionGroupCollectionResponse.b = c3003l.t("sectionGroups@odata.nextLink").k();
            }
            C3003l[] c3003lArr3 = (C3003l[]) eVar.b(c3003l.t("sectionGroups").toString(), C3003l[].class);
            SectionGroup[] sectionGroupArr = new SectionGroup[c3003lArr3.length];
            for (int i3 = 0; i3 < c3003lArr3.length; i3++) {
                SectionGroup sectionGroup = (SectionGroup) eVar.b(c3003lArr3[i3].toString(), SectionGroup.class);
                sectionGroupArr[i3] = sectionGroup;
                sectionGroup.d(eVar, c3003lArr3[i3]);
            }
            baseSectionGroupCollectionResponse.a = Arrays.asList(sectionGroupArr);
            this.h = new SectionGroupCollectionPage(baseSectionGroupCollectionResponse, null);
        }
        if (c3003l.x("pages")) {
            BaseOnenotePageCollectionResponse baseOnenotePageCollectionResponse = new BaseOnenotePageCollectionResponse();
            if (c3003l.x("pages@odata.nextLink")) {
                baseOnenotePageCollectionResponse.b = c3003l.t("pages@odata.nextLink").k();
            }
            C3003l[] c3003lArr4 = (C3003l[]) eVar.b(c3003l.t("pages").toString(), C3003l[].class);
            OnenotePage[] onenotePageArr = new OnenotePage[c3003lArr4.length];
            for (int i4 = 0; i4 < c3003lArr4.length; i4++) {
                OnenotePage onenotePage = (OnenotePage) eVar.b(c3003lArr4[i4].toString(), OnenotePage.class);
                onenotePageArr[i4] = onenotePage;
                onenotePage.d(eVar, c3003lArr4[i4]);
            }
            baseOnenotePageCollectionResponse.a = Arrays.asList(onenotePageArr);
            this.i = new OnenotePageCollectionPage(baseOnenotePageCollectionResponse, null);
        }
        if (c3003l.x("resources")) {
            BaseOnenoteResourceCollectionResponse baseOnenoteResourceCollectionResponse = new BaseOnenoteResourceCollectionResponse();
            if (c3003l.x("resources@odata.nextLink")) {
                baseOnenoteResourceCollectionResponse.b = c3003l.t("resources@odata.nextLink").k();
            }
            C3003l[] c3003lArr5 = (C3003l[]) eVar.b(c3003l.t("resources").toString(), C3003l[].class);
            OnenoteResource[] onenoteResourceArr = new OnenoteResource[c3003lArr5.length];
            for (int i5 = 0; i5 < c3003lArr5.length; i5++) {
                OnenoteResource onenoteResource = (OnenoteResource) eVar.b(c3003lArr5[i5].toString(), OnenoteResource.class);
                onenoteResourceArr[i5] = onenoteResource;
                onenoteResource.d(eVar, c3003lArr5[i5]);
            }
            baseOnenoteResourceCollectionResponse.a = Arrays.asList(onenoteResourceArr);
            this.j = new OnenoteResourceCollectionPage(baseOnenoteResourceCollectionResponse, null);
        }
        if (c3003l.x("operations")) {
            BaseOnenoteOperationCollectionResponse baseOnenoteOperationCollectionResponse = new BaseOnenoteOperationCollectionResponse();
            if (c3003l.x("operations@odata.nextLink")) {
                baseOnenoteOperationCollectionResponse.b = c3003l.t("operations@odata.nextLink").k();
            }
            C3003l[] c3003lArr6 = (C3003l[]) eVar.b(c3003l.t("operations").toString(), C3003l[].class);
            OnenoteOperation[] onenoteOperationArr = new OnenoteOperation[c3003lArr6.length];
            for (int i6 = 0; i6 < c3003lArr6.length; i6++) {
                OnenoteOperation onenoteOperation = (OnenoteOperation) eVar.b(c3003lArr6[i6].toString(), OnenoteOperation.class);
                onenoteOperationArr[i6] = onenoteOperation;
                onenoteOperation.d(eVar, c3003lArr6[i6]);
            }
            baseOnenoteOperationCollectionResponse.a = Arrays.asList(onenoteOperationArr);
            this.k = new OnenoteOperationCollectionPage(baseOnenoteOperationCollectionResponse, null);
        }
    }
}
