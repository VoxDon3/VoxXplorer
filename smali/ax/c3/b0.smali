.class public Lax/c3/b0;
.super Lax/c3/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/c3/b0$a;
    }
.end annotation


# instance fields
.field private a:Landroid/os/ParcelFileDescriptor;

.field private b:Z


# direct methods
.method public constructor <init>(Landroid/os/ParcelFileDescriptor;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/c3/f;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/c3/b0;->a:Landroid/os/ParcelFileDescriptor;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lax/c3/b0;->b:Z

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
.method public a()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public c(J)Ljava/io/InputStream;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lax/c3/b0;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    if-eqz v0, :cond_e

    .line 7
    .line 8
    iput-boolean v1, p0, Lax/c3/b0;->b:Z

    .line 9
    .line 10
    goto :goto_30

    .line 11
    :catch_a
    move-exception p1

    .line 12
    goto :goto_3f

    .line 13
    :catch_c
    move-exception p1

    .line 14
    goto :goto_48

    .line 15
    :cond_e
    iget-object v0, p0, Lax/c3/b0;->a:Landroid/os/ParcelFileDescriptor;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->canDetectErrors()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1b

    .line 22
    .line 23
    iget-object v0, p0, Lax/c3/b0;->a:Landroid/os/ParcelFileDescriptor;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->checkError()V

    .line 26
    .line 27
    .line 28
    :cond_1b
    invoke-static {}, Lax/X2/Q;->P1()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2b

    .line 33
    .line 34
    iget-object v0, p0, Lax/c3/b0;->a:Landroid/os/ParcelFileDescriptor;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0, v2, v3, v1}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    .line 41
    .line 42
    .line 43
    goto :goto_30

    .line 44
    :cond_2b
    iget-object v0, p0, Lax/c3/b0;->a:Landroid/os/ParcelFileDescriptor;

    .line 45
    .line 46
    invoke-static {v0, v2, v3}, Lax/X2/q;->a(Landroid/os/ParcelFileDescriptor;J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    :goto_30
    new-instance v0, Lax/c3/b0$a;

    .line 50
    .line 51
    iget-object v1, p0, Lax/c3/b0;->a:Landroid/os/ParcelFileDescriptor;

    .line 52
    .line 53
    invoke-direct {v0, v1}, Lax/c3/b0$a;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 54
    .line 55
    .line 56
    cmp-long v1, p1, v2

    .line 57
    .line 58
    if-lez v1, :cond_3e

    .line 59
    .line 60
    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J
    :try_end_3e
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_3e} :catch_c
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_3e} :catch_a

    .line 61
    .line 62
    .line 63
    :cond_3e
    return-object v0

    .line 64
    :goto_3f
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 65
    .line 66
    .line 67
    new-instance p2, Lax/b3/j;

    .line 68
    .line 69
    invoke-direct {p2, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    throw p2

    .line 73
    :goto_48
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 74
    .line 75
    .line 76
    new-instance p2, Lax/b3/j;

    .line 77
    .line 78
    invoke-direct {p2, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw p2
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
.end method

.method public d()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/b0;->a:Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getStatSize()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_9
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    return-wide v0
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

.method public e()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/b0;->a:Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    :try_start_4
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_7} :catch_7

    .line 6
    .line 7
    .line 8
    :catch_7
    :cond_7
    return-void
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
