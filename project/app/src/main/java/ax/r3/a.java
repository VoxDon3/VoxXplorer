/*
 * Decompiled with CFR 0.152.
 */
package ax.r3;

import android.graphics.Bitmap;
import android.net.Uri;
import ax.Ha.c;
import ax.Q2.f;
import ax.Q2.g;
import ax.X2.Q;
import ax.Y9.b;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.x;
import ax.ka.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

public class a
extends ax.W9.a {
    private static final Logger i = ax.Q2.g.a(a.class);
    private File h;

    public a(File file, File file2) {
        super(file, null, new b());
        this.h = file2;
    }

    private void e(File[] fileArray, String string) {
        if (fileArray != null) {
            for (File file : fileArray) {
                if (!file.getName().startsWith(string)) continue;
                file.delete();
            }
        }
    }

    @Override
    public boolean a(String object, InputStream object2, c.a object3) throws IOException {
        int n8 = 0;
        if (object2 == null) {
            object3 = i;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Image stream is null Uri : ");
            ((StringBuilder)object2).append((String)object);
            ((Logger)object3).severe(((StringBuilder)object2).toString());
            return false;
        }
        Uri uri = Uri.parse((String)object);
        String string = uri.getScheme();
        f f8 = ax.Q2.f.E(string);
        if (ax.Q2.f.A0(f8)) {
            String string2 = uri.getPath();
            if (!uri.getHost().isEmpty()) {
                n8 = Integer.parseInt(uri.getHost());
            }
            n8 = x.d(f8, n8).G(string, string2);
        } else {
            n8 = -1;
        }
        boolean bl = super.a((String)object, (InputStream)object2, (c.a)object3);
        if (n8 != -1) {
            object = new ax.y0.a(this.c((String)object).getAbsolutePath());
            ((ax.y0.a)object).m0("Orientation", String.valueOf(n8));
            ((ax.y0.a)object).i0();
        }
        return bl;
    }

    @Override
    public boolean b(String string, Bitmap bitmap) throws IOException {
        if (bitmap.hasAlpha()) {
            if (Q.C() && bitmap.getConfig() == null) {
                this.d(Bitmap.CompressFormat.JPEG);
            } else {
                this.d(Bitmap.CompressFormat.PNG);
            }
        } else {
            this.d(Bitmap.CompressFormat.JPEG);
        }
        return super.b(string, bitmap);
    }

    @Override
    protected File c(String object) {
        Object object2;
        block9: {
            block10: {
                Object object3 = Uri.parse((String)object);
                Object object4 = object3.getPath();
                object2 = d0.h((String)object4);
                Object object5 = d0.r((String)object4);
                object4 = object3.getScheme();
                String string = object3.getAuthority();
                if ((object3 = object3.getFragment()) != null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append("-");
                    ((StringBuilder)object).append(this.c.a((String)object5));
                    ((StringBuilder)object).append("-");
                    ((StringBuilder)object).append(this.c.a((String)object2));
                    ((StringBuilder)object).append("-");
                    ((StringBuilder)object).append(this.c.a((String)object3));
                    object = ((StringBuilder)object).toString();
                } else {
                    object3 = ax.Ha.c.h().f().b("ERROR fragment is null");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("uri:");
                    stringBuilder.append((String)object);
                    ((ax.Ha.b)object3).g(stringBuilder.toString()).h();
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append("-");
                    ((StringBuilder)object).append(this.c.a((String)object5));
                    ((StringBuilder)object).append("-");
                    ((StringBuilder)object).append(this.c.a((String)object2));
                    object = ((StringBuilder)object).toString();
                }
                object2 = object4;
                if (object4 == null) {
                    object2 = "null";
                }
                object4 = new File(this.a, (String)object2);
                if (this.h != null && ((File)(object2 = new File(new File(this.h, (String)object2), (String)object))).exists()) {
                    return object2;
                }
                object2 = object4;
                if (((File)object4).exists()) break block9;
                object2 = object4;
                if (((File)object4).mkdirs()) break block9;
                object5 = this.b;
                object2 = object4;
                if (object5 == null) break block9;
                if (((File)object5).exists()) break block10;
                object2 = object4;
                if (!this.b.mkdirs()) break block9;
            }
            object2 = this.b;
        }
        if (((File)(object = new File((File)object2, (String)object))).exists()) {
            long l8 = System.currentTimeMillis();
            if (((File)object).lastModified() < l8 - 259200000L) {
                ((File)object).setLastModified(l8);
            }
        }
        return object;
    }

    public File f(String object) {
        if ((object = this.i((String)object)) != null && ((File)object).exists()) {
            return object;
        }
        return null;
    }

    public void g(K k8) {
        String string = k8.d().K();
        this.e(new File(this.a, string.replace("://", "")).listFiles(), String.valueOf(k8.b()));
        string = k8.d().t();
        this.e(new File(this.a, string.replace("://", "")).listFiles(), String.valueOf(k8.b()));
    }

    public void h(String fileArray) {
        int n8;
        int n9;
        File[] fileArray2;
        File file = this.h;
        int n10 = 0;
        if (file != null && (file = new File(this.h, fileArray.replace("://", ""))).exists() && (fileArray2 = file.listFiles()) != null) {
            n9 = fileArray2.length;
            for (n8 = 0; n8 < n9; ++n8) {
                fileArray2[n8].delete();
            }
            file.delete();
        }
        if ((fileArray = new File(this.a, fileArray.replace("://", "")).listFiles()) != null) {
            n9 = fileArray.length;
            for (n8 = n10; n8 < n9; ++n8) {
                fileArray[n8].delete();
            }
        }
    }
}

