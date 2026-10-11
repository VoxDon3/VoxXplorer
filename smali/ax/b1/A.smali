.class public final Lax/b1/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/b1/A$a;
    }
.end annotation


# direct methods
.method public static a(Lax/U0/g;Ljava/lang/String;[BLjava/util/Map;)[B
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/U0/g;",
            "Ljava/lang/String;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b1/T;
        }
    .end annotation

    .line 1
    new-instance v1, Lax/U0/y;

    .line 2
    .line 3
    invoke-direct {v1, p0}, Lax/U0/y;-><init>(Lax/U0/g;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lax/U0/k$b;

    .line 7
    .line 8
    invoke-direct {p0}, Lax/U0/k$b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lax/U0/k$b;->j(Ljava/lang/String;)Lax/U0/k$b;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0, p3}, Lax/U0/k$b;->e(Ljava/util/Map;)Lax/U0/k$b;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-virtual {p0, p1}, Lax/U0/k$b;->d(I)Lax/U0/k$b;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0, p2}, Lax/U0/k$b;->c([B)Lax/U0/k$b;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-virtual {p0, p1}, Lax/U0/k$b;->b(I)Lax/U0/k$b;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lax/U0/k$b;->a()Lax/U0/k;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const/4 p0, 0x0

    .line 38
    move-object p1, v3

    .line 39
    :goto_26
    :try_start_26
    new-instance p2, Lax/U0/i;

    .line 40
    .line 41
    invoke-direct {p2, v1, p1}, Lax/U0/i;-><init>(Lax/U0/g;Lax/U0/k;)V
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_2b} :catch_33

    .line 42
    .line 43
    .line 44
    :try_start_2b
    invoke-static {p2}, Lax/s7/b;->g(Ljava/io/InputStream;)[B

    .line 45
    .line 46
    .line 47
    move-result-object p0
    :try_end_2f
    .catch Lax/U0/u; {:try_start_2b .. :try_end_2f} :catch_3a
    .catchall {:try_start_2b .. :try_end_2f} :catchall_37

    .line 48
    :try_start_2f
    invoke-static {p2}, Lax/S0/d0;->n(Ljava/io/Closeable;)V
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_32} :catch_33

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :catch_33
    move-exception v0

    .line 53
    move-object p0, v0

    .line 54
    move-object v8, p0

    .line 55
    goto :goto_59

    .line 56
    :catchall_37
    move-exception v0

    .line 57
    move-object p0, v0

    .line 58
    goto :goto_55

    .line 59
    :catch_3a
    move-exception v0

    .line 60
    move-object p3, v0

    .line 61
    :try_start_3c
    invoke-static {p3, p0}, Lax/b1/A;->c(Lax/U0/u;I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_54

    .line 66
    .line 67
    add-int/lit8 p0, p0, 0x1

    .line 68
    .line 69
    invoke-virtual {p1}, Lax/U0/k;->a()Lax/U0/k$b;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1, v0}, Lax/U0/k$b;->j(Ljava/lang/String;)Lax/U0/k$b;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Lax/U0/k$b;->a()Lax/U0/k;

    .line 78
    .line 79
    .line 80
    move-result-object p1
    :try_end_50
    .catchall {:try_start_3c .. :try_end_50} :catchall_37

    .line 81
    :try_start_50
    invoke-static {p2}, Lax/S0/d0;->n(Ljava/io/Closeable;)V
    :try_end_53
    .catch Ljava/lang/Exception; {:try_start_50 .. :try_end_53} :catch_33

    .line 82
    .line 83
    .line 84
    goto :goto_26

    .line 85
    :cond_54
    :try_start_54
    throw p3
    :try_end_55
    .catchall {:try_start_54 .. :try_end_55} :catchall_37

    .line 86
    :goto_55
    :try_start_55
    invoke-static {p2}, Lax/S0/d0;->n(Ljava/io/Closeable;)V

    .line 87
    .line 88
    .line 89
    throw p0
    :try_end_59
    .catch Ljava/lang/Exception; {:try_start_55 .. :try_end_59} :catch_33

    .line 90
    :goto_59
    new-instance v2, Lax/b1/T;

    .line 91
    .line 92
    invoke-virtual {v1}, Lax/U0/y;->r()Landroid/net/Uri;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v1}, Lax/U0/y;->l()Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v1}, Lax/U0/y;->q()J

    .line 101
    .line 102
    .line 103
    move-result-wide v6

    .line 104
    invoke-direct/range {v2 .. v8}, Lax/b1/T;-><init>(Lax/U0/k;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    throw v2
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
.end method

.method public static b(Ljava/lang/Throwable;I)I
    .registers 5

    .line 1
    instance-of v0, p0, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 2
    .line 3
    if-eqz v0, :cond_13

    .line 4
    .line 5
    check-cast p0, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lax/S0/d0;->c0(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-static {p0}, Lax/S0/d0;->b0(I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v1, 0x17

    .line 23
    .line 24
    const/16 v2, 0x1776

    .line 25
    .line 26
    if-lt v0, v1, :cond_22

    .line 27
    .line 28
    invoke-static {p0}, Lax/b1/A$a;->a(Ljava/lang/Throwable;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_22

    .line 33
    .line 34
    return v2

    .line 35
    :cond_22
    instance-of v0, p0, Landroid/media/NotProvisionedException;

    .line 36
    .line 37
    const/16 v1, 0x1772

    .line 38
    .line 39
    if-nez v0, :cond_5f

    .line 40
    .line 41
    invoke-static {p0}, Lax/b1/A;->d(Ljava/lang/Throwable;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2f

    .line 46
    .line 47
    goto :goto_5f

    .line 48
    :cond_2f
    instance-of v0, p0, Landroid/media/DeniedByServerException;

    .line 49
    .line 50
    if-eqz v0, :cond_36

    .line 51
    .line 52
    const/16 p0, 0x1777

    .line 53
    .line 54
    return p0

    .line 55
    :cond_36
    instance-of v0, p0, Lax/b1/U;

    .line 56
    .line 57
    if-eqz v0, :cond_3d

    .line 58
    .line 59
    const/16 p0, 0x1771

    .line 60
    .line 61
    return p0

    .line 62
    :cond_3d
    instance-of v0, p0, Lax/b1/h$e;

    .line 63
    .line 64
    if-eqz v0, :cond_44

    .line 65
    .line 66
    const/16 p0, 0x1773

    .line 67
    .line 68
    return p0

    .line 69
    :cond_44
    instance-of p0, p0, Lax/b1/Q;

    .line 70
    .line 71
    if-eqz p0, :cond_4b

    .line 72
    .line 73
    const/16 p0, 0x1778

    .line 74
    .line 75
    return p0

    .line 76
    :cond_4b
    const/4 p0, 0x1

    .line 77
    if-ne p1, p0, :cond_4f

    .line 78
    .line 79
    return v2

    .line 80
    :cond_4f
    const/4 p0, 0x2

    .line 81
    if-ne p1, p0, :cond_55

    .line 82
    .line 83
    const/16 p0, 0x1774

    .line 84
    .line 85
    return p0

    .line 86
    :cond_55
    const/4 p0, 0x3

    .line 87
    if-ne p1, p0, :cond_59

    .line 88
    .line 89
    return v1

    .line 90
    :cond_59
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 91
    .line 92
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :cond_5f
    :goto_5f
    return v1
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
.end method

.method private static c(Lax/U0/u;I)Ljava/lang/String;
    .registers 5

    .line 1
    iget v0, p0, Lax/U0/u;->e0:I

    .line 2
    .line 3
    const/16 v1, 0x133

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_b

    .line 7
    .line 8
    const/16 v1, 0x134

    .line 9
    .line 10
    if-ne v0, v1, :cond_2a

    .line 11
    .line 12
    :cond_b
    const/4 v0, 0x5

    .line 13
    if-ge p1, v0, :cond_2a

    .line 14
    .line 15
    iget-object p0, p0, Lax/U0/u;->g0:Ljava/util/Map;

    .line 16
    .line 17
    if-eqz p0, :cond_2a

    .line 18
    .line 19
    const-string p1, "Location"

    .line 20
    .line 21
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/util/List;

    .line 26
    .line 27
    if-eqz p0, :cond_2a

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_2a

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/String;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2a
    return-object v2
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
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
.end method

.method public static d(Ljava/lang/Throwable;)Z
    .registers 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-ne v0, v1, :cond_1e

    .line 6
    .line 7
    instance-of v0, p0, Ljava/lang/NoSuchMethodError;

    .line 8
    .line 9
    if-eqz v0, :cond_1e

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1e

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "Landroid/media/NotProvisionedException;.<init>("

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1e

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1e
    const/4 p0, 0x0

    .line 32
    return p0
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

.method public static e(Ljava/lang/Throwable;)Z
    .registers 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-ne v0, v1, :cond_1e

    .line 6
    .line 7
    instance-of v0, p0, Ljava/lang/NoSuchMethodError;

    .line 8
    .line 9
    if-eqz v0, :cond_1e

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1e

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "Landroid/media/ResourceBusyException;.<init>("

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1e

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1e
    const/4 p0, 0x0

    .line 32
    return p0
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
