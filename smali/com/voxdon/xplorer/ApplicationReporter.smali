.class public Lcom/voxdon/xplorer/ApplicationReporter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/socialnmobile/commons/reporter/ReporterService;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field static final EVENT_COLLECTOR_URL:Ljava/lang/String; = ""

.field static sAppContext:Landroid/content/Context;

.field static sReporter:Lax/Ha/c;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

.method private getParentPackage(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 1
    const-string v0, "."

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gez v0, :cond_9

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_9
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static init(Landroid/content/Context;)V
    .registers 2

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/ApplicationReporter;->sReporter:Lax/Ha/c;

    .line 2
    .line 3
    if-nez v0, :cond_21

    .line 4
    .line 5
    new-instance v0, Lcom/voxdon/xplorer/ApplicationReporter;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/voxdon/xplorer/ApplicationReporter;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/voxdon/xplorer/ApplicationReporter;->initializeService()V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lax/Q2/c;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_21

    .line 18
    .line 19
    invoke-static {}, Lax/Ha/c;->g()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_19

    .line 24
    .line 25
    goto :goto_21

    .line 26
    :cond_19
    new-instance p0, Ljava/lang/RuntimeException;

    .line 27
    .line 28
    const-string v0, "SERVICE LOADER DOES NOT WORK!!!"

    .line 29
    .line 30
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :cond_21
    :goto_21
    sget-object v0, Lcom/voxdon/xplorer/ApplicationReporter;->sAppContext:Landroid/content/Context;

    .line 35
    .line 36
    if-nez v0, :cond_34

    .line 37
    .line 38
    if-eqz p0, :cond_34

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    sput-object p0, Lcom/voxdon/xplorer/ApplicationReporter;->sAppContext:Landroid/content/Context;

    .line 45
    .line 46
    invoke-static {p0}, Lax/t3/j;->n(Landroid/content/Context;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0}, Lax/Ha/c;->k(Z)V

    .line 51
    .line 52
    .line 53
    :cond_34
    sget-object p0, Lcom/voxdon/xplorer/ApplicationReporter;->sReporter:Lax/Ha/c;

    .line 54
    .line 55
    if-eqz p0, :cond_3f

    .line 56
    .line 57
    sget-object v0, Lcom/voxdon/xplorer/ApplicationReporter;->sAppContext:Landroid/content/Context;

    .line 58
    .line 59
    if-eqz v0, :cond_3f

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lax/Ha/c;->j(Landroid/content/Context;)V

    .line 62
    .line 63
    .line 64
    :cond_3f
    const/4 p0, 0x0

    .line 65
    invoke-static {p0}, Lax/Ha/c;->k(Z)V

    .line 66
    .line 67
    .line 68
    return-void
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
.end method


# virtual methods
.method public initializeService()V
    .registers 9

    .line 1
    invoke-static {}, Lax/t3/g;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "2.7.8"

    .line 6
    .line 7
    if-eqz v0, :cond_14

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const-wide/16 v4, 0x0

    .line 14
    .line 15
    cmp-long v0, v2, v4

    .line 16
    .line 17
    if-lez v0, :cond_14

    .line 18
    .line 19
    const-string v1, "2.7.8-mod"

    .line 20
    .line 21
    :cond_14
    move-object v4, v1

    .line 22
    const-string v5, "cxfileApi21-release"

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    const-string v2, "cxfileexplorer"

    .line 26
    .line 27
    const/16 v3, 0x116

    .line 28
    .line 29
    const-string v6, ""

    .line 30
    .line 31
    invoke-static/range {v2 .. v7}, Lax/Ha/c;->f(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lax/Ha/c;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/voxdon/xplorer/ApplicationReporter;->sReporter:Lax/Ha/c;

    .line 36
    .line 37
    const-string v1, "96SB"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lax/Ha/c;->l(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
