/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.Fragment;
import ax.L9.c;
import ax.L9.e;
import ax.L9.f;
import ax.M9.d;
import ax.N9.A;
import ax.N9.N;
import ax.N9.U;
import ax.N9.W;
import ax.N9.X;
import ax.N9.Y;
import ax.N9.b0;
import ax.N9.e0;
import ax.Z2.s;
import ax.b3.J;
import ax.b3.o;
import ax.b3.t;
import ax.c3.B;
import ax.c3.F;
import ax.c3.G;
import ax.c3.S;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.g;
import ax.c3.k0;
import ax.c3.x;
import ax.d3.a0;
import ax.g3.k;
import com.voxdon.xplorer.file.E;
import com.voxdon.xplorer.file.T;
import com.voxdon.xplorer.file.c;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.p;
import com.microsoft.graph.extensions.Drive;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.extensions.FileSystemInfo;
import com.microsoft.graph.extensions.Folder;
import com.microsoft.graph.extensions.IDriveItemCollectionPage;
import com.microsoft.graph.extensions.ItemReference;
import com.microsoft.graph.extensions.UploadSession;
import com.microsoft.graph.extensions.User;
import com.microsoft.graph.generated.BaseBaseItem;
import com.microsoft.graph.generated.BaseDriveItem;
import com.microsoft.graph.generated.BaseItemReference;
import com.microsoft.graph.generated.BaseQuota;
import com.microsoft.graph.generated.BaseUser;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

