/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import android.content.Context;
import android.util.Log;
import ax.u3.w;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

class b {
    private final FileChannel a;
    private final FileLock b;

    private b(FileChannel fileChannel, FileLock fileLock) {
        this.a = fileChannel;
        this.b = fileLock;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static b a(Context var0, String var1_13) {
        block21: {
            var2_14 = new File(var0 /* !! */ .getFilesDir(), (String)var1_13);
            var0 /* !! */  = new RandomAccessFile((File)var2_14, "rw");
            var2_14 = w.a((RandomAccessFile)var0 /* !! */ );
            var1_13 = var2_14.lock();
            try {
                var0 /* !! */  = new b((FileChannel)var2_14, (FileLock)var1_13);
                return var0 /* !! */ ;
            }
            catch (OverlappingFileLockException var0_1) {
            }
            catch (Error var0_2) {
            }
            catch (IOException var0_3) {}
            break block21;
            catch (OverlappingFileLockException var0_4) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var1_13 = null;
                    break block21;
                    break;
                }
            }
            catch (Error var0_6) {
                ** GOTO lbl-1000
            }
            catch (IOException var0_7) {
                ** continue;
            }
            catch (OverlappingFileLockException var0_8) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var2_14 = null;
                    var1_13 = null;
                    break;
                }
            }
            catch (Error var0_9) {
                ** GOTO lbl-1000
            }
            catch (IOException var0_10) {
                ** continue;
            }
        }
        Log.e((String)"CrossProcessLock", (String)"encountered error while creating and acquiring the lock, ignoring", (Throwable)var0_5);
        if (var1_13 != null) {
            try {
                var1_13.release();
            }
            catch (IOException var0_11) {
                // empty catch block
            }
        }
        if (var2_14 != null) {
            var2_14.close();
        }
lbl45:
        // 4 sources

        return null;
        catch (IOException var0_12) {
            ** continue;
        }
    }

    void b() {
        try {
            this.b.release();
            this.a.close();
            return;
        }
        catch (IOException iOException) {
            Log.e((String)"CrossProcessLock", (String)"encountered error while releasing, ignoring", (Throwable)iOException);
            return;
        }
    }
}

