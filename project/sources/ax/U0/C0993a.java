package ax.U0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import ax.S0.C0968a;
import ax.S0.d0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.U0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993a extends b {
    private final AssetManager e;
    private Uri f;
    private InputStream g;
    private long h;
    private boolean i;

    /* renamed from: ax.U0.a$a, reason: collision with other inner class name */
    public static final class C0201a extends h {
        public C0201a(Throwable th, int i) {
            super(th, i);
        }
    }

    public C0993a(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // ax.U0.g
    public Uri b() {
        return this.f;
    }

    @Override // ax.P0.InterfaceC0902k
    public int c(byte[] bArr, int i, int i2) throws C0201a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0201a(e, 2000);
            }
        }
        int read = ((InputStream) d0.i(this.g)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - read;
        }
        q(read);
        return read;
    }

    @Override // ax.U0.g
    public void close() throws C0201a {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C0201a(e, 2000);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                r();
            }
        }
    }

    @Override // ax.U0.g
    public long f(k kVar) throws C0201a {
        try {
            Uri uri = kVar.a;
            this.f = uri;
            String str = (String) C0968a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            s(kVar);
            InputStream open = this.e.open(str, 1);
            this.g = open;
            if (open.skip(kVar.g) < kVar.g) {
                throw new C0201a(null, 2008);
            }
            long j = kVar.h;
            if (j != -1) {
                this.h = j;
            } else {
                long available = this.g.available();
                this.h = available;
                if (available == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            t(kVar);
            return this.h;
        } catch (C0201a e) {
            throw e;
        } catch (IOException e2) {
            throw new C0201a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }
}
