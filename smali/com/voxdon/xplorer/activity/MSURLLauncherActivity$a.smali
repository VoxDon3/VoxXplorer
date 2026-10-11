.class Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/activity/MSURLLauncherActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private h:Landroid/content/Context;

.field private i:Landroid/net/Uri;

.field private j:Ljava/lang/String;

.field final synthetic k:Lcom/voxdon/xplorer/activity/MSURLLauncherActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/activity/MSURLLauncherActivity;Landroid/content/Context;Landroid/net/Uri;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->k:Lcom/voxdon/xplorer/activity/MSURLLauncherActivity;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->h:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->i:Landroid/net/Uri;

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
.end method

.method private y(Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    new-instance v1, Ljava/util/Scanner;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Ljava/util/Scanner;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_9
    :goto_9
    invoke-virtual {v1}, Ljava/util/Scanner;->hasNextLine()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_2d

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/Scanner;->nextLine()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_9

    .line 21
    .line 22
    const-string v2, "InternetShortcut"

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1e

    .line 29
    .line 30
    goto :goto_9

    .line 31
    :cond_1e
    const-string v2, "URL="

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_9

    .line 38
    .line 39
    const/4 v0, 0x4

    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    move-object v0, p1

    .line 45
    goto :goto_9

    .line 46
    :cond_2d
    invoke-virtual {v1}, Ljava/util/Scanner;->close()V

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
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->w([Ljava/lang/String;)Ljava/lang/String;

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
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->x(Ljava/lang/String;)V

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
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->k:Lcom/voxdon/xplorer/activity/MSURLLauncherActivity;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity;->a:Landroid/view/View;

    .line 4
    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    :cond_a
    return-void
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

.method protected varargs w([Ljava/lang/String;)Ljava/lang/String;
    .registers 6

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->i:Landroid/net/Uri;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_47

    .line 5
    .line 6
    :try_start_5
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->h:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->i:Landroid/net/Uri;

    .line 17
    .line 18
    const-string v2, "r"

    .line 19
    .line 20
    invoke-virtual {p1, v1, v2}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance v1, Landroid/content/res/AssetFileDescriptor$AutoCloseInputStream;

    .line 25
    .line 26
    invoke-direct {v1, p1}, Landroid/content/res/AssetFileDescriptor$AutoCloseInputStream;-><init>(Landroid/content/res/AssetFileDescriptor;)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_1c} :catch_2f
    .catchall {:try_start_5 .. :try_end_1c} :catchall_2d

    .line 27
    .line 28
    .line 29
    const/16 p1, 0x100

    .line 30
    .line 31
    const-wide/16 v2, 0x2800

    .line 32
    .line 33
    :try_start_20
    invoke-static {v1, p1, v2, v3}, Lax/c3/F;->j(Ljava/io/InputStream;IJ)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_24} :catch_2b
    .catchall {:try_start_20 .. :try_end_24} :catchall_28

    .line 37
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 38
    .line 39
    .line 40
    goto :goto_48

    .line 41
    :catchall_28
    move-exception p1

    .line 42
    move-object v0, v1

    .line 43
    goto :goto_43

    .line 44
    :catch_2b
    move-exception p1

    .line 45
    goto :goto_31

    .line 46
    :catchall_2d
    move-exception p1

    .line 47
    goto :goto_43

    .line 48
    :catch_2f
    move-exception p1

    .line 49
    move-object v1, v0

    .line 50
    :goto_31
    :try_start_31
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->h:Landroid/content/Context;

    .line 51
    .line 52
    invoke-static {v2}, Lax/t3/j;->o(Landroid/content/Context;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_3f

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->j:Ljava/lang/String;
    :try_end_3f
    .catchall {:try_start_31 .. :try_end_3f} :catchall_28

    .line 63
    .line 64
    :cond_3f
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :goto_43
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_47
    move-object p1, v0

    .line 73
    :goto_48
    if-eqz p1, :cond_4f

    .line 74
    .line 75
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_4f
    return-object v0
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

.method protected x(Ljava/lang/String;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->k:Lcom/voxdon/xplorer/activity/MSURLLauncherActivity;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity;->a:Landroid/view/View;

    .line 4
    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    :cond_b
    const/4 v0, 0x1

    .line 13
    if-nez p1, :cond_45

    .line 14
    .line 15
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->j:Ljava/lang/String;

    .line 16
    .line 17
    const v1, 0x7f13013e

    .line 18
    .line 19
    .line 20
    if-eqz p1, :cond_3b

    .line 21
    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->h:Landroid/content/Context;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ":"

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->j:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->h:Landroid/content/Context;

    .line 51
    .line 52
    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 57
    .line 58
    .line 59
    goto :goto_61

    .line 60
    :cond_3b
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->h:Landroid/content/Context;

    .line 61
    .line 62
    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 67
    .line 68
    .line 69
    goto :goto_61

    .line 70
    :cond_45
    :try_start_45
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const/4 v1, 0x0

    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-static {p1, v1, v0, v2}, Lax/c3/u;->n(Landroid/net/Uri;Ljava/lang/String;ZZ)Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->k:Lcom/voxdon/xplorer/activity/MSURLLauncherActivity;

    .line 81
    .line 82
    invoke-static {v1, p1}, Lax/c3/u;->o0(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_54
    .catch Ljava/lang/Exception; {:try_start_45 .. :try_end_54} :catch_55

    .line 83
    .line 84
    .line 85
    goto :goto_61

    .line 86
    :catch_55
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->h:Landroid/content/Context;

    .line 87
    .line 88
    const v1, 0x7f130137

    .line 89
    .line 90
    .line 91
    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 96
    .line 97
    .line 98
    :goto_61
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MSURLLauncherActivity$a;->k:Lcom/voxdon/xplorer/activity/MSURLLauncherActivity;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 101
    .line 102
    .line 103
    return-void
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
