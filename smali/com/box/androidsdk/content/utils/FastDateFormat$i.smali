.class Lcom/box/androidsdk/content/utils/FastDateFormat$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/box/androidsdk/content/utils/FastDateFormat$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/box/androidsdk/content/utils/FastDateFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "i"
.end annotation


# static fields
.field static final b:Lcom/box/androidsdk/content/utils/FastDateFormat$i;

.field static final c:Lcom/box/androidsdk/content/utils/FastDateFormat$i;


# instance fields
.field final a:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lcom/box/androidsdk/content/utils/FastDateFormat$i;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lcom/box/androidsdk/content/utils/FastDateFormat$i;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/box/androidsdk/content/utils/FastDateFormat$i;->b:Lcom/box/androidsdk/content/utils/FastDateFormat$i;

    .line 8
    .line 9
    new-instance v0, Lcom/box/androidsdk/content/utils/FastDateFormat$i;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lcom/box/androidsdk/content/utils/FastDateFormat$i;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/box/androidsdk/content/utils/FastDateFormat$i;->c:Lcom/box/androidsdk/content/utils/FastDateFormat$i;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method constructor <init>(Z)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/box/androidsdk/content/utils/FastDateFormat$i;->a:Z

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


# virtual methods
.method public a()I
    .registers 2

    .line 1
    const/4 v0, 0x5

    return v0
.end method

.method public b(Ljava/lang/StringBuffer;Ljava/util/Calendar;)V
    .registers 5

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    invoke-virtual {p2, v1}, Ljava/util/Calendar;->get(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    add-int/2addr v0, p2

    .line 14
    if-gez v0, :cond_16

    .line 15
    .line 16
    const/16 p2, 0x2d

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 19
    .line 20
    .line 21
    neg-int v0, v0

    .line 22
    goto :goto_1b

    .line 23
    :cond_16
    const/16 p2, 0x2b

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 26
    .line 27
    .line 28
    :goto_1b
    const p2, 0x36ee80

    .line 29
    .line 30
    .line 31
    div-int p2, v0, p2

    .line 32
    .line 33
    div-int/lit8 v1, p2, 0xa

    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x30

    .line 36
    .line 37
    int-to-char v1, v1

    .line 38
    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 39
    .line 40
    .line 41
    rem-int/lit8 v1, p2, 0xa

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x30

    .line 44
    .line 45
    int-to-char v1, v1

    .line 46
    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 47
    .line 48
    .line 49
    iget-boolean v1, p0, Lcom/box/androidsdk/content/utils/FastDateFormat$i;->a:Z

    .line 50
    .line 51
    if-eqz v1, :cond_39

    .line 52
    .line 53
    const/16 v1, 0x3a

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 56
    .line 57
    .line 58
    :cond_39
    const v1, 0xea60

    .line 59
    .line 60
    .line 61
    div-int/2addr v0, v1

    .line 62
    mul-int/lit8 p2, p2, 0x3c

    .line 63
    .line 64
    sub-int/2addr v0, p2

    .line 65
    div-int/lit8 p2, v0, 0xa

    .line 66
    .line 67
    add-int/lit8 p2, p2, 0x30

    .line 68
    .line 69
    int-to-char p2, p2

    .line 70
    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 71
    .line 72
    .line 73
    rem-int/lit8 v0, v0, 0xa

    .line 74
    .line 75
    add-int/lit8 v0, v0, 0x30

    .line 76
    .line 77
    int-to-char p2, v0

    .line 78
    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 79
    .line 80
    .line 81
    return-void
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
