package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.InferenceClassificationOverride;
import com.microsoft.graph.extensions.InferenceClassificationOverrideCollectionPage;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseInferenceClassification extends Entity implements d {
    public transient InferenceClassificationOverrideCollectionPage f;
    private transient C3003l g;
    private transient e h;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.h = eVar;
        this.g = c3003l;
        if (c3003l.x("overrides")) {
            BaseInferenceClassificationOverrideCollectionResponse baseInferenceClassificationOverrideCollectionResponse = new BaseInferenceClassificationOverrideCollectionResponse();
            if (c3003l.x("overrides@odata.nextLink")) {
                baseInferenceClassificationOverrideCollectionResponse.b = c3003l.t("overrides@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("overrides").toString(), C3003l[].class);
            InferenceClassificationOverride[] inferenceClassificationOverrideArr = new InferenceClassificationOverride[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                InferenceClassificationOverride inferenceClassificationOverride = (InferenceClassificationOverride) eVar.b(c3003lArr[i].toString(), InferenceClassificationOverride.class);
                inferenceClassificationOverrideArr[i] = inferenceClassificationOverride;
                inferenceClassificationOverride.d(eVar, c3003lArr[i]);
            }
            baseInferenceClassificationOverrideCollectionResponse.a = Arrays.asList(inferenceClassificationOverrideArr);
            this.f = new InferenceClassificationOverrideCollectionPage(baseInferenceClassificationOverrideCollectionResponse, null);
        }
    }
}
