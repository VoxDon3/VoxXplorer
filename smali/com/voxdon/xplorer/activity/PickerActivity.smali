.class public Lcom/voxdon/xplorer/activity/PickerActivity;
.super Lax/n/c;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/n/c;-><init>()V

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

.method private F(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/Intent;
    .registers 5

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "com.discord"

    .line 7
    .line 8
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_2a

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string v1, "android.intent.action.PICK"

    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_2a

    .line 25
    .line 26
    const-string p2, "image/*"

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_2a

    .line 37
    .line 38
    const-string p1, "*/*"

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    :cond_2a
    return-object v0
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


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .registers 9

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getCallingPackage()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    const v3, 0x7f130137

    .line 18
    .line 19
    .line 20
    :try_start_13
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/activity/PickerActivity;->F(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-string v5, "android.intent.action.GET_CONTENT"

    .line 25
    .line 26
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v5
    :try_end_1d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_13 .. :try_end_1d} :catch_6e

    .line 30
    const-string v6, "picker security"

    .line 31
    .line 32
    if-eqz v5, :cond_31

    .line 33
    .line 34
    :try_start_21
    invoke-static {p0, v4, v0}, Lax/c3/u;->b0(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V
    :try_end_24
    .catch Ljava/lang/SecurityException; {:try_start_21 .. :try_end_24} :catch_25
    .catch Ljava/lang/IllegalArgumentException; {:try_start_21 .. :try_end_24} :catch_6e

    .line 35
    .line 36
    .line 37
    goto :goto_75

    .line 38
    :catch_25
    move-exception p1

    .line 39
    :try_start_26
    invoke-static {v6, p1}, Lax/Q2/d;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 47
    .line 48
    .line 49
    goto :goto_75

    .line 50
    :cond_31
    const-string v5, "android.intent.action.OPEN_DOCUMENT"

    .line 51
    .line 52
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_3d

    .line 57
    .line 58
    invoke-static {p0, v4, v0}, Lax/c3/u;->b0(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_75

    .line 62
    :cond_3d
    const-string v5, "android.intent.action.PICK"

    .line 63
    .line 64
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_49

    .line 69
    .line 70
    invoke-static {p0, v4, v0}, Lax/c3/u;->b0(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_75

    .line 74
    :cond_49
    const-string v5, "android.intent.action.RINGTONE_PICKER"

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_56

    .line 85
    .line 86
    goto :goto_75

    .line 87
    :cond_56
    const-string p1, "android.intent.action.CREATE_SHORTCUT"

    .line 88
    .line 89
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1
    :try_end_5c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_26 .. :try_end_5c} :catch_6e

    .line 93
    if-eqz p1, :cond_75

    .line 94
    .line 95
    :try_start_5e
    invoke-static {p0, v4, v0}, Lax/c3/u;->b0(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V
    :try_end_61
    .catch Ljava/lang/SecurityException; {:try_start_5e .. :try_end_61} :catch_62
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5e .. :try_end_61} :catch_6e

    .line 96
    .line 97
    .line 98
    goto :goto_75

    .line 99
    :catch_62
    move-exception p1

    .line 100
    :try_start_63
    invoke-static {v6, p1}, Lax/Q2/d;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_6d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_63 .. :try_end_6d} :catch_6e

    .line 108
    .line 109
    .line 110
    goto :goto_75

    .line 111
    :catch_6e
    invoke-static {p0, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 116
    .line 117
    .line 118
    :cond_75
    :goto_75
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 119
    .line 120
    .line 121
    return-void
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
