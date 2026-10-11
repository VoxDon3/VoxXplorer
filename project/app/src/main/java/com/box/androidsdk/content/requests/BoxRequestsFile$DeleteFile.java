/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.models.BoxVoid;
import com.box.androidsdk.content.requests.BoxRequestItemDelete;
import com.box.androidsdk.content.requests.BoxResponse;

public class BoxRequestsFile$DeleteFile
extends BoxRequestItemDelete<BoxRequestsFile$DeleteFile> {
    private static final long serialVersionUID = 8123965031279971593L;

    public BoxRequestsFile$DeleteFile(String string, String string2, BoxSession boxSession) {
        super(string, string2, boxSession);
    }

    @Override
    protected void u(BoxResponse<BoxVoid> boxResponse) throws BoxException {
        super.u(boxResponse);
        super.q(boxResponse);
    }
}

