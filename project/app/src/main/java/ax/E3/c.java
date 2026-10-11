/*
 * Decompiled with CFR 0.152.
 */
package ax.E3;

import ax.E3.a;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequestsFolder$CreateFolder;
import com.box.androidsdk.content.requests.BoxRequestsFolder$DeleteFolder;
import com.box.androidsdk.content.requests.BoxRequestsFolder$GetFolderItems;
import com.box.androidsdk.content.requests.BoxRequestsFolder$UpdateFolder;

public class c
extends a {
    public c(BoxSession boxSession) {
        super(boxSession);
    }

    public BoxRequestsFolder$CreateFolder c(String string, String string2) {
        return new BoxRequestsFolder$CreateFolder(string, string2, this.g(), this.a);
    }

    public BoxRequestsFolder$DeleteFolder d(String string) {
        return new BoxRequestsFolder$DeleteFolder(string, this.e(string), this.a);
    }

    protected String e(String string) {
        return String.format("%s/%s", this.g(), string);
    }

    protected String f(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e(string));
        stringBuilder.append("/items");
        return stringBuilder.toString();
    }

    protected String g() {
        return String.format("%s/folders", this.b());
    }

    public BoxRequestsFolder$GetFolderItems h(String string) {
        return new BoxRequestsFolder$GetFolderItems(string, this.f(string), this.a);
    }

    public BoxRequestsFolder$UpdateFolder i(String string) {
        return new BoxRequestsFolder$UpdateFolder(string, this.e(string), this.a);
    }
}

