/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.l0;
import com.microsoft.graph.extensions.MessageRule;
import com.microsoft.graph.generated.BaseMessageRuleCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseMessageRuleCollectionPage
extends BaseCollectionPage<MessageRule, l0>
implements IBaseCollectionPage {
    public BaseMessageRuleCollectionPage(BaseMessageRuleCollectionResponse baseMessageRuleCollectionResponse, l0 l02) {
        super(baseMessageRuleCollectionResponse.a, l02);
    }
}

