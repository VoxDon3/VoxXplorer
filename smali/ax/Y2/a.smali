.class public Lax/Y2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lax/Y2/a;


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lax/Q2/f;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lax/Q2/f;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/Y2/a;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public static a()Lax/Y2/a;
    .registers 1

    .line 1
    sget-object v0, Lax/Y2/a;->c:Lax/Y2/a;

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    new-instance v0, Lax/Y2/a;

    .line 6
    .line 7
    invoke-direct {v0}, Lax/Y2/a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lax/Y2/a;->c:Lax/Y2/a;

    .line 11
    .line 12
    invoke-direct {v0}, Lax/Y2/a;->d()V

    .line 13
    .line 14
    .line 15
    :cond_e
    sget-object v0, Lax/Y2/a;->c:Lax/Y2/a;

    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private d()V
    .registers 4

    .line 1
    invoke-static {}, Lax/Q2/b;->h()Lax/Q2/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/Q2/b;->g()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0, v0}, Lax/Y2/a;->e(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 13
    .line 14
    sget-object v1, Lax/Q2/f;->Q0:Lax/Q2/f;

    .line 15
    .line 16
    const-string v2, "webdav.yandex.com"

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 22
    .line 23
    sget-object v1, Lax/Q2/f;->J0:Lax/Q2/f;

    .line 24
    .line 25
    const-string v2, "File Manager SFTPHelper Cipher"

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 31
    .line 32
    sget-object v1, Lax/Q2/f;->H0:Lax/Q2/f;

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 38
    .line 39
    sget-object v1, Lax/Q2/f;->I0:Lax/Q2/f;

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 45
    .line 46
    sget-object v1, Lax/Q2/f;->K0:Lax/Q2/f;

    .line 47
    .line 48
    const-string v2, "File Manager WebDAV Cipher"

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 54
    .line 55
    sget-object v1, Lax/Q2/f;->N0:Lax/Q2/f;

    .line 56
    .line 57
    const-string v2, "www.dropbox.com"

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 63
    .line 64
    sget-object v1, Lax/Q2/f;->P0:Lax/Q2/f;

    .line 65
    .line 66
    const-string v2, "onedrive.microsoft.com"

    .line 67
    .line 68
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 72
    .line 73
    sget-object v1, Lax/Q2/f;->T0:Lax/Q2/f;

    .line 74
    .line 75
    const-string v2, "www.nextcloud.com"

    .line 76
    .line 77
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 81
    .line 82
    sget-object v1, Lax/Q2/f;->R0:Lax/Q2/f;

    .line 83
    .line 84
    const-string v2, "www.pcloud.com"

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 90
    .line 91
    sget-object v1, Lax/Q2/f;->M0:Lax/Q2/f;

    .line 92
    .line 93
    sget-object v2, Lax/c3/g;->c:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    return-void
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

.method private e(Landroid/content/Context;)V
    .registers 6

    .line 1
    if-eqz p1, :cond_58

    .line 2
    .line 3
    const-string v0, "KeyManager"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lax/Y2/a;->a:Ljava/util/HashMap;

    .line 11
    .line 12
    sget-object v1, Lax/Q2/f;->Q0:Lax/Q2/f;

    .line 13
    .line 14
    const-string v2, "YANDEX"

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lax/Y2/a;->a:Ljava/util/HashMap;

    .line 25
    .line 26
    sget-object v1, Lax/Q2/f;->N0:Lax/Q2/f;

    .line 27
    .line 28
    const-string v2, "DROPBOX"

    .line 29
    .line 30
    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lax/Y2/a;->a:Ljava/util/HashMap;

    .line 38
    .line 39
    sget-object v1, Lax/Q2/f;->P0:Lax/Q2/f;

    .line 40
    .line 41
    const-string v2, "ONEDRIVE"

    .line 42
    .line 43
    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lax/Y2/a;->a:Ljava/util/HashMap;

    .line 51
    .line 52
    sget-object v1, Lax/Q2/f;->T0:Lax/Q2/f;

    .line 53
    .line 54
    const-string v2, "NEXTCLOUD"

    .line 55
    .line 56
    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lax/Y2/a;->a:Ljava/util/HashMap;

    .line 64
    .line 65
    sget-object v1, Lax/Q2/f;->R0:Lax/Q2/f;

    .line 66
    .line 67
    const-string v2, "PCLOUD"

    .line 68
    .line 69
    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lax/Y2/a;->a:Ljava/util/HashMap;

    .line 77
    .line 78
    sget-object v1, Lax/Q2/f;->M0:Lax/Q2/f;

    .line 79
    .line 80
    const-string v2, "CLOUD"

    .line 81
    .line 82
    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :cond_58
    return-void
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
.end method


# virtual methods
.method public b(Lax/Q2/f;)Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Y2/a;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_13

    .line 10
    .line 11
    iget-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/String;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_13
    return-object v0
    .line 21
    .line 22
.end method

.method public c(Lax/Q2/f;)Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Y2/a;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    return-object p1
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
