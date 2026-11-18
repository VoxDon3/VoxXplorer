package ax.d3;

import android.content.ActivityNotFoundException;
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
import androidx.recyclerview.widget.RecyclerView;
import ax.X2.C1155a;
import ax.c3.C1832u;
import ax.n.ActivityC2561c;
import ax.u3.C3180B;
import com.voxdon.xplorer.oss.OssLicenseActivity;
import com.voxdon.xplorer.R;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class m0 extends androidx.preference.d implements SharedPreferences.OnSharedPreferenceChangeListener, Y {
    private long m0;
    private int n0;

    class a implements Preference.e {
        a() {
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            if (m0.this.m0 + 2000 > System.currentTimeMillis()) {
                m0.h3(m0.this);
                if (m0.this.n0 > 8) {
                    m0.this.m3();
                    m0.this.n0 = -10;
                }
            } else {
                m0.this.n0 = 0;
            }
            m0.this.m0 = System.currentTimeMillis();
            return true;
        }
    }

    class b implements Preference.e {
        b() {
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            if (m0.this.f0() == null || m0.this.s0() == null) {
                return false;
            }
            m0.this.F2(new Intent(m0.this.f0(), (Class<?>) OssLicenseActivity.class));
            return true;
        }
    }

    class c implements Preference.e {
        c() {
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            if (m0.this.f0() == null || m0.this.s0() == null) {
                return false;
            }
            try {
                C1832u.p0(m0.this, C3180B.C("https://www.voxdon.com/vox-xplorer-privacy-policy"));
            } catch (ActivityNotFoundException | SecurityException unused) {
                Toast.makeText(m0.this.f0(), R.string.error, 1).show();
            }
            return true;
        }
    }

    static /* synthetic */ int h3(m0 m0Var) {
        int i = m0Var.n0;
        m0Var.n0 = i + 1;
        return i;
    }

    private String j3() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("----Device----\n");
        stringBuffer.append("BRAND : " + Build.BRAND + "\n");
        stringBuffer.append("MODEL : " + Build.MODEL + "\n");
        stringBuffer.append("DEVICE : " + Build.DEVICE + "\n");
        stringBuffer.append("VERSION : " + Build.VERSION.SDK_INT + "\n");
        stringBuffer.append("APP VERSION : 2.8.2\n");
        stringBuffer.append("\n----MainStorage----\n");
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        k3(stringBuffer, externalStorageDirectory);
        stringBuffer.append("Total Space : " + externalStorageDirectory.getTotalSpace());
        stringBuffer.append("\n----Storages----\n");
        k3(stringBuffer, new File("/storage/emulated/0"));
        File[] listFiles = new File("/storage").listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file != null) {
                    k3(stringBuffer, file);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            stringBuffer.append("\n----Storage Volumes----\n");
            StorageManager storageManager = (StorageManager) b().getSystemService("storage");
            for (ax.X2.N n : C1155a.b(storageManager)) {
                stringBuffer.append("VOLUME STRING:" + n.toString() + "\n");
                stringBuffer.append("VOLUME DESC:" + n.a(b()) + "\n");
                stringBuffer.append("VOLUME STATE:" + n.i() + "\n");
                stringBuffer.append("VOLUME ID:" + n.n() + "\n");
                stringBuffer.append("DISK FLAGS:" + n.e(storageManager) + "\n");
                stringBuffer.append("VOLUME PATH:" + n.g() + "\n");
                if (!TextUtils.isEmpty(n.g())) {
                    l3(stringBuffer, new File(n.g()));
                }
                stringBuffer.append("VOLUME INFO: primary=" + n.p() + ",removable=" + n.r() + ",uuid=" + n.l() + "\n\n");
            }
        }
        stringBuffer.append("\n----ExternalFilesDirs----\n");
        File[] externalFilesDirs = b().getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (File file2 : externalFilesDirs) {
                if (file2 == null) {
                    stringBuffer.append("null\n");
                } else {
                    k3(stringBuffer, file2);
                }
            }
        }
        stringBuffer.append("\n----Environment----\n");
        stringBuffer.append("SECONDARY_STORAGE:" + System.getenv("SECONDARY_STORAGE") + "\n");
        stringBuffer.append("\n----Mounts----\n");
        try {
            Scanner scanner = new Scanner(new File("/proc/mounts"));
            while (scanner.hasNext()) {
                stringBuffer.append(HttpUrl.FRAGMENT_ENCODE_SET + scanner.nextLine() + "\n");
            }
            scanner.close();
        } catch (IOException e) {
            stringBuffer.append(HttpUrl.FRAGMENT_ENCODE_SET + e.getMessage() + "\n");
        }
        stringBuffer.append("\n----vold.fstab----\n");
        try {
            Scanner scanner2 = new Scanner(new File("/system/etc/vold.fstab"));
            while (scanner2.hasNext()) {
                stringBuffer.append(HttpUrl.FRAGMENT_ENCODE_SET + scanner2.nextLine() + "\n");
            }
            scanner2.close();
        } catch (IOException e2) {
            stringBuffer.append(HttpUrl.FRAGMENT_ENCODE_SET + e2.getMessage() + "\n");
        }
        return stringBuffer.toString();
    }

    private void k3(StringBuffer stringBuffer, File file) {
        String absolutePath = file.getAbsolutePath();
        stringBuffer.append(absolutePath + "\n");
        try {
            stringBuffer.append("EXIST : " + file.exists() + "\n");
            stringBuffer.append("DIR : " + file.isDirectory() + "\n");
            stringBuffer.append("WRITABLE : " + file.canWrite() + "\n");
            stringBuffer.append("READABLE : " + file.canRead() + "\n");
            stringBuffer.append("MODIFIED : " + file.lastModified() + "\n");
            stringBuffer.append("REMOVABLE : " + Environment.isExternalStorageRemovable(file) + "\n");
            stringBuffer.append("STATE : " + Environment.getExternalStorageState(file) + "\n");
            int indexOf = absolutePath.indexOf("/Android");
            if (indexOf != -1) {
                stringBuffer.append("ROOT STATE : " + Environment.getExternalStorageState(new File(absolutePath.substring(0, indexOf))) + "\n");
            }
        } catch (Exception e) {
            stringBuffer.append("EXCEPTION : " + e.getMessage() + "\n");
        }
        stringBuffer.append("\n");
    }

    private void l3(StringBuffer stringBuffer, File file) {
        stringBuffer.append(file.getAbsolutePath() + "\n");
        try {
            stringBuffer.append("EXIST : " + file.exists() + "\n");
            stringBuffer.append("DIR : " + file.isDirectory() + "\n");
            stringBuffer.append("WRITABLE : " + file.canWrite() + "\n");
            stringBuffer.append("READABLE : " + file.canRead() + "\n");
            stringBuffer.append("MODIFIED : " + file.lastModified() + "\n");
        } catch (Exception e) {
            stringBuffer.append("EXCEPTION : " + e.getMessage() + "\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3() {
        if (f0() == null) {
            return;
        }
        String j3 = j3();
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"vox.xplorer@gmail.com"});
        intent.putExtra("android.intent.extra.SUBJECT", "STORAGE INFORMATION");
        try {
            intent.putExtra("android.intent.extra.TEXT", j3);
            try {
                if (!C3180B.K(f0(), intent) || ax.X2.J.q()) {
                    ax.c3.F.m(new File("/storage/emulated/0/sdcardinfo.txt"), j3);
                }
                try {
                    C1832u.p0(this, Intent.createChooser(intent, "Send email..."));
                } catch (ActivityNotFoundException unused) {
                    ax.c3.F.m(new File("/storage/emulated/0/sdcardinfo.txt"), j3);
                    Toast.makeText(f0(), R.string.error, 1).show();
                }
            } catch (RuntimeException unused2) {
                Toast.makeText(f0(), R.string.error, 1).show();
            }
        } catch (RuntimeException unused3) {
            Toast.makeText(f0(), R.string.error, 1).show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void D1() {
        P2().L().unregisterOnSharedPreferenceChangeListener(this);
        super.D1();
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        P2().L().registerOnSharedPreferenceChangeListener(this);
        if (((ActivityC2561c) f0()).getSupportActionBar() != null) {
            ((ActivityC2561c) f0()).getSupportActionBar().G(R.string.about_preference);
        }
    }

    @Override // androidx.preference.d
    public void T2(Bundle bundle, String str) {
        String str2;
        b3(R.xml.settings_about, str);
        Preference n = n("app_version");
        try {
            str2 = f0().getPackageManager().getPackageInfo(f0().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        n.M0(N0(R.string.version_number, str2));
        n.H0(new a());
        Preference n2 = n("gdpr_consent");
        f0();
        n2.N0(false);
        Preference n3 = n("usage_diagnostics");
        if (ax.t3.c.n().x()) {
            n3.N0(true);
        } else {
            n3.N0(false);
        }
        n("open_source_licenses").H0(new b());
        n("privacy_policy").H0(new c());
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    @Override // ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        RecyclerView N2 = N2();
        if (z || N2 == null) {
            return;
        }
        N2.setPadding(0, 0, 0, bVar.d);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("usage_diagnostics".equals(str)) {
            boolean n = ax.t3.j.n(b());
            ax.Q2.a.i().f(n);
            ax.Ha.c.k(n);
        }
    }
}
