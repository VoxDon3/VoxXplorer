.class Lax/X2/H$a;
.super Landroid/os/storage/StorageManager$StorageVolumeCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/X2/H;->a(Landroid/content/Context;Landroid/os/storage/StorageManager;Lax/X2/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Landroid/os/storage/StorageManager;

.field final synthetic c:Lax/X2/p;


# direct methods
.method constructor <init>(Landroid/os/storage/StorageManager;Lax/X2/p;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/X2/H$a;->b:Landroid/os/storage/StorageManager;

    .line 2
    .line 3
    iput-object p2, p0, Lax/X2/H$a;->c:Lax/X2/p;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/os/storage/StorageManager$StorageVolumeCallback;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lax/X2/H$a;->a:Ljava/util/Map;

    .line 14
    .line 15
    return-void
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
.method public onStateChanged(Landroid/os/storage/StorageVolume;)V
    .registers 8

    .line 1
    invoke-super {p0, p1}, Landroid/os/storage/StorageManager$StorageVolumeCallback;->onStateChanged(Landroid/os/storage/StorageVolume;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lax/X2/o;->d(Landroid/os/storage/StorageVolume;)Lax/X2/N;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lax/X2/H$a;->b:Landroid/os/storage/StorageManager;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lax/X2/w;->i(Landroid/os/storage/StorageManager;Lax/X2/N;)Lax/X2/O;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_15

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/X2/O;->l()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    goto :goto_16

    .line 22
    :cond_15
    const/4 v2, 0x0

    .line 23
    :goto_16
    invoke-static {p1}, Lax/X2/k;->a(Landroid/os/storage/StorageVolume;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v3, :cond_21

    .line 28
    .line 29
    invoke-static {p1}, Lax/X2/k;->a(Landroid/os/storage/StorageVolume;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    goto :goto_37

    .line 34
    :cond_21
    invoke-static {p1}, Lax/X2/n;->a(Landroid/os/storage/StorageVolume;)Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-eqz v3, :cond_30

    .line 39
    .line 40
    invoke-static {p1}, Lax/X2/n;->a(Landroid/os/storage/StorageVolume;)Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    goto :goto_37

    .line 49
    :cond_30
    const-string v3, "no uuid and no path"

    .line 50
    .line 51
    invoke-static {v3}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v3, ""

    .line 55
    .line 56
    :goto_37
    iget-object v4, p0, Lax/X2/H$a;->a:Ljava/util/Map;

    .line 57
    .line 58
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Ljava/lang/Integer;

    .line 63
    .line 64
    if-nez v4, :cond_42

    .line 65
    .line 66
    goto :goto_46

    .line 67
    :cond_42
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    :goto_46
    invoke-static {p1}, Lax/X2/j;->a(Landroid/os/storage/StorageVolume;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, Lax/X2/O;->b(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iget-object v4, p0, Lax/X2/H$a;->a:Ljava/util/Map;

    .line 80
    .line 81
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    iget-object v3, p0, Lax/X2/H$a;->c:Lax/X2/p;

    .line 89
    .line 90
    invoke-virtual {v3, v0, v1, p1, v2}, Lax/X2/p;->a(Lax/X2/O;IIZ)V

    .line 91
    .line 92
    .line 93
    return-void
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
