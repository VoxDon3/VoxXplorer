.class Lcom/voxdon/xplorer/file/b$b;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field h:Lcom/voxdon/xplorer/file/c$a;

.field i:Ljava/io/IOException;

.field final synthetic j:Lcom/voxdon/xplorer/file/b;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/b;Lcom/voxdon/xplorer/file/c$a;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->c0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lcom/voxdon/xplorer/file/b$b;->h:Lcom/voxdon/xplorer/file/c$a;

    .line 9
    .line 10
    return-void
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

.method private A(Landroid/os/ParcelFileDescriptor;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/b$b;->x(Landroid/os/ParcelFileDescriptor;)Ljava/nio/charset/Charset;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    :try_start_6
    invoke-static {p1, v1, v2}, Lax/c3/B;->d0(Landroid/os/ParcelFileDescriptor;J)V
    :try_end_9
    .catch Landroid/system/ErrnoException; {:try_start_6 .. :try_end_9} :catch_29

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/io/FileInputStream;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 20
    .line 21
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/file/b;->s0(Lcom/voxdon/xplorer/file/b;Ljava/io/Closeable;)Ljava/io/Closeable;

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lax/T/l;->a(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {p1, v0}, Lax/Dc/T;->u0(Ljava/nio/channels/SeekableByteChannel;Ljava/lang/String;)Lax/Dc/T;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {v1, p1}, Lcom/voxdon/xplorer/file/b;->u0(Lcom/voxdon/xplorer/file/b;Lax/Dc/T;)Lax/Dc/T;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catch_29
    move-exception p1

    .line 43
    new-instance v0, Ljava/io/IOException;

    .line 44
    .line 45
    const-string v1, "reset parcel file descriptor position error"

    .line 46
    .line 47
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v0
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

.method private w()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/file/b;->q0(Lcom/voxdon/xplorer/file/b;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/voxdon/xplorer/file/b;->t0(Lcom/voxdon/xplorer/file/b;)Lax/Dc/T;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/file/b;->u0(Lcom/voxdon/xplorer/file/b;Lax/Dc/T;)Lax/Dc/T;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 23
    .line 24
    invoke-static {v0}, Lcom/voxdon/xplorer/file/b;->r0(Lcom/voxdon/xplorer/file/b;)Ljava/io/Closeable;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/file/b;->s0(Lcom/voxdon/xplorer/file/b;Ljava/io/Closeable;)Ljava/io/Closeable;

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 37
    .line 38
    invoke-static {v0}, Lcom/voxdon/xplorer/file/b;->w0(Lcom/voxdon/xplorer/file/b;)Landroid/os/ParcelFileDescriptor;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 46
    .line 47
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/file/b;->x0(Lcom/voxdon/xplorer/file/b;Landroid/os/ParcelFileDescriptor;)Landroid/os/ParcelFileDescriptor;

    .line 48
    .line 49
    .line 50
    return-void
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
.end method

.method private x(Landroid/os/ParcelFileDescriptor;)Ljava/nio/charset/Charset;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-static {p1}, Landroid/os/ParcelFileDescriptor;->dup(Ljava/io/FileDescriptor;)Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lax/Dc/e;->b(Ljava/io/FileDescriptor;)Ljava/nio/charset/Charset;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_11
    .catchall {:try_start_1 .. :try_end_11} :catchall_15

    .line 18
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :catchall_15
    move-exception p1

    .line 23
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 24
    .line 25
    .line 26
    throw p1
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


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/b$b;->y([Ljava/lang/String;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/b$b;->z(Ljava/lang/Boolean;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method protected r()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$b;->h:Lcom/voxdon/xplorer/file/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/voxdon/xplorer/file/c$a;->B()V

    .line 6
    .line 7
    .line 8
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

.method protected varargs y([Ljava/lang/String;)Ljava/lang/Boolean;
    .registers 6

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->v0(Lcom/voxdon/xplorer/file/b;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x1

    .line 8
    if-eqz p1, :cond_2f

    .line 9
    .line 10
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->w0(Lcom/voxdon/xplorer/file/b;)Landroid/os/ParcelFileDescriptor;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_27

    .line 17
    .line 18
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->w0(Lcom/voxdon/xplorer/file/b;)Landroid/os/ParcelFileDescriptor;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/b$b;->A(Landroid/os/ParcelFileDescriptor;)V

    .line 25
    .line 26
    .line 27
    goto :goto_86

    .line 28
    :catch_1b
    move-exception p1

    .line 29
    goto/16 :goto_db

    .line 30
    .line 31
    :catch_1e
    move-exception p1

    .line 32
    goto/16 :goto_de

    .line 33
    .line 34
    :catch_21
    move-exception p1

    .line 35
    goto/16 :goto_e6

    .line 36
    .line 37
    :catch_24
    move-exception p1

    .line 38
    goto/16 :goto_ee

    .line 39
    .line 40
    :cond_27
    new-instance p1, Ljava/io/IOException;

    .line 41
    .line 42
    const-string v0, "parcel file descriptor not created from fd"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2f
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->y0(Lcom/voxdon/xplorer/file/b;)Lcom/voxdon/xplorer/file/y;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_d8

    .line 55
    .line 56
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 57
    .line 58
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->y0(Lcom/voxdon/xplorer/file/b;)Lcom/voxdon/xplorer/file/y;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->k0()Z

    .line 63
    .line 64
    .line 65
    move-result p1
    :try_end_41
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_41} :catch_24
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_41} :catch_21
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_41} :catch_1e
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_41} :catch_1b

    .line 66
    if-eqz p1, :cond_63

    .line 67
    .line 68
    :try_start_43
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 69
    .line 70
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->y0(Lcom/voxdon/xplorer/file/b;)Lcom/voxdon/xplorer/file/y;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/y;->e0(Z)Landroid/os/ParcelFileDescriptor;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/file/b;->x0(Lcom/voxdon/xplorer/file/b;Landroid/os/ParcelFileDescriptor;)Landroid/os/ParcelFileDescriptor;

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 82
    .line 83
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->w0(Lcom/voxdon/xplorer/file/b;)Landroid/os/ParcelFileDescriptor;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/b$b;->A(Landroid/os/ParcelFileDescriptor;)V
    :try_end_59
    .catch Lax/b3/j; {:try_start_43 .. :try_end_59} :catch_5a
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_43 .. :try_end_59} :catch_24
    .catch Ljava/lang/IllegalArgumentException; {:try_start_43 .. :try_end_59} :catch_21
    .catch Ljava/lang/RuntimeException; {:try_start_43 .. :try_end_59} :catch_1e
    .catch Ljava/io/IOException; {:try_start_43 .. :try_end_59} :catch_1b

    .line 88
    .line 89
    .line 90
    goto :goto_86

    .line 91
    :catch_5a
    move-exception p1

    .line 92
    :try_start_5b
    new-instance v0, Ljava/io/IOException;

    .line 93
    .line 94
    const-string v1, "get parcel file descriptor error"

    .line 95
    .line 96
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_63
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 101
    .line 102
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->y0(Lcom/voxdon/xplorer/file/b;)Lcom/voxdon/xplorer/file/y;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p1}, Lax/Dc/e;->a(Ljava/io/File;)Ljava/nio/charset/Charset;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object v1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 115
    .line 116
    invoke-static {v1}, Lcom/voxdon/xplorer/file/b;->y0(Lcom/voxdon/xplorer/file/b;)Lcom/voxdon/xplorer/file/y;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {v2, p1}, Lax/Dc/T;->s0(Ljava/io/File;Ljava/lang/String;)Lax/Dc/T;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {v1, p1}, Lcom/voxdon/xplorer/file/b;->u0(Lcom/voxdon/xplorer/file/b;Lax/Dc/T;)Lax/Dc/T;

    .line 133
    .line 134
    .line 135
    :goto_86
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 136
    .line 137
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->A0(Lcom/voxdon/xplorer/file/b;)Ljava/io/File;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/file/b;->z0(Lcom/voxdon/xplorer/file/b;Ljava/io/File;)Ljava/io/File;
    :try_end_8f
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5b .. :try_end_8f} :catch_24
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5b .. :try_end_8f} :catch_21
    .catch Ljava/lang/RuntimeException; {:try_start_5b .. :try_end_8f} :catch_1e
    .catch Ljava/io/IOException; {:try_start_5b .. :try_end_8f} :catch_1b

    .line 142
    .line 143
    .line 144
    :try_start_8f
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 145
    .line 146
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->t0(Lcom/voxdon/xplorer/file/b;)Lax/Dc/T;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    const/4 v2, 0x0

    .line 151
    invoke-static {v1, v2}, Lcom/voxdon/xplorer/file/b;->d1(Lax/Dc/S;Lax/u3/c;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/file/b;->B0(Lcom/voxdon/xplorer/file/b;Z)Z
    :try_end_9d
    .catch Lax/b3/a; {:try_start_8f .. :try_end_9d} :catch_9d
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_8f .. :try_end_9d} :catch_24
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8f .. :try_end_9d} :catch_21
    .catch Ljava/lang/RuntimeException; {:try_start_8f .. :try_end_9d} :catch_1e
    .catch Ljava/io/IOException; {:try_start_8f .. :try_end_9d} :catch_1b

    .line 156
    .line 157
    .line 158
    :catch_9d
    :try_start_9d
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 159
    .line 160
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->t0(Lcom/voxdon/xplorer/file/b;)Lax/Dc/T;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/file/b;->m0(Lcom/voxdon/xplorer/file/b;Lax/Dc/S;)V

    .line 165
    .line 166
    .line 167
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 168
    .line 169
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    iget-object v2, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 174
    .line 175
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    iget-object v3, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 180
    .line 181
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    invoke-static {v1, v2, v3}, Lcom/voxdon/xplorer/file/b;->p0(Landroid/content/Context;Lax/Q2/f;I)Ljava/io/File;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/file/b;->o0(Lcom/voxdon/xplorer/file/b;Ljava/io/File;)Ljava/io/File;

    .line 190
    .line 191
    .line 192
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 193
    .line 194
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->n0(Lcom/voxdon/xplorer/file/b;)Ljava/io/File;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    if-eqz p1, :cond_d0

    .line 199
    .line 200
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 201
    .line 202
    invoke-static {p1}, Lcom/voxdon/xplorer/file/b;->n0(Lcom/voxdon/xplorer/file/b;)Ljava/io/File;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 207
    .line 208
    .line 209
    :cond_d0
    iget-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->j:Lcom/voxdon/xplorer/file/b;

    .line 210
    .line 211
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/file/b;->q0(Lcom/voxdon/xplorer/file/b;Z)Z

    .line 212
    .line 213
    .line 214
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 215
    .line 216
    return-object p1

    .line 217
    :cond_d8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_da
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_9d .. :try_end_da} :catch_24
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9d .. :try_end_da} :catch_21
    .catch Ljava/lang/RuntimeException; {:try_start_9d .. :try_end_da} :catch_1e
    .catch Ljava/io/IOException; {:try_start_9d .. :try_end_da} :catch_1b

    .line 218
    .line 219
    return-object p1

    .line 220
    :goto_db
    iput-object p1, p0, Lcom/voxdon/xplorer/file/b$b;->i:Ljava/io/IOException;

    .line 221
    .line 222
    goto :goto_f5

    .line 223
    :goto_de
    new-instance v0, Ljava/io/IOException;

    .line 224
    .line 225
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    iput-object v0, p0, Lcom/voxdon/xplorer/file/b$b;->i:Ljava/io/IOException;

    .line 229
    .line 230
    goto :goto_f5

    .line 231
    :goto_e6
    new-instance v0, Ljava/io/IOException;

    .line 232
    .line 233
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 234
    .line 235
    .line 236
    iput-object v0, p0, Lcom/voxdon/xplorer/file/b$b;->i:Ljava/io/IOException;

    .line 237
    .line 238
    goto :goto_f5

    .line 239
    :goto_ee
    new-instance v0, Ljava/io/IOException;

    .line 240
    .line 241
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 242
    .line 243
    .line 244
    iput-object v0, p0, Lcom/voxdon/xplorer/file/b$b;->i:Ljava/io/IOException;

    .line 245
    .line 246
    :goto_f5
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/b$b;->w()V

    .line 247
    .line 248
    .line 249
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 250
    .line 251
    return-object p1
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method protected z(Ljava/lang/Boolean;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/b$b;->h:Lcom/voxdon/xplorer/file/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, p0, Lcom/voxdon/xplorer/file/b$b;->i:Ljava/io/IOException;

    .line 10
    .line 11
    invoke-interface {v0, p1, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
