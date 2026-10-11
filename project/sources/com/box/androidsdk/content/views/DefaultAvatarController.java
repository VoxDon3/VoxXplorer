package com.box.androidsdk.content.views;

import ax.E3.e;
import ax.E3.h;
import ax.H3.b;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxResponse;
import com.box.androidsdk.content.utils.SdkUtils;
import com.box.androidsdk.content.views.BoxAvatarView;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DefaultAvatarController implements BoxAvatarView.b, Serializable {
    protected transient ThreadPoolExecutor c0;
    protected BoxSession mSession;
    protected transient e q;
    protected HashSet<String> mUnavailableAvatars = new HashSet<>();
    protected HashSet<String> mCleanedDirectories = new HashSet<>();

    class a implements h.b<BoxDownload> {
        final /* synthetic */ WeakReference a;
        final /* synthetic */ String b;
        final /* synthetic */ File c;

        a(WeakReference weakReference, String str, File file) {
            this.a = weakReference;
            this.b = str;
            this.c = file;
        }

        @Override // ax.E3.h.b
        public void a(BoxResponse<BoxDownload> boxResponse) {
            if (boxResponse.c()) {
                BoxAvatarView boxAvatarView = (BoxAvatarView) this.a.get();
                if (boxAvatarView != null) {
                    boxAvatarView.b();
                    return;
                }
                return;
            }
            if ((boxResponse.a() instanceof BoxException) && ((BoxException) boxResponse.a()).e() == 404) {
                DefaultAvatarController defaultAvatarController = DefaultAvatarController.this;
                defaultAvatarController.mUnavailableAvatars.add(defaultAvatarController.a(this.b).getAbsolutePath());
            }
            File file = this.c;
            if (file != null) {
                file.delete();
            }
        }
    }

    public DefaultAvatarController(BoxSession boxSession) {
        this.mSession = boxSession;
        this.q = new e(boxSession);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        if (e() == null) {
            this.q = new e(this.mSession);
        }
    }

    @Override // com.box.androidsdk.content.views.BoxAvatarView.b
    public File a(String str) {
        return new File(f(str), "avatar_" + str + ".jpg");
    }

    @Override // com.box.androidsdk.content.views.BoxAvatarView.b
    public h<BoxDownload> b(String str, BoxAvatarView boxAvatarView) {
        WeakReference weakReference = new WeakReference(boxAvatarView);
        try {
            File a2 = a(str);
            if (this.mUnavailableAvatars.contains(a2.getAbsolutePath())) {
                return null;
            }
            h D = e().e(f(str), str).D();
            D.a(new a(weakReference, str, a2));
            d(D);
            return D;
        } catch (IOException e) {
            b.c("unable to createFile ", e);
            return null;
        }
    }

    protected void c(File file, int i) {
        if (file == null || this.mCleanedDirectories.contains(file.getAbsolutePath())) {
            return;
        }
        long j = i;
        long currentTimeMillis = System.currentTimeMillis() - (j * TimeUnit.DAYS.toMillis(j));
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.getName().startsWith("avatar_") && file2.lastModified() < currentTimeMillis) {
                    file2.delete();
                }
            }
        }
    }

    protected void d(h hVar) {
        if (this.c0 == null) {
            this.c0 = SdkUtils.f(2, 2, 3600L, TimeUnit.SECONDS);
        }
        this.c0.execute(hVar);
    }

    protected e e() {
        return this.q;
    }

    protected File f(String str) {
        File file = new File(this.mSession.t(), "avatar");
        if (!file.exists()) {
            file.mkdirs();
        }
        c(file, 30);
        return file;
    }
}
