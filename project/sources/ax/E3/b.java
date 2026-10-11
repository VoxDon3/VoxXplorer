package ax.E3;

import android.text.TextUtils;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.models.BoxFile;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.models.BoxVoid;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestDownload;
import com.box.androidsdk.content.requests.BoxRequestItemDelete;
import com.box.androidsdk.content.requests.BoxRequestItemUpdate;
import com.box.androidsdk.content.requests.BoxRequestUpload;
import com.box.androidsdk.content.requests.BoxRequestsFile$CopyFile;
import com.box.androidsdk.content.requests.BoxRequestsFile$DeleteFile;
import com.box.androidsdk.content.requests.BoxRequestsFile$DownloadFile;
import com.box.androidsdk.content.requests.BoxRequestsFile$DownloadThumbnail;
import com.box.androidsdk.content.requests.BoxRequestsFile$UpdateFile;
import com.box.androidsdk.content.requests.BoxRequestsFile$UploadFile;
import com.box.androidsdk.content.requests.BoxRequestsFile$UploadNewVersion;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;

/* loaded from: classes.dex */
public class b extends a {
    public b(BoxSession boxSession) {
        super(boxSession);
    }

    public BoxRequestsFile$CopyFile c(String str, String str2) {
        return new BoxRequestsFile$CopyFile(str, str2, g(str), this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.box.androidsdk.content.requests.BoxRequestsFile$DeleteFile] */
    public BoxRequestsFile$DeleteFile d(final String str) {
        final String i = i(str);
        final BoxSession boxSession = this.a;
        return new BoxRequestItemDelete<BoxRequestsFile$DeleteFile>(str, i, boxSession) { // from class: com.box.androidsdk.content.requests.BoxRequestsFile$DeleteFile
            private static final long serialVersionUID = 8123965031279971593L;

            @Override // com.box.androidsdk.content.requests.BoxRequest
            protected void u(BoxResponse<BoxVoid> boxResponse) throws BoxException {
                super.u(boxResponse);
                super.q(boxResponse);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.box.androidsdk.content.requests.BoxRequestsFile$DownloadFile] */
    public BoxRequestsFile$DownloadFile e(final OutputStream outputStream, final String str) {
        final String h = h(str);
        final BoxSession boxSession = this.a;
        return new BoxRequestDownload<BoxDownload, BoxRequestsFile$DownloadFile>(str, outputStream, h, boxSession) { // from class: com.box.androidsdk.content.requests.BoxRequestsFile$DownloadFile
            private static final long serialVersionUID = 8123965031279971588L;
        };
    }

    public BoxRequestsFile$DownloadThumbnail f(OutputStream outputStream, String str) {
        return new BoxRequestsFile$DownloadThumbnail(str, outputStream, m(str), this.a);
    }

    protected String g(String str) {
        return String.format(Locale.ENGLISH, i(str) + "/copy", new Object[0]);
    }

    protected String h(String str) {
        return i(str) + "/content";
    }

    protected String i(String str) {
        return String.format(Locale.ENGLISH, "%s/%s", l(), str);
    }

    protected String j(String str) {
        return String.format(Locale.ENGLISH, "%s/files/%s/content", a(), str);
    }

    protected String k() {
        return String.format(Locale.ENGLISH, "%s/files/content", a());
    }

    protected String l() {
        return String.format(Locale.ENGLISH, "%s/files", b());
    }

    protected String m(String str) {
        return i(str) + "/thumbnail";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.box.androidsdk.content.requests.BoxRequestsFile$UpdateFile] */
    public BoxRequestsFile$UpdateFile n(final String str) {
        final String i = i(str);
        final BoxSession boxSession = this.a;
        return new BoxRequestItemUpdate<BoxFile, BoxRequestsFile$UpdateFile>(str, i, boxSession) { // from class: com.box.androidsdk.content.requests.BoxRequestsFile$UpdateFile
            private static final long serialVersionUID = 8123965031279971521L;
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.box.androidsdk.content.requests.BoxRequestsFile$UploadNewVersion] */
    public BoxRequestsFile$UploadNewVersion o(final InputStream inputStream, String str) {
        final String j = j(str);
        final BoxSession boxSession = this.a;
        return new BoxRequestUpload<BoxFile, BoxRequestsFile$UploadNewVersion>(inputStream, j, boxSession) { // from class: com.box.androidsdk.content.requests.BoxRequestsFile$UploadNewVersion
            private static String f0 = "{\"name\": \"%s\"}";

            @Override // com.box.androidsdk.content.requests.BoxRequestUpload
            protected c F() throws IOException, BoxException {
                c F = super.F();
                if (!TextUtils.isEmpty(this.mFileName)) {
                    F.d("attributes", String.format(Locale.ENGLISH, f0, this.mFileName));
                }
                return F;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.box.androidsdk.content.requests.BoxRequestsFile$UploadFile] */
    public BoxRequestsFile$UploadFile p(final InputStream inputStream, final String str, final String str2) {
        final String k = k();
        final BoxSession boxSession = this.a;
        return new BoxRequestUpload<BoxFile, BoxRequestsFile$UploadFile>(inputStream, str, str2, k, boxSession) { // from class: com.box.androidsdk.content.requests.BoxRequestsFile$UploadFile
            private static final long serialVersionUID = 8123965031279971502L;
            String mDestinationFolderId;

            {
                super(BoxFile.class, inputStream, k, boxSession);
                this.mRequestUrlString = k;
                this.mRequestMethod = BoxRequest.Methods.POST;
                this.mFileName = str;
                this.mStream = inputStream;
                this.mDestinationFolderId = str2;
            }

            @Override // com.box.androidsdk.content.requests.BoxRequestUpload
            protected c F() throws IOException, BoxException {
                c F = super.F();
                F.d("parent_id", this.mDestinationFolderId);
                return F;
            }
        };
    }
}
