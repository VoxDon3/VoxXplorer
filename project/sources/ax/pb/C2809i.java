package ax.pb;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* renamed from: ax.pb.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2809i extends URLStreamHandler {
    static final URLStreamHandler a = new C2809i();

    @Override // java.net.URLStreamHandler
    protected int getDefaultPort() {
        return 445;
    }

    @Override // java.net.URLStreamHandler
    public URLConnection openConnection(URL url) throws IOException {
        return new C2796b0(url);
    }

    @Override // java.net.URLStreamHandler
    protected void parseURL(URL url, String str, int i, int i2) {
        String host = url.getHost();
        if (str.equals("smb://")) {
            i2 += 2;
            str = "smb:////";
        } else if (!str.startsWith("smb://") && host != null && host.length() == 0) {
            str = "//" + str;
            i2 += 2;
        }
        super.parseURL(url, str, i, i2);
        String path = url.getPath();
        String ref = url.getRef();
        if (ref != null) {
            path = path + '#' + ref;
        }
        String str2 = path;
        int port = url.getPort();
        if (port == -1) {
            port = getDefaultPort();
        }
        setURL(url, "smb", url.getHost(), port, url.getAuthority(), url.getUserInfo(), str2, url.getQuery(), null);
    }
}
