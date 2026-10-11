/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.models;

import com.box.androidsdk.content.models.BoxItem;
import com.box.androidsdk.content.models.BoxJsonObject;
import java.util.EnumSet;

public class BoxPermission
extends BoxJsonObject {
    EnumSet<BoxItem.Permission> C() {
        EnumSet<BoxItem.Permission> enumSet = EnumSet.noneOf(BoxItem.Permission.class);
        for (String string : this.n()) {
            Object object = this.p(string);
            if (object == null || !object.booleanValue()) continue;
            object = BoxItem.Permission.c0;
            if (string.equals(((BoxItem.Permission)((Object)object)).toString())) {
                enumSet.add((BoxItem.Permission)((Object)object));
                continue;
            }
            object = BoxItem.Permission.d0;
            if (string.equals(((BoxItem.Permission)((Object)object)).toString())) {
                enumSet.add((BoxItem.Permission)((Object)object));
                continue;
            }
            object = BoxItem.Permission.f0;
            if (string.equals(((BoxItem.Permission)((Object)object)).toString())) {
                enumSet.add((BoxItem.Permission)((Object)object));
                continue;
            }
            object = BoxItem.Permission.g0;
            if (string.equals(((BoxItem.Permission)((Object)object)).toString())) {
                enumSet.add((BoxItem.Permission)((Object)object));
                continue;
            }
            object = BoxItem.Permission.h0;
            if (string.equals(((BoxItem.Permission)((Object)object)).toString())) {
                enumSet.add((BoxItem.Permission)((Object)object));
                continue;
            }
            object = BoxItem.Permission.i0;
            if (string.equals(((BoxItem.Permission)((Object)object)).toString())) {
                enumSet.add((BoxItem.Permission)((Object)object));
                continue;
            }
            object = BoxItem.Permission.q;
            if (string.equals(((BoxItem.Permission)((Object)object)).toString())) {
                enumSet.add((BoxItem.Permission)((Object)object));
                continue;
            }
            object = BoxItem.Permission.j0;
            if (string.equals(((BoxItem.Permission)((Object)object)).toString())) {
                enumSet.add((BoxItem.Permission)((Object)object));
                continue;
            }
            object = BoxItem.Permission.e0;
            if (!string.equals(((BoxItem.Permission)((Object)object)).toString())) continue;
            enumSet.add((BoxItem.Permission)((Object)object));
        }
        return enumSet;
    }
}

