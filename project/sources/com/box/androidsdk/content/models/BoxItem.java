package com.box.androidsdk.content.models;

import ax.O4.d;
import java.util.Date;
import java.util.EnumSet;

/* loaded from: classes.dex */
public abstract class BoxItem extends BoxEntity {
    private static final long serialVersionUID = 4876182952337609430L;
    protected transient EnumSet<Permission> c0;

    public enum Permission {
        CAN_PREVIEW("can_preview"),
        CAN_DOWNLOAD("can_download"),
        CAN_UPLOAD("can_upload"),
        CAN_INVITE_COLLABORATOR("can_invite_collaborator"),
        CAN_RENAME("can_rename"),
        CAN_DELETE("can_delete"),
        CAN_SHARE("can_share"),
        CAN_SET_SHARE_ACCESS("can_set_share_access"),
        CAN_COMMENT("can_comment");

        private final String value;

        Permission(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public BoxItem() {
        this.c0 = null;
    }

    protected Date I() {
        return q("content_modified_at");
    }

    public String J() {
        return u("item_status");
    }

    public Date K() {
        return q("modified_at");
    }

    public String M() {
        return u("name");
    }

    public BoxFolder N() {
        return (BoxFolder) r(BoxJsonObject.l(BoxFolder.class), "parent");
    }

    public BoxIterator<BoxFolder> O() {
        return (BoxIterator) r(BoxJsonObject.l(BoxIteratorBoxEntity.class), "path_collection");
    }

    public EnumSet<Permission> P() {
        if (this.c0 == null) {
            R();
        }
        return this.c0;
    }

    public Long Q() {
        return t("size");
    }

    protected EnumSet<Permission> R() {
        BoxPermission boxPermission = (BoxPermission) r(BoxJsonObject.l(BoxPermission.class), "permissions");
        if (boxPermission == null) {
            return null;
        }
        EnumSet<Permission> C = boxPermission.C();
        this.c0 = C;
        return C;
    }

    public BoxItem(d dVar) {
        super(dVar);
        this.c0 = null;
    }
}
