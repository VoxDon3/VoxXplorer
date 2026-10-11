/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.models;

import com.box.androidsdk.content.models.BoxEntity;
import com.box.androidsdk.content.models.BoxIterator;
import com.box.androidsdk.content.models.BoxJsonObject;

public class BoxIteratorBoxEntity<E extends BoxEntity>
extends BoxIterator<E> {
    private static final long serialVersionUID = 8036181424029520417L;
    private transient BoxJsonObject.b<E> q;

    @Override
    protected BoxJsonObject.b<E> I() {
        BoxJsonObject.b<Object> b8 = this.q;
        if (b8 != null) {
            return b8;
        }
        this.q = b8 = BoxEntity.E();
        return b8;
    }
}

