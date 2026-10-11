/*
 * Decompiled with CFR 0.152.
 */
package ax.E3;

import ax.E3.a;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequestsSearch$Search;

public class d
extends a {
    public d(BoxSession boxSession) {
        super(boxSession);
    }

    public BoxRequestsSearch$Search c(String string) {
        return new BoxRequestsSearch$Search(string, this.d(), this.a);
    }

    protected String d() {
        return String.format("%s/search", this.b());
    }
}

