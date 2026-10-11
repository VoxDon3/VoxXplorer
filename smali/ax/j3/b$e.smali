.class Lax/j3/b$e;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/j3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lax/j3/b;


# direct methods
.method private constructor <init>(Lax/j3/b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/j3/b$e;->a:Lax/j3/b;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/j3/b;Lax/j3/b$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lax/j3/b$e;-><init>(Lax/j3/b;)V

    return-void
.end method


# virtual methods
.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .registers 5

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lax/j3/b;->u()Ljava/util/logging/Logger;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "Receive Title: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    if-nez p2, :cond_1e

    .line 29
    .line 30
    goto :goto_57

    .line 31
    :cond_1e
    const-string p1, "code="

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_41

    .line 38
    .line 39
    const-string p1, "="

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lax/j3/b$e;->a:Lax/j3/b;

    .line 45
    .line 46
    invoke-static {p1}, Lax/j3/b;->v(Lax/j3/b;)Landroid/webkit/WebView;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string p2, "text/html"

    .line 51
    .line 52
    const-string v0, "utf-8"

    .line 53
    .line 54
    const-string v1, ""

    .line 55
    .line 56
    invoke-virtual {p1, v1, p2, v0}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lax/j3/b$e;->a:Lax/j3/b;

    .line 60
    .line 61
    const/4 p2, 0x1

    .line 62
    invoke-static {p1, p2}, Lax/j3/b;->x(Lax/j3/b;Z)Z

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_41
    const-string p1, "error="

    .line 67
    .line 68
    invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_57

    .line 73
    .line 74
    iget-object p1, p0, Lax/j3/b$e;->a:Lax/j3/b;

    .line 75
    .line 76
    invoke-static {p1}, Lax/j3/b;->y(Lax/j3/b;)Lax/j3/b$d;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {p1}, Lax/j3/b$d;->a()V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lax/j3/b$e;->a:Lax/j3/b;

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 86
    .line 87
    .line 88
    :cond_57
    :goto_57
    return-void
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
