package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.f;
import j$.nio.channels.DesugarChannels;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b {
    private final AssetManager a;
    private final Executor b;
    private final f.c c;
    private final File e;
    private final String f;
    private final String g;
    private final String h;
    private c[] j;
    private byte[] k;
    private boolean i = false;
    private final byte[] d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.a = assetManager;
        this.b = executor;
        this.c = cVar;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        InputStream g;
        try {
            g = g(this.a, this.h);
        } catch (FileNotFoundException e) {
            this.c.b(9, e);
        } catch (IOException e2) {
            this.c.b(7, e2);
        } catch (IllegalStateException e3) {
            this.j = null;
            this.c.b(8, e3);
        }
        if (g == null) {
            if (g != null) {
                g.close();
            }
            return null;
        }
        try {
            this.j = g.r(g, g.p(g, g.b), bArr, cVarArr);
            g.close();
            return this;
        } catch (Throwable th) {
            try {
                g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void c() {
        if (!this.i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return null;
        }
        if (i >= 31) {
            return i.a;
        }
        switch (i) {
            case 24:
            case 25:
                return i.e;
            case 26:
                return i.d;
            case 27:
                return i.c;
            case 28:
            case 29:
            case 30:
                return i.b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.g);
        } catch (FileNotFoundException e) {
            this.c.b(6, e);
            return null;
        } catch (IOException e2) {
            this.c.b(7, e2);
            return null;
        }
    }

    private InputStream g(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.c.a(5, null);
            }
            return null;
        }
    }

    private c[] i(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        c[] x = g.x(inputStream, g.p(inputStream, g.a), this.f);
                        try {
                            inputStream.close();
                            return x;
                        } catch (IOException e) {
                            this.c.b(7, e);
                            return x;
                        }
                    } catch (IOException e2) {
                        this.c.b(7, e2);
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    this.c.b(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e4) {
                this.c.b(7, e4);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.c.b(7, e5);
            }
            throw th;
        }
    }

    private static boolean j() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return false;
        }
        return i >= 31 || i == 24 || i == 25;
    }

    private void k(final int i, final Object obj) {
        this.b.execute(new Runnable() { // from class: ax.g2.c
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.b.this.c.b(i, obj);
            }
        });
    }

    public boolean e() {
        if (this.d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.e.exists()) {
            try {
                if (!this.e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.e.canWrite()) {
            k(4, null);
            return false;
        }
        this.i = true;
        return true;
    }

    public b h() {
        b b;
        c();
        if (this.d != null) {
            InputStream f = f(this.a);
            if (f != null) {
                this.j = i(f);
            }
            c[] cVarArr = this.j;
            if (cVarArr != null && j() && (b = b(cVarArr, this.d)) != null) {
                return b;
            }
        }
        return this;
    }

    public b l() {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.j;
        byte[] bArr = this.d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g.F(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.c.b(7, e);
            } catch (IllegalStateException e2) {
                this.c.b(8, e2);
            }
            if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                this.c.b(5, null);
                this.j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m() {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        byte[] bArr = this.k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                    try {
                        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
                        try {
                            FileLock tryLock = convertMaybeLegacyFileChannelFromLibrary.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStream, tryLock);
                                k(1, null);
                                if (tryLock != null) {
                                    tryLock.close();
                                }
                                convertMaybeLegacyFileChannelFromLibrary.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                k(6, e);
                return false;
            } catch (IOException e2) {
                k(7, e2);
                return false;
            }
        } finally {
            this.k = null;
            this.j = null;
        }
    }
}
