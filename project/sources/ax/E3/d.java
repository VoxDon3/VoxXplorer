package ax.E3;

import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequestsSearch$Search;

/* loaded from: classes.dex */
public class d extends a {
    public d(BoxSession boxSession) {
        super(boxSession);
    }

    public BoxRequestsSearch$Search c(String str) {
        return new BoxRequestsSearch$Search(str, d(), this.a);
    }

    protected String d() {
        return String.format("%s/search", b());
    }
}
