/*
 * Decompiled with CFR 0.152.
 */
package ax.o7;

import ax.m7.n;
import ax.o7.a;

public abstract class b<T>
extends ax.h7.b<T> {
    @n
    private String alt;
    @n
    private String fields;
    @n
    private String key;
    @n(value="oauth_token")
    private String oauthToken;
    @n
    private Boolean prettyPrint;
    @n
    private String quotaUser;
    @n
    private String userIp;

    public b(a a8, String string, String string2, Object object, Class<T> clazz) {
        super(a8, string, string2, object, clazz);
    }

    public final a D() {
        return (a)super.z();
    }

    public b<T> E(String string, Object object) {
        return (b)super.C(string, object);
    }

    public b<T> F(String string) {
        this.fields = string;
        return this;
    }
}

