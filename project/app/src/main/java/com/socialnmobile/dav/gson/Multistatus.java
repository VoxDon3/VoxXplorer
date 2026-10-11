/*
 * Decompiled with CFR 0.152.
 */
package com.socialnmobile.dav.gson;

import androidx.annotation.Keep;
import ax.s8.c;
import com.socialnmobile.dav.gson.Response;
import java.util.List;

@Keep
public class Multistatus {
    protected String responsedescription;
    @c(value="response")
    protected List<Response> responses;
    @c(value="sync-token")
    protected String syncToken;

    public List<Response> getResponse() {
        return this.responses;
    }

    public String getResponseDescription() {
        return this.responsedescription;
    }
}

