/*
 * Decompiled with CFR 0.152.
 */
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
import com.box.androidsdk.content.models.BoxCollaborator;
import com.box.androidsdk.content.models.BoxUser;
import com.box.androidsdk.content.utils.SdkUtils;
import com.box.androidsdk.content.views.BoxAvatarView;
import com.box.androidsdk.content.views.OfflineAvatarController;
import java.util.List;

public class AuthenticatedAccountsAdapter
extends ArrayAdapter<BoxAuthentication.BoxAuthenticationInfo> {
    private OfflineAvatarController a;

    public AuthenticatedAccountsAdapter(Context context, int n8, List<BoxAuthentication.BoxAuthenticationInfo> list) {
        super(context, n8, list);
        this.a = new OfflineAvatarController(context);
    }

    public BoxAuthentication.BoxAuthenticationInfo a(int n8) {
        if (n8 == this.getCount() - 1) {
            return new DifferentAuthenticationInfo();
        }
        return (BoxAuthentication.BoxAuthenticationInfo)super.getItem(n8);
    }

    public int getCount() {
        return super.getCount() + 1;
    }

    public int getItemViewType(int n8) {
        if (n8 == this.getCount() - 1) {
            return 1;
        }
        return super.getItemViewType(n8);
    }

    public View getView(int n8, View object, ViewGroup object2) {
        BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo;
        if (this.getItemViewType(n8) == 1) {
            return LayoutInflater.from((Context)this.getContext()).inflate(c.g, (ViewGroup)object2, false);
        }
        View view = LayoutInflater.from((Context)this.getContext()).inflate(c.f, (ViewGroup)object2, false);
        object2 = (a)view.getTag();
        object = object2;
        if (object2 == null) {
            object = new a();
            object.a = (TextView)view.findViewById(b.c);
            object.b = (TextView)view.findViewById(b.a);
            object.c = (BoxAvatarView)view.findViewById(b.b);
            view.setTag(object);
        }
        if ((boxAuthenticationInfo = this.a(n8)) != null && boxAuthenticationInfo.K() != null) {
            boolean bl = SdkUtils.l(boxAuthenticationInfo.K().I());
            object2 = boxAuthenticationInfo.K();
            object2 = !bl ? ((BoxCollaborator)object2).I() : ((BoxUser)object2).J();
            object.a.setText((CharSequence)object2);
            if (!bl) {
                object.b.setText((CharSequence)boxAuthenticationInfo.K().J());
            }
            object.c.a(boxAuthenticationInfo.K(), this.a);
            return view;
        }
        if (boxAuthenticationInfo != null) {
            ax.H3.b.a("invalid account info", boxAuthenticationInfo.A());
        }
        return view;
    }

    public int getViewTypeCount() {
        return 2;
    }

    public static class DifferentAuthenticationInfo
    extends BoxAuthentication.BoxAuthenticationInfo {
    }

    public static class a {
        public TextView a;
        public TextView b;
        public BoxAvatarView c;
    }
}

