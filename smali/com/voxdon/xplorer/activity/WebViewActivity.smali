.class public Lcom/voxdon/xplorer/activity/WebViewActivity;
.super Lax/R2/c;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/activity/WebViewActivity$c;,
        Lcom/voxdon/xplorer/activity/WebViewActivity$b;
    }
.end annotation


# instance fields
.field private mDropboxKey:Ljava/lang/String;

.field private mProgress:Landroid/widget/ProgressBar;

.field private mUri:Landroid/net/Uri;

.field private mWebView:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/R2/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic access$200(Lcom/voxdon/xplorer/activity/WebViewActivity;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mDropboxKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic access$300(Lcom/voxdon/xplorer/activity/WebViewActivity;)Landroid/webkit/WebView;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic access$400(Lcom/voxdon/xplorer/activity/WebViewActivity;)Landroid/widget/ProgressBar;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mProgress:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private setUpWebView()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    .line 13
    .line 14
    new-instance v2, Lcom/voxdon/xplorer/activity/WebViewActivity$c;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, p0, v3}, Lcom/voxdon/xplorer/activity/WebViewActivity$c;-><init>(Lcom/voxdon/xplorer/activity/WebViewActivity;Lcom/voxdon/xplorer/activity/WebViewActivity$a;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    .line 24
    .line 25
    new-instance v2, Lcom/voxdon/xplorer/activity/WebViewActivity$b;

    .line 26
    .line 27
    invoke-direct {v2, p0, v3}, Lcom/voxdon/xplorer/activity/WebViewActivity$b;-><init>(Lcom/voxdon/xplorer/activity/WebViewActivity;Lcom/voxdon/xplorer/activity/WebViewActivity$a;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 41
    .line 42
    .line 43
    :try_start_2a
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    .line 44
    .line 45
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mUri:Landroid/net/Uri;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_35
    .catch Ljava/lang/SecurityException; {:try_start_2a .. :try_end_35} :catch_35

    .line 52
    .line 53
    .line 54
    :catch_35
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mProgress:Landroid/widget/ProgressBar;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 75
    .line 76
    .line 77
    return-void
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method


# virtual methods
.method public isContentClipToPadding(Z)Z
    .registers 2

    const/4 p1, 0x1

    return p1
.end method

.method public onApplyWindowsInsets(Lax/T/b;Z)V
    .registers 3

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 4

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const p1, 0x7f0d0029

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lax/n/c;->setContentView(I)V

    .line 8
    .line 9
    .line 10
    const p1, 0x7f13021c

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(I)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-virtual {p0, p1}, Lax/R2/c;->onSetContentView(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_23

    .line 25
    .line 26
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const v0, 0x7f080187

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lax/n/a;->B(I)V

    .line 34
    .line 35
    .line 36
    :cond_23
    const p1, 0x7f0a04e7

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Landroid/webkit/WebView;

    .line 44
    .line 45
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    .line 46
    .line 47
    const p1, 0x7f0a039a

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Landroid/widget/ProgressBar;

    .line 55
    .line 56
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mProgress:Landroid/widget/ProgressBar;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-string v1, "android.intent.action.VIEW"

    .line 75
    .line 76
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_68

    .line 81
    .line 82
    if-nez v0, :cond_54

    .line 83
    .line 84
    goto :goto_68

    .line 85
    :cond_54
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mUri:Landroid/net/Uri;

    .line 86
    .line 87
    const p1, 0x7f13012f

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mDropboxKey:Ljava/lang/String;

    .line 95
    .line 96
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/WebViewActivity;->setUpWebView()V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_68
    :goto_68
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 106
    .line 107
    .line 108
    return-void
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method
