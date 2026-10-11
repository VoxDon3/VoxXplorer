/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.OutlookCategory;
import com.microsoft.graph.extensions.OutlookCategoryCollectionPage;
import com.microsoft.graph.generated.BaseOutlookCategoryCollectionResponse;
import java.util.Arrays;

public class BaseOutlookUser
extends Entity
implements d {
    public transient OutlookCategoryCollectionPage f;
    private transient l g;
    private transient e h;

    @Override
    public void d(e e8, l lArray) {
        this.h = e8;
        this.g = lArray;
        if (lArray.x("masterCategories")) {
            BaseOutlookCategoryCollectionResponse baseOutlookCategoryCollectionResponse = new BaseOutlookCategoryCollectionResponse();
            if (lArray.x("masterCategories@odata.nextLink")) {
                baseOutlookCategoryCollectionResponse.b = lArray.t("masterCategories@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("masterCategories").toString(), l[].class);
            OutlookCategory[] outlookCategoryArray = new OutlookCategory[lArray.length];
            for (int i8 = 0; i8 < lArray.length; ++i8) {
                OutlookCategory outlookCategory;
                outlookCategoryArray[i8] = outlookCategory = e8.b(lArray[i8].toString(), OutlookCategory.class);
                outlookCategory.d(e8, lArray[i8]);
            }
            baseOutlookCategoryCollectionResponse.a = Arrays.asList(outlookCategoryArray);
            this.f = new OutlookCategoryCollectionPage(baseOutlookCategoryCollectionResponse, null);
        }
    }
}

