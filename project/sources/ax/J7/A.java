package ax.J7;

import ax.L7.F;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
class A implements F {
    private final File a;
    private final String b;
    private final String c;

    A(String str, String str2, File file) {
        this.b = str;
        this.c = str2;
        this.a = file;
    }

    private byte[] c() {
        byte[] bArr = new byte[8192];
        try {
            InputStream j = j();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (j == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (j != null) {
                            j.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = j.read(bArr);
                            if (read <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                j.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, read);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // ax.J7.F
    public String a() {
        return this.c;
    }

    @Override // ax.J7.F
    public F.d.b b() {
        byte[] c = c();
        if (c != null) {
            return F.d.b.a().b(c).c(this.b).a();
        }
        return null;
    }

    @Override // ax.J7.F
    public InputStream j() {
        if (this.a.exists() && this.a.isFile()) {
            try {
                return new FileInputStream(this.a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
