package com.box.androidsdk.content.auth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ax.I3.b;
import ax.I3.c;
import com.box.androidsdk.content.auth.BoxAuthentication;
import com.box.androidsdk.content.models.BoxUser;
import com.box.androidsdk.content.utils.SdkUtils;
import com.box.androidsdk.content.views.BoxAvatarView;
import com.box.androidsdk.content.views.OfflineAvatarController;
import java.util.List;

/* loaded from: classes.dex */
public class AuthenticatedAccountsAdapter extends ArrayAdapter<BoxAuthentication.BoxAuthenticationInfo> {
    private OfflineAvatarController a;

    public static class DifferentAuthenticationInfo extends BoxAuthentication.BoxAuthenticationInfo {
    }

    public static class a {
        public TextView a;
        public TextView b;
        public BoxAvatarView c;
    }

    public AuthenticatedAccountsAdapter(Context context, int i, List<BoxAuthentication.BoxAuthenticationInfo> list) {
        super(context, i, list);
        this.a = new OfflineAvatarController(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public BoxAuthentication.BoxAuthenticationInfo getItem(int i) {
        return i == getCount() + (-1) ? new DifferentAuthenticationInfo() : (BoxAuthentication.BoxAuthenticationInfo) super.getItem(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return super.getCount() + 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (i == getCount() - 1) {
            return 1;
        }
        return super.getItemViewType(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (getItemViewType(i) == 1) {
            return LayoutInflater.from(getContext()).inflate(c.g, viewGroup, false);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(c.f, viewGroup, false);
        a aVar = (a) inflate.getTag();
        if (aVar == null) {
            aVar = new a();
            aVar.a = (TextView) inflate.findViewById(b.c);
            aVar.b = (TextView) inflate.findViewById(b.a);
            aVar.c = (BoxAvatarView) inflate.findViewById(b.b);
            inflate.setTag(aVar);
        }
        BoxAuthentication.BoxAuthenticationInfo item = getItem(i);
        if (item == null || item.K() == null) {
            if (item != null) {
                ax.H3.b.a("invalid account info", item.A());
            }
            return inflate;
        }
        boolean l = SdkUtils.l(item.K().I());
        BoxUser K = item.K();
        aVar.a.setText(!l ? K.I() : K.J());
        if (!l) {
            aVar.b.setText(item.K().J());
        }
        aVar.c.a(item.K(), this.a);
        return inflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
