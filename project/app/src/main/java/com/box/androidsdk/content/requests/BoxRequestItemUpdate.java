/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import ax.O4.d;
import com.box.androidsdk.content.models.BoxFolder;
import com.box.androidsdk.content.models.BoxItem;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestItem;
import java.util.AbstractMap;
import java.util.Map;

public abstract class BoxRequestItemUpdate<E extends BoxItem, R extends BoxRequest<E, R>>
extends BoxRequestItem<E, R> {
    public BoxRequestItemUpdate(Class<E> clazz, String string, String string2, BoxSession boxSession) {
        super(clazz, string, string2, boxSession);
        this.mRequestMethod = BoxRequest.Methods.d0;
    }

    public R F(String string) {
        ((AbstractMap)this.mBodyMap).put("name", string);
        return (R)this;
    }

    public R G(String object) {
        object = BoxFolder.S((String)object);
        ((AbstractMap)this.mBodyMap).put("parent", object);
        return (R)this;
    }

    @Override
    protected void v(d d8, Map.Entry<String, Object> entry) {
        if (entry.getKey().equals("parent")) {
            d8.B(entry.getKey(), this.w(entry.getValue()));
            return;
        }
        if (entry.getKey().equals("shared_link")) {
            if (entry.getValue() == null) {
                d8.C(entry.getKey(), null);
                return;
            }
            d8.B(entry.getKey(), this.w(entry.getValue()));
            return;
        }
        super.v(d8, entry);
    }
}

