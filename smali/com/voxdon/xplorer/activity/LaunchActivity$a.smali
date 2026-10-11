.class Lcom/voxdon/xplorer/activity/LaunchActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/c3/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/activity/LaunchActivity;->I(Landroid/content/res/AssetFileDescriptor;Lax/c3/W;Ljava/lang/String;Lax/c3/z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/c3/z;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/voxdon/xplorer/activity/LaunchActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/activity/LaunchActivity;Lax/c3/z;Ljava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->a:Lax/c3/z;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/activity/LaunchActivity;->F(Lcom/voxdon/xplorer/activity/LaunchActivity;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    if-eqz p1, :cond_10

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    :cond_10
    instance-of p1, p1, Ljava/io/FileNotFoundException;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    if-eqz p1, :cond_22

    .line 21
    .line 22
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 23
    .line 24
    const v1, 0x7f1303a4

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 32
    .line 33
    .line 34
    goto :goto_2e

    .line 35
    :cond_22
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 36
    .line 37
    const v1, 0x7f13013e

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 45
    .line 46
    .line 47
    :goto_2e
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 50
    .line 51
    .line 52
    return-void
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

.method public b(Ljava/io/File;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/activity/LaunchActivity;->F(Lcom/voxdon/xplorer/activity/LaunchActivity;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    :try_start_b
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->a:Lax/c3/z;

    .line 17
    .line 18
    sget-object v1, Lax/c3/z;->f0:Lax/c3/z;

    .line 19
    .line 20
    if-ne v0, v1, :cond_32

    .line 21
    .line 22
    invoke-static {p1}, Lcom/voxdon/xplorer/file/y;->I0(Ljava/lang/String;)Lcom/voxdon/xplorer/file/y;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-static {v1, v0, v2}, Lax/c3/w;->d(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Z)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "extra_temp_file_path"

    .line 34
    .line 35
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    const-string p1, "extra_temp_file_type"

    .line 39
    .line 40
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 48
    .line 49
    .line 50
    goto :goto_5f

    .line 51
    :cond_32
    sget-object v1, Lax/c3/z;->c0:Lax/c3/z;

    .line 52
    .line 53
    if-ne v0, v1, :cond_3e

    .line 54
    .line 55
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 56
    .line 57
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->b:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v0, p1, v1}, Lax/c3/u;->f0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_5f

    .line 63
    :cond_3e
    sget-object v1, Lax/c3/z;->i0:Lax/c3/z;

    .line 64
    .line 65
    if-ne v0, v1, :cond_4e

    .line 66
    .line 67
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 68
    .line 69
    invoke-static {v0, p1}, Lax/c3/w;->h(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 76
    .line 77
    .line 78
    goto :goto_5f

    .line 79
    :cond_4e
    invoke-static {}, Lax/u3/b;->f()V
    :try_end_51
    .catch Lax/b3/j; {:try_start_b .. :try_end_51} :catch_52

    .line 80
    .line 81
    .line 82
    goto :goto_5f

    .line 83
    :catch_52
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 84
    .line 85
    const v0, 0x7f13013e

    .line 86
    .line 87
    .line 88
    const/4 v1, 0x1

    .line 89
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 94
    .line 95
    .line 96
    :goto_5f
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/LaunchActivity$a;->c:Lcom/voxdon/xplorer/activity/LaunchActivity;

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 99
    .line 100
    .line 101
    return-void
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
