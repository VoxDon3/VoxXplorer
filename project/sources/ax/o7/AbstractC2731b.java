package ax.o7;

import ax.h7.AbstractC2165b;
import ax.m7.n;

/* renamed from: ax.o7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2731b<T> extends AbstractC2165b<T> {

    @n
    private String alt;

    @n
    private String fields;

    @n
    private String key;

    @n("oauth_token")
    private String oauthToken;

    @n
    private Boolean prettyPrint;

    @n
    private String quotaUser;

    @n
    private String userIp;

    public AbstractC2731b(C2730a c2730a, String str, String str2, Object obj, Class<T> cls) {
        super(c2730a, str, str2, obj, cls);
    }

    @Override // ax.h7.AbstractC2165b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final C2730a o() {
        return (C2730a) super.o();
    }

    @Override // ax.h7.AbstractC2165b, ax.g7.AbstractC2128b
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public AbstractC2731b<T> f(String str, Object obj) {
        return (AbstractC2731b) super.f(str, obj);
    }

    public AbstractC2731b<T> F(String str) {
        this.fields = str;
        return this;
    }
}
