/*
 * Decompiled with CFR 0.152.
 */
package ax.E3;

import ax.E3.a;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequestsFile$CopyFile;
import com.box.androidsdk.content.requests.BoxRequestsFile$DeleteFile;
import com.box.androidsdk.content.requests.BoxRequestsFile$DownloadFile;
import com.box.androidsdk.content.requests.BoxRequestsFile$DownloadThumbnail;
import com.box.androidsdk.content.requests.BoxRequestsFile$UpdateFile;
import com.box.androidsdk.content.requests.BoxRequestsFile$UploadFile;
import com.box.androidsdk.content.requests.BoxRequestsFile$UploadNewVersion;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;

public class b
extends a {
    public b(BoxSession boxSession) {
        super(boxSession);
    }

    public BoxRequestsFile$CopyFile c(String string, String string2) {
        return new BoxRequestsFile$CopyFile(string, string2, this.g(string), this.a);
    }

    public BoxRequestsFile$DeleteFile d(String string) {
        return new BoxRequestsFile$DeleteFile(string, this.i(string), this.a);
    }

    public BoxRequestsFile$DownloadFile e(OutputStream outputStream, String string) {
        return new BoxRequestsFile$DownloadFile(string, outputStream, this.h(string), this.a);
    }

    public BoxRequestsFile$DownloadThumbnail f(OutputStream outputStream, String string) {
        return new BoxRequestsFile$DownloadThumbnail(string, outputStream, this.m(string), this.a);
    }

    protected String g(String string) {
        Locale locale = Locale.ENGLISH;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.i(string));
        stringBuilder.append("/copy");
        return String.format(locale, stringBuilder.toString(), new Object[0]);
    }

    protected String h(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.i(string));
        stringBuilder.append("/content");
        return stringBuilder.toString();
    }

    protected String i(String string) {
        return String.format(Locale.ENGLISH, "%s/%s", this.l(), string);
    }

    protected String j(String string) {
        return String.format(Locale.ENGLISH, "%s/files/%s/content", this.a(), string);
    }

    protected String k() {
        return String.format(Locale.ENGLISH, "%s/files/content", this.a());
    }

    protected String l() {
        return String.format(Locale.ENGLISH, "%s/files", this.b());
    }

    protected String m(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.i(string));
        stringBuilder.append("/thumbnail");
        return stringBuilder.toString();
    }

    public BoxRequestsFile$UpdateFile n(String string) {
        return new BoxRequestsFile$UpdateFile(string, this.i(string), this.a);
    }

    public BoxRequestsFile$UploadNewVersion o(InputStream inputStream, String string) {
        return new BoxRequestsFile$UploadNewVersion(inputStream, this.j(string), this.a);
    }

    public BoxRequestsFile$UploadFile p(InputStream inputStream, String string, String string2) {
        return new BoxRequestsFile$UploadFile(inputStream, string, string2, this.k(), this.a);
    }
}

