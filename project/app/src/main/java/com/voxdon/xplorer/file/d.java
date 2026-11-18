/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.E3.h;
import ax.F3.b;
import ax.Z2.s;
import ax.b3.D;
import ax.b3.j;
import ax.b3.q;
import ax.b3.t;
import ax.c3.A;
import ax.c3.B;
import ax.c3.G;
import ax.c3.c;
import ax.c3.d0;
import ax.c3.k0;
import ax.g3.h;
import ax.g3.i;
import ax.g3.k;
import ax.u3.q;
import ax.u3.v;
import com.voxdon.xplorer.activity.a;
import com.voxdon.xplorer.file.T;
import com.voxdon.xplorer.file.c;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.p;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.auth.BoxAuthentication;
import com.box.androidsdk.content.models.BoxBookmark;
import com.box.androidsdk.content.models.BoxCollaborator;
import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.models.BoxEntity;
import com.box.androidsdk.content.models.BoxError;
import com.box.androidsdk.content.models.BoxFolder;
import com.box.androidsdk.content.models.BoxItem;
import com.box.androidsdk.content.models.BoxIterator;
import com.box.androidsdk.content.models.BoxIteratorItems;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.models.BoxUser;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestDownload;
import com.box.androidsdk.content.requests.BoxRequestItem;
import com.box.androidsdk.content.requests.BoxRequestItemUpdate;
import com.box.androidsdk.content.requests.BoxRequestsFile$CopyFile;
import com.box.androidsdk.content.requests.BoxRequestsFolder$DeleteFolder;
import com.box.androidsdk.content.requests.BoxRequestsFolder$GetFolderItems;
import com.box.androidsdk.content.requests.BoxRequestsSearch$Search;
import com.box.androidsdk.content.requests.BoxResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class d
extends m {
    private static final Logger q = Logger.getLogger("FileManager.BoxFileHelper");
    private static f r;
    private BoxSession h;
    private ax.E3.b i;
    private ax.E3.c j;
    private ax.E3.d k;
    private ax.E3.e l;
    private j.ConcurrentHashMap<String, c> m = new j.ConcurrentHashMap();
    private j.ConcurrentHashMap<String, String> n = new j.ConcurrentHashMap();
    private j.ConcurrentHashMap<String, String> o = new j.ConcurrentHashMap();
    private final Object p = new Object();

    private j n0(String string, BoxException boxException) {
        Object object = boxException.c();
        BoxError boxError = boxException.b();
        Object object2 = null;
        String string2 = boxError != null ? boxError.D() : null;
        if (boxError != null) {
            object2 = boxError.C();
        }
        int n8 = boxException.e();
        if (object == BoxException.ErrorType.p0) {
            return new q(boxException);
        }
        if (object == BoxException.ErrorType.e0) {
            return new ax.b3.e(boxException);
        }
        if (n8 == 404 && "not_found".equals(object2)) {
            return new t(boxException);
        }
        if (n8 == 403 && "access_denied_insufficient_permissions".equals(object2)) {
            return new ax.b3.e(string, boxException);
        }
        if (n8 == 403 && "storage_limit_exceeded".equals(object2)) {
            return new ax.b3.s(string, boxException);
        }
        if (n8 == 403 && "file_size_limit_exceeded".equals(object2)) {
            return new D(string, boxException);
        }
        if (n8 == 409 && ("conflict".equals(object2) || "item_name_in_use".equals(object2))) {
            return new ax.b3.f(false);
        }
        if ("Couldn't connect to the Box API due to a network error".equals(boxException.getMessage())) {
            return new q(boxException);
        }
        object = "";
        if (object2 != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("");
            ((StringBuilder)object).append(" code:");
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
        }
        object2 = object;
        if (string2 != null) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" error:");
            ((StringBuilder)object2).append(string2);
            object2 = ((StringBuilder)object2).toString();
        }
        object = object2;
        if (n8 != 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(" responseCode:");
            ((StringBuilder)object).append(n8);
            object = ((StringBuilder)object).toString();
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append((String)object);
        return ax.b3.d.b(((StringBuilder)object2).toString(), boxException);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void o0(n object, boolean bl) throws j {
        block4: {
            block3: {
                if (!object.n()) throw new t();
                try {
                    this.w0(((n)object).E());
                    if (!object.isDirectory()) {
                        this.i.d(object.t()).x();
                        return;
                    }
                    object = this.j.d(object.t());
                    if (!bl) break block3;
                    ((BoxRequestsFolder$DeleteFolder)object).E(true);
                    break block4;
                }
                catch (BoxException boxException) {
                    throw this.n0("deleteFile", boxException);
                }
            }
            ((BoxRequestsFolder$DeleteFolder)object).E(false);
        }
        ((BoxRequest)object).x();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private BoxItem p0(String string, String string2) throws j {
        BoxIteratorItems boxIteratorItems;
        long l8;
        System.currentTimeMillis();
        int n8 = 0;
        do {
            Serializable serializable2;
            try {
                serializable2 = this.j.h(string);
                ((BoxRequestItem)serializable2).E(this.q0());
                ((BoxRequestsFolder$GetFolderItems)serializable2).F(1000);
                if (n8 > 0) {
                    ((BoxRequestsFolder$GetFolderItems)serializable2).G(n8);
                }
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (BoxException boxException) {
                throw this.n0("getChildItem", boxException);
            }
            boxIteratorItems = (BoxIteratorItems)((BoxRequest)serializable2).x();
            for (Serializable serializable2 : boxIteratorItems) {
                if (!string2.equals(((BoxItem)serializable2).M())) continue;
                return serializable2;
            }
            n8 = (int)(boxIteratorItems.J() + 1000L);
        } while ((l8 = boxIteratorItems.C().longValue()) >= (long)n8);
        return null;
    }

    private String[] q0() {
        return new String[]{"name", "size", "modified_at", "content_modified_at", "item_status", "parent", "permissions"};
    }

    public static f r0(Context context) {
        if (r == null) {
            r = new f(context.getApplicationContext());
        }
        return r;
    }

    private String s0(c c8) throws j {
        String string = c8.g0();
        if (string != null) {
            return string;
        }
        if ((c8 = (c)this.z(c8.T())).n()) {
            return c8.t();
        }
        return null;
    }

    private String[] t0() {
        return new String[]{"name", "size", "modified_at", "content_modified_at", "item_status", "parent", "path_collection", "permissions"};
    }

    private static void u0(Context context) {
        ax.c3.g g8 = ax.c3.g.c(context);
        ax.Q2.f f8 = ax.Q2.f.S0;
        ax.E3.g.c = g8.a(f8);
        ax.E3.g.d = ax.c3.g.c(context).b(f8);
    }

    private List<BoxItem> v0(String string, String[] stringArray) throws BoxException {
        Serializable serializable;
        ArrayList<BoxItem> arrayList = new ArrayList<BoxItem>();
        int n8 = 0;
        do {
            serializable = this.j.h(string);
            ((BoxRequestItem)serializable).E(stringArray);
            ((BoxRequestsFolder$GetFolderItems)serializable).F(1000);
            if (n8 > 0) {
                ((BoxRequestsFolder$GetFolderItems)serializable).G(n8);
            }
            serializable = (BoxIteratorItems)((BoxRequest)serializable).x();
            Iterator iterator = ((BoxIterator)serializable).iterator();
            while (iterator.hasNext()) {
                arrayList.add((BoxItem)iterator.next());
            }
            n8 = (int)(((BoxIterator)serializable).J() + 1000L);
        } while (((BoxIterator)serializable).C() >= (long)n8);
        return arrayList;
    }

    private void w0(String string) {
        for (String string2 : this.m.keySet()) {
            if (!string2.startsWith(string)) continue;
            this.m.remove((Object)string2);
            if ((string2 = (String)this.o.remove((Object)string2)) == null) continue;
            this.n.remove((Object)string2);
        }
    }

    private void x0(c c8) {
        this.m.put((Object)c8.E(), (Object)c8);
        this.n.put((Object)c8.t(), (Object)c8.E());
        this.o.put((Object)c8.E(), (Object)c8.t());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void y0(BoxSession boxSession) {
        Object object = this.p;
        synchronized (object) {
            ax.E3.a a8;
            this.h = boxSession;
            this.i = a8 = new ax.E3.b(boxSession);
            a8 = new ax.E3.c(boxSession);
            this.j = a8;
            a8 = new ax.E3.d(boxSession);
            this.k = a8;
            a8 = new ax.E3.e(boxSession);
            this.l = a8;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void z0(n var1_1, G var2_6, long var3_7, Long var5_8, boolean var6_9, ax.u3.c var7_10, i var8_11) throws j, ax.b3.a {
        block10: {
            var9_12 = this.s0((c)var1_1);
            if (var9_12 == null) break block10;
            var2_6 = var2_6.b();
            if (var6_9) {
            }
            ** GOTO lbl-1000
            {
                block12: {
                    block11: {
                        catch (BoxException var1_5) {
                            throw this.n0("writeFile", (BoxException)var1_4);
                        }
                        try {
                            if (((c)var1_1).f0() == null) break block11;
                            var1_1 = this.i.o((InputStream)var2_6, var1_1.t());
                            ** GOTO lbl-1000
                        }
                        catch (BoxException var1_2) {
                            throw this.n0("writeFile", (BoxException)var1_4);
                        }
                    }
                    var1_1 = this.i.p((InputStream)var2_6, var1_1.B(), (String)var9_12);
                    ** GOTO lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        var1_1 = this.i.p((InputStream)var2_6, var1_1.B(), (String)var9_12);
                    }
lbl-1000:
                    // 3 sources

                    {
                        if (var5_8 == null || var5_8.longValue() < 0L) break block12;
                        var9_12 = new Date(var5_8.longValue());
                        var1_1.H((Date)var9_12);
                    }
                }
                ** try [egrp 5[TRYBLOCK] [7 : 135->181)] { 
lbl26:
                // 1 sources

                var5_8 = new b(){
                    final i a;
                    final long b;
                    final ax.u3.c c;
                    final InputStream d;
                    final d e;
                    {
                        this.e = d8;
                        this.a = i8;
                        this.b = l8;
                        this.c = c8;
                        this.d = inputStream;
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    @Override
                    public void a(long l8, long l9) {
                        Object object = this.a;
                        if (object != null) {
                            object.a(l8, this.b);
                        }
                        if ((object = this.c) == null) return;
                        if (!object.isCancelled()) return;
                        try {
                            this.d.close();
                            return;
                        }
                        catch (IOException iOException) {
                            return;
                        }
                    }
                };
                var1_1.I(var5_8);
                var1_1.x();
                return;
            }
lbl32:
            // 1 sources

            catch (BoxException var1_3) {
                throw this.n0("writeFile", (BoxException)var1_4);
            }
        }
        var1_1 = new j("Target parent does not exist");
        throw var1_1;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public InputStream A(String var1_1, String var2_3, String var3_4) throws IOException {
        block4: {
            if (var3_4 == null) ** GOTO lbl6
            try {
                block5: {
                    if (!var3_4.startsWith("fileid=")) break block5;
                    var1_1 = Uri.decode((String)var3_4.substring(7));
                    ** GOTO lbl16
                }
                if ((var1_1 = (c)this.z((String)var2_3)) == null) break block4;
            }
            catch (j var1_2) {
                return null;
            }
            if (var1_1.n()) break block4;
            return null;
        }
        var1_1 = var1_1.t();
lbl16:
        // 2 sources

        var3_4 = new g(16384);
        var2_3 = new ax.d5.b((ax.d5.a)var3_4);
        var1_1 = this.i.f((OutputStream)var2_3, (String)var1_1);
        var1_1.O(128);
        var4_5 = var1_1.D();
        var1_1 = new h.b<BoxDownload>(){
            final ax.d5.b a;
            final g b;
            final d c;
            {
                this.c = d8;
                this.a = b8;
                this.b = g8;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void a(BoxResponse<BoxDownload> boxResponse) {
                Throwable throwable2222222;
                block10: {
                    block9: {
                        block8: {
                            try {
                                if (!boxResponse.c()) break block8;
                                this.a.flush();
                                break block9;
                            }
                            catch (Throwable throwable2222222) {
                                break block10;
                            }
                        }
                        this.b.m(boxResponse.a());
                    }
                    this.a.close();
                    return;
                    {
                        catch (IOException iOException) {
                            return;
                        }
                    }
                }
                try {}
                catch (IOException iOException) {
                    throw throwable2222222;
                }
                {
                    this.a.close();
                    throw throwable2222222;
                    catch (IOException iOException) {}
                    {
                        this.a.close();
                        return;
                    }
                }
            }
        };
        var4_5.a(var1_1);
        v.f(q.e.f0).execute(var4_5);
        return var3_4;
    }

    @Override
    public boolean B(n n8) {
        return true;
    }

    @Override
    public List<n> C(n object, m.f object2) throws j {
        if (object.n()) {
            BoxException boxException2;
            block5: {
                ArrayList<n> arrayList;
                if (this.j == null) {
                    boolean bl = this.a();
                    boolean bl2 = this.j == null;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("FolderApi == null:connected = ");
                    ((StringBuilder)object).append(bl);
                    ((StringBuilder)object).append(":");
                    ((StringBuilder)object).append(bl2);
                    object = new j(((StringBuilder)object).toString());
                    ax.Q2.d.b((Throwable)object);
                    throw object;
                }
                ax.u3.b.c(object.isDirectory());
                try {
                    arrayList = new ArrayList<n>();
                    for (BoxItem boxItem : this.v0(object.t(), this.q0())) {
                        if (boxItem instanceof BoxBookmark) continue;
                        String string = d0.Q(((n)object).E(), boxItem.M());
                        object2 = new c(this, object.t(), boxItem, string);
                        arrayList.add((n)object2);
                    }
                }
                catch (BoxException boxException2) {
                    break block5;
                }
                return arrayList;
            }
            throw this.n0("listChildren", boxException2);
        }
        throw new t();
    }

    @Override
    public void D(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, ax.b3.a {
        ax.u3.b.a(n8.n());
        this.z0(n8, g8, l8, l9, false, c8, i8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void E(n object, n n8, ax.u3.c c8, i i8) throws j, ax.b3.a {
        ax.u3.b.a(n8.n());
        if (!object.n()) throw new t();
        boolean bl = ((n)object).T().equals(n8.T());
        boolean bl2 = ((n)object).B().equals(n8.B());
        if (object.isDirectory()) {
            this.w0(((n)object).E());
        }
        try {
            object = object.isDirectory() ? this.j.i(object.t()) : this.i.n(object.t());
        }
        catch (BoxException boxException) {
            throw this.n0("moveFile", boxException);
        }
        if (!bl) {
            ((BoxRequestItemUpdate)object).G(this.s0((c)n8));
        }
        if (!bl2) {
            ((BoxRequestItemUpdate)object).F(n8.B());
        }
        ((BoxRequest)object).x();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void F(n object, n n8, ax.u3.c object2, i i8) throws j, ax.b3.a {
        long l8;
        if (!object.n()) throw new t();
        try {
            boolean bl = ((n)object).B().equals(n8.B());
            object2 = this.s0((c)n8);
            if (object2 == null) {
                object = new j("Target parent does not exist");
                throw object;
            }
            l8 = object.p();
            object = this.i.c(object.t(), (String)object2);
            if (!bl) {
                ((BoxRequestsFile$CopyFile)object).F(n8.B());
            }
        }
        catch (BoxException boxException) {
            throw this.n0("copyFile", boxException);
        }
        ((BoxRequest)object).x();
        if (i8 == null) return;
        i8.a(l8, l8);
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    @Override
    public String H(n n8) {
        if (A.J(n8)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fileid=");
            stringBuilder.append(Uri.encode((String)n8.t()));
            return B.a0(n8, stringBuilder.toString());
        }
        return null;
    }

    @Override
    public void I(n n8) throws j {
        this.o0(n8, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream J(n object, long l8) throws j {
        IOException iOException2;
        block5: {
            h.b<BoxDownload> b8;
            ax.d5.b b9;
            g g8;
            block4: {
                if (!object.n()) {
                    throw new t();
                }
                if (!this.a()) {
                    throw new ax.b3.h("Box is not connected!");
                }
                try {
                    g8 = new g(16384);
                    b9 = new ax.d5.b(g8);
                    b8 = this.i.e(b9, object.t());
                    if (l8 <= 0L) break block4;
                    ((BoxRequestDownload)((Object)b8)).H(l8, object.p());
                }
                catch (IOException iOException2) {
                    break block5;
                }
            }
            object = ((BoxRequest)((Object)b8)).D();
            b8 = new h.b<BoxDownload>(){
                final ax.d5.b a;
                final g b;
                final d c;
                {
                    this.c = d8;
                    this.a = b8;
                    this.b = g8;
                }

                /*
                 * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                 * Loose catch block
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                public void a(BoxResponse<BoxDownload> boxResponse) {
                    Throwable throwable2222222;
                    block10: {
                        block9: {
                            block8: {
                                try {
                                    Logger logger = q;
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("download complete :");
                                    stringBuilder.append(boxResponse.c());
                                    logger.fine(stringBuilder.toString());
                                    if (!boxResponse.c()) break block8;
                                    this.a.flush();
                                    break block9;
                                }
                                catch (Throwable throwable2222222) {
                                    break block10;
                                }
                            }
                            this.b.m(boxResponse.a());
                        }
                        this.a.close();
                        return;
                        {
                            catch (IOException iOException) {
                                return;
                            }
                        }
                    }
                    try {}
                    catch (IOException iOException) {
                        throw throwable2222222;
                    }
                    {
                        this.a.close();
                        throw throwable2222222;
                        catch (IOException iOException) {}
                        {
                            this.a.close();
                            return;
                        }
                    }
                }
            };
            ((ax.E3.h)object).a(b8);
            v.f(q.e.f0).execute((Runnable)object);
            return g8;
        }
        iOException2.printStackTrace();
        throw new j(iOException2);
    }

    @Override
    public void K(Activity object, Fragment object2, c.a a8) {
        int n8 = this.t();
        object2 = new AtomicBoolean(false);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Object object3 = this.p().getSharedPreferences("BoxCloudPrefs", 0);
        CharSequence charSequence = new StringBuilder();
        charSequence.append("accountid_");
        charSequence.append(n8);
        charSequence = object3.getString(charSequence.toString(), null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("email_");
        stringBuilder.append(n8);
        object3 = object3.getString(stringBuilder.toString(), null);
        d.u0((Context)object);
        try {
            object = new BoxSession(this.p(), (String)charSequence);
        }
        catch (RuntimeException runtimeException) {
            ax.Q2.d.c("box init", runtimeException);
            a8.T(false, null);
            return;
        }
        ((BoxSession)object).O((String)object3);
        ((BoxSession)object).R(new BoxAuthentication.e(){
            final AtomicBoolean c0;
            final AtomicInteger d0;
            final c.a e0;
            final d f0;
            final BoxSession q;
            {
                this.f0 = d8;
                this.q = boxSession;
                this.c0 = atomicBoolean;
                this.d0 = atomicInteger;
                this.e0 = a8;
            }

            @Override
            public void e(BoxAuthentication.BoxAuthenticationInfo serializable, Exception object) {
                q.fine("Box : onAuthFailure");
                if (!this.c0.get()) {
                    this.c0.set(true);
                    this.d0.set(2);
                    this.f0.f0(new Runnable(this){
                        final d q;
                        {
                            this.q = d8;
                        }

                        @Override
                        public void run() {
                            this.q.e0.T(false, null);
                        }
                    });
                    return;
                }
                int n8 = this.d0.get();
                object = ax.Ha.c.h().f().d("Box onConnectResult Twice 2");
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("called:");
                ((StringBuilder)serializable).append(n8);
                ((ax.Ha.b)object).g(((StringBuilder)serializable).toString()).h();
            }

            @Override
            public void g(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
                q.fine("Box : onRefreshed");
            }

            @Override
            public void h(BoxAuthentication.BoxAuthenticationInfo object) {
                this.f0.y0(this.q);
                if (!this.c0.get()) {
                    this.c0.set(true);
                    this.d0.set(1);
                    this.f0.f0(new Runnable(this){
                        final d q;
                        {
                            this.q = d8;
                        }

                        @Override
                        public void run() {
                            this.q.e0.T(true, null);
                        }
                    });
                    return;
                }
                int n8 = this.d0.get();
                object = ax.Ha.c.h().f().d("Box onConnectResult Twice 1");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("called:");
                stringBuilder.append(n8);
                ((ax.Ha.b)object).g(stringBuilder.toString()).h();
            }
        });
        ((BoxSession)object).l(this.p()).a(new h.b<BoxSession>(){
            final AtomicBoolean a;
            final AtomicInteger b;
            final c.a c;
            final d d;
            {
                this.d = d8;
                this.a = atomicBoolean;
                this.b = atomicInteger;
                this.c = a8;
            }

            @Override
            public void a(BoxResponse<BoxSession> boxResponse) {
                if (!this.a.get()) {
                    this.a.set(true);
                    this.b.set(3);
                    if (!this.d.a()) {
                        this.d.f0(new Runnable(this){
                            final e q;
                            {
                                this.q = e8;
                            }

                            @Override
                            public void run() {
                                this.q.c.T(false, null);
                            }
                        });
                    }
                }
            }
        });
        a8.B();
    }

    @Override
    public boolean L() {
        return false;
    }

    @Override
    public boolean M(n object) {
        Object object2;
        block3: {
            object2 = ((n)object).T();
            object = ((n)object).B();
            object2 = (c)this.z((String)object2);
            if (((c)object2).n()) break block3;
            return false;
        }
        try {
            object = (BoxFolder)this.j.c(((c)object2).t(), (String)object).x();
            return true;
        }
        catch (j | BoxException exception) {
            return false;
        }
    }

    @Override
    public boolean N(n n8) {
        return this.l(n8);
    }

    @Override
    public boolean O() {
        return true;
    }

    @Override
    public void P(n n8) throws j {
        this.o0(n8, false);
    }

    @Override
    public boolean Q(n n8, n n9) {
        return true;
    }

    @Override
    public boolean Y() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean a() {
        Object object = this.p;
        synchronized (object) {
            if (this.h == null) return false;
            return true;
        }
    }

    @Override
    public void b() {
        this.m.clear();
        this.o.clear();
        this.n.clear();
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
    public void j0(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, ax.b3.a {
        this.z0(n8, g8, l8, l9, true, c8, i8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    void m(n object, String arrayList, boolean bl, boolean bl2, h h8, ax.u3.c object2) throws j {
        Iterator iterator;
        if (!bl2) {
            this.o((n)object, (String)((Object)arrayList), bl, bl2, h8, (ax.u3.c)object2);
            return;
        }
        try {
            object = this.s0((c)object);
            arrayList = this.k.c((String)((Object)arrayList));
            ((BoxRequestsSearch$Search)((Object)arrayList)).G(new String[]{BoxRequestsSearch$Search.f0});
            ((BoxRequestsSearch$Search)((Object)arrayList)).F(new String[]{object});
            ((BoxRequestItem)((Object)arrayList)).E(this.t0());
            ((BoxRequestsSearch$Search)((Object)arrayList)).I(200);
            object = (BoxIteratorItems)((BoxRequest)((Object)arrayList)).x();
            arrayList = new ArrayList<n>();
            iterator = ((BoxIterator)object).iterator();
        }
        catch (BoxException boxException) {
            throw this.n0("search", boxException);
        }
        while (true) {
            Object object3;
            if (!iterator.hasNext()) {
                if (h8 == null) return;
                h8.Y(arrayList, true);
                return;
            }
            object2 = (BoxItem)iterator.next();
            Object object4 = ((BoxItem)object2).O();
            object = "/";
            object4 = ((BoxIterator)object4).iterator();
            while (object4.hasNext()) {
                object3 = (BoxFolder)object4.next();
                if (((BoxEntity)object3).G() == "0") continue;
                object = d0.Q((String)object, ((BoxItem)object3).M());
            }
            object = d0.Q((String)object, ((BoxItem)object2).M());
            object4 = ((BoxItem)object2).N();
            object3 = new c(this, ((BoxEntity)object4).G(), (BoxItem)object2, (String)object);
            arrayList.add((n)object3);
        }
    }

    @Override
    public k0 y() throws j {
        BoxException boxException2;
        block4: {
            try {
                Object object = (BoxUser)this.l.d().x();
                if (((BoxUser)object).K() != null && ((BoxUser)object).M() != null) {
                    object = new k0(((BoxUser)object).K(), ((BoxUser)object).M());
                    return object;
                }
            }
            catch (BoxException boxException2) {
                break block4;
            }
            return null;
        }
        if (this.h.D() != null && this.h.D().K() != null && this.h.D().M() != null) {
            return new k0(this.h.D().K(), this.h.D().M());
        }
        throw this.n0("getStorageSpace", boxException2);
    }

    @Override
    public n z(String object) throws j {
        if (this.a()) {
            if (this.m.containsKey(object)) {
                return (n)this.m.get(object);
            }
            if (d0.a.equals(object)) {
                return new c(this, (String)object);
            }
            c c8 = (c)this.z(d0.r((String)object));
            Object object2 = d0.h((String)object);
            if (c8.n() && c8.isDirectory()) {
                object2 = this.p0(c8.t(), (String)object2);
                if (object2 != null) {
                    object = new c(this, c8.t(), (BoxItem)object2, (String)object);
                    if (((c)object).isDirectory()) {
                        this.x0((c)object);
                    }
                    return object;
                }
                return new c(this, c8, (String)object);
            }
            return new c(this, (String)object);
        }
        throw new ax.b3.h("Box is not connected!");
    }

    public static class f
    extends T {
        Context a;

        public f(Context context) {
            this.a = context;
        }

        @Override
        public void a(int n8) {
            Object object = this.a.getSharedPreferences("BoxCloudPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("accountid_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("email_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("display_name_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("location_name_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            object.remove(stringBuilder.toString()).commit();
        }

        @Override
        public s f(int n8) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("BoxCloudPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            charSequence.append("email_");
            charSequence.append(n8);
            charSequence = sharedPreferences.getString(charSequence.toString(), null);
            Object object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            String string = ((StringBuilder)object).toString();
            object = ax.Q2.f.S0;
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
            SharedPreferences.Editor editor = this.a.getSharedPreferences("BoxCloudPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location_name_");
            stringBuilder.append(n8);
            editor.putString(stringBuilder.toString(), string);
            editor.commit();
        }

        @Override
        public void j(int n8, long l8) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("BoxCloudPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            editor.putLong(stringBuilder.toString(), l8);
            editor.apply();
        }

        public void k(com.voxdon.xplorer.activity.a a8, k k8) {
            k8.b(ax.Q2.f.S0);
            d.u0((Context)a8);
            BoxSession boxSession = new BoxSession((Context)a8, null);
            boxSession.R(new BoxAuthentication.e(){
                final f c0;
                final k q;
                {
                    this.c0 = f8;
                    this.q = k8;
                }

                @Override
                public void e(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo, Exception exception) {
                    q.fine("Box : onAuthFailure");
                    new Handler(Looper.getMainLooper()).post(new Runnable(this){
                        final a q;
                        {
                            this.q = a8;
                        }

                        @Override
                        public void run() {
                            this.q.q.a(ax.Q2.f.S0, "", 0, "", null);
                        }
                    });
                }

                @Override
                public void g(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
                    q.fine("Box : onRefreshed");
                }

                @Override
                public void h(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
                    q.fine("Box : onAuthCreated");
                    String string = boxAuthenticationInfo.K().G();
                    int n8 = this.c0.m();
                    int n9 = this.c0.l(string);
                    if (n9 >= 0) {
                        n8 = n9;
                    }
                    this.c0.o(n8, boxAuthenticationInfo);
                    new Handler(Looper.getMainLooper()).post(new Runnable(){
                        final a c0;
                        final int q;
                        {
                            this.c0 = a8;
                            this.q = n8;
                        }

                        @Override
                        public void run() {
                            this.c0.q.c(ax.Q2.f.S0, this.q);
                        }
                    });
                }
            });
            boxSession.l((Context)a8);
        }

        int l(String string) {
            Context context = this.a;
            context = context.getSharedPreferences("BoxCloudPrefs", 0);
            int n8 = context.getInt("count", 0);
            for (int i8 = 0; i8 < n8; ++i8) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("accountid_");
                stringBuilder.append(i8);
                if (!context.contains(stringBuilder.toString()) || TextUtils.isEmpty((CharSequence)string)) continue;
                stringBuilder = new StringBuilder();
                stringBuilder.append("accountid_");
                stringBuilder.append(i8);
                if (!string.equals(context.getString(stringBuilder.toString(), null))) continue;
                return i8;
            }
            return -1;
        }

        int m() {
            return this.a.getSharedPreferences("BoxCloudPrefs", 0).getInt("count", 0);
        }

        public List<s> n() {
            ArrayList<s> arrayList = new ArrayList<s>();
            Object object = this.a;
            SharedPreferences sharedPreferences = object.getSharedPreferences("BoxCloudPrefs", 0);
            int n8 = sharedPreferences.getInt("count", 0);
            for (int i8 = 0; i8 < n8; ++i8) {
                object = new StringBuilder();
                ((StringBuilder)object).append("email_");
                ((StringBuilder)object).append(i8);
                if (sharedPreferences.getString(((StringBuilder)object).toString(), null) == null) continue;
                arrayList.add(this.f(i8));
            }
            return arrayList;
        }

        void o(int n8, BoxAuthentication.BoxAuthenticationInfo boxJsonObject) {
            boxJsonObject = ((BoxAuthentication.BoxAuthenticationInfo)boxJsonObject).K();
            CharSequence charSequence = ((BoxCollaborator)boxJsonObject).I();
            CharSequence charSequence2 = ((BoxEntity)boxJsonObject).G();
            CharSequence charSequence3 = ((BoxUser)boxJsonObject).J();
            boxJsonObject = this.a;
            boolean bl = false;
            if (n8 >= (boxJsonObject = boxJsonObject.getSharedPreferences("BoxCloudPrefs", 0)).getInt("count", 0)) {
                bl = true;
            }
            boxJsonObject = boxJsonObject.edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("accountid_");
            stringBuilder.append(n8);
            stringBuilder = boxJsonObject.putString(stringBuilder.toString(), (String)charSequence2);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("display_name_");
            ((StringBuilder)charSequence2).append(n8);
            charSequence2 = stringBuilder.putString(((StringBuilder)charSequence2).toString(), (String)charSequence);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("email_");
            ((StringBuilder)charSequence).append(n8);
            charSequence = charSequence2.putString(((StringBuilder)charSequence).toString(), (String)charSequence3);
            charSequence3 = new StringBuilder();
            ((StringBuilder)charSequence3).append("location_name_");
            ((StringBuilder)charSequence3).append(n8);
            charSequence.putString(((StringBuilder)charSequence3).toString(), ax.Q2.f.S0.M(this.a));
            if (bl) {
                charSequence3 = new StringBuilder();
                ((StringBuilder)charSequence3).append("created_");
                ((StringBuilder)charSequence3).append(n8);
                boxJsonObject.putLong(((StringBuilder)charSequence3).toString(), System.currentTimeMillis());
                charSequence3 = new StringBuilder();
                ((StringBuilder)charSequence3).append("sortindex_");
                ((StringBuilder)charSequence3).append(n8);
                boxJsonObject.putLong(((StringBuilder)charSequence3).toString(), System.currentTimeMillis());
            }
            if (bl) {
                boxJsonObject.putInt("count", n8 + 1);
            }
            boxJsonObject.commit();
        }
    }

    protected static class g
    extends ax.d5.a {
        Throwable j0;

        protected g(int n8) {
            super(n8);
        }

        public void m(Throwable throwable) {
            this.j0 = throwable;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public int read() throws IOException {
            synchronized (this) {
                Throwable throwable3;
                block6: {
                    block4: {
                        Throwable throwable2;
                        block5: {
                            int n8;
                            try {
                                if (this.j0 != null) break block4;
                                n8 = super.read();
                                throwable2 = this.j0;
                                if (throwable2 != null) break block5;
                            }
                            catch (Throwable throwable3) {
                                break block6;
                            }
                            return n8;
                        }
                        throwable2 = new IOException("Error raised", this.j0);
                        throw throwable2;
                    }
                    IOException iOException = new IOException("Error raised", this.j0);
                    throw iOException;
                }
                throw throwable3;
            }
        }
    }
}

