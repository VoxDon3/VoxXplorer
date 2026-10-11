/*
 * Decompiled with CFR 0.152.
 */
package com.socialnmobile.dav.gson;

import androidx.annotation.Keep;
import ax.s8.c;
import com.socialnmobile.dav.gson.Propstat;
import java.util.ArrayList;
import java.util.List;

@Keep
public class Response {
    private Object error;
    private String href;
    @c(value="propstat")
    private List<Propstat> propstats;
    private String responsedescription;
    private String status;

    public Object getError() {
        return this.error;
    }

    public String getHref() {
        String string;
        String string2 = string = this.href;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public List<Propstat> getPropstat() {
        if (this.propstats == null) {
            this.propstats = new ArrayList<Propstat>();
        }
        return this.propstats;
    }

    public String getResponsedescription() {
        return this.responsedescription;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String string) {
        this.status = string;
    }
}

