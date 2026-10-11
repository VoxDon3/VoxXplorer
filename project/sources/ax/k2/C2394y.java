package ax.k2;

import android.content.Context;
import android.util.Log;
import ax.m2.C2512b;
import ax.m2.C2513c;
import ax.q2.C2865a;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;

/* renamed from: ax.k2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2394y implements ax.o2.h, InterfaceC2376g, AutoCloseable {
    private final String c0;
    private final File d0;
    private final Callable<InputStream> e0;
    private final int f0;
    private final ax.o2.h g0;
    private C2375f h0;
    private boolean i0;
    private final Context q;

    public C2394y(Context context, String str, File file, Callable<InputStream> callable, int i, ax.o2.h hVar) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(hVar, "delegate");
        this.q = context;
        this.c0 = str;
        this.d0 = file;
        this.e0 = callable;
        this.f0 = i;
        this.g0 = hVar;
    }

    private final void b(File file, boolean z) throws IOException {
        ReadableByteChannel newChannel;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        if (this.c0 != null) {
            newChannel = Channels.newChannel(this.q.getAssets().open(this.c0));
            ax.Gb.l.e(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.d0 != null) {
            newChannel = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileInputStream(this.d0).getChannel());
            ax.Gb.l.e(newChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.e0;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                newChannel = Channels.newChannel(callable.call());
                ax.Gb.l.e(newChannel, "newChannel(inputStream)");
            } catch (Exception e) {
                throw new IOException("inputStreamCallable exception on call", e);
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.q.getCacheDir());
        createTempFile.deleteOnExit();
        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileOutputStream(createTempFile).getChannel());
        ax.Gb.l.e(convertMaybeLegacyFileChannelFromLibrary, "output");
        C2513c.a(newChannel, convertMaybeLegacyFileChannelFromLibrary);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        ax.Gb.l.e(createTempFile, "intermediateFile");
        c(createTempFile, z);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void c(File file, boolean z) {
        C2375f c2375f = this.h0;
        if (c2375f == null) {
            ax.Gb.l.t("databaseConfiguration");
            c2375f = null;
        }
        c2375f.getClass();
    }

    private final void e(boolean z) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.q.getDatabasePath(databaseName);
        C2375f c2375f = this.h0;
        C2375f c2375f2 = null;
        if (c2375f == null) {
            ax.Gb.l.t("databaseConfiguration");
            c2375f = null;
        }
        boolean z2 = c2375f.s;
        File filesDir = this.q.getFilesDir();
        ax.Gb.l.e(filesDir, "context.filesDir");
        C2865a c2865a = new C2865a(databaseName, filesDir, z2);
        try {
            C2865a.c(c2865a, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    ax.Gb.l.e(databasePath, "databaseFile");
                    b(databasePath, z);
                    c2865a.d();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            }
            try {
                ax.Gb.l.e(databasePath, "databaseFile");
                int c = C2512b.c(databasePath);
                if (c == this.f0) {
                    c2865a.d();
                    return;
                }
                C2375f c2375f3 = this.h0;
                if (c2375f3 == null) {
                    ax.Gb.l.t("databaseConfiguration");
                } else {
                    c2375f2 = c2375f3;
                }
                if (c2375f2.a(c, this.f0)) {
                    c2865a.d();
                    return;
                }
                if (this.q.deleteDatabase(databaseName)) {
                    try {
                        b(databasePath, z);
                    } catch (IOException e2) {
                        Log.w("ROOM", "Unable to copy database file.", e2);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c2865a.d();
                return;
            } catch (IOException e3) {
                Log.w("ROOM", "Unable to read database version.", e3);
                c2865a.d();
                return;
            }
        } catch (Throwable th) {
            c2865a.d();
            throw th;
        }
        c2865a.d();
        throw th;
    }

    @Override // ax.k2.InterfaceC2376g
    public ax.o2.h a() {
        return this.g0;
    }

    @Override // ax.o2.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        a().close();
        this.i0 = false;
    }

    public final void d(C2375f c2375f) {
        ax.Gb.l.f(c2375f, "databaseConfiguration");
        this.h0 = c2375f;
    }

    @Override // ax.o2.h
    public ax.o2.g g0() {
        if (!this.i0) {
            e(true);
            this.i0 = true;
        }
        return a().g0();
    }

    @Override // ax.o2.h
    public String getDatabaseName() {
        return a().getDatabaseName();
    }

    @Override // ax.o2.h
    public void setWriteAheadLoggingEnabled(boolean z) {
        a().setWriteAheadLoggingEnabled(z);
    }
}
