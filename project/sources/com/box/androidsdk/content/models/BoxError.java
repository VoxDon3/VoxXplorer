package com.box.androidsdk.content.models;

/* loaded from: classes.dex */
public class BoxError extends BoxJsonObject {
    public String C() {
        return u("code");
    }

    public String D() {
        String u = u("error");
        return u == null ? C() : u;
    }

    public String E() {
        return u("error_description");
    }
}
