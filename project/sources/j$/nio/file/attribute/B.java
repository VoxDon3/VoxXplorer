package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* loaded from: classes2.dex */
public final /* synthetic */ class B {
    public final /* synthetic */ UserPrincipalLookupService a;

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    public B(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }
}
