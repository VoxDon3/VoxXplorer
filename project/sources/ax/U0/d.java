package ax.U0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import ax.S0.d0;
import j$.nio.channels.DesugarChannels;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class d extends b {
    private final ContentResolver e;
    private Uri f;
    private AssetFileDescriptor g;
    private FileInputStream h;
    private long i;
    private boolean j;

    public static class a extends h {
        public a(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public d(Context context) {
        super(false);
        this.e = context.getContentResolver();
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
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        }
        int read = ((FileInputStream) d0.i(this.h)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        q(read);
        return read;
    }

    @Override // ax.U0.g
    public void close() throws a {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(e, 2000);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        r();
                    }
                }
            } catch (IOException e2) {
                throw new a(e2, 2000);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        r();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(e3, 2000);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    r();
                }
            }
        }
    }

    @Override // ax.U0.g
    public long f(k kVar) throws a {
        AssetFileDescriptor openAssetFileDescriptor;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        try {
            Uri normalizeScheme = kVar.a.normalizeScheme();
            this.f = normalizeScheme;
            s(kVar);
            if (Objects.equals(normalizeScheme.getScheme(), "content")) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.e.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.e.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.h = fileInputStream;
            if (length != -1 && kVar.g > length) {
                throw new a(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(kVar.g + startOffset) - startOffset;
            if (skip != kVar.g) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                long size = convertMaybeLegacyFileChannelFromLibrary.size();
                if (size == 0) {
                    this.i = -1L;
                } else {
                    long position = size - convertMaybeLegacyFileChannelFromLibrary.position();
                    this.i = position;
                    if (position < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j = length - skip;
                this.i = j;
                if (j < 0) {
                    throw new a(null, 2008);
                }
            }
            long j2 = kVar.h;
            if (j2 != -1) {
                long j3 = this.i;
                if (j3 != -1) {
                    j2 = Math.min(j3, j2);
                }
                this.i = j2;
            }
            this.j = true;
            t(kVar);
            long j4 = kVar.h;
            return j4 != -1 ? j4 : this.i;
        } catch (a e) {
            throw e;
        } catch (IOException e2) {
            throw new a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }
}
