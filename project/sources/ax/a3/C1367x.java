package ax.a3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.a;
import ax.c3.d0;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;
import java.io.File;
import java.util.Arrays;

/* renamed from: ax.a3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1367x extends I {
    private String t0;
    private boolean u0;
    private int v0;
    private int w0;
    private String x0;
    private int y0;

    /* renamed from: ax.a3.x$a */
    class a extends AbstractDialogInterfaceOnClickListenerC1363t {
        a() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            ax.d3.E e = (ax.d3.E) C1367x.this.P0();
            if (C1367x.this.y0 == 2) {
                if (i == 0) {
                    e.n7(b.CHOOSE);
                }
            } else if (i == 0) {
                e.n7(b.HERE);
            } else if (i == 1) {
                e.n7(b.AUTO);
            } else {
                if (i != 2) {
                    return;
                }
                e.n7(b.CHOOSE);
            }
        }
    }

    /* renamed from: ax.a3.x$b */
    public enum b {
        HERE,
        AUTO,
        CHOOSE
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        this.x0 = j0().getString("fileName");
        this.u0 = j0().getBoolean("extractAll", true);
        this.v0 = j0().getInt("selectedItemSize", 0);
        this.w0 = j0().getInt("numArchiveFiles", 0);
        this.y0 = j0().getInt("showOption", 0);
        if (this.w0 > 1) {
            Resources G0 = G0();
            int i = this.w0;
            this.t0 = G0.getQuantityString(R.plurals.files, i, Integer.valueOf(i));
        } else {
            if (this.u0) {
                this.t0 = this.x0;
                return;
            }
            Resources G02 = G0();
            int i2 = this.v0;
            this.t0 = G02.getQuantityString(R.plurals.num_items_plurals, i2, Integer.valueOf(i2));
        }
    }

    @Override // ax.a3.I
    public Dialog g3() {
        a.C0006a a2 = C3190h.a(f0());
        String[] stringArray = G0().getStringArray(R.array.extract_menu);
        int i = this.y0;
        if (i == 1) {
            stringArray = (String[]) Arrays.copyOfRange(stringArray, 0, 2);
        } else if (i == 2) {
            stringArray = (String[]) Arrays.copyOfRange(stringArray, 2, 3);
        }
        int i2 = this.y0;
        if (i2 == 1 || i2 == 0) {
            stringArray[1] = N0(R.string.extract_to_file_name, (this.w0 <= 1 ? d0.d(this.x0) : "*") + File.separator);
        }
        a2.a(new ArrayAdapter(a2.getContext(), R.layout.select_dialog_item_material, stringArray), new a());
        return a2.setTitle(this.t0).create();
    }
}
