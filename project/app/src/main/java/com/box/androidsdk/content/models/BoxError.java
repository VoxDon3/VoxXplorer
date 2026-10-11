/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.models;

import com.box.androidsdk.content.models.BoxJsonObject;

public class BoxError
extends BoxJsonObject {
    public String C() {
        return this.u("code");
    }

    public String D() {
        String string;
        String string2 = string = this.u("error");
        if (string == null) {
            string2 = this.C();
        }
        return string2;
    }

    public String E() {
        return this.u("error_description");
    }
}

