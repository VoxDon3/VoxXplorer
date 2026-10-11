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
import com.microsoft.graph.extensions.OnenotePage;
import com.microsoft.graph.extensions.OnenotePageCollectionPage;
import com.microsoft.graph.extensions.SectionGroup;
import com.microsoft.graph.extensions.SectionLinks;
import com.microsoft.graph.generated.BaseOnenotePageCollectionResponse;
import java.util.Arrays;

public class BaseOnenoteSection
extends OnenoteEntityHierarchyModel
implements d {
    @a
    @c(value="isDefault")
    public Boolean r;
    @a
    @c(value="links")
    public SectionLinks s;
    @a
    @c(value="pagesUrl")
    public String t;
    @a
    @c(value="parentNotebook")
    public Notebook u;
    @a
    @c(value="parentSectionGroup")
    public SectionGroup v;
    public transient OnenotePageCollectionPage w;
    private transient l x;
    private transient e y;

    @Override
    public void d(e e8, l onenotePageArray) {
        this.y = e8;
        this.x = onenotePageArray;
        if (onenotePageArray.x("pages")) {
            BaseOnenotePageCollectionResponse baseOnenotePageCollectionResponse = new BaseOnenotePageCollectionResponse();
            if (onenotePageArray.x("pages@odata.nextLink")) {
                baseOnenotePageCollectionResponse.b = onenotePageArray.t("pages@odata.nextLink").k();
            }
            l[] lArray = e8.b(onenotePageArray.t("pages").toString(), l[].class);
            onenotePageArray = new OnenotePage[lArray.length];
            for (int i8 = 0; i8 < lArray.length; ++i8) {
                OnenotePage onenotePage;
                onenotePageArray[i8] = onenotePage = e8.b(lArray[i8].toString(), OnenotePage.class);
                onenotePage.d(e8, lArray[i8]);
            }
            baseOnenotePageCollectionResponse.a = Arrays.asList(onenotePageArray);
            this.w = new OnenotePageCollectionPage(baseOnenotePageCollectionResponse, null);
        }
    }
}

