/*
 * Decompiled with CFR 0.152.
 */
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

public class DefaultAvatarController
implements BoxAvatarView.b,
Serializable {
    protected transient ThreadPoolExecutor c0;
    protected HashSet<String> mCleanedDirectories;
    protected BoxSession mSession;
    protected HashSet<String> mUnavailableAvatars = new HashSet();
    protected transient e q;

    public DefaultAvatarController(BoxSession boxSession) {
        this.mCleanedDirectories = new HashSet();
        this.mSession = boxSession;
        this.q = new e(boxSession);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        if (this.e() == null) {
            this.q = new e(this.mSession);
        }
    }

    @Override
    public File a(String string) {
        File file = this.f(string);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("avatar_");
        stringBuilder.append(string);
        stringBuilder.append(".");
        stringBuilder.append("jpg");
        return new File(file, stringBuilder.toString());
    }

    @Override
    public h<BoxDownload> b(String string, BoxAvatarView object) {
        File file;
        block3: {
            object = new WeakReference<BoxAvatarView>((BoxAvatarView)((Object)object));
            try {
                file = this.a(string);
                if (!this.mUnavailableAvatars.contains(file.getAbsolutePath())) break block3;
                return null;
            }
            catch (IOException iOException) {
                b.c("unable to createFile ", iOException);
                return null;
            }
        }
        h<BoxDownload> h8 = this.e().e(this.f(string), string).D();
        h.b<BoxDownload> b8 = new h.b<BoxDownload>(){
            final WeakReference a;
            final String b;
            final File c;
            final DefaultAvatarController d;
            {
                this.d = defaultAvatarController;
                this.a = weakReference;
                this.b = string;
                this.c = file;
            }

            @Override
            public void a(BoxResponse<BoxDownload> object) {
                if (object.c()) {
                    object = (BoxAvatarView)((Object)this.a.get());
                    if (object != null) {
                        ((BoxAvatarView)((Object)object)).b();
                        return;
                    }
                } else {
                    if (object.a() instanceof BoxException && ((BoxException)object.a()).e() == 404) {
                        object = this.d;
                        ((DefaultAvatarController)object).mUnavailableAvatars.add(((DefaultAvatarController)object).a(this.b).getAbsolutePath());
                    }
                    if ((object = this.c) != null) {
                        ((File)object).delete();
                    }
                }
            }
        };
        h8.a(b8);
        this.d(h8);
        return h8;
    }

    protected void c(File fileArray, int n8) {
        if (fileArray != null && !this.mCleanedDirectories.contains(fileArray.getAbsolutePath())) {
            long l8 = System.currentTimeMillis();
            long l9 = n8;
            long l10 = TimeUnit.DAYS.toMillis(l9);
            if ((fileArray = fileArray.listFiles()) != null) {
                for (File file : fileArray) {
                    if (!file.getName().startsWith("avatar_") || file.lastModified() >= l8 - l9 * l10) continue;
                    file.delete();
                }
            }
        }
    }

    protected void d(h h8) {
        if (this.c0 == null) {
            this.c0 = SdkUtils.f(2, 2, 3600L, TimeUnit.SECONDS);
        }
        this.c0.execute(h8);
    }

    protected e e() {
        return this.q;
    }

    protected File f(String object) {
        object = new File(this.mSession.t(), "avatar");
        if (!((File)object).exists()) {
            ((File)object).mkdirs();
        }
        this.c((File)object, 30);
        return object;
    }
}

