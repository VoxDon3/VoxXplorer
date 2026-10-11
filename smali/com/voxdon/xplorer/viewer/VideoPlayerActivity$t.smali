.class Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$t;
.super Lax/l1/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "t"
.end annotation


# instance fields
.field m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/l1/D$b;Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-static {p1}, Lax/l1/n$e;->R(Landroid/content/Context;)Lax/l1/n$e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1, p2}, Lax/l1/n;-><init>(Lax/P0/T;Lax/l1/D$b;)V

    .line 6
    .line 7
    .line 8
    iput-object p3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$t;->m:Ljava/lang/String;

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

.method public static g0(Lax/P0/v;Ljava/lang/String;)Z
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lax/l1/n;->I(Lax/P0/v;Ljava/lang/String;Z)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    if-lez p0, :cond_9

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_9
    return v0
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


# virtual methods
.method protected c0(Lax/l1/G$a;[[[ILax/l1/n$e;Ljava/lang/String;)Landroid/util/Pair;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/l1/G$a;",
            "[[[I",
            "Lax/l1/n$e;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Lax/l1/D$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lax/l1/n;->c0(Lax/l1/G$a;[[[ILax/l1/n$e;Ljava/lang/String;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->R()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 p3, 0x0

    .line 10
    if-nez p2, :cond_37

    .line 11
    .line 12
    if-eqz p1, :cond_3e

    .line 13
    .line 14
    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p2, Lax/l1/D$a;

    .line 17
    .line 18
    iget-object p2, p2, Lax/l1/D$a;->a:Lax/P0/P;

    .line 19
    .line 20
    iget-object p4, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$t;->m:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    const/4 v0, 0x0

    .line 27
    if-nez p4, :cond_34

    .line 28
    .line 29
    if-eqz p2, :cond_34

    .line 30
    .line 31
    const/4 p4, 0x0

    .line 32
    :goto_1f
    iget v1, p2, Lax/P0/P;->a:I

    .line 33
    .line 34
    if-ge v0, v1, :cond_33

    .line 35
    .line 36
    invoke-virtual {p2, v0}, Lax/P0/P;->b(I)Lax/P0/v;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$t;->m:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, v2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$t;->g0(Lax/P0/v;Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_30

    .line 47
    .line 48
    const/4 p4, 0x1

    .line 49
    :cond_30
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_1f

    .line 52
    :cond_33
    move v0, p4

    .line 53
    :cond_34
    if-nez v0, :cond_3e

    .line 54
    .line 55
    return-object p3

    .line 56
    :cond_37
    invoke-static {}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_3e

    .line 61
    .line 62
    return-object p3

    .line 63
    :cond_3e
    return-object p1
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
