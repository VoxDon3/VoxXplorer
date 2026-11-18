/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.d;
import androidx.recyclerview.widget.RecyclerView;
import ax.Q2.a;
import ax.T.b;
import ax.X2.J;
import ax.X2.N;
import ax.c3.F;
import ax.c3.u;
import ax.d3.Y;
import ax.t3.c;
import ax.t3.j;
import ax.u3.B;
import com.voxdon.xplorer.oss.OssLicenseActivity;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class m0
extends d
implements SharedPreferences.OnSharedPreferenceChangeListener,
Y {
    private long m0;
    private int n0;

    static /* synthetic */ long e3(m0 m02, long l8) {
        m02.m0 = l8;
        return l8;
    }

    static /* synthetic */ int g3(m0 m02, int n8) {
        m02.n0 = n8;
        return n8;
    }

    static /* synthetic */ int h3(m0 m02) {
        int n8 = m02.n0;
        m02.n0 = n8 + 1;
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String j3() {
        Object object;
        Object object2;
        Object object32;
        StringBuffer stringBuffer;
        block16: {
            IOException iOException2;
            block15: {
                stringBuffer = new StringBuffer();
                stringBuffer.append("----Device----\n");
                object32 = new StringBuilder();
                ((StringBuilder)object32).append("BRAND : ");
                ((StringBuilder)object32).append(Build.BRAND);
                ((StringBuilder)object32).append("\n");
                stringBuffer.append(((StringBuilder)object32).toString());
                object32 = new StringBuilder();
                ((StringBuilder)object32).append("MODEL : ");
                ((StringBuilder)object32).append(Build.MODEL);
                ((StringBuilder)object32).append("\n");
                stringBuffer.append(((StringBuilder)object32).toString());
                object32 = new StringBuilder();
                ((StringBuilder)object32).append("DEVICE : ");
                ((StringBuilder)object32).append(Build.DEVICE);
                ((StringBuilder)object32).append("\n");
                stringBuffer.append(((StringBuilder)object32).toString());
                object32 = new StringBuilder();
                ((StringBuilder)object32).append("VERSION : ");
                ((StringBuilder)object32).append(Build.VERSION.SDK_INT);
                ((StringBuilder)object32).append("\n");
                stringBuffer.append(((StringBuilder)object32).toString());
                stringBuffer.append("APP VERSION : 2.8.2\n");
                stringBuffer.append("\n----MainStorage----\n");
                object2 = Environment.getExternalStorageDirectory();
                this.k3(stringBuffer, (File)object2);
                object32 = new StringBuilder();
                ((StringBuilder)object32).append("Total Space : ");
                ((StringBuilder)object32).append(((File)object2).getTotalSpace());
                stringBuffer.append(((StringBuilder)object32).toString());
                stringBuffer.append("\n----Storages----\n");
                this.k3(stringBuffer, new File("/storage/emulated/0"));
                object2 = new File("/storage").listFiles();
                int n8 = 0;
                if (object2 != null) {
                    for (Object object32 : object2) {
                        if (object32 == null) continue;
                        this.k3(stringBuffer, (File)object32);
                    }
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    stringBuffer.append("\n----Storage Volumes----\n");
                    object = (StorageManager)this.b().getSystemService("storage");
                    for (Object object32 : ax.X2.a.b((StorageManager)object)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("VOLUME STRING:");
                        stringBuilder.append(object32.toString());
                        stringBuilder.append("\n");
                        stringBuffer.append(stringBuilder.toString());
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("VOLUME DESC:");
                        stringBuilder.append(((N)object32).a(this.b()));
                        stringBuilder.append("\n");
                        stringBuffer.append(stringBuilder.toString());
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("VOLUME STATE:");
                        stringBuilder.append(((N)object32).i());
                        stringBuilder.append("\n");
                        stringBuffer.append(stringBuilder.toString());
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("VOLUME ID:");
                        stringBuilder.append(((N)object32).n());
                        stringBuilder.append("\n");
                        stringBuffer.append(stringBuilder.toString());
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("DISK FLAGS:");
                        stringBuilder.append(((N)object32).e((StorageManager)object));
                        stringBuilder.append("\n");
                        stringBuffer.append(stringBuilder.toString());
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("VOLUME PATH:");
                        stringBuilder.append(((N)object32).g());
                        stringBuilder.append("\n");
                        stringBuffer.append(stringBuilder.toString());
                        if (!TextUtils.isEmpty((CharSequence)((N)object32).g())) {
                            this.l3(stringBuffer, new File(((N)object32).g()));
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("VOLUME INFO: primary=");
                        stringBuilder.append(((N)object32).p());
                        stringBuilder.append(",removable=");
                        stringBuilder.append(((N)object32).r());
                        stringBuilder.append(",uuid=");
                        stringBuilder.append(((N)object32).l());
                        stringBuilder.append("\n\n");
                        stringBuffer.append(stringBuilder.toString());
                    }
                }
                stringBuffer.append("\n----ExternalFilesDirs----\n");
                object2 = this.b().getExternalFilesDirs(null);
                if (object2 != null) {
                    int n9 = ((File[])object2).length;
                    for (int i8 = n8; i8 < n9; ++i8) {
                        object32 = object2[i8];
                        if (object32 == null) {
                            stringBuffer.append("null\n");
                            continue;
                        }
                        this.k3(stringBuffer, (File)object32);
                    }
                }
                stringBuffer.append("\n----Environment----\n");
                object32 = System.getenv("SECONDARY_STORAGE");
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("SECONDARY_STORAGE:");
                ((StringBuilder)object2).append((String)object32);
                ((StringBuilder)object2).append("\n");
                stringBuffer.append(((StringBuilder)object2).toString());
                stringBuffer.append("\n----Mounts----\n");
                try {
                    object2 = new File("/proc/mounts");
                    object32 = new Scanner((File)object2);
                    while (((Scanner)object32).hasNext()) {
                        object2 = ((Scanner)object32).nextLine();
                        object = new StringBuilder();
                        ((StringBuilder)object).append("");
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append("\n");
                        stringBuffer.append(((StringBuilder)object).toString());
                    }
                }
                catch (IOException iOException2) {
                    break block15;
                }
                ((Scanner)object32).close();
                break block16;
            }
            object32 = new StringBuilder();
            ((StringBuilder)object32).append("");
            ((StringBuilder)object32).append(iOException2.getMessage());
            ((StringBuilder)object32).append("\n");
            stringBuffer.append(((StringBuilder)object32).toString());
        }
        stringBuffer.append("\n----vold.fstab----\n");
        try {
            object2 = new File("/system/etc/vold.fstab");
            object32 = new Scanner((File)object2);
            while (true) {
                if (!((Scanner)object32).hasNext()) {
                    ((Scanner)object32).close();
                    return stringBuffer.toString();
                }
                object = ((Scanner)object32).nextLine();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append("\n");
                stringBuffer.append(((StringBuilder)object2).toString());
            }
        }
        catch (IOException iOException) {}
        object32 = new StringBuilder();
        ((StringBuilder)object32).append("");
        ((StringBuilder)object32).append(iOException.getMessage());
        ((StringBuilder)object32).append("\n");
        stringBuffer.append(((StringBuilder)object32).toString());
        return stringBuffer.toString();
    }

    private void k3(StringBuffer stringBuffer, File comparable) {
        block3: {
            String string = ((File)comparable).getAbsolutePath();
            CharSequence charSequence = new StringBuilder();
            charSequence.append(string);
            charSequence.append("\n");
            stringBuffer.append(charSequence.toString());
            charSequence = new StringBuilder();
            charSequence.append("EXIST : ");
            charSequence.append(((File)comparable).exists());
            charSequence.append("\n");
            stringBuffer.append(charSequence.toString());
            charSequence = new StringBuilder();
            charSequence.append("DIR : ");
            charSequence.append(((File)comparable).isDirectory());
            charSequence.append("\n");
            stringBuffer.append(charSequence.toString());
            charSequence = new StringBuilder();
            charSequence.append("WRITABLE : ");
            charSequence.append(((File)comparable).canWrite());
            charSequence.append("\n");
            stringBuffer.append(charSequence.toString());
            charSequence = new StringBuilder();
            charSequence.append("READABLE : ");
            charSequence.append(((File)comparable).canRead());
            charSequence.append("\n");
            stringBuffer.append(charSequence.toString());
            charSequence = new StringBuilder();
            charSequence.append("MODIFIED : ");
            charSequence.append(((File)comparable).lastModified());
            charSequence.append("\n");
            stringBuffer.append(charSequence.toString());
            boolean bl = Environment.isExternalStorageRemovable(comparable);
            charSequence = new StringBuilder();
            charSequence.append("REMOVABLE : ");
            charSequence.append(bl);
            charSequence.append("\n");
            stringBuffer.append(charSequence.toString());
            charSequence = Environment.getExternalStorageState(comparable);
            comparable = new Comparable<File>();
            ((StringBuilder)comparable).append("STATE : ");
            ((StringBuilder)comparable).append((String)charSequence);
            ((StringBuilder)comparable).append("\n");
            stringBuffer.append(((StringBuilder)comparable).toString());
            int n8 = string.indexOf("/Android");
            if (n8 == -1) break block3;
            try {
                string = string.substring(0, n8);
                comparable = new Comparable<File>(string);
                string = Environment.getExternalStorageState(comparable);
                comparable = new Comparable<File>();
                ((StringBuilder)comparable).append("ROOT STATE : ");
                ((StringBuilder)comparable).append(string);
                ((StringBuilder)comparable).append("\n");
                stringBuffer.append(((StringBuilder)comparable).toString());
            }
            catch (Exception exception) {
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append("EXCEPTION : ");
                ((StringBuilder)comparable).append(exception.getMessage());
                ((StringBuilder)comparable).append("\n");
                stringBuffer.append(((StringBuilder)comparable).toString());
            }
        }
        stringBuffer.append("\n");
    }

    private void l3(StringBuffer stringBuffer, File file) {
        CharSequence charSequence = file.getAbsolutePath();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append("\n");
        stringBuffer.append(stringBuilder.toString());
        try {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("EXIST : ");
            ((StringBuilder)charSequence).append(file.exists());
            ((StringBuilder)charSequence).append("\n");
            stringBuffer.append(((StringBuilder)charSequence).toString());
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("DIR : ");
            ((StringBuilder)charSequence).append(file.isDirectory());
            ((StringBuilder)charSequence).append("\n");
            stringBuffer.append(((StringBuilder)charSequence).toString());
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("WRITABLE : ");
            ((StringBuilder)charSequence).append(file.canWrite());
            ((StringBuilder)charSequence).append("\n");
            stringBuffer.append(((StringBuilder)charSequence).toString());
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("READABLE : ");
            ((StringBuilder)charSequence).append(file.canRead());
            ((StringBuilder)charSequence).append("\n");
            stringBuffer.append(((StringBuilder)charSequence).toString());
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("MODIFIED : ");
            ((StringBuilder)charSequence).append(file.lastModified());
            ((StringBuilder)charSequence).append("\n");
            stringBuffer.append(((StringBuilder)charSequence).toString());
            return;
        }
        catch (Exception exception) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("EXCEPTION : ");
            ((StringBuilder)charSequence).append(exception.getMessage());
            ((StringBuilder)charSequence).append("\n");
            stringBuffer.append(((StringBuilder)charSequence).toString());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void m3() {
        if (this.f0() == null) {
            return;
        }
        String string = this.j3();
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse((String)"mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"vox.xplorer@gmail.com"});
        intent.putExtra("android.intent.extra.SUBJECT", "STORAGE INFORMATION");
        try {
            intent.putExtra("android.intent.extra.TEXT", string);
        }
        catch (RuntimeException runtimeException) {
            Toast.makeText((Context)this.f0(), (int)2131951927, (int)1).show();
            return;
        }
        try {
            boolean bl = B.K((Context)this.f0(), intent);
            if (!bl || J.q()) {
                File file = new File("/storage/emulated/0/sdcardinfo.txt");
                F.m(file, string);
            }
            try {
                u.p0(this, Intent.createChooser((Intent)intent, (CharSequence)"Send email..."));
                return;
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                File file = new File("/storage/emulated/0/sdcardinfo.txt");
                F.m(file, string);
                Toast.makeText((Context)this.f0(), (int)2131951927, (int)1).show();
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            Toast.makeText((Context)this.f0(), (int)2131951927, (int)1).show();
        }
    }

    @Override
    public void D1() {
        this.P2().L().unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
        super.D1();
    }

    @Override
    public void H1() {
        super.H1();
        this.P2().L().registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
        if (((ax.n.c)this.f0()).getSupportActionBar() != null) {
            ((ax.n.c)this.f0()).getSupportActionBar().G(2131951643);
        }
    }

    @Override
    public void T2(Bundle object, String string) {
        this.b3(2132148242, string);
        string = this.n("app_version");
        try {
            object = this.f0().getPackageManager().getPackageInfo((String)this.f0().getPackageName(), (int)0).versionName;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object = "";
        }
        ((Preference)((Object)string)).M0(this.N0(2131952690, object));
        ((Preference)((Object)string)).H0(new Preference.e(this){
            final m0 a;
            {
                this.a = m02;
            }

            @Override
            public boolean a(Preference preference) {
                if (this.a.m0 + 2000L > System.currentTimeMillis()) {
                    ax.d3.m0.h3(this.a);
                    if (this.a.n0 > 8) {
                        this.a.m3();
                        ax.d3.m0.g3(this.a, -10);
                    }
                } else {
                    ax.d3.m0.g3(this.a, 0);
                }
                ax.d3.m0.e3(this.a, System.currentTimeMillis());
                return true;
            }
        });
        object = this.n("gdpr_consent");
        this.f0();
        ((Preference)object).N0(false);
        object = this.n("usage_diagnostics");
        if (c.n().x()) {
            ((Preference)object).N0(true);
        } else {
            ((Preference)object).N0(false);
        }
        ((Preference)this.n("open_source_licenses")).H0(new Preference.e(this){
            final m0 a;
            {
                this.a = m02;
            }

            @Override
            public boolean a(Preference preference) {
                if (this.a.f0() != null && this.a.s0() != null) {
                    this.a.F2(new Intent((Context)this.a.f0(), OssLicenseActivity.class));
                    return true;
                }
                return false;
            }
        });
        ((Preference)this.n("privacy_policy")).H0(new Preference.e(this){
            final m0 a;
            {
                this.a = m02;
            }

            @Override
            public boolean a(Preference preference) {
                if (this.a.f0() != null && this.a.s0() != null) {
                    try {
                        preference = B.C("https://www.voxdon.com/vox-xplorer-privacy-policy");
                        u.p0(this.a, (Intent)preference);
                    }
                    catch (ActivityNotFoundException | SecurityException throwable) {
                        Toast.makeText((Context)this.a.f0(), (int)2131951927, (int)1).show();
                    }
                    return true;
                }
                return false;
            }
        });
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
        RecyclerView recyclerView = this.N2();
        if (!bl && recyclerView != null) {
            recyclerView.setPadding(0, 0, 0, b8.d);
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String string) {
        if ("usage_diagnostics".equals(string)) {
            boolean bl = j.n(this.b());
            a.i().f(bl);
            ax.Ha.c.k(bl);
        }
    }
}

