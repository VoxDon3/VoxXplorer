package ax.J7;

import ax.L7.F;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: ax.J7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0762g implements F {
    private final byte[] a;
    private final String b;
    private final String c;

    C0762g(String str, String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.a = bArr;
    }

    private byte[] c() {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean d() {
        byte[] bArr = this.a;
        return bArr == null || bArr.length == 0;
    }

    @Override // ax.J7.F
    public String a() {
        return this.c;
    }

    @Override // ax.J7.F
    public F.d.b b() {
        byte[] c = c();
        if (c == null) {
            return null;
        }
        return F.d.b.a().b(c).c(this.b).a();
    }

    @Override // ax.J7.F
    public InputStream j() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }
}
