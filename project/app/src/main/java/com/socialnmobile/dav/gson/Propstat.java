/*
 * Decompiled with CFR 0.152.
 */
package com.socialnmobile.dav.gson;

import androidx.annotation.Keep;
import com.socialnmobile.dav.gson.Prop;

@Keep
public class Propstat {
    private Object error;
    private Prop prop;
    private String responsedescription;
    private String status;

    public Object getError() {
        return this.error;
    }

    public Prop getProp() {
        return this.prop;
    }

    public String getResponsedescription() {
        return this.responsedescription;
    }

    public String getStatus() {
        return this.status;
    }

    public void setProp(Prop prop) {
        this.prop = prop;
    }

    public void setResponsedescription(String string) {
        this.responsedescription = string;
    }

    public void setStatus(String string) {
        this.status = string;
    }
}

