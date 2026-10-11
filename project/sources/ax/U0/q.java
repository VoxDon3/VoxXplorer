package ax.U0;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import ax.S0.C0968a;
import ax.S0.d0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class q extends b {
    private RandomAccessFile e;
    private Uri f;
    private long g;
    private boolean h;

    public static class a extends h {
        public a(Throwable th, int i) {
            super(th, i);
        }

        public a(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public q() {
        super(false);
    }

    private static RandomAccessFile u(Uri uri) throws a {
        try {
            return new RandomAccessFile((String) C0968a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new a(e, ((e.getCause() instanceof ErrnoException) && ((ErrnoException) e.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new a(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new a(e2, 2006);
        } catch (RuntimeException e3) {
            throw new a(e3, 2000);
        }
    }

    @Override // ax.U0.g
    public Uri b() {
        return this.f;
    }

    @Override // ax.P0.InterfaceC0902k
    public int c(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        if (this.g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) d0.i(this.e)).read(bArr, i, (int) Math.min(this.g, i2));
            if (read > 0) {
                this.g -= read;
                q(read);
            }
            return read;
        } catch (IOException e) {
            throw new a(e, 2000);
        }
    }

    @Override // ax.U0.g
    public void close() throws a {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
                r();
            }
        }
    }

    @Override // ax.U0.g
    public long f(k kVar) throws a {
        Uri uri = kVar.a;
        this.f = uri;
        s(kVar);
        RandomAccessFile u = u(uri);
        this.e = u;
        try {
            u.seek(kVar.g);
            long j = kVar.h;
            if (j == -1) {
                j = this.e.length() - kVar.g;
            }
            this.g = j;
            if (j < 0) {
                throw new a(null, null, 2008);
            }
            this.h = true;
            t(kVar);
            return this.g;
        } catch (IOException e) {
            throw new a(e, 2000);
        }
    }
}
