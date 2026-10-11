/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.models;

import ax.O4.d;
import com.box.androidsdk.content.models.BoxEntity;
import com.box.androidsdk.content.models.BoxFolder;
import com.box.androidsdk.content.models.BoxIterator;
import com.box.androidsdk.content.models.BoxIteratorBoxEntity;
import com.box.androidsdk.content.models.BoxJsonObject;
import com.box.androidsdk.content.models.BoxPermission;
import java.io.Serializable;
import java.util.Date;
import java.util.EnumSet;

public abstract class BoxItem
extends BoxEntity {
    private static final long serialVersionUID = 4876182952337609430L;
    protected transient EnumSet<Permission> c0 = null;

    public BoxItem() {
    }

    public BoxItem(d d8) {
        super(d8);
    }

    protected Date I() {
        return this.q("content_modified_at");
    }

    public String J() {
        return this.u("item_status");
    }

    public Date K() {
        return this.q("modified_at");
    }

    public String M() {
        return this.u("name");
    }

    public BoxFolder N() {
        return this.r(BoxJsonObject.l(BoxFolder.class), "parent");
    }

    public BoxIterator<BoxFolder> O() {
        return this.r(BoxJsonObject.l(BoxIteratorBoxEntity.class), "path_collection");
    }

    public EnumSet<Permission> P() {
        if (this.c0 == null) {
            this.R();
        }
        return this.c0;
    }

    public Long Q() {
        return this.t("size");
    }

    protected EnumSet<Permission> R() {
        Serializable serializable = this.r(BoxJsonObject.l(BoxPermission.class), "permissions");
        if (serializable == null) {
            return null;
        }
        serializable = serializable.C();
        this.c0 = serializable;
        return serializable;
    }

    public static final class Permission
    extends Enum<Permission> {
        public static final /* enum */ Permission c0;
        public static final /* enum */ Permission d0;
        public static final /* enum */ Permission e0;
        public static final /* enum */ Permission f0;
        public static final /* enum */ Permission g0;
        public static final /* enum */ Permission h0;
        public static final /* enum */ Permission i0;
        public static final /* enum */ Permission j0;
        private static final Permission[] k0;
        public static final /* enum */ Permission q;
        private final String value;

        static {
            q = new Permission("can_preview");
            c0 = new Permission("can_download");
            d0 = new Permission("can_upload");
            e0 = new Permission("can_invite_collaborator");
            f0 = new Permission("can_rename");
            g0 = new Permission("can_delete");
            h0 = new Permission("can_share");
            i0 = new Permission("can_set_share_access");
            j0 = new Permission("can_comment");
            k0 = Permission.d();
        }

        private Permission(String string2) {
            this.value = string2;
        }

        private static /* synthetic */ Permission[] d() {
            return new Permission[]{q, c0, d0, e0, f0, g0, h0, i0, j0};
        }

        public static Permission valueOf(String string) {
            return Enum.valueOf(Permission.class, string);
        }

        public static Permission[] values() {
            return (Permission[])k0.clone();
        }

        public String toString() {
            return this.value;
        }
    }
}

