.class Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;
.super Lcom/box/androidsdk/content/requests/BoxRequest;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/box/androidsdk/content/models/BoxSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BoxSessionRefreshRequest"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/box/androidsdk/content/requests/BoxRequest<",
        "Lcom/box/androidsdk/content/models/BoxSession;",
        "Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x70be1f2741234d03L


# instance fields
.field private mSession:Lcom/box/androidsdk/content/models/BoxSession;


# direct methods
.method public constructor <init>(Lcom/box/androidsdk/content/models/BoxSession;)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, " "

    .line 3
    .line 4
    invoke-direct {p0, v0, v1, v0}, Lcom/box/androidsdk/content/requests/BoxRequest;-><init>(Ljava/lang/Class;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 8
    .line 9
    return-void
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


# virtual methods
.method public E()Lcom/box/androidsdk/content/models/BoxSession;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->o()Lcom/box/androidsdk/content/auth/BoxAuthentication;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->w(Lcom/box/androidsdk/content/models/BoxSession;)Ljava/util/concurrent/FutureTask;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_10} :catch_11

    .line 16
    .line 17
    goto :goto_3b

    .line 18
    :catch_11
    move-exception v0

    .line 19
    const-string v1, "Unable to repair user"

    .line 20
    .line 21
    const-string v2, "BoxSession"

    .line 22
    .line 23
    invoke-static {v2, v1, v0}, Lax/H3/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    instance-of v1, v1, Lcom/box/androidsdk/content/BoxException;

    .line 31
    .line 32
    if-eqz v1, :cond_28

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Exception;

    .line 39
    .line 40
    goto :goto_29

    .line 41
    :cond_28
    move-object v1, v0

    .line 42
    :goto_29
    instance-of v3, v1, Lcom/box/androidsdk/content/BoxException;

    .line 43
    .line 44
    if-eqz v3, :cond_b6

    .line 45
    .line 46
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 47
    .line 48
    invoke-static {v3}, Lcom/box/androidsdk/content/models/BoxSession;->i(Lcom/box/androidsdk/content/models/BoxSession;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/4 v4, 0x0

    .line 53
    if-eqz v3, :cond_59

    .line 54
    .line 55
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 56
    .line 57
    invoke-virtual {v0, v4, v1}, Lcom/box/androidsdk/content/models/BoxSession;->e(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Ljava/lang/Exception;)V

    .line 58
    .line 59
    .line 60
    :goto_3b
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 61
    .line 62
    iget-object v0, v0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 63
    .line 64
    invoke-static {}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->o()Lcom/box/androidsdk/content/auth/BoxAuthentication;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v2, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 69
    .line 70
    invoke-virtual {v2}, Lcom/box/androidsdk/content/models/BoxSession;->G()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 75
    .line 76
    invoke-virtual {v3}, Lcom/box/androidsdk/content/models/BoxSession;->q()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v1, v2, v3}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->l(Ljava/lang/String;Landroid/content/Context;)Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v0, v1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->E(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_59
    instance-of v3, v1, Lcom/box/androidsdk/content/BoxException$RefreshFailure;

    .line 91
    .line 92
    if-eqz v3, :cond_83

    .line 93
    .line 94
    move-object v3, v1

    .line 95
    check-cast v3, Lcom/box/androidsdk/content/BoxException$RefreshFailure;

    .line 96
    .line 97
    invoke-virtual {v3}, Lcom/box/androidsdk/content/BoxException$RefreshFailure;->g()Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-nez v3, :cond_67

    .line 102
    .line 103
    goto :goto_83

    .line 104
    :cond_67
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxSession;->q()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    sget v2, Lax/I3/d;->o:I

    .line 111
    .line 112
    invoke-static {v0, v2}, Lcom/box/androidsdk/content/models/BoxSession;->k(Landroid/content/Context;I)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxSession;->U()V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxSession;->r()Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v0, v2, v1}, Lcom/box/androidsdk/content/models/BoxSession;->e(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Ljava/lang/Exception;)V

    .line 127
    .line 128
    .line 129
    check-cast v1, Lcom/box/androidsdk/content/BoxException;

    .line 130
    .line 131
    throw v1

    .line 132
    :cond_83
    :goto_83
    check-cast v0, Lcom/box/androidsdk/content/BoxException;

    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/box/androidsdk/content/BoxException;->c()Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sget-object v3, Lcom/box/androidsdk/content/BoxException$ErrorType;->i0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 139
    .line 140
    if-ne v0, v3, :cond_ae

    .line 141
    .line 142
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxSession;->q()Landroid/content/Context;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    sget v3, Lax/I3/d;->q:I

    .line 149
    .line 150
    invoke-static {v0, v3}, Lcom/box/androidsdk/content/models/BoxSession;->k(Landroid/content/Context;I)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 154
    .line 155
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxSession;->U()V

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 159
    .line 160
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxSession;->r()Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v0, v3, v1}, Lcom/box/androidsdk/content/models/BoxSession;->e(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Ljava/lang/Exception;)V

    .line 165
    .line 166
    .line 167
    const-string v0, "TOS refresh exception "

    .line 168
    .line 169
    invoke-static {v2, v0, v1}, Lax/H3/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    check-cast v1, Lcom/box/androidsdk/content/BoxException;

    .line 173
    .line 174
    throw v1

    .line 175
    :cond_ae
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 176
    .line 177
    invoke-virtual {v0, v4, v1}, Lcom/box/androidsdk/content/models/BoxSession;->e(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Ljava/lang/Exception;)V

    .line 178
    .line 179
    .line 180
    check-cast v1, Lcom/box/androidsdk/content/BoxException;

    .line 181
    .line 182
    throw v1

    .line 183
    :cond_b6
    new-instance v0, Lcom/box/androidsdk/content/BoxException;

    .line 184
    .line 185
    const-string v2, "BoxSessionRefreshRequest failed"

    .line 186
    .line 187
    invoke-direct {v0, v2, v1}, Lcom/box/androidsdk/content/BoxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    throw v0
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

.method public bridge synthetic t()Lcom/box/androidsdk/content/models/BoxObject;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;->E()Lcom/box/androidsdk/content/models/BoxSession;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
