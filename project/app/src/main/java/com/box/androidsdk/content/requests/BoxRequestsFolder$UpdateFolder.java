/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import ax.O4.d;
import com.box.androidsdk.content.models.BoxFolder;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequestItemUpdate;
import java.util.Map;

public class BoxRequestsFolder$UpdateFolder
extends BoxRequestItemUpdate<BoxFolder, BoxRequestsFolder$UpdateFolder> {
    private static final long serialVersionUID = 8123965031279971522L;

    public BoxRequestsFolder$UpdateFolder(String string, String string2, BoxSession boxSession) {
        super(BoxFolder.class, string, string2, boxSession);
    }

    @Override
    protected void v(d d8, Map.Entry<String, Object> entry) {
        if (entry.getKey().equals("folder_upload_email")) {
            d8.B(entry.getKey(), this.w(entry.getValue()));
            return;
        }
        if (entry.getKey().equals("owned_by")) {
            d8.B(entry.getKey(), this.w(entry.getValue()));
            return;
        }
        if (entry.getKey().equals("sync_state")) {
            BoxFolder.SyncState syncState = (BoxFolder.SyncState)((Object)entry.getValue());
            d8.C(entry.getKey(), syncState.toString());
            return;
        }
        super.v(d8, entry);
    }
}

