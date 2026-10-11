/*
 * Decompiled with CFR 0.152.
 */
package ax.E3;

import ax.E3.a;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequestsFile$DownloadAvatar;
import com.box.androidsdk.content.requests.BoxRequestsUser$GetUserInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class e
extends a {
    public e(BoxSession boxSession) {
        super(boxSession);
    }

    protected String c(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f(string));
        stringBuilder.append("/avatar");
        return stringBuilder.toString();
    }

    public BoxRequestsUser$GetUserInfo d() {
        return new BoxRequestsUser$GetUserInfo(this.f("me"), this.a);
    }

    public BoxRequestsFile$DownloadAvatar e(File file, String string) throws IOException {
        if (file.exists()) {
            return new BoxRequestsFile$DownloadAvatar(string, file, this.c(string), this.a).I("large");
        }
        throw new FileNotFoundException();
    }

    protected String f(String string) {
        return String.format("%s/%s", this.g(), string);
    }

    protected String g() {
        return String.format("%s/users", this.b());
    }
}