public class OneDriveFileHelper
extends m {
    private static final Logger l = Logger.getLogger("FileManager.OneDriveFileHelper");
    static j m;
    static int n;
    static int o;
    private final AtomicReference<e0> h = new AtomicReference();
    private final Map<String, String> i = new HashMap<String, String>();
    private final Map<String, String> j = new HashMap<String, String>();
    private Drive k;

    static {
        n = 0x100000;
        o = 0x500000;
    }

    public OneDriveFileHelper() {
        this.s0("/", "/drive/root");
    }

    private String A0(String string, boolean bl) throws ax.b3.j, d {
        String string2 = this.M0(string);
        string2 = string2 == null ? "/drive/root" : this.F0(string2);
        if (string2 == null) {
            if (this.P0(string) && bl) {
                return "/drive/root";
            }
            return this.a1(string);
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String B0(String string) {
        Map<String, String> map = this.i;
        synchronized (map) {
            return this.i.get(string);
        }
    }

    private ItemReference C0(String string) throws ax.b3.j {
        ItemReference itemReference = new ItemReference();
        CharSequence charSequence = this.A0(string, false);
        if ("/drive/root".equals(charSequence)) {
            itemReference.c = this.I0();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("/drives/");
            ((StringBuilder)charSequence).append(itemReference.c);
            ((StringBuilder)charSequence).append("/root:");
            charSequence = ((StringBuilder)charSequence).toString();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            charSequence = string;
            if ("/".equals(string)) {
                charSequence = "";
            }
            stringBuilder.append((String)charSequence);
            itemReference.g = stringBuilder.toString();
            return itemReference;
        }
        itemReference.c = this.w0((String)charSequence);
        string = this.O0(string);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(":");
        stringBuilder.append(string);
        itemReference.g = stringBuilder.toString();
        return itemReference;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private U D0(ax.c3.T object, boolean bl, boolean bl2) throws ax.b3.j {
        NullPointerException nullPointerException2;
        block5: {
            DriveItem driveItem = ((ax.c3.T)object).f0();
            if (driveItem == null) {
                if (!bl) {
                    try {
                        return this.E0(((n)object).E(), true);
                    }
                    catch (NullPointerException nullPointerException2) {
                        break block5;
                    }
                } else {
                    object = new t("item not exist");
                    throw object;
                }
            }
            if (driveItem.D == null) return this.z0().e(driveItem.m.c).n(driveItem.c);
            if (!bl2) return this.z0().e(driveItem.m.c).n(driveItem.c);
            return this.z0().e(driveItem.D.m.c).n(driveItem.D.h);
        }
        ax.Ha.c.h().f().b("Item request builder").l(nullPointerException2).h();
        throw new ax.b3.j("no onedrive item", nullPointerException2);
    }

    private U E0(String string, boolean bl) throws ax.b3.j {
        Object object;
        String string2 = this.A0(string, bl);
        if ("/drive/root".equals(string2)) {
            object = this.L0();
        } else {
            object = this.w0(string2);
            string2 = this.x0(string2);
            object = this.z0().e((String)object).n(string2);
            string = this.O0(string);
        }
        if (!string.isEmpty() && !"/".equals(string)) {
            string2 = string;
            if (d0.B(string)) {
                string2 = string.substring(1);
            }
            return object.h(Uri.encode((String)string2));
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String F0(String string) {
        Map<String, String> map = this.i;
        synchronized (map) {
            return this.j.get(string);
        }
    }

    public static j G0(Context context) {
        if (m == null) {
            m = new j(context.getApplicationContext());
        }
        return m;
    }

    private b0 K0() throws ax.b3.j {
        return this.z0().e(this.I0());
    }

    private U L0() throws ax.b3.j {
        return this.K0().g();
    }

    private String M0(String stringArray) {
        ax.u3.b.c(d0.B((String)stringArray));
        stringArray = stringArray.split("/");
        if (stringArray.length < 2) {
            return null;
        }
        return stringArray[1];
    }

    private String O0(String string) {
        ax.u3.b.c(d0.B(string));
        int n8 = string.indexOf("/", 1);
        if (n8 < 0) {
            return "";
        }
        return string.substring(n8);
    }

    private boolean P0(String string) {
        return string.split("/").length == 2;
    }

    private boolean Q0(DriveItem driveItem) throws ax.b3.j {
        Object object = driveItem.m;
        if (object == null) {
            if (!driveItem.l.equals("root") && driveItem.E == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("no parent not root? : ");
                ((StringBuilder)object).append(driveItem.l);
                ax.u3.b.e(((StringBuilder)object).toString());
            }
            return true;
        }
        object = ((BaseItemReference)object).g;
        if (object == null) {
            return this.I0().equals(driveItem.m.c);
        }
        if (((String)object).startsWith("/drive/root:")) {
            return true;
        }
        return driveItem.m.g.startsWith("/drives/") && driveItem.m.g.contains("/root:");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<n> R0(ax.c3.T t8) throws ax.b3.j {
        Object object;
        IDriveItemCollectionPage iDriveItemCollectionPage;
        boolean bl;
        Object object2;
        block7: {
            NullPointerException nullPointerException2;
            block8: {
                object2 = new ArrayList();
                bl = d0.E(t8);
                boolean bl2 = true;
                try {
                    iDriveItemCollectionPage = this.D0(t8, true, true).b().a().f("thumbnails").get();
                    if (iDriveItemCollectionPage == null) {
                        bl2 = false;
                    }
                    ax.u3.b.c(bl2);
                    break block7;
                }
                catch (OutOfMemoryError outOfMemoryError) {
                }
                catch (NullPointerException nullPointerException2) {
                    break block8;
                }
                catch (d d8) {
                    throw this.u0("listchildren", d8);
                }
                int n8 = object2.size();
                object2.clear();
                ax.Ha.b b8 = ax.Ha.c.h().f().b("!! OneDrive listChildren OOM").l(outOfMemoryError);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("children:");
                stringBuilder.append(n8);
                b8.g(stringBuilder.toString()).h();
                throw new ax.b3.j(outOfMemoryError);
            }
            object2 = ax.Ha.c.h().f().d("!! OneDrive listChildren NullPointError").l(nullPointerException2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("path:");
            stringBuilder.append(t8.E());
            ((ax.Ha.b)object2).g(stringBuilder.toString()).h();
            throw new ax.b3.j(nullPointerException2);
        }
        do {
            for (DriveItem driveItem : iDriveItemCollectionPage.b()) {
                String string = d0.Q(t8.E(), driveItem.l);
                object = new ax.c3.T(this, driveItem, string);
                object2.add(object);
                if (!bl) continue;
                this.t0(driveItem);
            }
            iDriveItemCollectionPage = iDriveItemCollectionPage.a() != null ? ((N)iDriveItemCollectionPage.a()).a().get() : null;
            object = iDriveItemCollectionPage;
            iDriveItemCollectionPage = object;
        } while (object != null);
        return object2;
    }

    private void S0() {
        Object object = this.p().getSharedPreferences("OneDrivePrefs", 0);
        Object object2 = ax.Q2.f.P0;
        Object object3 = new c0((ax.Q2.f)((Object)object2));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("version_");
        stringBuilder.append(this.t());
        int n8 = object.getInt(stringBuilder.toString(), 0);
        if (n8 == 0) {
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("refresh_token_");
            ((StringBuilder)object3).append(this.t());
            object = object.getString(((StringBuilder)object3).toString(), null);
        } else {
            object2 = ax.Y2.a.a().b((ax.Q2.f)((Object)object2));
            stringBuilder = new StringBuilder();
            stringBuilder.append("refresh_token_");
            stringBuilder.append(this.t());
            object = ((c0)object3).a(n8, (String)object2, object.getString(stringBuilder.toString(), null));
        }
        this.p().getSharedPreferences("com.microsoft.live", 0).edit().putString("refresh_token", (String)object).commit();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void T0(Context object, Activity activity, String string, c<e0> c8) {
        synchronized (OneDriveFileHelper.class) {
            Context context = object.getApplicationContext();
            e0 e02 = OneDriveFileHelper.v0(context);
            ax.K9.b b8 = (ax.K9.b)e02.c();
            object = new c<Void>(){
                final c a;
                final e0 b;
                final Context c;
                final Activity d;
                final String e;
                {
                    this.a = c8;
                    this.b = e02;
                    this.c = context;
                    this.d = activity;
                    this.e = string;
                }

                @Override
                public void b(d object) {
                    OneDriveFileHelper.X0(this.c);
                    object = OneDriveFileHelper.v0(this.c);
                    ax.K9.b b8 = (ax.K9.b)object.c();
                    Activity activity = this.d;
                    if (activity == null) {
                        this.a.b(null);
                        return;
                    }
                    b8.i(activity, this.e, new c<Void>(){
                        final e0 a;
                        final h b;
                        {
                            this.b = h8;
                            this.a = e02;
                        }

                        @Override
                        public void b(d d8) {
                            this.b.a.b(d8);
                        }

                        public void d(Void void_) {
                            this.b.a.c(this.a);
                        }
                    });
                }

                public void d(Void void_) {
                    this.a.c(this.b);
                }
            };
            b8.j((c<Void>)object);
            return;
        }
    }

    private String U0(String string, String string2) throws ax.b3.j {
        return this.z0().e((String)string).n((String)string2).a().get().m.g;
    }

    private void V0(e0 e02, a0 a02) {
        e02.d().a().c(new c<User>(){
            final a0 a;
            final OneDriveFileHelper b;
            {
                this.b = oneDriveFileHelper;
                this.a = a02;
            }

            @Override
            public void b(d d8) {
            }

            public void d(User object) {
                if (object == null) {
                    ax.Ha.c.h().f().d("OneDrive Null User").h();
                    return;
                }
                Context context = this.b.p();
                boolean bl = false;
                context = context.getSharedPreferences("OneDrivePrefs", 0);
                CharSequence charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("display_name_");
                ((StringBuilder)charSequence).append(this.b.t());
                String string = context.getString(((StringBuilder)charSequence).toString(), null);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("email_");
                ((StringBuilder)charSequence).append(this.b.t());
                charSequence = context.getString(((StringBuilder)charSequence).toString(), null);
                CharSequence charSequence2 = ((BaseUser)object).q;
                boolean bl2 = true;
                boolean bl3 = bl;
                if (charSequence2 != null) {
                    bl3 = bl;
                    if (!((String)charSequence2).equals(string)) {
                        string = context.edit();
                        charSequence2 = new StringBuilder();
                        ((StringBuilder)charSequence2).append("display_name_");
                        ((StringBuilder)charSequence2).append(this.b.t());
                        string.putString(((StringBuilder)charSequence2).toString(), ((BaseUser)object).q).commit();
                        bl3 = true;
                    }
                }
                if ((string = ((BaseUser)object).M) != null && !string.equals(charSequence)) {
                    context = context.edit();
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("email_");
                    ((StringBuilder)charSequence).append(this.b.t());
                    context.putString(((StringBuilder)charSequence).toString(), ((BaseUser)object).M).commit();
                    bl3 = bl2;
                }
                if (bl3 && (object = this.a) != null) {
                    ((a0)object).ta();
                }
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void W0(String string) {
        if (string == null) {
            return;
        }
        Map<String, String> map = this.i;
        synchronized (map) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        string = this.j.remove(string);
                        if (string == null) break block4;
                        this.i.remove(string);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void X0(Context context) {
        SharedPreferences.Editor editor = context.getSharedPreferences("com.microsoft.live", 0).edit();
        editor.remove("refresh_token");
        editor.remove("cookies");
        editor.commit();
        try {
            context = CookieSyncManager.createInstance((Context)context.getApplicationContext());
            CookieManager.getInstance().removeAllCookies(null);
            context.sync();
            return;
        }
        catch (AndroidRuntimeException | UnsupportedOperationException throwable) {
            return;
        }
    }

    private void Y0(e0 object) {
        object = ((ax.K9.b)object.c()).f();
        int n8 = this.t();
        ax.Q2.f f8 = ax.Q2.f.P0;
        c0 c02 = new c0(f8);
        SharedPreferences.Editor editor = this.p().getSharedPreferences("OneDrivePrefs", 0).edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("version_");
        stringBuilder.append(n8);
        editor = editor.putInt(stringBuilder.toString(), 3);
        stringBuilder = new StringBuilder();
        stringBuilder.append("refresh_token_");
        stringBuilder.append(n8);
        editor.putString(stringBuilder.toString(), c02.e(ax.Y2.a.a().b(f8), (String)object)).commit();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void Z0(ax.c3.T t8, long l8) throws ax.b3.j {
        int n8 = 0;
        while (true) {
            try {
                DriveItem driveItem = new DriveItem();
                FileSystemInfo fileSystemInfo = new FileSystemInfo();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(l8);
                fileSystemInfo.e = calendar;
                driveItem.w = fileSystemInfo;
                this.D0(t8, false, true).a().j(driveItem);
                return;
            }
            catch (d d8) {
                if (d8.getMessage() == null || !d8.getMessage().contains("409 :") || ++n8 >= 3) throw this.u0("setLastModified", d8);
                long l9 = n8;
                try {
                    Thread.sleep(l9 * 500L);
                }
                catch (Exception exception) {
                }
                continue;
            }
            break;
        }
    }

    private String a1(String string) throws ax.b3.j, d {
        if ((string = this.M0(string)) == null) {
            ax.u3.b.f();
            return "/drive/root";
        }
        return this.t0(this.L0().h(Uri.encode((String)string)).a().get());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b1(U object, G e8, long l8, Long serializable, boolean bl, ax.u3.c c8, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        IOException iOException2;
        block7: {
            AtomicReference atomicReference = new AtomicReference();
            MyDriveItemUploadableProperties myDriveItemUploadableProperties = new MyDriveItemUploadableProperties();
            myDriveItemUploadableProperties.h = bl ? "replace" : "fail";
            if (serializable != null) {
                FileSystemInfo fileSystemInfo = new FileSystemInfo();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis((long)serializable);
                fileSystemInfo.e = calendar;
                myDriveItemUploadableProperties.d = fileSystemInfo;
            }
            try {
                object = object.m(myDriveItemUploadableProperties).a().e();
            }
            catch (d d8) {
                throw this.u0("uploadChunk", d8);
            }
            object = new E<DriveItem>((UploadSession)object, this.z0(), (G)((Object)e8), l8, DriveItem.class);
            serializable = new ArrayList();
            try {
                e8 = new e<DriveItem>(){
                    final ax.g3.i a;
                    final AtomicReference b;
                    final OneDriveFileHelper c;
                    {
                        this.c = oneDriveFileHelper;
                        this.a = i8;
                        this.b = atomicReference;
                    }

                    @Override
                    public void a(long l8, long l9) {
                        ax.g3.i i8 = this.a;
                        if (i8 != null) {
                            i8.a(l8, l9);
                        }
                    }

                    @Override
                    public void b(d d8) {
                        this.b.set(d8);
                    }

                    public void d(DriveItem driveItem) {
                    }
                };
                ((E)object).a((List<ax.S9.c>)((Object)serializable), c8, (e<DriveItem>)e8, o);
                if (c8 != null && c8.isCancelled()) {
                    object = new ax.b3.a();
                    throw object;
                }
            }
            catch (IOException iOException2) {
                break block7;
            }
            if (atomicReference.get() == null) {
                return;
            }
            throw this.u0("onedrive uploadFile 2", (d)atomicReference.get());
        }
        iOException2.printStackTrace();
        throw ax.b3.d.b("onedrive chunked upload", iOException2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c1(Y var1_1, G var2_8, long var3_12, boolean var5_13, ax.u3.c var6_14, ax.g3.i var7_15) throws ax.b3.j, ax.b3.a {
        var12_16 = new f();
        var15_17 = new AtomicReference<V>();
        var8_18 = 0;
        var13_19 = new AtomicBoolean(false);
        var11_20 = var5_13 != false ? Collections.singletonList(new ax.S9.d("@microsoft.graph.conflictBehavior", "replace")) : Collections.singletonList(new ax.S9.d("@microsoft.graph.conflictBehavior", "fail"));
        var14_23 = var11_20;
        while (true) {
            block32: {
                block29: {
                    block30: {
                        block27: {
                            block31: {
                                block28: {
                                    var11_20 = var2_8.b();
                                    var17_27 = new e<DriveItem>(){
                                        final ax.g3.i a;
                                        final f b;
                                        final AtomicBoolean c;
                                        final AtomicReference d;
                                        final OneDriveFileHelper e;
                                        {
                                            this.e = oneDriveFileHelper;
                                            this.a = i8;
                                            this.b = f8;
                                            this.c = atomicBoolean;
                                            this.d = atomicReference;
                                        }

                                        @Override
                                        public void a(long l8, long l9) {
                                            ax.g3.i i8 = this.a;
                                            if (i8 != null) {
                                                i8.a(l8, l9);
                                            }
                                        }

                                        @Override
                                        public void b(d d8) {
                                            this.c.set(false);
                                            this.d.set(d8);
                                            this.b.a();
                                        }

                                        public void d(DriveItem driveItem) {
                                            this.b.a();
                                            this.c.set(true);
                                        }
                                    };
                                    try {
                                        var18_28 = var1_1.d();
                                        var19_29 = var1_1.i();
                                    }
                                    catch (Throwable var1_2) {}
                                    var16_26 = new ax.P9.b(this, (String)var18_28, (ax.M9.f)var19_29, var14_23, DriveItem.class){
                                        final OneDriveFileHelper i;
                                        {
                                            this.i = oneDriveFileHelper;
                                            super(string, f8, list, clazz);
                                        }
                                    };
                                    var16_26.t(ax.P9.k.f0);
                                    var19_29 = var16_26.m().b();
                                    var20_30 = var16_26.q();
                                    var18_28 = new i((InputStream)var11_20, var3_12, var6_14);
                                    var19_29.b(var16_26, var17_27, var20_30, var18_28);
                                    var12_16.b();
                                    if (var6_14 != null && var6_14.isCancelled()) {
                                        var1_1 = new ax.b3.a();
                                        throw var1_1;
                                    }
                                    if (var13_19.get()) break block27;
                                    if (var8_18 >= 3 || !var2_8.a() || (var5_13 = var15_17.get() instanceof ax.P9.j)) break block28;
                                    var9_25 = ++var8_18 * 2000 * var8_18;
                                    ** try [egrp 7[TRYBLOCK] [10 : 293->298)] { 
lbl33:
                                    // 1 sources

                                    ** GOTO lbl-1000
                                    {
                                        Thread.sleep(var9_25);
                                        break block29;
                                    }
                                }
                                var1_1 = var15_17.get();
                                if (var1_1 == null) break block31;
                                var1_1 = (d)var15_17.get();
                                try {
                                    throw this.u0("onedrive uploadFile", (d)var1_1);
                                }
                                catch (Throwable var1_3) {}
lbl-1000:
                                // 2 sources

                                {
                                    var2_8 = var1_1;
                                    var1_1 = var11_20;
                                    break block30;
                                }
                            }
                            var1_1 = new ax.b3.j("onedrive uploadFile");
                            throw var1_1;
                        }
                        var5_13 = var13_19.get();
                        if (var5_13) {
                            if (var11_20 == null) return;
                            try {
                                var11_20.close();
                                return;
                            }
                            catch (IllegalStateException var1_4) {
                                ax.Ha.c.h().f().b("Onedrive close").l(var1_4).h();
                            }
                            return;
                        }
                        break block32;
                        catch (Throwable var2_9) {
                            var1_1 = var11_20;
                            break block30;
                        }
                        catch (Throwable var2_11) {
                            var1_1 = null;
                        }
                    }
                    if (var1_1 == null) throw var2_8;
                    try {
                        var1_1.close();
                        throw var2_8;
                    }
                    catch (IllegalStateException var1_5) {
                        ax.Ha.c.h().f().b("Onedrive close").l(var1_5).h();
                    }
                    throw var2_8;
lbl74:
                    // 1 sources

                    catch (InterruptedException var14_24) {}
                }
                var14_23 = new List<Object>("@microsoft.graph.conflictBehavior", (Object)"replace");
                var14_23 = Collections.singletonList(var14_23);
            }
            if (var11_20 == null) continue;
            try {
                var11_20.close();
            }
            catch (IllegalStateException var11_21) {
                ax.Ha.c.h().f().b("Onedrive close").l(var11_21).h();
            }
            catch (IOException var1_6) {
                return;
            }
            catch (IOException var11_22) {}
        }
        catch (IOException var1_7) {
            throw var2_8;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d1(String var1_1, long var2_9, ax.g3.i var4_10) {
        block18: {
            block20: {
                while (true) {
                    block19: {
                        block17: {
                            var6_12 = new URL(var1_1);
                            var6_12 = (HttpURLConnection)var6_12.openConnection();
                            try {
                                var7_13 = ax.r8.n.d(F.i(var6_12.getInputStream(), 256)).h().w("percentageComplete");
                                if (var7_13 != null) break block17;
                            }
                            catch (Throwable var1_6) {}
                            var6_12.disconnect();
                            break block18;
                        }
                        var5_11 = var7_13.s();
                        if (var4_10 != null) {
                            var4_10.a((long)var5_11 * var2_9 / 100L, var2_9);
                        }
                        if (var5_11 < 100) break block19;
                        var6_12.disconnect();
                        return;
                    }
                    if (var5_11 >= 50) ** GOTO lbl29
                    Thread.sleep(250L);
                    ** GOTO lbl29
                    {
                        var6_12.disconnect();
                        throw var1_6;
                        catch (Exception var7_14) {}
lbl29:
                        // 3 sources

                        ** try [egrp 6[TRYBLOCK] [20, 19, 18, 17 : 139->154)] { 
lbl30:
                        // 1 sources

                        var6_12.disconnect();
                        continue;
                    }
                    break;
                }
lbl32:
                // 4 sources

                catch (NullPointerException var1_2) {
                    break block20;
                }
lbl34:
                // 4 sources

                catch (IllegalStateException var1_3) {
                    break block20;
                }
lbl36:
                // 4 sources

                catch (NumberFormatException var1_4) {
                    break block20;
                }
lbl38:
                // 4 sources

                catch (IOException var1_5) {}
            }
            var1_7.printStackTrace();
        }
        try {
            Thread.sleep(1250L);
        }
        catch (InterruptedException var1_8) {
            // empty catch block
        }
        if (var4_10 == null) return;
        var4_10.a(var2_9, var2_9);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e1(n var1_1, G var2_10, String var3_11, long var4_12, Long var6_13, boolean var7_14, boolean var8_15, ax.u3.c var9_16, ax.g3.i var10_17) throws ax.b3.j, ax.b3.a {
        block20: {
            block22: {
                block21: {
                    block19: {
                        try {
                            if (this.k0(var1_1.T(), false).n()) {
                                var13_18 = (ax.c3.T)var1_1;
                                var12_19 = this.D0(var13_18, false, true);
                                if (var4_12 != -1L) {
                                    if (var4_12 < (long)OneDriveFileHelper.n) {
                                        this.c1(var12_19.k(), (G)var2_10, var4_12, var8_15, var9_16, var10_17);
                                        if (var6_13 == null) return;
                                        this.Z0(var13_18, var6_13);
                                        return;
                                    }
                                    this.b1(var12_19, (G)var2_10, var4_12, var6_13, var8_15, var9_16, var10_17);
                                    return;
                                }
                            } else {
                                var1_1 = new ax.b3.j("parentPath doesn't exist");
                                throw var1_1;
                            }
                            var3_11 = null;
                            try {}
                            catch (Throwable var1_9) {
                                var2_10 = null;
                                break block20;
                            }
                            break block19;
lbl-1000:
                            // 1 sources

                            {
                                while (true) {
                                    var3_11 = var11_20;
                                    break block20;
                                    break;
                                }
                            }
                        }
                        catch (Throwable var1_3) {
                            throw var1_3;
                        }
                        catch (d var1_4) {
                            throw this.u0("writeFileInternal", var1_4);
                        }
                        catch (IOException var1_5) {
                            throw ax.b3.d.b("onedrive upload", var1_5);
                        }
                    }
                    var11_20 = var2_10.b();
                    {
                        var14_21 = ax.Z2.a.l(this.p(), (n)var1_1);
                        var2_10 = new StringBuilder();
                        var2_10.append(var1_1.B());
                        var2_10.append(System.currentTimeMillis());
                        var2_10.append(".tmp");
                        var1_1 = var2_10.toString();
                        var2_10 = new File(var14_21, (String)var1_1);
                    }
                    try {
                        F.f((InputStream)var11_20, (File)var2_10, -1L, var9_16);
                    }
                    catch (Throwable var1_6) {}
                    try {
                        var11_20 = x.f((File)var2_10);
                        var1_1 = var11_20.z(var2_10.getAbsolutePath());
                        var4_12 = var1_1.p();
                        var1_1 = var11_20.x((n)var1_1);
                        if (var4_12 != 0L) break block21;
                        this.c1(var12_19.k(), (G)var1_1, var4_12, var8_15, var9_16, var10_17);
                        if (var6_13 != null) {
                            this.Z0(var13_18, var6_13);
                        }
                        break block22;
                    }
                    catch (Throwable var1_2) {
                        break block20;
                    }
                }
                this.b1(var12_19, (G)var1_1, var4_12, var6_13, var8_15, var9_16, var10_17);
            }
            F.a(null);
            if (var2_10.exists() == false) return;
            var2_10.delete();
            return;
            ** while (true)
        }
        F.a((AutoCloseable)var3_11);
        if (var2_10 == null) throw var1_7;
        if (var2_10.exists() == false) throw var1_7;
        var2_10.delete();
        throw var1_7;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ax.c3.T k0(String string, boolean bl) throws ax.b3.j {
        try {
            ax.N9.T t8 = this.E0(string, false).a();
            Object object = t8;
            if (!bl) return new ax.c3.T(this, object.get(), string);
            object = t8.f("thumbnails");
            return new ax.c3.T(this, object.get(), string);
        }
        catch (d d8) {}
        if (d8.a(ax.M9.e.k0)) return new ax.c3.T(this, string);
        if (d8.getMessage() != null && d8.getMessage().contains("404 :")) {
            return new ax.c3.T(this, string);
        }
        if (d8.getMessage() != null && d8.getMessage().contains("400 :") && string.endsWith(".")) {
            throw new o("onedrive getfileinfo", d8);
        }
        d8.printStackTrace();
        throw this.u0("onedrive getfileinfo", d8);
    }

    static /* synthetic */ Drive n0(OneDriveFileHelper oneDriveFileHelper, Drive drive) {
        oneDriveFileHelper.k = drive;
        return drive;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void s0(String string, String string2) {
        Map<String, String> map = this.i;
        synchronized (map) {
            this.j.put(string, string2);
            this.i.put(string2, string);
            return;
        }
    }

    private String t0(DriveItem driveItem) {
        CharSequence charSequence;
        if (driveItem.D != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("/drives/");
            ((StringBuilder)charSequence).append(driveItem.D.m.c);
            ((StringBuilder)charSequence).append("/items/");
            ((StringBuilder)charSequence).append(driveItem.D.h);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "/drive/root";
        }
        this.s0(driveItem.l, (String)charSequence);
        return charSequence;
    }

    private ax.b3.j u0(String string, d d8) {
        if (d8.a(ax.M9.e.k0)) {
            return new t(d8);
        }
        if (d8.a(ax.M9.e.q)) {
            return new ax.b3.e(string, d8);
        }
        if (d8.a(ax.M9.e.p0)) {
            return new ax.b3.s(string, d8);
        }
        if (d8.a(ax.M9.e.m0)) {
            return new ax.b3.f(false, (Throwable)d8);
        }
        if (d8.getMessage() != null && d8.getMessage().contains("404 :")) {
            return new t(d8);
        }
        if (d8.getMessage() != null && d8.getMessage().contains("507 :")) {
            return new ax.b3.s(string, d8);
        }
        if (d8.getMessage() != null && d8.getMessage().contains("409 :")) {
            return new ax.b3.f(false, (Throwable)d8);
        }
        if (d8.getMessage() != null && d8.getMessage().contains("403 : Forbidden")) {
            return new ax.b3.e(string, d8);
        }
        return ax.b3.d.b(string, d8);
    }

    private static e0 v0(Context object) {
        object = S.f(object, new ax.K9.b((Context)object, g.c(object).a(ax.Q2.f.P0)){
            final String c;
            {
                this.c = string;
                super(context);
            }

            @Override
            public String e() {
                return this.c;
            }

            @Override
            public String[] g() {
                return new String[]{"offline_access", "Files.ReadWrite.All", "User.Read"};
            }
        });
        return new A.a().d((ax.M9.g)object).b();
    }

    private String y0() {
        SharedPreferences sharedPreferences = this.p().getSharedPreferences("OneDrivePrefs", 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("email_");
        stringBuilder.append(this.t());
        return sharedPreferences.getString(stringBuilder.toString(), null);
    }

    private e0 z0() throws ax.b3.h {
        e0 e02 = this.h.get();
        if (e02 != null) {
            return e02;
        }
        throw new ax.b3.h("OneDrive client is null");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream A(String object, String object2, String string) {
        RuntimeException var1_4;
        block7: {
            block6: {
                block5: {
                    if (string != null) {
                        try {
                            if (!string.startsWith("url=")) break block5;
                            object = Uri.decode((String)string.substring(4));
                            break block6;
                        }
                        catch (IOException iOException) {
                            break block7;
                        }
                        catch (ax.b3.j j8) {
                            break block7;
                        }
                    }
                }
                if (((ax.c3.T)(object = (ax.c3.T)this.z((String)object2))).g0() == null) {
                    return null;
                }
                object = ((ax.c3.T)object).g0();
            }
            object2 = new URL((String)object);
            return ((URL)object2).openStream();
        }
        var1_4.printStackTrace();
        return null;
    }

    @Override
    public boolean B(n n8) {
        return true;
    }

    @Override
    public List<n> C(n n8, m.f f8) throws ax.b3.j {
        if (n8.n()) {
            ax.u3.b.c(n8.isDirectory());
            n8 = (ax.c3.T)n8;
            boolean bl = ((ax.c3.T)n8).f0() != null;
            ax.u3.b.c(bl);
            return this.R0((ax.c3.T)n8);
        }
        throw new t();
    }

    @Override
    public void D(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        ax.u3.b.a(n8.n());
        this.e1(n8, g8, string, l8, l9, bl, false, c8, i8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void E(n object, n n8, ax.u3.c object2, ax.g3.i i8) throws ax.b3.j {
        block5: {
            block4: {
                ax.u3.b.a(n8.n());
                if (!object.n()) throw new t();
                if (object2 != null) {
                    if (object2.isCancelled()) throw new ax.b3.j("Operation cancelled");
                }
                try {
                    object2 = new DriveItem();
                    if (!((n)object).T().equals(n8.T())) break block4;
                    ((BaseBaseItem)object2).l = n8.B();
                    break block5;
                }
                catch (d d8) {
                    throw this.u0("move", d8);
                }
            }
            String string = n8.T();
            if (!this.k0(string, false).n()) {
                object = new ax.b3.j("Target parent does not exist");
                throw object;
            }
            ((BaseBaseItem)object2).l = n8.B();
            ((BaseBaseItem)object2).m = this.C0(string);
        }
        this.D0((ax.c3.T)object, true, false).a().j((DriveItem)object2);
        if (i8 == null) return;
        long l8 = object.p();
        i8.a(l8, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void F(n object, n n8, ax.u3.c object2, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        long l8;
        block6: {
            ax.u3.b.a(n8.n());
            if (!object.n()) throw new t("not existing source file");
            if (object2 != null) {
                if (object2.isCancelled()) throw new ax.b3.a();
            }
            l8 = object.p();
            object2 = this.C0(n8.T());
            try {
                object = this.D0((ax.c3.T)object, true, true).j(n8.B(), (ItemReference)object2).a().e();
                if (object == null || ((BaseBaseItem)object).l != null) break block6;
                object = ((BaseBaseItem)object).n;
                if (object != null) {
                    this.d1((String)object, l8, i8);
                    return;
                }
            }
            catch (d d8) {
                throw this.u0("copy", d8);
            }
            ax.u3.b.f();
            return;
        }
        try {
            Thread.sleep(1250L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        if (i8 == null) return;
        i8.a(l8, l8);
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    @Override
    public String H(n n8) {
        ax.c3.T t8 = (ax.c3.T)n8;
        if (t8.g0() == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("url=");
        stringBuilder.append(Uri.encode((String)t8.g0()));
        return B.a0(n8, stringBuilder.toString());
    }

    Drive H0() throws ax.b3.h {
        Drive drive = this.k;
        if (drive != null) {
            return drive;
        }
        ax.u3.b.f();
        throw new ax.b3.h("MyDrive is null");
    }

    @Override
    public void I(n n8) throws ax.b3.j {
        try {
            this.D0((ax.c3.T)n8, true, false).a().delete();
            return;
        }
        catch (d d8) {
            throw this.u0("deleteRecursively", d8);
        }
    }

    String I0() throws ax.b3.h {
        return this.H0().c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream J(n object, long l8) throws ax.b3.j {
        try {
            X x8 = this.D0((ax.c3.T)object, true, true).k().a();
            if (l8 == 0L) return x8.get();
            object = new StringBuilder();
            ((StringBuilder)object).append("bytes=");
            ((StringBuilder)object).append(l8);
            ((StringBuilder)object).append("-");
            x8.k("Range", ((StringBuilder)object).toString());
            return x8.get();
        }
        catch (d d8) {
            throw this.u0("getInputStream", d8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    String J0(String object) throws J {
        try {
            CharSequence charSequence = this.B0((String)object);
            String string = charSequence;
            if (charSequence == null) {
                this.b0(this.z("/"));
                string = this.B0((String)object);
                if (string == null) {
                    object = ax.Ha.c.h().f().d("ONEDRIVE LOCAL PATH NULL");
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("remoteDrivePath : ");
                    ((StringBuilder)charSequence).append(string);
                    ((ax.Ha.b)object).g(((StringBuilder)charSequence).toString()).h();
                    object = new J();
                    throw object;
                }
            }
            if ("/".equals(string)) {
                return "/";
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("/");
            ((StringBuilder)object).append(string);
            return ((StringBuilder)object).toString();
        }
        catch (ax.b3.j j8) {
            throw new J();
        }
    }

    @Override
    public void K(Activity activity, Fragment fragment, c.a a8) {
        if (a8 != null) {
            a8.B();
        }
        this.S0();
        String string = this.y0();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        OneDriveFileHelper.T0(this.p(), activity, string, new c<e0>(){
            final Fragment a;
            final c.a b;
            final AtomicBoolean c;
            final AtomicInteger d;
            final OneDriveFileHelper e;
            {
                this.e = oneDriveFileHelper;
                this.a = fragment;
                this.b = a8;
                this.c = atomicBoolean;
                this.d = atomicInteger;
            }

            @Override
            public void b(d d8) {
                if (this.b != null) {
                    ax.u3.B.a0(new Runnable(this){
                        final b q;
                        {
                            this.q = b8;
                        }

                        @Override
                        public void run() {
                            if (!this.q.c.get()) {
                                this.q.c.set(true);
                                this.q.d.set(2);
                                this.q.b.T(false, null);
                                return;
                            }
                            int n8 = this.q.d.get();
                            ax.Ha.b b8 = ax.Ha.c.h().f().d("OneDrive onConnectResult Twice 3");
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("called:");
                            stringBuilder.append(n8);
                            b8.g(stringBuilder.toString()).h();
                        }
                    });
                }
            }

            public void d(e0 e02) {
                this.e.h.set(e02);
                this.e.Y0(e02);
                e02.d().l().a().c(new c<Drive>(){
                    final e0 a;
                    final b b;
                    {
                        this.b = b8;
                        this.a = e02;
                    }

                    @Override
                    public void b(d d8) {
                        ax.u3.B.a0(new Runnable(){
                            final a c0;
                            final d q;
                            {
                                this.c0 = a8;
                                this.q = d8;
                            }

                            @Override
                            public void run() {
                                if (!this.c0.b.c.get()) {
                                    this.c0.b.c.set(true);
                                    this.c0.b.d.set(2);
                                    this.c0.b.b.T(false, null);
                                    ax.Ha.c.h().f().b("OneDrive get Drive failed").l(this.q).h();
                                    return;
                                }
                                int n8 = this.c0.b.d.get();
                                ax.Ha.b b8 = ax.Ha.c.h().f().d("OneDrive onConnectResult Twice 2");
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("called:");
                                stringBuilder.append(n8);
                                b8.g(stringBuilder.toString()).h();
                            }
                        });
                    }

                    public void d(Drive object) {
                        OneDriveFileHelper.n0(this.b.e, (Drive)object);
                        object = this.b;
                        object.e.V0(this.a, (a0)object.a);
                        if (this.b.b != null) {
                            ax.u3.B.a0(new Runnable(this){
                                final a q;
                                {
                                    this.q = a8;
                                }

                                @Override
                                public void run() {
                                    if (!this.q.b.c.get()) {
                                        this.q.b.c.set(true);
                                        this.q.b.d.set(1);
                                        this.q.b.b.T(true, null);
                                        return;
                                    }
                                    int n8 = this.q.b.d.get();
                                    ax.Ha.b b8 = ax.Ha.c.h().f().d("OneDrive onConnectResult Twice 1");
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("called:");
                                    stringBuilder.append(n8);
                                    b8.g(stringBuilder.toString()).h();
                                }
                            });
                        }
                    }
                });
            }
        });
    }

    @Override
    public boolean L() {
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M(n object) {
        RuntimeException var1_4;
        String string;
        block4: {
            string = ((n)object).T();
            if (this.k0(string, false).n()) break block4;
            return false;
        }
        try {
            Object object2 = ((n)object).B();
            object = new MyDriveItem();
            ((BaseBaseItem)object).l = object2;
            ((BaseDriveItem)object).x = object2 = new Folder();
            ((MyDriveItem)object).U = "fail";
            this.E0(string, false).b().a().b((DriveItem)object);
            return true;
        }
        catch (ax.b3.j j8) {
        }
        catch (d d8) {
            // empty catch block
        }
        var1_4.printStackTrace();
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean N(n object) {
        RuntimeException var1_4;
        try {
            String string = ((n)object).T();
            object = ((n)object).B();
            ax.S9.d d8 = new ax.S9.d("@microsoft.graph.conflictBehavior", "fail");
            this.E0(string, false).b().e(Uri.encode((String)object)).k().c(Collections.singletonList(d8)).i(null);
            return true;
        }
        catch (ax.b3.j j8) {
        }
        catch (d d9) {
            // empty catch block
        }
        var1_4.printStackTrace();
        return false;
    }

    String N0(HashMap<String, String> object, DriveItem driveItem) throws ax.b3.j, J {
        Object object2 = driveItem.m;
        if ((object2 == null || ((BaseItemReference)object2).e == null) && driveItem.l.equals("root")) {
            return "/";
        }
        if (driveItem.m != null) {
            if (this.Q0(driveItem)) {
                ItemReference itemReference = driveItem.m;
                String string = itemReference.g;
                object2 = string;
                if (string == null) {
                    if (object != null) {
                        string = (String)((HashMap)object).get(itemReference.e);
                        object2 = string;
                        if (string == null) {
                            object2 = this.U0(driveItem.m.c, driveItem.c);
                            ((HashMap)object).put(driveItem.m.e, object2);
                        }
                    } else {
                        object2 = this.U0(itemReference.c, driveItem.c);
                    }
                }
                if (object2 == null) {
                    ax.u3.b.e("this case is not implemented yet");
                    object = new StringBuilder();
                    ((StringBuilder)object).append("/");
                    ((StringBuilder)object).append(driveItem.l);
                    return ((StringBuilder)object).toString();
                }
                object = Uri.decode((String)((String)object2).substring(((String)object2).indexOf("/root:") + 6));
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append("/");
                ((StringBuilder)object2).append(driveItem.l);
                return ((StringBuilder)object2).toString();
            }
            object = driveItem.m.g;
            if (object != null && ((String)object).startsWith("/drives")) {
                int n8 = driveItem.m.g.indexOf(":");
                object2 = this.J0(driveItem.m.g.substring(0, n8));
                object = driveItem.m.g.substring(n8 + 1);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object2);
                stringBuilder.append((String)object);
                stringBuilder.append("/");
                stringBuilder.append(driveItem.l);
                return stringBuilder.toString();
            }
            object = driveItem.m;
            if (((BaseItemReference)object).g == null && ((BaseItemReference)object).e == null && !this.I0().equals(driveItem.m.c)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("/drives/");
                ((StringBuilder)object).append(driveItem.m.c);
                ((StringBuilder)object).append("/items/");
                ((StringBuilder)object).append(driveItem.c);
                return this.J0(((StringBuilder)object).toString());
            }
            ax.u3.b.e("this case is not implemented yet");
            object = new StringBuilder();
            ((StringBuilder)object).append("/");
            ((StringBuilder)object).append(driveItem.l);
            return ((StringBuilder)object).toString();
        }
        ax.u3.b.e("this case is not implemented yet");
        object = new StringBuilder();
        ((StringBuilder)object).append("/");
        ((StringBuilder)object).append(driveItem.l);
        return ((StringBuilder)object).toString();
    }

    @Override
    public boolean O() {
        return true;
    }

    @Override
    public void P(n n8) throws ax.b3.j {
        this.I(n8);
        if (this.P0(n8.E())) {
            this.W0(this.M0(n8.E()));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean Q(n n8, n n9) {
        ax.Q2.f f8;
        ax.Q2.f f9 = n8.P();
        if (f9 != (f8 = ax.Q2.f.P0)) return false;
        if (n9.P() != f8) {
            return false;
        }
        try {
            return this.A0(n8.E(), false).equals(this.A0(n9.E(), true));
        }
        catch (d | ax.b3.j exception) {
            return false;
        }
    }

    @Override
    public boolean Y() {
        return true;
    }

    @Override
    public boolean a() {
        return this.h.get() != null && this.k != null;
    }

    @Override
    public void b() {
        if (this.h.get() != null) {
            ax.K9.b b8 = (ax.K9.b)this.h.get().c();
            try {
                c<Void> c8 = new c<Void>(this){
                    final OneDriveFileHelper a;
                    {
                        this.a = oneDriveFileHelper;
                    }

                    @Override
                    public void b(d d8) {
                    }

                    public void d(Void void_) {
                    }
                };
                b8.l(c8);
                this.h.set(null);
                this.k = null;
                return;
            }
            catch (AndroidRuntimeException androidRuntimeException) {
                ax.Ha.c.h().f().b("ONEDRIVE DISCONNECT").l(androidRuntimeException).h();
            }
        }
    }

    @Override
    public boolean g0() {
        return true;
    }

    @Override
    public boolean h0() {
        return true;
    }

    @Override
    public void j0(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        this.e1(n8, g8, string, l8, l9, bl, true, c8, i8);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    void m(n object, String iterator, boolean bl, boolean bl2, ax.g3.h h8, ax.u3.c hashMap) throws ax.b3.j {
        ArrayList<n> arrayList;
        if (!bl2) {
            this.o((n)object, (String)((Object)iterator), bl, bl2, h8, (ax.u3.c)((Object)hashMap));
            return;
        }
        try {
            iterator = this.D0((ax.c3.T)object, true, true).f((String)((Object)iterator)).a().get();
            arrayList = new ArrayList<n>();
            hashMap = new HashMap<String, String>();
        }
        catch (d d8) {
            throw this.u0("search", d8);
        }
        block4: while (true) {
            object = iterator.b().iterator();
            while (true) {
                if (object.hasNext()) {
                    DriveItem driveItem = (DriveItem)object.next();
                    ax.c3.T t8 = new ax.c3.T(this, driveItem, this.N0(hashMap, driveItem));
                    arrayList.add(t8);
                }
                object = iterator.a() != null ? ((W)iterator.a()).a().get() : null;
                iterator = object;
                if (object != null) continue block4;
                h8.Y(arrayList, true);
                return;
                catch (J j8) {
                }
            }
            break;
        }
    }

    public String w0(String string) {
        ax.u3.b.c(string.startsWith("/drives/"));
        string = string.substring(8);
        return string.substring(0, string.indexOf("/"));
    }

    public String x0(String string) {
        int n8 = string.indexOf("/items/");
        if (n8 < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid path:");
            stringBuilder.append(string);
            ax.u3.b.g(stringBuilder.toString());
            return "";
        }
        return string.substring(n8 + 7);
    }

    @Override
    public k0 y() throws ax.b3.j {
        d d82;
        block7: {
            block6: {
                Drive drive;
                try {
                    drive = this.K0().a().get();
                    if (drive == null) break block6;
                }
                catch (d d82) {
                    break block7;
                }
                Object object = drive.u;
                if (object == null) break block6;
                Long l8 = ((BaseQuota)object).f;
                if (l8 == null) break block6;
                if (((BaseQuota)object).d != null) {
                    object = new k0(l8, drive.u.f - drive.u.d);
                    return object;
                }
            }
            return null;
        }
        throw this.u0("getStorageSpace", d82);
    }

    @Override
    public n z(String string) throws ax.b3.j {
        return this.k0(string, true);
    }

    public static class MyDriveItem
    extends DriveItem {
        @ax.s8.a
        @ax.s8.c(value="@microsoft.graph.conflictBehavior")
        public String U;
    }

    public static class MyDriveItemUploadableProperties
    extends DriveItemUploadableProperties {
        @ax.s8.a
        @ax.s8.c(value="@microsoft.graph.conflictBehavior")
        public String h;
    }

    public static class i {
        InputStream a;
        long b;
        ax.u3.c c;
        e d;

        public i(InputStream inputStream, long l8, ax.u3.c c8) {
            this.a = inputStream;
            this.b = l8;
            this.c = c8;
        }

        public i(InputStream inputStream, long l8, ax.u3.c c8, e e8) {
            this.a = inputStream;
            this.b = l8;
            this.c = c8;
            this.d = e8;
        }
    }

    public static class j
    extends T {
        private Context a;
        c0 b;

        public j(Context context) {
            this.a = context;
            this.b = new c0(ax.Q2.f.P0);
        }

        @Override
        public void a(int n8) {
            Object object = this.a.getSharedPreferences("OneDrivePrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("refresh_token_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("display_name_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("created_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("sortindex_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("email_");
            ((StringBuilder)object).append(n8);
            stringBuilder.remove(((StringBuilder)object).toString()).commit();
        }

        @Override
        public s f(int n8) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("OneDrivePrefs", 0);
            CharSequence charSequence = new StringBuilder();
            charSequence.append("display_name_");
            charSequence.append(n8);
            charSequence = sharedPreferences.getString(charSequence.toString(), null);
            Object object = new StringBuilder();
            ((StringBuilder)object).append("email_");
            ((StringBuilder)object).append(n8);
            object = sharedPreferences.getString(((StringBuilder)object).toString(), null);
            if (!TextUtils.isEmpty((CharSequence)object)) {
                charSequence = object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            String string = ((StringBuilder)object).toString();
            object = ax.Q2.f.P0;
            string = sharedPreferences.getString(string, ((ax.Q2.f)((Object)object)).M(this.a));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            long l8 = sharedPreferences.getLong(stringBuilder.toString(), 0L);
            stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            return new s((ax.Q2.f)((Object)object), n8, string, (String)charSequence, null, null, l8, sharedPreferences.getLong(stringBuilder.toString(), 0L));
        }

        @Override
        public void g(int n8, String string) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("OneDrivePrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location_name_");
            stringBuilder.append(n8);
            editor.putString(stringBuilder.toString(), string);
            editor.commit();
        }

        @Override
        public void j(int n8, long l8) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("OneDrivePrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            editor.putLong(stringBuilder.toString(), l8);
            editor.apply();
        }

        public void k(Activity activity, k k8) {
            k8.b(ax.Q2.f.P0);
            OneDriveFileHelper.X0(this.a);
            OneDriveFileHelper.T0(this.a, activity, null, new c<e0>(){
                final k a;
                final j b;
                {
                    this.b = j8;
                    this.a = k8;
                }

                @Override
                public void b(d d8) {
                    if (this.a != null) {
                        ax.u3.B.a0(new Runnable(this){
                            final a q;
                            {
                                this.q = a8;
                            }

                            @Override
                            public void run() {
                                this.q.a.a(ax.Q2.f.P0, "", 0, "", null);
                            }
                        });
                    }
                }

                public void d(e0 object) {
                    object = ((ax.K9.b)object.c()).f();
                    int n8 = this.b.l();
                    this.b.n(n8, (String)object, "", "");
                    if (this.a != null) {
                        ax.u3.B.a0(new Runnable(){
                            final a c0;
                            final int q;
                            {
                                this.c0 = a8;
                                this.q = n8;
                            }

                            @Override
                            public void run() {
                                this.c0.a.c(ax.Q2.f.P0, this.q);
                            }
                        });
                    }
                }
            });
        }

        int l() {
            return this.a.getSharedPreferences("OneDrivePrefs", 0).getInt("count", 0);
        }

        public List<s> m() {
            ArrayList<s> arrayList = new ArrayList<s>();
            Context context = this.a;
            context = context.getSharedPreferences("OneDrivePrefs", 0);
            int n8 = context.getInt("count", 0);
            for (int i8 = 0; i8 < n8; ++i8) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("refresh_token_");
                stringBuilder.append(i8);
                if (context.getString(stringBuilder.toString(), null) == null) continue;
                arrayList.add(this.f(i8));
            }
            return arrayList;
        }

        void n(int n8, String charSequence, String string, String string2) {
            Context context = this.a;
            boolean bl = false;
            if (n8 >= (context = context.getSharedPreferences("OneDrivePrefs", 0)).getInt("count", 0)) {
                bl = true;
            }
            context = context.edit();
            Object object = new StringBuilder();
            ((StringBuilder)object).append("version_");
            ((StringBuilder)object).append(n8);
            Object object2 = context.putInt(((StringBuilder)object).toString(), 3);
            object = new StringBuilder();
            ((StringBuilder)object).append("refresh_token_");
            ((StringBuilder)object).append(n8);
            String string3 = ((StringBuilder)object).toString();
            c0 c02 = this.b;
            ax.Y2.a a8 = ax.Y2.a.a();
            object = ax.Q2.f.P0;
            charSequence = object2.putString(string3, c02.e(a8.b((ax.Q2.f)((Object)object)), (String)charSequence));
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("display_name_");
            ((StringBuilder)object2).append(n8);
            string = charSequence.putString(((StringBuilder)object2).toString(), string);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("email_");
            ((StringBuilder)charSequence).append(n8);
            string = string.putString(((StringBuilder)charSequence).toString(), string2);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("location_name_");
            ((StringBuilder)charSequence).append(n8);
            string.putString(((StringBuilder)charSequence).toString(), ((ax.Q2.f)((Object)object)).M(this.a));
            if (bl) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("created_");
                ((StringBuilder)charSequence).append(n8);
                context.putLong(((StringBuilder)charSequence).toString(), System.currentTimeMillis());
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("sortindex_");
                ((StringBuilder)charSequence).append(n8);
                context.putLong(((StringBuilder)charSequence).toString(), System.currentTimeMillis());
            }
            if (bl) {
                context.putInt("count", n8 + 1);
            }
            context.commit();
        }
    }
}

