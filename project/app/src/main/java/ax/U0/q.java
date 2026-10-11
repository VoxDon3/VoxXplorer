/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import ax.S0.d0;
import ax.U0.b;
import ax.U0.h;
import ax.U0.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class q
extends b {
    private RandomAccessFile e;
    private Uri f;
    private long g;
    private boolean h;

    public q() {
        super(false);
    }

    private static RandomAccessFile u(Uri uri) throws a {
        FileNotFoundException fileNotFoundException2;
        int n8;
        block6: {
            n8 = 2006;
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(ax.S0.a.e(uri.getPath()), "r");
                return randomAccessFile;
            }
            catch (SecurityException securityException) {
            }
            catch (FileNotFoundException fileNotFoundException2) {
                break block6;
            }
            catch (RuntimeException runtimeException) {
                throw new a(runtimeException, 2000);
            }
            throw new a(securityException, 2006);
        }
        if (TextUtils.isEmpty((CharSequence)uri.getQuery()) && TextUtils.isEmpty((CharSequence)uri.getFragment())) {
            if (!(fileNotFoundException2.getCause() instanceof ErrnoException) || ((ErrnoException)fileNotFoundException2.getCause()).errno != OsConstants.EACCES) {
                n8 = 2005;
            }
            throw new a(fileNotFoundException2, n8);
        }
        throw new a(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), fileNotFoundException2, 1004);
    }

    @Override
    public Uri b() {
        return this.f;
    }

    @Override
    public int c(byte[] byArray, int n8, int n9) throws a {
        block4: {
            if (n9 == 0) {
                return 0;
            }
            if (this.g == 0L) {
                return -1;
            }
            try {
                n8 = d0.i(this.e).read(byArray, n8, (int)Math.min(this.g, (long)n9));
                if (n8 <= 0) break block4;
            }
            catch (IOException iOException) {
                throw new a(iOException, 2000);
            }
            this.g -= (long)n8;
            this.q(n8);
        }
        return n8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws a {
        Throwable throwable2;
        block7: {
            this.f = null;
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    this.r();
                }
                return;
            }
            catch (Throwable throwable2) {
                break block7;
            }
            catch (IOException iOException) {}
            {
                a a8 = new a(iOException, 2000);
                throw a8;
            }
        }
        this.e = null;
        if (this.h) {
            this.h = false;
            this.r();
        }
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long f(k k8) throws a {
        long l8;
        Object object = k8.a;
        this.f = object;
        this.s(k8);
        object = q.u((Uri)object);
        this.e = object;
        try {
            long l9;
            ((RandomAccessFile)object).seek(k8.g);
            l8 = l9 = k8.h;
            if (l9 == -1L) {
                l8 = this.e.length() - k8.g;
            }
        }
        catch (IOException iOException) {
            throw new a(iOException, 2000);
        }
        this.g = l8;
        if (l8 < 0L) throw new a(null, null, 2008);
        this.h = true;
        this.t(k8);
        return this.g;
    }

    public static class a
    extends h {
        public a(String string, Throwable throwable, int n8) {
            super(string, throwable, n8);
        }

        public a(Throwable throwable, int n8) {
            super(throwable, n8);
        }
    }
}

