/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.models;

import android.text.TextUtils;
import ax.O4.d;
import com.box.androidsdk.content.models.BoxCollaborationItem;

public class BoxFolder
extends BoxCollaborationItem {
    public static final String[] d0 = new String[]{"type", "sha1", "id", "sequence_id", "etag", "name", "created_at", "modified_at", "description", "size", "path_collection", "created_by", "modified_by", "trashed_at", "purged_at", "content_created_at", "content_modified_at", "owned_by", "shared_link", "folder_upload_email", "parent", "item_status", "item_collection", "sync_state", "has_collaborations", "permissions", "can_non_owners_invite", "is_externally_owned", "allowed_invitee_roles", "collections", "classification"};
    private static final long serialVersionUID = 8020073615785970254L;

    public BoxFolder() {
    }

    public BoxFolder(d d8) {
        super(d8);
    }

    public static BoxFolder S(String string) {
        return BoxFolder.T(string, null);
    }

    public static BoxFolder T(String string, String string2) {
        d d8 = new d();
        d8.C("id", string);
        d8.C("type", "folder");
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            d8.C("name", string2);
        }
        return new BoxFolder(d8);
    }

    @Override
    public Long Q() {
        return super.Q();
    }

    public static final class SyncState
    extends Enum<SyncState> {
        public static final /* enum */ SyncState c0;
        public static final /* enum */ SyncState d0;
        private static final SyncState[] e0;
        public static final /* enum */ SyncState q;
        private final String mValue;

        static {
            q = new SyncState("synced");
            c0 = new SyncState("not_synced");
            d0 = new SyncState("partially_synced");
            e0 = SyncState.d();
        }

        private SyncState(String string2) {
            this.mValue = string2;
        }

        private static /* synthetic */ SyncState[] d() {
            return new SyncState[]{q, c0, d0};
        }

        public static SyncState valueOf(String string) {
            return Enum.valueOf(SyncState.class, string);
        }

        public static SyncState[] values() {
            return (SyncState[])e0.clone();
        }

        public String toString() {
            return this.mValue;
        }
    }
}

