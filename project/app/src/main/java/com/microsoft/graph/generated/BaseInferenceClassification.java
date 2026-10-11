/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.InferenceClassificationOverride;
import com.microsoft.graph.extensions.InferenceClassificationOverrideCollectionPage;
import com.microsoft.graph.generated.BaseInferenceClassificationOverrideCollectionResponse;
import java.util.Arrays;

public class BaseInferenceClassification
extends Entity
implements d {
    public transient InferenceClassificationOverrideCollectionPage f;
    private transient l g;
    private transient e h;

    @Override
    public void d(e e8, l lArray) {
        this.h = e8;
        this.g = lArray;
        if (lArray.x("overrides")) {
            BaseInferenceClassificationOverrideCollectionResponse baseInferenceClassificationOverrideCollectionResponse = new BaseInferenceClassificationOverrideCollectionResponse();
            if (lArray.x("overrides@odata.nextLink")) {
                baseInferenceClassificationOverrideCollectionResponse.b = lArray.t("overrides@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("overrides").toString(), l[].class);
            InferenceClassificationOverride[] inferenceClassificationOverrideArray = new InferenceClassificationOverride[lArray.length];
            for (int i8 = 0; i8 < lArray.length; ++i8) {
                InferenceClassificationOverride inferenceClassificationOverride;
                inferenceClassificationOverrideArray[i8] = inferenceClassificationOverride = e8.b(lArray[i8].toString(), InferenceClassificationOverride.class);
                inferenceClassificationOverride.d(e8, lArray[i8]);
            }
            baseInferenceClassificationOverrideCollectionResponse.a = Arrays.asList(inferenceClassificationOverrideArray);
            this.f = new InferenceClassificationOverrideCollectionPage(baseInferenceClassificationOverrideCollectionResponse, null);
        }
    }
}

