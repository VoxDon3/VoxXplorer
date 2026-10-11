package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.OutlookCategory;
import com.microsoft.graph.extensions.OutlookCategoryCollectionPage;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseOutlookUser extends Entity implements d {
    public transient OutlookCategoryCollectionPage f;
    private transient C3003l g;
    private transient e h;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.h = eVar;
        this.g = c3003l;
        if (c3003l.x("masterCategories")) {
            BaseOutlookCategoryCollectionResponse baseOutlookCategoryCollectionResponse = new BaseOutlookCategoryCollectionResponse();
            if (c3003l.x("masterCategories@odata.nextLink")) {
                baseOutlookCategoryCollectionResponse.b = c3003l.t("masterCategories@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("masterCategories").toString(), C3003l[].class);
            OutlookCategory[] outlookCategoryArr = new OutlookCategory[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                OutlookCategory outlookCategory = (OutlookCategory) eVar.b(c3003lArr[i].toString(), OutlookCategory.class);
                outlookCategoryArr[i] = outlookCategory;
                outlookCategory.d(eVar, c3003lArr[i]);
            }
            baseOutlookCategoryCollectionResponse.a = Arrays.asList(outlookCategoryArr);
            this.f = new OutlookCategoryCollectionPage(baseOutlookCategoryCollectionResponse, null);
        }
    }
}
