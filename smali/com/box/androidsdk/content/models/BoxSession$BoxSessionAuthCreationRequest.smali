.class Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;
.super Lcom/box/androidsdk/content/requests/BoxRequest;
.source "SourceFile"

# interfaces
.implements Lcom/box/androidsdk/content/auth/BoxAuthentication$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/box/androidsdk/content/models/BoxSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BoxSessionAuthCreationRequest"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/box/androidsdk/content/requests/BoxRequest<",
        "Lcom/box/androidsdk/content/models/BoxSession;",
        "Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;",
        ">;",
        "Lcom/box/androidsdk/content/auth/BoxAuthentication$e;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x70be1f2741234cd9L


# instance fields
.field private mIsWaitingForLoginUi:Z

.field private final mSession:Lcom/box/androidsdk/content/models/BoxSession;


# direct methods
.method public constructor <init>(Lcom/box/androidsdk/content/models/BoxSession;Z)V
    .registers 4

    .line 1
    const/4 p2, 0x0

    .line 2
    const-string v0, " "

    .line 3
    .line 4
    invoke-direct {p0, p2, v0, p2}, Lcom/box/androidsdk/content/requests/BoxRequest;-><init>(Ljava/lang/Class;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

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

.method static synthetic E(Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;)Lcom/box/androidsdk/content/models/BoxSession;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

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

.method static synthetic F(Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mIsWaitingForLoginUi:Z

    .line 2
    .line 3
    return p0
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

.method private G()V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_4
    iput-boolean v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mIsWaitingForLoginUi:Z

    .line 6
    .line 7
    new-instance v1, Landroid/os/Handler;

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest$a;

    .line 17
    .line 18
    invoke-direct {v2, p0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest$a;-><init>(Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_17
    .catchall {:try_start_4 .. :try_end_17} :catchall_21

    .line 22
    .line 23
    .line 24
    :goto_17
    :try_start_17
    iget-boolean v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mIsWaitingForLoginUi:Z

    .line 25
    .line 26
    if-eqz v1, :cond_30

    .line 27
    .line 28
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_20
    .catch Ljava/lang/InterruptedException; {:try_start_17 .. :try_end_20} :catch_23
    .catchall {:try_start_17 .. :try_end_20} :catchall_21

    .line 31
    .line 32
    .line 33
    goto :goto_17

    .line 34
    :catchall_21
    move-exception v1

    .line 35
    goto :goto_32

    .line 36
    :catch_23
    :try_start_23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "could not launch auth UI"

    .line 45
    .line 46
    invoke-static {v1, v2}, Lax/H3/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_30
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :goto_32
    monitor-exit v0
    :try_end_33
    .catchall {:try_start_23 .. :try_end_33} :catchall_21

    .line 52
    throw v1
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private H()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_4
    iput-boolean v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mIsWaitingForLoginUi:Z

    .line 6
    .line 7
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 10
    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_d
    move-exception v1

    .line 15
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_4 .. :try_end_f} :catchall_d

    .line 16
    throw v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public D()Lax/E3/h;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/E3/h<",
            "Lcom/box/androidsdk/content/models/BoxSession;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest$b;

    .line 2
    .line 3
    const-class v1, Lcom/box/androidsdk/content/models/BoxSession;

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest$b;-><init>(Ljava/lang/Class;Lcom/box/androidsdk/content/requests/BoxRequest;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method public I()Lcom/box/androidsdk/content/models/BoxSession;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxSession;->D()Lcom/box/androidsdk/content/models/BoxUser;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_ba

    .line 12
    .line 13
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxSession;->r()Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_ac

    .line 20
    .line 21
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxSession;->r()Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->C()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Lcom/box/androidsdk/content/utils/SdkUtils;->k(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_ac

    .line 36
    .line 37
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxSession;->D()Lcom/box/androidsdk/content/models/BoxUser;

    .line 40
    .line 41
    .line 42
    move-result-object v1
    :try_end_2a
    .catchall {:try_start_3 .. :try_end_2a} :catchall_6e

    .line 43
    if-nez v1, :cond_ac

    .line 44
    .line 45
    :try_start_2c
    new-instance v1, Lax/E3/e;

    .line 46
    .line 47
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 48
    .line 49
    invoke-direct {v1, v3}, Lax/E3/e;-><init>(Lcom/box/androidsdk/content/models/BoxSession;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lax/E3/e;->d()Lcom/box/androidsdk/content/requests/BoxRequestsUser$GetUserInfo;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sget-object v3, Lcom/box/androidsdk/content/auth/BoxAuthentication;->h:[Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Lcom/box/androidsdk/content/requests/BoxRequestItem;->E([Ljava/lang/String;)Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lcom/box/androidsdk/content/requests/BoxRequestsUser$GetUserInfo;

    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/box/androidsdk/content/requests/BoxRequest;->x()Lcom/box/androidsdk/content/models/BoxObject;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Lcom/box/androidsdk/content/models/BoxUser;

    .line 69
    .line 70
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxEntity;->G()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v3, v4}, Lcom/box/androidsdk/content/models/BoxSession;->S(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 80
    .line 81
    invoke-virtual {v3}, Lcom/box/androidsdk/content/models/BoxSession;->r()Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3, v1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->T(Lcom/box/androidsdk/content/models/BoxUser;)V

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->o()Lcom/box/androidsdk/content/auth/BoxAuthentication;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 93
    .line 94
    invoke-virtual {v3}, Lcom/box/androidsdk/content/models/BoxSession;->r()Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    iget-object v4, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 99
    .line 100
    invoke-virtual {v4}, Lcom/box/androidsdk/content/models/BoxSession;->q()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v1, v3, v4}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->u(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;
    :try_end_6c
    .catch Lcom/box/androidsdk/content/BoxException; {:try_start_2c .. :try_end_6c} :catch_71
    .catchall {:try_start_2c .. :try_end_6c} :catchall_6e

    .line 108
    .line 109
    :try_start_6c
    monitor-exit v0

    .line 110
    return-object v1

    .line 111
    :catchall_6e
    move-exception v1

    .line 112
    goto/16 :goto_1a1

    .line 113
    .line 114
    :catch_71
    move-exception v1

    .line 115
    const-string v3, "BoxSession"

    .line 116
    .line 117
    const-string v4, "Unable to repair user"

    .line 118
    .line 119
    invoke-static {v3, v4, v1}, Lax/H3/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    instance-of v3, v1, Lcom/box/androidsdk/content/BoxException$RefreshFailure;

    .line 123
    .line 124
    if-eqz v3, :cond_92

    .line 125
    .line 126
    move-object v3, v1

    .line 127
    check-cast v3, Lcom/box/androidsdk/content/BoxException$RefreshFailure;

    .line 128
    .line 129
    invoke-virtual {v3}, Lcom/box/androidsdk/content/BoxException$RefreshFailure;->g()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_92

    .line 134
    .line 135
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 136
    .line 137
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxSession;->q()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    sget v2, Lax/I3/d;->o:I

    .line 142
    .line 143
    invoke-static {v1, v2}, Lcom/box/androidsdk/content/models/BoxSession;->k(Landroid/content/Context;I)V

    .line 144
    .line 145
    .line 146
    goto :goto_ac

    .line 147
    :cond_92
    invoke-virtual {v1}, Lcom/box/androidsdk/content/BoxException;->c()Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    sget-object v4, Lcom/box/androidsdk/content/BoxException$ErrorType;->i0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 152
    .line 153
    if-ne v3, v4, :cond_a6

    .line 154
    .line 155
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 156
    .line 157
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxSession;->q()Landroid/content/Context;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    sget v2, Lax/I3/d;->q:I

    .line 162
    .line 163
    invoke-static {v1, v2}, Lcom/box/androidsdk/content/models/BoxSession;->k(Landroid/content/Context;I)V

    .line 164
    .line 165
    .line 166
    goto :goto_ac

    .line 167
    :cond_a6
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 168
    .line 169
    invoke-virtual {v3, v2, v1}, Lcom/box/androidsdk/content/models/BoxSession;->e(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Ljava/lang/Exception;)V

    .line 170
    .line 171
    .line 172
    throw v1

    .line 173
    :cond_ac
    :goto_ac
    invoke-static {}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->o()Lcom/box/androidsdk/content/auth/BoxAuthentication;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1, p0}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->g(Lcom/box/androidsdk/content/auth/BoxAuthentication$e;)V

    .line 178
    .line 179
    .line 180
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->G()V

    .line 181
    .line 182
    .line 183
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 184
    .line 185
    monitor-exit v0

    .line 186
    return-object v1

    .line 187
    :cond_ba
    invoke-static {}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->o()Lcom/box/androidsdk/content/auth/BoxAuthentication;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 192
    .line 193
    invoke-virtual {v3}, Lcom/box/androidsdk/content/models/BoxSession;->G()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    iget-object v4, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 198
    .line 199
    invoke-virtual {v4}, Lcom/box/androidsdk/content/models/BoxSession;->q()Landroid/content/Context;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v1, v3, v4}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->l(Ljava/lang/String;Landroid/content/Context;)Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    if-eqz v1, :cond_193

    .line 208
    .line 209
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 210
    .line 211
    iget-object v3, v3, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 212
    .line 213
    invoke-static {v3, v1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->E(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V

    .line 214
    .line 215
    .line 216
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 217
    .line 218
    invoke-virtual {v3}, Lcom/box/androidsdk/content/models/BoxSession;->r()Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v3}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->C()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-static {v3}, Lcom/box/androidsdk/content/utils/SdkUtils;->k(Ljava/lang/String;)Z

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-eqz v3, :cond_103

    .line 231
    .line 232
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 233
    .line 234
    invoke-virtual {v3}, Lcom/box/androidsdk/content/models/BoxSession;->r()Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v3}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->M()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-static {v3}, Lcom/box/androidsdk/content/utils/SdkUtils;->k(Ljava/lang/String;)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-eqz v3, :cond_103

    .line 247
    .line 248
    invoke-static {}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->o()Lcom/box/androidsdk/content/auth/BoxAuthentication;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {v1, p0}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->g(Lcom/box/androidsdk/content/auth/BoxAuthentication$e;)V

    .line 253
    .line 254
    .line 255
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->G()V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_19d

    .line 259
    .line 260
    :cond_103
    invoke-virtual {v1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->K()Lcom/box/androidsdk/content/models/BoxUser;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    if-eqz v3, :cond_117

    .line 265
    .line 266
    invoke-virtual {v1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->K()Lcom/box/androidsdk/content/models/BoxUser;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxEntity;->G()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-static {v1}, Lcom/box/androidsdk/content/utils/SdkUtils;->k(Ljava/lang/String;)Z

    .line 275
    .line 276
    .line 277
    move-result v1
    :try_end_115
    .catchall {:try_start_6c .. :try_end_115} :catchall_6e

    .line 278
    if-eqz v1, :cond_183

    .line 279
    .line 280
    :cond_117
    :try_start_117
    new-instance v1, Lax/E3/e;

    .line 281
    .line 282
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 283
    .line 284
    invoke-direct {v1, v3}, Lax/E3/e;-><init>(Lcom/box/androidsdk/content/models/BoxSession;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1}, Lax/E3/e;->d()Lcom/box/androidsdk/content/requests/BoxRequestsUser$GetUserInfo;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    sget-object v3, Lcom/box/androidsdk/content/auth/BoxAuthentication;->h:[Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {v1, v3}, Lcom/box/androidsdk/content/requests/BoxRequestItem;->E([Ljava/lang/String;)Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    check-cast v1, Lcom/box/androidsdk/content/requests/BoxRequestsUser$GetUserInfo;

    .line 298
    .line 299
    invoke-virtual {v1}, Lcom/box/androidsdk/content/requests/BoxRequest;->x()Lcom/box/androidsdk/content/models/BoxObject;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, Lcom/box/androidsdk/content/models/BoxUser;

    .line 304
    .line 305
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 306
    .line 307
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxEntity;->G()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-virtual {v3, v4}, Lcom/box/androidsdk/content/models/BoxSession;->S(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 315
    .line 316
    invoke-virtual {v3}, Lcom/box/androidsdk/content/models/BoxSession;->r()Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-virtual {v3, v1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->T(Lcom/box/androidsdk/content/models/BoxUser;)V

    .line 321
    .line 322
    .line 323
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 324
    .line 325
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxSession;->r()Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-virtual {v1, v3}, Lcom/box/androidsdk/content/models/BoxSession;->h(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V

    .line 330
    .line 331
    .line 332
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;
    :try_end_14d
    .catch Lcom/box/androidsdk/content/BoxException; {:try_start_117 .. :try_end_14d} :catch_14f
    .catchall {:try_start_117 .. :try_end_14d} :catchall_6e

    .line 333
    .line 334
    :try_start_14d
    monitor-exit v0

    .line 335
    return-object v1

    .line 336
    :catch_14f
    move-exception v1

    .line 337
    const-string v3, "BoxSession"

    .line 338
    .line 339
    const-string v4, "Unable to repair user"

    .line 340
    .line 341
    invoke-static {v3, v4, v1}, Lax/H3/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 342
    .line 343
    .line 344
    instance-of v3, v1, Lcom/box/androidsdk/content/BoxException$RefreshFailure;

    .line 345
    .line 346
    if-eqz v3, :cond_170

    .line 347
    .line 348
    move-object v3, v1

    .line 349
    check-cast v3, Lcom/box/androidsdk/content/BoxException$RefreshFailure;

    .line 350
    .line 351
    invoke-virtual {v3}, Lcom/box/androidsdk/content/BoxException$RefreshFailure;->g()Z

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    if-eqz v3, :cond_170

    .line 356
    .line 357
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 358
    .line 359
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxSession;->q()Landroid/content/Context;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    sget v2, Lax/I3/d;->o:I

    .line 364
    .line 365
    invoke-static {v1, v2}, Lcom/box/androidsdk/content/models/BoxSession;->k(Landroid/content/Context;I)V

    .line 366
    .line 367
    .line 368
    goto :goto_183

    .line 369
    :cond_170
    invoke-virtual {v1}, Lcom/box/androidsdk/content/BoxException;->c()Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    sget-object v4, Lcom/box/androidsdk/content/BoxException$ErrorType;->i0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 374
    .line 375
    if-ne v3, v4, :cond_18d

    .line 376
    .line 377
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 378
    .line 379
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxSession;->q()Landroid/content/Context;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    sget v2, Lax/I3/d;->q:I

    .line 384
    .line 385
    invoke-static {v1, v2}, Lcom/box/androidsdk/content/models/BoxSession;->k(Landroid/content/Context;I)V

    .line 386
    .line 387
    .line 388
    :cond_183
    :goto_183
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 389
    .line 390
    invoke-virtual {v1}, Lcom/box/androidsdk/content/models/BoxSession;->r()Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    invoke-virtual {v1, v2}, Lcom/box/androidsdk/content/models/BoxSession;->h(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V

    .line 395
    .line 396
    .line 397
    goto :goto_19d

    .line 398
    :cond_18d
    iget-object v3, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 399
    .line 400
    invoke-virtual {v3, v2, v1}, Lcom/box/androidsdk/content/models/BoxSession;->e(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Ljava/lang/Exception;)V

    .line 401
    .line 402
    .line 403
    throw v1

    .line 404
    :cond_193
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 405
    .line 406
    iget-object v1, v1, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 407
    .line 408
    invoke-virtual {v1, v2}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->T(Lcom/box/androidsdk/content/models/BoxUser;)V

    .line 409
    .line 410
    .line 411
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->G()V

    .line 412
    .line 413
    .line 414
    :goto_19d
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 415
    .line 416
    monitor-exit v0

    .line 417
    return-object v1

    .line 418
    :goto_1a1
    monitor-exit v0
    :try_end_1a2
    .catchall {:try_start_14d .. :try_end_1a2} :catchall_6e

    .line 419
    throw v1
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method public e(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Ljava/lang/Exception;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->H()V

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

.method public equals(Ljava/lang/Object;)Z
    .registers 4

    .line 1
    instance-of v0, p1, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;

    .line 2
    .line 3
    if-eqz v0, :cond_17

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_12

    .line 17
    .line 18
    goto :goto_17

    .line 19
    :cond_12
    invoke-super {p0, p1}, Lcom/box/androidsdk/content/requests/BoxRequest;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_17
    :goto_17
    const/4 p1, 0x0

    .line 25
    return p1
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
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public g(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V
    .registers 2

    .line 1
    return-void
.end method

.method public h(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->H()V

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
    .line 22
.end method

.method public hashCode()I
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->mSession:Lcom/box/androidsdk/content/models/BoxSession;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-super {p0}, Lcom/box/androidsdk/content/requests/BoxRequest;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v0, v1

    .line 12
    return v0
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

.method public bridge synthetic t()Lcom/box/androidsdk/content/models/BoxObject;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->I()Lcom/box/androidsdk/content/models/BoxSession;

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
