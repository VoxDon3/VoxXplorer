package ax.E3;

import ax.O4.d;
import com.box.androidsdk.content.models.BoxFolder;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestItem;
import com.box.androidsdk.content.requests.BoxRequestItemUpdate;
import com.box.androidsdk.content.requests.BoxRequestsFolder$CreateFolder;
import com.box.androidsdk.content.requests.BoxRequestsFolder$DeleteFolder;
import com.box.androidsdk.content.requests.BoxRequestsFolder$GetFolderItems;
import com.box.androidsdk.content.requests.BoxRequestsFolder$UpdateFolder;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends a {
    public c(BoxSession boxSession) {
        super(boxSession);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.box.androidsdk.content.requests.BoxRequestsFolder$CreateFolder] */
    public BoxRequestsFolder$CreateFolder c(final String str, final String str2) {
        final String g = g();
        final BoxSession boxSession = this.a;
        return new BoxRequestItem<BoxFolder, BoxRequestsFolder$CreateFolder>(str, str2, g, boxSession) { // from class: com.box.androidsdk.content.requests.BoxRequestsFolder$CreateFolder
            private static final long serialVersionUID = 8123965031279971505L;

            {
                super(BoxFolder.class, null, g, boxSession);
                this.mRequestMethod = BoxRequest.Methods.POST;
                G(str);
                F(str2);
            }

            public BoxRequestsFolder$CreateFolder F(String str3) {
                this.mBodyMap.put("name", str3);
                return this;
            }

            public BoxRequestsFolder$CreateFolder G(String str3) {
                this.mBodyMap.put("parent", BoxFolder.S(str3));
                return this;
            }
        };
    }

    public BoxRequestsFolder$DeleteFolder d(String str) {
        return new BoxRequestsFolder$DeleteFolder(str, e(str), this.a);
    }

    protected String e(String str) {
        return String.format("%s/%s", g(), str);
    }

    protected String f(String str) {
        return e(str) + "/items";
    }

    protected String g() {
        return String.format("%s/folders", b());
    }

    public BoxRequestsFolder$GetFolderItems h(String str) {
        return new BoxRequestsFolder$GetFolderItems(str, f(str), this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.box.androidsdk.content.requests.BoxRequestsFolder$UpdateFolder] */
    public BoxRequestsFolder$UpdateFolder i(final String str) {
        final String e = e(str);
        final BoxSession boxSession = this.a;
        return new BoxRequestItemUpdate<BoxFolder, BoxRequestsFolder$UpdateFolder>(str, e, boxSession) { // from class: com.box.androidsdk.content.requests.BoxRequestsFolder$UpdateFolder
            private static final long serialVersionUID = 8123965031279971522L;

            @Override // com.box.androidsdk.content.requests.BoxRequestItemUpdate, com.box.androidsdk.content.requests.BoxRequest
            protected void v(d dVar, Map.Entry<String, Object> entry) {
                if (entry.getKey().equals("folder_upload_email")) {
                    dVar.B(entry.getKey(), w(entry.getValue()));
                    return;
                }
                if (entry.getKey().equals("owned_by")) {
                    dVar.B(entry.getKey(), w(entry.getValue()));
                } else if (!entry.getKey().equals("sync_state")) {
                    super.v(dVar, entry);
                } else {
                    dVar.C(entry.getKey(), ((BoxFolder.SyncState) entry.getValue()).toString());
                }
            }
        };
    }
}
