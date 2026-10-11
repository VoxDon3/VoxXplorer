package ax.r3;

import android.graphics.Bitmap;
import android.net.Uri;
import ax.Q2.g;
import ax.X2.Q;
import ax.c3.C1835x;
import ax.c3.K;
import ax.c3.d0;
import ax.ka.c;
import ax.y0.C3495a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: ax.r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2944a extends ax.W9.a {
    private static final Logger i = g.a(C2944a.class);
    private File h;

    public C2944a(File file, File file2) {
        super(file, null, new ax.Y9.b());
        this.h = file2;
    }

    private void e(File[] fileArr, String str) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            if (file.getName().startsWith(str)) {
                file.delete();
            }
        }
    }

    @Override // ax.W9.a, ax.V9.a
    public boolean a(String str, InputStream inputStream, c.a aVar) throws IOException {
        int i2;
        if (inputStream == null) {
            i.severe("Image stream is null Uri : " + str);
            return false;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        ax.Q2.f E = ax.Q2.f.E(scheme);
        if (ax.Q2.f.A0(E)) {
            i2 = C1835x.d(E, parse.getHost().isEmpty() ? 0 : Integer.parseInt(parse.getHost())).G(scheme, parse.getPath());
        } else {
            i2 = -1;
        }
        boolean a = super.a(str, inputStream, aVar);
        if (i2 != -1) {
            C3495a c3495a = new C3495a(c(str).getAbsolutePath());
            c3495a.m0("Orientation", String.valueOf(i2));
            c3495a.i0();
        }
        return a;
    }

    @Override // ax.W9.a, ax.V9.a
    public boolean b(String str, Bitmap bitmap) throws IOException {
        if (!bitmap.hasAlpha()) {
            d(Bitmap.CompressFormat.JPEG);
        } else if (Q.C() && bitmap.getConfig() == null) {
            d(Bitmap.CompressFormat.JPEG);
        } else {
            d(Bitmap.CompressFormat.PNG);
        }
        return super.b(str, bitmap);
    }

    @Override // ax.W9.a
    protected File c(String str) {
        String str2;
        File file;
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        String h = d0.h(path);
        String r = d0.r(path);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String fragment = parse.getFragment();
        if (fragment != null) {
            str2 = authority + "-" + this.c.a(r) + "-" + this.c.a(h) + "-" + this.c.a(fragment);
        } else {
            ax.Ha.c.h().f().b("ERROR fragment is null").g("uri:" + str).h();
            str2 = authority + "-" + this.c.a(r) + "-" + this.c.a(h);
        }
        if (scheme == null) {
            scheme = "null";
        }
        File file2 = new File(this.a, scheme);
        if (this.h != null) {
            File file3 = new File(new File(this.h, scheme), str2);
            if (file3.exists()) {
                return file3;
            }
        }
        if (!file2.exists() && !file2.mkdirs() && (file = this.b) != null && (file.exists() || this.b.mkdirs())) {
            file2 = this.b;
        }
        File file4 = new File(file2, str2);
        if (file4.exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (file4.lastModified() < currentTimeMillis - 259200000) {
                file4.setLastModified(currentTimeMillis);
            }
        }
        return file4;
    }

    public File f(String str) {
        File i2 = i(str);
        if (i2 == null || !i2.exists()) {
            return null;
        }
        return i2;
    }

    public void g(K k) {
        e(new File(this.a, k.d().K().replace("://", HttpUrl.FRAGMENT_ENCODE_SET)).listFiles(), String.valueOf(k.b()));
        e(new File(this.a, k.d().t().replace("://", HttpUrl.FRAGMENT_ENCODE_SET)).listFiles(), String.valueOf(k.b()));
    }

    public void h(String str) {
        File[] listFiles;
        if (this.h != null) {
            File file = new File(this.h, str.replace("://", HttpUrl.FRAGMENT_ENCODE_SET));
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
                file.delete();
            }
        }
        File[] listFiles2 = new File(this.a, str.replace("://", HttpUrl.FRAGMENT_ENCODE_SET)).listFiles();
        if (listFiles2 == null) {
            return;
        }
        for (File file3 : listFiles2) {
            file3.delete();
        }
    }
}
