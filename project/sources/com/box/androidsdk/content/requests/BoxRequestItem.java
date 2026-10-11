package com.box.androidsdk.content.requests;

import android.text.TextUtils;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxJsonObject;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequest;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class BoxRequestItem<E extends BoxJsonObject, R extends BoxRequest<E, R>> extends BoxRequest<E, R> {
    protected static String e0 = "fields";
    protected StringBuffer mHintHeader;
    protected String mId;

    public BoxRequestItem(Class<E> cls, String str, String str2, BoxSession boxSession) {
        super(cls, str2, boxSession);
        this.mId = null;
        this.mHintHeader = new StringBuffer();
        this.mContentType = BoxRequest.ContentTypes.JSON;
        this.mId = str;
    }

    public R E(String... strArr) {
        if (strArr.length == 1 && strArr[0] == null) {
            this.mQueryMap.remove(e0);
            return this;
        }
        if (strArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                sb.append(String.format(Locale.ENGLISH, ",%s", strArr[i]));
            }
            this.mQueryMap.put(e0, sb.toString());
        }
        return this;
    }

    @Override // com.box.androidsdk.content.requests.BoxRequest
    protected void f() {
        super.f();
        if (TextUtils.isEmpty(this.mHintHeader)) {
            return;
        }
        this.mHeaderMap.put("x-rep-hints", this.mHintHeader.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.box.androidsdk.content.requests.BoxRequest
    protected void u(BoxResponse<E> boxResponse) throws BoxException {
        super.u(boxResponse);
        super.q(boxResponse);
    }
}
