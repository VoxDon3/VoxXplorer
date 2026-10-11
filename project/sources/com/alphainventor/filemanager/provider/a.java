package com.voxdon.xplorer.provider;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ProxyFileDescriptorCallback;
import android.os.storage.StorageManager;
import android.system.ErrnoException;
import android.system.OsConstants;
import ax.Z2.k;
import ax.b3.C1490e;
import ax.b3.C1495j;
import ax.b3.t;
import ax.c3.C1835x;
import ax.l3.AbstractC2465a;
import ax.l3.C2466b;
import ax.u3.C3180B;
import com.voxdon.xplorer.file.C3596o;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class a {
    private Context a;
    private C2466b c = new C2466b();
    private Handler b = new Handler(this.c.b());

    /* renamed from: com.voxdon.xplorer.provider.a$a, reason: collision with other inner class name */
    class ProxyFileDescriptorCallbackC0525a extends ProxyFileDescriptorCallback {
        private AbstractC2465a a;
        private boolean b;
        final /* synthetic */ C3596o c;
        final /* synthetic */ k d;
        final /* synthetic */ int e;

        ProxyFileDescriptorCallbackC0525a(C3596o c3596o, k kVar, int i) {
            this.c = c3596o;
            this.d = kVar;
            this.e = i;
        }

        private void a() throws ErrnoException {
            if (this.b) {
                return;
            }
            try {
                this.a = this.c.j0(this.d.e(), this.e);
                this.b = true;
            } catch (C1495j e) {
                throw a.a(e, null);
            }
        }

        @Override // android.os.ProxyFileDescriptorCallback
        public void onFsync() throws ErrnoException {
            a();
            this.a.a();
        }

        @Override // android.os.ProxyFileDescriptorCallback
        public long onGetSize() throws ErrnoException {
            a();
            return this.a.b();
        }

        @Override // android.os.ProxyFileDescriptorCallback
        public int onRead(long j, int i, byte[] bArr) throws ErrnoException {
            a();
            return this.a.c(j, bArr, 0, i);
        }

        @Override // android.os.ProxyFileDescriptorCallback
        public void onRelease() {
            AbstractC2465a abstractC2465a = this.a;
            if (abstractC2465a != null) {
                abstractC2465a.d();
            }
        }

        @Override // android.os.ProxyFileDescriptorCallback
        public int onWrite(long j, int i, byte[] bArr) throws ErrnoException {
            a();
            return (int) this.a.e(j, bArr, 0, i);
        }
    }

    a(Context context) {
        this.a = context;
    }

    public static ErrnoException a(C1495j c1495j, String str) {
        if (str == null) {
            str = c1495j.getMessage();
        }
        return c1495j instanceof t ? new ErrnoException(str, OsConstants.ENOENT) : c1495j instanceof C1490e ? new ErrnoException(str, OsConstants.EACCES) : new ErrnoException(str, OsConstants.EIO);
    }

    public ParcelFileDescriptor b(k kVar, int i) throws IOException {
        ParcelFileDescriptor openProxyFileDescriptor;
        C3596o e = C1835x.e(kVar.d());
        if (!e.a()) {
            if (!(!C3180B.H() ? e.i(10000L) : false)) {
                throw new FileNotFoundException("Network location is not connected");
            }
        }
        openProxyFileDescriptor = ((StorageManager) this.a.getSystemService("storage")).openProxyFileDescriptor(i, new ProxyFileDescriptorCallbackC0525a(e, kVar, i), this.b);
        return openProxyFileDescriptor;
    }
}
