.class public Lcom/voxdon/xplorer/viewer/ImageViewerActivity;
.super Lcom/voxdon/xplorer/activity/a;
.source "SourceFile"

# interfaces
.implements Lcom/android/ex/photo/f$g;
.implements Lax/R2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/viewer/ImageViewerActivity$m;,
        Lcom/voxdon/xplorer/viewer/ImageViewerActivity$n;
    }
.end annotation


# static fields
.field public static G:I = 0x8d06

.field public static H:Ljava/lang/String; = "IMAGE_INFO_KEY"


# instance fields
.field private A:J

.field private B:Z

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Z

.field F:Lax/i/r;

.field private j:Lcom/android/ex/photo/f;

.field private k:Lcom/android/ex/photo/b;

.field private l:Lax/x3/E;

.field private final m:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lax/Q2/f;

.field private p:I

.field q:Lcom/voxdon/xplorer/file/o;

.field r:I

.field s:Lax/x3/d;

.field t:Landroid/view/View;

.field u:Z

.field v:Landroid/view/View;

.field w:Landroid/view/View;

.field x:Lax/d3/M;

.field private y:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/content/ComponentName;",
            "Lcom/voxdon/xplorer/viewer/ImageViewerActivity$m;",
            ">;"
        }
    .end annotation
.end field

.field private z:Lcom/voxdon/xplorer/file/n;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/a;-><init>()V

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
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->m:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->y:Ljava/util/HashMap;

    .line 17
    .line 18
    new-instance v0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$e;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, p0, v1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$e;-><init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Z)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->F:Lax/i/r;

    .line 25
    .line 26
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private A0()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_27

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->V()Lcom/android/ex/photo/PhotoViewPager;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    goto :goto_27

    .line 18
    :cond_11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->s()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_22

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->n()V

    .line 33
    .line 34
    .line 35
    :cond_22
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 36
    .line 37
    invoke-virtual {v0}, Lax/x3/E;->z()V

    .line 38
    .line 39
    .line 40
    :cond_27
    :goto_27
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private B0(Lcom/voxdon/xplorer/file/n;)V
    .registers 4

    .line 1
    instance-of v0, p1, Lcom/voxdon/xplorer/file/y;

    .line 2
    .line 3
    if-nez v0, :cond_26

    .line 4
    .line 5
    if-nez p1, :cond_9

    .line 6
    .line 7
    const-string p1, "loc:null"

    .line 8
    .line 9
    goto :goto_22

    .line 10
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "loc:"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_22
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q:Lcom/voxdon/xplorer/file/o;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    instance-of v0, v0, Lcom/voxdon/xplorer/file/x;

    .line 46
    .line 47
    if-nez v0, :cond_34

    .line 48
    .line 49
    invoke-static {}, Lax/u3/b;->f()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    move-object v0, p1

    .line 54
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_4f

    .line 61
    .line 62
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_44

    .line 67
    .line 68
    goto :goto_4f

    .line 69
    :cond_44
    new-instance v0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$n;

    .line 70
    .line 71
    invoke-direct {v0, p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$n;-><init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Lcom/voxdon/xplorer/file/n;)V

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    new-array p1, p1, [Ljava/lang/Void;

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 78
    .line 79
    .line 80
    :cond_4f
    :goto_4f
    return-void
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
.end method

.method private C0(Lcom/voxdon/xplorer/file/n;)Z
    .registers 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_2
    move-object v2, p1

    .line 4
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 5
    .line 6
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-eqz v2, :cond_69

    .line 11
    .line 12
    invoke-virtual {v2}, Lax/c3/K;->e()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez v3, :cond_12

    .line 17
    .line 18
    goto :goto_69

    .line 19
    :cond_12
    invoke-direct {p0, v2}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->i0(Lax/c3/K;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_19

    .line 24
    .line 25
    return v0

    .line 26
    :cond_19
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    iget-object v4, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q:Lcom/voxdon/xplorer/file/o;

    .line 31
    .line 32
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lcom/voxdon/xplorer/file/x;

    .line 37
    .line 38
    move-object v5, p1

    .line 39
    check-cast v5, Lcom/voxdon/xplorer/file/y;

    .line 40
    .line 41
    invoke-virtual {v4, v5}, Lcom/voxdon/xplorer/file/x;->U0(Lcom/voxdon/xplorer/file/y;)Landroid/os/ParcelFileDescriptor;

    .line 42
    .line 43
    .line 44
    move-result-object v1
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2c} :catch_4c
    .catchall {:try_start_2 .. :try_end_2c} :catchall_4a

    .line 45
    if-nez v1, :cond_34

    .line 46
    .line 47
    if-eqz v1, :cond_33

    .line 48
    .line 49
    :try_start_30
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_33
    .catch Ljava/io/IOException; {:try_start_30 .. :try_end_33} :catch_33

    .line 50
    .line 51
    .line 52
    :catch_33
    :cond_33
    return v0

    .line 53
    :cond_34
    :try_start_34
    new-instance v5, Lax/y0/a;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-direct {v5, v6}, Lax/y0/a;-><init>(Ljava/io/FileDescriptor;)V

    .line 60
    .line 61
    .line 62
    const-string v6, "Orientation"

    .line 63
    .line 64
    const/4 v7, 0x1

    .line 65
    invoke-virtual {v5, v6, v7}, Lax/y0/a;->l(Ljava/lang/String;I)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-nez v6, :cond_4e

    .line 70
    .line 71
    invoke-virtual {v5}, Lax/y0/a;->f0()V

    .line 72
    .line 73
    .line 74
    goto :goto_4e

    .line 75
    :catchall_4a
    move-exception p1

    .line 76
    goto :goto_73

    .line 77
    :catch_4c
    move-exception p1

    .line 78
    goto :goto_6a

    .line 79
    :cond_4e
    :goto_4e
    const/16 v6, -0x5a

    .line 80
    .line 81
    invoke-virtual {v5, v6}, Lax/y0/a;->h0(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Lax/y0/a;->i0()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, p1, v2, v3}, Lcom/voxdon/xplorer/file/x;->d(Lcom/voxdon/xplorer/file/n;J)Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, p1}, Lcom/voxdon/xplorer/file/x;->Q1(Lcom/voxdon/xplorer/file/n;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q:Lcom/voxdon/xplorer/file/o;

    .line 94
    .line 95
    invoke-virtual {v2, p1}, Lcom/voxdon/xplorer/file/o;->H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p0, p1}, Lax/r3/d;->B(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_65
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_65} :catch_4c
    .catchall {:try_start_34 .. :try_end_65} :catchall_4a

    .line 100
    .line 101
    .line 102
    :try_start_65
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_68
    .catch Ljava/io/IOException; {:try_start_65 .. :try_end_68} :catch_68

    .line 103
    .line 104
    .line 105
    :catch_68
    return v7

    .line 106
    :cond_69
    :goto_69
    return v0

    .line 107
    :goto_6a
    :try_start_6a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_6d
    .catchall {:try_start_6a .. :try_end_6d} :catchall_4a

    .line 108
    .line 109
    .line 110
    if-eqz v1, :cond_72

    .line 111
    .line 112
    :try_start_6f
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_72
    .catch Ljava/io/IOException; {:try_start_6f .. :try_end_72} :catch_72

    .line 113
    .line 114
    .line 115
    :catch_72
    :cond_72
    return v0

    .line 116
    :goto_73
    if-eqz v1, :cond_78

    .line 117
    .line 118
    :try_start_75
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_78
    .catch Ljava/io/IOException; {:try_start_75 .. :try_end_78} :catch_78

    .line 119
    .line 120
    .line 121
    :catch_78
    :cond_78
    throw p1
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

