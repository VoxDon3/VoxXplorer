/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import android.text.TextUtils;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxJsonObject;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxResponse;
import java.util.AbstractMap;
import java.util.Locale;

public abstract class BoxRequestItem<E extends BoxJsonObject, R extends BoxRequest<E, R>>
extends BoxRequest<E, R> {
    protected static String e0 = "fields";
    protected StringBuffer mHintHeader = new StringBuffer();
    protected String mId = null;

    public BoxRequestItem(Class<E> clazz, String string, String string2, BoxSession boxSession) {
        super(clazz, string2, boxSession);
        this.mContentType = BoxRequest.ContentTypes.q;
        this.mId = string;
    }

    public R E(String ... stringArray) {
        if (stringArray.length == 1 && stringArray[0] == null) {
            this.mQueryMap.remove(e0);
            return (R)this;
        }
        if (stringArray.length > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(stringArray[0]);
            for (int i8 = 1; i8 < stringArray.length; ++i8) {
                stringBuilder.append(String.format(Locale.ENGLISH, ",%s", stringArray[i8]));
            }
            this.mQueryMap.put(e0, stringBuilder.toString());
        }
        return (R)this;
    }

    @Override
    protected void f() {
        super.f();
        if (!TextUtils.isEmpty((CharSequence)this.mHintHeader)) {
            ((AbstractMap)this.mHeaderMap).put("x-rep-hints", this.mHintHeader.toString());
        }
    }

    @Override
    protected void u(BoxResponse<E> boxResponse) throws BoxException {
        super.u(boxResponse);
        super.q(boxResponse);
    }
}

