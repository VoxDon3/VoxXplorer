.class Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->K0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$b;->b:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$b;->a:Z

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


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .registers 7

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$b;->b:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Q(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/widget/TextView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    div-int/lit16 p2, p2, 0x3e8

    .line 8
    .line 9
    int-to-long v1, p2

    .line 10
    invoke-static {v1, v2}, Landroid/text/format/DateUtils;->formatElapsedTime(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    if-eqz p3, :cond_21

    .line 18
    .line 19
    iget-boolean p2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$b;->a:Z

    .line 20
    .line 21
    if-nez p2, :cond_21

    .line 22
    .line 23
    iget-object p2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$b;->b:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    int-to-long v0, p1

    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-static {p2, v0, v1, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;JZ)V

    .line 32
    .line 33
    .line 34
    :cond_21
    return-void
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

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .registers 2

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$b;->a:Z

    .line 3
    .line 4
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$b;->b:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->S(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

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

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$b;->a:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$b;->b:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    int-to-long v2, p1

    .line 11
    invoke-static {v1, v2, v3, v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;JZ)V

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
    .line 22
.end method
