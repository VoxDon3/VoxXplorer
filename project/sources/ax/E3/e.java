package ax.E3;

import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.models.BoxUser;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestDownload;
import com.box.androidsdk.content.requests.BoxRequestItem;
import com.box.androidsdk.content.requests.BoxRequestsFile$DownloadAvatar;
import com.box.androidsdk.content.requests.BoxRequestsFile$DownloadFile;
import com.box.androidsdk.content.requests.BoxRequestsUser$GetUserInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class e extends a {
    public e(BoxSession boxSession) {
        super(boxSession);
    }

    protected String c(String str) {
        return f(str) + "/avatar";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.box.androidsdk.content.requests.BoxRequestsUser$GetUserInfo] */
    public BoxRequestsUser$GetUserInfo d() {
        final String f = f("me");
        final BoxSession boxSession = this.a;
        return new BoxRequestItem<BoxUser, BoxRequestsUser$GetUserInfo>(f, boxSession) { // from class: com.box.androidsdk.content.requests.BoxRequestsUser$GetUserInfo
            {
                this.mRequestMethod = BoxRequest.Methods.GET;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.box.androidsdk.content.requests.BoxRequestsFile$DownloadAvatar] */
    public BoxRequestsFile$DownloadAvatar e(final File file, final String str) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        final String c = c(str);
        final BoxSession boxSession = this.a;
        return new BoxRequestDownload<BoxDownload, BoxRequestsFile$DownloadFile>(str, file, c, boxSession) { // from class: com.box.androidsdk.content.requests.BoxRequestsFile$DownloadAvatar
            public BoxRequestsFile$DownloadAvatar I(String str2) {
                this.mQueryMap.put("pic_type", str2);
                return this;
            }
        }.I("large");
    }

    protected String f(String str) {
        return String.format("%s/%s", g(), str);
    }

    protected String g() {
        return String.format("%s/users", b());
    }
}
