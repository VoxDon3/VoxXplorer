/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import ax.Q2.b;
import ax.c3.F;
import ax.c3.u;
import ax.n.c;
import ax.t3.j;
import ax.u3.q;
import java.io.InputStream;
import java.util.Scanner;

public class MSURLLauncherActivity
extends c {
    View a;

    @Override
    protected void onCreate(Bundle object) {
        b.f((Context)this, true);
        super.onCreate((Bundle)object);
        this.setContentView(2131558439);
        this.a = this.findViewById(2131362712);
        Intent intent = this.getIntent();
        object = intent.getAction();
        intent = intent.getData();
        if ("android.intent.action.VIEW".equals(object) && intent != null) {
            new a(this, (Context)this, (Uri)intent).h(new String[0]);
            return;
        }
        Toast.makeText((Context)this, (int)2131951927, (int)1).show();
        this.finish();
    }

    class a
    extends q<String, Void, String> {
        private Context h;
        private Uri i;
        private String j;
        final MSURLLauncherActivity k;

        a(MSURLLauncherActivity mSURLLauncherActivity, Context context, Uri uri) {
            this.k = mSURLLauncherActivity;
            super(q.e.e0);
            this.h = context;
            this.i = uri;
        }

        private String y(String string) {
            String string2 = null;
            if (string == null) {
                return null;
            }
            Scanner scanner = new Scanner(string);
            string = string2;
            while (scanner.hasNextLine()) {
                string2 = scanner.nextLine();
                if (string2 == null || string2.startsWith("InternetShortcut") || !string2.startsWith("URL=")) continue;
                string = string2.substring(4);
            }
            scanner.close();
            return string;
        }

        @Override
        protected void r() {
            View view = this.k.a;
            if (view != null) {
                view.setVisibility(0);
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected String w(String ... uri) {
            Object object;
            Uri uri2;
            block8: {
                RuntimeException var2_5;
                block9: {
                    block10: {
                        uri2 = this.i;
                        uri = null;
                        if (uri2 == null) return null;
                        object = this.h.getApplicationContext().getContentResolver().openAssetFileDescriptor(this.i, "r");
                        uri = uri2 = new AssetFileDescriptor.AutoCloseInputStream(object);
                        try {}
                        catch (Exception exception) {}
                        finally {
                            break block8;
                        }
                        catch (Throwable throwable) {
                            break block9;
                        }
                        catch (Exception exception) {
                            uri2 = null;
                        }
                        uri = uri2;
                        {
                            RuntimeException var3_9;
                            if (!ax.t3.j.o(this.h)) break block10;
                            uri = uri2;
                            this.j = var3_9.getMessage();
                        }
                    }
                    F.a((AutoCloseable)uri2);
                    return null;
                }
                F.a((AutoCloseable)uri);
                throw var2_5;
            }
            object = F.j((InputStream)uri2, 256, 10240L);
            F.a((AutoCloseable)uri2);
            uri = object;
            if (uri == null) return null;
            return this.y((String)uri);
        }

        protected void x(String charSequence) {
            View view = this.k.a;
            if (view != null) {
                view.setVisibility(8);
            }
            if (charSequence == null) {
                if (this.j != null) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(this.h.getString(2131951934));
                    ((StringBuilder)charSequence).append(":");
                    ((StringBuilder)charSequence).append(this.j);
                    charSequence = ((StringBuilder)charSequence).toString();
                    Toast.makeText((Context)this.h, (CharSequence)charSequence, (int)1).show();
                } else {
                    Toast.makeText((Context)this.h, (int)2131951934, (int)1).show();
                }
            } else {
                try {
                    charSequence = u.n(Uri.parse((String)charSequence), null, true, false);
                    u.o0((Context)this.k, (Intent)charSequence);
                }
                catch (Exception exception) {
                    Toast.makeText((Context)this.h, (int)2131951927, (int)1).show();
                }
            }
            this.k.finish();
        }
    }
}