.method private D0()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->r0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1d

    .line 7
    .line 8
    iput-boolean v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->E:Z

    .line 9
    .line 10
    new-instance v0, Ljava/io/File;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->C:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->D:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p0, v0, v1}, Lax/c3/u;->s0(Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    invoke-static {}, Lax/u3/b;->f()V

    .line 31
    .line 32
    .line 33
    const v0, 0x7f130137

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 41
    .line 42
    .line 43
    return-void
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
.end method

.method private E0(Lcom/voxdon/xplorer/file/n;)V
    .registers 5

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_image_viewer"

    .line 6
    .line 7
    const-string v2, "set_as"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1f

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s()Lax/n/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast p1, Lax/c3/k;

    .line 27
    .line 28
    invoke-static {v0, p1}, Lax/c3/u;->g0(Landroid/content/Context;Lax/c3/k;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1f
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->Z()Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0, p1}, Lax/c3/B;->G(Ljava/io/File;Lcom/voxdon/xplorer/file/n;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_3c

    .line 41
    .line 42
    invoke-static {}, Lax/Z2/t;->b()Lax/Z2/t;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1, v0}, Lax/Z2/t;->e(Ljava/io/File;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s()Lax/n/c;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {v1, p1, v0}, Lax/c3/u;->h0(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3c
    new-instance v1, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$a;

    .line 62
    .line 63
    invoke-direct {v1, p0, p1, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$a;-><init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Lcom/voxdon/xplorer/file/n;Ljava/io/File;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, p1, v1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->h0(Lcom/voxdon/xplorer/file/n;Lax/d3/n$p;)V

    .line 67
    .line 68
    .line 69
    return-void
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private G0(Lcom/voxdon/xplorer/file/n;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->z:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->A:J

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

.method private H0(Lcom/voxdon/xplorer/file/n;)V
    .registers 5

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_image_viewer"

    .line 6
    .line 7
    const-string v2, "share"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "loc"

    .line 14
    .line 15
    const-string v2, "image_viewer"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "type"

    .line 22
    .line 23
    const-string v2, "file"

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2f

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s()Lax/n/c;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast p1, Lax/c3/k;

    .line 43
    .line 44
    invoke-static {v0, p1}, Lax/c3/u;->j0(Landroid/content/Context;Lax/c3/k;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2f
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->Z()Ljava/io/File;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0, p1}, Lax/c3/B;->G(Ljava/io/File;Lcom/voxdon/xplorer/file/n;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_4c

    .line 57
    .line 58
    invoke-static {}, Lax/Z2/t;->b()Lax/Z2/t;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, v0}, Lax/Z2/t;->e(Ljava/io/File;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s()Lax/n/c;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {v1, p1, v0}, Lax/c3/u;->m0(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4c
    new-instance v1, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$b;

    .line 78
    .line 79
    invoke-direct {v1, p0, p1, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$b;-><init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Lcom/voxdon/xplorer/file/n;Ljava/io/File;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {p0, p1, v1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->h0(Lcom/voxdon/xplorer/file/n;Lax/d3/n$p;)V

    .line 83
    .line 84
    .line 85
    return-void
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

.method private I0(Lcom/voxdon/xplorer/file/n;)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p1, v0}, Lcom/android/ex/photo/f;->c(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->s()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_19

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->n()V

    .line 24
    .line 25
    .line 26
    :cond_19
    return-void
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

.method private L0(Lcom/voxdon/xplorer/file/n;)V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_27

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->V()Lcom/android/ex/photo/PhotoViewPager;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_11

    .line 16
    .line 17
    goto :goto_27

    .line 18
    :cond_11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->s()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_22

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->n()V

    .line 33
    .line 34
    .line 35
    :cond_22
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 36
    .line 37
    invoke-virtual {p1}, Lax/x3/E;->D()V

    .line 38
    .line 39
    .line 40
    :cond_27
    :goto_27
    return-void
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

.method private M0(Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    invoke-static {p1}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_8

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_8
    invoke-static {}, Lax/X2/Q;->r0()Z

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return p1
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

.method static synthetic V(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)Lcom/android/ex/photo/f;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

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

.method static synthetic W(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->v0()V

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

.method static synthetic X(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->B:Z

    .line 2
    .line 3
    return p1
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

.method static synthetic Y(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;I)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->w0(I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method static synthetic a0(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Landroid/net/Uri;)Lcom/voxdon/xplorer/file/n;
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->k0(Landroid/net/Uri;)Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method static synthetic b0(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Landroid/content/Intent;)Lcom/voxdon/xplorer/viewer/ImageViewerActivity$m;
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->n0(Landroid/content/Intent;)Lcom/voxdon/xplorer/viewer/ImageViewerActivity$m;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method static synthetic c0(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->C0(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private d0()V
    .registers 9

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$f;

    .line 2
    .line 3
    const-wide/16 v1, 0x190

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, v2}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$f;-><init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;J)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lax/x3/d;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s()Lax/n/c;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const v3, 0x7f0a008e

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v3}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v1, v2, v3, v4}, Lax/x3/d;-><init>(Lax/n/c;Landroid/view/View;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->r0()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const v2, 0x7f0801b4

    .line 32
    .line 33
    .line 34
    const v3, 0x7f13028d

    .line 35
    .line 36
    .line 37
    const v4, 0x7f0a02d4

    .line 38
    .line 39
    .line 40
    if-eqz v1, :cond_4b

    .line 41
    .line 42
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 43
    .line 44
    const v5, 0x7f1302a8

    .line 45
    .line 46
    .line 47
    const v6, 0x7f0801ec

    .line 48
    .line 49
    .line 50
    const v7, 0x7f0a02e8

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v7, v5, v6, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 57
    .line 58
    invoke-virtual {v1, v4, v3, v2, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 62
    .line 63
    const v2, 0x7f1303c0

    .line 64
    .line 65
    .line 66
    const v3, 0x7f08016e

    .line 67
    .line 68
    .line 69
    const v4, 0x7f0a02ef

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v4, v2, v3, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4b
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 77
    .line 78
    const v5, 0x7f1302b0

    .line 79
    .line 80
    .line 81
    const v6, 0x7f0801f4

    .line 82
    .line 83
    .line 84
    const v7, 0x7f0a02f1

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v7, v5, v6, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 91
    .line 92
    const v5, 0x7f1302a7

    .line 93
    .line 94
    .line 95
    const v6, 0x7f0801eb

    .line 96
    .line 97
    .line 98
    const v7, 0x7f0a02e7

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v7, v5, v6, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 105
    .line 106
    const v5, 0x7f13027f

    .line 107
    .line 108
    .line 109
    const v6, 0x7f080194

    .line 110
    .line 111
    .line 112
    const v7, 0x7f0a02ca

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v7, v5, v6, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 119
    .line 120
    invoke-virtual {v1, v4, v3, v2, v0}, Lax/x3/d;->d(IIILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 124
    .line 125
    invoke-virtual {v0}, Lax/x3/d;->e()Landroid/view/View;

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 129
    .line 130
    const v1, 0x7f0f0014

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1}, Lax/x3/d;->l(I)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 137
    .line 138
    new-instance v1, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$g;

    .line 139
    .line 140
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$g;-><init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Lax/x3/d;->n(Lax/x3/d$f;)V

    .line 144
    .line 145
    .line 146
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 147
    .line 148
    new-instance v1, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;

    .line 149
    .line 150
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;-><init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1}, Lax/x3/d;->x(Lax/x3/d$g;)V

    .line 154
    .line 155
    .line 156
    return-void
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

.method private e0()V
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->z:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    instance-of v1, v0, Lax/c3/k;

    .line 7
    .line 8
    if-eqz v1, :cond_2e

    .line 9
    .line 10
    :try_start_9
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->z:Lcom/voxdon/xplorer/file/n;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Lax/c3/b;->q()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    iget-wide v2, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->A:J
    :try_end_21
    .catch Lax/b3/j; {:try_start_9 .. :try_end_21} :catch_2e

    .line 33
    .line 34
    cmp-long v4, v0, v2

    .line 35
    .line 36
    if-eqz v4, :cond_2e

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/voxdon/xplorer/viewer/b;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/voxdon/xplorer/viewer/b;->f1()V

    .line 45
    .line 46
    .line 47
    :catch_2e
    :cond_2e
    const/4 v0, 0x0

    .line 48
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->z:Lcom/voxdon/xplorer/file/n;

    .line 49
    .line 50
    const-wide/16 v0, 0x0

    .line 51
    .line 52
    iput-wide v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->A:J

    .line 53
    .line 54
    return-void
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

.method private g0(Lcom/voxdon/xplorer/file/n;)V
    .registers 11

    .line 1
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "menu_image_viewer"

    .line 6
    .line 7
    const-string v2, "delete"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "loc"

    .line 14
    .line 15
    const-string v2, "image_viewer"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "type"

    .line 22
    .line 23
    const-string v2, "file"

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 30
    .line 31
    .line 32
    new-instance v2, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lax/c3/B;->a(Ljava/util/List;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3a

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lax/Q2/f;->l(Lax/Q2/f;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3a

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    const/4 v4, 0x1

    .line 58
    goto :goto_3c

    .line 59
    :cond_3a
    const/4 v0, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    :goto_3c
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->L()V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q:Lcom/voxdon/xplorer/file/o;

    .line 69
    .line 70
    new-instance v7, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$i;

    .line 71
    .line 72
    invoke-direct {v7, p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$i;-><init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Lcom/voxdon/xplorer/file/n;)V

    .line 73
    .line 74
    .line 75
    new-instance v8, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$j;

    .line 76
    .line 77
    invoke-direct {v8, p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$j;-><init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)V

    .line 78
    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    move-object v5, p0

    .line 83
    invoke-static/range {v1 .. v8}, Lax/W2/o;->m(Lcom/voxdon/xplorer/file/o;Ljava/util/List;IZLax/d3/s;ZLax/W2/h$a;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 84
    .line 85
    .line 86
    return-void
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

.method private h0(Lcom/voxdon/xplorer/file/n;Lax/d3/n$p;)V
    .registers 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lax/W2/r;->l()Lax/W2/r;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q:Lcom/voxdon/xplorer/file/o;

    .line 14
    .line 15
    new-instance v2, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$l;

    .line 16
    .line 17
    invoke-direct {v2, p0, p2}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$l;-><init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Lax/d3/n$p;)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-virtual {p1, v1, v0, p2, v2}, Lax/W2/r;->k(Lcom/voxdon/xplorer/file/o;Ljava/util/List;ZLax/W2/h$a;)V

    .line 22
    .line 23
    .line 24
    :try_start_17
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/activity/a;->l(Lax/W2/h;Z)V
    :try_end_1a
    .catch Lax/b3/c; {:try_start_17 .. :try_end_1a} :catch_1b

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_1b
    const p1, 0x7f130137

    .line 29
    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 37
    .line 38
    .line 39
    return-void
    .line 40
    .line 41
.end method

.method private i0(Lax/c3/K;)Z
    .registers 5

    .line 1
    invoke-virtual {p1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->m:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_19

    .line 12
    .line 13
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->m:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_19
    invoke-static {p1}, Lax/c3/B;->t(Lax/c3/K;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->m:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return p1
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

.method private j0(Lcom/voxdon/xplorer/file/n;)V
    .registers 3

    .line 1
    invoke-static {p1}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1c

    .line 6
    .line 7
    :try_start_6
    check-cast p1, Lax/c3/k;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {p0, p1, v0}, Lax/c3/u;->e(Landroid/content/Context;Lax/c3/k;Z)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p0, p1}, Lax/c3/u;->o0(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_10
    .catch Landroid/content/ActivityNotFoundException; {:try_start_6 .. :try_end_10} :catch_11

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_11
    const p1, 0x7f130341

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, -0x1

    .line 26
    invoke-virtual {p0, p1, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->J0(Ljava/lang/CharSequence;I)V

    .line 27
    .line 28
    .line 29
    :cond_1c
    return-void
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

.method private k0(Landroid/net/Uri;)Lcom/voxdon/xplorer/file/n;
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->n:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_25

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_a

    .line 36
    .line 37
    return-object v2

    .line 38
    :cond_25
    return-object v0
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

.method private m0(I)V
    .registers 3

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    if-ne p1, v0, :cond_b

    .line 4
    .line 5
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/x3/d;->j()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_f

    .line 12
    :cond_b
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l0()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_f
    if-eqz p1, :cond_29

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q0()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1f

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->u0()V

    .line 29
    .line 30
    .line 31
    goto :goto_26

    .line 32
    :cond_1f
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->n()V

    .line 37
    .line 38
    .line 39
    :goto_26
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 40
    .line 41
    .line 42
    :cond_29
    return-void
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

.method private n0(Landroid/content/Intent;)Lcom/voxdon/xplorer/viewer/ImageViewerActivity$m;
    .registers 6

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->y:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_15

    .line 12
    .line 13
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->y:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$m;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_15
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/high16 v2, 0x10000

    .line 27
    .line 28
    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_59

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-lez v2, :cond_59

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 46
    .line 47
    iget-object v3, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 48
    .line 49
    invoke-virtual {v3, v1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v1, p1, v2}, Lax/Z2/h;->n(Landroid/content/pm/PackageManager;Landroid/content/pm/ResolveInfo;I)Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_4e

    .line 58
    .line 59
    sget v1, Lax/x3/d;->n:I

    .line 60
    .line 61
    invoke-static {p0, v1}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {p1, v1, v1}, Lax/u3/z;->f(Landroid/graphics/drawable/Drawable;II)Landroid/graphics/Bitmap;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 70
    .line 71
    invoke-virtual {p0}, Lax/n/c;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-direct {v1, v2, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 76
    .line 77
    .line 78
    move-object p1, v1

    .line 79
    :cond_4e
    new-instance v1, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$m;

    .line 80
    .line 81
    invoke-direct {v1, v3, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$m;-><init>(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->y:Ljava/util/HashMap;

    .line 85
    .line 86
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_59
    const/4 p1, 0x0

    .line 91
    return-object p1
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

.method private o0(Landroid/view/ViewGroup;Landroid/view/View;)Z
    .registers 3

    .line 1
    invoke-static {p1, p2}, Lax/u3/z;->s(Landroid/view/ViewGroup;Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method private p0(Ljava/lang/String;)Z
    .registers 3

    .line 1
    const-string v0, "webp"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_23

    .line 8
    .line 9
    const-string v0, "png"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_23

    .line 16
    .line 17
    const-string v0, "jpg"

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_23

    .line 24
    .line 25
    const-string v0, "jpeg"

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_21

    .line 32
    .line 33
    goto :goto_23

    .line 34
    :cond_21
    const/4 p1, 0x0

    .line 35
    return p1

    .line 36
    :cond_23
    :goto_23
    const/4 p1, 0x1

    .line 37
    return p1
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

.method private q0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x3/d;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_a
    const/4 v0, 0x0

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

.method private r0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->C:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method private s0(Lcom/voxdon/xplorer/file/n;)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lcom/voxdon/xplorer/viewer/b;->W0(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Z)Landroid/content/Intent;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-eqz v0, :cond_20

    .line 8
    .line 9
    invoke-static {v0}, Lax/c3/u;->U(Landroid/content/Intent;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_20

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/voxdon/xplorer/viewer/b;

    .line 28
    .line 29
    invoke-virtual {v0, p1, v1}, Lcom/voxdon/xplorer/viewer/b;->r(Landroid/net/Uri;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    if-eqz v0, :cond_4d

    .line 34
    .line 35
    :try_start_22
    invoke-static {p0, v0}, Lax/c3/u;->o0(Landroid/content/Context;Landroid/content/Intent;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->G0(Lcom/voxdon/xplorer/file/n;)V
    :try_end_28
    .catch Landroid/content/ActivityNotFoundException; {:try_start_22 .. :try_end_28} :catch_2d
    .catch Ljava/lang/SecurityException; {:try_start_22 .. :try_end_28} :catch_2b
    .catch Ljava/lang/NullPointerException; {:try_start_22 .. :try_end_28} :catch_29

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catch_29
    move-exception p1

    .line 43
    goto :goto_2e

    .line 44
    :catch_2b
    move-exception p1

    .line 45
    goto :goto_2e

    .line 46
    :catch_2d
    move-exception p1

    .line 47
    :goto_2e
    const v0, 0x7f130137

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "ImageViewer openDefault"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 76
    .line 77
    .line 78
    :cond_4d
    return-void
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
.end method

.method private t0(Lax/c3/k;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .registers 13

    .line 1
    invoke-static {p1}, Lax/a3/Q;->E3(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->m()Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lax/Z2/c$a;->d0:Lax/Z2/c$a;

    .line 10
    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move v5, p4

    .line 14
    move v6, p5

    .line 15
    invoke-static/range {v0 .. v6}, Lax/a3/Q;->R3(Landroidx/fragment/app/Fragment;Lax/Z2/c$a;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->G0(Lcom/voxdon/xplorer/file/n;)V

    .line 19
    .line 20
    .line 21
    return-void
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
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
.end method

.method private u0(Lcom/voxdon/xplorer/file/n;)V
    .registers 9

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p0, p1, v3, v0}, Lax/c3/w;->a(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_28

    .line 18
    .line 19
    invoke-static {p1}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_23

    .line 24
    .line 25
    move-object v2, p1

    .line 26
    check-cast v2, Lax/c3/k;

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    const/4 v6, 0x1

    .line 30
    move-object v4, v3

    .line 31
    move-object v1, p0

    .line 32
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->t0(Lax/c3/k;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    move-object v1, p0

    .line 37
    invoke-static {}, Lax/u3/b;->f()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_28
    move-object v1, p0

    .line 42
    const p1, 0x7f130341

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 51
    .line 52
    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private v0()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/voxdon/xplorer/viewer/b;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/viewer/b;->V0()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_e

    .line 12
    .line 13
    goto/16 :goto_80

    .line 14
    .line 15
    :cond_e
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->k0(Landroid/net/Uri;)Lcom/voxdon/xplorer/file/n;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_15

    .line 20
    .line 21
    goto :goto_80

    .line 22
    :cond_15
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 23
    .line 24
    invoke-virtual {v1}, Lax/x3/E;->x()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_80

    .line 29
    .line 30
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 31
    .line 32
    invoke-virtual {v1}, Lax/x3/E;->w()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_80

    .line 37
    .line 38
    invoke-static {v0}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_80

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->G()Lax/c3/z;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    sget-object v2, Lax/c3/z;->e0:Lax/c3/z;

    .line 49
    .line 50
    if-ne v1, v2, :cond_80

    .line 51
    .line 52
    invoke-static {v0}, Lax/c3/A;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_80

    .line 57
    .line 58
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 59
    .line 60
    invoke-virtual {v1}, Lax/x3/E;->y()V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 64
    .line 65
    invoke-virtual {v1}, Lax/x3/E;->s()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    const/4 v2, 0x0

    .line 70
    if-eqz v1, :cond_49

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    goto :goto_4f

    .line 74
    :cond_49
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 75
    .line 76
    invoke-virtual {v1}, Lax/x3/E;->r()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    :goto_4f
    :try_start_4f
    check-cast v0, Lax/c3/k;

    .line 81
    .line 82
    invoke-static {p0, v0, v1, v2}, Lax/c3/w;->i(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;IZ)Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget v1, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->G:I

    .line 87
    .line 88
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_5a
    .catch Landroid/content/ActivityNotFoundException; {:try_start_4f .. :try_end_5a} :catch_5f
    .catch Ljava/lang/SecurityException; {:try_start_4f .. :try_end_5a} :catch_5d
    .catch Ljava/lang/NullPointerException; {:try_start_4f .. :try_end_5a} :catch_5b

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :catch_5b
    move-exception v0

    .line 93
    goto :goto_60

    .line 94
    :catch_5d
    move-exception v0

    .line 95
    goto :goto_60

    .line 96
    :catch_5f
    move-exception v0

    .line 97
    :goto_60
    const v1, 0x7f130137

    .line 98
    .line 99
    .line 100
    const/4 v2, 0x1

    .line 101
    invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    const-string v2, "PVI:"

    .line 117
    .line 118
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 127
    .line 128
    .line 129
    :cond_80
    :goto_80
    return-void
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

.method private w0(I)Z
    .registers 11

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->u0()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/voxdon/xplorer/viewer/b;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/voxdon/xplorer/viewer/b;->V0()Landroid/net/Uri;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-nez v0, :cond_15

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->k0(Landroid/net/Uri;)Lcom/voxdon/xplorer/file/n;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_1c

    .line 27
    .line 28
    return v1

    .line 29
    :cond_1c
    const/4 v2, 0x1

    .line 30
    packed-switch p1, :pswitch_data_66

    .line 31
    .line 32
    .line 33
    :cond_20
    move-object v3, p0

    .line 34
    goto :goto_3a

    .line 35
    :pswitch_22
    invoke-static {p0, v0, v1}, Lcom/voxdon/xplorer/file/x;->E1(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_20

    .line 40
    .line 41
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->M0()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x1

    .line 53
    const/4 v4, 0x3

    .line 54
    move-object v3, p0

    .line 55
    invoke-virtual/range {v3 .. v8}, Lcom/voxdon/xplorer/activity/a;->R(ILax/c3/K;Ljava/lang/String;ZZ)V

    .line 56
    .line 57
    .line 58
    return v2

    .line 59
    :goto_3a
    sparse-switch p1, :sswitch_data_6e

    .line 60
    .line 61
    .line 62
    return v1

    .line 63
    :sswitch_3e
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->L0(Lcom/voxdon/xplorer/file/n;)V

    .line 64
    .line 65
    .line 66
    return v2

    .line 67
    :sswitch_42
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->H0(Lcom/voxdon/xplorer/file/n;)V

    .line 68
    .line 69
    .line 70
    return v2

    .line 71
    :sswitch_46
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->E0(Lcom/voxdon/xplorer/file/n;)V

    .line 72
    .line 73
    .line 74
    return v2

    .line 75
    :sswitch_4a
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->D0()V

    .line 76
    .line 77
    .line 78
    return v2

    .line 79
    :sswitch_4e
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->B0(Lcom/voxdon/xplorer/file/n;)V

    .line 80
    .line 81
    .line 82
    return v2

    .line 83
    :sswitch_52
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->u0(Lcom/voxdon/xplorer/file/n;)V

    .line 84
    .line 85
    .line 86
    return v2

    .line 87
    :sswitch_56
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s0(Lcom/voxdon/xplorer/file/n;)V

    .line 88
    .line 89
    .line 90
    return v2

    .line 91
    :sswitch_5a
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->I0(Lcom/voxdon/xplorer/file/n;)V

    .line 92
    .line 93
    .line 94
    return v2

    .line 95
    :sswitch_5e
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j0(Lcom/voxdon/xplorer/file/n;)V

    .line 96
    .line 97
    .line 98
    return v2

    .line 99
    :sswitch_62
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->g0(Lcom/voxdon/xplorer/file/n;)V

    .line 100
    .line 101
    .line 102
    return v2

    .line 103
    :pswitch_data_66
    .packed-switch 0x7f0a02ca
        :pswitch_22
        :pswitch_22
    .end packed-switch

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    :sswitch_data_6e
    .sparse-switch
        0x7f0a02ca -> :sswitch_62
        0x7f0a02cb -> :sswitch_5e
        0x7f0a02d4 -> :sswitch_5a
        0x7f0a02da -> :sswitch_56
        0x7f0a02dc -> :sswitch_52
        0x7f0a02e7 -> :sswitch_4e
        0x7f0a02e8 -> :sswitch_4a
        0x7f0a02ef -> :sswitch_46
        0x7f0a02f1 -> :sswitch_42
        0x7f0a02f3 -> :sswitch_3e
    .end sparse-switch
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
.method public F0(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->v:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_1f

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->w:Landroid/view/View;

    .line 6
    .line 7
    if-eqz v0, :cond_1f

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    goto :goto_1f

    .line 16
    :cond_f
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->u:Z

    .line 17
    .line 18
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->v:Landroid/view/View;

    .line 19
    .line 20
    if-eqz p1, :cond_17

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    goto :goto_19

    .line 24
    :cond_17
    const/16 p1, 0x8

    .line 25
    .line 26
    :goto_19
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->x0()V

    .line 30
    .line 31
    .line 32
    :cond_1f
    :goto_1f
    return-void
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

.method J0(Ljava/lang/CharSequence;I)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->t:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lax/u3/B;->T(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->a0()V

    .line 8
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

.method K0(Lcom/voxdon/xplorer/file/n;ILjava/lang/CharSequence;Ljava/util/List;)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "I",
            "Ljava/lang/CharSequence;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->t:Landroid/view/View;

    .line 2
    .line 3
    new-instance v5, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$k;

    .line 4
    .line 5
    invoke-direct {v5, p0, p4, p2, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$k;-><init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Ljava/util/List;ILcom/voxdon/xplorer/file/n;)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const v3, 0x7f1302b5

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    move-object v1, p3

    .line 14
    invoke-static/range {v0 .. v5}, Lax/u3/B;->O(Landroid/view/View;Ljava/lang/CharSequence;IIZLandroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->a0()V

    .line 19
    .line 20
    .line 21
    return-void
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

.method public d()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x3/E;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public e(I)V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_8

    .line 3
    .line 4
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 5
    .line 6
    invoke-virtual {p1}, Lax/x3/E;->p()V

    .line 7
    .line 8
    .line 9
    :cond_8
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

.method public f()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x3/E;->q()V

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
.end method

.method protected f0()Lcom/android/ex/photo/f;
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->H:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {}, Lcom/voxdon/xplorer/viewer/c;->b()Lcom/voxdon/xplorer/viewer/c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/viewer/c;->a(Ljava/lang/String;)Lcom/voxdon/xplorer/viewer/c$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1c

    .line 20
    .line 21
    iget-object v1, v0, Lcom/voxdon/xplorer/viewer/c$a;->a:Ljava/util/List;

    .line 22
    .line 23
    iput-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->n:Ljava/util/List;

    .line 24
    .line 25
    iget v0, v0, Lcom/voxdon/xplorer/viewer/c$a;->b:I

    .line 26
    .line 27
    iput v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->r:I

    .line 28
    .line 29
    :cond_1c
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "photo_index"

    .line 34
    .line 35
    iget v2, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->r:I

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    new-instance v0, Lcom/voxdon/xplorer/viewer/b;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->n:Ljava/util/List;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q:Lcom/voxdon/xplorer/file/o;

    .line 45
    .line 46
    invoke-direct {v0, p0, v1, v2}, Lcom/voxdon/xplorer/viewer/b;-><init>(Lcom/android/ex/photo/f$g;Ljava/util/List;Lcom/voxdon/xplorer/file/o;)V

    .line 47
    .line 48
    .line 49
    return-object v0
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
.end method

.method public findViewById(I)Landroid/view/View;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/n/c;->getDelegate()Lax/n/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lax/n/f;->l(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

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

.method public i()V
    .registers 7

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/voxdon/xplorer/viewer/b;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/viewer/b;->V0()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_13

    .line 14
    :cond_d
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->k0(Landroid/net/Uri;)Lcom/voxdon/xplorer/file/n;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_14

    .line 19
    .line 20
    :goto_13
    return-void

    .line 21
    :cond_14
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->G()Lax/c3/z;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v2, Lax/c3/z;->e0:Lax/c3/z;

    .line 26
    .line 27
    const v3, 0x7f0a02d4

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    const/4 v5, 0x0

    .line 32
    if-ne v1, v2, :cond_2d

    .line 33
    .line 34
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->M0(Lcom/voxdon/xplorer/file/n;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2d

    .line 39
    .line 40
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 41
    .line 42
    invoke-virtual {v1, v3, v5}, Lax/x3/d;->t(IZ)V

    .line 43
    .line 44
    .line 45
    goto :goto_32

    .line 46
    :cond_2d
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 47
    .line 48
    invoke-virtual {v1, v3, v4}, Lax/x3/d;->t(IZ)V

    .line 49
    .line 50
    .line 51
    :goto_32
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->r0()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_80

    .line 56
    .line 57
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q:Lcom/voxdon/xplorer/file/o;

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/o;->e0(Lcom/voxdon/xplorer/file/n;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    const v2, 0x7f0a02ca

    .line 64
    .line 65
    .line 66
    if-eqz v1, :cond_49

    .line 67
    .line 68
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 69
    .line 70
    invoke-virtual {v1, v2, v4}, Lax/x3/d;->o(IZ)V

    .line 71
    .line 72
    .line 73
    goto :goto_4e

    .line 74
    :cond_49
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 75
    .line 76
    invoke-virtual {v1, v2, v5}, Lax/x3/d;->o(IZ)V

    .line 77
    .line 78
    .line 79
    :goto_4e
    invoke-static {}, Lax/X2/Q;->E1()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_77

    .line 84
    .line 85
    instance-of v1, v0, Lcom/voxdon/xplorer/file/y;

    .line 86
    .line 87
    if-eqz v1, :cond_77

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->G()Lax/c3/z;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sget-object v2, Lax/c3/z;->f0:Lax/c3/z;

    .line 94
    .line 95
    if-ne v1, v2, :cond_77

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->p0(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_77

    .line 106
    .line 107
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->i0(Lax/c3/K;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_77

    .line 118
    .line 119
    goto :goto_78

    .line 120
    :cond_77
    const/4 v4, 0x0

    .line 121
    :goto_78
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 122
    .line 123
    const v1, 0x7f0a02e7

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1, v4}, Lax/x3/d;->t(IZ)V

    .line 127
    .line 128
    .line 129
    :cond_80
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->v0()V

    .line 130
    .line 131
    .line 132
    return-void
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

.method public j()Lcom/android/ex/photo/f;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 2
    .line 3
    return-object v0
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

.method l0()Landroid/view/View;
    .registers 5

    .line 1
    const v0, 0x7f0a04a5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setTouchscreenBlocksFocus(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    instance-of v2, v1, Landroidx/appcompat/widget/p;

    .line 19
    .line 20
    const-string v3, "not work anymore"

    .line 21
    .line 22
    if-eqz v2, :cond_36

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_32

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_32

    .line 43
    .line 44
    const v0, 0x102002c

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_32
    invoke-static {v3}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_36
    invoke-static {v3}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v1
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

.method public m()Landroidx/fragment/app/Fragment;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->x:Lax/d3/M;

    .line 2
    .line 3
    return-object v0
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

.method public o()Lcom/android/ex/photo/a;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->k:Lcom/android/ex/photo/b;

    .line 2
    .line 3
    if-nez v0, :cond_1b

    .line 4
    .line 5
    const v0, 0x7f0a04a5

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lax/n/c;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcom/android/ex/photo/b;

    .line 18
    .line 19
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Lcom/android/ex/photo/b;-><init>(Lax/n/a;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->k:Lcom/android/ex/photo/b;

    .line 27
    .line 28
    :cond_1b
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->k:Lcom/android/ex/photo/b;

    .line 29
    .line 30
    return-object v0
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .registers 5

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/voxdon/xplorer/activity/a;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3}, Lcom/android/ex/photo/f;->d0(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    sget p3, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->G:I

    .line 10
    .line 11
    if-ne p1, p3, :cond_27

    .line 12
    .line 13
    const/4 p1, -0x1

    .line 14
    if-ne p2, p1, :cond_13

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->A0()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    if-nez p2, :cond_27

    .line 21
    .line 22
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 23
    .line 24
    invoke-virtual {p1}, Lax/x3/E;->p()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->s()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_27

    .line 34
    .line 35
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->n()V

    .line 38
    .line 39
    .line 40
    :cond_27
    return-void
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
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 4

    .line 1
    invoke-super {p0, p1}, Lax/n/c;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->V()Lcom/android/ex/photo/PhotoViewPager;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_1b

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    return-void
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

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 9

    .line 1
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/activity/a;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "headless_fragment"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->k0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lax/d3/M;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->x:Lax/d3/M;

    .line 17
    .line 18
    if-nez v0, :cond_2c

    .line 19
    .line 20
    const-string v0, "ImageViewerActivity"

    .line 21
    .line 22
    invoke-static {v0}, Lax/d3/M;->K2(Ljava/lang/String;)Lax/d3/M;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->x:Lax/d3/M;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->o()Landroidx/fragment/app/t;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->x:Lax/d3/M;

    .line 37
    .line 38
    invoke-virtual {v0, v2, v1}, Landroidx/fragment/app/t;->e(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Landroidx/fragment/app/t;->i()I

    .line 43
    .line 44
    .line 45
    :cond_2c
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v1, "location"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lax/Q2/f;

    .line 56
    .line 57
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->o:Lax/Q2/f;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "location_key"

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iput v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->p:I

    .line 71
    .line 72
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->o:Lax/Q2/f;

    .line 73
    .line 74
    const v1, 0x7f130137

    .line 75
    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    if-nez v0, :cond_91

    .line 79
    .line 80
    new-instance p1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string v0, ""

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-nez v0, :cond_64

    .line 99
    .line 100
    const/4 v2, 0x1

    .line 101
    :cond_64
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v0, ",key:"

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->p:I

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const-string v2, "ImageViewer no location"

    .line 123
    .line 124
    invoke-virtual {v0, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 133
    .line 134
    .line 135
    invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_91
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const-string v4, "extra_temp_file_path"

    .line 151
    .line 152
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->C:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const-string v4, "extra_temp_file_type"

    .line 163
    .line 164
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->D:Ljava/lang/String;

    .line 169
    .line 170
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->o:Lax/Q2/f;

    .line 171
    .line 172
    iget v4, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->p:I

    .line 173
    .line 174
    invoke-static {v0, v4}, Lax/c3/x;->d(Lax/Q2/f;I)Lcom/voxdon/xplorer/file/o;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q:Lcom/voxdon/xplorer/file/o;

    .line 179
    .line 180
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->f0()Lcom/android/ex/photo/f;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 188
    .line 189
    invoke-virtual {v0, p1}, Lcom/android/ex/photo/f;->f0(Landroid/os/Bundle;)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Lax/x3/E;

    .line 193
    .line 194
    const v4, 0x7f0a041e

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0, v4}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->findViewById(I)Landroid/view/View;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    iget-object v5, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 202
    .line 203
    invoke-virtual {v5}, Lcom/android/ex/photo/f;->V()Lcom/android/ex/photo/PhotoViewPager;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    new-instance v6, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;

    .line 208
    .line 209
    invoke-direct {v6, p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;-><init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)V

    .line 210
    .line 211
    .line 212
    invoke-direct {v0, v4, v5, v6}, Lax/x3/E;-><init>(Landroid/view/View;Lcom/android/ex/photo/PhotoViewPager;Lax/x3/E$d;)V

    .line 213
    .line 214
    .line 215
    iput-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 216
    .line 217
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->n:Ljava/util/List;

    .line 218
    .line 219
    if-eqz v0, :cond_1a0

    .line 220
    .line 221
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-nez v0, :cond_e4

    .line 226
    .line 227
    goto/16 :goto_1a0

    .line 228
    .line 229
    :cond_e4
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q:Lcom/voxdon/xplorer/file/o;

    .line 230
    .line 231
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-nez v0, :cond_178

    .line 236
    .line 237
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q:Lcom/voxdon/xplorer/file/o;

    .line 238
    .line 239
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    instance-of v0, v0, Lcom/voxdon/xplorer/file/b;

    .line 244
    .line 245
    const-string v4, "location:"

    .line 246
    .line 247
    if-eqz v0, :cond_14e

    .line 248
    .line 249
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q:Lcom/voxdon/xplorer/file/o;

    .line 250
    .line 251
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, Lcom/voxdon/xplorer/file/b;

    .line 256
    .line 257
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/b;->e1()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-nez v0, :cond_14e

    .line 262
    .line 263
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    const-string v5, "IMAGEVIEWER NOT CONNECTED OPERATOR ARCHIVE"

    .line 272
    .line 273
    invoke-virtual {v0, v5}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    new-instance v5, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    iget-object v4, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->o:Lax/Q2/f;

    .line 286
    .line 287
    invoke-virtual {v4}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    const-string v4, ","

    .line 295
    .line 296
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    iget v6, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->p:I

    .line 300
    .line 301
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    if-eqz p1, :cond_135

    .line 308
    .line 309
    const/4 v2, 0x1

    .line 310
    :cond_135
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 322
    .line 323
    .line 324
    invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :cond_14e
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    const-string v0, "IMAGEVIEWER NOT CONNECTED OPERATOR"

    .line 344
    .line 345
    invoke-virtual {p1, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    new-instance v0, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->o:Lax/Q2/f;

    .line 358
    .line 359
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 375
    .line 376
    .line 377
    :cond_178
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->d0()V

    .line 378
    .line 379
    .line 380
    const p1, 0x7f0a0420

    .line 381
    .line 382
    .line 383
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->findViewById(I)Landroid/view/View;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->t:Landroid/view/View;

    .line 388
    .line 389
    const p1, 0x7f0a00b5

    .line 390
    .line 391
    .line 392
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->findViewById(I)Landroid/view/View;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->v:Landroid/view/View;

    .line 397
    .line 398
    const p1, 0x7f0a00c6

    .line 399
    .line 400
    .line 401
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->findViewById(I)Landroid/view/View;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->w:Landroid/view/View;

    .line 406
    .line 407
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->F:Lax/i/r;

    .line 412
    .line 413
    invoke-virtual {p1, p0, v0}, Landroidx/activity/OnBackPressedDispatcher;->h(Lax/G0/h;Lax/i/r;)V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :cond_1a0
    :goto_1a0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 418
    .line 419
    .line 420
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/android/ex/photo/f;->g0(Landroid/view/Menu;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_10

    .line 10
    .line 11
    :cond_a
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_12

    .line 16
    .line 17
    :cond_10
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
.end method

.method protected onDestroy()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->h0()V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q:Lcom/voxdon/xplorer/file/o;

    .line 9
    .line 10
    if-eqz v0, :cond_f

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 14
    .line 15
    .line 16
    :cond_f
    :try_start_f
    invoke-super {p0}, Lcom/voxdon/xplorer/activity/a;->onDestroy()V
    :try_end_12
    .catch Ljava/lang/IllegalArgumentException; {:try_start_f .. :try_end_12} :catch_13

    .line 17
    .line 18
    .line 19
    goto :goto_14

    .line 20
    :catch_13
    nop

    .line 21
    :goto_14
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->r0()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_28

    .line 26
    .line 27
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->E:Z

    .line 28
    .line 29
    if-nez v0, :cond_28

    .line 30
    .line 31
    :try_start_1e
    new-instance v0, Ljava/io/File;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->C:Ljava/lang/String;

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_28} :catch_28

    .line 39
    .line 40
    .line 41
    :catch_28
    :cond_28
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .registers 7

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x3/E;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    invoke-super {p0, p1, p2}, Lax/n/c;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_d
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 15
    .line 16
    invoke-virtual {v0}, Lax/x3/E;->p()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isMetaPressed()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_be

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_be

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isAltPressed()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_26

    .line 36
    .line 37
    goto/16 :goto_be

    .line 38
    .line 39
    :cond_26
    const/16 v0, 0x70

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    if-eq p1, v0, :cond_b7

    .line 43
    .line 44
    const v0, 0x7f0a008e

    .line 45
    .line 46
    .line 47
    const v2, 0x7f0a04a5

    .line 48
    .line 49
    .line 50
    packed-switch p1, :pswitch_data_c4

    .line 51
    .line 52
    .line 53
    goto/16 :goto_aa

    .line 54
    .line 55
    :pswitch_36
    invoke-super {p0, p1, p2}, Lax/n/c;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->q0()Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-nez p2, :cond_65

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-eqz p2, :cond_65

    .line 70
    .line 71
    invoke-virtual {p0, v2}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->findViewById(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Landroidx/appcompat/widget/Toolbar;

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->findViewById(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Landroid/view/ViewGroup;

    .line 82
    .line 83
    invoke-direct {p0, v1, p2}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->o0(Landroid/view/ViewGroup;Landroid/view/View;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_5e

    .line 88
    .line 89
    invoke-direct {p0, v0, p2}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->o0(Landroid/view/ViewGroup;Landroid/view/View;)Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-eqz p2, :cond_65

    .line 94
    .line 95
    :cond_5e
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2}, Lcom/android/ex/photo/f;->u0()V

    .line 100
    .line 101
    .line 102
    :cond_65
    return p1

    .line 103
    :pswitch_66
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3}, Lcom/android/ex/photo/f;->s()Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_74

    .line 112
    .line 113
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->m0(I)V

    .line 114
    .line 115
    .line 116
    return v1

    .line 117
    :cond_74
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    if-eqz v3, :cond_b3

    .line 122
    .line 123
    invoke-virtual {p0, v2}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->findViewById(I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    check-cast v2, Landroidx/appcompat/widget/Toolbar;

    .line 128
    .line 129
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->findViewById(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Landroid/view/ViewGroup;

    .line 134
    .line 135
    invoke-direct {p0, v2, v3}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->o0(Landroid/view/ViewGroup;Landroid/view/View;)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_98

    .line 140
    .line 141
    const/16 v0, 0x14

    .line 142
    .line 143
    if-ne p1, v0, :cond_aa

    .line 144
    .line 145
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->n()V

    .line 150
    .line 151
    .line 152
    return v1

    .line 153
    :cond_98
    invoke-direct {p0, v0, v3}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->o0(Landroid/view/ViewGroup;Landroid/view/View;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_af

    .line 158
    .line 159
    const/16 v0, 0x13

    .line 160
    .line 161
    if-ne p1, v0, :cond_aa

    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->n()V

    .line 168
    .line 169
    .line 170
    return v1

    .line 171
    :cond_aa
    :goto_aa
    invoke-super {p0, p1, p2}, Lax/n/c;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    return p1

    .line 176
    :cond_af
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->m0(I)V

    .line 177
    .line 178
    .line 179
    return v1

    .line 180
    :cond_b3
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->m0(I)V

    .line 181
    .line 182
    .line 183
    return v1

    .line 184
    :cond_b7
    const p1, 0x7f0a02ca

    .line 185
    .line 186
    .line 187
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->w0(I)Z

    .line 188
    .line 189
    .line 190
    return v1

    .line 191
    :cond_be
    :goto_be
    invoke-super {p0, p1, p2}, Lax/n/c;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    return p1

    .line 196
    nop

    .line 197
    :pswitch_data_c4
    .packed-switch 0x13
        :pswitch_66
        :pswitch_66
        :pswitch_36
        :pswitch_36
    .end packed-switch
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
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
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/android/ex/photo/f;->l0(Landroid/view/MenuItem;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_18

    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_f

    .line 14
    .line 15
    goto :goto_18

    .line 16
    :cond_f
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->w0(I)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_18
    :goto_18
    const/4 p1, 0x1

    .line 26
    return p1
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

.method protected onPause()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->m0()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/voxdon/xplorer/activity/a;->onPause()V

    .line 7
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
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/android/ex/photo/f;->n0(Landroid/view/Menu;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_10

    .line 10
    .line 11
    :cond_a
    invoke-super {p0, p1}, Landroid/app/Activity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_12

    .line 16
    .line 17
    :cond_10
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
.end method

.method protected onResume()V
    .registers 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/f;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->o0()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->e0()V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 3

    .line 1
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/activity/a;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/android/ex/photo/f;->p0(Landroid/os/Bundle;)V

    .line 7
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

.method protected onStart()V
    .registers 3

    .line 1
    invoke-super {p0}, Lcom/voxdon/xplorer/activity/a;->onStart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->q0()V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lax/X2/Q;->N1()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1e

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/high16 v1, -0x45000000    # -0.001953125f

    .line 20
    .line 21
    invoke-static {v0, v1}, Lax/X2/v;->s(Landroid/view/Window;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, v1}, Lax/X2/v;->r(Landroid/view/Window;I)V

    .line 29
    .line 30
    .line 31
    :cond_1e
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method protected onStop()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->r0()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/x3/E;->p()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, Lax/n/c;->onStop()V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public p()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j:Lcom/android/ex/photo/f;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_12

    .line 6
    :cond_5
    iget-boolean v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->B:Z

    .line 7
    .line 8
    if-nez v1, :cond_12

    .line 9
    .line 10
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->F:Lax/i/r;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->b0()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {v1, v0}, Lax/i/r;->j(Z)V

    .line 17
    .line 18
    .line 19
    :cond_12
    :goto_12
    return-void
    .line 20
    .line 21
.end method

.method public q(Z)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4e

    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 8
    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_4e

    .line 12
    :cond_b
    if-eqz p1, :cond_1c

    .line 13
    .line 14
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lax/n/a;->n()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 22
    .line 23
    const/16 v0, 0x8

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lax/x3/d;->y(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_4a

    .line 29
    :cond_1c
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lax/n/a;->J()V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p1, v0}, Lax/x3/d;->y(I)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 43
    .line 44
    invoke-virtual {p1}, Lax/x3/d;->A()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_45

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->B()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_45

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1, v0}, Lcom/android/ex/photo/f;->c(Z)V

    .line 68
    .line 69
    .line 70
    :cond_45
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 71
    .line 72
    invoke-virtual {p1}, Lax/x3/E;->p()V

    .line 73
    .line 74
    .line 75
    :goto_4a
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->x0()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_4e
    :goto_4e
    invoke-static {}, Lax/u3/b;->f()V

    .line 80
    .line 81
    .line 82
    return-void
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

.method public r()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->l:Lax/x3/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x3/E;->v()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public s()Lax/n/c;
    .registers 1

    .line 1
    return-object p0
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
.end method

.method public x0()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/android/ex/photo/f;->B()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_18

    .line 18
    .line 19
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->u:Z

    .line 20
    .line 21
    if-eqz v0, :cond_18

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    goto :goto_19

    .line 25
    :cond_18
    const/4 v0, 0x0

    .line 26
    :goto_19
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->w:Landroid/view/View;

    .line 27
    .line 28
    if-eqz v0, :cond_1e

    .line 29
    .line 30
    goto :goto_20

    .line 31
    :cond_1e
    const/16 v1, 0x8

    .line 32
    .line 33
    :goto_20
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public y0()V
    .registers 1

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->z0()V

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

.method z0()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "dialog"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->k0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1a

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->o()Landroidx/fragment/app/t;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, v0}, Landroidx/fragment/app/t;->q(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Landroidx/fragment/app/t;->j()I

    .line 25
    .line 26
    .line 27
    :cond_1a
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
