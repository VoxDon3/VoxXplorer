/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.models.BoxVoid;
import com.box.androidsdk.content.requests.BoxRequestItemDelete;
import com.box.androidsdk.content.requests.BoxResponse;
import java.util.HashMap;

public class BoxRequestsFolder$DeleteFolder
extends BoxRequestItemDelete<BoxRequestsFolder$DeleteFolder> {
    private static final long serialVersionUID = 8123965031279971594L;

    public BoxRequestsFolder$DeleteFolder(String string, String string2, BoxSession boxSession) {
        super(string, string2, boxSession);
        this.E(true);
    }

    public BoxRequestsFolder$DeleteFolder E(boolean bl) {
        HashMap<String, String> hashMap = this.mQueryMap;
        String string = bl ? "true" : "false";
        hashMap.put("recursive", string);
        return this;
    }

    @Override
    protected void u(BoxResponse<BoxVoid> boxResponse) throws BoxException {
        super.u(boxResponse);
        super.q(boxResponse);
    }
}

