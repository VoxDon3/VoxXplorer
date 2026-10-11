package com.socialnmobile.dav.gson;

import androidx.annotation.Keep;
import ax.s8.InterfaceC3061c;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class Multistatus {
    protected String responsedescription;

    @InterfaceC3061c("response")
    protected List<Response> responses;

    @InterfaceC3061c("sync-token")
    protected String syncToken;

    public List<Response> getResponse() {
        return this.responses;
    }

    public String getResponseDescription() {
        return this.responsedescription;
    }
}
