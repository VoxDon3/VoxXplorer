.class Lax/V2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/V2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/voxdon/xplorer/bookmark/Bookmark;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
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


# virtual methods
.method public a(Lcom/voxdon/xplorer/bookmark/Bookmark;Lcom/voxdon/xplorer/bookmark/Bookmark;)I
    .registers 11

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 v2, -0x1

    .line 6
    const-wide/16 v3, -0x5

    .line 7
    .line 8
    cmp-long v5, v0, v3

    .line 9
    .line 10
    if-nez v5, :cond_14

    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    cmp-long v5, v0, v3

    .line 17
    .line 18
    if-eqz v5, :cond_14

    .line 19
    .line 20
    return v2

    .line 21
    :cond_14
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    const/4 v5, 0x0

    .line 26
    cmp-long v6, v0, v3

    .line 27
    .line 28
    if-nez v6, :cond_26

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    cmp-long v6, v0, v3

    .line 35
    .line 36
    if-nez v6, :cond_26

    .line 37
    .line 38
    return v5

    .line 39
    :cond_26
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    const/4 v6, 0x1

    .line 44
    cmp-long v7, v0, v3

    .line 45
    .line 46
    if-eqz v7, :cond_38

    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    cmp-long v7, v0, v3

    .line 53
    .line 54
    if-nez v7, :cond_38

    .line 55
    .line 56
    return v6

    .line 57
    :cond_38
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    invoke-virtual {p2}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    cmp-long v7, v0, v3

    .line 66
    .line 67
    if-lez v7, :cond_45

    .line 68
    .line 69
    return v2

    .line 70
    :cond_45
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    invoke-virtual {p2}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 75
    .line 76
    .line 77
    move-result-wide p1

    .line 78
    cmp-long v2, v0, p1

    .line 79
    .line 80
    if-gez v2, :cond_52

    .line 81
    .line 82
    return v6

    .line 83
    :cond_52
    return v5
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

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 2
    .line 3
    check-cast p2, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lax/V2/d$a;->a(Lcom/voxdon/xplorer/bookmark/Bookmark;Lcom/voxdon/xplorer/bookmark/Bookmark;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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
